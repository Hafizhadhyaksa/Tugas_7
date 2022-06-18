package Polymorfisme;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Nama\t\t: Muhammad Hafizh Adhyaksa");
        System.out.println("NIM\t\t\t: 215150707111019");
        System.out.println("Kelas\t\t: TI-E");
        System.out.println("");

        Pegawai pegawai1 = new PegawaiTetap("Bayu", "350728490327424892342", 2000000);
        Pegawai pegawai2 = new PegawaiTetap("Adhy", "3507291318281924123", 18000000);
        Pegawai pegawai3 = new PegawaiTetap("Zhafran", "35071951351241241", 1500000);
        Pegawai pegawai4 = new PegawaiTetap("Radit", "350912810251023", 1200000);

        Pegawai pegawai5 = new PegawaiHarian("Edo", "350639129319312319", 8500, 40);
        Pegawai pegawai6 = new PegawaiHarian("Zeus", "35061927512312512", 9000, 24);
        Pegawai pegawai7 = new PegawaiHarian("Poseidon", "350691251231294", 6000, 6);
        Pegawai pegawai8 = new PegawaiHarian("Hades", "3506912981502581", 6500, 12);

        Pegawai pegawai9 = new Sales("Tika", "3502184121294141", 50, 50000);
        Pegawai pegawai10 = new Sales("Thor", "392146173849", 40, 40000);
        Pegawai pegawai11 = new Sales("Odin", "391472859714", 30, 30000);
        Pegawai pegawai12 = new Sales("Loki", "391478192648", 15, 15000);
        ArrayList <Pegawai> daftar =
                new ArrayList<Pegawai>();

        daftar.add  (pegawai1);
        daftar.add(pegawai2);
        daftar.add(pegawai3);
        daftar.add(pegawai4);
        daftar.add(pegawai5);
        daftar.add(pegawai6);
        daftar.add(pegawai7);
        daftar.add(pegawai8);
        daftar.add(pegawai9);
        daftar.add(pegawai10);
        daftar.add(pegawai11);
        daftar.add(pegawai12);

        for(Pegawai i : daftar){
            i.toString();
        }

    }

}

