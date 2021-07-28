import java.util.Scanner;

public class hap_11441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int[n+1];
		long [] sum = new long [n+1];
		sum[0]=0;
		for(int i=1; i<=n; i++) {
			ar[i]=sc.nextInt();
			sum[i] = sum[i-1] + ar[i];
		}
		int m=sc.nextInt();
		long [] res= new long[m];
		
		for(int l=0; l<m; l++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			res[l] = sum[j] - sum[i-1];
		}
		for(int l=0; l<m; l++) {
			System.out.println(res[l]);
		}
	}

}
