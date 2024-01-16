package ex;

public class ii3 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(fibonacci(i));
        }
    }

}
//def fibonacci(n):
//	  if n == 0:
//	    return 0
//	  elif n == 1:
//	    return 1
//	  else:
//	    return fibonacci(n - 1) + fibonacci(n - 2)
//
//	def main():
//	  for i in range(20):
//	    print(fibonacci(i))
//
//	if __name__ == "__main__":
//	  main()
