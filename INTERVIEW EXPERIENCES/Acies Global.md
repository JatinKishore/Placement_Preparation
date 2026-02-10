# Acies Global - Interview Process

**Role:** Unknown  
**Recruitment Type:** Unknown  
**Process Location:** Unknown  

---

## 1. Interview Process

The interview process at Acies Global consists of **5 rounds**:

### Round 1: Online Assessment (Proctored)

- **Duration:** 1 hour 15 mins.
- **Sections:** 5 (each section has a time limit)
  - Reading comprehension
  - Critical Thinking
  - Problem Solving
  - Numerical Reasoning
  - Working with Data
- **Advice:** Answer at least 70% correct in each section.
- **Sample Questions:**
  1. **Reading Comprehension:** Synonyms, antonyms, infer passage content, etc.
  2. **Efficiency Problem:** Given workers' efficiency and individual times, calculate the time taken when working together.
  3. **Transcription Rate:** If the new transcription rate is $57.5/hour after a 15% spike, calculate the earlier rate.
  4. **Percentage Question:** What fraction is closest to 25%?
  5. **Number Series:** Find the next number in the sequence (25, 49, 97, ?).
  6. **Bakers Problem:** Determine if a bakery can complete an order in the given time with available bakers.
  7. **Number Puzzle:** Complete the missing number in the series (17, 37, 65, ?, 145).
  8. **Number Series:** Find the next number (1, 4, 10, 19 …).
  9. **Number Series:** Find the next number (143, 221, 323, ?).
  10. **Logical Reasoning:** Laptops, computers, and notebooks – draw conclusions from given statements.
  11. **Manager & CEO Problem:** Interpret logical conclusions based on given statements about MBAs and CEOs.
  12. **Seating Arrangement:** Solve seating arrangement puzzles.
  13. **Sentence Ordering:** Arrange sentences in a logical order.

---

### Round 2: Group Discussion

- **Duration:** 20 mins.
- **Format:** Conducted via Google Meet.
  - Each batch had 5 participants and 3 organization members.
  - **Topic:** "Are self-driving cars safer or dangerous?"
  1. Each member had 2 mins to speak on the topic.
  2. Participants interacted with each other to discuss opinions.

---
### Round 3: Coding Test
- **Sections**: 5 (with separate time limits)

1. **Programming Task**: Determine if the product of a list of integers is even or odd.

   **Solution**:
   ```python
   def check_product_and_get_sum(int_list):
       product = 1
       for num in int_list:
           product *= num
       if product % 2 == 0:
           return sum(int_list)
       else:
           return "Product is odd"
           
   integers = [1, 2, 3, 4]
   result = check_product_and_get_sum(integers)
   print(result)
   ```

2. **Debugging Task**: Combine product IDs from two warehouses into one sorted array.

   **Solution**:
   ```python
   def complete_inventory(warehouse_1, x, warehouse_2, y):
       back_index = len(warehouse_1) - 1
       first_pointer = x - 1
       second_pointer = y - 1
       while second_pointer >= 0:
           if first_pointer >= 0 and warehouse_1[first_pointer] > warehouse_2[second_pointer]:
               warehouse_1[back_index] = warehouse_1[first_pointer]
               first_pointer -= 1
           else:
               warehouse_1[back_index] = warehouse_2[second_pointer]
               second_pointer -= 1
           back_index -= 1
       return warehouse_1
   ```

3. **MCQ Questions**: 
   - Object-oriented programming (class, inheritance, polymorphism, abstraction)
   - Data structures
   - Software engineering case studies

### Round 4: Technical Interview
- **Panelists**: 2
- **Duration**: 20 minutes

#### Questions Asked:
- Tell me about yourself.
- Explain your project.
- What difficulties did you face during the project, and how did you overcome them?
- Explain any internships you've done and what you learned.
- Problem-solving scenario: How would you improve a company's profit if it has reduced significantly?
- Box Problem: Given 3 mislabeled boxes of apples and oranges, how do you label them correctly by opening just one box?
- Difference between list and tuple.
- What is a database?
- Is a text file a database?
- Difference between DELETE and TRUNCATE.

### Final Round: HR Interview
- **Panelists**: 2
- **Duration**: 20 minutes

#### Questions Asked:
- Explain your project.
- What is PyCharm? (based on the resume)
- What is an IDE?
- What is Jupyter Notebook?
- Difference between PyCharm, VSCode, and Jupyter Notebook.
- What libraries do you use for machine learning?
- What is NumPy and Pandas?
- What if there is no IDE?
- What functions do you know in Pandas?
- What do you think people misunderstand about you?
- What advice would you give to your younger self?
- What would you consider your biggest achievement?


----
# Acies Global Interview Process

## Round 1: Aptitude Test
- **Difficulty:** Easy to Medium

## Round 2: Group Discussion (GD)
- **Duration:** 20-25 minutes

## Round 3: Technical Interview
- **Focus:** 
  - Questions based on your resume.
  - Questions from your preferred programming language.

## Round 4: HR Discussion

---

# Acies Global

## I. Acies Global Interview Experience

The selection process for Acies Global is comprehensive, focusing on aptitude, communication, and technical depth in core programming and data management.

#### 1. Online Assessment
- **Format**: 60 questions across 5 sections.
- **Duration**: Fast-paced (Mail sent 5 mins prior to the start).
- **Sections**:
  - Reading Comprehension
  - Critical Thinking
  - Problem Solving
  - Numerical Reasoning
  - Working with Data

#### 2. Group Discussion (GD)
- **Focus**: Shortlisted candidates discuss basic/trending topics to evaluate communication and logical thinking.

#### 3. Technical Interview
- **Project Deep Dive**: Major focus on your academic or personal projects.
- **Language Fundamentals (C/C++)**: 
  - Implementation of Classes and Objects.
  - OOPS concepts in C context.
- **SQL & Databases**:
  - Joins: Left Join vs. Right Join.
  - Aggregate Functions: `SUM`, `AVG`, `COUNT`, `MIN`, `MAX`.
- **Machine Learning (ML)**:
  - Basic concepts and definitions.

#### 4. HR Interview
- **Focus**: Leadership qualities and general behavioral questions.

---
### **Tips**
* **Strict Eligibility**: Ensure your CGPA/Percentage meets the 85% threshold as they are strict with registration data.
* **Database Clarity**: Be ready to explain the visual difference between Join types; they often ask for specific query results based on sample tables.
* **ML Basics**: Even for developer roles, have a high-level understanding of supervised vs. unsupervised learning.