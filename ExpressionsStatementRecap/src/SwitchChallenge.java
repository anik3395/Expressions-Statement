public class SwitchChallenge {
    public static void main ( String[] args){
        System.out.println(printDayOfWeek(7));
    }

    public static String printDayOfWeek( int day){
        switch (day){
            case 0 :
                return "sunday";
            case 1 :
                return "Monday";
            case 2 :
                return "Thuesday";
            case 3 :
                return "Thursday";
            default:
                return "Invalid day";

        }

    }
}
