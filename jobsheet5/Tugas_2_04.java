package jobsheet5;

import java.util.Scanner;
public class Tugas_2_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input angka: ");
        int angka = sc.nextInt();

        if(angka % 2 == 0) {
            System.out.println("ini adalah angka genap");            
        }else {
            System.out.println("ini adalah angka ganjil");
        }
    }
}