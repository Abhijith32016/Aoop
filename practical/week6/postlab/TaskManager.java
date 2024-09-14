package task6a;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<String> tasks;
    private Scanner scanner;

    public TaskManager() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addTask() {
        System.out.print("Enter the task description: ");
        String taskDescription = scanner.nextLine();
        tasks.add(taskDescription);
        System.out.println("Task added.");
    }

    public void updateTask() {
        displayTasks();
        System.out.print("Enter the task number to update: ");
        int taskIndex = scanner.nextInt();
        scanner.nextLine();

        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            System.out.print("Enter the new task description: ");
            String newDescription = scanner.nextLine();
            tasks.set(taskIndex, newDescription);
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void removeTask() {
        displayTasks();
        System.out.print("Enter the task number to remove: ");
        int taskIndex = scanner.nextInt();
        scanner.nextLine(); 

        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    public void run() {
        while (true) {
            System.out.println("\nTask Manager:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.run();
    }
}
