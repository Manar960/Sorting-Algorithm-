package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class in {

public static void main (String[]args ) {
	
		
		int n;  
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt(); 
		
		int[]array=new int[n];
		
				for(int i=0; i<n; i++)  
				{  
		          array[i]=sc.nextInt(); 
				}
		
     		bucket(array);
		
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
	
	



public static void bucket(int[] array)
{
	int max=max(array);
	int min =min(array);
	int r=max-min;
	  int num = max - min + 1;
	    List<List<Integer>> buckets = new ArrayList<>(num);
	    
	    for (int i = 0; i < num; ++i) {
	      buckets.add(new ArrayList<>());
	    }
	    /* store elements to buckets */
	    for (int value : array) {
	      int hash = hash(value, min, num);
	      buckets.get(hash).add(value);
	    }
	    /* sort individual bucket */
	    for (List<Integer> bucket : buckets) {
	      Collections.sort(bucket);
	    }
	    /* concatenate buckets to origin array */
	    int index = 0;
	    for (List<Integer> bucket : buckets) {
	      for (int value : bucket) {
	        array[index++] = value;
	      }
	    }
	  }

	  private static int hash(int elem, int min, int num) {
	    return (elem - min) / num;
	  }

public static int max( int arr[])
{
	
	int  max=arr[0];
	for (int d = 0; d < arr.length; d++) {
	if (arr[d] > max)
	max = arr[d];
	}
	return max;
	

}

public static int min( int arr[])
{
	
	int min=arr[0];
	for (int d = 0; d < arr.length; d++) {
	if (arr[d] < min)
	min = arr[d];
	}
	return min;
	

}

private static void insert1(List<Integer> bucket) {
	  int sort=0;
	  for(int j=1;j<bucket.size();j++) {
	  	 sort =bucket.get(j);
	  	  int i=j-1;
	  	 while(i>=0 && bucket.get(i)>sort) {
	  		bucket.add(i+1, bucket.get(i));
	  		 i=i-1;
	  	    
	  	 }
	  	bucket.add(i+1, sort);  
	  }


}
}
