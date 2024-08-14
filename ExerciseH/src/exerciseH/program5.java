package exerciseH;

public class program5 {
	public static int[] ResizeArray(int[] arr,int newSize) {
		if(newSize<arr.length) {
			System.out.println("Error");
			return null;
		}
		int[] newArr = new int[newSize];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		return newArr;
	}
}
