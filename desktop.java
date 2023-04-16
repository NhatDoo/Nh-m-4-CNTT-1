
package qlmtconsole;

import java.util.Scanner;

 public class desktop extends PC
 {
  public String loaidesktop;
    Scanner sc = new Scanner(System.in);
    public desktop(String tenmaytinh, String mamaytinh,String loaimaytinh, double Dongia, String ngaynhap, double sl,String loaidesktop) {
        super(tenmaytinh, mamaytinh,loaimaytinh, Dongia, ngaynhap, sl);
        this.loaidesktop = loaidesktop;
    }
    @Override 
    public void nhap()
    {
    System.out.println("nhap ten may tinh ");
    tenmaytinh = sc.nextLine();
    System.out.println("nhap ma desktop ");
    mamaytinh =sc.nextLine();
    System.out.println("nhap loai may tinh ");
    loaimaytinh = sc.nextLine();
    System.out.println("nhap ngay nhap");
    ngaynhap=sc.nextLine();
    System.out.println("nhap don gia ");
    Dongia =sc.nextDouble();
    System.out.println("nhap so luong");
    sl =sc.nextDouble();
    System.out.println("nhap loai desktop ");
    loaidesktop =sc.nextLine();
    }
    @Override
    public double tst()
    {
    return sl*Dongia;
    }
    
}
