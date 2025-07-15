
##  Evaluación: Estructuras de Datos con Set y Map y logica de arboles

### Objetivo

Implementar la funcionalidad solicitada en la clase `LibroController` para ordenar y gestionar objetos de tipo `Book` utilizando colecciones que mantengan un orden definido.

---

## 🧩 Modelo

Clase: `models.Book`

### 📑 Atributos

| Atributo | Tipo   | Descripción        |
| -------- | ------ | ------------------ |
| `titulo` | String | Título del libro   |
| `autor`  | String | Autor del libro    |
| `anio`   | int    | Año de publicación |

### 🧠 Consideraciones de ordenamiento

Los libros deben estar **ordenados primero por título en orden descendente** y, en caso de empate, por año de publicación en orden ascendente. En caso de que dos libros tengan el mismo título y año, se considerarán duplicados y no deben incluirse en el resultado final.

---

## Controlador

Clase: `controllers.LibroController`

---

### 1️⃣ Método: `procesarConTreeSet(List<Book> libros)`

🔹 **Objetivo**: Implementar este método para que retorne un conjunto ordenado de libros, eliminando duplicados según el criterio de orden.

🔸 **Tipo de retorno**: `Set<Book>`

💡 **Pista**: la estructura elegida debe garantizar orden automático y evitar duplicados según el criterio de orden.

---

### 2️⃣ Método: `procesarConTreeMap(List<Book> libros)`

🔹 **Objetivo**: Implementar este método para retornar un `Map<Book, Book>` donde cada libro es la clave y su mismo objeto el valor.

🔸 **Tipo de retorno**: `Map<Book, Book>`

💡 **Pista**: la estructura debe permitir mantener el orden definido por los libros y evitar claves duplicadas según ese criterio.

---

## 📌 Instrucciones

1. Implementa correctamente ambos métodos en la clase `LibroController`.
2. Ejecuta los tests provistos en los archivos:

   * `test.LibroControllerTestSet`
   * `test.LibroControllerTestMap`
3. Compara los resultados y argumenta cuál implementación es más eficiente o adecuada según el caso de uso.
4. Sube el proyecto a tu repositorio y asegúrate de que el CI calcule la nota correctamente.

---

## 📦 Evaluación Automática

El sistema usará GitHub Actions para compilar y ejecutar los tests automáticamente.
Recuerda que cada test aprobado sumará a tu nota final.

---

## ✅ Criterios de Evaluación

| Criterio                             | Puntos    |
| ------------------------------------ | --------- |
| `procesarConTreeSet` funcional       | 5.0       |
| `procesarConTreeMap` funcional       | 5.0       |
| Tests ejecutan sin errores           | Requisito |
| Nota final calculada automáticamente | -         |

---

¿Dudas? Consulta con tu docente o revisa la documentación de Java sobre [TreeSet](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/TreeSet.html) y [TreeMap](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/TreeMap.html).

