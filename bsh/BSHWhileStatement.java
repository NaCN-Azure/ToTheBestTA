package bsh;

class BSHWhileStatement
  extends SimpleNode
  implements ParserConstants
{
  public boolean isDoStatement;
  
  BSHWhileStatement(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    int i = jjtGetNumChildren();
    SimpleNode localSimpleNode1;
    SimpleNode localSimpleNode2;
    if (this.isDoStatement)
    {
      SimpleNode localSimpleNode3 = (SimpleNode)jjtGetChild(1);
      SimpleNode localSimpleNode4 = (SimpleNode)jjtGetChild(0);
      localSimpleNode1 = localSimpleNode3;
      localSimpleNode2 = localSimpleNode4;
    }
    else
    {
      localSimpleNode1 = (SimpleNode)jjtGetChild(0);
      if (i > 1) {
        localSimpleNode2 = (SimpleNode)jjtGetChild(1);
      } else {
        localSimpleNode2 = null;
      }
    }
    boolean bool = this.isDoStatement;
    for (;;)
    {
      if ((bool) || (BSHIfStatement.evaluateCondition(localSimpleNode1, paramCallStack, paramInterpreter)))
      {
        if (localSimpleNode2 == null) {
          continue;
        }
        Object localObject = localSimpleNode2.eval(paramCallStack, paramInterpreter);
        if ((localObject instanceof ReturnControl))
        {
          int k = ((ReturnControl)localObject).kind;
          if (k != 12)
          {
            if (k == 19) {
              continue;
            }
            if (k == 46) {
              return localObject;
            }
          }
          else
          {
            j = 1;
            break label169;
          }
        }
        int j = 0;
        label169:
        if (j == 0) {}
      }
      else
      {
        return Primitive.VOID;
      }
      bool = false;
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHWhileStatement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */