package jwst.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JWSTFrame extends JFrame {

	private JButton _btnExit;
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
		
		_btnExit = new JButton("Exit");
		_btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JPanel pane = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pane.add(_btnExit);
		
		add(pane, BorderLayout.SOUTH);
		
		setSize(new Dimension(400, 200));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
