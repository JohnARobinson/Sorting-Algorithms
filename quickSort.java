package AlgFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class quickSort {

	public static void main(String[] args) throws IOException {
		
	    try(FileWriter fw = new FileWriter("result.txt", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw))
	    {
		for(int p = 1; p < 31; p++){ 
		final long startTime = System.currentTimeMillis();
		
	    Scanner sc = new Scanner(new File("smallListrandom"+p));
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    while (sc.hasNext()){
	        if(sc.hasNextInt()){
	            list.add(sc.nextInt());
	        }
	    }
	    sc.close();
	   // System.out.println(list);
	    int[] array = list.stream().mapToInt(i -> i).toArray();
	    
	    quicksort(array,0,array.length-1);
	    
	    final long endTime1 = System.currentTimeMillis();
	    

	    out.println("Total execution time for quicksort sort small list" + p + ": "+ (endTime1 - startTime)+"\n");
		
	    
	    
	    
	    
	    final long startTime2 = System.currentTimeMillis();
	    Scanner sv = new Scanner(new File("mediumListrandom"+p));
	    ArrayList<Integer> list2 = new ArrayList<Integer>();
	    while (sv.hasNext()){
	        if(sv.hasNextInt()){
	            list2.add(sv.nextInt());
	        }
	    }
	    sc.close();
	    int[] array2 = list.stream().mapToInt(i -> i).toArray();
	    
	    quicksort(array2,0,array2.length-1);
	    
	    
	    final long endTime2 = System.currentTimeMillis();
	    

	    out.println("Total execution time for quicksort sort medium list" + p + ": "+ (endTime2 - startTime2)+"\n");
	    
	    
	    
	    
	    
	    final long startTime3 = System.currentTimeMillis();
	    Scanner sb = new Scanner(new File("largeListrandom"+p));
	    ArrayList<Integer> list3 = new ArrayList<Integer>();
	    while (sb.hasNext()){
	        if(sb.hasNextInt()){
	            list3.add(sb.nextInt());
	        }
	    }
	    sc.close();
	    int[] array3 = list.stream().mapToInt(i -> i).toArray();
	    
	    quicksort(array3,0,array3.length-1);
	    
	    
	    final long endTime3 = System.currentTimeMillis();
	    

	    out.println("Total execution time for quicksort sort large list" + p + ": "+ (endTime3 - startTime3)+"\n"); 


		}	

		}
		
	}

	public static void quicksort(int[] array,int start,int end) {
		int pivot =0;
		if(start < end)
		{
			pivot = partition(array,start,end);
			quicksort(array,start,pivot);
			quicksort(array,pivot+1,end);
		}

	}

	private static int partition(int[] array, int start, int end) {
			
		int startvalue =array[start];
		int middlevalue =array[start+(end-start)/2];
		int endvalue =array[end];
		
		int pivot = 0;
				
			      if ((startvalue < middlevalue && middlevalue < endvalue) || (endvalue < middlevalue && middlevalue < startvalue)) 
			            {pivot = start+(end-start)/2; 
			  
			            }
			        else if ((middlevalue < startvalue && startvalue < endvalue) || (endvalue < startvalue && startvalue < middlevalue)) 
			        	{pivot= start; 
			        	}
			        else {
			        pivot = end;
			        }
			      
			      int i = start;
			      int temp;
			      for(int j=start; j<end-1; j++)
			      {
			    	  if(array[j] < array[pivot])
			    	  {
			    		  temp = array[j];
			    		  array[j] = array[i];
			    		  array[i] = temp;
			    		  i = i + 1;
			    	  }
			      }
	    		  temp = array[end];
	    		  array[end] = array[i];
	    		  array[i] = temp;
			    

		return i;
	}
}
