/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java__form;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 *
 * @author hp
 */
public class MyWindow extends JFrame {
    private JLabel heading;
    Font font=new Font("",Font.BOLD,30);
    
    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1,button2;
    
    //constructor
    public MyWindow()
	{
		super.setTitle("Form in java");
		super.setSize(500,500);
		super.setLocation(100,100);
                super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//super.setVisible(true);
                this.create_GUI();      //Run Create_GUI before   
		setVisible(true);       //this commmand 
		System.out.println("Constructor call");
	
	}
    public  void create_GUI() {
	this.setLayout(new BorderLayout());
        
        heading =new JLabel("my first Form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading,BorderLayout.NORTH);
        
        
        //WORKING WITH PANEL
        
        mainPanel =new JPanel();
        
      
        // setting layout of main panel ..
        mainPanel.setLayout ( new GridLayout ( 3 , 2 ) ) ;
    
        nameLabel = new JLabel ( " Enter name : " ) ;
        nameLabel.setFont ( font ) ;
    
        passwordLabel = new JLabel ( " Enter password : " );
        passwordLabel.setFont(font);
           
        nameTextField = new JTextField ( ) ;
        nameTextField.setFont ( font ) ;
    
        passwordField = new JPasswordField ( );
        passwordField.setFont(font);
    
        button1 = new JButton ( " Submit " ) ;
        button1.setFont ( font ) ;
    
        button2 = new JButton ( " Reset " ) ;
        button2.setFont ( font ) ;
    
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField); 
        mainPanel.add(button1); 
        mainPanel.add(button2);
    
        this.add(mainPanel,BorderLayout.CENTER);
    }
}
