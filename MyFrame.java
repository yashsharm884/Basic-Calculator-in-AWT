import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
import javax.swing.*;

class MyFrame extends Frame implements ActionListener
{
 Label l1,l2,l3,l4;
 TextField t1,t2;
 Button b1,b2,b3,b4,b5,b6;
 Button b7;
 Button b8;
 MyFrame()
 {
   super("Addition of two numbers");
   setLayout(null);
   setSize(500,500);
   setVisible(true);
   l1=new Label("Enter the first no:");
   l2=new Label("Enter the second no:");
   l3=new Label("The Result is:");
   l4=new Label(null);
   t1=new TextField();
   t2=new TextField();
   b1=new Button("ADD");
   b2=new Button("Clear");
   b3=new Button("Multiply");
   b4=new Button("Sub");
   b5=new Button("Division");
   b6=new Button("Average");
   b7=new Button("Square(First Number)");
   b8=new Button("Square(Second Number)");                                                                                                           
   l1.setBounds(100,50,120,20);
   add(l1);
   t1.setBounds(240,50,50,20);
   add(t1);
   l2.setBounds(100,80,130,20);
   add(l2);
   t2.setBounds(240,80,50,20);
   add(t2);
   l3.setBounds(100,110,100,20);
   add(l3);
   l4.setBounds(210,110,60,20);
   add(l4);
   b1.setBounds(200,150,50,20);
   add(b1);
   b2.setBounds(340,200,50,20);
   add(b2);
   b3.setBounds(270,200,50,20);
   add(b3);
   b4.setBounds(270,150,50,20);
   add(b4);
   b5.setBounds(200,200,50,20);
   add(b5);
   b6.setBounds(200,250,50,20);
   add(b6);
   b7.setBounds(270,250,150,80);
   add(b7);
   b8.setBounds(270,350,150,80);
   add(b8);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   b7.addActionListener(this);
   b8.addActionListener(this);

  
   addWindowListener( new WindowAdapter() {
    public void windowClosing(WindowEvent we)
    {
     System.exit(0);
    }
   });
 }

 public void actionPerformed(ActionEvent ae)
 {
  float a,b,c;
  if(ae.getSource()==b1)
  {
   a=Float.parseFloat(t1.getText().trim() );
   b=Float.parseFloat(t2.getText().trim() );
   c=a+b;
   l4.setText(Float.toString(c) );
  }
  else if(ae.getSource()==b3)
  {
     a=Float.parseFloat(t1.getText().trim() );
     b=Float.parseFloat(t2.getText().trim() );
     c=a*b;
    l4.setText(Float.toString(c) );
  }
  else if(ae.getSource()==b4)
  {

     a=Float.parseFloat(t1.getText().trim() );
     b=Float.parseFloat(t2.getText().trim() );
     c=a-b;
    l4.setText(Float.toString(c) );
  }
  else if(ae.getSource()==b5)
  {

     a=Float.parseFloat(t1.getText().trim() );
     b=Float.parseFloat(t2.getText().trim() );
     c=a/b;
     try
     {
     c=a/b;
     }
     catch(ArithmeticException e)
     {
     	System.out.println(e);
     }
    l4.setText(Float.toString(c) );
  }
  else if(ae.getSource()==b6)
  {
  	 a=Float.parseFloat(t1.getText().trim() );
     b=Float.parseFloat(t2.getText().trim() );
     c=(a+b)/2;
     l4.setText(Float.toString(c) );
  }
   else if(ae.getSource()==b7)
  {
  	 Double d=Double.parseDouble(t1.getText().trim() );
     //Double e=Double.parseDouble(t2.getText().trim() );
     Double f=d*d;
     l4.setText(Double.toString(f) );
  }
  else if(ae.getSource()==b8)
  {
  	 //Double d=Double.parseDouble(t1.getText().trim() );
  	 Double e=Double.parseDouble(t2.getText().trim() );
  	 Double f=e*e;
  	 l4.setText(Double.toString(f) );

  }
  else
  {
   t1.setText(null);
   t2.setText(null);
   l4.setText(null);
  }
 }

ImageIcon img = new ImageIcon("yash.jpg");
setIconImage(img.getImage() );

//Frame f = new Frame("FrameIcon");
//Image icon = Toolkit.getDefaultToolkit().getImage("yash.jpg");
//f.setIconImage(icon);
















/*
private void seticon()
{
  setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("yash.jpg")));
}
*/
//Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/YASH/Desktop/Java Programs/Java awt programming/yash.jpg");    


//frame.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("yash.jpg"))
 // );




 public static void main(String s[])
 {
  MyFrame ob=new MyFrame();
 }
}

