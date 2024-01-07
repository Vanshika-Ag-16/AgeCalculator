import javax.swing.*;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args)
    {
        int currentYear, birthYear, ageInYear;
        birthYear = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your birth year"));
        GregorianCalendar calendar = new GregorianCalendar();
        currentYear = calendar.get(GregorianCalendar.YEAR);
        ageInYear = currentYear - birthYear;
        JOptionPane.showMessageDialog(null,"you are "+ageInYear+" years old.");
    }
}