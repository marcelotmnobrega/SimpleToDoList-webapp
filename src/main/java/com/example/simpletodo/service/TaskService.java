package com.example.simpletodo.service;

import com.example.simpletodo.model.Task;
import com.example.simpletodo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task create(Task task) {
        return repository.save(task);
    }

    public Optional<Task> getById(Long id) {
        return repository.findById(id);
    }

    public List<Task> listAll() {
        return repository.findAll();
    }

    public Task update(Task task) {
        return repository.save(task);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
