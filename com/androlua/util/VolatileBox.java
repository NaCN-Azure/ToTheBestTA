package com.androlua.util;

public class VolatileBox<T>
{
  private volatile T a;
  
  public VolatileBox() {}
  
  public VolatileBox(T paramT)
  {
    set(paramT);
  }
  
  /* Error */
  public T blockedGet()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 23	java/lang/Object:wait	()V
    //   6: aload_0
    //   7: monitorexit
    //   8: aload_0
    //   9: getfield 25	com/androlua/util/VolatileBox:a	Ljava/lang/Object;
    //   12: areturn
    //   13: astore_2
    //   14: goto +13 -> 27
    //   17: astore_1
    //   18: new 27	java/lang/RuntimeException
    //   21: dup
    //   22: aload_1
    //   23: invokespecial 30	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   26: athrow
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	VolatileBox
    //   17	6	1	localInterruptedException	InterruptedException
    //   13	17	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	13	finally
    //   6	8	13	finally
    //   18	27	13	finally
    //   27	29	13	finally
    //   2	6	17	java/lang/InterruptedException
  }
  
  /* Error */
  public T blockedGetOrThrow(Class<? extends RuntimeException> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 23	java/lang/Object:wait	()V
    //   6: aload_0
    //   7: monitorexit
    //   8: aload_0
    //   9: getfield 25	com/androlua/util/VolatileBox:a	Ljava/lang/Object;
    //   12: areturn
    //   13: astore_3
    //   14: goto +33 -> 47
    //   17: aload_1
    //   18: invokevirtual 41	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   21: checkcast 27	java/lang/RuntimeException
    //   24: athrow
    //   25: astore 4
    //   27: new 27	java/lang/RuntimeException
    //   30: dup
    //   31: aload 4
    //   33: invokespecial 30	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   36: athrow
    //   37: astore_2
    //   38: new 27	java/lang/RuntimeException
    //   41: dup
    //   42: aload_2
    //   43: invokespecial 30	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   46: athrow
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_3
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	VolatileBox
    //   0	51	1	paramClass	Class<? extends RuntimeException>
    //   37	6	2	localInstantiationException	InstantiationException
    //   13	37	3	localObject	Object
    //   25	7	4	localIllegalAccessException	IllegalAccessException
    //   17	1	5	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   2	6	13	finally
    //   6	8	13	finally
    //   17	25	13	finally
    //   27	37	13	finally
    //   38	47	13	finally
    //   47	49	13	finally
    //   2	6	17	java/lang/InterruptedException
    //   17	25	25	java/lang/IllegalAccessException
    //   17	25	37	java/lang/InstantiationException
  }
  
  public T get()
  {
    return (T)this.a;
  }
  
  public boolean isNull()
  {
    return this.a == null;
  }
  
  public boolean notNull()
  {
    return this.a != null;
  }
  
  public void set(T paramT)
  {
    this.a = paramT;
  }
  
  public void setAndNotify(T paramT)
  {
    this.a = paramT;
    try
    {
      notify();
      return;
    }
    finally {}
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\util\VolatileBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */