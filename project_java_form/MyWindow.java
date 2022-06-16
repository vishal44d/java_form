package project_java_form;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel heading;
    Font font=new Font("",Font.BOLD,40);
    
    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1,button2;
	public MyWindow()
	{
		super.setTitle("Form in java");
		super.setSize(600,600);
		super.setLocation(100,100);
                super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//super.setVisible(true);
		setVisible(true);
		System.out.println("Constructor call");
		this.create_GUI();
	}
	public void create_GUI() {
		this.setLayout(new BorderLayout());
	        
	        heading =new JLabel("my first Form");
	        heading.setFont(font);
	        heading.setHorizontalAlignment(JLabel.CENTER);
	        this.add(heading,BorderLayout.NORTH);
	        
	        
	        //WORKING WITH PANEL
	        
	        mainPanel =new JPanel();
	        
	      
	        // setting layout of main panel ..
	        mainPanel.setLayout ( new GridLayout (3,2 ) ) ;
	    
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
	        mainPanel.add(passwordField); 
	        mainPanel.add(button1); 
	        mainPanel.add(button2);
	    
	        this.add(mainPanel,BorderLayout.CENTER);
	    }
}
