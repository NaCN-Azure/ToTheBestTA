package bsh;

class BSHBlock
  extends SimpleNode
{
  public boolean isSynchronized = false;
  
  BSHBlock(int paramInt)
  {
    super(paramInt);
  }
  
  Object a(CallStack paramCallStack, Interpreter paramInterpreter, boolean paramBoolean, NodeFilter paramNodeFilter)
  {
    Object localObject1 = Primitive.VOID;
    if (!paramBoolean)
    {
      localNameSpace = paramCallStack.top();
      paramCallStack.swap(new BlockNameSpace(localNameSpace));
    }
    else
    {
      localNameSpace = null;
    }
    int i = this.isSynchronized;
    int j = jjtGetNumChildren();
    for (int k = i;; k++)
    {
      for (;;)
      {
        if ((k < j) || (i < j)) {}
        try
        {
          SimpleNode localSimpleNode2 = (SimpleNode)jjtGetChild(i);
          if ((!(localSimpleNode2 instanceof BSHClassDeclaration)) && ((paramNodeFilter == null) || (paramNodeFilter.isVisible(localSimpleNode2))))
          {
            localObject1 = localSimpleNode2.eval(paramCallStack, paramInterpreter);
            boolean bool = localObject1 instanceof ReturnControl;
            if (bool) {
              return localObject1;
            }
          }
          i++;
        }
        finally
        {
          SimpleNode localSimpleNode1;
          if (paramBoolean) {
            break label217;
          }
          paramCallStack.swap(localNameSpace);
        }
      }
      localSimpleNode1 = (SimpleNode)jjtGetChild(k);
      if (((paramNodeFilter == null) || (paramNodeFilter.isVisible(localSimpleNode1))) && ((localSimpleNode1 instanceof BSHClassDeclaration))) {
        localSimpleNode1.eval(paramCallStack, paramInterpreter);
      }
    }
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    return eval(paramCallStack, paramInterpreter, false);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter, boolean paramBoolean)
  {
    Object localObject1;
    if (this.isSynchronized) {
      localObject1 = ((SimpleNode)jjtGetChild(0)).eval(paramCallStack, paramInterpreter);
    } else {
      localObject1 = null;
    }
    if (this.isSynchronized) {
      try
      {
        Object localObject3 = a(paramCallStack, paramInterpreter, paramBoolean, null);
        return localObject3;
      }
      finally {}
    }
    return a(paramCallStack, paramInterpreter, paramBoolean, null);
  }
  
  public static abstract interface NodeFilter
  {
    public abstract boolean isVisible(SimpleNode paramSimpleNode);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */