package billetautomat2;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.Box;

public class Login extends JPanel {
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(301, 111, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(202, 114, 73, 14);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(202, 157, 73, 14);
		add(lblPassword);
		
		JLabel lblBluejtraffic = new JLabel("BlueJ-Traffic");
		lblBluejtraffic.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBluejtraffic.setBounds(227, 45, 167, 31);
		add(lblBluejtraffic);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(301, 154, 86, 20);
		add(passwordField);
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(301, 203, 86, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String uname =textField_1.getText(); 
				//@SuppressWarnings("deprecation")
				String pass=passwordField.getText();
				
				System.out.println(uname);
				System.out.println(pass);
				
				if((uname.equals("Barolo99")) && (pass.equals("1234"))) {
					
					
					
					System.out.println("It works");
						
					
				}else {
					System.out.println("Do not work");
				}
				
				
			}
		});
		add(btnLogin);

	}
}
