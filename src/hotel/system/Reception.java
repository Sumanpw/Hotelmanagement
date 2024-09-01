
package hotel.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
    JButton newCustomer,rooms,department,pickup,allEmploye,logout,managerInfo,checkout,customer,searchroom,update,roomupdate;
    Reception(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        newCustomer= new JButton("new Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);
                
        rooms= new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);
        
        department= new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);
        
        allEmploye= new JButton("All Employe");
        allEmploye.setBounds(10,150,200,30);
        allEmploye.setBackground(Color.BLACK);
        allEmploye.setForeground(Color.WHITE);
        allEmploye.addActionListener(this);
        add(allEmploye);
        
                
        customer= new JButton("Customer Info ");
        customer.setBounds(10,190,200,30);
        customer.setBackground(Color.BLACK);
        customer.setForeground(Color.WHITE);
        customer.addActionListener(this);
        add(customer);
        
        managerInfo= new JButton("Manager Info ");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.addActionListener(this);
        add(managerInfo);
        
        checkout= new JButton("Chekeout ");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);
        
        update= new JButton("Update Status ");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        roomupdate= new JButton("Update Room Status ");
        roomupdate.setBounds(10,350,200,30);
        roomupdate.setBackground(Color.BLACK);
        roomupdate.setForeground(Color.WHITE);
        roomupdate.addActionListener(this);
        add(roomupdate);
        
        pickup= new JButton("Pickup Service ");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);
        
        searchroom= new JButton("Search Room ");
        searchroom.setBounds(10,430,200,30);
        searchroom.setBackground(Color.BLACK);
        searchroom.setForeground(Color.WHITE);
        searchroom.addActionListener(this);
        add(searchroom);
        
        logout= new JButton("Log Out ");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(250,30,500,400);
        add(image);

        
        
        setBounds(350,100,800,550);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==newCustomer)
        {
            setVisible(false);
            new AddCustomer();
        }
        else if(ae.getSource()==rooms)
        {
            setVisible(false);
            new Room();
        }
        else if(ae.getSource()==department)
        {
            setVisible(false);
            new Department();
        }
        else if(ae.getSource()==allEmploye)
        {
            setVisible(false);
            new EmployeInfo();
        }
        else if(ae.getSource()==managerInfo)
        {
            setVisible(false);
            new ManagerInfo();      
        }
        else if(ae.getSource()==customer)
        {
            setVisible(false);
            new CustomerInfo();
        }
        else if(ae.getSource()==searchroom)
        {
            setVisible(false);
            new SearchRoom();
        }
        else if(ae.getSource()==update)
        {
            setVisible(false);
            new UpdateCheck();
        }
        else if(ae.getSource()==roomupdate)
        {
            setVisible(false);
            new UpdateRoom();
        }
        else if(ae.getSource()==pickup)
        {
            setVisible(false);
            new Pickup();
        }
        else if(ae.getSource()==checkout)
        {
            setVisible(false);
            new Checkout();
        }
        else if(ae.getSource()==logout)
        {
            setVisible(false);
            System.exit(0);
        }
        
       
        
    }
    public static void main(String[] args){
        new Reception();
    }
    
}
