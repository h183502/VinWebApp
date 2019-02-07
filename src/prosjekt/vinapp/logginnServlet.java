package prosjekt.vinapp;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logginn")
public class logginnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@EJB
	private brukerEAO bEAO;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("WEB-INF/logginn.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		loggInnSkjema skjemaLogg = new loggInnSkjema(request);
		
		if(skjemaLogg.sjekkInnlogging(bEAO)) {
			HttpSession sesjon = request.getSession(false);
			if(sesjon != null) {
				sesjon.invalidate();
			}
			sesjon = request.getSession(true);
			
			sesjon.setMaxInactiveInterval(1000);
			sesjon.setAttribute("loggedIn", skjemaLogg.getBrukernavn());
			response.sendRedirect("minside");
		}else {
			skjemaLogg.feilMelding();
			request.getSession().setAttribute("skjemaLogg", skjemaLogg);
			response.sendRedirect("logginn");
		}
		
	}

}
