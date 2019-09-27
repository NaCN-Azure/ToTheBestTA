package bsh;

class BSHCastExpression
  extends SimpleNode
{
  public BSHCastExpression(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    paramCallStack.top();
    Class localClass = ((BSHType)jjtGetChild(0)).getType(paramCallStack, paramInterpreter);
    Object localObject1 = ((SimpleNode)jjtGetChild(1)).eval(paramCallStack, paramInterpreter);
    localObject1.getClass();
    try
    {
      Object localObject2 = Types.castObject(localObject1, localClass, 0);
      return localObject2;
    }
    catch (UtilEvalError localUtilEvalError)
    {
      throw localUtilEvalError.toEvalError(this, paramCallStack);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHCastExpression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */