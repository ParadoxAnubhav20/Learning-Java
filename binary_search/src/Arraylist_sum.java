

import java.util.Scanner;

public class Arraylist_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int sum=0;
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The elements of the array are: ");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for(int i=0;i<size;i++) {
            sum+=arr[i];
        }
        System.out.println("The Sum of the Elements of the Array is:"+sum);
        sc.close();
    }
}

