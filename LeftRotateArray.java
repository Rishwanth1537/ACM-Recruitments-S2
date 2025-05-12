package ACM;
import java.util.Arrays;

public class LeftRotateArray {
	static void Solve(int arr[], int n) {
		int temp [] = new int[n];
		for (int i = 1; i<n; i++) {
			temp[i-1] = arr[i];
		}
		temp[n-1] = arr[0];
		System.out.println("Original:"+Arrays.toString(arr));
		System.out.println("New one:"+Arrays.toString(temp));
		System.out.println("--------------------------");
		}
	
	public static void main(String[] args) {
		int arr1[] = {-1, 0, 3, 6};
		int n = arr1.length;
		int arr2[] = {1,2,3,4,5};
		int m = arr2.length;
		Solve(arr1,n);
		Solve(arr2,m);
	}

}
