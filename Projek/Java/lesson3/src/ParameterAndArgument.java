public class ParameterAndArgument {
    public static void main(String[] args) {
//        cuaca(32);
//        masukKereta(121.5);
//        printPhoto(50, 20, true);

//        int returnedLikes = likePhoto(2, "Mantul", true);
//        int totalLikes = likePhoto(returnedLikes, "IlikeThis", true);

        System.out.println(roolDice(90));
    }
    /*
    * roolDice adalah function untuk mensimulasikan pengacakan sebuah dadu,
    * dengan sebuah dadu yang memiliki sisi yang perlu diinisiasni
    *
    * @parameter sides adalah nomor sisi dadu yang diinisiasi untuk dikuncang
    * @return nilai yang dihasilkan berupa nomor acak dari 1 - nomor sisi yang dinisiasi
    *
    * contoh :
    * roolDice(5)
    * return nilai 1-5
    *
    */

    public static int roolDice(int sides){
        double randomNumber = Math.random();
        System.out.println(randomNumber);
        randomNumber *= sides;

        System.out.println(randomNumber);
        randomNumber += 1;

        System.out.println(randomNumber);
        int randomInt = (int) randomNumber;

        return randomInt;
    }

    public static int generateNumber() {
        double angkaAcak = Math.random();
        angkaAcak *= 10;

        int ancakInt = (int) angkaAcak;

        return ancakInt;
    }

    public static int likePhoto(int currentLikes, String comment, boolean like) {
        System.out.println("Feedback : " + comment);
        if (like) {
            //menmabhkan like dengan 1
            currentLikes = currentLikes + 1;
        }
        System.out.println("Number of likes: " + currentLikes);
        return currentLikes;
    }

    public static void hallo(String text) {
        System.out.println(text);
    }

    public static void cuaca(int temperatur) {
        if (temperatur > 30) {
            System.out.println("Panasnya");
        } else if (temperatur < 5) {
            System.out.println("dinginnya");
        } else {
            System.out.println("kada dingin kada panas");
        }
    }

    public static void masukKereta(double tinggi) {
        if (tinggi > 120) {
            System.out.println("Silahkan bermain");
        } else {
            System.out.println("Tinggi pian kada memenui");
        }
    }

    public static void printPhoto(int width, int height, boolean inColor) {
        System.out.println("lebar = " + width + " cm");
        System.out.println("tinggi = " + height + " cm");
        if (inColor) {
            System.out.println("cetak full warna");
        } else {
            System.out.println("cetak hitam putih");
        }
    }
}
