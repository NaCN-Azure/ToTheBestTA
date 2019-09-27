package bsh;

class BSHStatementExpressionList
  extends SimpleNode
{
  BSHStatementExpressionList(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    int i = jjtGetNumChildren();
    for (int j = 0;; j++)
    {
      if (j >= i) {
        return Primitive.VOID;
      }
      ((SimpleNode)jjtGetChild(j)).eval(paramCallStack, paramInterpreter);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHStatementExpressionList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */