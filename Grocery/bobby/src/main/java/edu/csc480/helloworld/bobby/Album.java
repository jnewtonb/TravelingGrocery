package edu.csc480.helloworld.bobby;

public class Album {
    private String name;
    private String artist;

    public Album(){}

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
    }

    public String getAlbumName(){
        return name;
    }
    public void setAlbumName(String name){
        this.name = name;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }

}