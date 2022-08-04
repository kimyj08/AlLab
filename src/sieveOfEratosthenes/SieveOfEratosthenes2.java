package sieveOfEratosthenes;

import java.util.Arrays;

public class SieveOfEratosthenes2 {

	public static void main(String[] args) {
		int[] arr=new int[101];  // 0으로 초기화
		
//		Arrays.fill(arr, 1);  // 생성할 배열 안에 전부 지정한 수로 채움.
		
		int k=2;
		int j=2;
		
		while(k*k<arr.length-1) {
			if(arr[k]==0) {
				int i=2;
					while(i<=(arr.length-1)/k) {
						arr[k*i]=1;
						i++;
					}
			} k++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("a : ");
		while(j<arr.length) {
			if(arr[j]==0) {
				System.out.print(j+" ");
			} j++;
		}
		System.out.println();
		System.out.print("b : ");
		for(int h=2;h<arr.length;h++) {
			if(arr[h]==0) {
				System.out.print(h+" ");
			}
		}
	}
}
