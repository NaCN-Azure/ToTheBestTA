package bsh;

import com.a.a.a.a.a.a.a;

public class UtilEvalError
  extends Exception
{
  protected UtilEvalError() {}
  
  public UtilEvalError(String paramString)
  {
    super(paramString);
  }
  
  public EvalError toEvalError(SimpleNode paramSimpleNode, CallStack paramCallStack)
  {
    return toEvalError(null, paramSimpleNode, paramCallStack);
  }
  
  public EvalError toEvalError(String paramString, SimpleNode paramSimpleNode, CallStack paramCallStack)
  {
    if (Interpreter.DEBUG) {
      a.a(this);
    }
    String str;
    if (paramString == null)
    {
      str = "";
    }
    else
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append(paramString);
      localStringBuffer1.append(": ");
      str = localStringBuffer1.toString();
    }
    StringBuffer localStringBuffer2 = new StringBuffer();
    localStringBuffer2.append(str);
    localStringBuffer2.append(getMessage());
    return new EvalError(localStringBuffer2.toString(), paramSimpleNode, paramCallStack);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\UtilEvalError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */