public class MethodOverloading {
    public static void main(String[] args) {

        int newScore =  calculateScore( "Anik", 500);
        System.out.println(newScore);

        int newScore2 = calculateScore(75);
        System.out.println(newScore2);

        calculateScore();
    }

    public static int calculateScore( String playerName , int score){
        System.out.println( "Player " + playerName + " Scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println( "Unnamed Player" + " Scored " + score);
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println( "No player");
        return 0;

    }
}
