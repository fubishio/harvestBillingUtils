import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class client {
	private String client;
	private ArrayList<Date> date;
	private ArrayList<String> project;
	//Project Code
	private ArrayList<String> Task;
	private ArrayList<String> Notes;
	private ArrayList<Integer> Hours;
	private ArrayList<Integer> HoursRounded;
	private ArrayList<String> Billable;
	private ArrayList<String> Invoiced;
	private ArrayList<String> FirstName;
	private ArrayList<String> LastName;
	private ArrayList<String> Employee;
	//External Reference URL
	
	//must have
	private HashMap<String, Integer> maxTaskHours;
	
	int dateCounter;
	
	private ArrayList<tuple> entries;
	
	public client(String clientname){
		client = clientname;
		date = new ArrayList<Date>();
		project = new ArrayList<String>();
		Task = new ArrayList<String>();
		Notes = new ArrayList<String>();
		Hours = new ArrayList<Integer>();
		HoursRounded = new ArrayList<Integer>();
		Billable = new ArrayList<String>();
		Invoiced = new ArrayList<String>();
		FirstName = new ArrayList<String>();
		LastName = new ArrayList<String>();
		Employee = new ArrayList<String>();
	}
	
	public void insertEntry(Date iDate, int iHours, String iProject, String iTask){
		tuple tempen = new tuple(iDate, iHours, iProject, iTask);
		entries.add(tempen);
	}
	
	public int timeLeft(int maxTime, String iTask){
		int index = 0;
		int timeCounter = 0;
		int entryreader = 0;
		while(entries.get(index) != null){
			
			timeCounter = timeCounter + entries.get(index).hours;
			index++;
		}
		return 0;
	}
	
}
