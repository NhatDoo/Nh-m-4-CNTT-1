
package qlmtconsole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class linhkienlist
{
    ArrayList<linhkien> list = new ArrayList<>();
    ArrayList<linhkien> xuatlist = new ArrayList<>();
    double dongia;
    int sl;
    String tenlinhkien,malinhkien,loailinhkien,nhacungcap,dungluong,hang,loaisp;
    RAM r = new RAM(tenlinhkien,malinhkien,loailinhkien,dongia,sl,nhacungcap,dungluong,hang);
    CPU cpu = new CPU(tenlinhkien,malinhkien,loailinhkien,dongia,sl,nhacungcap,dungluong,hang);
    inputoutput ipop = new inputoutput(tenlinhkien,malinhkien,loailinhkien,dongia,sl,nhacungcap,loaisp);
    public void nhap()
    {
        do
        {
         Scanner sc  = new Scanner(System.in);
         System.out.print("nhap ten linh kien : ");
         String tenlinhkien = sc.nextLine();
         if(tenlinhkien == null||tenlinhkien.equals(""))
         {
         break;
         }
         System.out.print("nhap loai linh kien  : ");
         String loailinhkien = sc.nextLine();
         if(loailinhkien== null||loailinhkien.equals(""))
         {
         break;
         }
         else if(loailinhkien.equalsIgnoreCase("RAM"))
         {
         linhkien lk = new RAM(tenlinhkien,malinhkien,loailinhkien,dongia,sl,nhacungcap,dungluong,hang);
         lk.nhap();
         list.add(lk);
         }
         else if(loailinhkien.equalsIgnoreCase("CPU"))
         {
         System.out.print("nhap don gia ");
         double dongia = sc.nextDouble();
         System.out.print("nhap so luong ");
         int sl = sc.nextInt();
         System.out.print("nhap nha cung cap ");
         String nhacungcap = sc.nextLine();
         System.out.println("nhap doi CPU ");
         String doi = sc.nextLine();
          System.out.println("nhap ma CPU");
         String malinhkien = sc.nextLine();
          System.out.println("nhap hang CPU ");
         String hang = sc.nextLine();
         linhkien lk = new CPU(tenlinhkien,malinhkien,loailinhkien,dongia,sl,nhacungcap,doi,hang);
         list.add(lk);
         }
         else if(loailinhkien.equalsIgnoreCase("I/O"))
         {
         linhkien lk = new inputoutput(tenlinhkien,malinhkien,loailinhkien,dongia,sl,nhacungcap,loaisp);
         lk.nhap();
         list.add(lk);
         }
        }
        while(true);
    }
    public void xuat()
    {
     int i=0;
     for(linhkien pc : list)
     {
      i++;
      System.out.printf(" %d Ten linh kien  %s || loai linh kien %s  || DonGia %s || Ma linh kien %s || Soluong %d \n",i,pc.getTenlinhkien(),pc.getLoailinhkien(),pc.getDongia(),pc.getMalinhkien(),pc.getSl());
     }
    }
    public void xoa()
    {
     System.out.println("nhap ten can xoa");
     Scanner sc = new Scanner(System.in);
     String tk = sc.nextLine();
     linhkien pctim = null;
     for(linhkien pc :list )
     {
       if(pc.getTenlinhkien().equalsIgnoreCase(tk))
       {
        pctim = pc;
       }
       break;
     }
     if(pctim !=null)
     {
      xuatlist.add(pctim);
      list.remove(pctim);
      System.out.println("Xoa Thanh Cong");
     }
    }
    public void timkiem()
    {
    int i =0;
    Scanner sc = new Scanner(System.in);
    String tk = sc.nextLine();
       for(linhkien pc:list)
       {
          i++;
          if(pc.getTenlinhkien().equalsIgnoreCase(tk))
          {
          System.out.printf(" ten sp can tim kiem :%d : %s \n ",i,pc.getTenlinhkien());
          }
       }  
    }
    public void sapxepaphalbet()
  {
        Collections.sort(list,new Comparator<linhkien>()
        {
         
         @Override
         public int compare( linhkien s1 , linhkien s2)
         {
          return String.valueOf(s1.getTenlinhkien()).compareTo(s2.getTenlinhkien());
         }
        });
       System.out.println("Sap xep thanh cong vui long bam 2 de kiem tra "); 
  }
     public void xoa1()
    {
     System.out.println("nhap ten can xoa");
     Scanner sc = new Scanner(System.in);
     String tk = sc.nextLine();
     linhkien pctim = null;
     for(linhkien pc :xuatlist )
     {
       if(pc.getTenlinhkien().equalsIgnoreCase(tk))
       {
        pctim = pc;
       }
       break;
     }
     if(pctim !=null)
     {
      list.add(pctim);
      xuatlist.remove(pctim);
      System.out.println("Xoa Thanh Cong");
     }
    }
    
    public void dsxuatkho()
  {
   for (linhkien pc : xuatlist)
   {
   System.out.printf("  Ten linh kien  %s || loai linh kien %s  || DonGia %d || Ma linh kien %s || Soluong %d \n",pc.getTenlinhkien(),pc.getLoailinhkien(),pc.getDongia(),pc.getMalinhkien(),pc.getSl());
   }
  }
    public void menu()
    {
     int chon;
     Scanner sc = new Scanner(System.in);
    do
    {
     System.out.println("1:--- nhap du lieu ");
     System.out.println("2:--- ds nhap kho ");
     System.out.println("3:--- tim kiem ");
     System.out.println("4:--- xoa 1 sp nhap kho");
     System.out.println("5:--- sap xep du lieu theo ki tu aphalbet ");
     System.out.println("6:--- ds xuat kho ");
     System.out.println("7:--- xoa 1 sp xuatkho ");
     System.out.println("0: ketthuc ");
     chon = sc.nextInt();
       if(chon !=0)
       {
         switch(chon)
         {
           case 1 : nhap();break;
           case 2 : xuat();break;
           case 3 : timkiem();break;
           case 4 : xoa();break;
           case 5 : sapxepaphalbet();break;
           case 6 : dsxuatkho(); break;
           case 7 : xoa1();break;
           
         }
       }
    }
    while(chon!=0);
   }
    
}
