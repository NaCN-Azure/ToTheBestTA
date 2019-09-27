package bsh;

public class BSHPackageDeclaration
  extends SimpleNode
{
  public BSHPackageDeclaration(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    BSHAmbiguousName localBSHAmbiguousName = (BSHAmbiguousName)jjtGetChild(0);
    NameSpace localNameSpace = paramCallStack.top();
    localNameSpace.c(localBSHAmbiguousName.text);
    localNameSpace.importPackage(localBSHAmbiguousName.text);
    return Primitive.VOID;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHPackageDeclaration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */