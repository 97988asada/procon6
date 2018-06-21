package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char ch = str.charAt(0);
		if(ch == 'H') {
			int a = Integer.parseInt(str.substring(1));
			int year = 1989+(a-1);
			System.out.println(year);
		}
		if(ch == 'M') {
			int b = Integer.parseInt(str.substring(1));
			int year = 1868+(b-1);
			System.out.println(year);
		}
		if(ch == 'S') {
			int c = Integer.parseInt(str.substring(1));
			int year = 1926+(c-1);
			System.out.println(year);
		}
		if(ch == 'T') {
			int d = Integer.parseInt(str.substring(1));
			int year = 1912+(d-1);
			System.out.println(year);
		}
		if(ch == 'X') {
			int e = Integer.parseInt(str.substring(1));
			int year = 2019+(e-1);
			System.out.println(year);
		}
	}
}