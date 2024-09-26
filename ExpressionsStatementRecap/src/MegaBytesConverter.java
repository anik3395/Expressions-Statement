public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-56754);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if ( kiloBytes < 0){
            System.out.println( " Invalid Value ");
        }
        else {
            int megaByte;
            megaByte = kiloBytes / 1024;

            int remainder;
            remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB " + remainder + " KB");
        }
    }
}
