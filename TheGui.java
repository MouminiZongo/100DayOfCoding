


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.String;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class TheGui extends JFrame {

        private JPanel newConctact;
        private JPanel panel1;
        private JPanel panel2;
        private JPanel panel3;
        private JPanel panel4;

        private JLabel titleLabel, UserNameLabel, passwordLabel;
        private JTextField UserNameTextField1;
        private JPasswordField passwordField1;

        private JButton doneButton;

        private double balance;
        private final int heigth = 500;
        private final int weight = 300;




        public static Hastable conctactBook = new Hastable();


        public TheGui() {
            setTitle("Banking ");
            setSize(heigth, weight);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(new GridLayout(7, 1));
            buildPanel();
            add(newConctact);
            // build panel and add to frame
            buildPanel1();

            // Add panel to frame
            add(panel1);

            // build panel2 and add to frame
            buildPanel2();

            // Add panel to frame
            add(panel2);

            // build panel3 and add to frame
            buildButtom();
            add(panel3);


            // Add panel
            //add(panel4);



            // set visible
            setVisible(true);

        }
        /**
         *  to initialize the buil panel  panel components
         */
        private void buildPanel() {

            newConctact = new JPanel();
            titleLabel = new JLabel("PERSONAL INFORMATION");
            newConctact.add(titleLabel);
        }

        /**
         *  to initialize the buil panel1  panel components
         */
        private void buildPanel1() {

            panel1 = new JPanel();
            UserNameLabel = new JLabel("UserName");
            UserNameTextField1 = new JTextField(5);
            panel1.add(UserNameLabel);
            panel1.add(UserNameTextField1);

        }

        /**
         *  to initialize the buil panel4  panel components
         */
        private void buildPanel2() {

            panel2 = new JPanel();
            passwordLabel = new JLabel("PASSWORD");
            passwordField1 = new JPasswordField(5);
            panel2.add(passwordLabel);
            panel2.add(passwordField1);
        }



        /**
         *  to initialize the buil button  panel components
         */
        private void buildButtom() {

            panel3 = new JPanel();
            doneButton = new JButton("DONE");
            doneButton.addActionListener(new doneButtonListener());
            panel3.add(doneButton);


        }

        /**
         *  to create an action listener for done button
         */
        private class doneButtonListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                String message = conctactBook.get(UserNameTextField1.getText(), passwordField1.getText());
                JOptionPane.showMessageDialog(null, message,"", INFORMATION_MESSAGE);
            }

//            String message = conctactBook.get(UserNameTextField1.getText(), passwordField1.getText());
//            JOptionPane.showMessageDialog(null, message,"", INFORMATION_MESSAGE);
        }


    public static void main(String[] args) {
        new TheGui();
    }

    }



