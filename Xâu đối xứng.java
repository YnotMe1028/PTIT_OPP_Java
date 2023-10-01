package java01;

import java.util.Scanner;

public class general {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- >0) {
			String s = sc.nextLine();
			System.out.println(check(s));
		}
	}
	public static String check(String s) {
		int cnt = 0;
		for(int i=0;i<s.length()/2;++i) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				cnt++;
			}
			if(cnt > 1) return "NO";
		}
		if(cnt <= 1 && (s.length()&1)==1) return "YES";
		else if(cnt == 1 && (s.length()&1)==0) return "YES";
		else return "NO";
	}
}
