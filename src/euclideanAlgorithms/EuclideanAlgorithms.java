package euclideanAlgorithms;

public class EuclideanAlgorithms {

	public static void main(String[] args) {
		int a=12;
		int b=8;
		int r=0;
		
		do {
			r=a%b;
			a=b;
			b=r;			
		} while(r!=0);
		System.out.println(a);
//		System.out.printf("%d와 %d의 최대공약수는 %d입니다.%n",a,b,b);
	}

}
