package com.ug14.rumahsakit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    // TODO 6 : Buat class DAO seperti ketentuan soal
    // kelas ini digunakan untuk koneksi ke database dan melakukan query ke table
    private final static String url = "jdbc:sqlite:rumahsakit.db";

    public Connection connect() {
        Connection conn = null;
        try {
            //TODO 7 : isi variable conn



            //System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    //disconnect conn
    // untuk close connection jika sudah tidak digunakan
    public static void disconnect(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
//                System.out.println("Koneksi Ditutup");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //diconnect statement
    // untuk close statement jika sudah tidak digunakan
    public static void disconnect2(Statement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
//                System.out.println("Koneksi Ditutup");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void inputPasien(Pasien a) {
        String sql = "INSERT INTO pasien bla blab bla";
        Connection conn = null;
        Statement stmt = null;

        try {
            // TODO 8 : buat proses kueri ke table pasien, di bawah ini



            System.out.println("Data Pasien Berhasil Disimpan!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            disconnect2(stmt);
            disconnect(conn);
        }
    }

    public static void inputJadwal(Jadwal a) {
        String sql = "INSERT INTO jadwal blablablabla";
        Connection conn = null;
        Statement stmt = null;

        try {
            // TODO 9 : buat proses kueri ke table jadwal,  di bawah ini



            System.out.println("Data Jadwal Berhasil Disimpan!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            disconnect2(stmt);
            disconnect(conn);
        }
    }


    //ambil data pasien yang status nya adalah 1
    public static Pelayanan getPasienSembuh() {
        String sql = "SELECT * FROM jadwal blablabla";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // TODO 10 : buat proses kueri ke table jadwal,  di bawah ini



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing result set: " + e.getMessage());
            }
            disconnect2(stmt);
            disconnect(conn);
        }
        return null;
    }

    //update status menjadi 1 menggunakan idPemeriksaan dari jadwal
    public static void updateStatusPasien(Jadwal a) {
        String sql = "UPDATE jadwal SET status == balablab where idPemeriksaan == balbalbal";
        Connection conn = null;
        Statement stmt = null;

        try {
            // TODO 11 : buat proses kueri ke table jadwal,  di bawah ini



            System.out.println("Status Pasien berhasil diubah!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            disconnect2(stmt);
            disconnect(conn);
        }
    }

}
