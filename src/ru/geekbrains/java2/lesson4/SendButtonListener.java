package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendButtonListener implements ActionListener {
	private final Chat chat;
	private final TextField message;

	public SendButtonListener(Chat chat, TextField message) {
		this.chat = chat;
		this.message = message;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!message.getText().equals("")) {
			chat.send_message(message.getText());
			message.setText("");
		}
	}
}
