package com.ug14.rumahsakit;

public class Dokter {
    // TODO 3 : Buat konstruktor, dan getter setter untuk setiap property nya seperti di soal
    //  buat juga method memeriksa, dan cekStatus

    public void memeriksa(Pasien a, Jadwal b) {
        // jika nama pasien sudah ada di jadwal, status screening di jadwal == true,
        // maka jadikan dokter ini menjadi dokter pasien a yang ada di jadwal
        // lakukan juga pengecekan level penyakit pasien yang ada di jadwal, atur level penyakit menjadi level sekarang - 1
        // selain semua kondisi tersebut maka tampilkan pesan error seperti pada soal

    }

    public void cekStatus(Pasien a, Jadwal b) {
        //jika status pasien == false, maka tampilkan jika pasien masih sakit
        // jika status pasien == true, maka update status pasien menggunakan DAO.updateStatusPasien()

    }
}
