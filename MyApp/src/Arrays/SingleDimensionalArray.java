package Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 12;
		a[1] = 23;
		a[2] = 222;
		a[3] = 343;
		a[4] = 44;
		// Or //

		int age[] = { 12, 3, 444, 5, 4 };

		System.out.println(age.length);
		for (int i=0;i<= age.length-1;i++) {

			System.out.println(age[i]); // Passing the index value 'i'//
		}

		/*
		 * Reading values using enhanced for loops For data structure we use this for
		 * loop.
		 */
		int h[] = {23,4 };

		System.out.println(h.length);

		for (int i:h) {
			System.out.println(i);
		}
	}

}
