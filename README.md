# Academia
## Un proyecto de ejemplo con Spring Boot 3.x, una b.d. H2 en disco (que se adjunta), autenticación y RBAC JWT.

Se utiliza para entrenamiento y como ejemplo.

Gestiona una academia ficticia donde pueden tomarse cursos que tienen asignaturas que se imparten en un horario.

El objetivo de esta API REST es gestionar las operaciones relacionadas con una academia. Las principales
funcionalidades incluyen la gestión de usuarios (alumnos, profesores, administradores), cursos, asignaturas,
horarios y la matriculación de alumnos en cursos.

#### **Entidades Principales**

- **Usuario**:
  - Puede ser alumno, profesor o administrador.
  - Los usuarios tienen atributos comunes como nombre, correo electrónico, rol, etc.
  
- **Curso**:
  - Cada curso tiene una lista de asignaturas.
  - Los alumnos pueden matricularse en uno o varios cursos.
  
- **Asignatura**:
  - Las asignaturas son parte de un curso y son impartidas por uno o varios profesores.
  
- **Horario**:
  - Las asignaturas se imparten en horarios específicos.

 #### 5. **Endpoints Propuestos**

| Método HTTP | URI                        | Descripción                               |
|-------------|----------------------------|-------------------------------------------|
| `POST`      | `/usuarios`                | Crear un nuevo usuario                    |
| `GET`       | `/usuarios`                | Listar todos los usuarios                 |
| `GET`       | `/usuarios/{id}`           | Obtener detalles de un usuario específico |
| `PUT`       | `/usuarios/{id}`           | Actualizar información de un usuario      |
| `DELETE`    | `/usuarios/{id}`           | Eliminar un usuario                       |
| `POST`      | `/cursos`                  | Crear un nuevo curso                      |
| `GET`       | `/cursos`                  | Listar todos los cursos                   |
| `PUT`       | `/cursos/{id}`             | Actualizar un curso                       |
| `DELETE`    | `/cursos/{id}`             | Eliminar un curso                         |
| `POST`      | `/asignaturas`             | Crear una nueva asignatura                |
| `GET`       | `/asignaturas`             | Listar todas las asignaturas              |
| `PUT`       | `/asignaturas/{id}`        | Actualizar una asignatura                 |
| `DELETE`    | `/asignaturas/{id}`        | Eliminar una asignatura                   |
| `POST`      | `/matriculas`              | Matricular a un alumno en un curso        |
| `GET`       | `/matriculas`              | Listar todas las matrículas               |
| `POST`      | `/horarios`                | Crear un horario para una asignatura      |
| `GET`       | `/horarios`                | Listar los horarios                       |



