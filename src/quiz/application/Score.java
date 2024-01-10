package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    String name;
    int score;
    JLabel heading,lblScore;
    JButton submit;
    public Score(String name, int score){
        setBounds(400,150,750,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon i3 = new ImageIcon("C:\\Users\\Barb\\Desktop\\JavaApplication\\Quiz\\src\\icon\\score.png");
        Image i4 = i3.getImage().getScaledInstance(300,250, Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel label = new JLabel(i5);
        label.setBounds(0,200,300,250);
        add(label);

        heading = new JLabel("Thank you "+ name +" for playing Knowledge minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(heading);

        lblScore = new JLabel("Your score is " + score);
        lblScore.setBounds(350,200,300,30);
        lblScore.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(lblScore);

        submit= new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args){
        new Score("User",0);
    }
}
