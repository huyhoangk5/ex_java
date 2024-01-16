package ex;
import java.util.Scanner;
public class i1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 3 số: ");
        String inputNumbers = scanner.nextLine();

        // Chia chuỗi nhập vào thành các số riêng lẻ
        String[] numbers = inputNumbers.split(" ");

        // Tìm số lớn nhất trong mảng
        String maxNumber = numbers[0];  // Khởi tạo maxNumber với phần tử đầu tiên
        for (String number : numbers) {
            if (number.compareTo(maxNumber) > 0) {
                maxNumber = number;
            }
        }

        System.out.println("Số lớn nhất là: " + maxNumber);
    }
}
//code trong python
//s = input('nhap vao 3 so: ')
//for i in s:
//    max = i
//    if i > max:
//        max = i
//print(max)