package Lb1_Tkachuk;
import java.util.Scanner;

public class Main {
	public static boolean Array(int size, int[] array) {
		boolean flag=false;
		for(int i = 1; i < size; i++) {
			if(array[i]>=array[i-1]) {
				flag=true;
			} else {
				flag=false;
				break;
			}
			
		}
		return flag;
	}
	
	public static void FizzBuzz() {
	    for (int i =1; i <=100; i++) {
	    	if(((i % 3) == 0)&&((i % 5) == 0)) {
		        System.out.println("Fizz" + "Buzz");
		        return;
		    } else if ( i % 3 == 0){
			    System.out.println("Fizz");
		    } else if (i % 5 == 0) {
			    System.out.println("Buzz");
		    } else {
			    System.out.println(i);
		    }
	    }  
    }

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Input a massive length");
	    int size = in.nextInt();
	    int[] array = new int [size];
	    if(size<=2) {
            System.out.print("Size must be > 2");
	    } else {
	        System.out.print("Insert array elements: ");
	        for(int i = 0; i<size; i++) {
		        array[i] = in.nextInt();
	        }
	        System.out.print("Array: ");
	        for(int i = 0; i<size; i++) {
		        System.out.print(" " +array[i]);
	        }
	        System.out.println();
	    }
	    System.out.println(Array(size, array));
	    System.out.println("FizzBuzz");
	    FizzBuzz();
	}
}