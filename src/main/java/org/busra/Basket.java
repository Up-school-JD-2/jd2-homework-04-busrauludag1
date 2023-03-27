package org.busra;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Song> songs;
    private final List<Album> albums;
    private BigDecimal totalPrice = BigDecimal.ZERO;

    public Basket(){
        songs = new ArrayList<>();
        albums = new ArrayList<>();
    }

    public Basket(List<Song> songs, List<Album> albums, BigDecimal totalPrice){
        this.songs = songs;
        this.albums = albums;
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void addAlbum(Album album){
        this.albums.add(album);
        totalPrice = totalPrice.add(album.getPrice());
    }

    public void addSong(Song song){
        this.songs.add(song);
        totalPrice = totalPrice.add(song.getPrice());
    }

    public void removeAlbum(Album album){
        this.albums.remove(album);
        totalPrice = totalPrice.subtract(album.getPrice());
    }

    public void removeSong(Song song){
        this.songs.remove(song);
        totalPrice = totalPrice.subtract(song.getPrice());
    }

    public void purchase(){
        System.out.println("You purchased your basket. Enjoy it...");;
    }

    public void listSongs(){
        for (Song s : this.songs){
            System.out.println(s);
        }
    }

    public void listAlbum(){
        for (Album a : this.albums){
            System.out.println(a);
        }
    }


}
