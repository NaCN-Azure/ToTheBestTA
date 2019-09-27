package bsh;

class BSHTypedVariableDeclaration
  extends SimpleNode
{
  public Modifiers modifiers;
  
  BSHTypedVariableDeclaration(int paramInt)
  {
    super(paramInt);
  }
  
  private BSHType b()
  {
    return (BSHType)jjtGetChild(0);
  }
  
  BSHVariableDeclarator[] a()
  {
    int i = jjtGetNumChildren();
    BSHVariableDeclarator[] arrayOfBSHVariableDeclarator = new BSHVariableDeclarator[i - 1];
    for (int j = 1;; j++)
    {
      if (j >= i) {
        return arrayOfBSHVariableDeclarator;
      }
      arrayOfBSHVariableDeclarator[(j - 1)] = ((BSHVariableDeclarator)jjtGetChild(j));
    }
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    try
    {
      NameSpace localNameSpace = paramCallStack.top();
      BSHType localBSHType = b();
      Class localClass = localBSHType.getType(paramCallStack, paramInterpreter);
      BSHVariableDeclarator[] arrayOfBSHVariableDeclarator = a();
      int i = 0;
      for (;;)
      {
        if (i < arrayOfBSHVariableDeclarator.length)
        {
          BSHVariableDeclarator localBSHVariableDeclarator = arrayOfBSHVariableDeclarator[i];
          Object localObject = localBSHVariableDeclarator.eval(localBSHType, paramCallStack, paramInterpreter);
          try
          {
            localNameSpace.setTypedVariable(localBSHVariableDeclarator.name, localClass, localObject, this.modifiers);
            i++;
          }
          catch (UtilEvalError localUtilEvalError)
          {
            throw localUtilEvalError.toEvalError(this, paramCallStack);
          }
        }
      }
      return Primitive.VOID;
    }
    catch (EvalError localEvalError)
    {
      localEvalError.reThrow("Typed variable declaration");
    }
  }
  
  public String getTypeDescriptor(CallStack paramCallStack, Interpreter paramInterpreter, String paramString)
  {
    return b().getTypeDescriptor(paramCallStack, paramInterpreter, paramString);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHTypedVariableDeclaration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */