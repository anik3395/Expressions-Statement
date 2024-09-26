public class PrimeNumber {
    public static void main(String[] args) {

     int i;
     int binary = Integer.parseInt(Integer.toBinaryString(5));
        System.out.println(binary);
     int count=0;
     for ( i =0; i<=20;i++){
         if (isPrime(i)){
             System.out.println( "This " + i + " is a prime number");
             count++;
         }
     }
        System.out.println("The total prime number is " + count);

    }

     public static boolean isPrime( int number){
        if (number <= 2){
            if( number == 2){
                return true;
            }
            return false;
        }

        for ( int divisor = 2 ; divisor < number ;divisor++){
           if (number % divisor == 0){
               return false;
           }
        }
        return true;
     }
}
