package com.a.a.a.a.a.a;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public final class a
{
  static final a a;
  static final int b;
  
  static
  {
    try
    {
      localInteger = b();
      if (localInteger != null) {}
      localPrintStream = System.err;
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        if (localInteger.intValue() >= 19) {
          localObject = new c();
        } else if (a()) {
          localObject = new b();
        } else {
          localObject = new b();
        }
      }
      catch (Throwable localThrowable2)
      {
        Integer localInteger;
        Object localObject;
        PrintStream localPrintStream;
        StringBuilder localStringBuilder;
        int i;
        for (;;) {}
      }
      localThrowable1 = localThrowable1;
      localInteger = null;
    }
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
    localStringBuilder.append(b.class.getName());
    localStringBuilder.append("will be used. The error is: ");
    localPrintStream.println(localStringBuilder.toString());
    localThrowable1.printStackTrace(System.err);
    localObject = new b();
    a = (a)localObject;
    if (localInteger == null) {
      i = 1;
    } else {
      i = localInteger.intValue();
    }
    b = i;
  }
  
  public static void a(Throwable paramThrowable)
  {
    a.a(paramThrowable);
  }
  
  public static void a(Throwable paramThrowable, PrintStream paramPrintStream)
  {
    a.a(paramThrowable, paramPrintStream);
  }
  
  public static void a(Throwable paramThrowable, PrintWriter paramPrintWriter)
  {
    a.a(paramThrowable, paramPrintWriter);
  }
  
  private static boolean a()
  {
    return true ^ Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic");
  }
  
  private static Integer b()
  {
    try
    {
      Integer localInteger = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      return localInteger;
    }
    catch (Exception localException)
    {
      System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
      localException.printStackTrace(System.err);
    }
    return null;
  }
  
  static abstract class a
  {
    protected static final Throwable[] a = new Throwable[0];
    
    public abstract void a(Throwable paramThrowable);
    
    public abstract void a(Throwable paramThrowable, PrintStream paramPrintStream);
    
    public abstract void a(Throwable paramThrowable, PrintWriter paramPrintWriter);
  }
  
  static final class b
    extends a.a
  {
    public void a(Throwable paramThrowable)
    {
      paramThrowable.printStackTrace();
    }
    
    public void a(Throwable paramThrowable, PrintStream paramPrintStream)
    {
      paramThrowable.printStackTrace(paramPrintStream);
    }
    
    public void a(Throwable paramThrowable, PrintWriter paramPrintWriter)
    {
      paramThrowable.printStackTrace(paramPrintWriter);
    }
  }
  
  static final class c
    extends a.a
  {
    public void a(Throwable paramThrowable)
    {
      paramThrowable.printStackTrace();
    }
    
    public void a(Throwable paramThrowable, PrintStream paramPrintStream)
    {
      paramThrowable.printStackTrace(paramPrintStream);
    }
    
    public void a(Throwable paramThrowable, PrintWriter paramPrintWriter)
    {
      paramThrowable.printStackTrace(paramPrintWriter);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\a\a\a\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */