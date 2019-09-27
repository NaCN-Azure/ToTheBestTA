package com.android.cglib.dx.d;

import java.io.PrintStream;
import java.io.PrintWriter;

public class g
  extends RuntimeException
{
  private StringBuffer a;
  
  public g(String paramString)
  {
    this(paramString, null);
  }
  
  public g(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    if ((paramThrowable instanceof g))
    {
      String str = ((g)paramThrowable).a.toString();
      this.a = new StringBuffer(200 + str.length());
      this.a.append(str);
      return;
    }
    this.a = new StringBuffer(200);
  }
  
  public g(Throwable paramThrowable)
  {
    this(null, paramThrowable);
  }
  
  public static g a(Throwable paramThrowable, String paramString)
  {
    g localg;
    if ((paramThrowable instanceof g)) {
      localg = (g)paramThrowable;
    } else {
      localg = new g(paramThrowable);
    }
    localg.a(paramString);
    return localg;
  }
  
  public void a(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("str == null");
    }
    this.a.append(paramString);
    if (!paramString.endsWith("\n")) {
      this.a.append('\n');
    }
  }
  
  public void printStackTrace(PrintStream paramPrintStream)
  {
    super.printStackTrace(paramPrintStream);
    paramPrintStream.println(this.a);
  }
  
  public void printStackTrace(PrintWriter paramPrintWriter)
  {
    super.printStackTrace(paramPrintWriter);
    paramPrintWriter.println(this.a);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */