package com.practice;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyWindow extends JFrame 
{

	//private static final ActionListener ActionListener() {} = null;
	private JLabel heading;
	private JLabel clockLabel;
	
	private Font font =new Font("",Font.BOLD,35);
	MyWindow()
	{
		super.setTitle("My Clock");
		super.setSize(400,400);
		super.setLocation(300,50);
		
		super.setVisible(true);
	}
	public void creatGUI()
	{
		heading =new JLabel("My Clock");
		
		clockLabel = new JLabel("Clock");
		
		heading.setFont(font);
		clockLabel.setFont(font);
		
		
		
		this.setLayout(new GridLayout(2,1));
		
		this.add(heading);
		this.add(clockLabel);
				
	}
	public void startClock()
	{
		Timer timer=new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String dateTime = new Date().toString();
				
				clockLabel.setText(dateTime);
			}
			
		});
		timer.start();
	}
	
}
