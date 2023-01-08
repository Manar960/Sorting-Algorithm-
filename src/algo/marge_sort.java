package algo;

import java.util.Scanner;

public class marge_sort {

	public static void main (String[]args ) {
		marge_sort  MergeSort=new marge_sort();
		int n;  
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt(); 
		
		int[]array=new int[n];
	
				for(int i=0; i<n; i++)  
				{  
		          array[i]=sc.nextInt(); 
				}
		
				MergeSort.rearrangeEvenAndOdd(array,n);
		
		 System.out.print("[");
		 for(int element=0;element <array.length;element++) {
			 
            System.out.print(array[element]);
            if(element== array.length-1)
            	break;
            else
            System.out.print(",");
          
        } 
		 System.out.print("]");
	    
	    
	
	}
	 static void rearrangeEvenAndOdd(int arr[], int n)
	    {
	        // variables
	        int j = -1,temp;
	     
	        // quick sort method
	        for (int i = 0; i < n; i++) {
	     
	            // if array of element
	            // is odd then swap
	            if (arr[i] <0) {
	     
	                // increment j by one
	                j++;
	     
	                // swap the element
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	   
		
		
	
	
	}
	
	
	
	
	
	
	
	
	

