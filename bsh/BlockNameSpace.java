package bsh;

class BlockNameSpace
  extends NameSpace
{
  public BlockNameSpace(NameSpace paramNameSpace)
  {
    super(paramNameSpace, localStringBuffer.toString());
  }
  
  private NameSpace d()
  {
    NameSpace localNameSpace = super.getParent();
    if ((localNameSpace instanceof BlockNameSpace)) {
      localNameSpace = ((BlockNameSpace)localNameSpace).d();
    }
    return localNameSpace;
  }
  
  private boolean d(String paramString)
  {
    boolean bool = false;
    try
    {
      Variable localVariable = super.a(paramString, false);
      if (localVariable != null) {
        bool = true;
      }
    }
    catch (UtilEvalError localUtilEvalError) {}
    return bool;
  }
  
  This a(Interpreter paramInterpreter)
  {
    return d().a(paramInterpreter);
  }
  
  public This getSuper(Interpreter paramInterpreter)
  {
    return d().getSuper(paramInterpreter);
  }
  
  public void importClass(String paramString)
  {
    getParent().importClass(paramString);
  }
  
  public void importPackage(String paramString)
  {
    getParent().importPackage(paramString);
  }
  
  public void setBlockVariable(String paramString, Object paramObject)
  {
    super.setVariable(paramString, paramObject, false, false);
  }
  
  public void setMethod(String paramString, BshMethod paramBshMethod)
  {
    getParent().setMethod(paramString, paramBshMethod);
  }
  
  public void setVariable(String paramString, Object paramObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (d(paramString))
    {
      super.setVariable(paramString, paramObject, paramBoolean1, false);
      return;
    }
    getParent().setVariable(paramString, paramObject, paramBoolean1, paramBoolean2);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BlockNameSpace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */