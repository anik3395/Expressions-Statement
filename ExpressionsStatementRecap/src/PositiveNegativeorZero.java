public class PositiveNegativeorZero {
    public static void main(String[] args) {
       checkNumber(0);
    }

    public static void checkNumber( int number){
        if (number > 0){
            System.out.println(" Positive");
        } else if (number < 0) {
            System.out.println(" Negative");
        }
        else if (number == 0){
            System.out.println("Zero");
        }
    }
}
