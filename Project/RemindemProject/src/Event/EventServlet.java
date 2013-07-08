package Event;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EventServlet
 */
@WebServlet("/EventServlet")
public class EventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EventServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String x = (String) request.getAttribute("name");
		System.out.println(x);
		
		System.out.println("In the Login Servlet");
        EventCreate user = new EventCreate();
        user.setEventName(request.getParameter("name"));
        //user.setPassword(request.getParameter("password"));
        //user = LoginDAO.login(user);
//        if(user.isValid())
//        {
//            HttpSession session = request.getSession(true);
//            session.setAttribute("currentSessionUser",user);
//            response.sendRedirect("LoginSuccess.jsp");
//        }else
//            response.sendRedirect("LoginFailed.jsp");
//    } catch (Throwable exc)
//    {
//        System.out.println(exc);
//    }
//}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
