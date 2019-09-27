package bsh;

class BSHTernaryExpression
  extends SimpleNode
{
  BSHTernaryExpression(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    SimpleNode localSimpleNode1 = (SimpleNode)jjtGetChild(0);
    SimpleNode localSimpleNode2 = (SimpleNode)jjtGetChild(1);
    SimpleNode localSimpleNode3 = (SimpleNode)jjtGetChild(2);
    if (BSHIfStatement.evaluateCondition(localSimpleNode1, paramCallStack, paramInterpreter)) {
      return localSimpleNode2.eval(paramCallStack, paramInterpreter);
    }
    return localSimpleNode3.eval(paramCallStack, paramInterpreter);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHTernaryExpression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */