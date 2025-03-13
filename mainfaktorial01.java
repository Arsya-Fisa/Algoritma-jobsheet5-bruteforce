import java.util.Scanner;

public class mainfaktorial01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilai = input.nextInt();
        
        faktorial01 fk = new faktorial01();
        System.out.println("Nilai Faktorial " + nilai+ " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai+ " menggunakan DC: " + fk.faktorialDC(nilai));
    }
    
   
     

}
