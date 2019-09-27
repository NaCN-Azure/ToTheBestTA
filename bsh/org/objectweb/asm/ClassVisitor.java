package bsh.org.objectweb.asm;

public abstract interface ClassVisitor
{
  public abstract void visit(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3);
  
  public abstract void visitEnd();
  
  public abstract void visitField(int paramInt, String paramString1, String paramString2, Object paramObject);
  
  public abstract void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt);
  
  public abstract CodeVisitor visitMethod(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\org\objectweb\asm\ClassVisitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */