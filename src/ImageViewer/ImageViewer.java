package Calculate_test;

import java.io.*;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;

public class ImageViewer
{
    public static void main(String[] args) throws IOException
    {
        EventQueue.invokeLater(new Runnable()
        {
        	public void run(){
        		JFrame frame = new ImageViewerFrame();
        		frame.setTitle("ImageVeawer");
        		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		frame.setVisible(true);
        	}
        });
    }
}

class ImageViewerFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 500;
	public ImageViewerFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		label = new JLabel();
		add(label);
		
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar (menuBar);
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				int result = chooser.showOpenDialog(null);
				if(result == JFileChooser.APPROVE_OPTION)
				{
					String name = chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
			
		});
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
	}
}
