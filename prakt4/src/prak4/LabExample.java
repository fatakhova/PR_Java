import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LabExample {
    public int a=0,b=0;
    JFrame jf=new JFrame("Football");
    JButton jb1=new JButton("AC Milan");
    JButton jb2=new JButton("Real Madrid");
    JLabel jl=new JLabel();
    LabExample() {
        createGui();
        setLabel();
        setJb1();
        setJb2();
    }
    public void createGui()
    {
        jf.setBounds(200,200,400,300);
        jf.getContentPane().setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setLabel()
    {
        jl.setBounds(170,30,200,150);
        jf.add(jl);
    }
    public void setJb1() {
        jb1.setBounds(80,130,100,50);
        jf.add(jb1);
        jb1.setBackground(new Color(214,146,150));
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                jl.setText("Result: "+a+"X"+b);
            }
        });
    }

    public void setJb2() {
        jb2.setBounds(220,130,100,50);
        jf.add(jb2);
        jb2.setBackground(new Color(80,148,217));
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b++;
                jl.setText("Result: "+a+"X"+b);
            }
        });
    }
    public static void main(String[] args) {
        new LabExample();
    }
}