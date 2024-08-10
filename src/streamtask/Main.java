package streamtask;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ogrenci> ogrenciler = Arrays.asList(
                new Ogrenci(1, "Ali", 20, "Bilgisayar Mühendisliği", 3.8),
                new Ogrenci(3, "Cem", 21, "Fizik", 3.6),
                new Ogrenci(2, "Bora", 22, "Matematik", 3.2),
                new Ogrenci(4, "Deniz", 19, "Bilgisayar Mühendisliği", 3.9),
                new Ogrenci(5, "Elif", 20, "Matematik", 2.8),
                new Ogrenci(6, "Furkan", 23, "Fizik", 3.7),
                new Ogrenci(7, "Gizem", 22, "Biyoloji", 3.1),
                new Ogrenci(8, "Hakan", 21, "Bilgisayar Mühendisliği", 3.5),
                new Ogrenci(9, "Irem", 20, "Matematik", 3.3),
                new Ogrenci(10, "Jakob", 24, "Biyoloji", 3.0)
        );


        OgrenciYonetimSistemi sistem = new OgrenciYonetimSistemi(ogrenciler);

        System.out.println("ADA GORE SIRALANMIS");
        sistem.adaGoreSirala().forEach(x -> System.out.println(x));
        System.out.println("--------------------------------------");

        System.out.println("EN GENC TELEBE");
        System.out.println(sistem.enGencOgrenci());
        System.out.println("____________________________________________");

        System.out.println("MUEYYEN HERF ILE BASLAYANLAR");
        System.out.println(sistem.belirliBirHarfIleBaslayanlar("A"));
        System.out.println("____________________________________________");

        System.out.println("EN YUKSEK NOTA SAHIB N TELEBE");
        System.out.println(sistem.enYuksekNotOrtalamasinaSahibNOgrecni(3,3));
        System.out.println("____________________________________________");

        System.out.println("TELEBE ADLARI");
        System.out.println(sistem.ogreciIsimleri());
        System.out.println("____________________________________________");

        System.out.println("NOT ORTALAMALARI UMUMI");
        System.out.println(sistem.OrtalamaNotHesapla());
        System.out.println("____________________________________________");

        System.out.println("YUKSEK NOTA SAHIB TELEBELER");
        System.out.println(sistem.yuksekNotOrtalamalioyrenciler(2.8));
        System.out.println("____________________________________________");





    }
}
