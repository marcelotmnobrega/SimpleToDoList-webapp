# SimpleToDoList webapp

A minimal Spring Boot to-do list web application. This repository will contain a simple CRUD backend (Spring Boot + Spring Data JPA + H2) and a minimal UI (Thymeleaf or a separate SPA).

## Purpose
Capture tasks with title, description, due date, priority and status. Great starter project to learn Spring Boot, JPA, validation, and basic frontend.

## What this repo contains (initial)
- Project metadata and instructions to bootstrap the Spring Boot app
- .gitignore and an MIT license

## Prerequisites
- JDK 21
- Git
- Maven (or use the included Maven wrapper)
- Optional: GitHub CLI (`gh`) for repository creation

## Quick start (generate project)
Option A — use Spring Initializr in your browser:
1. Open https://start.spring.io
2. Project: Maven, Language: Java
3. Group: `com.example` (or your choice)
4. Artifact: `simple-todo`
5. Dependencies: Spring Web, Spring Data JPA, H2 Database, Validation, Spring Boot DevTools, Thymeleaf (optional)
6. Generate, unzip into this folder (or a subfolder), then open in your IDE.

Option B — download starter zip (PowerShell):

```powershell
# Replace VERSION and dependencies as needed
Invoke-WebRequest -Uri "https://start.spring.io/starter.zip?type=maven-project&language=java&bootVersion=3.1.0&baseDir=simple-todo&groupId=com.example&artifactId=simple-todo&name=simple-todo&dependencies=web,data-jpa,h2,devtools,validation,thymeleaf" -OutFile simple-todo.zip
Expand-Archive simple-todo.zip -DestinationPath .\
``` 

## Repository name suggestion
I recommend naming the GitHub repo: `SimpleToDoList-webapp` (or `simple-todo` if you prefer lowercase).

## Git & GitHub publish (PowerShell)
Replace `YOUR_GITHUB_USERNAME` with your GitHub username and set the remote URL accordingly.

```powershell
# Initialize, commit and push to a remote GitHub repo
git init
git add .
git commit -m "Initial repo files: README, LICENSE, .gitignore"
# If your branch is 'main' by default, use the following; otherwise adjust
git branch -M main
# Add remote (example using HTTPS)
git remote add origin https://github.com/YOUR_GITHUB_USERNAME/SimpleToDoList-webapp.git
git push -u origin main

# Or, if you have GitHub CLI installed and want to create and push in one step:
# gh repo create YOUR_GITHUB_USERNAME/SimpleToDoList-webapp --public --source=. --remote=origin --push
```

## Next steps (recommended immediate actions)
1. Generate the Spring Boot project (Option A or B above).
2. Add a basic `Task` JPA entity and `TaskRepository`.
3. Implement a `TaskService` and a simple REST controller exposing CRUD endpoints.
4. Run with the Maven wrapper on Windows:

```powershell
# In project root
mvnw.cmd spring-boot:run
```

## CI (optional)
Add a GitHub Actions workflow to build on push using `mvn -B -DskipTests clean package`.

## Notes
- Update the `LICENSE` author/year to your name and year if you want.
- If you'd like, I can also scaffold the Spring Boot project files (pom.xml, src/main/java, sample controller/entity) and commit them for you.

---

Happy building! If you'd like, I'll also create the GitHub repo (if you provide access method) or scaffold the initial Spring Boot app in this workspace next.