package mail;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer
{
	//    public static void main(String[] args)
	//    {
	//               // String[] to={"arun1087@gmail.com"};
	//                String cc="arun1087@gmail.com";
	//                Scanner scanIn = new Scanner(System.in);
	//                System.out.println("enter to who you want to send email");
	//                String to_email = scanIn.nextLine();
	//                System.out.println("enter the subject of the reminder");
	//                String to_subject = scanIn.nextLine();
	//                System.out.println("Enter the reminder");
	//                String to_reminder = scanIn.nextLine(); 
	//          
	//                scanIn.close(); 
	//
	//
	//                        SendMail.sendMail("remindthepeople@gmail.com","copyrights","smtp.gmail.com","465","true",
	//"true",true,"javax.net.ssl.SSLSocketFactory","false",to_email,cc,to_subject,to_reminder);             
	//    }

	public synchronized static boolean sendMail(String userName,String passWord,String host,String port,String starttls,
			String auth,boolean debug,String socketFactoryClass,String fallback,ArrayList<String> to,ArrayList<String> cc,String subject,String text){
		Properties props = new Properties();
		//Properties props=System.getProperties();
		props.put("mail.smtp.user", "remindthepeople@gmail.com");
		props.put("mail.smtp.host", host);
		if(!"".equals(port))
			props.put("mail.smtp.port", port);
		if(!"".equals(starttls))
			props.put("mail.smtp.starttls.enable",starttls);
		props.put("mail.smtp.auth", auth);
		if(debug){
			props.put("mail.smtp.debug", "true");
		}else{
			props.put("mail.smtp.debug", "false");         
		}
		if(!"".equals(port))
			props.put("mail.smtp.socketFactory.port", port);
		if(!"".equals(socketFactoryClass))
			props.put("mail.smtp.socketFactory.class",socketFactoryClass);
		if(!"".equals(fallback))
			props.put("mail.smtp.socketFactory.fallback", fallback);

		try
		{
			Session session = Session.getDefaultInstance(props, null);
			session.setDebug(debug);
			MimeMessage msg = new MimeMessage(session);
			msg.setText(text);
			msg.setSubject(subject);
			//msg.setFrom(new InternetAddress("arun1087@gmail.com"));
			for(int i=0;i<to.size();i++){
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to.get(i)));
			}
			if(cc!=null && !cc.equals("")){
				for(int i=0;i<cc.size();i++){
					msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc.get(i)));
				}
			}
			//                        for(int i=0;i<bcc.length;i++){
			//            msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));
			//                        }
			msg.saveChanges();
			Transport transport = session.getTransport("smtp");
			transport.connect(host, userName, passWord);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
			return true;
		}
		catch (Exception mex)
		{
			mex.printStackTrace();
			return false;
		}
	}


}
