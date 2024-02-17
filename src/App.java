import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculatorGUI();
    }
}

class Calculator {
    JTextField textField = new JTextField();
    JLabel resultOfCalculation = new JLabel();

    String stringToCalculate = "";

    public void calcutaeString() {
        try {
            double result = CalculateInfix.calculateInfix(stringToCalculate);
        resultOfCalculation.setText(result + "");
        } catch (Exception e) {
            resultOfCalculation.setText("Syntax Error");
        }

    }

    public void addNumberAndSymbol(char toAdd) throws Exception {
        if(toAdd == 'A'){
            stringToCalculate = "";
            textField.setText(stringToCalculate);
            resultOfCalculation.setText("0");
            return;
        }
        if(toAdd == 'B'){
            if(stringToCalculate.length() == 0) return;
            stringToCalculate = stringToCalculate.substring(0, stringToCalculate.length() - 1);
            textField.setText(stringToCalculate);
            calcutaeString();
            return;
        }
        stringToCalculate += toAdd;
        textField.setText(stringToCalculate);
        calcutaeString();
    }

    public void calculatorGUI() {
        ImageIcon backIcon = new ImageIcon("icon-back.jpg");
        // Make a perfect Frame
        JFrame frame = new JFrame();
        frame.setSize(245, 460);
        ImageIcon icon = new ImageIcon("icon.png");
        frame.setIconImage(icon.getImage());
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a text field
        textField.setBounds(5, 5, 230, 95);
        textField.setFont(new Font("Arial", Font.BOLD, 20));

        frame.add(textField);

        resultOfCalculation.setBounds(5, 105, 230, 55);
        resultOfCalculation.setText("0");
        resultOfCalculation.setFont(new Font("Arial", Font.BOLD, 18));

        frame.add(resultOfCalculation);

        // Give name of calcullator
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bEqual, bPlus, bMinus, bMul, bDiv, bDot, bAC, bBack,
                bOpenBreces, bCloseBreces;

        // init buttons
        b0 = new JButton();
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        bEqual = new JButton();
        bPlus = new JButton();
        bMinus = new JButton();
        bMul = new JButton();
        bDiv = new JButton();
        bDot = new JButton();
        bAC = new JButton();
        bBack = new JButton();
        bOpenBreces = new JButton();
        bCloseBreces = new JButton();

        // set buuton text
        b0.setText("0");
        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("5");
        b6.setText("6");
        b7.setText("7");
        b8.setText("8");
        b9.setText("9");
        bEqual.setText("=");
        bPlus.setText("+");
        bMinus.setText("_");
        bMul.setText("*");
        bDiv.setText("/");
        bDot.setText(".");
        bAC.setText("AC");
        bBack.setIcon(backIcon);
        ;
        bOpenBreces.setText("(");
        bCloseBreces.setText(")");

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('0');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('1');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('2');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('3');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('4');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('5');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('6');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('7');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('8');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('9');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('=');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('+');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('*');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('/');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('-');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('A');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('B');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bOpenBreces.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol('(');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bCloseBreces.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    addNumberAndSymbol(')');
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        bAC.setBounds(5, 170, 50, 50);
        bBack.setBounds(65, 170, 50, 50);
        bOpenBreces.setBounds(125, 170, 50, 50);
        bCloseBreces.setBounds(185, 170, 50, 50);

        b7.setBounds(5, 225, 50, 50);
        b8.setBounds(65, 225, 50, 50);
        b9.setBounds(125, 225, 50, 50);
        bDiv.setBounds(185, 225, 50, 50);

        b4.setBounds(5, 285, 50, 50);
        b5.setBounds(65, 285, 50, 50);
        b6.setBounds(125, 285, 50, 50);
        bMul.setBounds(185, 285, 50, 50);

        b1.setBounds(5, 345, 50, 50);
        b2.setBounds(65, 345, 50, 50);
        b3.setBounds(125, 345, 50, 50);
        bMinus.setBounds(185, 345, 50, 50);

        b0.setBounds(5, 405, 50, 50);
        bDot.setBounds(65, 405, 50, 50);
        bEqual.setBounds(125, 405, 50, 50);
        bPlus.setBounds(185, 405, 50, 50);

        b0.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        b9.setFont(new Font("Arial", Font.BOLD, 20));
        bEqual.setFont(new Font("Arial", Font.BOLD, 20));
        bPlus.setFont(new Font("Arial", Font.BOLD, 20));
        bMinus.setFont(new Font("Arial", Font.BOLD, 20));
        bMul.setFont(new Font("Arial", Font.BOLD, 20));
        bDiv.setFont(new Font("Arial", Font.BOLD, 20));
        bDot.setFont(new Font("Arial", Font.BOLD, 20));
        bAC.setFont(new Font("Arial", Font.BOLD, 10));
        bAC.setBackground(new Color(255, 100, 100));
        bBack.setFont(new Font("Arial", Font.BOLD, 20));
        bOpenBreces.setFont(new Font("Arial", Font.BOLD, 20));
        bCloseBreces.setFont(new Font("Arial", Font.BOLD, 20));

        frame.add(bAC);
        frame.add(bBack);
        frame.add(bCloseBreces);
        frame.add(bOpenBreces);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b0);
        frame.add(bDot);
        frame.add(bDiv);
        frame.add(bEqual);
        frame.add(bMul);
        frame.add(bMinus);
        frame.add(bPlus);

        // Now show the frame
        frame.setVisible(true);

    }
}
