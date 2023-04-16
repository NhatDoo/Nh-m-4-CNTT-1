
package qlmtconsole;

import java.util.Scanner;
public class main 
{
    public static void main(String[] arg)
    {
    Scanner sc = new Scanner(System.in);
    linhkienlist l1 = new linhkienlist();
    List l = new List();
    int chon;
    do
    {
    System.out.println("Quan ly PC System");
    System.out.println("1--Quan ly PC ");  
    System.out.println("2--Quan ly linh kien PC ");
    chon= sc.nextInt();
        if(chon !=0)
        {switch(chon)
        {
            case 1: l.menu();break;
            case 2:l1.menu();break;
        }
        }
    }
    while(chon != 0);
    }
}
