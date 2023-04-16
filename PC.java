
package qlmtconsole;

public abstract class PC 
{
 String tenmaytinh;
 String loaimaytinh;
 String mamaytinh;
 double Dongia;
 String ngaynhap;
 double sl;

    public String getTenmaytinh() {
        return tenmaytinh;
    }

    public String getMamaytinh() {
        return mamaytinh;
    }

    public void setMamaytinh(String mamaytinh) {
        this.mamaytinh = mamaytinh;
    }

    public void setTenmaytinh(String tenmaytinh) {
        this.tenmaytinh = tenmaytinh;
    }

    public String getLoaimaytinh() {
        return loaimaytinh;
    }

    public void setLoaimaytinh(String loaimaytinh) {
        this.loaimaytinh = loaimaytinh;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public double getSl() {
        return sl;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }
    
    public PC(String tenmaytinh,String mamaytinh ,String loaimaytinh, double Dongia, String ngaynhap, double sl) {
        this.tenmaytinh = tenmaytinh;
        this.loaimaytinh = loaimaytinh;
        this.mamaytinh =mamaytinh;
        this.Dongia = Dongia;
        this.ngaynhap = ngaynhap;
        this.sl = sl;
    }
    public abstract void nhap();
    public abstract double tst();
    
   
    
}

