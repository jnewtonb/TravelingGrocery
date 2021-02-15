package edu.csc480.helloworld.bobby;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/bobby")
public class bobbyApplication extends Application{
    public Set<Class<?>> getClasses(){
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(AlbumResource.class);
        return classes;
    }
}
