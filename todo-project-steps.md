# To‑Do List (Spring Boot) — Initial Steps & Prompts

## Project goal (one line)
Build a simple to‑do app with create/read/update/delete tasks, status, due date, and basic persistence.

## Prerequisites
- JDK 21 installed
- Git
- Maven (or use the included Maven wrapper)
- Optional: IDE (VS Code / IntelliJ)

## Quick setup
- Use Spring Initializr (https://start.spring.io) with:
  - Project: Maven, Java
  - Spring Boot: latest stable
  - Dependencies: Spring Web, Spring Data JPA, H2 Database, Spring Boot DevTools, Validation, (optional: Spring Security, Thymeleaf or Spring REST + React)
- Or generate and unzip into the workspace directory.

## High-level steps (prompts to act on)
1. Initialize repo and run
   - Prompt: "git init && git add . && git commit -m 'init'; run the app with mvnw.cmd spring-boot:run"
2. Design domain model
   - Prompt: "What fields does a Task need? (id, title, description, dueDate, priority, status, createdAt, updatedAt)"
3. Create JPA entity & repository
   - Prompt: "Create Task entity and TaskRepository (extends JpaRepository<Task,Long>)"
4. Add service layer
   - Prompt: "Implement TaskService with methods: create, getById, list (with filters), update, delete, markComplete"
5. Build controllers / API
   - Prompt: "Expose REST endpoints: POST /tasks, GET /tasks, GET /tasks/{id}, PUT /tasks/{id}, DELETE /tasks/{id}"
6. Validation & DTOs
   - Prompt: "Add request DTOs and @Valid annotations for required fields and lengths"
7. Persistence & config
   - Prompt: "Use H2 for dev (spring.datasource settings), enable console, add simple schema/data if desired"
8. Frontend options
   - Prompt A (server side): "Create Thymeleaf templates for list, create/edit forms"
   - Prompt B (separate SPA): "Expose JSON API and scaffold a minimal React/Vue frontend that hits the API"
9. Tests
   - Prompt: "Write unit tests for service and integration tests for controllers (use @SpringBootTest or @WebMvcTest)"
10. Run, debug, and iterate
    - Prompt: "Start app, exercise CRUD flows, fix validation and errors"
11. Extras / polish (pick later)
    - Prompt: "Add user auth (Spring Security), filter/sort/pagination, due-date reminders, simple UI styling, export/import CSV, Dockerfile"
12. Deployment
    - Prompt: "Create Dockerfile, test container locally, push image or deploy to Heroku/GCP/AWS"

## Minimal commands (Windows)
- Run with wrapper: mvnw.cmd spring-boot:run
- Build: mvnw.cmd clean package
- Run jar: java -jar target\your-app.jar

## Next action suggestion
- Choose frontend approach (Thymeleaf vs REST+SPA) and scaffold the Task entity + repository. Start with one endpoint: POST /tasks and test via curl/Postman.
