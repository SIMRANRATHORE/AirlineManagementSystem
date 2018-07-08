package com.airlines.frames;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frames {
	public void show() {
		final JFrame frame = new JFrame("Swings Applications");
		JLabel imgLabel = new JLabel(new ImageIcon("src/main/java/image/img2.jpg"));
		imgLabel.setSize(490, 150);
		imgLabel.setLocation(0, 0);
		frame.add(imgLabel);

		JLabel userLabel = new JLabel("User Id");
		JLabel passLabel = new JLabel("Password");
		JTextField user = new JTextField();
		JTextField pwd = new JTextField();
		JButton b1 = new JButton("Sign In");
		JButton b2 = new JButton("Cancel");
		JLabel label = new JLabel("Not register ? Create an account");

		userLabel.setFont(new Font("Courier", Font.BOLD, 20));
		userLabel.setLocation(20, 270);
		userLabel.setSize(440, 40);

		user.setSize(450, 40);
		user.setLocation(20, 310);

		passLabel.setFont(new Font("Courier", Font.BOLD, 20));
		passLabel.setLocation(20, 350);
		passLabel.setSize(440, 40);

		pwd.setSize(450, 40);
		pwd.setLocation(20, 390);

		b1.setSize(120, 40);
		b1.setFont(new Font("serif", Font.BOLD, 16));
		b1.setLocation(100, 450);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WelcomeFrame.welcomeFrame();
				frame.setVisible(false);
			}
		});

		b2.setSize(120, 40);
		b2.setFont(new Font("serif", Font.BOLD, 16));
		b2.setLocation(250, 450);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Frames obj=new Frames();
				obj.show();
				frame.setVisible(false);
			}
		});

		label.setLocation(170, 526);
		label.setSize(400, 40);
		label.setCursor(new Cursor(Cursor.HAND_CURSOR));
		label.setFont(new Font("Courier", Font.BOLD, 16));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistrationFrame.registrationFrame();
				frame.setVisible(false);
			}
		});
		
		frame.add(userLabel);
		frame.add(passLabel);
		frame.add(label);
		frame.add(user);
		frame.add(pwd);
		frame.add(b1);
		frame.add(b2);

		frame.setLayout(null);
		frame.setSize(500, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
