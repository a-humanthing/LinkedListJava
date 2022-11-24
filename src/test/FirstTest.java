package test;
import java.util.Scanner;
public class FirstTest {
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in); 
	        int[] arr = new int[5];
	        System.out.print("Enter 10 number to array:");
	        for(int i=0;i<5;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        // accessing element at 0 index
	        // and setting its value to 5.
	        for(int j=0;j<5;j++) {
	        	System.out.println(arr[j]+" ");
	        }
	  
	        // access and print value at 0
	        // index we get the output as 5.
	        
	    }
}
