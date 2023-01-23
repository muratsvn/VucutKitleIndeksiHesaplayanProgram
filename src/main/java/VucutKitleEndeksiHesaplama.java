import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Kilo (kg) / Boy(m) * Boy(m)
        */

        double boy, kilo, vki;

        Scanner inputBoy = new Scanner(System.in);

        Scanner inputKilo = new Scanner(System.in);

        System.out.print("Lütfen boyunuz (metre cinsinden) giriniz : ");
        boy = inputBoy.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inputKilo.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle Endeksiniz : " + vki);



    }
}
