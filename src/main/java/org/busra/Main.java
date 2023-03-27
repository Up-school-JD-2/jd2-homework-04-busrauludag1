package org.busra;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Hans Zimmer and his album's songs
        LocalDate albumPublishedDate = LocalDate.of(2002, 04, 24);
        Composer composer = new Composer("Hans Zimmer");
        Album album = new Album("Inception", composer, albumPublishedDate);
        Song timeSong = new Song("Time", composer, album, BigDecimal.valueOf(10));
        Song hrfSong = new Song("Half Remembered Dream", composer, album, BigDecimal.valueOf(100));
        Song dcSong = new Song("Dream is Collapsing", composer, album, BigDecimal.valueOf(50));

        album.addSong(timeSong);
        album.addSong(hrfSong);
        album.addSong(dcSong);


        System.out.println(album);
        System.out.println("SONGS of ALBUM");
        album.printAllSongs();


        // Single song
        LocalDate singlePublishedDate = LocalDate.of(2011, 03, 10);
        Composer singleComposer = new Composer("Ludovico Einaudi");
        Album singleAlbum = new Album("Single Album", singleComposer, singlePublishedDate);
        Song singleSong = new Song("Single Music", composer, singleAlbum, BigDecimal.valueOf(70));
        System.out.println("SINGLE ALBUM");
        System.out.println(singleSong);

        // Sepete album ve single song ekle
        Basket basket = new Basket();
        basket.addAlbum(album);
        basket.addSong(singleSong);
        System.out.println("ALBUMS & SONGS in the basket: ");
        basket.listAlbum();
        basket.listSongs();

        // Customer'a sepet assign edildi
        Customer busra = new Customer("Busra", "Uludag");
        busra.setBasket(basket);

        System.out.println(busra);

        basket.purchase();

    }
}