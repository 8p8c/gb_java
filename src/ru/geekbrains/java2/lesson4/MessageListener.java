package ru.geekbrains.java2.lesson4;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MessageListener implements KeyListener {
	private final Chat chat;
	private final TextField message;

	public MessageListener(Chat chat, TextField text_field) {
		this.chat = chat;
		this.message = text_field;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == 10 && !(message.getText().equals(""))) {
			chat.send_message(message.getText());
			message.setText("");
		}
	}
}
