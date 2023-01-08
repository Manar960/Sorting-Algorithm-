package algo;


import java.util.Arrays;
import java.util.Scanner;

public class insert {

	public static void main (String[]args ) {
	
		
		int n;  
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt(); 
		
		int[]array=new int[n];
		
				for(int i=0; i<n; i++)  
				{  
		          array[i]=sc.nextInt(); 
				}
		  
		  
	
		
		insert data=new insert();
		data.insert1(array);
		
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
	
	
	    void insert1(int []array ) {
		int sort=0;
		for(int j=1;j<array.length;j++) {
			 sort =array[j];
			  int i=j-1;
			 while(i>=0 && array[i]>sort) {
				 array[i+1]=array[i];
				 i=i-1;
			    
			 }
			 array[i+1]=sort;  
		}
		
	}
}



