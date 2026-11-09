public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    private int ongkir() {
        int blok = (beratGram + 499) / 500; // dibulatkan ke atas per 500 gram
        return blok * 5000;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() + ongkir();
    }

    @Override
    public String keterangan() {
        return beratGram + " gram, ongkir " + formatRupiah(ongkir());
    }
}