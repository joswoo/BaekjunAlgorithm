import java.util.Scanner;

public class B08_1193 {
	static void fraction(int num) {
		int i = 1;
		while(num > i) {
			num -= i++;
		}
		if (i%2 == 0) 
			System.out.println(num+"/"+(i-num+1));
		else
			System.out.println((i-num+1)+"/"+num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fraction(num);
	}
}
