package exerciseH;

public class program6 {
	public static boolean isPrime(int n) {
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		for(int i=5;i<=1000;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
