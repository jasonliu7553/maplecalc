import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUI {

	private JFrame frame = new JFrame();
	private JPanel equipPanel = new JPanel();

	//-----------------------------------------------------------------------------------------
	//Equip Labels
	private JLabel ringLabel1 = new JLabel("Ring 1");
	private JLabel ringLabel2 = new JLabel("Ring 2");
	private JLabel ringLabel3 = new JLabel("Ring 3");
	private JLabel ringLabel4 = new JLabel("Ring 4");
	private JLabel cupLabel = new JLabel("Cup");

	private JLabel pendantLabel1 = new JLabel("Pendant 1");
	private JLabel pendantLabel2 = new JLabel("Pendant 2");
	private JLabel weaponLabel = new JLabel("Weapon");
	private JLabel beltLabel = new JLabel("Belt");

	private JLabel armorLabel = new JLabel("Armor");
	private JLabel bottomLabel = new JLabel("Bottom");
	private JLabel shoesLabel = new JLabel("shoes");
	private JLabel faceLabel = new JLabel("Face Acc");
	private JLabel eyeLabel = new JLabel("Eye Acc");
	private JLabel hatLabel = new JLabel("hat");

	private JLabel earringLabel = new JLabel("Earring");
	private JLabel shoulderLabel = new JLabel("shoulder");
	private JLabel glovesLabel = new JLabel("Gloves");
	private JLabel androidLabel = new JLabel("Android");

	private JLabel capeLabel = new JLabel("Cape");
	private JLabel heartLabel = new JLabel("Android Heart");
	private JLabel secondaryLabel = new JLabel("Secondary");
	private JLabel medalLabel = new JLabel("Medal");
	private JLabel badgeLabel = new JLabel("Badge");
	private JLabel emblemLabel = new JLabel("Emblem");
	//---------------------------------------------------------------------------------------------------
	
	private final int NUM_EQUIPS = 25;
	private character character;
	private equipment[] equips = new equipment[NUM_EQUIPS];

	public GUI() {

		frame.setBounds(10, 10, 1400, 700);
		frame.setLayout(null);
		frame.setVisible(true);

		equipPanel.setVisible(true);
		equipPanel.setLayout(null);
		equipPanel.setBounds(frame.getX(), frame.getY(), frame.getWidth()/2, frame.getHeight());
		frame.add(equipPanel);
		equipLabels();
		
		for (int i =0; i< equipPanel.getComponents().length; i++) {
			equipPanel.getComponents()[i].addMouseListener(mouseClick);
		}
		
		defaultSetup();

	}

	private void equipLabels() {

		int width = 75;
		int height = 75;
		
		//---------------------------------------------------------------------------------------------------------------------------
		// First Column
		//---------------------------------------------------------------------------------------------------------------------------

		//ring 1
		ringLabel1.setBounds(300, 100, width, width);
		ringLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ringLabel1.setName("ring1");
		equipPanel.add(ringLabel1);

		//ring 2
		ringLabel2.setBounds(ringLabel1.getX(), ringLabel1.getY() + ringLabel1.getHeight(), width, height);
		ringLabel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ringLabel2.setName("ring2");
		equipPanel.add(ringLabel2);

		//ring 3
		ringLabel3.setBounds(ringLabel2.getX(), ringLabel2.getY() + ringLabel2.getHeight(), width, height);
		ringLabel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ringLabel3.setName("ring3");
		equipPanel.add(ringLabel3);

		//ring 4
		ringLabel4.setBounds(ringLabel3.getX(), ringLabel3.getY() + ringLabel3.getHeight(), width, height);
		ringLabel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ringLabel4.setName("ring4");
		equipPanel.add(ringLabel4);

		//Cup
		cupLabel.setBounds(ringLabel4.getX(), ringLabel4.getY() + ringLabel4.getHeight(), width, height);
		cupLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		cupLabel.setName("cup");
		equipPanel.add(cupLabel);

		//---------------------------------------------------------------------------------------------------------------------------
		// Second Column
		//---------------------------------------------------------------------------------------------------------------------------

		//pendant 1
		pendantLabel1.setBounds(ringLabel2.getX() + ringLabel2.getWidth(), ringLabel2.getY(), width, height);
		pendantLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pendantLabel1.setName("pendant1");
		equipPanel.add(pendantLabel1);

		//pendant 2
		pendantLabel2.setBounds(ringLabel3.getX() + ringLabel3.getWidth(), ringLabel3.getY(), width, height);
		pendantLabel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pendantLabel2.setName("pendant2");
		equipPanel.add(pendantLabel2);

		//weapon
		weaponLabel.setBounds(ringLabel4.getX() + ringLabel4.getWidth(), ringLabel4.getY(), width, height);
		weaponLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		weaponLabel.setName("weapon");
		equipPanel.add(weaponLabel);

		//belt
		beltLabel.setBounds(weaponLabel.getX(), weaponLabel.getY() + weaponLabel.getHeight(), width, height);
		beltLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		beltLabel.setName("belt");
		equipPanel.add(beltLabel);

		//---------------------------------------------------------------------------------------------------------------------------
		// Third Column
		//---------------------------------------------------------------------------------------------------------------------------

		//armor
		armorLabel.setBounds(weaponLabel.getX() + weaponLabel.getWidth(), weaponLabel.getY(), width, height);
		armorLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		armorLabel.setName("armor");
		equipPanel.add(armorLabel);

		//bottom
		bottomLabel.setBounds(armorLabel.getX(), armorLabel.getY() + armorLabel.getHeight(), width, height);
		bottomLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		bottomLabel.setName("bottom");
		equipPanel.add(bottomLabel);

		//shoes
		shoesLabel.setBounds(bottomLabel.getX(), bottomLabel.getY() + bottomLabel.getHeight(), width, height);
		shoesLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		shoesLabel.setName("shoes");
		equipPanel.add(shoesLabel);

		//face
		faceLabel.setBounds(armorLabel.getX(), armorLabel.getY() - armorLabel.getHeight(), width, height);
		faceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		faceLabel.setName("face");
		equipPanel.add(faceLabel);

		//eye
		eyeLabel.setBounds(faceLabel.getX(), faceLabel.getY() - faceLabel.getHeight(), width, height);
		eyeLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		eyeLabel.setName("eye");
		equipPanel.add(eyeLabel);

		//hat
		hatLabel.setBounds(eyeLabel.getX(), eyeLabel.getY() - eyeLabel.getHeight(), width, height);
		hatLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		hatLabel.setName("hat");
		equipPanel.add(hatLabel);

		//---------------------------------------------------------------------------------------------------------------------------
		// Fourth Column
		//---------------------------------------------------------------------------------------------------------------------------

		//earring
		earringLabel.setBounds(faceLabel.getX() + faceLabel.getWidth(), faceLabel.getY(), width, height);
		earringLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		earringLabel.setName("earring");
		equipPanel.add(earringLabel);

		//shoulder
		shoulderLabel.setBounds(earringLabel.getX(), earringLabel.getY() + earringLabel.getWidth(), width, height);
		shoulderLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		shoulderLabel.setName("shoulder");
		equipPanel.add(shoulderLabel);

		//gloves
		glovesLabel.setBounds(shoulderLabel.getX(), shoulderLabel.getY() + shoulderLabel.getWidth(), width, height);
		glovesLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		glovesLabel.setName("gloves");
		equipPanel.add(glovesLabel);

		//android
		androidLabel.setBounds(glovesLabel.getX(), glovesLabel.getY() + glovesLabel.getHeight(), width, height);
		androidLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		androidLabel.setName("android");
		equipPanel.add(androidLabel);

		//---------------------------------------------------------------------------------------------------------------------------
		// Fifth Column
		//---------------------------------------------------------------------------------------------------------------------------

		//heart
		heartLabel.setBounds(androidLabel.getX() + androidLabel.getWidth(), androidLabel.getY(), width, height);
		heartLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		heartLabel.setName("heart");
		equipPanel.add(heartLabel);

		//cape
		capeLabel.setBounds(heartLabel.getX(), heartLabel.getY() - heartLabel.getHeight(), width, height);
		capeLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		capeLabel.setName("cape");
		equipPanel.add(capeLabel);

		//secondary
		secondaryLabel.setBounds(capeLabel.getX(), capeLabel.getY() - capeLabel.getHeight(), width, height);
		secondaryLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		secondaryLabel.setName("secondary");
		equipPanel.add(secondaryLabel);

		//medal
		medalLabel.setBounds(secondaryLabel.getX(), secondaryLabel.getY() - secondaryLabel.getHeight(), width, height);
		medalLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		medalLabel.setName("medal");
		equipPanel.add(medalLabel);

		//badge
		badgeLabel.setBounds(medalLabel.getX(), medalLabel.getY() - medalLabel.getHeight(), width, height);
		badgeLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		badgeLabel.setName("badge");
		equipPanel.add(badgeLabel);

		//emblem
		emblemLabel.setBounds(badgeLabel.getX(), badgeLabel.getY() - badgeLabel.getHeight(), width, height);
		emblemLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		emblemLabel.setName("emblem");
		equipPanel.add(emblemLabel);

	}

	private void defaultSetup() {
		
		eqStats stats = new eqStats(150,25,25,25,25,25,25,0,0);
		this.character = new character(200, equips);
		
		for(int i=0; i<NUM_EQUIPS; i++ ) {
			equips[i] = new equipment("equip",150,stats,false);
		}
			
	}
	
	private MouseListener mouseClick = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(getNum(e.getComponent().getName()));
		}
	};
	
	private int getNum(String name) {
		nameToNum nameToNum = new nameToNum();
		
		return nameToNum.getMap().get(name);
	}

}
