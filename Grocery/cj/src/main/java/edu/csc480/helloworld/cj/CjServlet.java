package edu.csc480.helloworld.cj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/testmessage")
public class CjServlet {

  public String s = "<label for=\"endpoint\">Endpoint</label><input type=\"text\" name=\"endpoint\" spellcheck=false><button type=\"submit\" id=\"button\">Send Ping</button>" ;

  @GET
   public String getRequest() {
    return s;
//     return "<html>
//
//     <title>TestMessage</title>
//
//     <body>
//
//     <div class="form">
//       <label for="endpoint">Endpoint</label>
//       <input type="text" name="endpoint" spellcheck=false>
//
//       <button type="submit" id="button">Send Ping</button>
//     </div>
//
//
//     <script type="text/javascript">
//       const form = {
//
//           endpoint: document.getElementById('endpoint'),
//           submit: document.getElementById('button')
//
//
//       };
//
//       form.submit.addEventListener('click',()=> {
//         console.log('button pressed!');
//
//
//       });
//
//
//     </script>
//     </body>
//     </html>";


   }

}

