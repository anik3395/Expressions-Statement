public class SpeedConverter {
    public static void main(String[] args) {
        long MilesPerHour = toMilesPerHour(10.25);
        System.out.println(MilesPerHour);

    }

    public static long toMilesPerHour( double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        else{
            double MilesPerHour = kilometersPerHour * 0.62137119;
            return Math.round(MilesPerHour);

        }

    }
}
