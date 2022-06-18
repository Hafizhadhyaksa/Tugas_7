package Polymorfisme;

public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

//getter
    public String getNama() {
        return nama;
    }
    public String getNoKTP() {
        return noKTP;
    }

//setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }
    public double gaji(){
        return 0.0;
    }
    public String toString(){
        return " ";
    }

}
