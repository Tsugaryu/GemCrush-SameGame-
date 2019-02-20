import javax.swing.*;
import java.awt.event.*;
/**
*@author Axel Durand
*/
public class EcranFinControl implements ActionListener{
    private JButton a;
    private JButton b;
    private JFrame f;
    public EcranFinControl(JButton a,JButton b,JFrame f)
    {
        this.a=a;
        this.b=b;
        this.f=f;
    }
    @Override
    public void actionPerformed(ActionEvent e){
         Object  source=e.getSource();
        if(source==this.a){
        this.f.dispose();
        System.out.println("1");
        EcranUn debut=new EcranUn();
            }
         else if(source==this.b){
          this.f.dispose();
          System.out.println("2");
          }

            }

    }
