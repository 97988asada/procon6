import java.util.Scanner;
 
public class Main {
 
	private static String H6;
	private static String S49;
	private static String M72;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str == "H6")
			System.out.println("1996");
		else if(str == "S49") {
			System.out.println("1974");
		}
		else if(str == "M72"){
			System.out.println("1939");
		}
	}
}