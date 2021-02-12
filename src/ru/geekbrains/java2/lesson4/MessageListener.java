package ru.geekbrains.java2.lesson4;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MessageListener implements KeyListener {
	private final TextField message;
	private final TextArea chat_history;
	private final StringBuilder history;

	public MessageListener(TextArea text_area, TextField text_field, StringBuilder history) {
		this.chat_history = text_area;
		this.message = text_field;
		this.history = history;
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
			history.append(message.getText());
			message.setText("");
			history.append("\n");
			chat_history.setText(history.toString());
		}
	}
}
