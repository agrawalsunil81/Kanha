package array.rotaion;

/**
 * 
 * @author Sunil Input-- 1,2,3,4,5,6,7 Output--3,4,5,6,7,1,2
 */
public class ArrayRotaion {

	public static void main(String[] args) {
		ArrayRotaion arrayRotaion = new ArrayRotaion();
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		arrayRotaion.printArray(arr);
		arrayRotaion.rotateArray(arr, 3);
		System.out.println();
		arrayRotaion.printArray(arr);
	}

	private void rotateArray(Integer[] arr, int i) {
		Integer temp = 0;
		int j2 = 0;
		for (int j = 0; j < i; j++) {
			temp = arr[0];
			for (j2 = 0; j2 < arr.length - 1; j2++) {
				arr[j2] = arr[j2 + 1];
			}
			arr[j2] = temp;
		}

	}

	private void printArray(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
