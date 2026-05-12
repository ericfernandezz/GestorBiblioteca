[READ.md.txt](https://github.com/user-attachments/files/27612751/READ.md.txt)
#Gestor Biblioteca

Programa en Java que permite gestionar materiales de una biblioteca de distintas maneras como agregar,listar,buscar,prestar y devolver materiales.
En este se aplican clases abstractas e interfaces que heredan y polimorfizan para cumplir  la función.

#Instrucciones de ejecución 
1. Copilar : `javac src/main/java/com/mycompany/gestiondebiblioteca/*.java`
2. Ejecutar: `java com.mycompany.gestiondebiblioteca.Main`
3.  Seleccionar la clase Main.java como punto de entrada.Presionar Run Project (F6).El menú interactivo aparecerá en la consola de NetBeans.
4.  Al ejecutar el programa, aparece un menú con las siguientes opciones:
    - Agregar libro : El sistema pide: título, año y autor.Se crea un objeto Libro y se agrega a la biblioteca.Ejemplo: Ingrese título: El Quijote → Año: 1605 → Autor: Cervantes.
    - Listar materiales : Muestra todos los materiales guardados en la biblioteca.Cada material se imprime usando su método toString() con título, autor, año y estado (Prestado/Disponible).
    - Buscar por título : Solicita un título y busca en la colección.Si lo encuentra, muestra la información del material.Si no, informa que no existe.
    - Prestar material : Solicita el título del material.Si está disponible, cambia su estado a “Prestado”.Si ya estaba prestado, muestra un mensaje de error.
    - Devolver material :Solicita el título del material.Si estaba prestado, cambia su estado a “Disponible”.Si no estaba prestado, informa que no se puede devolver.
    - Salir : Finaliza el programa mostrando el mensaje: “Saliendo del sistema…”

#Estructura del proyecto 
  #Clases
   - Clase abstracta base: MaterialBiblioteca.java
   - Interfaz : Prestable.java
   - Clase hija : Libro.java
   - Gestor de materiales : Biblioteca.java
   - Menú Interactivo : Main.java

#Integrantes
 1- Fernandez Eric : Clase abstracta base + Interfaz + Gestor de materiales
 2- Nievas Simon : Menú Interactivo 
 3- Martinez Katherina : Clase Libro 

#Desafíos del proyecto
 - Configuración de Github :Dificultades para conectar el repositorio con claves SSH y sincronizar ramas debido a cambios/agregados.
 - 

#Uso de IA/herramientas externas
 -Asistencia en Git : Se consultó para resolver problemas de inicialización, commits y sincronización de ramas.
