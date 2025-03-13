import java.util.Scanner;
public class mainpangkat01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = input.nextInt();
        pangkat01 [] png = new pangkat01[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masuakan nilai basis elemen ke-" + (i+1)+ ": ");
            int basis = input.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-" + (i+1)+ ": ");
            int pangkat  = input.nextInt();
            png[i] = new pangkat01(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (pangkat01 p: png){
            System.out.println(p.nilai+"^"+ p.pangkat+": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DEVIDE AND CONQUER: ");
        for (pangkat01 p: png){
            System.out.println(p.nilai+"^"+ p.pangkat+": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
