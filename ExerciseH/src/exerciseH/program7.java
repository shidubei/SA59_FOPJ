package exerciseH;

public class program7 {
	public static int[][] MatrixMultiply(int[][] A,int[][] B){
		int[][] res=new int[A.length][B[0].length];
		
		if(A[0].length!=B.length) {
			System.out.println("Can not calculate!");
			return null;
		}else {
			for(int i=0;i<A.length;i++) {
				for(int j=0;j<B[0].length;j++) {
					for(int k=0;k<A[0].length;k++) {
						res[i][j]+=A[i][k]*B[k][j];
					}
				}
			}
			return res;
		}
	}
	public static void main(String[] args) {
		int[][] A= {{1,2},{2,3},{3,4}};
		int[][] B = {{1,2,3},{1,2,3}};
		int[][] res = MatrixMultiply(A,B);
		for(int i=0;i<res.length;i++) {
			System.out.println();
			for(int j=0;j<res[0].length;j++) {
				System.out.print(res[i][j]+" ");
			}
		}
	}
}
