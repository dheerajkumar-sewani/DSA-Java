import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        
        int low = 0;
        int high = n - 1;
        int found = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position " + (mid + 1));
                found = 1;
                break;
            } 
            else if (key < arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        if (found == 0) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}