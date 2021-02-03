
public class BubbleSort {
	
	static void sort(int arr[]) {
		int size = arr.length;
		int temp;
		
		for(int i=0; i<size; i++) {
			for(int j=1; j<(size-i); j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50,3,67,8,12,15,1};
		
		System.out.print("Array before sorting: ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		sort(arr);
		
		System.out.print("\nArray after sorting: ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
