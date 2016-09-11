package ru.com.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Администратор on 11.09.2016.
 */
public class CalculatorEngine implements ActionListener{


    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton)e.getSource();
        String clickedButtonLabel = clickedButton.getText();


        JOptionPane.showConfirmDialog(null,"Text epte"+ clickedButtonLabel,"test", JOptionPane.PLAIN_MESSAGE);


    }
}
