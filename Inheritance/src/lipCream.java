class lipCream extends lipStick{
    private int ketahanan;

        public lipCream(String jenis, String merk, String shade, int harga, int ketahanan){
            super(jenis, merk, shade, harga);
            this.ketahanan = ketahanan;
        }
        public void setKetahanan(int ketahanan) {
            this.ketahanan = ketahanan;
        }
        public int getKetahanan() {
            return ketahanan;
        }
}