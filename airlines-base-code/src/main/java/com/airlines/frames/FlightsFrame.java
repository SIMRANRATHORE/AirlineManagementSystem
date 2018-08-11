package com.airlines.frames;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlightsFrame {

	public static void flightsFrame(){
		final JFrame flight=new JFrame("Flight Frame");
		JLabel head=new JLabel("Add Flight Details");
		JLabel flightName=new JLabel("Flight Name");
		JLabel seats=new JLabel("No. of seats");
		JLabel location=new JLabel("Location");
		JLabel to=new JLabel("To");
		JLabel from=new JLabel("From");
		JLabel t1=new JLabel("t1");
		JLabel t2=new JLabel("t2");
		
		JTextField flightNameText=new JTextField();
		JTextField seatsText=new JTextField();
		JTextField toText=new JTextField();
		JTextField fromText=new JTextField();
		JTextField t1Text=new JTextField();
		JTextField t2Text=new JTextField();
		
		head.setLocation(80, 0);
		head.setFont(new Font("Forte", Font.CENTER_BASELINE,50));
		head.setSize(500, 100);
		head.setForeground(new Color(3, 100, 248));
		flight.add(head);
		
		flightName.setLocation(20,100);
		flightName.setSize(150, 100);
		flightName.setFont(new Font("Courier", Font.BOLD, 20));
		flight.add(flightName);
		
		flightNameText.setLocation(240, 140);
		flightNameText.setSize(340, 30);
		flight.add(flightNameText);
		
		seats.setLocation(20,150);
		seats.setSize(150, 100);
		seats.setFont(new Font("Courier", Font.BOLD, 20));
		flight.add(seats);
		
		seatsText.setLocation(240, 190);
		seatsText.setSize(340,30);
		flight.add(seatsText);
		
		location.setLocation(20, 200);
		location.setSize(150, 100);
		location.setFont(new Font("Courier", Font.BOLD, 20));
		flight.add(location);
		
		to.setLocation(20, 230);
		to.setSize(50, 80);
		to.setFont(new Font("Courier", Font.BOLD, 20));
		flight.add(to);
		
		toText.setLocation(50, 250);
		toText.setSize(150, 30);
		flight.add(toText);
		
		from.setLocation(150, 230);
		from.setSize(50, 80);
		from.setFont(new Font("Courier", Font.BOLD, 20));
		flight.add(from);
		
		fromText.setLocation(180, 230);
		fromText.setSize(150, 30);
		flight.add(fromText);
		
		t1.setLocation(20, 280);
		t1.setSize(150, 100);
		t1.setFont(new Font("Courier", Font.BOLD, 20));
		flight.add(t1);
		
		t1Text.setLocation(80, 280);
		t1Text.setSize(150, 30);
		flight.add(t1Text);
		
		t2.setLocation(120, 280);
		t2.setSize(150, 100);
		t2.setFont(new Font("Courier", Font.BOLD, 20));
		flight.add(t2);
		
		t2Text.setLocation(180, 280);
		t2Text.setSize(150, 100);
		flight.add(t2Text);
		
		flight.getContentPane().setBackground(new Color(237, 248, 251));
		flight.setLayout(null);
		flight.setSize(600,600);
		flight.setLocationRelativeTo(null);
		flight.setResizable(false);
		flight.setVisible(true);
	}
	
}
