package bsh;

class BSHSwitchStatement
  extends SimpleNode
  implements ParserConstants
{
  public BSHSwitchStatement(int paramInt)
  {
    super(paramInt);
  }
  
  private boolean a(Object paramObject1, Object paramObject2, CallStack paramCallStack, SimpleNode paramSimpleNode)
  {
    if ((!(paramObject1 instanceof Primitive)) && (!(paramObject2 instanceof Primitive))) {
      return paramObject1.equals(paramObject2);
    }
    try
    {
      boolean bool = Primitive.unwrap(Primitive.binaryOperation(paramObject1, paramObject2, 90)).equals(Boolean.TRUE);
      return bool;
    }
    catch (UtilEvalError localUtilEvalError)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("Switch value: ");
      localStringBuffer.append(paramSimpleNode.getText());
      localStringBuffer.append(": ");
      throw localUtilEvalError.toEvalError(localStringBuffer.toString(), this, paramCallStack);
    }
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    int i = jjtGetNumChildren();
    SimpleNode localSimpleNode = (SimpleNode)jjtGetChild(0);
    Object localObject1 = localSimpleNode.eval(paramCallStack, paramInterpreter);
    if (1 >= i) {
      throw new EvalError("Empty switch statement.", this, paramCallStack);
    }
    int j = 2;
    BSHSwitchLabel localBSHSwitchLabel = (BSHSwitchLabel)jjtGetChild(1);
    ReturnControl localReturnControl = null;
    label151:
    label222:
    while ((j < i) && (localReturnControl == null))
    {
      int k;
      if ((!localBSHSwitchLabel.a) && (!a(localObject1, localBSHSwitchLabel.eval(paramCallStack, paramInterpreter), paramCallStack, localSimpleNode))) {
        for (;;)
        {
          if (j >= i) {
            break label151;
          }
          k = j + 1;
          Node localNode2 = jjtGetChild(j);
          if ((localNode2 instanceof BSHSwitchLabel))
          {
            localBSHSwitchLabel = (BSHSwitchLabel)localNode2;
            j = k;
            break;
          }
          j = k;
        }
      } else {
        for (;;)
        {
          if (j >= i) {
            break label222;
          }
          k = j + 1;
          Node localNode1 = jjtGetChild(j);
          if (!(localNode1 instanceof BSHSwitchLabel))
          {
            Object localObject2 = ((SimpleNode)localNode1).eval(paramCallStack, paramInterpreter);
            if ((localObject2 instanceof ReturnControl))
            {
              localReturnControl = (ReturnControl)localObject2;
              break;
            }
          }
          j = k;
        }
      }
    }
    if ((localReturnControl != null) && (localReturnControl.kind == 46)) {
      return localReturnControl;
    }
    return Primitive.VOID;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHSwitchStatement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */