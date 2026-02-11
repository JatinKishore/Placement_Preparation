# TCS Digital - Interview Experience

**Role:** Digital Profile  
**Recruitment Type:** Campus/Off-Campus (Specify if known)  
**Process Location:** Online/On-Site (Specify if known)  

---

## 1. Interview Process Overview

The TCS Digital interview process typically includes technical, logical reasoning, and HR discussions. Below is a detailed account of the questions and topics covered.  

---

## 2. Technical Interview  

### **Introduction and Project Discussion**
- Brief introduction about yourself.  
- Explanation of your academic/project work.  

### **SQL Questions**
1. **About Clauses**: Discussion on SQL clauses (e.g., WHERE, GROUP BY, HAVING, ORDER BY).  
2. **Second Highest Salary Query**:  
   ```sql
   SELECT MAX(salary) 
   FROM employee 
   WHERE salary < (SELECT MAX(salary) FROM employee);
  ```
Average Marks Above a Certain Limit Query:
sql
SELECT AVG(marks) 
FROM students 
WHERE marks > 50;

## OOPs Concepts

### What is OOPs?  
Object-Oriented Programming (OOPs) is a programming paradigm based on the concept of "objects," which can contain data and methods.  

### Explanation of Basic Concepts:  
1. **Encapsulation**: Bundling data and methods that operate on the data into a single unit (class).  
2. **Inheritance**: Mechanism to create a new class (child) from an existing class (parent) to reuse the code.  
3. **Polymorphism**: Ability of different classes to respond to the same method call in different ways (e.g., method overriding).  
4. **Abstraction**: Hiding the implementation details and showing only essential features.  

### Inheritance Example:  
Discussion on inheritance and related code implementation to demonstrate code reuse and hierarchy.  

### Constructors:  
Constructors are special methods in a class that are automatically called when an object is created. They are used for initializing objects.  
Example:  
```java
class Example {
    int x;

    // Constructor
    Example(int value) {
        x = value;
    }

    void display() {
        System.out.println("Value: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(10);
        obj.display();
    }
}
```
# HR Interview  

## General HR Questions  
- Are you ready for re-location?  
- Do you agree to the bond terms?  
- Where do you see yourself in 5 years?  
- What are your strengths and weaknesses?  

---

## Logical Reasoning Question  

### Problem Statement:  
Take a number, divide it by half, and add 10 to it.  

**Example:**  
- If the number is 40:  
  \( \text{Result} = \left(\frac{40}{2}\right) + 10 = 30 \)  

---

## Key Takeaways  

1. Brush up on SQL queries and OOPs concepts with practical examples.  
2. Prepare for project discussions by explaining challenges and solutions in your work.  
3. Practice logical and reasoning problems to demonstrate quick thinking.  
4. Be honest and confident while answering HR questions.  

---
# TCS NQT 2026 Interview Experience

The TCS NQT 2026 recruitment for the **2026 Batch** follows an integrated pattern where your performance in a single 180-minute test determines your placement into **Ninja**, **Digital**, or **Prime** roles.

## Integrated Test Pattern (Total: 180-190 Minutes)

### 1. Foundation Section (75 Mins)
* **Numerical Ability**: 20 Questions (25 mins) - Focus on Percentages, Profit/Loss, Time & Work.
* **Verbal Ability**: 25 Questions (25 mins) - Focus on Grammar, Cloze Test, Reading Comprehension.
* **Reasoning Ability**: 20 Questions (25 mins) - Focus on Blood Relations, Puzzles, Series.

### 2. Advanced Section (115 Mins)
* **Advanced Quantitative & Reasoning**: 15 Questions (25 mins) - High-level Algebra, Geometry, and Complex Logic.
* **Advanced Coding**: 3 Questions (90 mins) - Array manipulation, String algorithms, and Dynamic Programming.

---

## Technical & HR Interview
* **Ninja**: Focus on Resume projects, OOPS, DBMS, and basic coding logic.
* **Digital/Prime**: Focus on Advanced Data Structures, System Design, AI/ML, and Cloud concepts.

## Offer Upgrades
If you receive a **Ninja** offer, you are eligible for the **Digital/Prime Upgrade Exams** (internal proctored tests) after joining to increase your CTC.