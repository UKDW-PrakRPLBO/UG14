package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    // TODO 4 : Buat konstruktor, dan getter setter untuk setiap property nya seperti di soal
    //  buat juga method mengaturJadwal, dan registrasi


    public void mengaturJadwal(Pasien a, Dokter b, Suster c, Jadwal d) {
        //atur tambah kan dokter, pasien, suster, pelayanan ke jadwal
        // atur status daftar menjadi true
        // insert jadwal ke database menggunakan DAO.inputJadwal()
        // tampilkan pesan "\n\t\t=== Proses Pengaturan Jadwal Berhasil ==="
    }

    public Pasien registrasi() {
        //buat scanner inputan
        // minta inputan room, nama , usia, alamat, dan penyakit
        // buat objek new pasien dari data tersebut
        // insert pasien dengan DAO.inserPasien()
        // tampilkan pesan "\n\t\t=== Proses Registrasi Berhasil ==="
        // return objek pasien
    }
}
