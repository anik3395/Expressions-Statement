public class MethodChallenge {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(400);
        displayHighScorePosition( "Tim", position);

    }

    public static void displayHighScorePosition( String name,int position){
        System.out.println( name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition( int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500 &&  score < 1000) {
            return 2;
        }
        else if ( score >= 100 && score < 500 ){
            return 3;
        }
        return 4;
    }



}
