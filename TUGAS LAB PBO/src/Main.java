public class Main {
    public static void main(String[] args) {
        DramaKorea drama1 = new DramaKorea();
        drama1.tampilkanInfo();
        System.out.println();

        DramaKorea drama2 = new DramaKorea("Crash Landing on You", "Romantis, Komedi, Drama", 16);
        drama2.tampilkanInfo(true);
        System.out.println();

        DramaKorea drama3 = new DramaKorea("Itaewon Class", "Drama, Romantis", 16, 2020);
        drama3.tampilkanInfo(true, true);
        System.out.println("Jumlah total durasi drama : "+drama3.TotalDurasi(26)+"  menit");

    }
}