public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {
                new Ogrenci("2022101001", "Bilgisayar Müh"),
                new Ogrenci("Eren", "Elektrik-Elektronik Müh", 2022, 0.0),
                new Ogrenci("İrem", "Bilgisayar Müh", 2016, 3.87)
        };
        System.out.println("Öğrenci Bilgileri");
        for (int k = 0; k < ogrenciler.length; k++) {
            System.out.println("OGR-" + (k + 1) + " " + ogrenciler[k]);
            Ogrenci.i++;

        }
        for (int m = 0; m < ogrenciler.length; m++) {
            if (ogrenciler[m].harcHesaplama() > 0)
                System.out.println(m + 1 + ". Öğrencinin ödeyeceği harç :" + ogrenciler[m].harcHesaplama());
        }
    }
}