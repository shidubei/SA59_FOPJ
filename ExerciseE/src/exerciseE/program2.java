package exerciseE;

public class program2 {
	public static void main(String[] args) {
		for(double i=0;i<=11;i++) {
			if(i==0) {
				System.out.println("NO     INVERSE     SQUARE ROOT     SQUARE");
			}else if(i==1) {
				System.out.println("_________________________________________");
			}else {
				System.out.printf("%.1f      %.3f        %.3f           %.1f\n",i-1,1/(i-1),Math.sqrt(i-1),(i-1)*(i-1));
			}
		}
	}
}
