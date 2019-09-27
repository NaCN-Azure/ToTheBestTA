package bsh;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class CollectionManager
{
  private static CollectionManager a;
  
  public static CollectionManager getCollectionManager()
  {
    try
    {
      if (a == null)
      {
        boolean bool = Capabilities.classExists("java.util.Collection");
        if (bool) {
          try
          {
            a = (CollectionManager)Class.forName("bsh.collection.CollectionManagerImpl").newInstance();
          }
          catch (Exception localException)
          {
            StringBuffer localStringBuffer = new StringBuffer();
            localStringBuffer.append("unable to load CollectionManagerImpl: ");
            localStringBuffer.append(localException);
            Interpreter.debug(localStringBuffer.toString());
          }
        }
      }
      if (a == null) {
        a = new CollectionManager();
      }
      CollectionManager localCollectionManager = a;
      return localCollectionManager;
    }
    finally {}
  }
  
  public BshIterator getBshIterator(Object paramObject)
  {
    return new BasicBshIterator(paramObject);
  }
  
  public Object getFromMap(Object paramObject1, Object paramObject2)
  {
    return ((Hashtable)paramObject1).get(paramObject2);
  }
  
  /* Error */
  public boolean isBshIterable(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 80	bsh/CollectionManager:getBshIterator	(Ljava/lang/Object;)Lbsh/BshIterator;
    //   5: pop
    //   6: iconst_1
    //   7: ireturn
    //   8: iconst_0
    //   9: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	10	0	this	CollectionManager
    //   0	10	1	paramObject	Object
    //   8	1	2	localIllegalArgumentException	IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   0	6	8	java/lang/IllegalArgumentException
  }
  
  public boolean isMap(Object paramObject)
  {
    return paramObject instanceof Hashtable;
  }
  
  public Object putInMap(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    return ((Hashtable)paramObject1).put(paramObject2, paramObject3);
  }
  
  public static class BasicBshIterator
    implements BshIterator
  {
    Enumeration a = a(paramObject);
    
    public BasicBshIterator(Object paramObject) {}
    
    protected Enumeration a(Object paramObject)
    {
      if (paramObject == null) {
        throw new NullPointerException("Object arguments passed to the BasicBshIterator constructor cannot be null.");
      }
      if ((paramObject instanceof Enumeration)) {
        return (Enumeration)paramObject;
      }
      if ((paramObject instanceof Vector)) {
        return ((Vector)paramObject).elements();
      }
      if (paramObject.getClass().isArray()) {
        return new CollectionManager.1(this, paramObject);
      }
      if ((paramObject instanceof String)) {
        return a(((String)paramObject).toCharArray());
      }
      if ((paramObject instanceof StringBuffer)) {
        return a(paramObject.toString().toCharArray());
      }
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("Cannot enumerate object of type ");
      localStringBuffer.append(paramObject.getClass());
      throw new IllegalArgumentException(localStringBuffer.toString());
    }
    
    public boolean hasNext()
    {
      return this.a.hasMoreElements();
    }
    
    public Object next()
    {
      return this.a.nextElement();
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\CollectionManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */