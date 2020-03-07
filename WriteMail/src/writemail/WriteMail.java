package writemail;

import javax.swing.*;					
import java.awt.*;	

public class WriteMail extends JFrame {                                         //JFrame panelosztály oroklese

	public WriteMail () {							//WritMail objektum letrehozasa,amit main fgvben hasznalunk
		super("Write an e-mail");					//Fejlec elnevezese
		setSize(370, 270);                                              //Panel objektum meretenek megadasa			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                 //Bezarass gomb hozzaadasa a fejlecben
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);             //Elrendezeskezele bevezetese, flow jobbra
		setLayout(flow);                                                //Elrendezeskezelo beallitasa az objektumnal
		
		JPanel row1 = new JPanel();					//row1-es panel letrehozasa
		JLabel toLabel = new JLabel("To:");                             //toLabel cimke letrehozaa
		row1.add(toLabel);                                              //a toLabel cimke hozzaadasa a row1 panelhez az add fg-vel
		JTextField to = new JTextField(24);                             //to szovegmezo letrehozasa 24-es ertekkel
		row1.add(to);                                                   //to cimke hozzaadasa a row1 panelhez az add fgv-el
		add(row1);                                                      //a row1 panel hozzaadasa a WriteMail objektumhoz
		
		JPanel row2 = new JPanel();					//row2-es panel letrehozasa
		JLabel subjectLabel = new JLabel("Subject:");                   //subkjectLabel cimke letrehozasa
		row2.add(subjectLabel);						//subjectLabel cimke hozzaadasa a panelhez
		JTextField subject = new JTextField(24);                        //subject szovegmezo bevezetese
		row2.add(subject);						//subject szovegmezo hozzaadasa a row2 panelhez
		add(row2);							//row2 panelh hozzaadasa a WriteMail objektumhoz
		
		JPanel row3 = new JPanel();					//row3-as panel letrehozasa
		JLabel messageLabel = new JLabel("Message:");                   //messageLabel cimke letrehozasa
		row3.add(messageLabel);						//a messageLabel cimke hozzaadasa a row3 panelhez
		JTextArea message = new JTextArea(4, 22);                       //message szovegterulet letrehozasa, 4,22 keppontban
		message.setLineWrap(true);					//SORKIZART BEALLITAS a bevitt szovegnek, mikor elfogy a sor
		message.setWrapStyleWord(true);                                 //SORKIZART BEALLITAS a bevitt szovegnek, mikor elfogy a sor
		JScrollPane scroll = new JScrollPane(message,                   //scroll gorditosav bevezetese a message szovegterulethez
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,          //fuggoleges gorditosav allando engedelyezese
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);        //vizszintes gorditosav soha ne jelenjen meg 
		row3.add(scroll);                                               //a scroll gorditosav hozzaadasa a row3 panelhez
		add(row3);							// a row3 panel hozzaadasa a WriteMail objektumhoz
	
		JPanel row4 = new JPanel();					//row4-es panel letrehozasa
		JButton send= new JButton("Send");                              //send gomb letrehozasa
		row4.add(send);							//send gomb hozzaadasa a row4 panelhez
		add(row4);                                                      //a row4 panel hozzaadasa a WriteMail objetumhoz
		
		setVisible(true);                                               //az objektum l lathatova tetele
	}
	
	public static void main(String[] arg) {                                 //main vegrehajto fgv meghivasa
		WriteMail mail = new WriteMail();                               //mail nevu WriteMail objektum letrehozasa a futtatashoz
	}
}

