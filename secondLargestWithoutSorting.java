package ACM;

public class secondLargestWithoutSorting {

	public static void main(String[] args) {
		int arr[] = {8, 8, 7, 6, 5};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
		if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found.");
        } else {
        	System.out.println("Largest: "+ largest);
            System.out.println("Second Largest: " + secondLargest);
        }
		
	}

}
