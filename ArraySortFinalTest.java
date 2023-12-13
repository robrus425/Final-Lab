package ArraySort;

import java.util.Random;

public class ArraySortFinalTest {
	 public static void main(String[] args) {
	        ArraySort1 test1 = new ArraySort1();
	        ArraySort2 test2 = new ArraySort2();
	        ArraySort3 test3 = new ArraySort3();
	        ArraySort4 test4 = new ArraySort4();
	        ArraySort5 test5 = new ArraySort5();
	        ArraySort6 test6 = new ArraySort6();
	       
	        
		 int[] sizes = {10000, 50000, 100000, 150000, 200000};
		 System.out.println("SELECTION SORT");
	        for (int size : sizes) {
	            int[] arr = generateArray(size);	            
	            
	            double start1 = System.currentTimeMillis();
	           
	            test1.selectionSort(arr);
	            double stop1 = System.currentTimeMillis();	            
	            System.out.println("Size: " + size + ", Time: " + (stop1 - start1) + " ms");
	        }
	     System.out.println("INSERTION SORT");
	        for (int size : sizes) {
	            int[] arr = generateArray(size);	            
	         
	            double start2 = System.currentTimeMillis();
	           
	            test2.insertionSort(arr);
	            double stop2 = System.currentTimeMillis();	            
	            System.out.println("Size: " + size + ", Time: " + (stop2 - start2) + " ms");
	        }
	     System.out.println("BUBBLE SORT");
	     	for (int size : sizes) {
	            int[] arr = generateArray(size);	            
	       
	            double start3 = System.currentTimeMillis();
	      
	            test3.bubbleSort(arr);
	            double stop3 = System.currentTimeMillis();	            
	            System.out.println("Size: " + size + ", Time: " + (stop3 - start3) + " ms");          
	     	}
	     System.out.println("SHELL SORT");
	     	for (int size : sizes) {
	            int[] arr = generateArray(size);	            
	            
	            double start4 = System.currentTimeMillis();
	           
	            test4.shellSort(arr);
	            double stop4 = System.currentTimeMillis();	            
	            System.out.println("Size: " + size + ", Time: " + (stop4 - start4) + " ms");          
	     	}
	     System.out.println("QUICK SORT");
	     	for (int size : sizes) {
	            int[] arr = generateArray(size);	            
	           
	            double start5 = System.currentTimeMillis();
	        
	            test5.quickSort(arr, 0, arr.length - 1);
	            double stop5 = System.currentTimeMillis();	            
	            System.out.println("Size: " + size + ", Time: " + (stop5 - start5) + " ms");          
	     	}
	     System.out.println("MERGE SORT");
	     for (int size : sizes) {
	            int[] arr = generateArray(size);	            
	
	            double start6 = System.currentTimeMillis();
	      
	            test6.mergeSort(arr, arr.length);
	            double stop6 = System.currentTimeMillis();	            
	            System.out.println("Size: " + size + ", Time: " + (stop6 - start6) + " ms"); 
	     }
	     
	 }

	private static int[] generateArray(int size) {
		 int[] arr = new int[size];
	        Random random = new Random();
	        for (int i = 0; i < size; i++) {
	            arr[i] = random.nextInt(200000); 
	        }
	        return arr;
	    }
	}
	



