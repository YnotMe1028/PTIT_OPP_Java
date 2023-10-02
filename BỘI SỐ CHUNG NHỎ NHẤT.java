package java01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class general {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- >0) {
			BigInteger a = new BigInteger(sc.nextLine());
			BigInteger b = new BigInteger(sc.nextLine());
			BigInteger gcd = a.gcd(b);
			BigInteger boiso = a.divide(gcd).multiply(b);
			System.out.println(boiso);
		}
	}
}
