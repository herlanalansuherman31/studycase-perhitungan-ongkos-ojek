public class MainProcedural {
    private static double tarifPerKm = 2500;
    private static double biayaMinimal = 10000;

    public static double hitungBiaya(double jarak) {
        double biaya = jarak * tarifPerKm;
        return Math.max(biaya, biayaMinimal);
    }

    public static void tampilkanInfo(double jarak) {
        System.out.println("Jarak     : " + jarak + " km");
        System.out.println("Biaya     : Rp. " + hitungBiaya(jarak));
    }

    public static void main(String[] args) {
        System.out.println("=== OJEK ONLINE JAKARTA (PROCEDURAL) ===");
        tampilkanInfo(5.0);
        tampilkanInfo(12.0);
    }
}