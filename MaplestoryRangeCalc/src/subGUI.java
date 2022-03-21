import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class subGUI {
	private JPanel statPanel = new JPanel();

	//-----------------------------------------------------------------------------------------
	//Equip Labels
	private JLabel ringLabel1 = new JLabel("Ring 1");
	private JLabel ringLabel2 = new JLabel("Ring 2");
	private JLabel ringLabel3 = new JLabel("Ring 3");
	private JLabel ringLabel4 = new JLabel("Ring 4");

	public void setup() {
		//ring 1
		ringLabel1.setBounds(300, 100, statPanel.getWidth()/20, statPanel.getWidth()/20);
		ringLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ringLabel1.setName("ring1");
		statPanel.add(ringLabel1);

		//ring 2
		ringLabel2.setBounds(ringLabel1.getX(), ringLabel1.getY() + ringLabel1.getHeight(), statPanel.getWidth()/20, statPanel.getWidth()/20);
		ringLabel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ringLabel2.setName("ring2");
		statPanel.add(ringLabel2);

		//ring 3
		ringLabel3.setBounds(ringLabel2.getX(), ringLabel2.getY() + ringLabel2.getHeight(), statPanel.getWidth()/20, statPanel.getWidth()/20);
		ringLabel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ringLabel3.setName("ring3");
		statPanel.add(ringLabel3);

		//ring 4
		ringLabel4.setBounds(ringLabel3.getX(), ringLabel3.getY() + ringLabel3.getHeight(), statPanel.getWidth()/20, statPanel.getWidth()/20);
		ringLabel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ringLabel4.setName("ring4");
		statPanel.add(ringLabel4);
	}

	public void panelSetup(int x, int y, int width, int height) {
		statPanel.setVisible(true);
		statPanel.setLayout(null);
		statPanel.setBounds(x, y, width, height);
	}

	public JPanel getPanel() {
		return statPanel;
	}

}
