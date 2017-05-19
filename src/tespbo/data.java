/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tespbo;
public class data {
    private String namaLengkap;
    private String jenisKelamin;
    private String tanggalLahir;
    private String hobby;
    private String jurusan;
    
    public data(String namaLengkap, String jenisKelamin, String jurusan, String tanggalLahir, String hobby) {
        this.namaLengkap = namaLengkap;
        this.tanggalLahir = tanggalLahir;
        this.hobby = hobby;
        this.jurusan = jurusan;
        this.jenisKelamin = jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}