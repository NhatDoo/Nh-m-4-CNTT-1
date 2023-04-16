
package qlmtconsole;

import java.util.Scanner;


public class RAM extends linhkien
{
    Scanner sc = new Scanner(System.in);
    public String dungluong;
    public String hang;

    public RAM(String tenlinhkien, String malinhkien, String loailinhkien, double dongia, int sl,String nhacungcap,String dungluong,String hang) {
        super(tenlinhkien, malinhkien, loailinhkien, dongia, sl,nhacungcap);
        this.hang = hang;
        this.dungluong =dungluong;
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
    }

    @Override
    public double tst()
    {
     return sl*dongia;
    }
    
   
   
}
