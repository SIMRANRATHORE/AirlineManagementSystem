package com.airlines.frames;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.airlines.dao.impl.UserDAOImpl;
import com.airlines.entities.User;

public class AdminRegistration {

	
		static User user=new User();
		static UserDAOImpl userImpl=new UserDAOImpl();
		public static void adminRegistration(){	
			final JFrame reg=new JFrame("Admin Registration");
			JLabel heading=new JLabel("Admin Registration");
			JLabel fullName=new JLabel("Full Name");
			JLabel userName=new JLabel("User Name");
			JLabel email=new JLabel("Email");
			JLabel pwd=new JLabel("Password");
			JLabel gender=new JLabel("Gender");
			JLabel dob=new JLabel("DOB");
			JLabel address=new JLabel("Address");
			JLabel contact=new JLabel("Contact");
			final JTextField contactText=new JTextField();
			final JTextField addressText=new JTextField();
			final JTextField dobText=new JTextField();
			final JTextField emailText=new JTextField();
			final JTextField fullNameText=new JTextField();
			final JTextField userNameText=new JTextField();
			final JTextField pwdText=new JTextField();
			final JButton b1=new JButton("Register");
			final JButton b2=new JButton("Cancel");
			
			heading.setLocation(80,0);
			heading.setSize(550,100);
			heading.setFont(new Font("Forte", Font.CENTER_BASELINE,50));
			heading.setForeground(new Color(3, 100, 248));
			reg.add(heading);
			
			fullName.setLocation(20,100);
			fullName.setSize(150, 100);
			fullName.setFont(new Font("Courier", Font.BOLD, 20));
			reg.add(fullName);
			
			fullNameText.setLocation(240, 140);
			fullNameText.setSize(340, 30);
			reg.add(fullNameText);
			
			userName.setLocation(20,150 );
			userName.setSize(150, 100);
			userName.setFont(new Font("Courier", Font.BOLD, 20));
			reg.add(userName);
			
			userNameText.setLocation(240, 190);
			userNameText.setSize(340,30);
			reg.add(userNameText);
			
			email.setLocation(20, 200);
			email.setSize(150, 100);
			email.setFont(new Font("Courier", Font.BOLD, 20));
			reg.add(email);
			
			emailText.setLocation(240, 240);
			emailText.setSize(340,30);
			reg.add(emailText);
			
			pwd.setLocation(20,250 );
			pwd.setSize(150,100);
			pwd.setFont(new Font("Courier", Font.BOLD, 20));
			reg.add(pwd);
			
			pwdText.setLocation(240, 290);
			pwdText.setSize(340, 30);
			reg.add(pwdText);
			
			gender.setLocation(20,300);
			gender.setSize(150,100);
			gender.setFont(new Font("Courier", Font.BOLD, 20));
			reg.add(gender);
			
			JRadioButton r1=new JRadioButton("Male");    
			JRadioButton r2=new JRadioButton("Female");    
			r1.setBounds(240,340,100,30);    
			r2.setBounds(350,340,100,30);    
			final ButtonGroup bg=new ButtonGroup();    
			bg.add(r1);bg.add(r2);    
			reg.add(r1);reg.add(r2);      
			
			r1.setActionCommand("Male");
			r2.setActionCommand("female");
			
			r1.setSelected(true);
			
			
			dob.setLocation(20, 350);
			dob.setSize(150,100);
			dob.setFont(new Font("Courier", Font.BOLD, 20));
			reg.add(dob);
			
			dobText.setLocation(240, 390);
			dobText.setSize(340, 30);
			reg.add(dobText);
		
			address.setLocation(20, 400);
			address.setSize(150, 100);
			address.setFont(new Font("Courier", Font.BOLD, 20));
			reg.add(address);
			
			addressText.setLocation(240, 440);
			addressText.setSize(340, 30);
			reg.add(addressText);
			
			contact.setLocation(20, 450);
			contact.setSize(150, 100);
			contact.setFont(new Font("Courier", Font.BOLD, 20));
			reg.add(contact);
			
			contactText.setLocation(240,490);
			contactText.setSize(340, 30);
			reg.add(contactText);
			
			b1.setLocation(180, 550);
			b1.setSize(120,40);
			b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			b1.setFont(new Font("serif", Font.BOLD, 16));
			b1.addMouseListener(new MouseListener() {

				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				public void mouseExited(MouseEvent e) {
					b1.setBackground(UIManager.getColor("Button.background"));
					b1.setForeground(UIManager.getColor("JButton.background"));

				}

				public void mouseEntered(MouseEvent e) {
					b1.setBackground(new Color(3, 100, 248));
					b1.setForeground(Color.white);
				}

				public void mouseClicked(MouseEvent e) {

					user.setFullName(fullNameText.getText());
					user.setUserName(userNameText.getText());
					user.setEmail(emailText.getText());
					user.setPassword(pwdText.getText());
					user.setGender(bg.getSelection().getActionCommand());
					user.setDob(dobText.getText());
					user.setAddress(addressText.getText());
					user.setContact(contactText.getText());
					user.setRoll("admin");
					userImpl.saveUser(user);
					AdminFrame.adminFrame();
					reg.setVisible(false);
				}
			});
			reg.add(b1);
			
			b2.setLocation(360, 550);
			b2.setSize(120,40);
			b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			b2.setFont(new Font("serif", Font.BOLD, 16));
			b2.addMouseListener(new MouseListener() {

				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				public void mouseExited(MouseEvent e) {
					b2.setBackground(UIManager.getColor("Button.background"));
					b2.setForeground(UIManager.getColor("JButton.background"));

				}

				public void mouseEntered(MouseEvent e) {
					b2.setBackground(new Color(3, 100, 248));
					b2.setForeground(Color.white);
				}

				public void mouseClicked(MouseEvent e) {

					AdminFrame.adminFrame();					
					reg.setVisible(false);
				}
			});
		
			reg.add(b2);
			
			reg.getContentPane().setBackground(new Color(237, 248, 251));
			reg.setLayout(null);
			reg.setSize(600,650);
			reg.setLocationRelativeTo(null);
			reg.setResizable(false);
			reg.setVisible(true);
	}
	

}
