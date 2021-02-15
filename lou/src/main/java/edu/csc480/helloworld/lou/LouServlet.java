package edu.csc480.helloworld.lou;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ping")
public class LouServlet {

    @GET
    public String response() { return "<i>pong<i>"; }
}
