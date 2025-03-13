import java.util.Scanner;

public class mainsum01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan numlah elemen: ");
        int elemen = input.nextInt();
        sum01 sm = new sum01(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = input.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Brute Force: "+ sm.totalBF());
        System.out.println("Total keuntungan menggunakan Devide and Conquer: "+ sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
