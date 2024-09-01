package hotel.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener {
    Dashboard(){
        setBounds(0,0,1550,1000);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        
        JLabel text=new JLabel("welcome To The TAJ Hotel");
        text.setBounds(400,80,1000,50);
        text.setFont(new Font("Tahoma", Font.PLAIN, 46));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JMenuBar mb=new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu hotel=new JMenu("Hotel Management");
        mb.add(hotel);
        hotel.setForeground(Color.RED);
        JMenuItem reception=new JMenuItem("Reception");
        reception.addActionListener(this);
        hotel.add(reception);
        
        
        JMenu admin=new JMenu("Admin");
        mb.add(admin);
        admin.setForeground(Color.BLUE);
        
        JMenuItem addemploy=new JMenuItem("Add Employe");
        addemploy.addActionListener(this);
        admin.add(addemploy);
        
        
        JMenuItem addrooms=new JMenuItem("Add Rooms");
        addrooms.addActionListener(this);
        admin.add(addrooms);
        
        
        JMenuItem adddriver=new JMenuItem("Add Drivers");
        adddriver.addActionListener(this);
        admin.add(adddriver);
        
        setVisible(true);
       
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Add Employe"))
        {
            new AddEmploye();
        }
        else if(ae.getActionCommand().equals("Add Rooms"))
        {
            new AddRooms();
        }
        else if (ae.getActionCommand().equals("Add Drivers"))
        {
            new AddDrivers();
        }
         else if (ae.getActionCommand().equals("Reception"))
        {
            new Reception();
        }
    }
    
     public static void main(String[] args){
         new Dashboard();
         
     }
    
}