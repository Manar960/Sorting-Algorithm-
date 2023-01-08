package algo;

import java.util.Scanner;

public class heap {

	
public static void main (String[]args ) {
	
		
		int n;  
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt(); 
		
		int[]array=new int[n];
		
				for(int i=0; i<n; i++)  
				{  
		          array[i]=sc.nextInt(); 
				}
		  
				heap data=new heap();
		        data.sort(array,n);
		
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

 public void heapify(int array[], int size, int i) {
    
    int root = i;
    int left = 2 * i ;
    int right = 2 * i + 1;

    if (left < size && array[left] > array[root])
  	  root = left;

    if (right < size && array[right] > array[root])
  	  root = right;

    if (root != i) {
      int swap = array[i];
      array[i] = array[root];
      array[root] = swap;

      heapify(array, size, root);
    }
  }

    public void sort(int arrar[],int size) {
     
      for (int i = (size / 2)-1 ; i >=0; i--) {
        heapify(arrar, size, i);
      }
      for (int i = size - 1; i >= 0; i--) {
        int swap = arrar[0];
        arrar[0] = arrar[i];
        arrar[i] = swap;
        heapify(arrar, i, 0);
      }
    }
  


	
	
	
}
