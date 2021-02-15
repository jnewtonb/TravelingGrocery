package edu.csc480.helloworld.bobby;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/albums")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AlbumResource {
    @GET
    public Collection<Album> listAlbums(){
        return RecordShop.getRecordStore().viewAllAlbums();
    }
    @Path("/{albumName}")
    @DELETE
    public Album takeAlbum(@PathParam("albumName") String albumName){
        return RecordShop.getRecordStore().takeAlbum(albumName);
    }
    @POST
    public void depositAlbum(Album newAlbum){
        RecordShop.getRecordStore().depositAlbum(newAlbum);
    }
    @Path("/{albumName}")
    @PUT
    public void updateAlbum(@PathParam("albumName") String albumName, Album newAlbum){
        RecordShop.getRecordStore().updateAlbum(albumName, newAlbum);
    }
}
