class lipCream extends lipStick{
    private int ketahanan;

        public lipCream(String jenis, String merk, String shade, int harga, int ketahanan){
            super(jenis, merk, shade, harga);
            this.ketahanan = ketahanan;
        }

        public void tampillipCreamInfo(){
            tampil();
            System.out.println("Ketahanan: " + ketahanan);
        }
}