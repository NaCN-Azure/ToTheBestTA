package bsh;

import java.util.Hashtable;

public class Capabilities
{
  static Class a;
  private static boolean b;
  private static Hashtable c = new Hashtable();
  
  static Class a(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString);
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
    }
  }
  
  public static boolean canGenerateInterfaces()
  {
    return classExists("java.lang.reflect.Proxy");
  }
  
  public static boolean classExists(String paramString)
  {
    Object localObject = c.get(paramString);
    if (localObject == null)
    {
      try
      {
        Class localClass = Class.forName(paramString);
        localObject = localClass;
      }
      catch (ClassNotFoundException localClassNotFoundException) {}
      if (localObject != null) {
        c.put(localObject, "unused");
      }
    }
    return localObject != null;
  }
  
  public static boolean haveAccessibility()
  {
    return b;
  }
  
  public static boolean haveSwing()
  {
    return classExists("javax.swing.JButton");
  }
  
  public static void setAccessibility(boolean paramBoolean)
  {
    boolean bool;
    if (!paramBoolean) {
      bool = false;
    }
    for (;;)
    {
      b = bool;
      return;
      if ((classExists("java.lang.reflect.AccessibleObject")) && (classExists("bsh.reflect.ReflectManagerImpl"))) {
        try
        {
          Class localClass;
          if (a == null)
          {
            localClass = a("java.lang.String");
            a = localClass;
          }
          else
          {
            localClass = a;
          }
          localClass.getDeclaredMethods();
          bool = true;
        }
        catch (SecurityException localSecurityException)
        {
          StringBuffer localStringBuffer = new StringBuffer();
          localStringBuffer.append("Accessibility unavailable: ");
          localStringBuffer.append(localSecurityException);
          throw new Unavailable(localStringBuffer.toString());
        }
      }
    }
    throw new Unavailable("Accessibility unavailable");
  }
  
  public static class Unavailable
    extends UtilEvalError
  {
    public Unavailable(String paramString)
    {
      super();
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\Capabilities.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */