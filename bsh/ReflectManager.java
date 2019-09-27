package bsh;

public abstract class ReflectManager
{
  private static ReflectManager a;
  
  public static boolean RMSetAccessible(Object paramObject)
  {
    return getReflectManager().setAccessible(paramObject);
  }
  
  public static ReflectManager getReflectManager()
  {
    if (a == null) {
      try
      {
        a = (ReflectManager)Class.forName("bsh.reflect.ReflectManagerImpl").newInstance();
      }
      catch (Exception localException)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("Reflect Manager unavailable: ");
        localStringBuffer.append(localException);
        throw new Capabilities.Unavailable(localStringBuffer.toString());
      }
    }
    return a;
  }
  
  public abstract boolean setAccessible(Object paramObject);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\ReflectManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */