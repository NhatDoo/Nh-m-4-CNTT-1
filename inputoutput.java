
package qlmtconsole;

import java.util.Scanner;

public class inputoutput extends linhkien
{
    public String loaisp;
    Scanner sc = new Scanner(System.in);
    public inputoutput(String tenlinhkien, String malinhkien, String loailinhkien, double dongia, int sl, String nhacungcap,String loaisp) {
        super(tenlinhkien, malinhkien, loailinhkien, dongia, sl, nhacungcap);
        this.loaisp = loaisp;
    }
    @Override 
    public void nhap()
    {
    System.out.println(" nhap ten thiet bi ");
    tenlinhkien = sc.nextLine();
    System.out.println(" nhap ma linh kien ");
    malinhkien =sc.nextLine();
    System.out.println(" nhap loai linh kien  ");
    loailinhkien =sc.nextLine();
    System.out.println(" nhap don gia ");
    dongia = sc.nextDouble();
    System.out.println(" nhap so luong ");
    sl =sc.nextInt();
    System.out.println(" nha cung cap ");
    nhacungcap =sc.nextLine();
    System.out.println(" nhap loai sp ");
    loaisp = sc.nextLine();
    }

    @Override
    public double tst()
    {
     return sl*dongia;
    }
    
}
