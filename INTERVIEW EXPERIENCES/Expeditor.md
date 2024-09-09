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

### II Expeditor Interview Experience
#### Expeditors - Interview Experience
**Role:** Associate Developer / Associate Analyst / Associate Tester



#### Round 1: Aptitude Round
- **Attendees:** 542
- **Topics Covered:**
  1. Time and Work
  2. Trains
  3. Pipes and Cisterns
  4. Ratio and Proportion
  5. Ages
  6. Dates
  7. Partnerships
- **Difficulty:** Medium to Hard
- **Duration:** 30 questions to be solved in 40 minutes


#### Round 2: Group Discussion
- **Attendees:** 120
- **Topic:** Which is more motivating for an employee - Job Security or Salary
- **Key Takeaways:**
  1. Try to initiate the conversation
  2. Add relevant points to the other panelists' views
  3. Avoid 1-1 conversations with anyone
  4. Refrain from putting forward points that may offend or intimidate others
  5. Engage actively in the conversation without forcing yourself in
- **Difficulty:** Medium
- **Duration:** 20 minutes to talk, 5 minutes to summarize



#### Round 3: Technical Interview
- **Attendees:** 49
- **Process:**
  1. Submitted my resume
  2. Gave a self-introduction, focusing on technologies I was confident in: **Node.js, Python, and SQL**
  3. Discussed my internships - how I got them and the tech stack I worked on (7-10 minutes)
  4. Answered questions on my project - implementation details and technical aspects (5-7 minutes)
  5. Explained how backend and APIs work and wrote a sample API route from past experience
  6. Strongest programming language: **Python** - wrote code for different approaches to the Factorial program in both **Python** and **Java**
  7. Answered basic **Java** questions: constructors, classes, runtime polymorphism, compile-time polymorphism, inheritance
  8. Wrote a SQL query to find the 3rd highest mark of a student from a students table using **OFFSET** and **DENSE_RANK()**
  9. Explained **Software Development Life Cycle (SDLC)** and **Agile Methodologies** with examples from my internship
  10. Brief discussion on **Java, Spring Boot, GraphQL, and Angular** technologies used by the company
  11. Shared my knowledge on **graph databases** and **GraphQL**
- **Difficulty:** Medium
- **Duration:** 35-40 minutes



#### Round 4: Cultural Round
- **Attendees:** 15
- **Process:**
  1. HR reviewed my profile
  2. Asked why I hadn't opted for higher studies, given my top performance
  3. Presented scenarios to gauge my response:
      - How would I convince a senior manager if my idea was valid but not accepted?
      - What would I do if asked to work extra hours during volatile market conditions?
  4. Asked about my strengths and weaknesses
  5. Discussed my key selling points
  6. Asked why I think I fit into the **Expeditors** culture and why they should hire me
  7. Asked what I found interesting about **Expeditors** compared to other companies
  8. Asked how I keep up to date with current tech trends and about the most recent technology I had come across
  9. Asked if I was keen on on-site opportunities
  10. Asked how long I would stay in the company if selected
  11. Had a casual chat and clarified my doubts
- **Difficulty:** Medium - questions might be tricky and require good presence of mind and understanding of the company's culture
- **Duration:** 30-40 minutes



#### Outcome:
- Out of the 15 attendees in the Cultural Round, 5 were offered the position to join Expeditors.

