
public class qSort {

	public static void quickSort(Integer[] z) {
		quickSort(z, 0, z.length - 1);
		for (int y = 1; y < z.length + 1; y++) {
			System.out.println(y + ". " + z[y - 1]);
			//System.out.println(x[y - 1]);
		}
	}
	public static void quickSort(Integer a[], int left, int right) {
		if (left >= right)
			return;
		int k = left;
		int j = right;
		int pivotValue =  a[(left + right) / 2].intValue();
		while (k < j) {
			while (a[k] < pivotValue) {
				k++;
			}

			while (pivotValue < a[j]) {
				j--;
			}
			if (k <= j) {
				int temp = a[k];
				a[k] = a[j];
				a[j] = temp;
				k++;
				j--;
			}
		}
		quickSort(a, left, j);
		quickSort(a, k, right);
	}
}
