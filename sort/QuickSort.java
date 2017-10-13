/**
 *  快排 
 * （1）在数据集之中，选择一个元素作为"基准"（pivot）。
 * （2）所有小于"基准"的元素，都移到"基准"的左边；所有大于"基准"的元素，都移到"基准"的右边。
 * （3）对"基准"左边和右边的两个子集，不断重复第一步和第二步，直到所有子集只剩下一个元素为止。（可递归调用）
 *  
 *  
 *  时间复杂度为 O(N*logN)，效率较高，使用广泛。
 *  
 *  为更容易理解，可想成  挖坑填数+分治法：（参考：http://www.cnblogs.com/morewindows/archive/2011/08/13/2137415.html）
 * （1）i =L; j = R; 将基准数挖出形成第一个坑a[i]。
 * （2）j--由后向前找比它小的数，找到后挖出此数填前一个坑a[i]中。
 * （3）i++由前向后找比它大的数，找到后也挖出此数填到前一个坑a[j]中。
 * （4）再重复执行2，3二步，直到i==j，将基准数填入a[i]中。
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 7, 48, 89, 14, 5, 2, 14, 75, 65, 23, 24, 15 };
		quickSort(a, 0, 11);
		for (int num : a) { // 输出
			System.out.println(num);
		}
	}

	public static void quickSort(int[] a, int left, int right) {

		if (left < right) {

			int i = left, j = right, x = a[left];
			while (i < j) {
				while (i < j && a[j] >= x) // 从右向左找第一个小于x的数
					j--;
				if (i < j)
					a[i++] = a[j];

				while (i < j && a[i] < x) // 从左向右找第一个大于等于x的数
					i++;
				if (i < j)
					a[j--] = a[i];

			}
			a[i] = x;
			if (i - left > 1) {
				quickSort(a, left, i - 1); // 递归调用
			}
			if (right - i > 1) {
				quickSort(a, i + 1, right); // 递归调用
			}

		}
	}
}
