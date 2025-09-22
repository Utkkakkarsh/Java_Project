# Campus Course & Records Manager (CCRM)

## 1. Project Brief

CCRM is a console-based Java application designed for an educational institute to manage students, courses, enrollments, and grades. It serves as a comprehensive demonstration of core Java SE features, Object-Oriented Programming (OOP) principles, modern Java APIs, and fundamental design patterns.

---

## 2. Features

-   **Student Management**: Add, list, and view student profiles.
-   **Course Management**: Add, list, and filter courses by department or semester.
-   **Enrollment & Grading**: Enroll students in courses, assign grades, and compute GPA.
-   **Transcript Generation**: Print a full academic transcript for any student.
-   **File Utilities**:
    -   Export student and course data to CSV-like files.
    -   Create timestamped backups of all data files.
    -   (Optional) Import data from pre-formatted CSV files.
-   **Robust & Modern Codebase**:
    -   **OOP**: Encapsulation, Inheritance, Abstraction, Polymorphism.
    -   **Design Patterns**: Singleton (for services), Builder (for model creation).
    -   **Modern Java**: NIO.2 for file I/O, Streams API for data manipulation, Date/Time API for timestamps.
    -   **Core Concepts**: Demonstrates enums, lambdas, recursion, and comprehensive exception handling.

---

## 3. Project Structure

The project is organized into logical packages to ensure separation of concerns:

-   `com.ccrm.cli`: Handles all command-line interface logic.
-   `com.ccrm.model`: Contains all data entities (POJOs), enums, and abstract classes.
-   `com.ccrm.service`: Manages business logic and data persistence (in-memory).
-   `com.ccrm.util`: Provides utility functions, primarily for file operations.
-   `com.ccrm.exception`: Defines custom exceptions for specific error conditions.

---

## 4. How to Compile and Run

### Prerequisites

-   Java Development Kit (JDK) 11 or higher.
-   An IDE like IntelliJ, Eclipse, or VS Code (recommended), or just a terminal.

### Steps

1.  **Clone the repository:**
    ```bash
    git clone <your-repository-url>
    cd CCRM
    ```

2.  **Compile the code:**
    Navigate to the `src` directory and run the Java compiler.

    ```bash
    # From the CCRM/src directory
    javac com/ccrm/Main.java -d ../bin
    ```
    *(Note: Compiling manually can be complex due to packages. It's highly recommended to open the project in an IDE and run it from there.)*

3.  **Run the application:**
    From the `bin` directory that was created, run the main class.

    ```bash
    # From the CCRM/bin directory
    java com.ccrm.Main
    ```

### Using an IDE (Recommended)

1.  Open your IDE (e.g., IntelliJ IDEA).
2.  Select "Open" or "Import Project" and choose the cloned `CCRM` directory.
3.  Locate the `src/com/ccrm/Main.java` file.
4.  Right-click on the file and select "Run 'Main.main()'".
