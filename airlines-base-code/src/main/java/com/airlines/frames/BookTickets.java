package com.airlines.frames;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class BookTickets {
	
	public static void bookTickets(){
		final JFrame book=new JFrame("Booking");
		ImageIcon icon=new ImageIcon("src/main/java/image/img2.jpg");
		JMenuItem iconMenuItem = new JMenuItem(icon);
		iconMenuItem.setLocation(10, 10);
		iconMenuItem.setSize(100,100);
		iconMenuItem.setCursor(new Cursor(Cursor.HAND_CURSOR));
		iconMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WelcomeFrame.welcomeFrame();
				book.setVisible(false);
			}
		});
		book.add(iconMenuItem);
		
		JLabel head=new JLabel("Booking Tickets");
		head.setLocation(195, 10);
		head.setSize(200, 100);
		head.setFont(new Font("Courier", Font.BOLD, 20));
		book.add(head);
		
		JLabel flight=new JLabel("Flight Id");
		flight.setLocation(210, 100);
		flight.setSize(150, 50);
		flight.setFont(new Font("Courier", Font.ITALIC, 15));
		book.add(flight);
		
		JTextField flightText=new JTextField();
		flightText.setLocation(360, 118);
		flightText.setSize(60, 20);
		book.add(flightText);
		
		JLabel num=new JLabel("No. of Passenger");
		num.setLocation(210, 150);
		num.setSize(200,50);
		num.setFont(new Font("Courier", Font.ITALIC, 15));
		book.add(num);
		
		JTextField numText=new JTextField();
		numText.setLocation(360,168);
		numText.setSize(60,20);
		book.add(numText);
		JLabel menu1=new JLabel("Book Tickets");
		menu1.setLocation(10,150);
		menu1.setSize(150,100);
		menu1.setFont(new Font("Courier", Font.BOLD, 20));
		menu1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookTickets.bookTickets();
				book.setVisible(false);
			}
		});
		book.add(menu1);
		
		JLabel menu2=new JLabel("Veiw Flights");
		menu2.setLocation(10, 200);
		menu2.setSize(150,100);
		menu2.setFont(new Font("Courier", Font.BOLD,20));
		menu2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menu2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrationFrame.registrationFrame();
				book.setVisible(false);
			}
		});
		book.add(menu2);
		
		JLabel menu3=new JLabel("Booking Status");
		menu3.setLocation(10, 250);
		menu3.setSize(180, 100);
		menu3.setFont(new Font("Courier", Font.BOLD,20));
		menu3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menu3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrationFrame.registrationFrame();
				book.setVisible(false);
			}
		});
		book.add(menu3);
		
		JLabel logout=new JLabel("Logout");
		logout.setLocation(420, 10);
		logout.setSize(80,30);
		logout.setFont(new Font("Courier", Font.ITALIC,15));
		logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Frames obj=new Frames();
				obj.show();
				book.setVisible(false);
			}
		});
		book.add(logout);
				
		book.setLayout(null);
		book.setSize(500,600);
		book.setLocationRelativeTo(null);
		book.setResizable(false);
		book.setVisible(true);
	} 

}
