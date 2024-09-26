public class Sum3and5Challenge {
    public static void main(String[] args) {
       int i;
       int sum = 0;
       for (i = 1; i <=1000 ; i++){
           if(( i % 3 == 0 ) && ( i % 5 == 0)){
               System.out.println( i + " is divided by both 3 and 5");
               sum = sum + i;
           }
       }
        System.out.println( "The total sum is : " +  sum);
    }
}
