package tool;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatter {

//	public static void main(String[] args) throws ParseException {
//		
//		
////		String s = "09/24-10/8";
////		String myDate = s.split("-")[0];
////		myDate = "2013/" + myDate;
//		
//		
//	
//		SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy"); 
//		Date date = dt.parse("08/06/2013");
//		
//		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMM-yyyy");
//		System.out.println(dt1.format(date));
//		
//	}
	
	String mDate;
	public DateFormatter(String date){
		this.mDate = date;
			
	}
	
//	String format() throws ParseException{
//		String myDate = mDate.split("-")[0];
//		myDate = "2013/" + myDate;
//		
//		SimpleDateFormat dt = new SimpleDateFormat("yyyy/MM/dd"); 
//		Date date = dt.parse(myDate); 
//		
//		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMM-yyyy");
//		return dt1.format(date);
//	}
	
	public String format(){
		Date date;
		SimpleDateFormat dt1;
		String rt = null;
		try {
			SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy"); 
			date = dt.parse(this.mDate);
			
			dt1 = new SimpleDateFormat("dd-MMM-yyyy");
			rt = dt1.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rt;
	}

}
