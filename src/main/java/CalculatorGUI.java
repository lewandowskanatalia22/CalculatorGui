/**
 * Created by jan on 2017-10-14.
 */

    import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



    public class CalculatorGUI implements ActionListener {


        private int width = 250;
        private int height = 250;

        private double firstNumber;
        private double secondNumber;
        private double result;
        private int operation;
        private JTextField enterTextField;
        private JButton zero, one, two, three, four, five, six, seven, eight, nine,
                multiply, divide, subtract, dot, equals, add;
        private JPanel panel1;


        public CalculatorGUI() {


            JFrame frame = new JFrame("Kalkulator GUI");

            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
            frame.setLocation(x, y);


            frame.setSize(width, height);

            JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
            frame.add(buttonPanel, BorderLayout.CENTER);

            enterTextField = new JTextField();
            frame.add(enterTextField, BorderLayout.NORTH);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);


            seven = new JButton("7");
            seven.addActionListener(this);

            eight = new JButton("8");
            eight.addActionListener(this);

            nine = new JButton("9");
            nine.addActionListener(this);

            divide = new JButton("/");
            divide.addActionListener(this);

            four = new JButton("4");
            four.addActionListener(this);

            five = new JButton("5");
            five.addActionListener(this);

            six = new JButton("6");
            six.addActionListener(this);

            multiply = new JButton("*");
            multiply.addActionListener(this);

            one = new JButton("1");
            one.addActionListener(this);

            two = new JButton("2");
            two.addActionListener(this);

            three = new JButton("3");
            three.addActionListener(this);

            subtract = new JButton("-");
            subtract.addActionListener(this);

            zero = new JButton("0");
            zero.addActionListener(this);

            dot = new JButton(".");
            dot.addActionListener(this);

            equals = new JButton("=");
            equals.addActionListener(this);

            add = new JButton("+");
            add.addActionListener(this);



            buttonPanel.add(seven);
            buttonPanel.add(eight);
            buttonPanel.add(nine);
            buttonPanel.add(divide);
            buttonPanel.add(four);
            buttonPanel.add(five);
            buttonPanel.add(six);
            buttonPanel.add(multiply);
            buttonPanel.add(one);
            buttonPanel.add(two);
            buttonPanel.add(three);
            buttonPanel.add(subtract);
            buttonPanel.add(zero);
            buttonPanel.add(dot);
            buttonPanel.add(equals);
            buttonPanel.add(add);

        }



        public static void main(String[] args) {
            CalculatorGUI kalkulator = new CalculatorGUI();
        }



        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == dot) {
                enterTextField.setText(enterTextField.getText() + ".");
            }

            if (event.getSource() == one) {
                enterTextField.setText(enterTextField.getText() + "1");
            }
            if (event.getSource() == two) {
                enterTextField.setText(enterTextField.getText() + "2");
            }
            if (event.getSource() == three) {
                enterTextField.setText(enterTextField.getText() + "3");
            }
            if (event.getSource() == four) {
                enterTextField.setText(enterTextField.getText() + "4");
            }
            if (event.getSource() == five) {
                enterTextField.setText(enterTextField.getText() + "5");
            }
            if (event.getSource() == six) {
                enterTextField.setText(enterTextField.getText() + "6");
            }
            if (event.getSource() == seven) {
                enterTextField.setText(enterTextField.getText() + "7");
            }
            if (event.getSource() == eight) {
                enterTextField.setText(enterTextField.getText() + "8");
            }
            if (event.getSource() == nine) {
                enterTextField.setText(enterTextField.getText() + "9");
            }


            if (event.getSource() == multiply) {
                firstNumber = Double.parseDouble(enterTextField.getText());
                enterTextField.setText("");
                operation = 1;
            }
            if (event.getSource() == divide) {
                firstNumber = Double.parseDouble(enterTextField.getText());
                enterTextField.setText("");
                operation = 2;
            }

            if (event.getSource() == add) {
                firstNumber = Double.parseDouble(enterTextField.getText());
                enterTextField.setText("");
                operation = 3;
            }
            if (event.getSource() == subtract) {
                firstNumber = Double.parseDouble(enterTextField.getText());
                enterTextField.setText("");
                operation = 4;
            }
            if (event.getSource() == equals) {
                secondNumber = Double.parseDouble(enterTextField.getText());
                enterTextField.setText("");


                switch (operation) {
                    case 1: {
                        result = firstNumber * secondNumber;
                        break;
                    }

                    case 2: {
                        result = firstNumber / secondNumber;
                        break;
                    }

                    case 3: {
                        result = firstNumber + secondNumber;
                        break;
                    }

                    case 4: {
                        result = firstNumber - secondNumber;
                        break;
                    }

                }

                enterTextField.setText("" + result);
            }
        }
    }

