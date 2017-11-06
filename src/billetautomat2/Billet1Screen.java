package billetautomat2;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class Billet1Screen extends JPanel {

	/**
	 * Create the panel.
	 * Hej med dig
	 */
	public Billet1Screen() {
		setLayout(null);
		String[] comboBoxString = {"Zone 1","Zone 2","Zone 3"};
		JComboBox comboBox = new JComboBox(comboBoxString);
		comboBox.setToolTipText("V\u00E6lg zone");
		comboBox.setBounds(185, 17, 97, 26);
		add(comboBox);
		String value=(String)comboBox.getSelectedItem();
		System.out.println(value);
		JButton btnTest = new JButton("Køb");
		btnTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String value=(String)comboBox.getSelectedItem();
				System.out.println(value);
			}
		});
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTest.setBounds(15, 16, 115, 29);
		add(btnTest);
		
		
	}
}
