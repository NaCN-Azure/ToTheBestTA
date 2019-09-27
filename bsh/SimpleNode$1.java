package bsh;

class SimpleNode$1
  extends SimpleNode
{
  SimpleNode$1(int paramInt)
  {
    super(paramInt);
  }
  
  public int getLineNumber()
  {
    return -1;
  }
  
  public String getSourceFile()
  {
    return "<Called from Java Code>";
  }
  
  public String getText()
  {
    return "<Compiled Java Code>";
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\SimpleNode$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */