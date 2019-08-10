public class CallingChorus {
    public static void main(String[] args) {

        putarLagu();
    }

    public static int lirik() {
        System.out.println("indonesia raya merdeka merdeka");
        return 1;
    }

    static boolean putarLaguKah = true;

    public static void putarLagu() {
        if (putarLaguKah) {
            System.out.println("lagu diputar");
        }else{
            System.out.println("lagu dipause");
        }

    }
}
