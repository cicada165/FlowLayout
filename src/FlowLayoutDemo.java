import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
	public class FlowLayoutDemo extends JFrame{
		public FlowLayoutDemo(){
			setLayout(new FlowLayout());
			add(new JButton("Button 1"));
			add(new JButton("Button 2"));
			add(new JButton("Button 3"));
			add(new JButton("Long-named Button 4"));
			add(new JButton("5"));
			pack();
		}
		
		public static void main(String[]args){
			new FlowLayoutDemo().setVisible(true);
		}

	}

