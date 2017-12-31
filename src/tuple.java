import java.util.Date;

public class tuple {
	public final Date date;
	public final int hours;
	public final String projectName;
	public final String taskName;
	public tuple(Date date, int hours, String projectName, String taskName){
		this.date = date;
		this.hours = hours;
		this.projectName = projectName;
		this.taskName = taskName;
	}
}