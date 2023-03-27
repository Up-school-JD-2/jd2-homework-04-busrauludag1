package org.busra;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Album{
    private String name;
    private Composer composer;
    private List<Song> songs;
    private LocalDate publishedDate;
    private BigDecimal price;

    public Album(String name, Composer composer, LocalDate publishedDate){
        this.name = name;
        this.composer = composer;
        this.publishedDate = publishedDate;
        this.songs = new ArrayList<>();
        this.price = BigDecimal.ZERO;
    }

    public String getName() {
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

    public List<Song> getSongs(){
        return songs;
    }
    public void setSongs(List<Song> songs){
        this.songs = songs;
    }

    public LocalDate getPublishedDate(){
        return publishedDate;
    }

    public void addSong(Song song){
        songs.add(song);
        price = price.add(song.getPrice());
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void removeSong(Song song){
        songs.remove(song);
        price = price.subtract(song.getPrice());
    }

    public void printAllSongs(){
        for (Song s: songs){
            System.out.println(s);
        }
    }

    @Override
    public String toString(){
        return "Album {" +
                "Name: " + name + ", " +
                "Composer: " + composer.getName() + ", " +
                "Published Date: " + publishedDate + ", " +
                "Album Total Price: " + price +
                "}" + "\n";
    }


}