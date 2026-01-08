# 📒 Hackathon 2 — Agenda Telefónica (Java 21)

Proyecto desarrollado para la **Hackathon 2 (Tiempo de Trabajo)**.  
El objetivo es construir una **agenda telefónica en consola** que permita gestionar contactos de manera simple, ordenada y con validaciones clave.

> **Grupo:** *Compile or Cry* (5 integrantes)

---

## 🎯 Misión del ejercicio

Implementar un sistema de agenda que gestione un conjunto de contactos considerando:

- Un **contacto** está compuesto por: **nombre**, **apellido** y **teléfono** (sin validar formato del teléfono).
- Dos contactos se consideran **duplicados** si tienen el **mismo nombre y apellido** (sin distinguir mayúsculas/minúsculas).
- La agenda tiene un **tamaño máximo**:
  - Por defecto: **10 contactos**
  - O definido por el usuario al crear la agenda

Además, se debe crear un **menú por consola** para probar todas las funcionalidades.

---

## ✅ Funcionalidades implementadas

La solución incluye las operaciones pedidas en el enunciado:

- **Añadir contacto** (`añadirContacto(Contacto c)`)
  - Valida que **nombre y apellido no estén vacíos**
  - Valida que la **agenda no esté llena**
  - Evita **duplicados** por nombre + apellido (case-insensitive)
- **Verificar existencia** (`existeContacto(Contacto c)`)
  - Usa la comparación de `equals()` en `Contacto`
- **Listar contactos ordenados** (`listarContactos()`)
  - Muestra contactos con el formato: `Nombre Apellido - Teléfono`
  - Ordena alfabéticamente por **nombre** y luego por **apellido** (sin distinguir mayúsculas/minúsculas)
- **Buscar contacto** (`buscaContacto(String nombre, String apellido)`)
  - Si existe, muestra el teléfono
  - Si no existe, informa “Contacto no encontrado”
- **Eliminar contacto** (`eliminarContacto(Contacto c)`)
  - Informa si la eliminación fue exitosa o si el contacto no existe
- **Modificar teléfono** (`modificarTelefono(String nombre, String apellido, String nuevoTelefono)`)
  - Actualiza el teléfono solo si el contacto existe
- **Agenda llena** (`agendaLlena()`)
  - Indica si ya no hay espacio para nuevos contactos
- **Espacios libres** (`espaciosLibres()`)
  - Muestra cuántos contactos más se pueden agregar según el tamaño máximo

---

## 🧱 Estructura del proyecto

Este proyecto se implementa con **3 clases**:

- `Contacto`
  - Modela los datos de un contacto (`nombre`, `apellido`, `telefono`)
  - Define `equals()` para considerar duplicados por **nombre + apellido** (case-insensitive)
  - Define `toString()` para imprimir en formato `Nombre Apellido - Teléfono`

- `Agenda`
  - Administra la lista de contactos
  - Controla el tamaño máximo y las validaciones
  - Implementa todas las operaciones pedidas por el ejercicio

- `Main`
  - Contiene el menú por consola y permite probar cada funcionalidad

---

## 🧰 Herramientas y tecnologías

- **Java 21**
- IDE recomendado: **IntelliJ IDEA** (opcional)
- Entrada por consola con `Scanner`
- Colecciones Java:
  - `ArrayList` para almacenar contactos
  - `Collections.sort` + `Comparator` para ordenar

---

## ▶️ Cómo ejecutar

### Opción A — Terminal (Windows / macOS / Linux)

En la carpeta del proyecto:

```bash
javac *.java
java Main
```

> Si tu clase principal tiene otro nombre o paquete, ajusta el comando a tu caso.

### Opción B — IntelliJ IDEA

1. Abrir la carpeta del proyecto en IntelliJ
2. Ejecutar `Main.java` con **Run**

---

## 🧭 Menú (consola)

El programa incluye un menú para probar las funciones:

```
AGENDA TELEFÓNICA
1. Añadir contacto
2. Listar contactos
3. Buscar contacto
4. Eliminar contacto
5. Modificar teléfono
6. Espacios libres
7. Salir
```

---

## 🧪 Consideraciones importantes (coherentes con el código)

- Un contacto es “igual” a otro si coincide **nombre + apellido** sin importar mayúsculas/minúsculas.
- El listado se imprime ordenado por **nombre** y luego **apellido** usando comparación case-insensitive.
- La agenda por defecto permite **10 contactos** (puede ampliarse usando el constructor `Agenda(int tamanioMaximo)`).

---

## 🧾 Conclusión

Esta hackathon permitió aplicar buenas prácticas de lógica en consola y estructuras de datos:
- Control de capacidad (agenda llena / espacios libres)
- Validación de entradas (evitar registros inválidos)
- Manejo correcto de duplicados mediante `equals()`
- Ordenamiento y presentación clara de información al usuario

El resultado es una agenda funcional, clara y fácil de probar desde consola, alineada con los requisitos del enunciado.

---

## 👥 Integrantes — *Compile or Cry* (5)

- Integrante 1: Jonathan Fernandez
- Integrante 2: Gabriel Lillo
- Integrante 3: Naomi Nuñez
- Integrante 4: Paulina Diaz
- Integrante 5: Francisco Torres
- Integrante 5: Martin Caviedes
