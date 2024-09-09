# Expeditors

### 1. Expeditors Technical Interview Questions

Expeditors uses a tech stack primarily based on Java for the backend, specifically Spring Boot, and Angular for the frontend. Below are some common technical interview questions for Java developers at Expeditors:



####  What is an Interface in Java and Why is it Used?
An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces allow for multiple inheritance and help define methods that must be implemented by classes. They provide a way to achieve abstraction and polymorphism.


####  What is the `abstract` Keyword in Java and How is it Used with Interfaces?
The `abstract` keyword is used to declare a class or method that cannot be instantiated directly and must be extended or implemented by a subclass. Interfaces by default have abstract methods, so the `abstract` keyword is not explicitly required when using an interface. It is used to declare abstract methods within an abstract class.


#### What is an Exception and How to Handle It in Java?
An exception is an event that disrupts the normal flow of a program's execution. Java uses the `try`, `catch`, `finally`, and `throw` keywords to handle exceptions. Checked exceptions must be handled at compile-time, while unchecked exceptions occur at runtime and do not require explicit handling.



#### Primary Key vs Foreign Key in SQL
- **Primary Key**: Uniquely identifies a record in a database table and cannot contain null values.
- **Foreign Key**: A field in one table that uniquely identifies a row of another table. It establishes relationships between tables.


####  `finalize` vs `finally` vs `final` in Java
- **`final`**: A keyword used to declare constants, prevent method overriding, and inheritance of classes.
- **`finally`**: A block of code in a `try-catch` statement that always executes, regardless of whether an exception occurred.
- **`finalize`**: A method in the `Object` class, called by the garbage collector before an object is destroyed.



####  What is a Thread? Is it Possible to Achieve Multithreading in Java?
A thread is a lightweight process that can run concurrently with other threads. Java supports multithreading through the `Thread` class or implementing the `Runnable` interface. Multithreading in Java allows multiple threads to run in parallel to optimize resource utilization and program efficiency.



####  What is Inheritance and Its Types in Java? Why is Multiple Inheritance Not Possible in Java?
Inheritance allows a class to inherit properties and behaviors from another class. Types of inheritance in Java:
- **Single Inheritance**
- **Multilevel Inheritance**
- **Hierarchical Inheritance**

Java does not support **multiple inheritance** to avoid complexity and ambiguity in the case of method conflicts from multiple parent classes. Instead, Java supports multiple inheritance through interfaces.


####  Are There Pointers in Java?
Java does not have pointers like C/C++. Instead, Java uses references to manage memory, making the language safer by preventing direct access to memory addresses.



####  Explain Garbage Collection and Is Java a Garbage-Collected Language?
Garbage collection in Java is the process of automatically reclaiming memory by deleting objects that are no longer in use. Java is a garbage-collected language, meaning that the JVM handles memory management, freeing the developer from manually releasing memory.



####  What is JIT and AOT Compilation? Does Java Use JIT, AOT, or Both?
- **JIT (Just-In-Time)**: A runtime compiler that converts bytecode into machine code during execution for performance optimization.
- **AOT (Ahead-Of-Time)**: Compilation that converts bytecode into native machine code before execution.

Java primarily uses **JIT** compilation, though certain Java environments may support **AOT** as well for faster startup times.

---

