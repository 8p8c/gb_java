package ru.geekbrains.java.lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class CalculatorFrame extends JFrame {
	public CalculatorFrame() {
		setTitle("Calculator");

		setBounds(50, 50, 300, 600);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.setLayout(new BorderLayout());
		JTextField inputField = new JTextField();
		top.add(inputField, BorderLayout.CENTER);

		JPanel bottom = new JPanel();
		bottom.setLayout(new GridLayout(4, 4));

		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.CENTER);

		DigitButtonListener digitButtonListener = new DigitButtonListener(inputField);
		ActionListener operationListener = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton button = (JButton) e.getSource();

					StringBuilder sb = new StringBuilder(inputField.getText());
					sb.append(button.getText());

					inputField.setText(sb.toString());
				}
			};


		int i = 1;
		while (i <= 3) {
			JButton button = new JButton(String.valueOf(i));
			button.addActionListener(digitButtonListener);
			bottom.add(button);
			i++;
		}
		JButton plus = new JButton("+");
		plus.addActionListener(operationListener);
		bottom.add(plus);

		while (i <= 6) {
			JButton button = new JButton(String.valueOf(i));
			button.addActionListener(digitButtonListener);
			bottom.add(button);
			i++;
		}
		JButton minus = new JButton("-");
		minus.addActionListener(operationListener);
		bottom.add(minus);

		while (i <= 9) {
			JButton button = new JButton(String.valueOf(i));
			button.addActionListener(digitButtonListener);
			bottom.add(button);
			i++;
		}
		//Does not work yet.
		JButton mult = new JButton("*");
		mult.addActionListener(operationListener);
		bottom.add(mult);

		JButton zero = new JButton("0"); // Zero goes after all other digits.
		zero.addActionListener(digitButtonListener);
		bottom.add(zero);

		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					inputField.setText("");
				}
			});
		bottom.add(clear);

		JButton calc = new JButton("=");
		calc.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int result;
					String[] values = inputField.getText().split("[\\+-]");
					if (inputField.getText().contains("+")) {
						result = Integer.parseInt(values[0]) + Integer.parseInt(values[1]);
					}
					else {
						result = Integer.parseInt(values[0]) - Integer.parseInt(values[1]);
					}
					inputField.setText(String.valueOf(result));
				}
			});
		bottom.add(calc);

		//Does not work yet.
		JButton partition = new JButton("/");
		partition.addActionListener(operationListener);
		bottom.add(partition);

		setVisible(true);
	}
}
