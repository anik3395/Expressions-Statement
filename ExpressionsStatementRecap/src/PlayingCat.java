public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying( false,36));

    }

    public static boolean isCatPlaying (boolean summer , int temperature){
        if ( (summer &&  (temperature >= 25 && temperature <= 35)) || (!summer && (temperature >= 25 && temperature <= 45 )) ){
            return true;
        }
        return false;
    }
}
