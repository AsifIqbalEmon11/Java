

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Form13 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		JTable j1;
		
		
		public Form13()
	{
		super(" Page-5 ");
		this.setSize(750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(750,130));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel(" Prescribe to the patient " );
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(100,40,750,50);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(750,650));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		
		
		t1 = new JTextField();
		t1.setBounds(50,190,450,350);
		p2.add(t1);

		
		b1 = new JButton("Save");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(50,140,80,45);
                b1.addActionListener(this);
		p2.add(b1);
                
                b2 = new JButton("Next");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(500,550,70,50);
                b2.addActionListener(this);
		p2.add(b2);
		
	
	
		this.add(p1);
		this.add(p2);
	}public void actionPerformed(ActionEvent ae){
            
		 if(ae.getSource()==b1)
			{
			}
                 if(ae.getSource()==b2)
			{
				Form14 f = new Form14();
				this.setVisible(false);
				f.setVisible(true);
			}
		
}
}
