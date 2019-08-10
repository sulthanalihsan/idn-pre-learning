public class Casting {
    public static void main(String[] args) {
        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);

        int hasil = (int) future;
        System.out.println(hasil);

        int x = 5;
        int y = 2;
        double div = x/y;
        System.out.println(div);
        double hasil2 = (double) x/y;
        System.out.println(hasil2);

    }
}
