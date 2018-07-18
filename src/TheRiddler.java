import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String name = JOptionPane.showInputDialog("what type of tree do you always carry?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (name.equals("palm")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct awnser is a palm ");
		}
		// 6. Add some more riddles
		String name1 = JOptionPane.showInputDialog("what is 3x2?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (name1.equals("6")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct awnser is 6 ");
		}

		String name2 = JOptionPane.showInputDialog("what is 1+2?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (name2.equals("3")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct awnser is 3 ");
		}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score + " Better luck next time ");
	}
}
