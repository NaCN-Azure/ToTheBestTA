package bsh;

import java.io.Serializable;

abstract interface Node
  extends Serializable
{
  public abstract void jjtAddChild(Node paramNode, int paramInt);
  
  public abstract void jjtClose();
  
  public abstract Node jjtGetChild(int paramInt);
  
  public abstract int jjtGetNumChildren();
  
  public abstract Node jjtGetParent();
  
  public abstract void jjtOpen();
  
  public abstract void jjtSetParent(Node paramNode);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\Node.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */