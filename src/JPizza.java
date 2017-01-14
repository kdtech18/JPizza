import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* JPizza.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   1/13/2017
*/
public class JPizza extends JFrame implements ActionListener {

	private String[] sizes = {"Small - $7", "Medium - $9", "Large - $11", "Extra Large - $14"};
	private JComboBox size = new JComboBox(sizes);
	private JCheckBox topping1 = new JCheckBox("Pepperoni");
	private JCheckBox topping2 = new JCheckBox("Bacon");
	private JCheckBox topping3 = new JCheckBox("Chicken");
	private JCheckBox topping4 = new JCheckBox("Buffalo Chicken");
	private JCheckBox topping5 = new JCheckBox("Sausage");
	private int total = 0;

	private JLabel welcome = new JLabel("Welcome to Kenton's Pizzeria!");
	private JLabel cost = new JLabel("The total is: $" + total);
	private JLabel chooseSize = new JLabel("Choose a Size:");
	private JLabel chooseToppings = new JLabel("Choose a topping \n(After 1, $1 per additional");

	private JPanel mainPnl = new JPanel();
	private JPanel northPnl = new JPanel();
	private JPanel westPnl = new JPanel();
	private JPanel eastPnl = new JPanel();
	private JPanel southPnl = new JPanel();

	private GridLayout sizeLayout = new GridLayout(1, 2, 1, 1);
	private GridLayout checkBox = new GridLayout(1, 5, 1, 1);
	private BorderLayout border = new BorderLayout();

	private Font welcomeFont = new Font(Font.SANS_SERIF, Font.BOLD, 28);
	private Font label = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
	private Font other = new Font(Font.SANS_SERIF, Font.PLAIN, 14);

	public JPizza(){
		super("Pizzeria");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(450, 450);
		setLocationRelativeTo(null);

		size.setFont(other);
		topping1.setFont(other);
		topping2.setFont(other);
		topping3.setFont(other);
		topping4.setFont(other);
		topping5.setFont(other);
		welcome.setFont(welcomeFont);
		cost.setFont(label);
		chooseSize.setFont(label);
		chooseToppings.setFont(label);

		westPnl.add(chooseSize, sizeLayout);
		westPnl.add(size, sizeLayout);
		eastPnl.add(chooseToppings);
		eastPnl.add(topping1, checkBox);
		eastPnl.add(topping2, checkBox);
		eastPnl.add(topping3, checkBox);
		eastPnl.add(topping4, checkBox);
		eastPnl.add(topping5, checkBox);
		southPnl.add(cost, border);
		northPnl.add(welcome, border);

		mainPnl.add(northPnl, BorderLayout.NORTH);
		mainPnl.add(eastPnl, BorderLayout.EAST);
		mainPnl.add(southPnl, BorderLayout.SOUTH);
		mainPnl.add(westPnl, BorderLayout.WEST);

		add(mainPnl);
		validate();
	}




	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		JPizza gui = new JPizza();
	}// end main method
}
