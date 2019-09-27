package bsh;

class BSHReturnType
  extends SimpleNode
{
  public boolean isVoid;
  
  BSHReturnType(int paramInt)
  {
    super(paramInt);
  }
  
  BSHType a()
  {
    return (BSHType)jjtGetChild(0);
  }
  
  public Class evalReturnType(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    if (this.isVoid) {
      return Void.TYPE;
    }
    return a().getType(paramCallStack, paramInterpreter);
  }
  
  public String getTypeDescriptor(CallStack paramCallStack, Interpreter paramInterpreter, String paramString)
  {
    if (this.isVoid) {
      return "V";
    }
    return a().getTypeDescriptor(paramCallStack, paramInterpreter, paramString);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHReturnType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */