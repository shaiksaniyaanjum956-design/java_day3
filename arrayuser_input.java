import java.util.*;
public class arrayuser_input {
    public static void main(String args[]) {       
        Scanner sc = new Scanner(System.in);      
        int arr[] = new int[5];   
        System.out.println("Enter 5 elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }        
        System.out.println("Array elements are:");
        for(int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}