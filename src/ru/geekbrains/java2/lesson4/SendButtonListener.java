package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendButtonListener implements ActionListener {
	private final TextField message;
	private final TextArea chat_history;
	private final StringBuilder history;

	public SendButtonListener(TextArea text_area, TextField text_field, StringBuilder history) {
		this.chat_history = text_area;
		this.message = text_field;
		this.history = history;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!message.getText().equals("")) {
			history.append(message.getText());
			message.setText("");
			history.append("\n");
			chat_history.setText(history.toString());
		}
	}
}
