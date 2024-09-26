public class Method {
    public static void main(String[] args) {
      int highScore =calculateScore( true, 1000, 8, 200);
        System.out.println(highScore);

    }
    public static int calculateScore( boolean gameOver, int score, int levelCompleted,  int bonus){
        int finalScore = score;
        if ( gameOver){
            finalScore += ( levelCompleted * bonus);
//            System.out.println( " The score is " + finalScore);
        }
        return finalScore;
    }
}
