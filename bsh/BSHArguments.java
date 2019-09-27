package bsh;

class BSHArguments
  extends SimpleNode
{
  BSHArguments(int paramInt)
  {
    super(paramInt);
  }
  
  public Object[] getArguments(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    Object[] arrayOfObject = new Object[jjtGetNumChildren()];
    for (int i = 0;; i++)
    {
      if (i >= arrayOfObject.length) {
        return arrayOfObject;
      }
      arrayOfObject[i] = ((SimpleNode)jjtGetChild(i)).eval(paramCallStack, paramInterpreter);
      if (arrayOfObject[i] == Primitive.VOID)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("Undefined argument: ");
        localStringBuffer.append(((SimpleNode)jjtGetChild(i)).getText());
        throw new EvalError(localStringBuffer.toString(), this, paramCallStack);
      }
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHArguments.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */