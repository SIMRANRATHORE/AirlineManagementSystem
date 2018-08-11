package com.airlines.frames;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.airlines.services.LoginServices;

public class Frames {
	static JButton b2 = null;
	public static JLabel loginError=new JLabel();
	static JFrame  frame=null ;

	public  static void show() {
	frame= new JFrame("Swings Applications");
		JLabel imgLabel = new JLabel(new ImageIcon("src/main/java/image/Login.jpg"));
		imgLabel.setSize(490, 230);
		imgLabel.setLocation(0, 15);
		frame.add(imgLabel);

		JLabel userLabel = new JLabel("User Id");
		JLabel passLabel = new JLabel("Password");
		
		final JTextField user = new JTextField();
		final JTextField pwd = new JTextField();
		final JButton b1 = new JButton("Sign In");
		b2 = new JButton("Cancel");
		final JLabel label = new JLabel("Not register ? Create an account");

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
		b1.setLocation(100, 460);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
					b1.setBackground(new Color(250, 177, 112));
					b1.setForeground(Color.white);
				}

				public void mouseClicked(MouseEvent e) {
					
					LoginServices obj=new LoginServices();
					obj.loginServices(user.getText(), pwd.getText());
					frame.setVisible(false);
							}
			});

		b2.setSize(120, 40);
		b2.setFont(new Font("serif", Font.BOLD, 16));
		b2.setLocation(250, 460);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));

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
				b2.setBackground(new Color(250, 177, 112));
				b2.setForeground(Color.white);
				
			}

			public void mouseClicked(MouseEvent e) {

				Frames.show();
				frame.setVisible(false);
			}
		});

		loginError.setSize(400,35);
		loginError.setLocation(20, 425);
		loginError.setFont(new Font("Courier", Font.TRUETYPE_FONT, 12));
		loginError.setForeground(Color.red);
		frame.add(loginError);
		
		label.setLocation(260, 526);
		label.setSize(400, 40);
		label.setCursor(new Cursor(Cursor.HAND_CURSOR));
		label.setFont(new Font("Courier", Font.TRUETYPE_FONT, 16));
		label.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseExited(MouseEvent e) {
				label.setForeground(UIManager.getColor("JLabel.background"));

			}

			public void mouseEntered(MouseEvent e) {
				label.setForeground(new Color(250, 177, 112));
			}

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

		frame.getContentPane().setBackground(new Color(253, 250, 225));
		frame.setLayout(null);
		frame.setSize(500, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
