/**
 * Magic8Ball
 */
import javax.swing.JOptionPane;
public class Magic8Ball {

    public static void main(String[] args) {
        String question = null;
        String[] responses = {"It is certain", "It is decidedly so", "Without a doubt", "Yes - definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Replay hazy, try again", "Ask again later, peasant", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My resources say no", "Outlook not so good", "Very doubtful"};
        int responseNumber = (int)(Math.random() * responses.length);
        do {
            question = JOptionPane.showInputDialog(null, "ASK YOUR QUESTION, MORTAL! \nIT MUST BE OF THE FORM YES OR NO! \n(Or enter QUIT to quit)");
                if (question.equalsIgnoreCase("quit")) {
                    break;
                }
            JOptionPane.showMessageDialog(null, "Your question was: " + question + " \nMy answer is \n" + responses[responseNumber].toUpperCase());
            
        } while (!question.equalsIgnoreCase("quit"));
        
        JOptionPane.showMessageDialog(null, "BE GONE WITH THEE, MORTAL!");
    } 
}