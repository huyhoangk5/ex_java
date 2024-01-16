package ex;
import java.util.Scanner;
import java.util.Random;
public class ii6 {
	public static void main(String[] args) {
//		usingRandomClass();
		System.out.println("nhập vào số thứ nhất: ");
		Scanner X = new Scanner(System.in);
		int x = X.nextInt();
		System.out.println("nhập vào số thứ hai: ");
		Scanner Y= new Scanner(System.in);
		int y = Y.nextInt();
		Random random = new Random();
		int z = random.nextInt(y-x+1)+x;
//		System.out.println(z);
		int dem = 0;
		for(int i=0; i<3;i++) {
			System.out.println("nhập vào lần đoán thứ nhất: ");
			Scanner A = new Scanner(System.in);
			int a = A.nextInt();
			if(a<x || a>y) {
				System.out.println("ban can nhap vao so o giua 2 so da chon ban dau");
			break;
			}else {
				if(a == z) {
				System.out.println("bạn đã thắng");
			break;
			}else if(a<z) {
				System.out.println("tăng lên");
				dem += 1;
			}else if(a>z) {
				System.out.println("giảm xuống");
				dem += 1;
			}
		}
			
			System.out.println("nhập vào lần đoán thứ hai: ");
			Scanner B = new Scanner(System.in);
			int b = B.nextInt();
			if(b<x || b>y) {
				System.out.println("ban can nhap vao so o giua 2 so da chon ban dau");
			break;
			}else {
			if(b == z) {
				System.out.println("bạn đã thắng");
			break;
			}else if(b<z) {
				System.out.println("tăng lên");
				dem += 1;
			}else if(b>z) {
				System.out.println("giảm xuống");
				dem += 1;
			}
		}
			
			System.out.println("nhập vào lần đoán thứ ba: ");
			Scanner C = new Scanner(System.in);
			int c = C.nextInt();
			if(a<x || a>y) {
				System.out.println("ban can nhap vao so o giua 2 so da chon ban dau");
			break;
			}else {
			if(c == z) {
				System.out.println("bạn đã thắng");
			break;
			}else if(c<z) {
				System.out.println("tăng lên");
				dem += 1;
			}else if(c>z) {
				System.out.println("giảm xuống");
				dem += 1;
			}
		}
		if(dem == 3) {
			System.out.println("bạn đã thua");
		}
		}
		
	}

}
//x = int(input('nhập vào số thứ nhất: '))
//y = int(input('nhập vào số thứ hai: '))
//import random
//z = random.randint(x,y)
//# print(z)
//dem = 0
//for i in range(2):
//    a = int(input('nhập vào lần đoán 1: '))
//    if a < x or a > y:
//        print('ban can nhap so o giua 2 so da dua vao')
//        break
//    else:
//        if a == z:
//            print('bạn đã thắng')
//        # break
//        elif a < z:
//            print('tăng lên')
//            dem += 1
//        else:
//            print('giảm xuống')
//            dem += 1
//
//    b = int(input('nhập vào lần đoán 2: '))       
//    if b < x or b > y:
//        print('ban can nhap so o giua 2 so da dua vao')
//        break
//    else:
//        if b == z:
//            print('bạn đã thắng')
//        # break
//        elif b < z:
//            print('tăng lên')
//            dem += 1
//        else:
//            print('giảm xuống')
//            dem += 1
//
//    c = int(input('nhập vào lần đoán 3: '))
//    if a < x or a > y:
//        print('ban can nhap so o giua 2 so da dua vao')
//        break
//    else:
//        if c == z:
//            print('bạn đã thắng')
//        # break
//        elif c < z:
//            print('tăng lên')
//            dem += 1
//        else:
//            print('giảm xuống')
//            dem += 1
//    break
//if dem == 3:
//    print('bạn đã thua')