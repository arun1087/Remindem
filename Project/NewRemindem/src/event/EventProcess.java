package event;

import java.io.IOException;
import java.util.ArrayList;
import mail.Mailer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EventProcess
 */
@WebServlet(name = "EventServlet", urlPatterns = { "/EventServlet" })
public class EventProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EventProcess() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EventBean eb = new EventBean();
		ArrayList<String> temp = new ArrayList<String>();
		String tempArr [] = null;
		if((String) request.getParameter("ename")!=null)
		{
			eb.setEventName((String) request.getParameter("ename"));
			eb.setAddress((String) request.getParameter("eaddress"));
			eb.setNumberOfGuests(Integer.parseInt((String) request.getParameter("enumofguests")));
			eb.setTime((String) request.getParameter("estarttime"));
			eb.setEndTime((String) request.getParameter("eendtime"));
			eb.setComment((String) request.getParameter("comments"));

			String emails = (String) request.getParameter("emails");		
			tempArr = emails.split(",");
			for(int i=0;i<tempArr.length; i++){
				temp.add(tempArr[i]);
			}
			eb.setEmailList(temp);
			Mailer.sendMail("remindthepeople@gmail.com","copyrights","smtp.gmail.com","465","true",
					"true",true,"javax.net.ssl.SSLSocketFactory","false",eb.getEmailList(),null,eb.getEventName(),eb.getComment());  
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is post");
	}

}
