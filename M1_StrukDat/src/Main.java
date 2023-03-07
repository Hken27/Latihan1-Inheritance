import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi>listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("\tRoti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("\tSusu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("\tNasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("\tAir Putih");
        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch);

        System.out.println("\n\t===Menu konsumsi===");
        System.out.println("\t___________________\n");
        for (Konsumsi<Makanan, Minuman> konsumsi: listKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());

        }

    }

}
