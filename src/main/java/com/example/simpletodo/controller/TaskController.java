package com.example.simpletodo.controller;

import com.example.simpletodo.model.Task;
import com.example.simpletodo.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Task> create(@Validated @RequestBody Task task) {
        Task created = service.create(task);
        return ResponseEntity.created(URI.create("/api/tasks/" + created.getId())).body(created);
    }

    @GetMapping
    public List<Task> list() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> get(@PathVariable Long id) {
        return service.getById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@PathVariable Long id, @Validated @RequestBody Task input) {
        return service.getById(id)
                .map(existing -> {
                    existing.setTitle(input.getTitle());
                    existing.setDescription(input.getDescription());
                    existing.setDueDate(input.getDueDate());
                    existing.setCompleted(input.isCompleted());
                    Task saved = service.update(existing);
                    return ResponseEntity.ok(saved);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
