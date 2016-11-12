import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tradespanel extends JPanel {
	
	private JTextField contractone;
	private JTextField contracttwo;
	
	
	public Tradespanel(){
		
		this.setSize(1024, 768);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		//c.fill = GridBagConstraints.BOTH;
		c.fill=GridBagConstraints.HORIZONTAL;
		
	
		
		
		
		//c.anchor  = GridBagConstraints.FIRST_LINE_END;
		contractone = new JTextField(3);
		c.gridx=0;
		c.gridy=1;
		this.add(contractone,c);
		
		//c.anchor  = GridBagConstraints.LINE_START;
		contracttwo = new JTextField(3);
		c.gridx=0;
		c.gridy=2;
		this.add(contracttwo,c);
		
		JLabel labelone = new JLabel("   Contracts");
		c.gridx=0;
		c.gridy=0;
		c.ipadx=15;
		this.add(labelone,c);
		
		JLabel bidlable = new JLabel(" Bid");
		c.gridx=2;
		c.gridy=0;
		c.ipadx=25;
		
		this.add(bidlable,c);
		
		JLabel asklable = new JLabel("Ask");
		c.gridx=3;
		c.gridy=0;
		c.ipadx=25;
		this.add(asklable,c);
		
		
		
		
}
	
	
	
	
	
	
	

}
