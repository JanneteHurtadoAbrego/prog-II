import java.swing.*;

class swing01 {
    public static void main (String args[]){
        JFrame window = new JFrame ();
        JLabel label = new JLabel (text"HOLA JAVA SWING");
        JButton button = new JButton (text "boton");

        button.setBounds(x 50, y 50, width 100 height 4);
        window.add(button);
        window.add(label);
        window.setSize(width 400, height 300);
        window.setVisible(b true);

    }
}