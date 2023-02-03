package recursion.awt;
import recursion.*;

/**
 * Creating a Graphical User Interface.
 *
 * @author (sdb)
 * @version (2020)
 */
public class GUI
{
      public static void main(String [] args)
    {   Container actionPane = new Container ("Actions");
        actionPane.addComponent(new Widget("GoButton", WidgetType.BUTTON));
        actionPane.addComponent(new Widget("Go", WidgetType.LABEL));
        actionPane.addComponent(new Widget("OK", WidgetType.CHECKBOX));
        Container errorPane = new Container ("Error Panel");
        errorPane.addComponent (new Widget ("Abort",WidgetType.LABEL));
        errorPane.addComponent (new Widget("Exception", WidgetType.LABEL));
        Container inputPane = new Container ("Input");
        inputPane.addComponent (new Widget ("Provide Input", WidgetType.BUTTON));
        inputPane.addComponent (new Widget ("Finished", WidgetType.CHECKBOX));
              
        Container contentPane = new Container ("Content Pane");
        contentPane.addComponent (actionPane);
        contentPane.addComponent (errorPane);
        contentPane.addComponent (inputPane);
        contentPane.addComponent (new Widget ("Close",WidgetType.BUTTON));
      
        System.out.println ("All Widgets in the GUI: " + contentPane.getAllWidgets());
        System.out.println ("\nContainer details: \n");
        contentPane.show();
    }
}
