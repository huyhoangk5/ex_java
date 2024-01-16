package ex;
import java.util.Scanner;
public class ii1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int luythua = 1;
		for(int i=1; i < N+1; i++) {
			luythua *= i;	
		}
		System.out.print("ketqua: " + luythua);
	}
}
//luythua = 1
//for i in range(1,int(input('nhap so: '))+1,1):
//    luythua *= i
//print(luythua)