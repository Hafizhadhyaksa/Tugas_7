package Polymorfisme;

public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.setUpah(upah);

    }
//getter
    public double getUpah() {
        return upah;
    }
    @Override
    public double gaji(){
        return getUpah();
    }
//setter
    public void setUpah(double upah) {
        this.upah = upah;
    }
    @Override
    public String toString(){
        System.out.println("");
        System.out.println("Pegawai Tetap\t: " + getNama());
        System.out.println("No. KTP\t\t\t: " + getNoKTP());
        System.out.println("Upah\t\t\t: "  + getUpah());
        System.out.println("Pendapatan\t\t: Rp " + (int)gaji());
        return " ";
    }

}
