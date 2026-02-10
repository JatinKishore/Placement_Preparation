# Deloitte

## I. Deloitte Interview Experience

The selection process for Deloitte typically focuses on core data structures, algorithmic optimization, and database architecture.

#### 1. Coding Round
- **Number of Questions**: 3 Questions
- **Breakdown**: 1 Easy, 2 Medium
- **Key Problems**:
  - String search: Check if a given string is present in an array of strings.
  - Array Optimization: Find all pairs $(i, j)$ where $arr[i] > arr[j] * 3$. 
    - *Note: Requires an optimized $O(n \log n)$ approach to pass large test cases.*

#### 2. Technical Interview (One-to-One)
- **Number of Questions**: 3–5 Questions
- **Difficulty**: Medium
- **Topics**:
  - **Heaps**: Implementation or priority queue applications.
  - **Two Pointers**: Used for array/string manipulation.
  - **Linked Lists**: Detecting cycles and finding the intersection point of two lists.

#### 3. Database Design Round
- **Focus**: System architecture and data modeling.
- **Scenario**: Airport Booking System.
- **Requirements**:
  - Draw/Explain ER Diagrams.
  - Perform Schema Design.
  - Write complex SQL queries based on the designed schema.

---
### **Tips**
* **Communication is Key**: If you explain your logic confidently and correctly, interviewers may waive the requirement to write the full code for certain questions.
* **Optimization**: For array pair problems, think beyond nested loops; consider modified Merge Sort or Fenwick tree logic for large constraints.