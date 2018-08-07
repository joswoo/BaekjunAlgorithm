import java.util.Scanner;

public class B06_2577 {
	public static int[] HowMuchNum(int n) {
		int[] numCount = new int[10];
		String result = Integer.toString(n);
		for (int i=0; i<result.length(); i++) 
			// char 값은 -'0'을 붙이면 int형으로 바뀐다.
			numCount[result.charAt(i)-'0']++;	
		return numCount;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int[] table = HowMuchNum(a*b*c);
		for (int j=0; j<table.length; j++)
			System.out.println(table[j]);
	}
}
