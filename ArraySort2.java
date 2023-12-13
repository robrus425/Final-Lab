package ArraySort;

public class ArraySort2 {
	public void insertionSort(int[] arr) { // INSERTION SORT
		
		for (int i = 0; i < arr.length; i++) { // loop for insertion sort
			int k = arr[i]; // int k equals arr for int i 
			
			int j = i - 1; // int j
			
			while( (j >-1) && (arr[j]>k)) { ///Moves everything to the left
				arr[j + 1] = arr[j]; // sets arr for int j + 1 (insertion) equal it arr for int j
				j--; //subtracts value for int j
			}
			arr[j+1] = k; //sets ar for int j + 1 = to int k
			
		}
	        
	}

}
