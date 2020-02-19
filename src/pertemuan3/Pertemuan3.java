package pertemuan3;

public class Pertemuan3 {

    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bangun = new BangunDatar();
        
        // membuat objek persegi dan mengisi nilai properti
        Persegi kotak = new Persegi();
        kotak.sisi = 2;
        
        // memanggil method luas dan keliling
        bangun.luas();
        bangun.keliling();
        
        kotak.luas();
        kotak.keliling();

    }
}  
