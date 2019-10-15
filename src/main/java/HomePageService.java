import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/index")
public class HomePageService {
    @GET
    public Response getItems () {
        String r = " Welcome to John Galt";
        return Response. ok (r ). build ();
    }
}
