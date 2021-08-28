package cal;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class calculator implements ActionListener{

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea();

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button0 = new JButton();

    JButton buttonadd = new JButton();
    JButton buttonsub = new JButton();
    JButton buttonmul = new JButton();
    JButton buttondiv = new JButton();
    JButton buttonclear = new JButton();
    JButton buttondot = new JButton();
    JButton buttonequal = new JButton();

    double number1,number2,result;
    int addc=0,mulc=0,divc=0,subc=0;

    public calculator(){
        frame.setSize(340,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator");

       // frame.setResizable(false);
        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        Border border =  BorderFactory.createLineBorder(Color.BLUE,3);

        panel.add(textarea);

        textarea.setBackground(Color.BLACK);
        Border tborder =  BorderFactory.createLineBorder(Color.BLUE,3);
        textarea.setBorder(tborder);
        Font font = new Font("arial",Font.BOLD,33);
        textarea.setFont(font);
        textarea.setForeground(Color.WHITE);

        textarea.setPreferredSize(new Dimension(300,90));
        textarea.setLineWrap(true);
        button1.setPreferredSize(new Dimension(100, 40));
        button1.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button1.png"));

        button2.setPreferredSize(new Dimension(100, 40));
        button2.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button2.png"));

        button3.setPreferredSize(new Dimension(100, 40));
        button3.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button3.png"));

        button4.setPreferredSize(new Dimension(100, 40));
        button4.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button4.png"));

        button5.setPreferredSize(new Dimension(100, 40));
        button5.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button5.png"));

        button6.setPreferredSize(new Dimension(100, 40));
        button6.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button6.png"));

        button7.setPreferredSize(new Dimension(100, 40));
        button7.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button7.png"));

        button8.setPreferredSize(new Dimension(100, 40));
        button8.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button8.png"));

        button9.setPreferredSize(new Dimension(100, 40));
        button9.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button9.png"));

        button0.setPreferredSize(new Dimension(100, 40));
        button0.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\button0.png"));

        buttonadd.setPreferredSize(new Dimension(100, 40));
        buttonadd.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\buttonadd.png"));

        buttonsub.setPreferredSize(new Dimension(100, 40));
        buttonsub.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\buttonsub.png"));

        buttonmul.setPreferredSize(new Dimension(100, 40));
        buttonmul.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\buttonmul.png"));

        buttondot.setPreferredSize(new Dimension(100, 40));
        buttondot.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\buttondot.png"));

        buttonclear.setPreferredSize(new Dimension(100, 35));
        buttonclear.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\buttonclear.png"));

        buttondiv.setPreferredSize(new Dimension(100, 40));
        buttondiv.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\buttondiv.png"));

        buttonequal.setPreferredSize(new Dimension(190, 30));
        buttonequal.setIcon(new ImageIcon("C:\\Users\\sejal\\Desktop\\Calculator\\img\\buttonequal.png"));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonadd);
        panel.add(buttonsub);
        panel.add(buttonmul);
        panel.add(buttondiv);
        panel.add(buttondot);
        panel.add(buttonequal);
        panel.add(buttonclear);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonadd.addActionListener(this);
        buttonsub.addActionListener(this);
        buttonmul.addActionListener(this);
        buttondiv.addActionListener(this);
        buttondot.addActionListener(this);
        buttonclear.addActionListener(this);
        buttonequal.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == buttonclear){
            number1 = 0.0;
            number2 = 0.0;
            textarea.setText("");
        }
        if(e.getSource() == button1)
           textarea.append("1");
        if(e.getSource() == button2)
            textarea.append("2");
        if(e.getSource() == button3)
            textarea.append("3");
        if(e.getSource() == button4)
            textarea.append("4");
        if(e.getSource() == button5)
            textarea.append("5");
        if(e.getSource() == button6)
            textarea.append("6");
        if(e.getSource() == button7)
            textarea.append("7");
        if(e.getSource() == button8)
            textarea.append("8");
        if(e.getSource() == button9)
            textarea.append("9");
        if(e.getSource() == button0)
            textarea.append("0");
        if(e.getSource() == buttondot)
            textarea.append(".");
        if(e.getSource() == buttonadd){
            number1 = number_reader();
            textarea.setText("+");
            addc =1;
            divc = 0;
            subc=0;
            mulc=0;
        }
        if(e.getSource() == buttondiv){
            number1 = number_reader();
            textarea.setText("/");
            addc =0;
            divc = 1;
            subc=0;
            mulc=0;
        }
        if(e.getSource() == buttonsub){
            number1 = number_reader();
            textarea.setText("-");
            addc =0;
            divc = 0;
            subc=1;
            mulc=0;
        }
        if(e.getSource() == buttonmul){
            number1 = number_reader();
            textarea.setText("*");
            addc =0;
            divc = 0;
            subc=0;
            mulc=1;
        }
        if(e.getSource() == buttonequal){
            number2 = number_reader2();


            if(addc>0){
            result = number1 + number2;
            textarea.setText(Double.toString(result));
            }
           if(mulc>0){
               result = number1 * number2;
               textarea.setText(Double.toString(result));
           }
            if(subc>0){
                result = number1 - number2;
                textarea.setText(Double.toString(result));
            }
            if(divc>0){
                result = number1 / number2;
                textarea.setText(Double.toString(result));
            }
        }
    }
    public double number_reader(){
        double num1;
        String s;
        s = textarea.getText();
        num1 = Double.valueOf(s);
        return num1;
    }
    public double number_reader2(){
        double num1;
        String s;
        s = textarea.getText();
        num1 = Double.valueOf(s.substring(1));
        return num1;
    }
}