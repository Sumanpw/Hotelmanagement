package hotel.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddRooms extends JFrame implements ActionListener{
    JButton add,cancel;
    JTextField tfroom,tfprice;
    JComboBox typecombo,availablecombo,cleancombo;
    AddRooms()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Add Rooms");
        heading.setFont(new Font("Tahima",Font.BOLD,18));
        heading.setBounds(150,20,200,20);
        add(heading);
        
        JLabel lblroom=new JLabel("Room Number");
        lblroom.setFont(new Font("Tahima",Font.PLAIN,16));
        lblroom.setBounds(60,80,120,30);
        add(lblroom);
        
        tfroom=new JTextField();
        tfroom.setBounds(200,80,150,30);
        add(tfroom);
        
        JLabel lblavilable=new JLabel("Available");
        lblavilable.setFont(new Font("Tahima",Font.PLAIN,16));
        lblavilable.setBounds(60,130,120,30);
        add(lblavilable);
        
       String[] availableOption = {"Available", "Occupied"};
       availablecombo = new JComboBox(availableOption);
       availablecombo.setBounds(200,130,150,30);
       availablecombo.setBackground(Color.WHITE);
       add(availablecombo);
       
       JLabel lblclean=new JLabel("Cleaning Status");
        lblclean.setFont(new Font("Tahima",Font.PLAIN,16));
        lblclean.setBounds(60,180,120,30);
        add(lblclean);
        
       String[] cleanOption = {"Cleaned", "Dirty"};
       cleancombo = new JComboBox(cleanOption);
       cleancombo.setBounds(200,180,150,30);
       cleancombo.setBackground(Color.WHITE);
       add(cleancombo);
       
       JLabel lblprice=new JLabel("Price");
        lblprice.setFont(new Font("Tahima",Font.PLAIN,16));
        lblprice.setBounds(60,230,120,30);
        add(lblprice);
        
        tfprice=new JTextField();
        tfprice.setBounds(200,230,150,30);
        add(tfprice);
        
        JLabel lbltype=new JLabel("Bed Status");
        lbltype.setFont(new Font("Tahima",Font.PLAIN,16));
        lbltype.setBounds(60,280,120,30);
        add(lbltype);
        
        String[] typeOption = {"Single bed", "Double bed"};
       typecombo = new JComboBox(typeOption);
       typecombo.setBounds(200,280,150,30);
       typecombo.setBackground(Color.WHITE);
       add(typecombo);
       
       add=new JButton("Add Rooms");
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
       add.setBounds(60,350,130,30);
       add.addActionListener(this);
       add(add);
       
       cancel=new JButton("Cancel");
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.setBounds(220,350,130,30);
       cancel.addActionListener(this);
       add(cancel);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
       JLabel image=new JLabel(i1);
       image.setBounds(400,30,500,300);
       add(image);
       

        
        setBounds(330,200,940,470);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add)
        {
            String roomnumber=tfroom.getText();
            String avalability = (String) availablecombo.getSelectedItem();
            String status = (String) cleancombo.getSelectedItem();
            String price=tfprice.getText();
            String type = (String) typecombo.getSelectedItem();
             
             try{
                 
                 Conn conn=new Conn();
                 String str="insert into room values('"+roomnumber+"', '"+avalability+"','"+status+"','"+price+"','"+type+"')";
                 conn.s.executeUpdate(str);
                 JOptionPane.showMessageDialog(null, "New room added sucessfully");
                 setVisible(false);
                 
             }
             catch(Exception e){
                 e.printStackTrace();
             }
            
        }
        else
        {
            setVisible(false);
        }
          
    }
    public static void main(String[] args){
        new AddRooms();
    }
    
}