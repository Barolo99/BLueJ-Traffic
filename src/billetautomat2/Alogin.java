package billetautomat2;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alogin extends JPanel {

	/**
	 * Create the panel.
	 */
	public Alogin() {
		setLayout(null);
		
		JButton btnndrePriser = new JButton("\u00C6ndre Priser");
		btnndrePriser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnndrePriser.setBounds(47, 34, 162, 162);
		add(btnndrePriser);
		
		JButton btnIndstilling = new JButton("Indstilling");
		btnIndstilling.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIndstilling.setBounds(302, 34, 162, 162);
		add(btnIndstilling);
		
		JButton btnUdskrivBillet = new JButton("Udskriv billet");
		btnUdskrivBillet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUdskrivBillet.setBounds(556, 34, 162, 162);
		add(btnUdskrivBillet);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnNewButton.setBounds(47, 207, 671, 60);
		add(btnNewButton);

	}
}
