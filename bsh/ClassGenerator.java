package bsh;

public abstract class ClassGenerator
{
  private static ClassGenerator a;
  
  public static ClassGenerator getClassGenerator()
  {
    if (a == null) {
      try
      {
        a = (ClassGenerator)Class.forName("bsh.ClassGeneratorImpl").newInstance();
      }
      catch (Exception localException)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("ClassGenerator unavailable: ");
        localStringBuffer.append(localException);
        throw new Capabilities.Unavailable(localStringBuffer.toString());
      }
    }
    return a;
  }
  
  public abstract Class generateClass(String paramString, Modifiers paramModifiers, Class[] paramArrayOfClass, Class paramClass, BSHBlock paramBSHBlock, boolean paramBoolean, CallStack paramCallStack, Interpreter paramInterpreter);
  
  public abstract Object invokeSuperclassMethod(BshClassManager paramBshClassManager, Object paramObject, String paramString, Object[] paramArrayOfObject);
  
  public abstract void setInstanceNameSpaceParent(Object paramObject, String paramString, NameSpace paramNameSpace);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\ClassGenerator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */