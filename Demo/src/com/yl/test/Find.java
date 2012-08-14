package com.yl.test;

public class Find {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(binarySerch(12));
	}

	private static int binarySerch(int tag) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int begin = 0;
		int end = arr.length - 1;
		while(begin<=end){
			int mid = (begin + end) / 2;
			if(tag>arr[mid]){
				begin = mid + 1;
			}else if(tag<arr[mid]){
				end = mid - 1;
			}else {
				return tag;
			}
		}
		return -1;
	}
}
