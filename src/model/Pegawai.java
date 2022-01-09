
package model;

public class Pegawai {
    int no;
    String nip;
    String namaPegawai;
    String pangkatGolongan;
    String jenisKelamin;
    String alamat;
    String agama;
    String gaji;

    public Pegawai(int no, String nip, String namaPegawai, String pangkatGolongan, 
            String jenisKelamin, String alamat, String agama, String gaji) {
        
        this.no = no;
        this.nip = nip;
        this.namaPegawai = namaPegawai;
        this.pangkatGolongan = pangkatGolongan;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.gaji = gaji;
    }

    public Pegawai() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getPangkatGolongan() {
        return pangkatGolongan;
    }

    public void setPangkatGolongan(String pangkatGolongan) {
        this.pangkatGolongan = pangkatGolongan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }
}
