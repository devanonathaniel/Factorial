import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
     while(true){

        System.out.print("Masukan angka anda: ");
        int angka = masuk.nextInt();
        int a = 1;

        if (angka == 0) {
            System.out.println("Perkalian faktorial anda adalah: 1");
            System.out.println("Hasil perkalian faktorial anda adalah: 1");
            break;
            
        } else {
            for (int i = 1; i <= angka; i++) {
                a = a * i;
            }

            System.out.print("Perkalian faktorial anda adalah: ");
            for (int j = angka; j > 0; j--) {
                System.out.print(j);
                if (j != 1) {
                    System.out.print("x");
                }
            }
            System.out.println("\nHasil perkalian faktorial anda adalah: " + a);
        }}
    }
}