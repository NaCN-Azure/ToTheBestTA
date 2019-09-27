package bsh;

class BSHPrimaryExpression
  extends SimpleNode
{
  BSHPrimaryExpression(int paramInt)
  {
    super(paramInt);
  }
  
  private Object a(boolean paramBoolean, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    Object localObject1 = jjtGetChild(0);
    int i = jjtGetNumChildren();
    for (int j = 1;; j++)
    {
      if (j >= i)
      {
        if ((localObject1 instanceof SimpleNode)) {
          if ((localObject1 instanceof BSHAmbiguousName))
          {
            if (paramBoolean) {
              localObject1 = ((BSHAmbiguousName)localObject1).toLHS(paramCallStack, paramInterpreter);
            } else {
              localObject1 = ((BSHAmbiguousName)localObject1).toObject(paramCallStack, paramInterpreter);
            }
          }
          else
          {
            if (paramBoolean) {
              throw new EvalError("Can't assign to prefix.", this, paramCallStack);
            }
            localObject1 = ((SimpleNode)localObject1).eval(paramCallStack, paramInterpreter);
          }
        }
        if ((localObject1 instanceof LHS))
        {
          if (paramBoolean) {
            return localObject1;
          }
          try
          {
            Object localObject2 = ((LHS)localObject1).getValue();
            return localObject2;
          }
          catch (UtilEvalError localUtilEvalError)
          {
            throw localUtilEvalError.toEvalError(this, paramCallStack);
          }
        }
        return localObject1;
      }
      localObject1 = ((BSHPrimarySuffix)jjtGetChild(j)).doSuffix(localObject1, paramBoolean, paramCallStack, paramInterpreter);
    }
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    return a(false, paramCallStack, paramInterpreter);
  }
  
  public LHS toLHS(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    Object localObject = a(true, paramCallStack, paramInterpreter);
    if (!(localObject instanceof LHS)) {
      throw new EvalError("Can't assign to:", this, paramCallStack);
    }
    return (LHS)localObject;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHPrimaryExpression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */