public class DramaKorea {
    private String judul;
    private String genre;
    private int jumlahEpisode;
    private int tahunRilis;

    public DramaKorea() {
        this("Judul Drama Korea", "Genre Drama Korea", 0, 0);
    }

    public DramaKorea(String judul, String genre) {
        this(judul, genre, 0, 0);
    }

    public DramaKorea(String judul, String genre, int jumlahEpisode) {
        this(judul, genre, jumlahEpisode, 2019);
    }

    public DramaKorea(String judul, String genre, int jumlahEpisode, int tahunRilis) {
        this.judul = judul;
        this.genre = genre;
        this.jumlahEpisode = jumlahEpisode;
        this.tahunRilis = tahunRilis;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Jumlah episode: " + jumlahEpisode);
        System.out.println("Tahun rilis: " + tahunRilis);
    }

    public void tampilkanInfo(boolean tampilkanJudul) {
        if (tampilkanJudul) {
            System.out.println("Judul: " + judul);
        }
        System.out.println("Genre: " + genre);
        System.out.println("Jumlah episode: " + jumlahEpisode);
        System.out.println("Tahun rilis: " + tahunRilis);
    }

    public void tampilkanInfo(boolean tampilkanJudul, boolean tampilkanGenre) {
        if (tampilkanJudul) {
            System.out.println("Judul: " + judul);
        }
        if (tampilkanGenre) {
            System.out.println("Genre: " + genre);
        }
        System.out.println("Jumlah episode: " + jumlahEpisode);
        System.out.println("Tahun rilis: " + tahunRilis);
    }

    public int TotalDurasi( int Waktu1Episode){
        return this.jumlahEpisode * Waktu1Episode;
    }
    public int getJumlahEpisode() {
        return jumlahEpisode;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }
}