import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame {
    int r1, r2,r3, flag;
    double r4;
    JFrame frame;
    JTextField tf1, tf2, tf3;
    JButton one, two, three, four,five,six,seven,eight,nin,zeto, plus, minus,multi,div,clear,  equal;
    Calculator() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);


        tf1 = new JTextField();tf1.setBounds(130, 10, 275, 50);
        frame.add(tf1);
        tf2 = new JTextField();tf2.setBounds(130, 400, 200, 50);
        //frame.add(tf2);
        tf3 = new JTextField();tf3.setBounds(130, 410, 200, 50);
        //frame.add(tf3);

        one = new JButton(" 1 ");one.setBounds(130, 70, 50, 50);
        frame.add(one);
        two = new JButton(" 2 ");two.setBounds(205, 70, 50, 50);
        frame.add(two);
        three = new JButton(" 3 ");three.setBounds(280, 70, 50, 50);
        frame.add(three);
        div = new JButton(" / ");div.setBounds(350, 70, 50, 50);
        frame.add(div);

        four = new JButton(" 4 ");four.setBounds(130, 130, 50, 50);
        frame.add(four);
        five = new JButton(" 5 ");five.setBounds(205, 130, 50, 50);
        frame.add(five);
        six = new JButton(" 6 ");six.setBounds(280, 130, 50, 50);
        frame.add(six);
        multi = new JButton(" X ");multi.setBounds(350, 130, 50, 50);
        frame.add(multi);

        seven = new JButton(" 7 ");seven.setBounds(130, 190, 50, 50);
        frame.add(seven);
        eight = new JButton(" 8 ");eight.setBounds(205, 190, 50, 50);
        frame.add(eight);
        nin = new JButton(" 9 ");nin.setBounds(280, 190, 50, 50);
        frame.add(nin);
        minus = new JButton(" - ");minus.setBounds(350, 190, 50, 50);
        frame.add(minus);

        clear = new JButton(" C ");clear.setBounds(130, 250, 50, 50);
        frame.add(clear);
        zeto = new JButton(" 0 ");zeto.setBounds(205, 250, 50, 50);
        frame.add(zeto);
        equal = new JButton(" = ");equal.setBounds(280, 250, 50, 50);
        frame.add(equal);
        plus = new JButton(" + ");plus.setBounds(350, 250, 50, 50);
        frame.add(plus);



        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "1");
                tf3.setText(tf3.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "2");
                tf3.setText(tf3.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "3");
                tf3.setText(tf3.getText() + "3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "4");
                tf3.setText(tf3.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "5");
                tf3.setText(tf3.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "6");
                tf3.setText(tf3.getText() + "6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "7");
                tf3.setText(tf3.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "8");
                tf3.setText(tf3.getText() + "8");
            }
        });
        nin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "9");
                tf3.setText(tf3.getText() + "9");
            }
        });
        zeto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "0");
                tf3.setText(tf3.getText() + "0");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                r1 = Integer.parseInt(tf1.getText());
                tf3.setText("");
                tf2.setText(r1 + "");
                tf1.setText(tf1.getText() + "+");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = -1;
                r2 = Integer.parseInt(tf1.getText());
                tf3.setText("");
                tf2.setText(r2 + "");
                tf1.setText(tf1.getText() + "-");
            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 2;
                r3 = Integer.parseInt(tf1.getText());
                tf3.setText("");
                tf2.setText(r3 + "");
                tf1.setText(tf1.getText() + "*");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = -2;
                r4 = Integer.parseInt(tf1.getText());
                tf3.setText("");
                tf2.setText(r4 + "");
                tf1.setText(tf1.getText() + "/");
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (flag == 1) {

                    int result = r1 + Integer.parseInt(tf3.getText());
                    tf2.setText(result + "");
                    tf1.setText(result + "");
                }
                else if (flag == -1) {

                    int result = r2 - Integer.parseInt(tf3.getText());
                    tf2.setText(result + "");
                    tf1.setText(result + "");
                }
                else if (flag == 2) {

                    int result = r3 * Integer.parseInt(tf3.getText());
                    tf2.setText(result + "");
                    tf1.setText(result + "");
                }
                else if (flag == -2) {

                    double result = ((double)r4) / Integer.parseInt(tf3.getText());
                    tf2.setText(result + "");
                    tf1.setText(result + "");
                }
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        Calculator ca = new Calculator();

    }
}
