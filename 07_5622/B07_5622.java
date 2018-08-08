import java.util.Scanner;

public class B07_5622 {
	static int dial(String a) {
		int[] numTime = {3, 4, 5, 6, 7, 8, 9, 10};
		int time = 0;
		for (int i=0; i<a.length(); i++) {
			int charAlphabat = a.charAt(i) - 65;
			if (charAlphabat < 3) {
				time += numTime[0];
			} else if (charAlphabat < 6) {
				time += numTime[1];
			}
			else if (charAlphabat < 9) {
				time += numTime[2];
			}
			else if (charAlphabat < 12) {
				time += numTime[3];
			}
			else if (charAlphabat < 15) {
				time += numTime[4];
			}
			else if (charAlphabat < 19) {
				time += numTime[5];
			}
			else if (charAlphabat < 22) {
				time += numTime[6];
			}
			else if (charAlphabat < 26) {
				time += numTime[7];
			}
			
		}
		return time;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabat = sc.next();
		int result = dial(alphabat);
		System.out.println(result);
	}
}
