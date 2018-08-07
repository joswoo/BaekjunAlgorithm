import java.util.Scanner;


public class b05_1065 {
	static int hanNum(int n) {
		int a = 1;
		int count = 0;
		while(a<=n) {
			if (a<100) {
				count++;
			} else {
				int a1 = a%10;
				int a2 = a/10%10;
				int a3 = a/100%10;
				if (a2*2 == a1+a3)
					count++;
			}
			a++;
		}
		if (n==1000) count--;
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값 : ");
		int num = sc.nextInt();
		num = hanNum(num);
		System.out.println(num);
	}
}


/*
public class b05_1065 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int result = 99;
		if (n<100) {
			System.out.println(n);
		}else {
			for(int i=100;i<=n;i++) {
				result += checkHan(i);
			} 
			if (n==1000) result--;
		System.out.println(result);
		}
	}
	static int checkHan(int n) {
		int a1 = n%10;
		int a2 = n/10%10;
		int a3 = n/100%10;
		if (a2*2 == a1+a3)
			return 1;
		return 0;
	}
}
*/