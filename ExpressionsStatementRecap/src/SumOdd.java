public class SumOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(7));
        System.out.println(sumOdd(1,5));
    }
    public static boolean isOdd( int num){
        if (num < 0){
            return false;
        }
        if ( num % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd (int start , int end){
        int sum =0;
        if((end >= start) && (start > 0) && ( end > 0)){
            for (int i = start ; i <= end; i++ ){
                if (isOdd(i)){
                    sum=sum +i;
                }
            }
            return sum;
        }
        return -1;

    }
}
