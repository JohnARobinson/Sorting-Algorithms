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
import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
	
	public static void main(String[] args) throws FileNotFoundException{
		/*some sort of code problem causing huge wait times compared to other two alg*/
		try(FileWriter wf = new FileWriter("result.txt", true);
	    BufferedWriter fg = new BufferedWriter(wf);
		PrintWriter out2 = new PrintWriter(fg))			//had to use append using print writer from for merge and quicksort https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html
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
		

	    int[] array1 = list.stream().mapToInt(i -> i).toArray();
		mergesort(array1,0,(array1.length)-1);
		
		final long endTime1 = System.currentTimeMillis();

		out2.println("Total execution time for merge sort small list" + p + ": "+ (endTime1 - startTime));


	
		final long startTime2 = System.currentTimeMillis();
	    Scanner qw = new Scanner(new File("mediumListrandom"+p));
	    ArrayList<Integer> list2 = new ArrayList<Integer>();
	    while (qw.hasNext()){
	        if(qw.hasNextInt()){
	            list2.add(qw.nextInt());
	        }
	    }
	    qw.close();
		

	    int[] array2 = list2.stream().mapToInt(i -> i).toArray();

		mergesort(array2,0,(array2.length)-1);	
		final long endTime2 = System.currentTimeMillis();

		//System.out.println((endTime2 - startTime2));
		out2.println("Total execution time for merge sort medium list" + p + ": "+ (endTime2 - startTime2));
		
		
		
		
		final long startTime3 = System.currentTimeMillis();
	    Scanner op = new Scanner(new File("largeListrandom"+p));
	    ArrayList<Integer> list3 = new ArrayList<Integer>();
	    while (op.hasNext()){
	        if(op.hasNextInt()){
	            list3.add(op.nextInt());
	        }
	    }
	    op.close();
		

	    int[] array3 = list3.stream().mapToInt(i -> i).toArray();

		mergesort(array3,0,(array3.length)-1);	
		
		final long endTime3 = System.currentTimeMillis();
		//System.out.println((endTime3 - startTime3));
		out2.println("Total execution time for merge sort large list" + p + ": "+ (endTime3 - startTime3));



			}
			

	
	private static void merge(int array[], int start, int middle, int end) {
		
		

		int i=start;
		int j=middle+1;
		int k=start;
		int secondarray[] = new int[array.length];
		
		while(i<=middle && j <=end)
		{
			if(array[i] <= array[j])
			{
				secondarray[k] = array[i];
				i++;
			}
			else
			{
				secondarray[k] =array[j];
				j++;
				
			}
			k++;
			
		}
		if(i>middle)
		{
			while(j<=end)
			{
				secondarray[k] = array[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=middle)
			{
				secondarray[k] = array[i];
				i++;
				k++;
			}
		}
		
			for(int l = start; l <= end; l++)
				{
					array[l] = secondarray[l];
				}

	}
	static void mergesort(int array[], int start, int end) {
		int middle = 0;
		
		
		if(end-start <= 1)
		{ 
			return;
		}
			
			middle = (start+end)/2;

			mergesort(array,start,middle);
			mergesort(array,middle+1,end);
			merge(array,start,middle,end);

		

		
		
		
	}




	
	
}
