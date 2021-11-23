package myString;
import java.util.Date;
import java.text.SimpleDateFormat;
public class StringtoDate {
	public static void main(String[] args) throws Exception
    {

        String strDate = "01/03/1997";
 
        Date date = new SimpleDateFormat("dd/mm/yyyy").parse(strDate);

        System.out.print(strDate + " " + date);
    }

}
