public class VirtualDemo {
    public static void main (String[] args){
        Gaji s = new Gaji ("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji ("Zaki", "Bukittinggi", 2, 2500.00);
        Pegawai p = new Pegawai("Andafi", "Padang", 810);

        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        System.out.println(s.message);
        s.mailCheck();
        System.out.println("----------------------------------------------------");

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(e.message);
        e.mailCheck();
        System.out.println("----------------------------------------------------");

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(p.message);
        p.mailCheck();
        System.out.println("----------------------------------------------------");

    }
}
