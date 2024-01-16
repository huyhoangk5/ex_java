package ex;
import java.util.Scanner;
import java.lang.Math;
public class ii4 {
	public static void main(String[] arrgs) {
	Scanner goc = new Scanner(System.in);
	int p = goc.nextInt();
	Scanner thang = new Scanner(System.in);
	int n = thang.nextInt();
	Scanner laisuat = new Scanner(System.in);
	float r = laisuat.nextFloat();
	
	System.out.println("số tiền gửi sau" + n + "tháng là: " + Math.pow(p*(1+r),n));
}
}
//p = int(input('nhập số tiền gửi vào: '))
//r = float(input('nhập lãi suất hàng tháng: '))
//n = int(input('nhập vào số tháng gửi: '))
//print('số tiền sau',n,'tháng là: ',p*(1+r)**n)