import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManger tm = new TaskManger();

        while (true){
            System.out.println("1. Add Task");
            System.out.println("2. View a task");
            System.out.println("3. View all task");
            System.out.println("4. Check status");
            System.out.println("5. Mark Task Complete");
            System.out.println("6. Delete task");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Description: ");
                    String des = scanner.next();
                    System.out.println("Enter Due Date: ");
                    String ddate = scanner.next();
                    tm.AddTask(name, des, ddate);
                    break;
                case 2:
                    System.out.println("Enter Name: ");
                    String ViewName = scanner.next();
                    tm.ViewATask(ViewName);
                    break;
                case 3:
                    tm.ViewAllTask();
                    break;
                case 4:
                    System.out.println("Enter Name: ");
                    String CSName = scanner.next();
                    tm.CheckStatus(CSName);
                    break;
                case 5:
                    System.out.println("Enter Name: ");
                    String ComName = scanner.next();
                    tm.MarkAsCompleted(ComName);
                    break;
                case 6:
                    System.out.println("Enter Name: ");
                    String DeleteName = scanner.next();
                    tm.DeleteTask(DeleteName);
                    break;
                default:

                    break;
            }
        }

    }
}