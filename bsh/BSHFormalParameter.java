package bsh;

class BSHFormalParameter
  extends SimpleNode
{
  public static final Class UNTYPED;
  public String name;
  public Class type;
  
  BSHFormalParameter(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    if (jjtGetNumChildren() > 0) {}
    for (Class localClass = ((BSHType)jjtGetChild(0)).getType(paramCallStack, paramInterpreter);; localClass = UNTYPED)
    {
      this.type = localClass;
      break;
    }
    return this.type;
  }
  
  public String getTypeDescriptor(CallStack paramCallStack, Interpreter paramInterpreter, String paramString)
  {
    if (jjtGetNumChildren() > 0) {
      return ((BSHType)jjtGetChild(0)).getTypeDescriptor(paramCallStack, paramInterpreter, paramString);
    }
    return "Ljava/lang/Object;";
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHFormalParameter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */