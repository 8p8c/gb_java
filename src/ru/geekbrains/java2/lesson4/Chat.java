package ru.geekbrains.java2.lesson4;

import java.awt.*;
import java.util.LinkedList;

public class Chat {
	private final LinkedList<String> chat_history;
	private final TextArea chat_view;

	public Chat(TextArea chat_view) {
		this.chat_view = chat_view;
		this.chat_history = new LinkedList<String>();
	}

	public void send_message(String message) {
		chat_history.add(message);
		chat_view.setText(String.join("\n", chat_history));
	}
}
