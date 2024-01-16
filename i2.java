package ex;
import java.util.Scanner;
public class i2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x >= 8) {
			System.out.println("gioi");
		}else if(x >= 6.5 && x < 8) {
			System.out.println("kha");
		}else if(x >= 5 && x < 6.5) {
			System.out.println("trung binh");
		}else {System.out.println("yeu");
		}
	}
}
//em chưa hiểu kĩ về system.in trong java nên có code python cho quen ạ
//x = float(input('nhap diem cua hoc vien: '))
//if x >= 8:
//    print('giỏi')
//elif x >= 6.5 and x < 8:
//    print('khá')
//elif x >= 5 and x < 6.5:
//    print('trung bình')
//else:
//    print('yếu')