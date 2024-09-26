public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
     printYearsAndDays(525600);
    }
    public static void printYearsAndDays( long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long hours;
            hours = (minutes / 60);

            long day;
            day = hours / 24;

            long year;
            year = day / 365;

            long remainingDays = day % 365;

            System.out.println( year + " y " + remainingDays + " d");



        }



    }
}
