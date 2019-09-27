package bsh;

public class ClassIdentifier
{
  Class a;
  
  public ClassIdentifier(Class paramClass)
  {
    this.a = paramClass;
  }
  
  public Class getTargetClass()
  {
    return this.a;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Class Identifier: ");
    localStringBuffer.append(this.a.getName());
    return localStringBuffer.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\ClassIdentifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */