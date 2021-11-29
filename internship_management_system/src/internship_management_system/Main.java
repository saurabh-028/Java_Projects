package internship_management_system;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		
		setBounds(200, 100, 1120, 714);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("internship_management_system/Icon/Main.jpg")));
		lblNewLabel.setBounds(199, 0, 988, 667);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Internship");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new internship().setVisible(true);;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(39, 84, 150, 44);
		contentPane.add(btnNewButton);
		
		JButton btnViewIntern = new JButton("View Intern");
		btnViewIntern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new show_internship().setVisible(true);
			}
		});
		btnViewIntern.setForeground(Color.RED);
		btnViewIntern.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViewIntern.setBackground(Color.BLACK);
		btnViewIntern.setBounds(39, 192, 150, 44);
		contentPane.add(btnViewIntern);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(39, 306, 150, 44);
		contentPane.add(btnExit);
	}
}
