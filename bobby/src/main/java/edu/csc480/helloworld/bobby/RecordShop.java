package edu.csc480.helloworld.bobby;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RecordShop {
    private static RecordShop INSTANCE = new RecordShop();

    private RecordShop(){ //key albumName, value is album object
        albums.put("Acid Rap",new Album("Acid Rap", "Chance the Rapper"));
        albums.put("JEFFERY", new Album("JEFFERY", "Young Thug"));
        albums.put("AudioSlave",new Album("AudioSlave","AudioSlave"));
        albums.put("Madvillainy", new Album("Madvillainy", "MF Doom"));
    }

    public static RecordShop getRecordStore(){
        return INSTANCE;
    }
    private Map<String, Album> albums = new HashMap<>();

    public Collection<Album> viewAllAlbums(){
        return albums.values();
    }
    public Album takeAlbum(String albumName){
        return albums.remove(albumName);
    }
    public void depositAlbum(Album newAlbum){
        System.out.println(newAlbum.getAlbumName() + " " + newAlbum.getArtist());
        albums.put(newAlbum.getAlbumName(),newAlbum);
    }
    public void updateAlbum(String albumName, Album updatedAlbum){
        albums.put(albumName,updatedAlbum);
    }
}
