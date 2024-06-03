import java.awt.*;
import java.awt.Component;

public class Main extends javax.swing.JDialog
{
    
    public Main(java.awt.Frame parent, boolean modal)
    {
        GUI gui = new GUI((java.awt.Frame) getParent(), true);
    }
    
}
