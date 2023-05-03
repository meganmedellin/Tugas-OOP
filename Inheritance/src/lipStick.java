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

    public void setJenis(String jenis) {
      this.jenis = jenis;
    }
    public String getJenis() {
      return jenis;
    }

    public void setMerk(String merk) {
      this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }

    public void setShade(String shade) {
      this.shade = shade;
    }
    public String getShade() {
        return shade;
    }

    public void setHarga(int harga) {
      this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }  
}
 
    


