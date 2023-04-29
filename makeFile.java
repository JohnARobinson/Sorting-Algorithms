package AlgFinal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;
import java.io.FileOutputStream;

public class makeFile {

	public static void main( String[] args ) throws IOException{
		
		int upper10 = 10000;
		int lower10 = 0;
		int storagearray10[] = new int [10000];
		
		int upper100 = 100000;
		int lower100 = 0;
		int storagearray100[] = new int [100000];
		
		int upper1000 = 1000000;
		int lower1000 = 0;
		int storagearray1000[] = new int [1000000];
		
		
		FileWriter kl = new FileWriter("result");
		
		
		for(int p = 1; p < 31; p++){ 
		FileWriter qw = new FileWriter("smallListrandom"+p);
		FileWriter er= new FileWriter("mediumListrandom"+p);
		FileWriter ty = new FileWriter("largeListrandom"+p);
		int x;
		int y;
		int z;
		
		
		for(int i=0; i < storagearray10.length; i++) {
			storagearray10[i] = (int) (Math.random() * (upper10 - lower10)) + lower10;
		}
			for(int k=0; k < storagearray10.length; k++) {
				x = storagearray10[k];
					  qw.write(x+" ");
		
		}
		
		for(int g=0; g < storagearray100.length; g++) {
			storagearray100[g] = (int) (Math.random() * (upper100 - lower100)) + lower100;
		}
			for(int o=0; o < storagearray100.length; o++) {
				y = storagearray100[o];
					  er.write(y+" ");

			}
			for(int u=0; u < storagearray1000.length; u++) {
				storagearray1000[u] = (int) (Math.random() * (upper1000 - lower1000)) + lower1000;
			}
				for(int r=0; r < storagearray1000.length; r++) {
					z = storagearray1000[r];
						  ty.write(z+" ");
						  
				}
		
	
		
		
		
		
	/*	
		for(int i=0; i < 10000; i++) {
		x = (int)(Math.random()*((10000-0)));
			  qw.write(x+" \n");

		}

		for(int i=0; i < 100000; i++) {
		y = (int)(Math.random()*((10000-0)+1))+0;
			  er.write(y+" ");

		}
		
		for(int i=0; i < 1000000; i++) {
		z = (int)(Math.random()*((10000-0)+1))+0;
			  ty.write(z+" ");
     
		}
		

		*/
		 		
		}
		

			
		
		
		
		
	}

}