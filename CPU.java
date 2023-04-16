
package qlmtconsole;

import java.util.Scanner;


public class CPU extends linhkien
{
    Scanner sc = new Scanner(System.in);
    public String hang;
    public String doi;
    
    public CPU(String tenlinhkien, String malinhkien, String loailinhkien, double dongia, int sl, String nhacungcap,String doi, String hang) {
        super(tenlinhkien, malinhkien, loailinhkien, dongia, sl, nhacungcap);
        this.doi =doi;
        this.hang = hang;
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
