package ex;
import java.util.Scanner;
public class i3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x > 0) {
			System.out.print("Positive");
		}else if(x < 0) {
			System.out.print("Negative");
		}else {
			System.out.print("0");
		}
	}
}
//x = float(input('nhap so: '))
//if x > 0:
//    print('Positive')
//elif x < 0:
//    print('Negative')
//else:
//    print(0)