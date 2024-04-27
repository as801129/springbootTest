package com.crud;


public class ArrayQueueDemo {
	 public static void main(String[] args) {
	        int arr[] = {1, 8, 10, 89, 1000, 1234};
	        int index = binarySearch(arr, 0, arr.length - 1, 58);
	        System.out.printf("搜尋的數索引為: %d\n",index);
	        int index2 = binarySearch(arr, 0, arr.length - 1, 1000);
	        System.out.printf("搜尋的數索引為: %d\n",index2);
	        int index3 = binarySearch(arr, 0, arr.length - 1, 5); // 沒有找到
	        System.out.printf("搜尋的數索引為: %d\n",index3);
	    }

	    /**
	     * 
	     * @param arr 陣列
	     * @param left 左邊的索引
	     * @param right 右邊的索引
	     * @param findVal 要搜尋的值
	     * @return 如果找到就返回索引,如果沒找到就返回 -1
	     */
	    public static int binarySearch(int[] arr, int left, int right, int findVal) {
	        int mid = (left + right) / 2;
	        int midVal = arr[mid];
	        // 當 lfet > right 代表遞迴整個陣列但是沒有找到
	        if(left > right) {
	            return -1;
	        }

	        if(findVal > midVal) { // 向右遞迴
	            return binarySearch(arr, mid + 1, right, findVal);
	        } else if (findVal < midVal) {
	            return binarySearch(arr, left, mid - 1, findVal);
	        } else {
	            return mid;
	        }

	    }
}

