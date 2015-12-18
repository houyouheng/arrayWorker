import java.util.Arrays;
class arrayWorker {	
	//sort an array in ascending order
	public static int[] sort(int[] array) {
	  	int tempNumber = 0;
	  	for (int i = 0; i < array.length; i++){//loop over the array
	  		for(int j = i + 1; j < array.length; j++){//loop over the value next the value in the last loop
	  			//The actual sorting
	  			if(array[j] < array[i]){//if the second value is smaller than the first value
	  				tempNumber = array[j];
	  				array[j] = array[i];//first value is replaced by the second
	  				array[i] = tempNumber;
	  			}
	  		}
	  	}
	return array;
	}
	//returns the index of target in arr if it exists,
	// returns -1 otherwise
	public static void search(int[] arr, int target) {
	}
	public static void main(String[] args) {
	  	int [] array = {69,2,700,14000,80,19,-138,-4};
		sort(array);
		System.out.print(Arrays.toString(array));
	}
}
