public class TicketToMuseum {
    public static void main(String[] args) {
        int tickedPrice = 10;
        int age = 16;
        boolean isStudent = false;

        if (age <= 15) {
            tickedPrice = 5;
        } else if (age > 60) {
            tickedPrice = 5;
        } else if (isStudent) {
            tickedPrice = 5;
        }

        if (age <= 15 || age > 60 || isStudent) {
            tickedPrice = 5;
        }

//        System.out.println(tickedPrice);
//
//        System.out.println(('a' == 'a' || false || 10 < 50));
//        System.out.println((true && 3 > 5));
//        System.out.println((true && (3 < 5 || 2 < 10)));
//        System.out.println(!(10>1));



    }
}
