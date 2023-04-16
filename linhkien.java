
package qlmtconsole;

public abstract class linhkien 
{
    public String getTenlinhkien() {
        return tenlinhkien;
    }

    public void setTenlinhkien(String tenlinhkien) {
        this.tenlinhkien = tenlinhkien;
    }

    public String getMalinhkien() {
        return malinhkien;
    }

    public void setMalinhkien(String malinhkien) {
        this.malinhkien = malinhkien;
    }

    public String getLoailinhkien() {
        return loailinhkien;
    }

    public void setLoailinhkien(String loailinhkien) {
        this.loailinhkien = loailinhkien;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public String tenlinhkien;
    public String malinhkien;
    public String loailinhkien;
    public double dongia;
    public int sl;
    public String nhacungcap;

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public linhkien(String tenlinhkien, String malinhkien, String loailinhkien, double dongia, int sl,String nhacungcap) {
        this.tenlinhkien = tenlinhkien;
        this.malinhkien = malinhkien;
        this.loailinhkien = loailinhkien;
        this.dongia = dongia;
        this.sl = sl;
        this.nhacungcap = nhacungcap;
        
    }
    public abstract void nhap();
    public abstract double tst();
}
