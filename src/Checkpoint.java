import javax.swing.JOptionPane;

public class Checkpoint {

	public static void main(String[] args) {
		int size = Integer.parseInt(JOptionPane.showInputDialog("Enter in the size"));
		int[] ints = new int[size];
		for (int i = 0; i < size; i++) {
			int input = Integer.parseInt(JOptionPane.showInputDialog("Enter in a number"));
			ints[i] = input;
		}
		int sum = 0;
		for (int i : ints) {
			sum = sum + i;

		}
		double average = (double) sum / size;
		JOptionPane.showMessageDialog(null, "Total is " + sum + " Average is: " + average);
	}
}
