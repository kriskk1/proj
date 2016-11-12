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
		c.fill = GridBagConstraints.BOTH;
		
	
		
		
		
		c.anchor  = GridBagConstraints.FIRST_LINE_END;
		contractone = new JTextField(5);
		c.gridx=0;
		c.gridy=0;
		this.add(contractone,c);
		
		c.anchor  = GridBagConstraints.LINE_START;
		contracttwo = new JTextField(5);
		c.gridx=0;
		c.gridy=1;
		this.add(contracttwo,c);
		
		JLabel labelone = new JLabel("Test");
		c.gridx=1;
		c.gridy=0;
		this.add(labelone,c);
		
		
		
		
		
}
	
	
	
	
	
	
	

}
