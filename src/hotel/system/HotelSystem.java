
package hotel.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelSystem extends JFrame implements ActionListener {
    HotelSystem (){
        setSize(1366,565);
        //(100,100);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        add(image);
        image.setBounds(0,0,1366,565);
        
        JLabel text=new JLabel("Hotel Management System");
        text.setBounds(20,430,1000,90);
        text.setFont(new Font("serif", Font.PLAIN, 50));
        text.setForeground(Color.white);
        image.add(text);
        
        JButton next=new JButton("Next");
        next.setBounds(1150,450,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.MAGENTA);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.PLAIN,24));
        image.add(next);
        
        setVisible(true);
        while(true){
            text.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
    }
 
    
    public static void main(String[] args) {
        new HotelSystem();
    }
    
}
