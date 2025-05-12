package ACM;
import java.util.ArrayList;

public class removeDuplicates {

	public static void main(String[] args) {
		int[] arr = {0, 0, 3, 3, 5, 6};
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!arr2.contains(arr[i])) {
                arr2.add(arr[i]);
            }
        }

        System.out.println("New Array: " + arr2);
		
	}

}
