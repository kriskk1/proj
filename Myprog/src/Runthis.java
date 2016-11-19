

	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;

	import javax.swing.Box;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.SwingUtilities;
	import javax.swing.border.EmptyBorder;


	import apidemo.util.HtmlButton;
	import apidemo.util.NewLookAndFeel;
	import apidemo.util.NewTabbedPanel;
	import apidemo.util.VerticalPanel;

	import com.ib.controller.ApiConnection.ILogger;
	import com.ib.controller.ApiController;
	import com.ib.controller.ApiController.IBulletinHandler;
	import com.ib.controller.ApiController.IConnectionHandler;
	import com.ib.controller.ApiController.ITimeHandler;
	import com.ib.controller.Formats;
	import com.ib.controller.Types.NewsType;
	
	
public class Runthis implements IConnectionHandler, MouseListener {
	
	static { NewLookAndFeel.register(); }
	static Runthis INSTANCE = new Runthis();
	
	
	public final JFrame frame = new JFrame();
	private final NewTabbedPanel m_tabbedPanel = new NewTabbedPanel(true);
	private final Tradespanel trade = new Tradespanel();
	
	


	public static void main(String[] args)  throws ClassNotFoundException, InterruptedException, SQLException  {
		// TODO Auto-generated method stub
		INSTANCE.run();
		
		
		//rer
		
		/*Ordermang x = new Ordermang();
		
		x.sendMarketOrder("P", "BUY", 50);*/
		}



	private void run(){
		
		
		m_tabbedPanel.addTab("Trade", new Tradespanel());
		frame.setSize(384, 288);
		frame.add(m_tabbedPanel,-1);
		//frame.setSize(m_tabbedPanel.getWidth(), m_tabbedPanel.getHeight());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
//		frame.addMouseListener(new MouseAdapter()
//			{
//				public void mousePressed(MouseEvent e)
//				{
//					System.out.println(e.getX());
//					System.out.println(e.getY());
//					
//				}
//			
//			});
	
		
		
		
		
		
		
		
	}
	
	
	
	@Override
	public void connected() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void disconnected() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void accountList(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void error(Exception e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void message(int id, int errorCode, String errorMsg) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void show(String string) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
