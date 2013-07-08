package event;
import java.util.ArrayList;
import java.util.Date;


public class EventBean {
	//event attributes
	int EventID;
	String EventName;
	String Address;
	Date StartDate;
	Date EndDate;
	int NumberOfGuests;
	String StartTime;
	String EndTime;
	ArrayList<String> EmailList;
	String Comment;
	
	

	EventBean() {
		
	}
	
	//getters and setters
	public int getEventID() {
		return EventID;
	}
	public void setEventID(int eventID) {
		EventID = eventID;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public Date getDate() {
		return StartDate;
	}
	public void setDate(Date date) {
		this.StartDate = date;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		this.EndDate = endDate;
	}
	public int getNumberOfGuests() {
		return NumberOfGuests;
	}
	public void setNumberOfGuests(int numberOfGuests) {
		NumberOfGuests = numberOfGuests;
	}
	public String getTime() {
		return StartTime;
	}
	public void setTime(String time) {
		this.StartTime = time;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public ArrayList<String> getEmailList() {
		return EmailList;
	}
	public void setEmailList(ArrayList<String> emailList) {
		EmailList = emailList;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		this.Comment = comment;
	}
}
