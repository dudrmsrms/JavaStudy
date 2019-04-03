package com.kopo.human;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DesignTest extends JFrame {
	
	private static final long serialVersionUID = -7307768698180053636L;
	private JButton east  ;
	private JButton west  ;
	private JButton south ;
	private JButton north ;
	private JButton center ;
	public DesignTest() {
		design();
	}
	public void design() {
		Container ca = this.getContentPane();
		east = new JButton("µ¿");
		east.addActionListener(new East());
		west = new JButton("¼­");
		west.addActionListener(new West());
		south = new JButton("³²");
		south.addActionListener(new South());
		north = new JButton("ºÏ");
		north.addActionListener(new North());
		center = new JButton("Áß¾Ó");
		center.addActionListener(new Center());
		
		ca.add(east , BorderLayout.EAST);
		ca.add(west , BorderLayout.WEST);
		ca.add(south , BorderLayout.SOUTH);
		ca.add(north , BorderLayout.NORTH);
		ca.add(center , BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		DesignTest dt = new DesignTest();
		dt.setBounds(200,200,300,400);
		dt.setVisible(true);
	}


}
