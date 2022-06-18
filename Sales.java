package Polymorfisme;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;


    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

//getter
    public int getPenjualan() {
        return penjualan;
    }
    public double getKomisi() {
        return komisi;
    }
    @Override
    public double gaji(){
        return getPenjualan() * getKomisi();
    }
//setter
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
    @Override
    public String toString(){
        System.out.println(" ");
        System.out.println("Sales\t\t\t: " + getNama());
        System.out.println("No. KTP\t\t\t: " + getNoKTP());
        System.out.println("Total Pejualan\t: "  + (double)getPenjualan());
        System.out.println("Besaran Komisi\t: " + getKomisi());
        System.out.println("Pendapatan\t\t: Rp " + (int)gaji());
        return " ";
    }
}
