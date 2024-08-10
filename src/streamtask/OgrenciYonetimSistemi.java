package streamtask;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class OgrenciYonetimSistemi {
    private List<Ogrenci> ogrenciler;

    public OgrenciYonetimSistemi(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }


    public List<Ogrenci> yuksekNotOrtalamalioyrenciler(double minNotOrtalamasi) {
        return ogrenciler.stream()
                .filter(x -> x.getNotOrtalama() > minNotOrtalamasi)
                .collect(Collectors.toList());
    }


    public List<Ogrenci> adaGoreSirala() {
        return ogrenciler.stream()
                .sorted(Comparator.comparing(Ogrenci::getAd))
                .collect(Collectors.toList());
    }

    public List<String> ogreciIsimleri() {
        return ogrenciler.stream()
                .map(x -> x.getAd())
                .collect(Collectors.toList());
    }

    public OptionalDouble OrtalamaNotHesapla() {
        OptionalDouble ortalama = ogrenciler
                .stream()
                .mapToDouble(x -> x.getNotOrtalama()).average();
        return ortalama;

    }

    public Optional<Ogrenci> enGencOgrenci() {
        return ogrenciler.stream()
                .min(Comparator.comparingInt(Ogrenci::getYash));
    }

    public List<Ogrenci> enYuksekNotOrtalamasinaSahibNOgrecni(int n,double b) {
        return ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNotOrtalama).reversed())
                .filter(x->x.getNotOrtalama()< b)
                .limit(n)
                .collect(Collectors.toList());
    }

    public List<Ogrenci> belirliBirHarfIleBaslayanlar(String mueyyenHerf) {
        return ogrenciler.stream()
                .filter(x -> x.getAd().startsWith(mueyyenHerf))
                .collect(Collectors.toList());
    }


}
