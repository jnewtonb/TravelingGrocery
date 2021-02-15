package edu.csc480.helloworld.newton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/newtonEndpoint")
public class NewtonServlet {
    @GET
    public String getString() {
        return "<button type=\"button\">This button does nothing</button>";
    }
}
