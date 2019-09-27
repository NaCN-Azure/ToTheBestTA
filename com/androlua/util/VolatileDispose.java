package com.androlua.util;

public class VolatileDispose<T>
{
  private volatile T a;
  
  /* Error */
  public T blockedGet()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 18	com/androlua/util/VolatileDispose:a	Ljava/lang/Object;
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: getfield 18	com/androlua/util/VolatileDispose:a	Ljava/lang/Object;
    //   13: astore_3
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_3
    //   17: areturn
    //   18: aload_0
    //   19: ldc2_w 19
    //   22: invokevirtual 24	java/lang/Object:wait	(J)V
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_0
    //   28: getfield 18	com/androlua/util/VolatileDispose:a	Ljava/lang/Object;
    //   31: areturn
    //   32: astore_2
    //   33: new 26	java/lang/RuntimeException
    //   36: dup
    //   37: aload_2
    //   38: invokespecial 29	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   41: athrow
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	VolatileDispose
    //   42	4	1	localObject1	Object
    //   32	6	2	localInterruptedException	InterruptedException
    //   13	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   18	25	32	java/lang/InterruptedException
    //   2	16	42	finally
    //   18	25	42	finally
    //   25	27	42	finally
    //   33	42	42	finally
    //   43	45	42	finally
  }
  
  /* Error */
  public T blockedGetOrThrow(Class<? extends RuntimeException> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 18	com/androlua/util/VolatileDispose:a	Ljava/lang/Object;
    //   6: ifnull +14 -> 20
    //   9: aload_0
    //   10: getfield 18	com/androlua/util/VolatileDispose:a	Ljava/lang/Object;
    //   13: astore 5
    //   15: aload_0
    //   16: monitorexit
    //   17: aload 5
    //   19: areturn
    //   20: aload_0
    //   21: invokevirtual 37	java/lang/Object:wait	()V
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_0
    //   27: getfield 18	com/androlua/util/VolatileDispose:a	Ljava/lang/Object;
    //   30: areturn
    //   31: aload_1
    //   32: invokevirtual 42	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   35: checkcast 26	java/lang/RuntimeException
    //   38: athrow
    //   39: astore 4
    //   41: new 26	java/lang/RuntimeException
    //   44: dup
    //   45: aload 4
    //   47: invokespecial 29	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   50: athrow
    //   51: astore_3
    //   52: new 26	java/lang/RuntimeException
    //   55: dup
    //   56: aload_3
    //   57: invokespecial 29	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   60: athrow
    //   61: astore_2
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_2
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	VolatileDispose
    //   0	66	1	paramClass	Class<? extends RuntimeException>
    //   61	4	2	localObject1	Object
    //   51	6	3	localInstantiationException	InstantiationException
    //   39	7	4	localIllegalAccessException	IllegalAccessException
    //   13	5	5	localObject2	Object
    //   31	1	6	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   20	24	31	java/lang/InterruptedException
    //   31	39	39	java/lang/IllegalAccessException
    //   31	39	51	java/lang/InstantiationException
    //   2	17	61	finally
    //   20	24	61	finally
    //   24	26	61	finally
    //   31	39	61	finally
    //   41	51	61	finally
    //   52	61	61	finally
    //   62	64	61	finally
  }
  
  public void setAndNotify(T paramT)
  {
    try
    {
      this.a = paramT;
      notify();
      return;
    }
    finally {}
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\util\VolatileDispose.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */