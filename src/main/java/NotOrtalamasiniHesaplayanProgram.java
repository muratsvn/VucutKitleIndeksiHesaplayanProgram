import java.util.Scanner;

public class NotOrtalamasiniHesaplayanProgram {

    //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
    // ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

    //Ödev
    //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
    // 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik notunuzu giriniz");
        mat=input.nextDouble();

        System.out.println("Fizik notunuzu giriniz");
        fizik= input.nextDouble();

        System.out.println("Kimya notunuzu giriniz");
        kimya=input.nextDouble();

        System.out.println("Türkçe notunuzu giriniz");
        turkce =input.nextDouble();

        System.out.println("Tarih notunuzu giriniz");
        tarih=input.nextDouble();

        System.out.println("Müzik notunuzu giriniz");
        muzik=input.nextDouble();

        double toplam= mat+fizik+kimya+turkce+mat+tarih;
        double sonuc=toplam/6;
        System.out.println("Ortalamanız : " + sonuc);
        String b = (sonuc >=60) ? "Sınıfı Geçtiniz  " : "Sınıfta Kaldı ";
        System.out.println(b);



    }
}
