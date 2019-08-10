public class SwitchStatement {
    public static void main(String[] args) {
        int kode = 5;
        String kopi;
        switch (kode) {
            case 5:
                kopi = "torabika";
                break;
            case 6:
                kopi = "luwak white kopi, nyaman dilambung";
                break;
            default:
                kopi = "kada bekopi";
                break;
        }
        System.out.println(kopi);


        int bulan = 9;
        String bulanTeks;
        switch (bulan) {
            case 1:
                bulanTeks = "Januari";
                break;
            case 2:
                bulanTeks = "Februrari";
                break;
            case 3:
                bulanTeks = "Maret";
                break;
            case 4:
                bulanTeks = "April";
                break;
            case 5:
                bulanTeks = "Mei";
                break;
            case 6:
                bulanTeks = "Juni";
                break;
            case 7:
                bulanTeks = "Juli";
                break;
            case 8:
                bulanTeks = "Agustus";
                break;
            case 9:
                bulanTeks = "September";
                break;
            case 10:
                bulanTeks = "Oktober";
                break;
            case 11:
                bulanTeks = "November";
                break;
            case 12:
                bulanTeks = "Desember";
                break;
            default:
                bulanTeks = "kadada";
                break;
        }
        System.out.println(bulanTeks);

    }
}
