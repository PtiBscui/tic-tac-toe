package morpion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Morpion extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public static String winner = "";
	
	private JButton b1 = new JButton("");
	private JButton b2 = new JButton("");
	private JButton b3 = new JButton("");
	private JButton b4 = new JButton("");
	private JButton b5 = new JButton("");
	private JButton b6 = new JButton("");
	private JButton b7 = new JButton("");
	private JButton b8 = new JButton("");
	private JButton b9 = new JButton("");

	public Morpion() {
		this.setTitle("Morpion - "+Begin.field1.getText());
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(3, 3));

		b1.addActionListener(this);
		this.getContentPane().add(b1);
		b2.addActionListener(this);
		this.getContentPane().add(b2);
		b3.addActionListener(this);
		this.getContentPane().add(b3);
		b4.addActionListener(this);
		this.getContentPane().add(b4);
		b5.addActionListener(this);
		this.getContentPane().add(b5);
		b6.addActionListener(this);
		this.getContentPane().add(b6);
		b7.addActionListener(this);
		this.getContentPane().add(b7);
		b8.addActionListener(this);
		this.getContentPane().add(b8);
		b9.addActionListener(this);
		this.getContentPane().add(b9);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b1.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b1.setText(Begin.p2);
			}
			b1.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		} else if (e.getSource() == b2) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b2.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b2.setText(Begin.p2);
			}
			b2.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		} else if (e.getSource() == b3) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b3.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b3.setText(Begin.p2);
			}
			b3.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		} else if (e.getSource() == b4) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b4.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b4.setText(Begin.p2);
			}
			b4.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		} else if (e.getSource() == b5) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b5.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b5.setText(Begin.p2);
			}
			b5.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		} else if (e.getSource() == b6) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b6.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b6.setText(Begin.p2);
			}
			b6.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		} else if (e.getSource() == b7) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b7.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b7.setText(Begin.p2);
			}
			b7.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		} else if (e.getSource() == b8) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b8.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b8.setText(Begin.p2);
			}
			b8.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		} else if (e.getSource() == b9) {
			if (this.getTitle().contains(Begin.field1.getText())) {
				this.setTitle("Morpion - "+Begin.field2.getText());
				b9.setText(Begin.p1);
			} else {
				this.setTitle("Morpion - "+Begin.field1.getText());
				b9.setText(Begin.p2);
			}
			b9.setEnabled(false);
			win();
			if(winner != "") {
				new End();
				this.dispose();
			}
			lose();
		}

	}

	public void win() {
		
		if(b1.getText() != "" && b1.getText() == b2.getText() && b1.getText() == b3.getText()) {
			if(b1.getText() == Begin.p1) {
				winner = Begin.field1.getText();
			}else {
				winner = Begin.field2.getText();
			}
		}else if (b1.getText() != "" && b1.getText() == b4.getText() && b1.getText() == b7.getText()) {
			if(b1.getText() == Begin.p1) {
				winner = Begin.field1.getText();
			}else {
				winner = Begin.field2.getText();
			}
		}else if (b1.getText() != "" && b1.getText() == b5.getText() && b1.getText() == b9.getText()) {
			if(b1.getText() == Begin.p1) {
				winner = Begin.field1.getText();
			}else {
				winner = Begin.field2.getText();
			}
		}else if (b4.getText() != "" && b4.getText() == b5.getText() && b4.getText() == b6.getText()) {
			if(b4.getText() == Begin.p1) {
				winner = Begin.field1.getText();
			}else {
				winner = Begin.field2.getText();
			}
		}
		else if (b7.getText() != "" && b7.getText() == b8.getText() && b7.getText() == b9.getText()) {
			if(b7.getText() == Begin.p1) {
				winner = Begin.field1.getText();
			}else {
				winner = Begin.field2.getText();
			}
		}else if (b2.getText() != "" && b2.getText() == b5.getText() && b2.getText() == b8.getText()) {
			if(b2.getText() == Begin.p1) {
				winner = Begin.field1.getText();
			}else {
				winner = Begin.field2.getText();
			}
		}
		else if (b3.getText() != "" && b3.getText() == b6.getText() && b3.getText() == b9.getText()) {
			if(b3.getText() == Begin.p1) {
				winner = Begin.field1.getText();
			}else {
				winner = Begin.field2.getText();
			}
		}
		else if (b3.getText() != "" && b3.getText() == b5.getText() && b3.getText() == b7.getText()) {
			if(b3.getText() == Begin.p1) {
				winner = Begin.field1.getText();
			}else {
				winner = Begin.field2.getText();
			}
		}
	}

	public void lose() {
		if(b1.getText() != "" && b2.getText() != "" && b3.getText() != "" 
				&& b4.getText() != "" && b5.getText() != "" && b6.getText() != "" 
				&& b7.getText() != "" && b8.getText() != "" && b9.getText() != "" && winner == "") {
			new End();
			this.dispose();
		}
	}
}
	
