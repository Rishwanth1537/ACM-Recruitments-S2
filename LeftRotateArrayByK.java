package ACM;
import java.util.Arrays;

public class LeftRotateArrayByK {
	static int[] solve(int[] arr, int n, int k) {
        int[] temp = new int[n];
        int index = 0;
        for (int i = k; i < n; i++) {
            temp[index++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            temp[index++] = arr[i];
        }
        return temp;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int k = 3;

        int[] result = solve(arr, n, k);
        System.out.println("Original Array: "+Arrays.toString(arr));

        System.out.println("Rotated Array : "+Arrays.toString(result));
        
	}

}
