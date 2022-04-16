import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

	public class BoarderLayoutDemo extends JFrame{
		public BoarderLayoutDemo(){
			setLayout(new BorderLayout());
			add(new JButton("Button 1"),BorderLayout.NORTH);
			add(new JButton("Button 2"),BorderLayout.SOUTH);
			add(new JButton("Button 3"),BorderLayout.EAST);
			add(new JButton("Long-named Button 4"),BorderLayout.WEST);
			add(new JButton("5"),BorderLayout.NORTH);
			pack();
		}
		
		public static void main(String[]args){
			new BoarderLayoutDemo().setVisible(true);
		}

	}


