package ArraySort;

public class ArraySort3 {

	public void bubbleSort(int[] arr) {
	    boolean sorted = false;
	    int temp;
	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i+1]) {
	                temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	}

}
