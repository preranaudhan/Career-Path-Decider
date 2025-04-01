# Career Path Decider

This is a simple career guidance application built in Java that suggests career paths based on user preferences. The program uses decision trees to guide users in making an informed decision about their career based on their field of interest and work-life balance preferences.

## Features
- Suggests career paths based on user input in one of four categories:
  1. **Technical Problem Solver and Computational Thinker**
  2. **Medical Practitioner and Physiotherapist**
  3. **Economic Analyst and Legal Consultant**
  4. **Architectural Designer and Love for Traveling**
  
- Each career path is further categorized based on:
  - **Workplace Type**: Static or Dynamic
  - **Work-Life Balance**: 9-5 vs. 24/7
  
- Provides suggestions based on choices made by the user through a simple text-based interface.

## How to Run the Application

### Prerequisites
- **Java** (JDK 8 or later)
  
### Steps:
1. Clone the repository or download the source code.
2. Navigate to the directory containing the `.java` files.
3. Compile the Java files using the following command:
```bash
javac Main.java Tree.java
```
4. Run the program using:
   ```bash
   java Main
   ```
   Enter your age: 16 Sorry you are not in agegroup for the test

   
### Sample Workflow
1. After validating the user's age, the program prompts the user to select a field of interest.
2. The user chooses a category (e.g., "Technical Problem Solver and Computational Thinker").
3. The program guides the user through further decisions, like choosing between static or dynamic workplaces, and 9-5 or 24/7 work hours.
4. Based on the choices, the program will suggest a suitable career.

### Available Career Categories:
1. **Technical Problem Solver and Computational Thinker**:
   - Example careers: Software Engineer, Data Scientist, Entrepreneur.

2. **Medical Practitioner and Physiotherapist**:
   - Example careers: Doctor, Physiotherapist, Government/Private Medical Jobs.

3. **Economic Analyst and Legal Consultant**:
   - Example careers: Financial Analyst, Legal Consultant, Lawyer.

4. **Architectural Designer and Love for Traveling**:
   - Example careers: Architect, Historian, Teacher.

## Code Explanation
- **Main Class**: The entry point for the program. It handles user input, career field selection, and age validation.
- **Tree Class**: Implements the decision trees for each field. It contains methods for creating and traversing the trees based on user choices.
- **Node Class**: Represents nodes in the decision tree, each containing career options and child nodes to further guide the decision-making process.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- Java's built-in `Scanner` class is used for taking user input.
- The decision tree structure is used to simulate career path decision-making.
