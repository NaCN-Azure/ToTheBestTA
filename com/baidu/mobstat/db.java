package com.baidu.mobstat;

import android.net.LocalServerSocket;
import java.io.IOException;

public final class db
{
  private LocalServerSocket a;
  
  /* Error */
  public final boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	com/baidu/mobstat/db:a	Landroid/net/LocalServerSocket;
    //   6: ifnonnull +27 -> 33
    //   9: aload_0
    //   10: new 17	android/net/LocalServerSocket
    //   13: dup
    //   14: ldc 19
    //   16: invokespecial 22	android/net/LocalServerSocket:<init>	(Ljava/lang/String;)V
    //   19: putfield 15	com/baidu/mobstat/db:a	Landroid/net/LocalServerSocket;
    //   22: iconst_1
    //   23: istore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: iload_1
    //   27: ireturn
    //   28: astore_2
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_2
    //   32: athrow
    //   33: iconst_0
    //   34: istore_1
    //   35: goto -11 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	db
    //   23	12	1	bool	boolean
    //   28	4	2	localObject	Object
    //   33	1	3	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   2	22	28	finally
    //   2	22	33	java/io/IOException
  }
  
  public final void b()
  {
    try
    {
      LocalServerSocket localLocalServerSocket = this.a;
      if (localLocalServerSocket != null) {}
      try
      {
        this.a.close();
        this.a = null;
      }
      catch (IOException localIOException) {}
      return;
    }
    finally {}
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */