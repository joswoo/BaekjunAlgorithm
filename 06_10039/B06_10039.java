import java.util.Scanner;

public class B06_10039 {
	static int reScore(int score) {
		if (score < 40)
			score = 40;
		return score;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i=0; i<5; i++) {
			int score = reScore(sc.nextInt());
			sum += score;
		}
		sc.close();
		System.out.println(sum/5);
	}
}
