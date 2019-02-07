package prosjekt.vinapp;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.cxf.transport.http.HTTPSession;


@WebServlet("/registrering")
public class registreringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@EJB
	private brukerEAO bEAO;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("WEB-INF/registrer.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Skjema skjema = new Skjema(request);
		
		if(!bEAO.finnesBrukernavn(skjema.getBrukernavn())){
			HttpSession sesjon = request.getSession(false);
			if(sesjon != null) {
				sesjon.invalidate();
			}
			
			sesjon = request.getSession(true);
			
			sesjon.setMaxInactiveInterval(1000);
			
			sesjon.setAttribute("loggedIn", skjema.getBrukernavn());
			
			bruker b = skjema.opprettBruker();
			synchronized(b) {
				bEAO.leggTilBruker(b);
			}
			
			skjema.gjemPassord();
			
			response.sendRedirect("minside");
		}
	}

}
