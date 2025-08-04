package basics.loops.forloop;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for(int number : numbers) {
            System.out.println(STR."Is \{number} is Prime Number? ->  \{isPrime(number) ? "Yes" : "No"}");
        }
        int count = 0;
        for( int i = 0 ; i<= 20; i++){
            if(isPrime(i)){
                System.out.println(STR."Prime Number: \{i}");
                count++;
                if(count == 100){
                    break;
                }
            }
        }
        System.out.println(STR."Total Prime Numbers between 0 and 20: \{count}");
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false; // If the number is divisible by any number other than 1 and itself, it is not prime
            }
        }
        return true;
    }
}
