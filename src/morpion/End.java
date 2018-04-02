package morpion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class End extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton fin = new JButton("Nouvelle partie");
	ImageIcon icone = new ImageIcon("C:\\Users\\nouno\\Documents\\Formation\\morpion\\src\\morpion\\icone.png");
	public End() {
		this.setTitle("Morpion");
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		JLabel labIcone = new JLabel(icone);
		labIcone.setSize(30,30);
		Box box1 = Box.createHorizontalBox();
		JLabel win = new JLabel();
		box1.add(win);
		Box box2 = Box.createHorizontalBox();
		JLabel win2 = new JLabel();
		box2.add(win2);
		Box box3 = Box.createHorizontalBox();
		JLabel win3 = new JLabel();
		box3.add(win3);
		Box box4 = Box.createHorizontalBox();
		box4.add(labIcone);
		Box box123 = Box.createVerticalBox();
		box123.add(box1);
		box123.add(box2);
		box123.add(box3);
		box123.add(box4);
		if(Morpion.winner != "") {
			win.setText("And the winner is ");
			win2.setText(Morpion.winner+" !");
			win3.setText("Congrats !");
			Morpion.winner="";
		}else {
			win.setText("Game Over...");
		}
		
		fin.addActionListener(this);
		this.getContentPane().add(box123, BorderLayout.CENTER);
		this.getContentPane().add(fin, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == fin) {
			new Begin();
			this.dispose();
		}
		
	}

}
