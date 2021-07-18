import java.util.Arrays;

public class R21 {
	public static void main(String[] args) {
		int [] arr1 = {1, 2, 3, 4, 5};
		int [] arr2 = {1, 2, 3, 4, 5};
		int [] arr3 = arr1;
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println("---------");
		
		arr1[2] = 6;
		System.out.println(arr1[2]);
		System.out.println(arr2[2]);
		System.out.println(arr3[2]);
		System.out.println("---------");
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
