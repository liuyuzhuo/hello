package com.yl;

import java.awt.Dimension;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class TestGlobalKeyEvent
{
 public static void main(String a[])
 {
  JFrame frame = new JFrame("Test Global Key Event");
  frame.setSize(new Dimension(400,400));
  
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
   }
  });
  frame.setVisible(true);
  
  KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
  manager.addKeyEventPostProcessor(new KeyEventPostProcessor()
  {
   public boolean postProcessKeyEvent(KeyEvent e)
   {
    switch (e.getID())
    {
    case KeyEvent.KEY_PRESSED:
     System.out.println("KEY_PRESSED");
     break;
    case KeyEvent.KEY_RELEASED:
     System.out.println("KEY_RELEASED");
     break;
    }

    int keyCode = e.getKeyCode();
    if (keyCode == KeyEvent.VK_A
      && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0))
    {
     System.out.println("Ctrl+A");
    }
    else if(keyCode == KeyEvent.VK_A)
    {
     System.out.println("A");
    }
    
    // this key event is be used
    return true;
   }
  });
 }
}
