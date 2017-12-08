import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class GUIWindow extends JFrame{
private Calculation tool = new Calculation();
	
	private JLabel vLabel = new JLabel("Initial Velocity");
	private JLabel aLabel = new JLabel("Angle of Projection");
	private JLabel resultR = new JLabel("Range of Projection");
	private JLabel resultT1 = new JLabel("Time of Projection");
	private JLabel resultT2 = new JLabel("Time to reach maximum height");
	private JLabel resultH = new JLabel("Maximum Height");
	private JTextField vField = new JTextField();
	private JTextField aField = new JTextField();
	private JTextField resultRF = new JTextField();
	private JTextField resultT1F = new JTextField();
	private JTextField resultT2F = new JTextField();
	private JTextField resultHF = new JTextField();
	private JButton cal = new JButton("Calculate");
	
	public void init(){
		setSize(800, 600);
		JPanel panel = new JPanel (new GridLayout(6,2));
		panel.add (vLabel);
		panel.add (aLabel);
		panel.add(vField);
		panel.add(aField);
		panel.add (resultR);
		panel.add (resultT1);
		panel.add (resultRF);
		panel.add (resultT1F);
		panel.add (resultT2);
		panel.add (resultH);
		panel.add (resultT2F);
		panel.add (resultHF);
		JPanel buttonPanel = new JPanel ();
		buttonPanel.add (cal);
		Container container = this.getContentPane ();
		container.add (panel, BorderLayout.CENTER);
		container.add (buttonPanel, BorderLayout.SOUTH);
		cal.addActionListener (new calListener ());
	}
	
	private class calListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			String inputA = vField.getText();
			String inputB = aField.getText();
			double velocity = Double.parseDouble(inputA);
			double angle = Double.parseDouble(inputB);
			if (velocity < 0 || angle < 0 || angle > 180) {
				JOptionPane.showMessageDialog(null, "Bad Inputs", "Error", JOptionPane.INFORMATION_MESSAGE);
			} else {
				tool.setVelocity(velocity);
				tool.setAngle(angle);
				resultRF.setText (""+ tool.range ());
				resultT1F.setText (""+ tool.totalTime());
				resultT2F.setText (""+ tool.maxHeightTime());
				resultHF.setText (""+ tool.maxHeight());
			}
		}
	}
}
