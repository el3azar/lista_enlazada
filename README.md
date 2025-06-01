# 💬 ChatLinkedListSOLID

Simulador de chat en consola desarrollado en Java, que utiliza una lista enlazada personalizada para almacenar mensajes y aplica los principios SOLID de la programación orientada a objetos.

---

## 🚀 Características

- Interfaz de texto por consola.
- Almacenamiento de mensajes en una lista enlazada manual (sin `ArrayList` ni `LinkedList` de Java).
- Simulacion de envío de distintos tipos de mensajes:
  - Mensajes de texto.
  - Imágenes (URL).
  - Audios (URL).
- Manejo de múltiples usuarios y conversaciones.
- Aplicación de principios **SOLID**:
  - **SRP**: Separación de responsabilidades por clases (servicios, modelos, estructuras).
  - **OCP**: Uso de interfaz `IMessage` para permitir distintos tipos de mensajes.
  - **DIP**: Dependencia desde `Main` a interfaces (`IUserService`, `IChatService`).

---

## 🧱 Estructura del Proyecto

```
src/
└── com/kodigo/jd20/chat/
    ├── application/
    │   └── Main.java
    ├── model/
    │   ├── User.java
    │   ├── IMessage.java
    │   ├── Message.java
    │   ├── ImageMessage.java
    │   ├── VoiceMessage.java
    │   └── Chat.java
    ├── datastructure/
    │   ├── MessageNode.java
    │   └── MessageLinkedList.java
    └── service/
        ├── IUserService.java
        ├── IChatService.java
        ├── UserService.java
        └── ChatService.java
```

---

## 🖥️ Ejecución

1. Compila todos los archivos `.java` dentro de `src`.
2. Ejecuta la clase `Main` desde consola o desde tu IDE:

```bash
javac com/kodigo/jd20/chat/application/Main.java
java com.kodigo.jd20.chat.application.Main
```

---

## 📚 Requisitos

- Java 8 o superior.
- Terminal/IDE compatible con proyectos de consola.
- No se requieren bibliotecas externas.

---

## 📝 Créditos

Proyecto desarrollado por **Otoniel Eleazar Rivas Nájera**  
Entrega para el Bootcamp Java Developer 20  
Coach: Eduardo Calles

---

## 🗂️ Licencia

Este proyecto es de uso académico. Todos los derechos reservados.
