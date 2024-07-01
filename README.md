# CounterApp

This project is a simple Java application that displays a counter. Every time the button is clicked, the
counter is incremented by one. This project is also configured with GitHub Actions to implement CI/CD.

## Project Structure

The project contains a main file `CounterApp.java` that contains all the code needed for the application.

## Requirements

To run this project, you will need to have the following installed:

- [Java Development Kit (JDK) 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Git](https://git-scm.com/)

## Instructions

### Step 1: Clone the Repository

First, clone the repository to your local machine using the following command:

```bash
git clone https://github.com/jpinas1998/demo-actions-java.git
cd your_repository
```

### Step 2: Compile and Run the Project

Once you have cloned the repository, navigate to the project directory and build the CounterApp.java file using
the following command:

```bash
javac CounterApp.java
```

After building, you can run the application with the following command:

```bash
java CounterApp
```

You should see a window with a button and a counter. Every time you click the button, the counter will increment.

### Continuous Integration (CI) with GitHub Actions

This project is configured to use GitHub Actions for CI/CD. Every time a push or pull request is made to the
repository, GitHub Actions will build and run the code automatically. You can see the configuration in the file
.github/workflows/workflow.yml.