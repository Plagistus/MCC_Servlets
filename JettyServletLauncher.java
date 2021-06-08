import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
 
public class JettyServletLauncher {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);
    ServletHandler handler = new ServletHandler();
    server.setHandler(handler);
    if(args.length==1)
      handler.addServletWithMapping(args[0], "/");
    else
      handler.addServletWithMapping("Usage", "/");
    server.start();
    server.join();
 }
}
