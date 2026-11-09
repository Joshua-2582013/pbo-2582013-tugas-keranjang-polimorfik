public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() * 80 / 100;
    }

    @Override
    public String keterangan() {
        return ukuranMB + " MB, diskon 20%";
    }

    @Override
    public String linkUnduh() {
        return "https://toko.buku/ebook/" + getJudul().toLowerCase().replace(' ', '-');
    }
}