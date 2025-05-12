package ACM;

public class largestElement {

	public static void main(String[] args) {
		int arr1[] = {3, 3, 6, 1};
		int arr2[] = {3, 3, 0, 99,-40};
		
		System.out.println("Largest Element in this array is: "+largestele(arr1));
		System.out.println("Largest Element in this array is: "+largestele(arr2));
	}
	static int largestele(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
		return max;
	}

}
