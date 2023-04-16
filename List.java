
package qlmtconsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class List 
{
    ArrayList<PC> list = new ArrayList<>();
    ArrayList<PC> xuatlist = new ArrayList<>();
    String tenPC,loaiPC,ngaynhap,loailaptop,tendesktop,mamaytinh;
    Scanner sc  = new Scanner(System.in);
    double dongia,soluong;
    
    public void nhap()
    {
        do
        {
         System.out.print("nhap ten PC : ");
         Scanner sc = new Scanner(System.in);
         String tenPC = sc.nextLine();
         if(tenPC == null||tenPC.equals(""))
         {
         break;
         }
         System.out.print("nhap loai PC( 1 laptop || 2 desktop ||) : ");
         String loaiPC = sc.nextLine();
         if(loaiPC == null||loaiPC.equals(""))
         {
         break;
         }
         else if(loaiPC.equalsIgnoreCase("1"))
         {
         PC pc = new laptop(tenPC,mamaytinh,loaiPC,dongia,ngaynhap,soluong,loailaptop);
         pc.nhap();
         list.add(pc);
         }
         else if(loaiPC.equalsIgnoreCase("2"))
         {
         PC pc = new desktop(tenPC,mamaytinh,loaiPC,dongia,ngaynhap,soluong,tendesktop);
         pc.nhap();
         list.add(pc);
         }
         
        }
        while(true);
    }
    public void xuat()
    {
     int i=0;
     for(PC pc : list)
     {
      i++;
      System.out.printf(" %d : TenPC %s || loaiPC %s  || DonGia %s || NgayNhapKho %s || Soluong %s || tongsotien %f \n",i,pc.getTenmaytinh(),pc.getLoaimaytinh(),pc.getDongia(),pc.getNgaynhap(),pc.getSl(),pc.tst());
     }
    }
    public void timkiem()
    {
    if(list.size()>0)
    {
    int i=0;
    System.out.println(" nhap ma may tinh can tim kiem ");
    Scanner sc = new Scanner(System.in);
    String tk = sc.nextLine();
       for(PC pc:list)
       {
          i++;
          if(pc.getMamaytinh().equalsIgnoreCase(tk))
          {
          System.out.printf(" ten sp can tim kiem :%d : TenPC %s || loaiPC %s  || DonGia %s || NgayNhapKho %s || Soluong %s || tongsotien %f \n",i,pc.getTenmaytinh(),pc.getLoaimaytinh(),pc.getDongia(),pc.getNgaynhap(),pc.getSl(),pc.tst());
          }
       } 
    } 
    else
    {
    System.out.println(" hien tai danh sach dang trong vui long nhap du lieu truoc khi tiem kiem");
    }
    }
    public void xoa()
    {
        if(list.size()>0){
     System.out.println("nhap ma may tinh can xoa");
     Scanner sc = new Scanner(System.in);
     String tk = sc.nextLine();
     PC pctim = null;
     for(PC pc :list )
     {
       if(pc.getMamaytinh().equalsIgnoreCase(tk))
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
        else
        {
        System.out.println(" hien tai danh sach dang trong vui long nhap du lieu truoc khi thay doi");
        }
    }
  public void sapxepaphalbet()
  {
        Collections.sort(list,new Comparator<PC>()
        {
         @Override
         public int compare( PC s1 , PC s2)
         {
          return String.valueOf(s1.getTenmaytinh()).compareTo(s2.getTenmaytinh());
         }
        });
       System.out.println("Sap xep thanh cong "); 
       xuat();
  }
  public void xoa1()
    {
     if(list.size()>0)
     {
     System.out.println("nhap ma may tinh can xoa");
     Scanner sc = new Scanner(System.in);
     String tk = sc.nextLine();
     PC pctim = null;
     for(PC pc :xuatlist )
     {
       if(pc.getMamaytinh().equalsIgnoreCase(tk))
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
     else
     {
     System.out.println(" hien tai danh sach dang trong vui long nhap du lieu truoc khi thay doi");
     }
    }
  public void tongsotien()
  {
   double tong = 0;
   for (PC pc : list)
   {
   tong = tong+pc.tst();
   }
   System.out.println("tong so tien nhap kho la : "+tong);
  }
   Comparator<PC> sx = new Comparator<PC>()
 {
 @Override
 public int compare(PC o1,PC o2)
 {
 return Double.compare(o1.tst(), o2.tst());
 }
 };
 public void sapxeptst()
 {
  Collections.sort(list, sx);
  System.out.println("sap xep tang dan theo tong so tien ");
  xuat();
 }
  public void dsxuatkho()
  {
   for (PC pc : xuatlist)
   {
   System.out.printf(" TenPC %s || loaiPC %s  || DonGia %s || NgayNhapKho %s || Soluong %s || tongsotien %f \n",pc.getTenmaytinh(),pc.getLoaimaytinh(),pc.getDongia(),pc.getNgaynhap(),pc.getSl(),pc.tst());
   }
  }
  public void thaydoi()
  {
     if(list.size() > 0)
     {
     System.out.println("nhap ma thay doi");
     Scanner sc = new Scanner(System.in);
     String tk = sc.nextLine();
     PC pctim = null;
     for(PC pc :list )
     {
       if(pc.getMamaytinh().equalsIgnoreCase(tk))
       {
        pctim = pc;
       }
       break;
     }
     if(pctim !=null)
     {
      list.remove(pctim);
      pctim.nhap();
      list.add(pctim);
     }
     }
     else
     {
     System.out.println(" hien tai danh sach dang trong vui long nhap du lieu truoc khi thay doi");
     }
  }
    public void menu()
    {
     int chon;
    do
    {
     System.out.println("1:--- nhap du lieu ");
     System.out.println("2:--- ds nhap kho ");
     System.out.println("3:--- tim kiem ");
     System.out.println("4:--- xoa 1 sp nhap kho");
     System.out.println("5:--- sap xep du lieu theo ki tu aphalbet ");
     System.out.println("6:--- sap xep theo tong so tien ");
     System.out.println("7:--- ds xuat kho ");
     System.out.println("8:--- xoa 1 sp xuatkho ");
     System.out.println("9:--- tong so tien PC trong kho");
     System.out.println("10:---thay doi du lieu ");
     System.out.println("0: thoat ");
     chon = sc.nextInt();
       if(chon !=0)
       {
         switch(chon)
         {
           case 1 : nhap();break;
           case 2 : xuat();break;
           case 3 : timkiem();break;
           case 4: xoa();break;
           case 5 :sapxepaphalbet();break;
           case 6 :sapxeptst();break;
           case 7 :dsxuatkho();break;
           case 8 :xoa1();break;
           case 9 :tongsotien();break;
           case 10:thaydoi();break;
         }
       }
    }
    while(chon!=0);
   }
}
