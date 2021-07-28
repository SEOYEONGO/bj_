package silver;

import java.util.Scanner;

public class cow_14465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int b = sc.nextInt();
		boolean [] check = new boolean[n+1];
		for(int i=1; i<=b; i++) {
			check[sc.nextInt()] = true;
		}
		
		int min=100001;
		for(int i=1; i<= n-k+1; i++) {
			int cnt=0;
			for(int j=0; j<k; j++) {         // 추가적인 공간은 들 수 있지만, 한번 탐색을 하면서 결과를 얻는 방법도 있음! 
				if(check[i+j]==true) cnt++; 
			}
			if(min > cnt) {	min = cnt; }
		}
		System.out.println(min);
	}
}
