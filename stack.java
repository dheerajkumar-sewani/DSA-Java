import java.util.Scanner;

class stack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int stack[] = new int[10];
        int top = -1;
        int choice=0, value;

        while (choice!=5)  {
            System.out.println("\nSTACK MENU");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display \n5.Exit");
            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (top == stack.length - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                     System.out.print("Enter element: ");
                        value = sc.nextInt();
                        stack[++top] = value;
                        System.out.println(value + " pushed");
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Deleted element: " + stack[top--]);}
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack is Empty");}
                         else {
                        System.out.println("Top element: " + stack[top]);
                    }
                    break;

                case 4:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Stack Elements:");
                        for (int i = top; i >= 0; i--) {
                          System.out.println(stack[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Program Ended");
                break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}