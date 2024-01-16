package ex;

public class ii5 {
	public static void main(String[] args) {
		for(int i = 0;i < 101; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
				System.out.println(i + " Hello World");
			}else if(i % 3 == 0) {
				System.out.println(i + " Hello");
			}else if(i % 5 == 0) {
				System.out.println(i + " World");
			}else {
				System.out.println(i);
			}
		}
	}

}
//for i in range(101):
//    if i % 3 == 0 and i % 5 == 0:
//        print(i,'Hello World')
//    elif i % 3 == 0:
//        print(i,'Hello')
//    elif i % 5 == 0:
//        print(i,'World')
//    else:
//        print(i)