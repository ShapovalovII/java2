
import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import javax.servlet.ServletException;

        import java.io.IOException;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
        import org.eclipse.jetty.server.Request;
        import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.session.SessionHandler;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        SessionHandler sessionHandler = new SessionHandler();
        SessionNotifier sessionNotifier = new SessionNotifier();
        sessionHandler.setHandler(sessionNotifier);

        Server server = new Server(8420);
         server.setHandler(sessionHandler);

        server.start();
        server.join();
    }
}