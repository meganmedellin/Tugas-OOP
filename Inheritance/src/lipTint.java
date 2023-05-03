class lipTint extends lipStick{
    private int kelembapan;

        public lipTint(String jenis, String merk, String shade, int harga, int kelembapan){
            super(jenis, merk, shade, harga);
            this.kelembapan = kelembapan;
        }

        public void setKelembapan(int kelembapan) {
            this.kelembapan = kelembapan;
        }
        public int getKelembapan() {
            return kelembapan;
        }
}
