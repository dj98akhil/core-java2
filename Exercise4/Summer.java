package Exercise4;

public class Summer {

//	public void sum(int...sums) {
//		int sum=0;
//		for (int i = 0; i < sums.length; i++) {
//			sum+=sums[i];
//		}
//		System.out.println("Sum="+ sum);
//	}
	public void sum(int n,int...sums) {
		int sum=0;
		for (int i = 0; i < sums.length; i++) {
			sum+=sums[i];
		}
		System.out.println("Sum (int n)="+ sum);
	}
	public void sum(float n,int...sums) {
		int sum=0;
		for (int i = 0; i < sums.length; i++) {
			sum+=sums[i];
		}
		System.out.println("Sum (float n)="+ sum);
	}
}
