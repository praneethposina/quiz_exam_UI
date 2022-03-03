import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
class QuizExam 
extends JFrame 
implements ActionListener {
       JLabel l;
	JLabel title;
       JRadioButton jb[] = new JRadioButton[5];
       JButton b1, b2;
       ButtonGroup bg;
       int count = 0, current = 0, x = 1, y = 1, now = 0, p=0;
       int m[] = new int[10];
 
       QuizExam(String s) {
              super(s);
	title = new JLabel("Quiz Exam"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	title.setSize(300, 30); 
		title.setLocation(40, 5);
	add(title);
              l = new JLabel();
              add(l);
              bg = new ButtonGroup();
              for (int i = 0; i < 5; i++) {
              jb[i] = new JRadioButton();
              add(jb[i]);
              bg.add(jb[i]);
        }
        b1 = new JButton("Next");
        b2 = new JButton("previous");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        set();
        l.setBounds(30, 50, 450, 20);
        jb[0].setBounds(50, 90, 100, 20);
        jb[1].setBounds(50, 120, 100, 20);
        jb[2].setBounds(50, 150, 100, 20);
        jb[3].setBounds(50, 180, 100, 20);
        b1.setBounds(100, 240, 100, 30);
        b2.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
}
 
public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
              if (check())
                    count = count + 1;
                    current++;
                    set();
              if (current == 4) {
                    b1.setEnabled(false);
                    b2.setText("Result");
              }
        }

       else if (e.getSource() == b2) {
              if (check())
                    count = count + 1;
                     current--;
		set();
              if (current == 0) {
                    
		 
            
              }
        }
        
 
              if (e.getActionCommand().equals("Result")) {
                     if (check())
                     count = count + 1;
                     current++;
                     JOptionPane.showMessageDialog(this, "correct ans=" + count);
                     System.exit(0);
              }
        }
        void set() {
                 jb[4].setSelected(true);
                 if (current == 0) {
                     l.setText("1: What is colour of Apple?");
                     jb[0].setText("Orange");
                     jb[1].setText("Red");
                     jb[2].setText("Yellow");
                     jb[3].setText("Blue");
                 }
                 if (current == 1) {
                     l.setText("2: How many legs does a Dog have?");
                     jb[0].setText("Four");
                     jb[1].setText("Three");
                     jb[2].setText("Two");
                     jb[3].setText("Five");
                 }
                 if (current == 2) {
                     l.setText("3: What is colour of Banana?");
                     jb[0].setText("Orange");
                     jb[1].setText("Red");
                     jb[2].setText("Yellow");
                     jb[3].setText("Blue");
                 }
                 if (current == 3) {
                     l.setText("4: Who is CEO of Microsoft?");
                     jb[0].setText("Mark");
                     jb[1].setText("Larry Page");
                     jb[2].setText("Sundar Pichai");
                     jb[3].setText("Satya Nadella");
                 }
                 if (current == 4) {
                     l.setText("5: How many Legs does Man have?");
                     jb[0].setText("Four");
                     jb[1].setText("Three");
                     jb[2].setText("Two");
                     jb[3].setText("Five");
                 }
                
                 l.setBounds(30, 40, 450, 20);
                 for (int i = 0, j = 0; i <= 90; i += 30, j++)
                 jb[j].setBounds(50, 80 + i, 200, 20);
         }
 
        boolean check() {
              if (current == 0)
                      return (jb[1].isSelected());
              if (current == 1)
                      return (jb[0].isSelected());
              if (current == 2)
                      return (jb[2].isSelected());
              if (current == 3)
                      return (jb[3].isSelected());
              if (current == 4)
                      return (jb[2].isSelected());
           
              return false;
         }
 
         public static void main(String s[]) {
                new QuizExam("Quiz Exam");
       }
}