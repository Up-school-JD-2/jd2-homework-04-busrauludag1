package org.busra;

import java.math.BigDecimal;

public class Song {
    private String name;
    private Composer composer;
    private Album album;
    private BigDecimal price;

    public Song(String name, Composer composer, Album album, BigDecimal price){
        this.name = name;
        this.composer = composer;
        this.album = album;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Composer getSinger(){
        return composer;
    }

    public void setSinger(Composer composer){
        this.composer = composer;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album){
        this.album = album;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Song {" +
                "Name: " + name + ", " +
                "Album: " + album.getName() + ", " +
                "Composer: " + composer.getName() + ", " +
                "Price: " + price +
                "}" + "\n";
    }
}
