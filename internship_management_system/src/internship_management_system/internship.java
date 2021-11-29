package internship_management_system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class internship extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField Experience;
	private JTextField Description;
	private JTextField Skills;
	private JTextField Name;

	
	public static void main(String[] args) {
		new internship().setVisible(true);
	}

	
	public internship() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 1020, 779);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Internship");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(539, 163, 147, 41);
		contentPane.add(lblNewLabel);
		
		JComboBox Internship = new JComboBox();
		Internship.setBackground(new Color(255, 255, 255));
		Internship.setFont(new Font("Tahoma", Font.BOLD, 15));
		Internship.setModel(new DefaultComboBoxModel(new String[] {"Digital Marketing", "Website Designing", "Python Devolopement", "Data analysis ", "Java Devopement"}));
		Internship.setForeground(new Color(0, 0, 0));
		Internship.setBounds(715, 167, 200, 33);
		contentPane.add(Internship);
		
		JLabel lblInternshipType = new JLabel("Internship Type");
		lblInternshipType.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInternshipType.setBounds(539, 253, 147, 41);
		contentPane.add(lblInternshipType);
		
		JComboBox Type = new JComboBox();
		Type.setModel(new DefaultComboBoxModel(new String[] {"Work From Home", "Part-Time ", "Internship with job offers "}));
		Type.setForeground(Color.BLACK);
		Type.setFont(new Font("Tahoma", Font.BOLD, 15));
		Type.setBackground(Color.WHITE);
		Type.setBounds(715, 257, 200, 33);
		contentPane.add(Type);
		
		JLabel lblMonthlyStippened = new JLabel("Monthly Stipend");
		lblMonthlyStippened.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMonthlyStippened.setBounds(65, 261, 161, 41);
		contentPane.add(lblMonthlyStippened);
		
		JComboBox Stipend = new JComboBox();
		Stipend.setModel(new DefaultComboBoxModel(new String[] {"2000", "4000", "6000", "8000", "10000"}));
		Stipend.setForeground(Color.BLACK);
		Stipend.setFont(new Font("Tahoma", Font.BOLD, 15));
		Stipend.setBackground(Color.WHITE);
		Stipend.setBounds(267, 261, 200, 33);
		contentPane.add(Stipend);
		
		JLabel lblStartingFrom = new JLabel("Starting From");
		lblStartingFrom.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStartingFrom.setBounds(556, 586, 161, 41);
		contentPane.add(lblStartingFrom);
		
		textField = new JTextField();
		textField.setBounds(715, 592, 200, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMaximumDuration = new JLabel("Maximum Duration");
		lblMaximumDuration.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMaximumDuration.setBounds(65, 342, 161, 41);
		contentPane.add(lblMaximumDuration);
		
		JComboBox Duration = new JComboBox();
		Duration.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "6"}));
		Duration.setForeground(Color.BLACK);
		Duration.setFont(new Font("Tahoma", Font.BOLD, 15));
		Duration.setBackground(Color.WHITE);
		Duration.setBounds(267, 346, 200, 33);
		contentPane.add(Duration);
		
		JLabel lblCgpa = new JLabel("CGPA");
		lblCgpa.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCgpa.setBounds(556, 342, 161, 41);
		contentPane.add(lblCgpa);
		
		JLabel lblExperience = new JLabel("Experience");
		lblExperience.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblExperience.setBounds(65, 459, 161, 41);
		contentPane.add(lblExperience);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDescription.setBounds(556, 459, 161, 41);
		contentPane.add(lblDescription);
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSkills.setBounds(65, 586, 161, 41);
		contentPane.add(lblSkills);
		
		JComboBox CGPA = new JComboBox();
		CGPA.setModel(new DefaultComboBoxModel(new String[] {"/6", "/7", "/8", "/9", "10"}));
		CGPA.setForeground(Color.BLACK);
		CGPA.setFont(new Font("Tahoma", Font.BOLD, 15));
		CGPA.setBackground(Color.WHITE);
		CGPA.setBounds(715, 346, 200, 33);
		contentPane.add(CGPA);
		
		Experience = new JTextField();
		Experience.setColumns(10);
		Experience.setBounds(267, 442, 200, 80);
		contentPane.add(Experience);
		
		Description = new JTextField();
		Description.setColumns(10);
		Description.setBounds(715, 442, 200, 80);
		contentPane.add(Description);
		
		Skills = new JTextField();
		Skills.setColumns(10);
		Skills.setBounds(267, 569, 200, 80);
		contentPane.add(Skills);
		
		JLabel lblPrn = new JLabel("Name");
		lblPrn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrn.setBounds(65, 163, 161, 41);
		contentPane.add(lblPrn);
		
		Name = new JTextField();
		Name.setColumns(10);
		Name.setBounds(267, 163, 200, 33);
		contentPane.add(Name);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String internship = (String) Internship.getSelectedItem();
				 String type = (String) Type.getSelectedItem();
				 String stipend = (String) Stipend.getSelectedItem();
				 String date = textField.getText();
				 String duration = (String) Duration.getSelectedItem();
				 String cgpa = (String) CGPA.getSelectedItem();
				 String experience = Experience.getText();
				 String description = Description.getText();
				 String skills = Skills.getText();
				 String prn = Name.getText();
				 try {
					 conn c = new conn();
					 String str = "INSERT INTO internship values('"+internship+"','"+type+"', '"+stipend+"', '"+date+"', '"+duration+"','"+cgpa+"', '"+experience+"', '"+description+"', '"+skills+"','"+prn+"' )";
					 c.s.executeUpdate(str);
					 JOptionPane.showMessageDialog(null,"Added Successfully");
					 setVisible(false);
	                 
				 }catch(Exception e1) {
					 e1.printStackTrace();
				 }
			}
			
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(439, 691, 128, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Add Internship");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(359, 55, 269, 56);
		contentPane.add(lblNewLabel_1);
		
	
	}
}
