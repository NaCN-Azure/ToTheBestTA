package bsh;

public class UtilTargetError
  extends UtilEvalError
{
  public Throwable t;
  
  public UtilTargetError(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    this.t = paramThrowable;
  }
  
  public UtilTargetError(Throwable paramThrowable)
  {
    this(null, paramThrowable);
  }
  
  public EvalError toEvalError(String paramString, SimpleNode paramSimpleNode, CallStack paramCallStack)
  {
    if (paramString == null) {}
    String str2;
    StringBuffer localStringBuffer;
    for (String str1 = getMessage();; str1 = localStringBuffer.toString())
    {
      str2 = str1;
      break;
      localStringBuffer = new StringBuffer();
      localStringBuffer.append(paramString);
      localStringBuffer.append(": ");
      localStringBuffer.append(getMessage());
    }
    TargetError localTargetError = new TargetError(str2, this.t, paramSimpleNode, paramCallStack, false);
    return localTargetError;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\UtilTargetError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */