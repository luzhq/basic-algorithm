public class BubbleSort {

	/**
	 * 冒泡排序 
	 * 如下代码，若原数组本身就是有序的（这是最好情况），仅需n-1次比较就可完成；若是倒序，比较次数为 n-1+n-2+...+1=n(n-1)/2，交换次数和比较次数等值。故其时间复杂度依然为 O(n²)。
	 * 
	 */
	public void bubbleSort() {

		int[] a = { 7, 48, 89, 14, 5, 2, 14, 75, 65 };

		for (int i = 0; i < a.length; i++) {
			boolean notChange = true; // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已然完成。
			for (int j = 0; j < a.length - 1 - i; j++) {
				// 交换位置
				if (a[j] > a[j + 1]) {
					Integer temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					notChange = false;
				}
			}
			if (notChange) {
				break;
			}
		}
		
		for (int num : a) { // 输出
			System.out.println(num);
		}
	}
}
