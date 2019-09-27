package com.b.a.b;

import android.util.Log;
import java.io.PrintStream;

public class q
  extends Exception
{
  public static void a(String paramString)
  {
    a(false, paramString);
  }
  
  public static void a(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      System.err.print("TextWarrior assertion failed: ");
      System.err.println(paramString);
      Log.i("lua", paramString);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\b\a\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */