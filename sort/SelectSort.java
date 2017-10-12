/**
 * 简单选择排序
 * 如下代码，无论数组原始排列如何，比较次数是不变的；对于交换操作，在最好情况下也就是数组完全有序的时候，
 * 无需任何交换移动，在最差情况下，也就是数组倒序的时候，交换次数为n-1次。综合下来，时间复杂度为  O(n²)。
 */
public class SelectSort {
	
	public static void main(String[] args) {
		selectSort();
	}
	
	public static void selectSort(){
		int[] a = { 7, 48, 89, 14, 5, 2, 14, 75, 65 };
		for (int i = 0; i < a.length; i++) {
			int min = i; // 每一趟循环比较时，min 用于存放较小元素的数组下标，这样当前批次比较完毕最终存放的就是此趟内最小的元素的下标，避免每次遇到较小元素都要进行交换。
			for(int j=i+1;j< a.length;j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			if(min != i){ // 交换位置
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		for (int num : a) { // 输出
			System.out.println(num);
		}
	}

}
