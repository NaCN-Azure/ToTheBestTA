package bsh;

class BSHImportDeclaration
  extends SimpleNode
{
  public boolean importPackage;
  public boolean staticImport;
  public boolean superImport;
  
  BSHImportDeclaration(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    NameSpace localNameSpace = paramCallStack.top();
    if (this.superImport)
    {
      try
      {
        localNameSpace.doSuperImport();
      }
      catch (UtilEvalError localUtilEvalError)
      {
        throw localUtilEvalError.toEvalError(this, paramCallStack);
      }
    }
    else if (this.staticImport)
    {
      if (this.importPackage) {
        localNameSpace.importStatic(((BSHAmbiguousName)jjtGetChild(0)).toClass(paramCallStack, paramInterpreter));
      } else {
        throw new EvalError("static field imports not supported yet", this, paramCallStack);
      }
    }
    else
    {
      String str = ((BSHAmbiguousName)jjtGetChild(0)).text;
      if (this.importPackage) {
        localNameSpace.importPackage(str);
      } else {
        localNameSpace.importClass(str);
      }
    }
    return Primitive.VOID;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHImportDeclaration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */