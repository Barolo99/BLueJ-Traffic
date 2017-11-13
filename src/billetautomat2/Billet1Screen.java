package billetautomat2;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Billet1Screen extends JPanel {
	/**
	 * Create the panel.
	 * Hej med dig
	 */
	public Billet1Screen() {
		setLayout(null);
		JLabel lblPrisTal = new JLabel("10 kr.");
		lblPrisTal.setBounds(338, 88, 97, 20);
		add(lblPrisTal);
		String[] comboBoxString = {"1 zone","2 zoner","3 zoner"};
		JComboBox comboBox = new JComboBox(comboBoxString);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value=(String)comboBox.getSelectedItem();
				if (value=="1 zone") {
				lblPrisTal.setText("10 kr.");
				} else if (value=="2 zoner") {
					lblPrisTal.setText("18 kr.");
				} else if (value=="3 zoner") {
					lblPrisTal.setText("25 kr.");
				} else {
					System.out.println("error");
				};
			}
		});
		comboBox.setToolTipText("V\u00E6lg zone");
		comboBox.setBounds(338, 17, 97, 26);
		add(comboBox);
		//String value=(String)comboBox.getSelectedItem();
		//System.out.println(value);
		JButton btnTest = new JButton("Køb");
		btnTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTest.setBounds(338, 140, 115, 29);
		add(btnTest);
		
		JLabel lblAntalZoner = new JLabel("Antal zoner:");
		lblAntalZoner.setBounds(232, 20, 97, 20);
		add(lblAntalZoner);
		
		JLabel lblPris = new JLabel("Pris:");
		lblPris.setBounds(286, 88, 43, 20);
		add(lblPris);
		
		
		
		
	}
}
