package ArraySort;

public class ArraySort1 {
	public void selectionSort(int[] arr){  //Selection Sort
	
        for (int i = 0; i < arr.length - 1; i++)  // For Loop for the selection sort
        {  
            int temp = i;  //Creates temp int equal to int i (0)
            for (int j = i + 1; j < arr.length; j++){  // int j = int 1 + 1 (so 1). Puts in loop
            	if (arr[j] < arr[temp]){  //if arr of int j is less that arr of int temp
                    temp = j; //then int temp equals int j (1)
                }  
            }  
            int smallerNumber = arr[temp];   // int smaller number = arr for int temp
            arr[temp] = arr[i];  // arr for int temp (0) is equal arr for int i (0)
            arr[i] = smallerNumber;  // arr for int i equalls smaller number.
        }  
        
    }
}
