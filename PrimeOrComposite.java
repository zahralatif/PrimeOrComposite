public class PrimeOrComposite {

  public static void main(String[] args) {
    int number = 21;

    boolean isPrime = isPrime(number);

    if (isPrime) {
      System.out.println(number + " is a prime number.");
    } else {
      System.out.println(number + " is a composite number.");
    }
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    if (num <= 3) {
      return true;
    }
    if (num % 2 == 0 || num % 3 == 0) {
      return false;
    }
    for (int i = 5; i * i <= num; i += 6) {
      if (num % i == 0 || num % (i + 2) == 0) {
        return false;
      }
    }
    return true;
  }
}
