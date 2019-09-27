package bsh;

class BSHVariableDeclarator
  extends SimpleNode
{
  public String name;
  
  BSHVariableDeclarator(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(BSHType paramBSHType, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    Object localObject;
    if (jjtGetNumChildren() > 0)
    {
      SimpleNode localSimpleNode = (SimpleNode)jjtGetChild(0);
      if ((paramBSHType != null) && ((localSimpleNode instanceof BSHArrayInitializer))) {
        localObject = ((BSHArrayInitializer)localSimpleNode).eval(paramBSHType.getBaseType(), paramBSHType.getArrayDims(), paramCallStack, paramInterpreter);
      } else {
        localObject = localSimpleNode.eval(paramCallStack, paramInterpreter);
      }
    }
    else
    {
      localObject = null;
    }
    if (localObject == Primitive.VOID) {
      throw new EvalError("Void initializer.", this, paramCallStack);
    }
    return localObject;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("BSHVariableDeclarator ");
    localStringBuffer.append(this.name);
    return localStringBuffer.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHVariableDeclarator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */