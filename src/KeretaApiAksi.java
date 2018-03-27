/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W7
 */
public class KeretaApiAksi {
    public static void main(String[] args) {
        KeretaApi Eksekutif = new KeretaApi();
        KeretaApi Bisnis = new KeretaApi();
        KeretaApi Ekonomi = new KeretaApi();
        
        Eksekutif.Harga = "Mahal";
        Eksekutif.Ac = "Full";
        Eksekutif.Jml_kursi = "50";
        Eksekutif.Tv = "Full";
        Eksekutif.Kecepatan = "200";
                
        Bisnis.Harga = "Sedang";
        Bisnis.Ac = "Sebagian";
        Bisnis.Jml_kursi = "64";
        Bisnis.Tv = "Sebagian";
        Bisnis.Kecepatan = "150";
                
        Ekonomi.Harga = "Murah";
        Ekonomi.Ac = "Tidak";
        Ekonomi.Jml_kursi = "80";
        Ekonomi.Tv = "Tidak";
        Ekonomi.Kecepatan = "120";
        
        Eksekutif.cetakinfo();
        Bisnis.cetakinfo();
        Ekonomi.cetakinfo();
    }
}
