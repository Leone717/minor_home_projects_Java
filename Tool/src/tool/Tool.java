package tool;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tool extends JFrame {
	public Tool() {							
		super("Tool");					
		setSize(370, 200);									
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//eszk�zt�rgombok l�trahoz�sa
		ImageIcon image1 = new ImageIcon("C:\\Users\\Mike\\Documents\\NetBeansProjects\\Tool\\src\\tool/newfile.png");
		JButton button1 = new JButton(image1);
		ImageIcon image2 = new ImageIcon("C:\\Users\\Mike\\Documents\\NetBeansProjects\\Tool\\src\\tool/openfile.png");
		JButton button2 = new JButton(image2);
		ImageIcon image3 = new ImageIcon("C:\\Users\\Mike\\Documents\\NetBeansProjects\\Tool\\src\\tool/savefile.jpg");
		JButton button3 = new JButton(image3);
		
		//eszk�zt�r l�trehoz�sa
		JToolBar bar = new JToolBar();
		bar.add(button1);
		bar.add(button2);
		bar.add(button3);
		
		//sz�vegmez� l�trehoz�sa
		JTextArea edit = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		
		//keret l�trehoz�sa
		BorderLayout border = new BorderLayout();
		setLayout(border);
		add("North", bar);
		add("Center", scroll);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Tool frame = new Tool();
	}
}
