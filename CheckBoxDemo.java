import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*

<applet code="CheckBoxDemo" width=350 height=200>
</applet>

*/

public class CheckBoxDemo extends Applet
{
Checkbox cb1=new Checkbox("Adhar Card",true);
Checkbox cb2=new Checkbox("Pan Card");

public void init()
{
add(cb1);
add(cb2);
}
}
