public class OverloadingChallenge {
    public static void main(String[] args) {
        System.out.println( " The value of height in cent is " + convertToCentimeters(7));
        System.out.println(convertToCentimeters(5,8));

    }

    public static double convertToCentimeters(int height){
        double heightInCent;
        heightInCent = height / 2.54;
        return heightInCent;

    }

    public static double convertToCentimeters(int height,int heightininches){
        int heightInFeet = height /12;
        int heightininche = height % 12;
        return  ( heightInFeet + heightininche);
    }


}
