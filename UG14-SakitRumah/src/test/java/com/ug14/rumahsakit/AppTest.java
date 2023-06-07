package com.ug14.rumahsakit;

import com.ug14.rumahsakit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {


    //menguji class Pasien
    @Test
    public void testPasien(){
        Pasien vito = new Pasien(101,"Vito",21,"Godean","Pilek",1);

        Assertions.assertSame("Vito",vito.getNama());
        Assertions.assertSame(101,vito.getRm());
        Assertions.assertSame(21,vito.getUsia());
        Assertions.assertSame("Godean",vito.getAlamat());
        Assertions.assertSame("Pilek",vito.getPenyakit());
    }

    //menguji class Suster
    @Test
    public void testSuster(){
        Suster suster = new Suster("Siti");

        Assertions.assertSame("Siti",suster.getNama());
        Assertions.assertSame(0,suster.getIdSuster());

        //screening pasien oleh suster
        Pelayanan andi = new Pelayanan("Andi");
        Jadwal jadwal = new Jadwal();
        Dokter budi = new Dokter("Budi", "Organ Dalam", "A123");
        Pasien vito = new Pasien(101,"Vito",21,"Godean","Pilek",1);

        // untuk bisa screening maka buat jadwal dulu
        andi.mengaturJadwal(vito, budi, suster, jadwal);
        jadwal.setPasien(vito);
        jadwal.setSuster(suster);
        jadwal.setDokter(budi);
        jadwal.setPelayanan(andi);
        jadwal.setStatusDaftar(true);
        jadwal.setStatusScreening(true);

        //suster cek jadwal
        suster.screening(vito, jadwal);

        //cek apakah jadwal valid
        Assertions.assertTrue(jadwal.getStatusScreening());
        Assertions.assertSame("Siti",jadwal.getSuster().getNama());
    }

    //menguji class Dokter
    @Test
    public void testDokter(){
        Dokter budi = new Dokter("Budi", "Organ Dalam", "A123");

        Assertions.assertSame("Budi",budi.getNama());
        Assertions.assertSame(0,budi.getIdDokter());
    }

    //menguji class Pelayanan dan Jadwal
    @Test
    public void testPelayanan(){
        Pelayanan andi = new Pelayanan("Andi");

        Assertions.assertSame("Andi",andi.getNama());
        Assertions.assertSame(0,andi.getIdPelayanan());

        Pasien vito = new Pasien(101,"Vito",21,"Godean","Pilek",1);
        Suster suster = new Suster("Siti");
        Dokter budi = new Dokter("Budi", "Organ Dalam", "A123");
        Jadwal jadwal = new Jadwal();

        andi.mengaturJadwal(vito, budi, suster, jadwal);
        jadwal.setPasien(vito);
        jadwal.setSuster(suster);
        jadwal.setDokter(budi);
        jadwal.setPelayanan(andi);
        jadwal.setStatusDaftar(true);
        jadwal.setStatusScreening(true);

        Assertions.assertSame("Vito",jadwal.getPasien().getNama());
        Assertions.assertSame("Siti",jadwal.getSuster().getNama());
        Assertions.assertSame("Budi",jadwal.getDokter().getNama());
        Assertions.assertSame("Andi",jadwal.getPelayanan().getNama());
        Assertions.assertSame(true,jadwal.getStatusDaftar());
        Assertions.assertSame(true,jadwal.getStatusScreening());
    }

    //menguji class Dokter dan Pelayanan
    @Test
    public void testDokterPemeriksaan() {
        Jadwal jadwal = new Jadwal();
        Pelayanan pelayanan = new Pelayanan("Andi");
        Suster suster = new Suster("Siti");
        Dokter dokter = new Dokter("Budi", "Organ Dalam", "A123");

        String userInput = "123\nJohn\n25\n123 Main St\nHeadache\n";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        Pasien pasien = pelayanan.registrasi();

        pelayanan.mengaturJadwal(pasien, dokter, suster, jadwal);

        suster.screening(pasien, jadwal);

        int x = pasien.getLevelPenyakit();
        for (int i = 0; i <= x; i++) {
            dokter.memeriksa(pasien, jadwal);
            dokter.cekStatus(pasien, jadwal);
        }

        assertTrue(pasien.getStatus());
    }


}