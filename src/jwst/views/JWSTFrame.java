package jwst.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class JWSTFrame extends JFrame {

	public JWSTFrame() throws HeadlessException {
		initJWSTFrame();
	}

	public JWSTFrame(GraphicsConfiguration arg0) {
		super(arg0);
		initJWSTFrame();
	}

	public JWSTFrame(String arg0) throws HeadlessException {
		super(arg0);
		initJWSTFrame();
	}

	public JWSTFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		initJWSTFrame();
	}
	
	private void initJWSTFrame(){
		
		setLayout(new BorderLayout());
		
		setSize(new Dimension(400, 200));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
