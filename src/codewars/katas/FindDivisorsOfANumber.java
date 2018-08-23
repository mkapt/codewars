package codewars.katas;

//Find the number of divisors of a positive integer n.
public class FindDivisorsOfANumber {

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(50000));
    }

    public static long numberOfDivisors(int n) {
        long numberOfDivisors = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) {
                numberOfDivisors++;
            }
        }

        return numberOfDivisors;
    }
}
