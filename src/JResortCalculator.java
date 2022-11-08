import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JResortCalculator extends JFrame implements ItemListener {
	final int BASE_PRICE = 200;
	final int WEEKEND_PREMIUM = 100;
	final int BREAKFAST_PREMIUM = 20;
	final int GOLF_PREMIUM = 75; 
	int totalPrice = BASE_PRICE; 
	
	JCheckBox weekendBox = new JCheckBox
			("weekend premium $" + WEEKEND_PREMIUM, false);
	JCheckBox breakfastBox = new
			JCheckBox("Breakfast $" + BREAKFAST_PREMIUM, false);
	JCheckBox golfBox = new JCheckBox
			("Golf $" + GOLF_PREMIUM, false);
	JLabel resortLabel = new JLabel("Resort Price Calculator");
	JLabel totPrice = new JTextField(4);
	JLabel optionExplainLabel = new JLabel
			("Check the options you want");
	
	
	
	

}
