import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int sayi,toplam=0;
        System.out.print("Sayı Giriniz: ");
        sayi=input.nextInt();
        if(sayi<0)
        {
            System.out.println("Lütfen Pozitif Bir Tam Sayı Giriniz.");
        } else if (sayi==0)
        {
            System.out.println("Lütfen Sıfırdan Farklı Bir Sayı Giriniz.");
        }
        else
        {
            for (int i = sayi; i > 0; i /= 10) {
                toplam += i % 10;
            }

        System.out.println(sayi +" sayısının basamak degerleri toplamı: "+toplam);}
    }
}