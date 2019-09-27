package com.android.cglib.dx.c.b;

import java.util.HashMap;

public final class i
  extends com.android.cglib.dx.d.o
{
  private final o a;
  private final o[] b;
  private final HashMap<f, m> c;
  
  /* Error */
  private o b(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/android/cglib/dx/c/b/i:b	[Lcom/android/cglib/dx/c/b/o;
    //   4: iload_1
    //   5: aaload
    //   6: astore_2
    //   7: aload_2
    //   8: areturn
    //   9: new 18	java/lang/IllegalArgumentException
    //   12: dup
    //   13: ldc 20
    //   15: invokespecial 24	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	19	0	this	i
    //   0	19	1	paramInt	int
    //   6	2	2	localo	o
    //   9	1	3	localArrayIndexOutOfBoundsException	ArrayIndexOutOfBoundsException
    // Exception table:
    //   from	to	target	type
    //   0	7	9	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public int a()
  {
    return this.c.size();
  }
  
  public m a(f paramf)
  {
    return (m)this.c.get(paramf);
  }
  
  public o a(int paramInt)
  {
    o localo = b(paramInt);
    if (localo != null) {
      return localo;
    }
    return this.a;
  }
  
  public o a(b paramb)
  {
    return a(paramb.a());
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */