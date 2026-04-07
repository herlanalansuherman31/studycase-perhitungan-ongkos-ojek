public class Ojek {
    private double jarak;
    private double tarifPerKm;
    private double biayaMinimal;

    public Ojek(double jarak) {
        this.jarak = jarak;
        this.tarifPerKm = 2500;
        this.biayaMinimal = 10000;
    }

    public double hitungBiaya() {
        double biaya = jarak * tarifPerKm;
        return Math.max(biaya, biayaMinimal);
    }

    public void setTarifPerKm(double tarifBaru) {
        this.tarifPerKm = tarifBaru;
    }

    public void tampilkanInfo() {
        System.out.println("Jarak     : " + jarak + " km");
        System.out.println("Biaya     : Rp. " + hitungBiaya());
    }

    // Tugas tambahan: diskon mahasiswa
    public double diskonMahasiswa(int persen) {
        double biaya = hitungBiaya();
        double diskon = biaya * persen / 100.0;
        return biaya - diskon;
    }
}