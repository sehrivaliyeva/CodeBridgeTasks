package streamtask;

public class Ogrenci {
    private int id;

    private String ad;
    private int yash;
    private String bolum;
    private double notOrtalama;

    public Ogrenci(int id, String ad, int yash, String bolum, double notOrtalama) {
        this.id = id;
        this.ad = ad;
        this.yash = yash;
        this.bolum = bolum;
        this.notOrtalama = notOrtalama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYash() {
        return yash;
    }

    public void setYash(int yash) {
        this.yash = yash;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getNotOrtalama() {
        return notOrtalama;
    }

    public void setNotOrtalama(double notOrtalama) {
        this.notOrtalama = notOrtalama;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", yash=" + yash +
                ", bolum='" + bolum + '\'' +
                ", notOrtalama=" + notOrtalama +
                '}';
    }
}
