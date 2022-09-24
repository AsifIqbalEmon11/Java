
import java.io.*;

import java.util.*;
class Patient{
    public String s,s1,s2,s3,s4,s5,s6,v1,v;
    public float t,t1;
    public char y2,y3,y4,y5;
    double bmi;
    Scanner input = new Scanner(System.in);

    Patient() {
        
    }
    void showLog(){
        System.out.println("                               **********************************************");
        System.out.println("                                                 Welcome to       ");
        System.out.println("                                          Online Health Consulter      ");
        System.out.println("                               **********************************************");
        System.out.println("                                                  login as");
        System.out.println("                                                A : Patient ");
        System.out.println("                                                B : Doctor ");
		System.out.println("                                                C : Admin ");
        System.out.println("                             Dont have an account create one. press 'n' to create ");
        System.out.println("                                               Enter option : ");
        System.out.print("                                               ");char ch=input.next().charAt(0);
		cls();
        if(ch=='N'||ch=='n'){
			System.out.println("                          Account Crearion                           ");
	      System.out.println("                      Create account as a Patient press 'p' ");
		  System.out.println("                      Create account as a Doctor press 'd' ");
		 System.out.print("                                     "); char ch1=input.next().charAt(0);
	      System.out.print("                                    Email id :");
		  s =input.next();
		  System.out.println(""); 
          System.out.print("                                    User name :");
             s6 =input.next();
           System.out.println(""); 
          System.out.print("                                    Password :");
           s4 =input.next();
            System.out.println("");
			cls();
			this.showLog();
           }
		   if(ch=='A'||ch=='a'){
			System.out.println("                       *********** Login Page *************");
		    System.out.print("                                    User name :");
              v =input.next();
           System.out.println(""); 
          System.out.print("                                    Password :");
             v1 =input.next();
            System.out.println("");
			
		   }
		  
		 
    }
    void showHom(){
		if(s6.equalsIgnoreCase(v) && s4.equalsIgnoreCase(v1)){
              System.out.print("                     Press l for login :");
               char c=input.next().charAt(0);
			   cls();
         if(c=='l'||c=='L'){
             System.out.println("                                         **********************************************          ");
            System.out.println("                                                         Online Heath Consulter     ");
             System.out.println("                                                               Home page    ");
			  System.out.println("                                         **********************************************");
              System.out.println("                                                           A : BMI Check up    ");
              System.out.println("                                                           B : Corona Virus Check up    ");
              System.out.println("                                                           C : Diabetes Check up    ");
              System.out.println("                                                           D : Patient Report   ");
              System.out.println("                                                           E : Emergency Doctor    ");
			   System.out.println("                                         **********************************************");
              
         }
		}
		else{
			System.out.println("                 Your user name or password is incorrect please check again ");
			this.showLog();
		}
		
			   
}
    void showRes(){
                  System.out.println("                                 Enter option : ");
                  System.out.print("                                   "); char y=input.next().charAt(0);
			   cls();
               if(y=='C'||y=='c'){
                   File file=new File("D:/JAVA CODE/Project/patient.txt");
                  try{ Formatter form= new Formatter("D:/JAVA CODE/Project/patient.txt");
                  form.format("%s %s \r\n","                       ",s6);
				   System.out.println("                           **********************************************");
				    System.out.println("                                    Checking Up your Diabetes         ");
					System.out.println("                           **********************************************");
                    System.out.println("                           Sugar level Before meals​ (pre prandial) : ");
                   System.out.print("                             ");t=input.nextFloat();
                  form.format("%s %f \r\n","            Sugar level Before meals​ (pre prandial) :",t);
                  System.out.println("                           Sugar level at least 90 minutes after meals​ (post prandial) : ");
                  System.out.print("                             ");t1=input.nextFloat();
                  form.format("%s %f \r\n","                Sugar level at least 90 minutes after meals​ (post prandial) : ",t1);
                  System.out.println("                           Do you have these kinds of symptoms? ");
                  System.out.println("                           Reply y/n , Increased Thirst? ");
                    System.out.print("                             "); y2=input.next().charAt(0);
                   form.format("%s %c \r\n","               Increased Thirst? ",y2);
                     System.out.println("                           Reply y/n , Frequent urination ? ");
                   System.out.print("                             "); y3=input.next().charAt(0);
                    form.format("%s %c \r\n", "            Frequent urination ? ",y3);
                       System.out.println("                           Reply y/n , Unexplained weight loss ? ");
                      System.out.print("                             "); y4=input.next().charAt(0);
                     form.format("%s %c \r\n","            Unexplained weight loss ? ",y4);
                     System.out.println("                           Reply y/n ,  Blurred vision ? ");
                       System.out.print("                             ");y5=input.next().charAt(0);
                        form.format("%s %c \r\n", "            Blurred vision ? ",y5);
                  form.close();
                  
                  }
                  catch(Exception e){}
    }
                if(y=='B'||y=='b'){
                    File file1=new File("D:/JAVA CODE/Project/patient1.txt");
                  try{ Formatter form1= new Formatter("D:/JAVA CODE/Project/patient1.txt");
                  form1.format("%s \r\n",s6);
				  System.out.println("                           **********************************************");
                  System.out.println("                               Check up for symptoms of coronavirus: ");
			      System.out.println("                           **********************************************");
                  System.out.println("                             Do you have these kinds of symptoms? ");
                  System.out.println("                             Reply y/n , Fever? ");
                  System.out.print("                              "); y2=input.next().charAt(0);
                    form1.format("%s %c \r\n","                   Fever? ",y2);
                  System.out.println("                             Reply y/n ,Dry Cough?  ");
                   System.out.print("                              "); y3=input.next().charAt(0);
                    form1.format("%s %c \r\n","                    Dry Cough?  ",y3);
                  System.out.println("                             Reply y/n ,Loss of taste and smell ?  ");
                     System.out.print("                              ");y4=input.next().charAt(0);
                      form1.format("%s %c \r\n","                  Loss of taste and smell ?  ",y4);
                  System.out.println("                             Reply y/n ,Difficulty breathing or shortness of breath ?  ");
                    System.out.print("                              "); y5=input.next().charAt(0);
                     form1.format("%s %c \r\n","                  Difficulty breathing or shortness of breath ?  ",y5);
                  form1.close();
                  
                  }
                  catch(Exception e){}
                  }
                  if(y=='A'||y=='a'){
       
          System.out.println("                           **********************************************");
                  System.out.println("                               Check up for BMI ");
			      System.out.println("                           **********************************************");      
        System.out.print("                              Enter weight in pounds: ");
        float weight = input.nextFloat();
        System.out.print("                              Enter feet: ");
        float feet = input.nextFloat();
        System.out.print("                              Enter inches: ");
         float inches = input.nextFloat();
        //convert measurements
        double weightInKilos = weight * 0.453592;
    
        double heightInMeters = (((feet * 12) + inches) * .0254);
         
             bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
                   
        System.out.println("                            Your BMI is: " + bmi);
              
              try
                 {
                 File file2 = new File("D:/JAVA CODE/Project/patient2.txt");
                   file2.createNewFile();
                 FileWriter writer = new FileWriter(file2, true);
                  writer.write("                   Patient name "+s6+"\r"+"\n");
                   writer.write("                   Patient's BMI is "+bmi+"\r"+"\n");
                  
             
              
            if (bmi < 18.5 ) {
             writer.write("                   Underwieght"+"\r"+"\n");
        }

             else if (bmi >= 25 && bmi < 30) {
             writer.write("                   Overwieght"+"\r"+"\n");
        }
        else if (bmi >= 30) {
            writer.write("                   Obese"+"\r"+"\n");
        } 
        
        else if (bmi >= 18.5 && bmi < 25) {
        writer.write("                   Normal"+"\r"+"\n");
              }
              writer.flush();
                    writer.close();
                     }
                 catch(Exception ioe)
                   {}
    }
	 if(y=='E'||y=='e'){
		  System.out.println("                For urgent medical help: use the OHC 111 online service – call 111 if you need urgent help for a child under 5 or you cannot get help online.");
		  System.out.println("                For urgent dental treatment: call your dentist or use the OHC 101 online service if you cannot contact your dentist or you do not have one.");
		  System.out.println("                For life-threatening emergencies: call 999 for an ambulance.");
	 }
	 
	
	 
    }
    void showReport(){
               System.out.println("                             Enter option : ");
               System.out.print("                              "); char y=input.next().charAt(0);
			   cls();
               if(y=='d'|| y=='D'){
              System.out.println("                    A : Reports of BMI Check up    ");
              System.out.println("                    B : Reports of Corona Virus Check up    ");
              System.out.println("                    C : Reports of Diabetes Check up    ");
                     System.out.println("                             Enter option : ");
                       System.out.print("                             ");char y0=input.next().charAt(0);
					   cls();
					System.out.println("                           **********************************************");
				    System.out.println("                                         Your Report         ");
					System.out.println("                           **********************************************");
                   if(y0=='c'||y0=='C'){
					   
                         try{ File file3=new File("D:/JAVA CODE/Project/patient.txt");
                   FileReader reader = new FileReader(file3);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                    try{ File file4=new File("D:/JAVA CODE/Project/doctor.txt");
                 FileReader reader = new FileReader(file4);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                
                   }
                   
                   if(y0=='b'||y0=='B'){
                   try{ File file5=new File("D:/JAVA CODE/Project/patient1.txt");
                 FileReader reader = new FileReader(file5);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                    try{ File file6=new File("D:/JAVA CODE/Project/doctor1.txt");
                     FileReader reader = new FileReader(file6);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                   
               }
              if(y0=='a'||y0=='A'){
                try{ File file7=new File("D:/JAVA CODE/Project/patient2.txt");
                   FileReader reader = new FileReader(file7);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                    try{ File file8=new File("D:/JAVA CODE/Project/doctor2.txt");
                    FileReader reader = new FileReader(file8);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
              }
               }
			  
    }
    
    void showDoc(){
                 System.out.println("                              Press s to Submit");
				   System.out.print("                              ");char y6 = input.next().charAt(0);
                  if(y6=='s'){

                  System.out.println("                             *************Thank You***********  ");
                  System.out.println("                      You will find your report in patient report section ");
                  
                  System.out.println("                             Press e for exit ");
                    System.out.print("                             "); char y7=input.next().charAt(0);
				 
				  }
				   cls();
    }
    void docReport(){
                  
                       this.showLog();
                      this.showHom();
                      this.showReport();
					  
                    System.out.println("                              Press e for exit ");
                      System.out.print("                              ");char y7=input.next().charAt(0);
		cls();
		} 

public static void cls()
{
try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);
}
}
				  
                  }
                             
         
class Doctor extends Patient {

       String a,a1,a2,a3,a4,a5,v,v1;
        public float t,t1;
    public char y2,y3,y4,y5;
    Scanner in = new Scanner(System.in);

   Doctor() {
       
         a1 = "ASIF KHAN ";
        a2="12345";
        a="yes";
    }

void showLogin(){
      System.out.println("                               **********************************************");
        System.out.println("                                                 Welcome to       ");
        System.out.println("                                          Online Health Consulter      ");
        System.out.println("                               **********************************************");
        System.out.println("                                                  login as");
        System.out.println("                                                A : Patient ");
        System.out.println("                                                B : Doctor ");
		System.out.println("                                                C : Admin ");
         System.out.println("                             Dont have an account create one. press 'n' to create ");
        System.out.println("                                               Enter option : ");
        System.out.print("                                               ");char ch=input.next().charAt(0);
		super.cls();
		
		 if(ch=='N'||ch=='n'){
			System.out.println("                          Account Crearion                           ");
	      System.out.println("                      Create account as a Patient press 'p' ");
		  System.out.println("                      Create account as a Doctor press 'd' ");
		 System.out.print("                                     "); char ch1=input.next().charAt(0);
	      System.out.print("                                    Email id :");
		  s =input.next();
		  System.out.println(""); 
          System.out.print("                                    User name :");
             a3 =in.next();
           System.out.println(""); 
          System.out.print("                                    Password :");
           a4 =in.next();
            System.out.println("");
			super.cls();
			this.showLogin();
           }
        if(ch=='B'||ch=='b'){
			System.out.println("                       *********** Login Page *************");
          System.out.print("                                    User name :");
             v =in.next();
           System.out.println(""); 
          System.out.print("                                    Password :");
           v1 =in.next();
            System.out.println("");
        }
}
void showHome(){
	if(a3.equalsIgnoreCase(v) && a4.equalsIgnoreCase(v1) ){
          System.out.print("                     Press l for login :");
                char c=input.next().charAt(0);
			   super.cls();
         if(c=='l'||c=='L'){
             System.out.println("                                         **********************************************          ");
            System.out.println("                                                         Online Heath Consulter     ");
             System.out.println("                                                               Home page    ");
			  System.out.println("                                         **********************************************");
              System.out.println("                                                           A : Patients of BMI Check up    ");
              System.out.println("                                                           B : Patients of Corona Virus Check up    ");
              System.out.println("                                                           C : Patients of Diabetes Check up    ");
              System.out.println("                                                           D : Reports of patients   ");
           
			   System.out.println("                                         **********************************************");
              
}
	}else{
			System.out.println("                 Your user name or password is incorrect please check again ");
			this.showLogin();
	
        }
}
void showResult() throws IOException{
               System.out.println("                                 Enter option : ");
               System.out.print("                                   "); char y=input.next().charAt(0);
			   super.cls();
               if(y=='C'||y=='c'){
                   System.out.println("                       1. Patient : "+super.s6);
                     System.out.print("                       Enter serial no : ");
                   char y1=in.next().charAt(0);
               if(y1=='1'){
                  try{ File file=new File("D:/JAVA CODE/Project/patient.txt");
                       FileReader reader = new FileReader(file);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
               }
               
                  System.out.print("                    Enter p for prescribe : ");
                 char y6=in.next().charAt(0); 
          InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr    = new BufferedReader(isr);
             String c1 ="",temp;
		char choice1 = 'y';
            File file1=new File("D:/JAVA CODE/Project/doctor.txt");
		file1.createNewFile();	
              try{ FileWriter writer = new FileWriter(file1);
                 System.out.print("                    Date : ");
               a2=in.next();
                writer.write(a2+"\r"+"\n");
				 System.out.println("                   write suggestions for patient : ");
				 while(choice1 == 'y')
		{
			temp = bfr.readLine();
			c1=c1+temp+"\r\n";
			System.out.println("More press y and n for no");
			choice1=in.next().charAt(0);
			
		}
                 writer.write(c1);
		 writer.flush();
		 writer.close();
              
              }catch(Exception e){}
               
               }
                       if(y=='a'||y=='A'){
                   System.out.println("         1. Patient : "+super.s6);
                   System.out.print("         Enter serial no : ");
                   char y1=in.next().charAt(0);
               if(y1=='1'){
                   try{ File file2=new File("D:/JAVA CODE/Project/patient2.txt");
                      FileReader reader = new FileReader(file2);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
               }
                           System.out.print("                   Enter p for prescribe : ");
                 char y6=in.next().charAt(0); 
        
          
            File file3=new File("D:/JAVA CODE/Project/doctor2.txt");
			InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr    = new BufferedReader(isr);
           String c1 ="",temp;
		char choice1 = 'y';
              try{ FileWriter writer = new FileWriter("D:/JAVA CODE/Project/doctor2.txt");
                 System.out.print("                    Date : ");
               a2=in.next();
                writer.write(a2+"\r"+"\n");
				 System.out.println("                   write suggestions for patient : ");
				 while(choice1 == 'y')
		{
			temp = bfr.readLine();
			c1=c1+temp+"\r\n";
			System.out.println("More press y and n for no");
			choice1=in.next().charAt(0);
			
		}
                 writer.write(c1);
		 writer.flush();
		 writer.close();
              
              }catch(Exception e){}  
               
                       }
                if(y=='b'||y=='B'){
                   System.out.println("               1. Patient : "+super.s6);
                   System.out.print("               Enter serial no : ");
                   char y1=in.next().charAt(0);
               if(y1=='1'){
                    try{ File file4=new File("D:/JAVA CODE/Project/patient1.txt");
                       FileReader reader = new FileReader(file4);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
               }
                          System.out.print("                 Enter p for prescribe : ");
                 char y6=in.next().charAt(0); 
         
          
            File file5=new File("D:/JAVA CODE/Project/doctor1.txt");
			InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr    = new BufferedReader(isr);
			String c1 ="",temp;
		char choice1 = 'y';
              try{ FileWriter writer = new FileWriter("D:/JAVA CODE/Project/doctor1.txt");
                 System.out.print("                    Date : ");
               a2=in.next();
                writer.write(a2+"\r"+"\n");
				 System.out.println("                   write suggestions for patient : ");
				 while(choice1 == 'y')
		{
			temp = bfr.readLine();
			c1=c1+temp+"\r\n";
			System.out.println("More press y and n for no");
			choice1=in.next().charAt(0);
			
		}
                 writer.write(c1);
		 writer.flush();
		 writer.close();
              
              }catch(Exception e){}
                }  
                 System.out.print("                 Press e for exit  : ");
                  char y7=input.next().charAt(0);  
     super.cls();   				  
               }
void docView(){
                        this.showLogin();
                      this.showHome();
  System.out.println("                                 Enter option : ");
               System.out.print("                                   "); char y=input.next().charAt(0);
			   super.cls();
               if(y=='d'|| y=='D'){
              System.out.println("                 A : Reports of BMI patients   ");
              System.out.println("                 B : Reports of Corona Virus patients    ");
              System.out.println("                 C : Reports of Diabetes patients    ");
  System.out.println("                                 Enter option : ");
               System.out.print("                                   "); char y0=input.next().charAt(0);
			   super.cls();
			   System.out.println("                           **********************************************");
				    System.out.println("                                      Patient Report          ");
					System.out.println("                           **********************************************");
                if(y0=='c'||y0=='C'){
                         try{ File file6=new File("D:/JAVA CODE/Project/patient.txt");
                      
                    FileReader reader = new FileReader(file6);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                    try{ File file7=new File("D:/JAVA CODE/Project/doctor.txt");
                      
                    FileReader reader = new FileReader(file7);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                
                   }
                   
                   if(y0=='b'||y0=='B'){
                   try{ File file8=new File("D:/JAVA CODE/Project/patient1.txt");
                       
                    FileReader reader = new FileReader(file8);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                    try{ File file12=new File("D:/JAVA CODE/Project/doctor1.txt");
                       
                    FileReader reader = new FileReader(file12);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                   
               }
              if(y0=='a'||y0=='A'){
                try{ File file9=new File("D:/JAVA CODE/Project/patient2.txt");
                     
                    FileReader reader = new FileReader(file9);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }
                    try{ File file11=new File("D:/JAVA CODE/Project/doctor2.txt");
                
                    FileReader reader = new FileReader(file11);
                    BufferedReader bfr = new BufferedReader(reader);
                                   String text="", temp;
                           while((temp=bfr.readLine())!=null)
                               {
                             text=text+temp+"\n"+"\r";
                              }
                              System.out.print(text);
                               reader.close();
                                }
                               catch(Exception ioe)
                               {
                               ioe.printStackTrace();
                               }

              }
}
 System.out.println("Press e for exit ");
                  char y7=input.next().charAt(0); 
				  

}

}
class Admin{
String b,b1,l,l1;
Patient p;
Doctor d;

 Scanner scan = new Scanner(System.in);

 Admin(){
  
 b="Admin";
 b1="1111";
 }
 void Login(){
	 System.out.println("                               **********************************************");
        System.out.println("                                                 Welcome to       ");
        System.out.println("                                          Online Health Consulter      ");
        System.out.println("                               **********************************************");
        System.out.println("                                                  login as");
        System.out.println("                                                A : Patient ");
        System.out.println("                                                B : Doctor ");
		System.out.println("                                                C : Admin ");
        System.out.println("                             Dont have an account create one. press 'n' to create ");
        System.out.println("                                               Enter option : ");
        System.out.print("                                               ");char ch=scan.next().charAt(0);
		p.cls();
         if(ch=='C'||ch=='c'){
			System.out.println("                       *********** Login Page *************");
		    System.out.print("                                    User name :");
              l =scan.next();
           System.out.println(""); 
          System.out.print("                                    Password :");
             l1 =scan.next();
            System.out.println("");
			
		   }
		  
 }
 void Home(){
	 if(l.equalsIgnoreCase(b) && l1.equalsIgnoreCase(b1)){
              System.out.print("                     Press l for login :");
               char c=scan.next().charAt(0);
			   p.cls();
			   System.out.println("                                                 A:Update Patient Information    ");
              System.out.println("                                                  B:Update Doctor Information    ");
	 
 }else{System.out.println("                 Your user name or password is incorrect please check again ");
			this.Login();}
 }
 void updateInfo(){
	 System.out.println("                                 Enter option : ");
                  System.out.print("                                   "); char y=scan.next().charAt(0);
			   p.cls();
	 if(y=='A'||y=='a'){    
        System.out.print("                  Update patient user name ");
 p.s6=scan.next();
     System.out.println(" ");
  System.out.print("                  Update patient password ");
 p.s4=scan.next();
     System.out.println(" ");
 try
                 {
                 File file2 = new File("D:/JAVA CODE/Project/patientUpdate.txt");
                   file2.createNewFile();
                 FileWriter writer = new FileWriter(file2, true);
                  writer.write("                Pateit User name "+p.s6+"\r"+"\n");
                   writer.write("                Pateit Password "+p.s4+"\r"+"\n");
                   writer.flush();
                    writer.close();
                     }
                 catch(Exception ioe)
                   {}
 }
  if(y=='B'||y=='b'){
  System.out.print("                  Update Doctor user name ");    
 d.a3=scan.next();
  System.out.println(" ");
  System.out.print("                  Update Doctor password ");
 d.a4=scan.next();
      System.out.println(" ");
 try
                 {
                 File file2 = new File("D:/JAVA CODE/Project/doctorUpdate.txt");
                   file2.createNewFile();
                 FileWriter writer = new FileWriter(file2, true);
                  writer.write("                Doctor User name "+d.a3+"\r"+"\n");
                   writer.write("                Doctor Password "+d.a4+"\r"+"\n");
                   writer.flush();
                    writer.close();
                     }
                 catch(Exception ioe)
                   {}
 }
}
}

        
public class Start {
    public static void main(String[] args) throws IOException {
      
        Doctor d=new Doctor();
        d.showLog();
        d.showHom();
        d.showRes();
        d.showDoc();
        d.showLogin();
        d.showHome();
        d.showResult();
        d.docReport();
	    d.docView();
		
		Admin a=new Admin();
		a.Login();
		a.Home();
		a.updateInfo();
		
    }
    
}