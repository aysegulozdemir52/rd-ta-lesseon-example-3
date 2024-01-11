package org.example;
class Gezegen {
private String ad;
private int siralama;
private double uzaklik; // milyon kilometre cinsinden

private double yaricap; // kilometre cinsinden
private double donmeSuresi; // gün cinsinden

public Gezegen(String ad, int siralama, double uzaklik, double yaricap, double donmeSuresi) {
        this.ad = ad;
        this.siralama = siralama;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }
            // Getter methodları
public String getAd() {
            return ad;
    }
public int getSiralama() {
    return siralama;
}
public double getUzaklik() {
    return uzaklik;
}
public double getYaricap() {
    return yaricap;
}
public double getDonmeSuresi() {
    return donmeSuresi;
}
}

// Gezegenler enum'u
enum Gezegenler {
MERKUR(new Gezegen("Merkür", 1, 57.9, 4878, 116)),
VENUS(new Gezegen("Venüs", 2, 108.2, 12.104, 243.0)),
DUNYA(new Gezegen("Dünya", 3, 149.6, 6371.0, 365)),
MARS(new Gezegen("Mars", 4, 227.9, 3389.5, 687)),
JUPITER(new Gezegen("Jüpiter", 5, 778.5, 69911.0, 4380)),
SATURN(new Gezegen("Satürn", 6, 1433.4, 58232.0, 10948)),
URANUS(new Gezegen("Uranüs", 7, 2872.5, 25362.0, 309000)),
NEPTUN(new Gezegen("Neptün", 8, 4495.1, 24622.0, 1800000));

private Gezegen gezegen;

// Yapıcı (constructor) method
Gezegenler(Gezegen gezegen) {
    this.gezegen = gezegen;
}

// Getter method
public Gezegen getGezegen() {
    return gezegen;
}
}

public class Main {
    public static void main(String[] args) {
        // Gezegenleri listeleme
        for (Gezegenler gezegen : Gezegenler.values()) {
            Gezegen currentGezegen = gezegen.getGezegen();
            System.out.println("Gezegen: " + currentGezegen.getAd());
            System.out.println("Sıralama: " + currentGezegen.getSiralama());
            System.out.println("Uzaklık : " + currentGezegen.getUzaklik());
            System.out.println("Yarıçap : " + currentGezegen.getYaricap());
            System.out.println("Dönme Süresi: " + currentGezegen.getDonmeSuresi());
            System.out.println("-------------------------------");
        }
    }
}