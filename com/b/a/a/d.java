package com.b.a.a;

import android.view.KeyEvent;

public class d
{
  public static char a(KeyEvent paramKeyEvent)
  {
    if (e(paramKeyEvent)) {
      return '\n';
    }
    if (d(paramKeyEvent)) {
      return '\b';
    }
    if (c(paramKeyEvent)) {
      return '\t';
    }
    if (f(paramKeyEvent)) {
      return ' ';
    }
    if (paramKeyEvent.isPrintingKey()) {
      return (char)paramKeyEvent.getUnicodeChar(paramKeyEvent.getMetaState());
    }
    return '\000';
  }
  
  public static boolean b(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    return (i == 20) || (i == 19) || (i == 22) || (i == 21);
  }
  
  private static boolean c(KeyEvent paramKeyEvent)
  {
    return ((paramKeyEvent.isShiftPressed()) && (paramKeyEvent.getKeyCode() == 62)) || (paramKeyEvent.getKeyCode() == 61);
  }
  
  private static boolean d(KeyEvent paramKeyEvent)
  {
    return paramKeyEvent.getKeyCode() == 67;
  }
  
  private static boolean e(KeyEvent paramKeyEvent)
  {
    return paramKeyEvent.getKeyCode() == 66;
  }
  
  private static boolean f(KeyEvent paramKeyEvent)
  {
    return paramKeyEvent.getKeyCode() == 62;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\b\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */