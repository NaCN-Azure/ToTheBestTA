package bsh;

import com.a.a.a.a.a.a.a;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

public class TargetError
  extends EvalError
{
  Throwable d;
  boolean e;
  
  public TargetError(String paramString, Throwable paramThrowable, SimpleNode paramSimpleNode, CallStack paramCallStack, boolean paramBoolean)
  {
    super(paramString, paramSimpleNode, paramCallStack);
    this.d = paramThrowable;
    this.e = paramBoolean;
  }
  
  public TargetError(Throwable paramThrowable, SimpleNode paramSimpleNode, CallStack paramCallStack)
  {
    this("TargetError", paramThrowable, paramSimpleNode, paramCallStack, false);
  }
  
  public Throwable getTarget()
  {
    if ((this.d instanceof InvocationTargetException)) {
      return ((InvocationTargetException)this.d).getTargetException();
    }
    return this.d;
  }
  
  public boolean inNativeCode()
  {
    return this.e;
  }
  
  public void printStackTrace()
  {
    printStackTrace(false, System.err);
  }
  
  public void printStackTrace(PrintStream paramPrintStream)
  {
    printStackTrace(false, paramPrintStream);
  }
  
  public void printStackTrace(boolean paramBoolean, PrintStream paramPrintStream)
  {
    if (paramBoolean)
    {
      super.printStackTrace(paramPrintStream);
      paramPrintStream.println("--- Target Stack Trace ---");
    }
    a.a(this.d, paramPrintStream);
  }
  
  public String printTargetError(Throwable paramThrowable)
  {
    String str = this.d.toString();
    if (Capabilities.canGenerateInterfaces())
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(str);
      localStringBuffer.append("\n");
      localStringBuffer.append(xPrintTargetError(paramThrowable));
      str = localStringBuffer.toString();
    }
    return str;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(super.toString());
    localStringBuffer.append("\nTarget exception: ");
    localStringBuffer.append(printTargetError(this.d));
    return localStringBuffer.toString();
  }
  
  public String xPrintTargetError(Throwable paramThrowable)
  {
    Interpreter localInterpreter = new Interpreter();
    try
    {
      localInterpreter.set("target", paramThrowable);
      String str = (String)localInterpreter.eval("import java.lang.reflect.UndeclaredThrowableException;String result=\"\";while ( target instanceof UndeclaredThrowableException ) {\ttarget=target.getUndeclaredThrowable(); \tresult+=\"Nested: \"+target.toString();}return result;");
      return str;
    }
    catch (EvalError localEvalError)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("xprintarget: ");
      localStringBuffer.append(localEvalError.toString());
      throw new InterpreterError(localStringBuffer.toString());
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\TargetError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */