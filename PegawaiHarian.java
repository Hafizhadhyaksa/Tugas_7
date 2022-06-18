package Polymorfisme;

public class PegawaiHarian extends Pegawai{
    private int totalJam;
    private double upahPerJam;


    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

//getter
    public double getUpahPerJam() {
        return upahPerJam;
    }
    public int getTotalJam() {
        return totalJam;
    }
    @Override
    public double gaji(){
        double gaji;
        if (getTotalJam() <= 40) {
            gaji = getUpahPerJam() * getTotalJam();
        }else {
            gaji = 1.5 * getUpahPerJam() * (getUpahPerJam() * 40) + ((getTotalJam() - 4));
        }
        return gaji;
    }
//setter
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }


    @Override
    public String toString(){
        System.out.println(" ");
        System.out.println("Pegawai Harian\t: " + getNama());
        System.out.println("No. KTP\t\t\t: " + getNoKTP());
        System.out.println("Upah/Jam\t\t: Rp " + gaji()/getTotalJam());
        System.out.println("Total Jam Kerja\t: " + (double)getTotalJam());
        System.out.println("Pendapatan\t\t: Rp " + (int)gaji());
        return " ";
    }


}
