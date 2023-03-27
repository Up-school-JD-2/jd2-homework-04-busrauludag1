package org.busra;

import java.util.List;

public class Composer {
    private String name;
    private List<Song> songs;
    private List<Album> albums;

    public Composer(String name){
        this.name = name;

    }
    public Composer(String name, List<Song> songs, List<Album> albums){
        this.name = name;
        this.songs = songs;
        this.albums = albums;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Song> getSong() {
        return songs;
    }

    public void setSong(List<Song> songs) {
        this.songs = songs;
    }

    public List<Album> getAlbum() {
        return albums;
    }

    public void setAlbum(List<Album> albums) {
        this.albums = albums;
    }
}
