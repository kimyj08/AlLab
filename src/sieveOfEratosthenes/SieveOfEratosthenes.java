package sieveOfEratosthenes;

import java.util.Arrays;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		int[] arr=new int[101];  // 0으로 초기화
		
//		Arrays.fill(arr, 1);  // 생성할 배열 안에 전부 지정한 수로 채움.
		
		int i=2;
		int k=2;
		int j=2;
		
		while(k*k<arr.length-1) {
			if(arr[k]==0) {
				while(i<=(arr.length-1)/k) {
					arr[k*i]=1;
					i++;
				}
			} k++;
		}
		while(j<arr.length) {
			if(arr[j]==0) {
				System.out.print(j+" ");
			} j++;
		}
	}
}
