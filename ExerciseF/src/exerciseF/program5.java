package exerciseF;

public class program5 {
	public static void main(String[] args) {
		String[] names = {"John","Venkat","Mary","Victor","Betty"};
		int[] marks= {63,29,75,82,55};
		System.out.println("Sorted by marks:");
		for(int i=0;i<marks.length;i++) {
			for(int j=1;j<marks.length-i;j++) {
				if(marks[j-1]<marks[j]) {
					int temp=marks[j-1];
					marks[j-1]=marks[j];
					marks[j]=temp;
					String temp2 = names[j-1];
					names[j-1]=names[j];
					names[j]=temp2;
				}
			}
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println(names[i]+" "+marks[i]);
		}
		System.out.println("---------------");
		System.out.println("Sorted by names");
		for(int i=0;i<names.length;i++) {
			for(int j=1;j<names.length-i;j++) {
				if(names[j-1].compareTo(names[j])>0) {
					int temp=marks[j-1];
					marks[j-1]=marks[j];
					marks[j]=temp;
					String temp2 = names[j-1];
					names[j-1]=names[j];
					names[j]=temp2;
				}
			}
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println(names[i]+" "+marks[i]);
		}
	}
}
