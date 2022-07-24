/**
* Calculate days in hours, minutes and seconds using java swing and awt tools
*
* Created on 24/07/2022
* @author  Acxel Orozco (ADOB Apps)
 */

import javax.swing.border.Border;
import javax.swing.BorderFactory;
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
	Border btitle;
	Container contentPane;
	GridBagConstraints gbctts;
	JButton button1;
	JFrame frame1;
	JLabel jl_day, jl_hour, jl_hour1, jl_ttol;
	JLabel jl_min, jl_sec, jl_min1, jl_sec1;
	JPanel jpanel_info;
	JSpinner spinner;

	public static void main (String arg[]){
		TimeCalc tc = new TimeCalc();
		System.out.println("Time Calculator");
	}

	public TimeCalc(){
		//Panels
		jpanel_info = new JPanel();
		jpanel_info.setLayout (new GridBagLayout());
		gbctts = new GridBagConstraints();
		btitle = BorderFactory.createTitledBorder("Horas-Minutos-segundos");

		frame1 = new JFrame();
		frame1.setTitle("Conversor");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = frame1.getContentPane();

		//Labels
		jl_day = new JLabel();
		jl_day.setText("Ingrese los dias:");

		jl_hour = new JLabel();
		jl_hour.setText("Horas: ");

		jl_min = new JLabel();
		jl_min.setText("Minutos: ");

		jl_sec = new JLabel();
		jl_sec.setText("Segundos: ");

		jl_hour1 = new JLabel();
		jl_hour1.setText("Tus horas");

		jl_min1 = new JLabel();
		jl_min1.setText("Tus minutos");

		jl_sec1 = new JLabel();
		jl_sec1.setText("Tus segundos");

		jl_ttol = new JLabel();
		jl_ttol.setText("Resultado");

		//Buttons
		button1 = new JButton("Calcular");
		//Set action controller in same class
		button1.addActionListener(this);

		//Spinner
		spinner = new JSpinner();
		spinner.setValue(0);

		makeGraph();

	}

	/**Function to define and organize gui elements
	 * 
	 */
	public void makeGraph() {
		/*Add elements to jpanel_info*/
		//add jl_day
		gbctts.gridx=0;//column
		gbctts.gridy=0;//row
		gbctts.gridwidth = 2;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.weightx = 2.0;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_day, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		//spinner
		gbctts.gridx=2;//column
		gbctts.gridy=0;//row
		gbctts.gridwidth = 2;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.weightx = 2.0;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(spinner, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		gbctts.weightx = 1.0;

		//button1
		gbctts.gridx=2;//colum
		gbctts.gridy=1;//row
		gbctts.gridwidth = 1;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(button1, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		//jl_hour
		gbctts.gridx=0;//colum
		gbctts.gridy=2;//row
		gbctts.gridwidth = 2;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.weightx = 2.0;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_hour, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		//jl_hour1
		gbctts.gridx=2;//colum
		gbctts.gridy=2;//row
		gbctts.gridwidth = 2;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.weightx = 2.0;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_hour1, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		//jl_min1
		gbctts.gridx=0;//colum
		gbctts.gridy=3;//row
		gbctts.gridwidth = 1;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_min, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		//jl_sec0
		gbctts.gridx=0;//colum
		gbctts.gridy=4;//row
		gbctts.gridwidth = 1;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_sec, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		gbctts.weightx = 1.0;

		//jl_min1
		gbctts.gridx=2;//colum
		gbctts.gridy=3;//row
		gbctts.gridwidth = 1;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_min1, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		//jl_sec1
		gbctts.gridx=2;//colum
		gbctts.gridy=4;//row
		gbctts.gridwidth = 1;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_sec1, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		gbctts.weightx = 1.0;

		//jl_ttol
		gbctts.gridx=0;//colum
		gbctts.gridy=5;//row
		gbctts.gridwidth = 1;//Set size
		gbctts.gridheight = 1;//Set size
		gbctts.weightx = 4.0;
		gbctts.weighty = 4.0;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_ttol, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		gbctts.weightx = 1.0;
		gbctts.weighty = 1.0;

		//Add panel to frame
		jpanel_info.setBorder(btitle);
		contentPane.add(jpanel_info, BorderLayout.CENTER);

		//Set adaptable to elements size
		//frame1.pack();
		frame1.setSize(600, 300);
		//visible
		frame1.setVisible(true);
	}

	/**Method implemented by Action listener
	* to catch button that generates action 
	* and to do something
	*/
	public void actionPerformed(ActionEvent e){
		
		//get origin
		if (e.getSource() == button1){
			System.out.println("Calculando");
			Float mytime = Float.parseFloat(spinner.getValue().toString());
			jl_hour1.setText(((String)Float.toString(mytime*24)));
			jl_min1.setText(((String)Float.toString(mytime*(60*24))));
			jl_sec1.setText(((String)Float.toString(mytime*(360*24))));
			String mytext = ((String)Float.toString(mytime)) +" dias tienen "+ ((String)Float.toString(mytime*(24))) + " horas - " + ((String)Float.toString(mytime*(60*24))) + "minutos - " + ((String)Float.toString(mytime*(360*24))) + " segundos";
			jl_ttol.setText(mytext);

		}
	}
}