import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*

<applet code="TextFieldDemo" width=350 height=200>
</applet>

*/

public class TextFieldDemo extends Applet
{
TextField tf=new TextField("Hello,How Are You?");
public void init()
{
add(tf);
}
}
