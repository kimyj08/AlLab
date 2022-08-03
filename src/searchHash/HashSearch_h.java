package searchHash;

public class HashSearch_h {

	public static void main(String[] args) {
			
		int[] arrD = {12, 25, 36, 20, 30, 8, 42};
		int[] arrH = new int[11];
		
		int i =0;
		
		for(i=0;i<arrD.length;i++) {
			int k = arrD[i] % 11;
      
		while(true){
				if(arrH[k]!= 0) {
				k = (k+1) % 11;
			}else{arrH[k]=arrD[i];
           break;}
	    }
		}
for(int x=0;x<arrH.length;x++){    
    System.out.println(arrH[x]);
		}
	}
}
