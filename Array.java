package week004;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Program Input Array");
        System.out.println("");

        int jumlahArr;
        System.out.print("Berapa jumlah data yang ingin diinputkan? : ");
        jumlahArr = masukan.nextInt();


        int[] dataKu = new int[jumlahArr];

        System.out.println("Input data");
        for (int i = 0; i < jumlahArr; i++) {
            System.out.print("Input data ke-" + (i + 1) + " : ");
            dataKu[i] = masukan.nextInt();
        }


        System.out.println("");


        //Program output data
        System.out.print("Data anda = ");
        for (int i = 0; i < jumlahArr; i++) {
            System.out.print(dataKu[i] + ", ");
        }
        System.out.println("");


        // Dalam Java, Array di deklarasikan di tipe datanya. Slot di akhirnya 
        // Integer(6);
        int[] angka = new int[6];
        angka[2] = 10;
        angka[5] = 90;

        //angka.length itu memberikan kita info jumlah nilai dari variabel angka[]
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > 0) {
                System.out.println("angka " + angka[i] + " ditemukan pada Urutan ke-" + (i + 1));
            }
        }
        System.out.println("");



        // Array lgsg di Assignment
        String[] kata = {"udang", "tembok", "lembah", "bani"};

        System.out.print("Kata - kata hari ini : ");
        for (int i = 0; i < kata.length; i++) {
            System.out.print(kata[i] + ", ");
        }
        System.out.println("");



        // Array Multidimensi
        int[][] multi = new int[2][3];

        System.out.println("Array Multidimensi");

        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Input index ke-[" + i + "] [" + j + "] : ");
                multi[i][j] = masukan.nextInt();
            }
        }  

        // OUTPUT
        System.out.println("");
        System.out.println("OUTPUT");
        for(int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.println("Index ke-[" + i + "] [" + j + "] : " +  multi[i][j]);
            }
        }         

        
        }     


    }

}