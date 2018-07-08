package com.airlines.frames;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public  class RegistrationFrame {

	public static void registrationFrame(){
		final JFrame reg=new JFrame("Registration Form");
		JLabel heading=new JLabel("Registration Form");
		JLabel first=new JLabel("First Name");
		JLabel last=new JLabel("Last Name");
		JLabel uid=new JLabel("User Id");
		JLabel pwd=new JLabel("Password");
		JTextField firstText=new JTextField();
		JTextField lastText=new JTextField();
		JTextField uidText=new JTextField();
		JTextField pwdText=new JTextField();
		JButton b1=new JButton("Register");
		JButton b2=new JButton("Cancel");
		
		heading.setLocation(100,0);
		heading.setSize(550,100);
		heading.setFont(new Font("Comic Sans MS", Font.BOLD,50));
		reg.add(heading);
		
		first.setLocation(30,100);
		first.setSize(150, 100);
		first.setFont(new Font("Courier", Font.BOLD, 20));
		reg.add(first);
		
		firstText.setLocation(240, 140);
		firstText.setSize(340, 30);
		reg.add(firstText);
		
		last.setLocation(30,150 );
		last.setSize(150, 100);
		last.setFont(new Font("Courier", Font.BOLD, 20));
		reg.add(last);
		
		lastText.setLocation(240, 190);
		lastText.setSize(340,30);
		reg.add(lastText);
		
		uid.setLocation(30,200);
		uid.setSize(150,100);
		uid.setFont(new Font("Courier", Font.BOLD, 20));
		reg.add(uid);
		
		uidText.setLocation(240, 240);
		uidText.setSize(340, 30);
		reg.add(uidText);
		
		pwd.setLocation(30,250 );
		pwd.setSize(150,100);
		pwd.setFont(new Font("Courier", Font.BOLD, 20));
		reg.add(pwd);
		
		pwdText.setLocation(240, 290);
		pwdText.setSize(340, 30);
		reg.add(pwdText);
		
		b1.setLocation(150, 400);
		b1.setSize(120,40);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.setFont(new Font("serif", Font.BOLD, 16));
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Frames obj=new Frames();
				obj.show();
				reg.setVisible(false);
			}
		});
		reg.add(b1);
		
		b2.setLocation(300, 400);
		b2.setSize(120,40);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.setFont(new Font("serif", Font.BOLD, 16));
		reg.add(b2);
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrationFrame.registrationFrame();
				reg.setVisible(false);
			}
		});
		
		reg.setLayout(null);
		reg.setSize(600,500);
		reg.setLocationRelativeTo(null);
		reg.setResizable(false);
		reg.setVisible(true);
	}
}
