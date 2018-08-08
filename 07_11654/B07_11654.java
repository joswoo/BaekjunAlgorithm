import java.util.*;

public class B07_11654 {
	static int ascii(String s) {
		int a = s.charAt(0);
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(ascii(s));
	}
}



