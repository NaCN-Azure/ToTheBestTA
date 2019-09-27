package bsh;

class BSHSwitchLabel
  extends SimpleNode
{
  boolean a;
  
  public BSHSwitchLabel(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    if (this.a) {
      return null;
    }
    return ((SimpleNode)jjtGetChild(0)).eval(paramCallStack, paramInterpreter);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHSwitchLabel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */