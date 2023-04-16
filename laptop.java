
package qlmtconsole;

import java.util.Scanner;
 public class laptop extends PC
 {
  public String loailaptop;

    Scanner sc = new Scanner(System.in);
    public laptop(String tenmaytinh,String mamaytinh, String loaimaytinh, double Dongia, String ngaynhap, double sl,String loailaptop) {
        super(tenmaytinh, mamaytinh ,loaimaytinh, Dongia, ngaynhap, sl);
        this.loailaptop = loailaptop;
    }
    @Override 
    public void nhap()
    {
    System.out.println("nhap ten may tinh");
    tenmaytinh = sc.nextLine();
    System.out.println("nhap ma laptop");
    mamaytinh =sc.nextLine();
    System.out.println("nhap loai may tinh");
    loaimaytinh = sc.nextLine();
    System.out.println("nhap ngay nhap");
    ngaynhap=sc.nextLine();
    System.out.println("nhap don gia ");
    Dongia =sc.nextDouble();
    System.out.println("nhap so luong");
    sl =sc.nextDouble();
    System.out.println("nhap loai laptop");
    loailaptop =sc.nextLine();
    }
    @Override
    public double tst()
    {
    return  (sl*Dongia);
    }
    
}

