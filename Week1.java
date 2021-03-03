package oop;
import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) 
    {
        //nomor 1
        int a;
        System.out.println("Enter an integer for seconds : ");
        Scanner detik = new Scanner(System.in);
        a = detik.nextInt();
        System.out.println(a + " seconds is " + a/60 + " minutes and " + a%60 + " seconds");
    
        //nomor 2
        System.out.println("Jika hari ini adalah hari Senin, hari apakah dalam 1000 hari berikutnya?");
        int hari;
        hari = 1000 % 7;
        System.out.println("Jika hari ini adalah hari Senin 1000 hari berikutnya adalah hari");
        switch (hari)
        {
            case 0:
            {
                System.out.println("Senin");
            }
            case 1:
            {
                System.out.println("Selasa");
            }
            case 2:
            {
                System.out.println("Rabu");
            }
            case 3:
            {
                System.out.println("Kamis");
            }
            case 4:
            {
                System.out.println("Jumat");
            }
            case 5:
            {
                System.out.println("Sabtu");
            }
            case 6:
            {
                System.out.println("Minggu");
            }
        }
        
    }
    
}
