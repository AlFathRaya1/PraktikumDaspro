package jobsheet5;
import java.util.Scanner;
public class Tugas3_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan User : ");
        String user = sc.nextLine();

        if (user.equalsIgnoreCase("dosen")) {
            System.out.println("akses diberikan");
        }else if (user.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukan Jumlah SKS : ");
            int sks = sc.nextInt();
            if(sks >= 12) {
                System.out.println("Akses diberikan");
            }else {
                System.out.println("Akses ditolak");
            }
        }
    }
}