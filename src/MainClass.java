import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args)
	
	{
		Dice tDice = new Dice();
		JOptionPane.showMessageDialog(null, "Throwing the dice!");
		int tAverage = tDice.Throw();
		JOptionPane.showMessageDialog(null, "Average of the three dice is: " + tAverage);
		
	}

}
