/**
* Calculate days in hours, minutes and seconds using java swing and awt tools
*
* Created on 24/07/2022
* @author  Acxel Orozco (ADOB Apps)
 */

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

class TimeCalc implements ActionListener{
	// Variables declaration - do not modify//GEN-BEGIN:variables
	Container contentPane;
	GridBagConstraints gbctts;
	JButton button1;
	JFrame frame1;
	JLabel jl_day, jl_hour;
	JLabel jl_min, jl_sec, jl_ttol;
	JPanel jpanel_info;
	JSpinner spinner;

	public static void main (String arg[]){
		System.out.println("Time Calculator");
		TimeCalc tc = new TimeCalc();
	}

	public void TimeCalc(){
		//Panels
		jpanel_info = new JPanel();
		jpanel_info.setLayout (new GridBagLayout());
		gbctts = new GridBagConstraints();

		frame1 = new JFrame();
		frame1.setTitle("Conversor");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = frame1.getContentPane();

		//Labels
		jl_day = new JLabel();
		jl_day.setText("Ingrese los dias:");

		jl_hour = new JLabel();
		jl_hour.setText("Horas:");

		jl_min = new JLabel();
		jl_min.setText("Minutos");

		jl_sec = new JLabel();
		jl_sec.setText("Segundos");

		//Buttons
		button1 = new JButton("Calcular");
		//Set action controller in same class
		button1.addActionListener(this);

		//Spinner
		spinner = new JSpinner();
		spinner.setValue(0);

	}

	/**Method implemented by Action listener
	* to catch button that generates action 
	* and to do something
	*/
	public void actionPerformed(ActionEvent e){
		
		//get origin
		if (e.getSource() == button1){
		}
	}
}