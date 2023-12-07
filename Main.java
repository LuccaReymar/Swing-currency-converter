import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JTextField;

public class Main{
    public static void main(String[] args) {
        String[] currency = { "EUR", "JPY", "AUD", "GBP", "CHF", "MXN", "SEK", "INR", "RUB"};
        double[] rates = { 1.0, 143.85, 1.48, 0.87, 0.98, 19.99, 10.7, 79.63, 61.15 };
       
        JFrame jFrame = new JFrame("Currency Converter");

        JComboBox<String> startList = new JComboBox<>(currency);
        startList.setBounds(60, 50, 90, 20);

        JButton done = new JButton("Done");
        done.setBounds(100, 110, 90, 20);

        JTextField t1;
        
        t1 = new JTextField("0");
        t1.setBounds(90, 80, 115, 20);

        JLabel amount = new JLabel();
        amount.setBounds(90, 100, 200, 100);

        jFrame.add(done);
        jFrame.add(startList);
        jFrame.add(amount);
        jFrame.add(t1);
      
        jFrame.setLayout(null);
        jFrame.setSize(350, 250);
        jFrame.setVisible(true);
        

        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                  double d = Double.parseDouble(t1.getText());
  
                // Converting rupees to dollars
                double d1 = (d / rates[startList.getSelectedIndex()]);
  
                // Getting the string value of the
                // calculated value
                String str1 = "$" + String.valueOf(d1);
                amount.setText(str1);
            }
        });

    }
}