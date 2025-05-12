package ACM;

public class Sortarray {
	static boolean arraysort(int arr[], int n) {
		for (int i = 1; i<n; i++) {
			if (arr[i]<arr[i-1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,6,4,5}, n=5;
		System.out.println(arraysort(arr,n));
	}
	

}
