import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class TextFieldFrame extends JFrame 
{
private JTextField textField2;
private JTextField textField3;
private JPasswordField passwordField;
private JLabel label2;
private JButton buttonOne;


public TextFieldFrame()
{



super("Lock");
setLayout(new FlowLayout());


Icon bug = new ImageIcon(getClass().getResource("secureMoney.gif"));
label2 = new JLabel (bug);
label2.setText("Very secure site");
label2.setHorizontalTextPosition(SwingConstants.CENTER);
label2.setVerticalTextPosition(SwingConstants.BOTTOM);
add(label2);


textField2 = new JTextField("  Enter Username here    ",12);
add(textField2);

textField3 = new JTextField("Password: ",6);
textField3.setEditable(false);
add(textField3);

passwordField = new JPasswordField("Nada Here",8);
add(passwordField);

TextFieldHandler handler = new TextFieldHandler();
textField2.addActionListener(handler);
textField3.addActionListener(handler);
passwordField.addActionListener(handler);

buttonOne = new JButton("Log in ");
buttonOne.setBounds(250,250,150,35);
add(buttonOne);
buttonOne.addActionListener(handler);

}//end of textfieldframe

private class TextFieldHandler implements ActionListener
{
public void actionPerformed(ActionEvent event)
{
String string = "";

if (event.getSource() == textField2)
string = String.format("User name: %s", event.getActionCommand());

else if (event.getSource() == passwordField )
string = String.format("password: %s", event.getActionCommand());
else if (event.getSource() == buttonOne)
string = String.format("Just kidding, not that secure");

JOptionPane.showMessageDialog(null, string);


}//end method actionPerformed
}// end private inner class TextFieldHandler
}// end class TextFieldFrame