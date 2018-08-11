package com.airlines.frames;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

public class AdminFrame {
	
	public static void adminFrame(){
		final JFrame log=new JFrame("Admin");
		ImageIcon icon=new ImageIcon("src/main/java/image/admin.png");
		JMenuItem iconMenuItem = new JMenuItem(icon);
		iconMenuItem.setLocation(150, 10);
		iconMenuItem.setSize(275,100);
		iconMenuItem.setCursor(new Cursor(Cursor.HAND_CURSOR));
		iconMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminFrame.adminFrame();
				log.setVisible(false);
			}
		});
		log.add(iconMenuItem);
		
		JLabel menu1=new JLabel("Add Admin");
		menu1.setLocation(10,150);
		menu1.setSize(150,100);
		menu1.setFont(new Font("Courier", Font.BOLD, 20));
		menu1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminRegistration.adminRegistration();
				log.setVisible(false);
			}
		});
		log.add(menu1);
		
		JLabel menu2=new JLabel("Add Flights");
		menu2.setLocation(10, 200);
		menu2.setSize(150,100);
		menu2.setFont(new Font("Courier", Font.BOLD,20));
		menu2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menu2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FlightsFrame.flightsFrame();
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
		logout.setLocation(540, 0);
		logout.setSize(80,30);
		logout.setFont(new Font("Courier", Font.ITALIC,15));
		logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Frames.show();
				log.setVisible(false);
			}
		});
		log.add(logout);
		
		log.getContentPane().setBackground(new Color(237, 248, 251));
		log.setLayout(null);
		log.setSize(600,600);
		log.setLocationRelativeTo(null);
		log.setResizable(false);
		log.setVisible(true);
	} 
	
}
