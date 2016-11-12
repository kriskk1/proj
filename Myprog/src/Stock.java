	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.Rectangle;
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

import com.ib.client.Contract;
import com.ib.controller.ApiConnection.ILogger;
	import com.ib.controller.ApiController;
	import com.ib.controller.ApiController.IBulletinHandler;
	import com.ib.controller.ApiController.IConnectionHandler;
	import com.ib.controller.ApiController.ITimeHandler;
	import com.ib.controller.Formats;
	import com.ib.controller.Types.NewsType;
	
	
public class Stock {
	
	private int stockid;
	private String symbol;
	
	
	
	
	
	public Stock(int stockid, String symbol)
	{
		this.stockid=stockid;
		this.symbol=symbol;
	}
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	
	public Contract thestock = new Contract();
	
	public void createStock(String ticker){
		
		thestock.m_symbol = ticker;
		thestock.m_secType = "STK";
		thestock.m_exchange = "SMART";
		thestock.m_currency = "USD";
		
		
		
		
	}


	public int getstockid(){
		return stockid;
	}
	
	public String getstocksymbol(){
		return symbol;
	}
	


}
