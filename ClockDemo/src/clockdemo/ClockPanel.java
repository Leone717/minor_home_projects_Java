package clockdemo;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ClockPanel extends JPanel {
	public ClockPanel() {
		super();
		String currentTime = getTime();
		JLabel time = new JLabel ("Time: ");
		JLabel current = new  JLabel(currentTime);
		add(time);
		add(current);
	}
		
	String getTime() {
		String time;

		Calendar now = Calendar.getInstance();
		int hour = now.get (Calendar.HOUR_OF_DAY);	// a Calendar class now objektumot kijelolve get-tel kerjuk ki 
		int minute = now.get (Calendar.MINUTE);		// a Calendar aktualis elemet az ido eleminek leirasara
		int month = now.get (Calendar.MONTH) + 1;	// az januar 0-as honap, ugy hozzaadunk egyet
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);

		String monthName = "";
		switch (month) {				//month valtozok kozt kapcsolgatunk
			case 1:
				monthName = "January";		//ha month erteke 1, akkor January kiirasa
				break;				//szunet, nem futtatta a tobbit
			                                        //ha a break-et kivesszuk, akkor vegrehata a masik parancsot
                                                                //egeszen a break-ig

			case 2:
				monthName ="February";
				break;
			case 3:
				monthName ="March";
				break;
			case 4:
				monthName ="April";
				break;
			case 5:
				monthName ="May";
				break;
			case 6:
				monthName ="June";
				break;
			case 7:
				monthName ="July";
				break;
			case 8:
				monthName ="August";
				break;
			case 9:
				monthName ="September";
				break;
			case 10:
				monthName ="October";
				break;
			case 11:
				monthName ="November";
				break;
			case 12:
				monthName ="December";
		}
		time = monthName + " " + day + ", " + year + " " + hour + ":" + minute;
		return time;
	}
}