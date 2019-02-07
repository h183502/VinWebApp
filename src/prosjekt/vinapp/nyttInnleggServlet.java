package prosjekt.vinapp;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class nyttInnleggServlet
 */
@WebServlet("/nyttInnlegg")
public class nyttInnleggServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private nyVinEAO vEAO;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/nyttinnlegg.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		vinSkjema vinskjema = new vinSkjema(request);
		
		nyVin v = vinskjema.nyAnmeldelse();
		synchronized(v) {
			vEAO.leggTilNyVin(v);
		}
		
		response.sendRedirect("minside");
		
	}

}
