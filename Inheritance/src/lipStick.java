public class lipStick{
    private String jenis;
    private String merk;
    private String shade;
    private int harga;
  
    public lipStick(String jenis, String merk, String shade, int harga) {
      this.jenis = jenis;
      this.merk = merk;
      this.shade = shade;
      this.harga = harga;
    }
  
    public void tampil(){
        System.out.println("Jenis: " + jenis);
        System.out.println("Merk: " + merk);
        System.out.println("Shade: " + shade);
        System.out.println("Harga: " + harga);
    }
}
 
    


