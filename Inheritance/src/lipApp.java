

public class lipApp {
    public static void main(String[]args) {
        lipCream lCream = new lipCream("lipCream", "Wardah", "nude", 70000, 8); 
        System.out.println("Jenis: " + lCream.getJenis());
        System.out.println("Merk: " + lCream.getMerk());
        System.out.println("Shade: " + lCream.getShade());
        System.out.println("Harga: " + lCream.getHarga());
        System.out.println("Ketahanan: " + lCream.getKetahanan());

        lipTint lTint = new lipTint("lipTint", "Hanasui", "coral", 21000, 9);
        System.out.println("Jenis: " + lTint.getJenis());
        System.out.println("Merk: " + lTint.getMerk());
        System.out.println("Shade: " + lTint.getShade());
        System.out.println("Harga: " + lTint.getHarga());
        System.out.println("Kelembapan: " + lTint.getKelembapan());
      
    }
}

