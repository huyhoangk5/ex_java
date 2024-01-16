package ex;

public class ii2 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int i = 2;
        int count = 0;

        while (count < 20) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
//def is_prime(n):
//	  import math
//	  if n <= 1:
//	    return False
//
//	  for i in range(2, int(math.sqrt(n)) + 1):
//	    if n % i == 0:
//	      return False
//
//	  return True
//
//	def main():
//	  i = 2
//	  dem = 0
//	  while dem < 20:
//	    if is_prime(i):
//	      print(i)
//	      dem += 1
//	    i += 1
//
//	if __name__ == "__main__":
//	  main()