package day04;

import java.util.Scanner;

public class P02_nestedIfElse {
    public static void main(String[] args) {
        //-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen almak istediginiz urun adedini giriniz:");
        int adet = scan.nextInt();
        System.out.println("Urun Listesi fiyati");
        double fiyat = scan.nextDouble();

        System.out.println(" T127 Kart kullaniyor musunuz? E/H");
        char kart = scan.next().charAt(0);

        if (kart == 'E' || kart == 'e') {
            if (adet > 10) {
                System.out.println("% 15 Musteri Indirimli toplam tutar : " + ((adet * fiyat) * (0.85)));

            } else {
                System.out.println("% 10 Musteri Indirimli toplam tutar : " + ((adet * fiyat) * (0.9)));
            }


        }
    }

}
