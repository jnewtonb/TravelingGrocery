package edu.csc480.helloworld.treu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/get")
public class TreuServlet {
  
  @GET
  public String testGet() {
    return "<style>@keyframes stars{0%{color: red;}14%{color: orange}28%{color: yellow;}42%{color: green;}56%{color: blue;}71%{color: indigo;}85%{color: violet;}100%{color: red;}}</style><span style=\"font-weight:bold;animation-name:stars;animation-duration:10s;animation-iteration-count:infinite;\">Yo.</span>";
  }
}
