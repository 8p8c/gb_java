package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatFrame extends JFrame {
	private final StringBuilder history;

	public ChatFrame() {
		history = new StringBuilder();
		setTitle("Da Cool Chat");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		setBounds(50, 50, 600, 300);

		JPanel center = new JPanel();
		add(center, BorderLayout.CENTER);
		center.setLayout(new BorderLayout());
		TextArea chat_view = new TextArea();
		chat_view.setEditable(false);
		center.add(chat_view, BorderLayout.CENTER);

		JPanel bottom = new JPanel();
		add(bottom, BorderLayout.SOUTH);
		bottom.setLayout(new BorderLayout());
		TextField message = new TextField();
		bottom.add(message, BorderLayout.CENTER);
		message.addKeyListener(new MessageListener(chat_view, message, history));
		JButton send_button = new JButton("SEND");
		bottom.add(send_button, BorderLayout.EAST);
		send_button.addActionListener(new SendButtonListener(chat_view, message, history));

		setVisible(true);
		message.requestFocus();
	}
}
