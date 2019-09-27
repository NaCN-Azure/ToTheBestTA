package com.androlua.util;

import java.util.Date;

public class TimerX
{
  private static long a;
  private final TimerImpl b;
  private final FinalizerHelper c;
  
  public TimerX()
  {
    this(false);
  }
  
  public TimerX(String paramString)
  {
    this(paramString, false);
  }
  
  public TimerX(String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    this.b = new TimerImpl(paramString, paramBoolean);
    this.c = new FinalizerHelper(this.b);
  }
  
  public TimerX(boolean paramBoolean)
  {
    this(localStringBuilder.toString(), paramBoolean);
  }
  
  private static long a()
  {
    try
    {
      long l = a;
      a = l + 1L;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(TimerTaskX paramTimerTaskX, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    synchronized (this.b)
    {
      if (TimerImpl.a(this.b)) {
        throw new IllegalStateException("Timer was canceled");
      }
      long l = paramLong1 + System.currentTimeMillis();
      if (l < 0L)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Illegal delay to start the TimerTask: ");
        localStringBuilder.append(l);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      synchronized (paramTimerTaskX.b)
      {
        if (paramTimerTaskX.a()) {
          throw new IllegalStateException("TimerTask is scheduled already");
        }
        if (paramTimerTaskX.c) {
          throw new IllegalStateException("TimerTask is canceled");
        }
        paramTimerTaskX.d = l;
        paramTimerTaskX.e = paramLong2;
        paramTimerTaskX.f = paramBoolean;
        TimerImpl.a(this.b, paramTimerTaskX);
        return;
      }
    }
  }
  
  public void cancel()
  {
    this.b.cancel();
  }
  
  public int purge()
  {
    synchronized (this.b)
    {
      int i = this.b.purge();
      return i;
    }
  }
  
  public void schedule(TimerTaskX paramTimerTaskX, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException();
    }
    a(paramTimerTaskX, paramLong, -1L, false);
  }
  
  public void schedule(TimerTaskX paramTimerTaskX, long paramLong1, long paramLong2)
  {
    if ((paramLong1 >= 0L) && (paramLong2 > 0L))
    {
      a(paramTimerTaskX, paramLong1, paramLong2, false);
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public void schedule(TimerTaskX paramTimerTaskX, Date paramDate)
  {
    if (paramDate.getTime() < 0L) {
      throw new IllegalArgumentException();
    }
    long l1 = paramDate.getTime() - System.currentTimeMillis();
    long l2;
    if (l1 < 0L) {
      l2 = 0L;
    } else {
      l2 = l1;
    }
    a(paramTimerTaskX, l2, -1L, false);
  }
  
  public void schedule(TimerTaskX paramTimerTaskX, Date paramDate, long paramLong)
  {
    if ((paramLong > 0L) && (paramDate.getTime() >= 0L))
    {
      long l1 = paramDate.getTime() - System.currentTimeMillis();
      long l2;
      if (l1 < 0L) {
        l2 = 0L;
      } else {
        l2 = l1;
      }
      a(paramTimerTaskX, l2, paramLong, false);
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public void scheduleAtFixedRate(TimerTaskX paramTimerTaskX, long paramLong1, long paramLong2)
  {
    if ((paramLong1 >= 0L) && (paramLong2 > 0L))
    {
      a(paramTimerTaskX, paramLong1, paramLong2, true);
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public void scheduleAtFixedRate(TimerTaskX paramTimerTaskX, Date paramDate, long paramLong)
  {
    if ((paramLong > 0L) && (paramDate.getTime() >= 0L))
    {
      a(paramTimerTaskX, paramDate.getTime() - System.currentTimeMillis(), paramLong, true);
      return;
    }
    throw new IllegalArgumentException();
  }
  
  private static final class FinalizerHelper
  {
    private final TimerX.TimerImpl a;
    
    FinalizerHelper(TimerX.TimerImpl paramTimerImpl)
    {
      this.a = paramTimerImpl;
    }
    
    /* Error */
    protected void finalize()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 13	com/androlua/util/TimerX$FinalizerHelper:a	Lcom/androlua/util/TimerX$TimerImpl;
      //   4: astore_2
      //   5: aload_2
      //   6: monitorenter
      //   7: aload_0
      //   8: getfield 13	com/androlua/util/TimerX$FinalizerHelper:a	Lcom/androlua/util/TimerX$TimerImpl;
      //   11: iconst_1
      //   12: invokestatic 19	com/androlua/util/TimerX$TimerImpl:a	(Lcom/androlua/util/TimerX$TimerImpl;Z)Z
      //   15: pop
      //   16: aload_0
      //   17: getfield 13	com/androlua/util/TimerX$FinalizerHelper:a	Lcom/androlua/util/TimerX$TimerImpl;
      //   20: invokevirtual 22	java/lang/Object:notify	()V
      //   23: aload_2
      //   24: monitorexit
      //   25: aload_0
      //   26: invokespecial 24	java/lang/Object:finalize	()V
      //   29: return
      //   30: astore_3
      //   31: aload_2
      //   32: monitorexit
      //   33: aload_3
      //   34: athrow
      //   35: astore_1
      //   36: aload_0
      //   37: invokespecial 24	java/lang/Object:finalize	()V
      //   40: aload_1
      //   41: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	42	0	this	FinalizerHelper
      //   35	6	1	localObject1	Object
      //   30	4	3	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   7	25	30	finally
      //   31	33	30	finally
      //   0	7	35	finally
      //   33	35	35	finally
    }
  }
  
  private static final class TimerImpl
    extends Thread
  {
    private boolean a;
    private boolean b;
    private TimerHeap c = new TimerHeap(null);
    
    TimerImpl(String paramString, boolean paramBoolean)
    {
      setName(paramString);
      setDaemon(paramBoolean);
      start();
    }
    
    private void a(TimerTaskX paramTimerTaskX)
    {
      this.c.insert(paramTimerTaskX);
      notify();
    }
    
    public void cancel()
    {
      try
      {
        this.a = true;
        this.c.reset();
        notify();
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public int purge()
    {
      if (this.c.isEmpty()) {
        return 0;
      }
      TimerHeap.a(this.c, 0);
      this.c.deleteIfCancelled();
      return TimerHeap.a(this.c);
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 47	com/androlua/util/TimerX$TimerImpl:a	Z
      //   6: ifeq +6 -> 12
      //   9: aload_0
      //   10: monitorexit
      //   11: return
      //   12: aload_0
      //   13: getfield 21	com/androlua/util/TimerX$TimerImpl:c	Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;
      //   16: invokevirtual 60	com/androlua/util/TimerX$TimerImpl$TimerHeap:isEmpty	()Z
      //   19: ifeq +26 -> 45
      //   22: aload_0
      //   23: getfield 50	com/androlua/util/TimerX$TimerImpl:b	Z
      //   26: ifeq +6 -> 32
      //   29: aload_0
      //   30: monitorexit
      //   31: return
      //   32: aload_0
      //   33: invokevirtual 75	java/lang/Object:wait	()V
      //   36: goto +4 -> 40
      //   39: pop
      //   40: aload_0
      //   41: monitorexit
      //   42: goto -42 -> 0
      //   45: invokestatic 81	java/lang/System:currentTimeMillis	()J
      //   48: lstore_2
      //   49: aload_0
      //   50: getfield 21	com/androlua/util/TimerX$TimerImpl:c	Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;
      //   53: invokevirtual 85	com/androlua/util/TimerX$TimerImpl$TimerHeap:minimum	()Lcom/androlua/util/TimerTaskX;
      //   56: astore 4
      //   58: aload 4
      //   60: getfield 90	com/androlua/util/TimerTaskX:b	Ljava/lang/Object;
      //   63: astore 5
      //   65: aload 5
      //   67: monitorenter
      //   68: aload 4
      //   70: getfield 92	com/androlua/util/TimerTaskX:c	Z
      //   73: ifeq +17 -> 90
      //   76: aload_0
      //   77: getfield 21	com/androlua/util/TimerX$TimerImpl:c	Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;
      //   80: iconst_0
      //   81: invokevirtual 96	com/androlua/util/TimerX$TimerImpl$TimerHeap:delete	(I)V
      //   84: aload 5
      //   86: monitorexit
      //   87: goto -48 -> 39
      //   90: aload 4
      //   92: getfield 100	com/androlua/util/TimerTaskX:d	J
      //   95: lload_2
      //   96: lsub
      //   97: lstore 7
      //   99: aload 5
      //   101: monitorexit
      //   102: lload 7
      //   104: lconst_0
      //   105: lcmp
      //   106: ifle +12 -> 118
      //   109: aload_0
      //   110: lload 7
      //   112: invokevirtual 103	java/lang/Object:wait	(J)V
      //   115: goto -76 -> 39
      //   118: aload 4
      //   120: getfield 90	com/androlua/util/TimerTaskX:b	Ljava/lang/Object;
      //   123: astore 9
      //   125: aload 9
      //   127: monitorenter
      //   128: aload_0
      //   129: getfield 21	com/androlua/util/TimerX$TimerImpl:c	Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;
      //   132: invokevirtual 85	com/androlua/util/TimerX$TimerImpl$TimerHeap:minimum	()Lcom/androlua/util/TimerTaskX;
      //   135: getfield 100	com/androlua/util/TimerTaskX:d	J
      //   138: aload 4
      //   140: getfield 100	com/androlua/util/TimerTaskX:d	J
      //   143: lcmp
      //   144: istore 11
      //   146: iconst_0
      //   147: istore 12
      //   149: iload 11
      //   151: ifeq +14 -> 165
      //   154: aload_0
      //   155: getfield 21	com/androlua/util/TimerX$TimerImpl:c	Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;
      //   158: aload 4
      //   160: invokestatic 106	com/androlua/util/TimerX$TimerImpl$TimerHeap:a	(Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;Lcom/androlua/util/TimerTaskX;)I
      //   163: istore 12
      //   165: aload 4
      //   167: getfield 92	com/androlua/util/TimerTaskX:c	Z
      //   170: ifeq +25 -> 195
      //   173: aload_0
      //   174: getfield 21	com/androlua/util/TimerX$TimerImpl:c	Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;
      //   177: aload_0
      //   178: getfield 21	com/androlua/util/TimerX$TimerImpl:c	Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;
      //   181: aload 4
      //   183: invokestatic 106	com/androlua/util/TimerX$TimerImpl$TimerHeap:a	(Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;Lcom/androlua/util/TimerTaskX;)I
      //   186: invokevirtual 96	com/androlua/util/TimerX$TimerImpl$TimerHeap:delete	(I)V
      //   189: aload 9
      //   191: monitorexit
      //   192: goto -153 -> 39
      //   195: aload 4
      //   197: aload 4
      //   199: getfield 100	com/androlua/util/TimerTaskX:d	J
      //   202: invokevirtual 109	com/androlua/util/TimerTaskX:setScheduledTime	(J)V
      //   205: aload_0
      //   206: getfield 21	com/androlua/util/TimerX$TimerImpl:c	Lcom/androlua/util/TimerX$TimerImpl$TimerHeap;
      //   209: iload 12
      //   211: invokevirtual 96	com/androlua/util/TimerX$TimerImpl$TimerHeap:delete	(I)V
      //   214: aload 4
      //   216: getfield 112	com/androlua/util/TimerTaskX:e	J
      //   219: lconst_0
      //   220: lcmp
      //   221: iflt +53 -> 274
      //   224: aload 4
      //   226: getfield 115	com/androlua/util/TimerTaskX:f	Z
      //   229: ifeq +22 -> 251
      //   232: aload 4
      //   234: aload 4
      //   236: getfield 100	com/androlua/util/TimerTaskX:d	J
      //   239: aload 4
      //   241: getfield 112	com/androlua/util/TimerTaskX:e	J
      //   244: ladd
      //   245: putfield 100	com/androlua/util/TimerTaskX:d	J
      //   248: goto +17 -> 265
      //   251: aload 4
      //   253: invokestatic 81	java/lang/System:currentTimeMillis	()J
      //   256: aload 4
      //   258: getfield 112	com/androlua/util/TimerTaskX:e	J
      //   261: ladd
      //   262: putfield 100	com/androlua/util/TimerTaskX:d	J
      //   265: aload_0
      //   266: aload 4
      //   268: invokespecial 44	com/androlua/util/TimerX$TimerImpl:a	(Lcom/androlua/util/TimerTaskX;)V
      //   271: goto +9 -> 280
      //   274: aload 4
      //   276: lconst_0
      //   277: putfield 100	com/androlua/util/TimerTaskX:d	J
      //   280: aload 9
      //   282: monitorexit
      //   283: aload_0
      //   284: monitorexit
      //   285: aload 4
      //   287: invokevirtual 118	com/androlua/util/TimerTaskX:isEnabled	()Z
      //   290: ifeq -290 -> 0
      //   293: aload 4
      //   295: invokevirtual 120	com/androlua/util/TimerTaskX:run	()V
      //   298: goto -298 -> 0
      //   301: astore 13
      //   303: aload_0
      //   304: monitorenter
      //   305: aload_0
      //   306: iconst_1
      //   307: putfield 47	com/androlua/util/TimerX$TimerImpl:a	Z
      //   310: aload_0
      //   311: monitorexit
      //   312: goto +10 -> 322
      //   315: astore 14
      //   317: aload_0
      //   318: monitorexit
      //   319: aload 14
      //   321: athrow
      //   322: aload 13
      //   324: athrow
      //   325: astore 10
      //   327: aload 9
      //   329: monitorexit
      //   330: aload 10
      //   332: athrow
      //   333: astore 6
      //   335: aload 5
      //   337: monitorexit
      //   338: aload 6
      //   340: athrow
      //   341: astore_1
      //   342: aload_0
      //   343: monitorexit
      //   344: aload_1
      //   345: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	346	0	this	TimerImpl
      //   341	4	1	localObject1	Object
      //   48	48	2	l1	long
      //   56	238	4	localTimerTaskX	TimerTaskX
      //   63	273	5	localObject2	Object
      //   333	6	6	localObject3	Object
      //   97	14	7	l2	long
      //   123	205	9	localObject4	Object
      //   325	6	10	localObject5	Object
      //   144	6	11	bool	boolean
      //   147	63	12	i	int
      //   39	1	13	localInterruptedException	InterruptedException
      //   301	22	13	localObject6	Object
      //   315	5	14	localObject7	Object
      // Exception table:
      //   from	to	target	type
      //   32	36	39	java/lang/InterruptedException
      //   109	115	39	java/lang/InterruptedException
      //   285	298	301	finally
      //   305	312	315	finally
      //   317	319	315	finally
      //   128	146	325	finally
      //   154	165	325	finally
      //   165	192	325	finally
      //   195	248	325	finally
      //   251	265	325	finally
      //   265	271	325	finally
      //   274	280	325	finally
      //   280	283	325	finally
      //   327	330	325	finally
      //   68	87	333	finally
      //   90	102	333	finally
      //   335	338	333	finally
      //   2	11	341	finally
      //   12	31	341	finally
      //   32	36	341	finally
      //   39	40	341	finally
      //   40	42	341	finally
      //   45	68	341	finally
      //   109	115	341	finally
      //   118	128	341	finally
      //   283	285	341	finally
      //   330	333	341	finally
      //   338	341	341	finally
      //   342	344	341	finally
    }
    
    private static final class TimerHeap
    {
      private int a = 256;
      private TimerTaskX[] b = new TimerTaskX[this.a];
      private int c = 0;
      private int d = 0;
      
      private int a(TimerTaskX paramTimerTaskX)
      {
        for (int i = 0; i < this.b.length; i++) {
          if (this.b[i] == paramTimerTaskX) {
            return i;
          }
        }
        return -1;
      }
      
      private void a()
      {
        int i = -1 + this.c;
        int j = (i - 1) / 2;
        while (this.b[i].d < this.b[j].d)
        {
          TimerTaskX localTimerTaskX = this.b[i];
          this.b[i] = this.b[j];
          this.b[j] = localTimerTaskX;
          int k = (j - 1) / 2;
          int m = j;
          j = k;
          i = m;
        }
      }
      
      private void a(int paramInt)
      {
        int i = 1 + paramInt * 2;
        while ((i < this.c) && (this.c > 0))
        {
          int j = i + 1;
          if ((j < this.c) && (this.b[j].d < this.b[i].d)) {
            i = j;
          }
          if (this.b[paramInt].d < this.b[i].d) {
            return;
          }
          TimerTaskX localTimerTaskX = this.b[paramInt];
          this.b[paramInt] = this.b[i];
          this.b[i] = localTimerTaskX;
          int k = 1 + i * 2;
          int m = i;
          i = k;
          paramInt = m;
        }
      }
      
      public void adjustMinimum()
      {
        a(0);
      }
      
      public void delete(int paramInt)
      {
        if ((paramInt >= 0) && (paramInt < this.c))
        {
          TimerTaskX[] arrayOfTimerTaskX1 = this.b;
          TimerTaskX[] arrayOfTimerTaskX2 = this.b;
          int i = -1 + this.c;
          this.c = i;
          arrayOfTimerTaskX1[paramInt] = arrayOfTimerTaskX2[i];
          this.b[this.c] = null;
          a(paramInt);
        }
      }
      
      public void deleteIfCancelled()
      {
        for (int i = 0; i < this.c; i++) {
          if (this.b[i].c)
          {
            this.d = (1 + this.d);
            delete(i);
            i--;
          }
        }
      }
      
      public void insert(TimerTaskX paramTimerTaskX)
      {
        if (this.b.length == this.c)
        {
          TimerTaskX[] arrayOfTimerTaskX2 = new TimerTaskX[2 * this.c];
          System.arraycopy(this.b, 0, arrayOfTimerTaskX2, 0, this.c);
          this.b = arrayOfTimerTaskX2;
        }
        TimerTaskX[] arrayOfTimerTaskX1 = this.b;
        int i = this.c;
        this.c = (i + 1);
        arrayOfTimerTaskX1[i] = paramTimerTaskX;
        a();
      }
      
      public boolean isEmpty()
      {
        return this.c == 0;
      }
      
      public TimerTaskX minimum()
      {
        return this.b[0];
      }
      
      public void reset()
      {
        this.b = new TimerTaskX[this.a];
        this.c = 0;
      }
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\util\TimerX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */