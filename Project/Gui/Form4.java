
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

public class Form4 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		
		
		public Form4()
	{
		super(" Page-4 ");
		this.setSize(750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(750,130));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel(" BMI Calculation " );
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(100,40,750,50);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(750,650));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		l2 = new JLabel("Enter Your Height " );
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.red);
		l2.setBounds(70,150,250,50);
		p2.add(l2);
		
		l3 = new JLabel(" Feet " );
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l3.setForeground(Color.red);
		l3.setBounds(70,200,250,50);
		p2.add(l3);
		
		l4 = new JLabel(" Inch " );
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l4.setForeground(Color.red);
		l4.setBounds(70,250,250,50);
		p2.add(l4);
		
		l5 = new JLabel("Enter Your Weight in kg" );
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l5.setForeground(Color.red);
		l5.setBounds(70,300,300,50);
		p2.add(l5);
		
		t1 = new JTextField();
		t1.setBounds(400,200,70,50);
		p2.add(t1);

		t2 = new JTextField();
		t2.setBounds(400,250,70,50);
		p2.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(400,300,70,50);
		p2.add(t3);
		
                l2 = new JLabel("Your BMI result is  " );
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.red);
		l2.setBounds(70,350,250,50);
		p2.add(l2);
		
		l3 = new JLabel(" You are  " );
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l3.setForeground(Color.red);
		l3.setBounds(70,400,200,50);
		p2.add(l3);
		
		l4 = new JLabel( );
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l4.setForeground(Color.red);
		l4.setBounds(325,350,250,50);
		p2.add(l4);

		l5 = new JLabel();
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l5.setForeground(Color.red);
		l5.setBounds(325,400,200,50);
		p2.add(l5);
                
                 b2 = new JButton("Result");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(425,525,100,50);
                b2.addActionListener(this);
		p2.add(b2);
                
		b1 = new JButton("Sumbit");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(300,525,100,50);
                b1.addActionListener(this);
		p2.add(b1);
		
		
		
	
		this.add(p1);
		this.add(p2);
		
		}public void actionPerformed(ActionEvent ae){
		 if(ae.getSource()==b1)
			{
				Form7 f = new Form7();
				this.setVisible(false);
				f.setVisible(true);
			}
                 if(ae.getSource()==b2)
			{ try{
                                 File file2 = new File("D:/JAVA CODE/Project/pat2.txt");
                   file2.createNewFile();
                 FileWriter writer = new FileWriter(file2, true);
                  
                  
                        double w = Double.parseDouble(t3.getText());
			double h = Double.parseDouble(t1.getText());
                        double h1 = Double.parseDouble(t2.getText());
                        double h2=(((h * 12) + h1) * .0254);
			double s= w / Math.pow(h2, 2.0); 
                        writer.write("Patient's BMI is "+s+"\r"+"\n");
                        if (s < 18.5 ) {l5.setText("Underwieght");
                        writer.write("Patient is "+"Underwieght "+"\r"+"\n");
                        }
                        else if (s >= 25 && s < 30) {l5.setText("Overwieght");
                         writer.write("Patient is "+"Overwieght "+"\r"+"\n");
                        }
                        else if (s >= 30){l5.setText("Obese");
                         writer.write("Patient is "+" Obese"+"\r"+"\n");
                        }
                        else if (s >= 18.5 && s < 25){l5.setText("Normal");
                         writer.write("Patient is "+" Normal"+"\r"+"\n");
                        }
			          l4.setText(String.valueOf(s));
                        
                   
                          writer.flush();
                    writer.close();
                     }
                 catch(Exception ioe)
                   {}
                        
			}
			
			
}
}
