import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		//data to string
		String strDate = df.format(d);
		System.out.println(strDate);
		Date d1;
		try {
			d1 = df.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(d1);
	}

}
