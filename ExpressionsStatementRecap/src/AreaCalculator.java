public class AreaCalculator {
    public static void main(String[] args) {
        double areaOfCircle = area(5);
        System.out.println(areaOfCircle);

        double areOfRectangle = area( 5,4);
        System.out.println(areOfRectangle);

    }


    public static double area( double radius){
        if (radius < 0 ){
            return -1;
        }
        return (3.1415 * radius *radius);
    }

    public static double area ( double x ,double y){
        if ( x < 0 || y < 0){
            return -1;
        }
        return (x * y);
    }


}
