package bsh;

class BSHIfStatement
  extends SimpleNode
{
  BSHIfStatement(int paramInt)
  {
    super(paramInt);
  }
  
  public static boolean evaluateCondition(SimpleNode paramSimpleNode, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    Object localObject = paramSimpleNode.eval(paramCallStack, paramInterpreter);
    if ((localObject instanceof Primitive))
    {
      if (localObject == Primitive.VOID) {
        throw new EvalError("Condition evaluates to void type", paramSimpleNode, paramCallStack);
      }
      localObject = ((Primitive)localObject).getValue();
    }
    if ((localObject instanceof Boolean)) {
      return ((Boolean)localObject).booleanValue();
    }
    throw new EvalError("Condition must evaluate to a Boolean or boolean.", paramSimpleNode, paramCallStack);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    if (evaluateCondition((SimpleNode)jjtGetChild(0), paramCallStack, paramInterpreter)) {}
    for (Node localNode = jjtGetChild(1);; localNode = jjtGetChild(2))
    {
      localObject = ((SimpleNode)localNode).eval(paramCallStack, paramInterpreter);
      break label57;
      if (jjtGetNumChildren() <= 2) {
        break;
      }
    }
    Object localObject = null;
    label57:
    if ((localObject instanceof ReturnControl)) {
      return localObject;
    }
    return Primitive.VOID;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHIfStatement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */