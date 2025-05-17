package GUI6;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventDialog {
	public Event showDialog() {
		JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
		JTextField txtName = new JTextField();
		JTextField txtArtist = new JTextField();
		JTextField txtDate = new JTextField();
		JTextField txtLocation = new JTextField();
		JTextField txtRegularTickets = new JTextField();
		JTextField txtVipTickets = new JTextField();

		panel.add(new JLabel("Event Name:"));
		panel.add(txtName);
		panel.add(new JLabel("Artist:"));
		panel.add(txtArtist);
		panel.add(new JLabel("Date:"));
		panel.add(txtDate);
		panel.add(new JLabel("Location:"));
		panel.add(txtLocation);
		panel.add(new JLabel("Regular Tickets:"));
		panel.add(txtRegularTickets);
		panel.add(new JLabel("VIP Tickets:"));
		panel.add(txtVipTickets);

		int result = JOptionPane.showConfirmDialog(null, panel, "Add Event", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			try {
				return new Event(txtName.getText(), txtArtist.getText(), txtDate.getText(),
						Integer.parseInt(txtRegularTickets.getText()), Integer.parseInt(txtVipTickets.getText()),
						txtLocation.getText());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid input. Please try again.", "Error",
						JOptionPane.ERROR_MESSAGE);
				return null;
			}
		}
		return null;
	}
}