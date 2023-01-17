import java.util.Scanner;

public class KdvTutariniHesaplayanProgram {
    public static void main(String[] args) {

/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */

        double tutar, kdvOrani = 0.18, kdvTutari, kdvliTutari;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarını giriniz : ");
        tutar = input.nextDouble();

        kdvTutari = tutar * kdvOrani;
        kdvliTutari = tutar + kdvTutari;

        System.out.println("Kdv Oranı : " + kdvOrani);

        System.out.println("Kdv Tutarı : " + kdvTutari);

        System.out.println("Kdv dahil olmadan Tutar : " + tutar);

        System.out.println("Kdv dahil tutar : " + kdvliTutari);




    }
}
