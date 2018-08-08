import java.util.Scanner;

public class B07_1316 {
	static int checkAlphabat(String a) {
		boolean[] alphabat = new boolean[26];
		alphabat[a.charAt(0) - 97] = true;
		for (int j=1; j<a.length(); j++) {
			if (a.charAt(j) != a.charAt(j-1)) {
				if (alphabat[a.charAt(j) - 97] == true) {
					return 0;
				}
				alphabat[a.charAt(j) - 97] = true;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();
		int result = 0;
		for (int i=0; i<testCase ;i++) {
			String word = sc.nextLine();
			result += checkAlphabat(word); 
		}
		sc.close();
		System.out.println(result);
	}
	

}



