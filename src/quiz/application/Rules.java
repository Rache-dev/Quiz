package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    public Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+name+" to Knowledge Quest!");
        heading.setBounds(50,20, 700,70);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD,35));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90, 700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setText(
                "<html>"+
                        "1. You MUST answer every question"+"<br><br>"+
                        "2. DO NOT click on SUBMIT if you are not done answering questions"+"<br><br>"+
                        "3. DO NOT attempt to copy"+"<br><br>"+
                        "4. Brace yourself this paper is not for the faint hearted"+"<br><br>"+
                        "5. Crying is allowed but please do so quietly"+"<br><br>"+
                        "5. ALL THE BEST"+"<br><br>"+
                "<html>"
        );
        add(rules);

        start = new JButton("Start");
        start.setBounds(400,450,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Times New Roman", Font.BOLD,15));
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250,450,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(800,650);
        setLocation(100,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == "Start"){
            setVisible(false);
            new Question(name);
        }else {
            setVisible(false);
            new Question(name);
        }

    }
    public static void main(String[] args){
        new Rules("User");
    }
}
