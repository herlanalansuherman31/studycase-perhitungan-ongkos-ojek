public class MainOjek {
    public static void main(String[] args) {
        System.out.println("=== OJEK ONLINE JAKARTA ===");

        Ojek ojek1 = new Ojek(5.0);
        ojek1.tampilkanInfo();

        Ojek ojek2 = new Ojek(12.0);
        ojek2.tampilkanInfo();

        // Contoh penggunaan diskon mahasiswa
        System.out.println("Biaya setelah diskon 10%: Rp. " + ojek1.diskonMahasiswa(10));
    }
}