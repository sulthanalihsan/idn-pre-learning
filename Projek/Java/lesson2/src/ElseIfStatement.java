public class ElseIfStatement {
    public static void main(String[] args) {
        boolean lampuHijau = false;
        boolean lampuKuning = false;
        boolean lampuHabang= false;

        if(lampuHijau){
            System.out.println("jalan");
        }else if(lampuKuning){
            System.out.println("santui");
        }else if(lampuHabang){
            System.out.println("bagana");
        }else{
            System.out.println("mati lampu");
        }
    }
}
