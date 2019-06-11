import  java.awt.event.*;
import java.awt.*;
import javax.swing.*;    
class RadioExample implements ItemListener {    
JFrame f; JLabel label;JRadioButton r1,r2,r3;   
RadioExample(){    
f=new JFrame("Fruits"); 
label= new JLabel();     
 label.setSize(400,100);
label.setBounds(75,200,300,90);    
 r1=new JRadioButton("Apple");    
  r2=new JRadioButton("Mango");
r3=new JRadioButton("Grapes");    
  r1.setBounds(75,50,100,30);    
  r2.setBounds(75,100,100,30);  
  r3.setBounds(75,150,100,30);
r1.addItemListener(this); 
r2.addItemListener(this);
 r3.addItemListener(this);
  ButtonGroup bg=new ButtonGroup();    
  bg.add(r1);bg.add(r2); bg.add(r3);   
  f.add(r1);f.add(r2); f.add(r3); f.add(label);    
  f.setSize(600,600);    
  f.setLayout(null);    
  f.setVisible(true);    
  } 

public void itemStateChanged(ItemEvent e) {      
        if(e.getSource() ==r1)
           { label.setForeground(Color.MAGENTA);  
            label.setText("Apple: "     
            + (e.getStateChange()==1?"selected":"unselected")); }  
        if(e.getSource() ==r2) 
        {label.setForeground(Color.GREEN);
        label.setText("Mango: "     
        + (e.getStateChange() ==1?"selected":"unselected"));} 
       if(e.getSource() ==r3) 
         {label.setForeground(Color.RED);
        label.setText("Grapes: "     
        + (e.getStateChange()==1?"selected":"unselected")); }    
     }     
  public static void main(String[] args) {    
      new RadioExample();    
    }    
    }    
