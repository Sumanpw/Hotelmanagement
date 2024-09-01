
package hotel.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Date;


public class Checkout extends JFrame implements ActionListener{
    Choice ccustomer;
    JLabel roomnumber,lblcheckintime,lblcheckouttime;
    JButton checkout,back;
     
    
    Checkout()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text= new JLabel("Checkout");
        text.setBounds(100,20,100,30);
        text.setForeground(Color.BLUE);
        text.setFont (new Font("Tahoma",Font.PLAIN,20));
        add(text);
        
        JLabel lblid= new JLabel("Customer Id");
        lblid.setBounds(30,80,100,30);
        add(lblid);
        
        ccustomer= new Choice();
        ccustomer.setBounds(150,80,150,25);
        add(ccustomer);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tick.png"));
       Image i2 =i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel tick= new JLabel(i3);
       tick.setBounds(300,80,20,20);
       add(tick);
       
       JLabel lblroom= new JLabel("Room Number");
        lblroom.setBounds(30,130,100,30);
        add(lblroom);
        
        roomnumber= new JLabel();
        roomnumber.setBounds(200,130,100,30);
        add(roomnumber);
        
        JLabel lblcheckin= new JLabel("CheckIn Time");
        lblcheckin.setBounds(30,180,100,30);
        add(lblcheckin);
        
        lblcheckintime= new JLabel();
        lblcheckintime.setBounds(150,180,110,20);
        add(lblcheckintime);
        
        JLabel lblcheckinout= new JLabel("Checkout Time");
        lblcheckinout.setBounds(30,230,100,30);
        add(lblcheckinout);
        
        Date date=new Date();
        lblcheckouttime= new JLabel(""+date);
        lblcheckouttime.setBounds(150,230,150,30);
        add(lblcheckouttime);
        
        checkout = new JButton("Check Out");
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.setBounds(30,280,120,30);
        checkout.addActionListener(this);
        add(checkout);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(170,280,120,30);
        back.addActionListener(this);
        add(back);
        
         
         try{
            Conn c = new Conn();
            ResultSet rs=c.s.executeQuery("select * from customer");
            while(rs.next())
            {
                ccustomer.add(rs.getString("number"));
                roomnumber.setText(rs.getString("room"));
                lblcheckintime.setText(rs.getString("checkin"));
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
        
        
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/sixth.jpg"));
       Image i5 =i4.getImage().getScaledInstance(400,250,Image.SCALE_DEFAULT);
       ImageIcon i6=new ImageIcon(i5);
       JLabel image= new JLabel(i6);
       image.setBounds(350,50,400,250);
       add(image);
       
        
        
        setBounds(300,200,800,400);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==checkout)
        {
            String query = "delete from customer where number = '"+ccustomer.getSelectedItem()+"'";
             String query2= "update room set availlability ='Available' where roomnumber='"+roomnumber.getText()+"'";
             
             try{
                 Conn c=new Conn();
                 c.s.executeUpdate(query);
                 c.s.executeUpdate(query2);
                 JOptionPane.showMessageDialog(null,"Checkout  Successfully");
                 setVisible(false);
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
        }
        
        else
        {
            setVisible(false);
            new Reception();
        }
    }
            
    public static void main(String[] args){
        new Checkout();
    }
    
}
