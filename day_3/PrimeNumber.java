import java.util.Scanner ;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false ;}
            else {
                for(int i =2; i < number; i++) {
                    if(number % i ==0) {
                        isPrime = false;
                        break;

                    }
                }
            }
            System.out.println("is the number" + number + "a prime number?" + isPrime);
            sc.close();
    }
}
