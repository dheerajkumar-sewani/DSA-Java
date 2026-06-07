import java.util.Scanner;

class queue {
    int size=10;
    int queue[] = new int[size];
    int front = -1, rear = -1;

    void enqueue(int data) {
        if (rear == size-1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            queue[rear] = data;
            System.out.println("Inserted: " + data);
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;

            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        queue q = new queue();

        int choice=0 ,value;

        while(choice != 4) {
            System.out.println("\n--- QUEUE MENU ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element: ");
                    value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }
        sc.close();
    }
}
