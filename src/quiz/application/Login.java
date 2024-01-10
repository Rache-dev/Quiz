package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField nameField;
    public Login(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon("C:\\Users\\Barb\\Desktop\\JavaApplication\\Quiz\\src\\icon\\login.jpeg");
        JLabel label = new JLabel(i1);
        label.setBounds(0,0,600,500);
        add(label);

        JLabel heading = new JLabel("Knowledge Quest");
        heading.setBounds(750,60, 400,60);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD,35));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150, 400,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        name.setForeground(new Color(30,144,254));
        add(name);

        nameField = new JTextField();
        nameField.setBounds(735,200, 300,30);
        nameField.setFont(new Font("Arial", Font.BOLD,20));
        add(nameField);

        rules = new JButton("Rules");
        rules.setBounds(735,270,125,30);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.setFont(new Font("Times New Roman", Font.BOLD,15));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915,270,125,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,500);
        setLocation(100,100);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        if (ae.getSource() == rules){
            String name = nameField.getText();
            new Rules(name);
            setVisible(false);
        } else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[]args){
        new Login();
    }
}
