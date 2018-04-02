package morpion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Begin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	public static String p1;
	public static String p2;
	public static String player1;
	public static String player2;

	private JButton b1 = new JButton("Commencer");
	private JButton b2 = new JButton("OK");
	private ButtonGroup bg1 = new ButtonGroup();
	private JRadioButton radio1 = new JRadioButton("X");
	private JRadioButton radio2 = new JRadioButton("O");
	private Box box1 = Box.createHorizontalBox();
	private Box box2 = Box.createHorizontalBox();
	public static JTextField  field1 = new JTextField ("player 1");
	public static JTextField  field2 = new JTextField ("player 2");
	JLabel label = new JLabel("");

	public Begin() {
		this.setTitle("Morpion");
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		bg1.add(radio1);
		bg1.add(radio2);
		radio1.setSelected(true);
		
		box1.add(field1);
		box1.add(field2);
		
		box2.add(label);
		box2.add(radio1);
		box2.add(radio2);
		
		Box box12 = Box.createVerticalBox();
		box12.add(box1);
		box12.add(box2);
		
		box2.setVisible(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		this.getContentPane().add(b2, BorderLayout.SOUTH);
		this.getContentPane().add(box12, BorderLayout.CENTER);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b2) {
			player1 = field1.getText();
			player2 = field2.getText();
			label.setText(field1.getText());
			box2.setVisible(true);
			this.getContentPane().add(b1, BorderLayout.SOUTH);
			b2.setVisible(false);
		}
		if (e.getSource() == b1) {
			if (radio1.isSelected()) {
				p1 = radio1.getText();
			} else {
				p1 = radio2.getText();
			}
			if (p1 == "X") {
				p2 = "O";
			} else {
				p2 = "X";
			}
			new Morpion();
			this.dispose();
		}
	}

}
