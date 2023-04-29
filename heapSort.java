package AlgFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class heapSort {

	public static void main(String[] args) throws IOException {

        String fileName = "result.txt"; 							//call for result file
        BufferedWriter out = new BufferedWriter( 
                      new FileWriter(fileName));
        
		for(int p = 1; p < 31; p++){ 					
		final long startTime = System.currentTimeMillis();
	    Scanner s = new Scanner(new File("smallListrandom"+p));		// had many issues getting code to read the files so I used  not sure if was allowed to for non algorithm code 
	   																//https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
	    															//I used this for all scanner of file
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    while (s.hasNext()){
	        if(s.hasNextInt()){
	            list.add(s.nextInt());
	        }
	    }
	    s.close();
	   // System.out.println(list);
	    
	    int[] array1 = list.stream().mapToInt(i -> i).toArray();	//had to convert array list to array to read file correctly for some reason used this website for snippit https://www.geeksforgeeks.org/stream-maptoint-java-examples/

		int[] sortedNum1= new int[array1.length];
		int newValue1=0;
	   /* for (int l=0; l<array.length; l++) { 
	        
	    	System.out.println(array[l] + " "); 

			}
		*/

		
		
		
		for(int i=array1.length; i>0; i--)							//
		{
		newValue1 = buildmaxheap(array1,i-1);
		sortedNum1[i-1] = newValue1;
		
		}
		newValue1 = buildmaxheap(array1,0);
		sortedNum1[0] = newValue1;
		
		final long endTime1 = System.currentTimeMillis();
		//System.out.println((endTime1 - startTime));
        BufferedWriter out1 = new BufferedWriter( 
                new FileWriter(fileName, true)); 
         out1.write("Total execution time for Heap Sort small list" + p + ": "+ (endTime1 - startTime) + "\n\n");
         out1.close();
   
	    
	    
	    
	    
	    
	    
		final long startTime2 = System.currentTimeMillis();
	    Scanner t = new Scanner(new File("mediumListrandom"+p));
	    ArrayList<Integer> list2 = new ArrayList<Integer>();
	    while (t.hasNext()){
	        if(t.hasNextInt()){
	            list2.add(t.nextInt());
	        }
	    }
	    t.close();
	   // System.out.println(list);
	    
	    int[] array2 = list2.stream().mapToInt(i -> i).toArray();

		int[] sortedNum2= new int[array2.length];
		int newValue2=0;
	   /* for (int l=0; l<array.length; l++) { 
	        
	    	System.out.println(array[l] + " "); 

			}
		*/
		
		for(int h=array1.length; h>0; h--)
		{
		newValue2 = buildmaxheap(array2,h-1);
		sortedNum2[h-1] = newValue2;
		
		}
		newValue2 = buildmaxheap(array2,0);
		sortedNum2[0] = newValue2;
		
	    //for (int m=0; m<array2.length; m++) { 
	        
	    	//System.out.println(sortedNum1[m] + " "); 

		//	}
	    
		final long endTime2 = System.currentTimeMillis();
		//System.out.println((endTime2 - startTime2));
        BufferedWriter out11 = new BufferedWriter( 
                new FileWriter(fileName, true)); 
         out11.write("Total execution time for Heap Sort medium list" + p + ": "+ (endTime2 - startTime) + "\n\n");
         out11.close();
	    
	    
	    
	    
	    
		final long startTime3 = System.currentTimeMillis();
	    Scanner g = new Scanner(new File("largeListrandom"+p));
	    ArrayList<Integer> list3 = new ArrayList<Integer>();
	    while (g.hasNext()){
	        if(g.hasNextInt()){
	            list3.add(g.nextInt());
	        }
	    }
	    g.close();
	   // System.out.println(list);
	    
	    int[] array3 = list.stream().mapToInt(i -> i).toArray();

		int[] sortedNum3= new int[array3.length];
		int newValue3=0;
	   /* for (int l=0; l<array.length; l++) { 
	        
	    	System.out.println(array[l] + " "); 

			}
		*/

		
		
		
		for(int b=array3.length; b>0; b--)
		{
		newValue3 = buildmaxheap(array3,b-1);
		sortedNum3[b-1] = newValue3;
		
		}
		newValue3 = buildmaxheap(array1,0);
		sortedNum3[0] = newValue3;
		final long endTime3 = System.currentTimeMillis();
		//System.out.println((endTime3 - startTime3));
        BufferedWriter out111 = new BufferedWriter( 
                new FileWriter(fileName, true)); 
         out111.write("Total execution time for Heap Sort large list" + p + ": "+ (endTime3 - startTime) + "\n\n");
         out111.close();
	 //  for (int c=0; c<array3.length; c++) { 
	        
	    //	System.out.println(sortedNum3[c] + " "); 

		//	}
	    
	    
	    /*

		int[] array1rev = new int[array1.length];
		int[] array2rev = new int[array2.length];
		int[] array3rev = new int[array3.length];
		
		int length1 = array1.length;
		int length2 = array2.length;
		int length3 = array3.length;
		
		for(int ar=0; ar <array1rev.length;ar++)
		{

			array1rev[ar] = array1[length1-1];
			length1=length1-1;
			

		}
		for(int er=0; er<array1rev.length;er++)
		{

			array2rev[er] = array2[length2-1];
			length2=length2-1;
		}
		for(int tr=0; tr<array1rev.length;tr++)
		{

			array3rev[tr] = array3[length3-1];
			length3=length3-1;

		}
	    

	    
		FileWriter qw = new FileWriter("smallListsorted"+p);
		FileWriter er= new FileWriter("mediumListsorted"+p);
		FileWriter ty = new FileWriter("largeListsorted"+p);
		FileWriter yu = new FileWriter("smallListrevsorted"+p);
		FileWriter io= new FileWriter("mediumListrevsorted"+p);
		FileWriter op = new FileWriter("largeListrevsorted"+p);	
		
		
		int f;
		int d;
		int z;
		

			for(int k=0; k < array1.length; k++) {
				f = array1[k];
					  qw.write(f+" ");
		
		}
		
			for(int o=0; o < array2.length; o++) {
				d = array2[o];
					  er.write(d+" ");

			}
				for(int u=0; u < array3.length; u++) {
					z = array3[u];
						  ty.write(z+" ");
						  
				}
				
				
		int b;
		int v;
		int w;
		
		for(int uy=0; uy < array1rev.length; uy++) {
			b = array1rev[uy];
				  yu.write(b+" ");
	
	}
		for(int ip=0; ip < array2rev.length; ip++) {
			v = array2rev[ip];
				  io.write(v+" ");
	
	}
		for(int vc=0; vc < array3rev.length; vc++) {
			w = array3rev[vc];
				  op.write(w+" ");
	
	}
		
		
		
		
		
		
		*/
		


		
		
		
		
		
		
		

		}

	}

	private static int buildmaxheap(int[] array, int length) {

		
		int highestValue=0;
		int highestValuePos=0;
		int temp =0;

		int[] finishedArray = new int[10];
		
		
		if(length > 0) {
		for(int i=0; i < length; i++)
		{
			if(array[i] >= highestValue)
				{highestValue= array[i];
				highestValuePos = i;
				//System.out.print("highest= "+highestValue+" ");
				} 
		}
		//System.out.print(" |found value| ");
		temp = array[highestValuePos];
		array[highestValuePos]= array[0];
		array[0] = temp;
		

		temp = array[0]; 
		array[0]= array[length];
		array[length] = temp;	

	    return highestValue;

	}
		else
		{

			return array[0];
		}
	}

}
