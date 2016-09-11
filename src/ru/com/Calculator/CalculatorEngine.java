package ru.com.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Администратор on 11.09.2016.
 */
public class CalculatorEngine implements ActionListener{

    SimpleCalculator2 parent;

    CalculatorEngine(SimpleCalculator2 parent){

        this.parent = parent;
    }

        @Override
    public void actionPerformed(ActionEvent e) {

            JButton clickenButton = (JButton)e.getSource();
            String dispFildText = parent.displayFild.getText();
            String clickedButtonLabel = clickenButton.getText();
            parent.displayFild.setText(dispFildText + clickedButtonLabel);






    }
}
