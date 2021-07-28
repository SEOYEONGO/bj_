package silver;

import java.util.Scanner;

public class twoTop_ver2_2118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] sum = new int[n+2];
		sum[0]=0; 
		sum[1]=0; // sum[]은 합...
		for(int i=2; i<=n; i++) {
			int v = sc.nextInt();
			sum[i] = sum[i-1] + v;
		}
		int reverse = sc.nextInt();	
		// 각각 인덱스 마다 반시계, 시계로 돌면서 최소를 찾아. 그 리스트에서 최대를 찾는 방식임.
		int r= n*(n-1)/2; 
		int path1;
    int res=Integer.MIN_VALUE;
    
		for(int i=1; i<n; i++) {  
			for(int j=i+1; j<=n; j++) {
				path1 = sum[j] - sum[i];    // 시계 방향으로 돌면서 거리를 구함
				int path2 = sum[n] + reverse - path1;   // 반시계 방향으로 돌면서 거리를 구함
				if(path1 > path2) path1 = path2;
				if(res < path1) res = path1;
			} 
		}
		System.out.println(res);
		
	}

}
