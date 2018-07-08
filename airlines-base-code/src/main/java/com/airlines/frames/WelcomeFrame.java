package com.airlines.frames;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

public class WelcomeFrame {
	
	public static void welcomeFrame(){
		final JFrame log=new JFrame("Welcome");
		ImageIcon icon=new ImageIcon("src/main/java/image/img2.jpg");
		JMenuItem iconMenuItem = new JMenuItem(icon);
		iconMenuItem.setLocation(10, 10);
		iconMenuItem.setSize(100,100);
		iconMenuItem.setCursor(new Cursor(Cursor.HAND_CURSOR));
		iconMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WelcomeFrame.welcomeFrame();
				log.setVisible(false);
			}
		});
		log.add(iconMenuItem);
		
		JLabel menu1=new JLabel("Book Tickets");
		menu1.setLocation(10,150);
		menu1.setSize(150,100);
		menu1.setFont(new Font("Courier", Font.BOLD, 20));
		menu1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookTickets.bookTickets();
				log.setVisible(false);
			}
		});
		log.add(menu1);
		
		JLabel menu2=new JLabel("Veiw Flights");
		menu2.setLocation(10, 200);
		menu2.setSize(150,100);
		menu2.setFont(new Font("Courier", Font.BOLD,20));
		menu2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menu2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrationFrame.registrationFrame();
				log.setVisible(false);
			}
		});
		log.add(menu2);
		
		JLabel menu3=new JLabel("Booking Status");
		menu3.setLocation(10, 250);
		menu3.setSize(180, 100);
		menu3.setFont(new Font("Courier", Font.BOLD,20));
		menu3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menu3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrationFrame.registrationFrame();
				log.setVisible(false);
			}
		});
		log.add(menu3);
		
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
				log.setVisible(false);
			}
		});
		log.add(logout);
				
		log.setLayout(null);
		log.setSize(500,600);
		log.setLocationRelativeTo(null);
		log.setResizable(false);
		log.setVisible(true);
	} 

}
