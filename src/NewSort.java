
public class NewSort {

	static void sort(int arr[]) {
		int size = arr.length;
		
		for(int i=0; i<size; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] =arr[j];
				j -= 1;
			}
			arr[j+1] = key;
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
