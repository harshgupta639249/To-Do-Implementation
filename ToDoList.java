import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {
            System.out.println("TO-DO LIST APP");

            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Clean the buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added!");
                    break;

                case 2:
                    System.out.println("Your Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i+1) + ". " + tasks.get(i)); //tasks.get(i)= Remove a task from the List
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter task number to delete: ");
                    int num = sc.nextInt();
                    if (num > 0 && num <= tasks.size()) {
                        tasks.remove(num - 1);
                        System.out.println("Task Deleted!");
                    } else {
                        System.out.println("Invalid number!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);


        sc.close();
    }
}