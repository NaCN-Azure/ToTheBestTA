package com.androlua;

import com.androlua.util.AsyncTaskX;
import com.androlua.util.AsyncTaskX.Status;
import com.luajava.JavaFunction;
import com.luajava.LuaException;
import com.luajava.LuaObject;
import com.luajava.LuaState;

public class LuaAsyncTask
  extends AsyncTaskX
  implements LuaGcable
{
  private Object[] a;
  private boolean b;
  private LuaState c;
  private LuaContext d;
  private byte[] e;
  private long f = 0L;
  private LuaObject g;
  private LuaObject h;
  
  static
  {
    AsyncTaskX.setDefaultExecutor(AsyncTaskX.THREAD_POOL_EXECUTOR);
  }
  
  public LuaAsyncTask(LuaContext paramLuaContext, long paramLong, LuaObject paramLuaObject)
  {
    paramLuaContext.regGc(this);
    this.d = paramLuaContext;
    this.f = paramLong;
    this.g = paramLuaObject;
  }
  
  public LuaAsyncTask(LuaContext paramLuaContext, LuaObject paramLuaObject1, LuaObject paramLuaObject2)
  {
    paramLuaContext.regGc(this);
    this.d = paramLuaContext;
    this.e = paramLuaObject1.dump();
    this.g = paramLuaObject2;
    LuaObject localLuaObject = paramLuaObject1.getLuaState().getLuaObject("luajava").getField("imported");
    if (!localLuaObject.isNil()) {
      this.a = localLuaObject.asArray();
    }
  }
  
  public LuaAsyncTask(LuaContext paramLuaContext, LuaObject paramLuaObject1, LuaObject paramLuaObject2, LuaObject paramLuaObject3)
  {
    paramLuaContext.regGc(this);
    this.d = paramLuaContext;
    this.e = paramLuaObject1.dump();
    this.h = paramLuaObject2;
    this.g = paramLuaObject3;
  }
  
  public LuaAsyncTask(LuaContext paramLuaContext, String paramString, LuaObject paramLuaObject)
  {
    paramLuaContext.regGc(this);
    this.d = paramLuaContext;
    this.e = paramString.getBytes();
    this.g = paramLuaObject;
  }
  
  private String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown error ");
      localStringBuilder.append(paramInt);
      return localStringBuilder.toString();
    case 6: 
      return "error error";
    case 5: 
      return "GC error";
    case 4: 
      return "Out of memory";
    case 3: 
      return "Syntax error";
    case 2: 
      return "Runtime error";
    }
    return "Yield error";
  }
  
  /* Error */
  protected Object a(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/androlua/LuaAsyncTask:f	J
    //   4: lconst_0
    //   5: lcmp
    //   6: ifeq +16 -> 22
    //   9: aload_0
    //   10: getfield 37	com/androlua/LuaAsyncTask:f	J
    //   13: invokestatic 132	java/lang/Thread:sleep	(J)V
    //   16: goto +4 -> 20
    //   19: pop
    //   20: aload_1
    //   21: areturn
    //   22: aload_0
    //   23: invokestatic 137	com/luajava/LuaStateFactory:newLuaState	()Lcom/luajava/LuaState;
    //   26: putfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   29: aload_0
    //   30: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   33: invokevirtual 142	com/luajava/LuaState:openLibs	()V
    //   36: aload_0
    //   37: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   40: aload_0
    //   41: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   44: invokevirtual 146	com/luajava/LuaState:pushJavaObject	(Ljava/lang/Object;)V
    //   47: aload_0
    //   48: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   51: instanceof 148
    //   54: ifeq +23 -> 77
    //   57: aload_0
    //   58: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   61: astore 28
    //   63: ldc -106
    //   65: astore 29
    //   67: aload 28
    //   69: aload 29
    //   71: invokevirtual 154	com/luajava/LuaState:setGlobal	(Ljava/lang/String;)V
    //   74: goto +26 -> 100
    //   77: aload_0
    //   78: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   81: instanceof 156
    //   84: ifeq +16 -> 100
    //   87: aload_0
    //   88: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   91: astore 28
    //   93: ldc -98
    //   95: astore 29
    //   97: goto -30 -> 67
    //   100: aload_0
    //   101: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   104: aload_0
    //   105: invokevirtual 146	com/luajava/LuaState:pushJavaObject	(Ljava/lang/Object;)V
    //   108: aload_0
    //   109: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   112: ldc -96
    //   114: invokevirtual 154	com/luajava/LuaState:setGlobal	(Ljava/lang/String;)V
    //   117: aload_0
    //   118: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   121: aload_0
    //   122: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   125: invokevirtual 164	com/luajava/LuaState:pushContext	(Lcom/androlua/LuaContext;)V
    //   128: aload_0
    //   129: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   132: ldc 62
    //   134: invokevirtual 168	com/luajava/LuaState:getGlobal	(Ljava/lang/String;)I
    //   137: pop
    //   138: aload_0
    //   139: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   142: aload_0
    //   143: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   146: invokeinterface 171 1 0
    //   151: invokevirtual 174	com/luajava/LuaState:pushString	(Ljava/lang/String;)V
    //   154: aload_0
    //   155: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   158: bipush -2
    //   160: ldc -80
    //   162: invokevirtual 180	com/luajava/LuaState:setField	(ILjava/lang/String;)V
    //   165: aload_0
    //   166: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   169: iconst_1
    //   170: invokevirtual 184	com/luajava/LuaState:pop	(I)V
    //   173: new 186	com/androlua/LuaPrint
    //   176: dup
    //   177: aload_0
    //   178: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   181: aload_0
    //   182: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   185: invokespecial 189	com/androlua/LuaPrint:<init>	(Lcom/androlua/LuaContext;Lcom/luajava/LuaState;)V
    //   188: ldc -65
    //   190: invokevirtual 196	com/luajava/JavaFunction:register	(Ljava/lang/String;)V
    //   193: new 198	com/androlua/LuaAsyncTask$1
    //   196: dup
    //   197: aload_0
    //   198: aload_0
    //   199: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   202: invokespecial 201	com/androlua/LuaAsyncTask$1:<init>	(Lcom/androlua/LuaAsyncTask;Lcom/luajava/LuaState;)V
    //   205: ldc -53
    //   207: invokevirtual 196	com/luajava/JavaFunction:register	(Ljava/lang/String;)V
    //   210: aload_0
    //   211: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   214: ldc -51
    //   216: invokevirtual 168	com/luajava/LuaState:getGlobal	(Ljava/lang/String;)I
    //   219: pop
    //   220: aload_0
    //   221: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   224: aload_0
    //   225: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   228: invokeinterface 208 1 0
    //   233: invokevirtual 174	com/luajava/LuaState:pushString	(Ljava/lang/String;)V
    //   236: aload_0
    //   237: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   240: bipush -2
    //   242: ldc -46
    //   244: invokevirtual 180	com/luajava/LuaState:setField	(ILjava/lang/String;)V
    //   247: aload_0
    //   248: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   251: aload_0
    //   252: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   255: invokeinterface 213 1 0
    //   260: invokevirtual 174	com/luajava/LuaState:pushString	(Ljava/lang/String;)V
    //   263: aload_0
    //   264: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   267: bipush -2
    //   269: ldc -41
    //   271: invokevirtual 180	com/luajava/LuaState:setField	(ILjava/lang/String;)V
    //   274: aload_0
    //   275: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   278: iconst_1
    //   279: invokevirtual 184	com/luajava/LuaState:pop	(I)V
    //   282: goto +16 -> 298
    //   285: astore_3
    //   286: aload_0
    //   287: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   290: ldc -39
    //   292: aload_3
    //   293: invokeinterface 221 3 0
    //   298: aload_0
    //   299: getfield 83	com/androlua/LuaAsyncTask:a	[Ljava/lang/Object;
    //   302: astore 4
    //   304: iconst_0
    //   305: istore 5
    //   307: aload 4
    //   309: ifnull +97 -> 406
    //   312: aload_0
    //   313: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   316: ldc -33
    //   318: invokevirtual 68	com/luajava/LuaState:getLuaObject	(Ljava/lang/String;)Lcom/luajava/LuaObject;
    //   321: astore 18
    //   323: aload 18
    //   325: iconst_1
    //   326: anewarray 225	java/lang/Object
    //   329: dup
    //   330: iconst_0
    //   331: ldc -29
    //   333: aastore
    //   334: invokevirtual 230	com/luajava/LuaObject:call	([Ljava/lang/Object;)Ljava/lang/Object;
    //   337: pop
    //   338: aload_0
    //   339: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   342: ldc -29
    //   344: invokevirtual 68	com/luajava/LuaState:getLuaObject	(Ljava/lang/String;)Lcom/luajava/LuaObject;
    //   347: astore 20
    //   349: aload_0
    //   350: getfield 83	com/androlua/LuaAsyncTask:a	[Ljava/lang/Object;
    //   353: astore 21
    //   355: aload 21
    //   357: arraylength
    //   358: istore 22
    //   360: iconst_0
    //   361: istore 23
    //   363: iload 23
    //   365: iload 22
    //   367: if_icmpge +39 -> 406
    //   370: aload 21
    //   372: iload 23
    //   374: aaload
    //   375: astore 24
    //   377: iconst_1
    //   378: anewarray 225	java/lang/Object
    //   381: astore 25
    //   383: aload 25
    //   385: iconst_0
    //   386: aload 24
    //   388: invokevirtual 231	java/lang/Object:toString	()Ljava/lang/String;
    //   391: aastore
    //   392: aload 20
    //   394: aload 25
    //   396: invokevirtual 230	com/luajava/LuaObject:call	([Ljava/lang/Object;)Ljava/lang/Object;
    //   399: pop
    //   400: iinc 23 1
    //   403: goto -40 -> 363
    //   406: aload_0
    //   407: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   410: iconst_0
    //   411: invokevirtual 234	com/luajava/LuaState:setTop	(I)V
    //   414: aload_0
    //   415: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   418: aload_0
    //   419: getfield 56	com/androlua/LuaAsyncTask:e	[B
    //   422: ldc -20
    //   424: invokevirtual 240	com/luajava/LuaState:LloadBuffer	([BLjava/lang/String;)I
    //   427: istore 7
    //   429: iload 7
    //   431: ifne +142 -> 573
    //   434: aload_0
    //   435: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   438: ldc -14
    //   440: invokevirtual 168	com/luajava/LuaState:getGlobal	(Ljava/lang/String;)I
    //   443: pop
    //   444: aload_0
    //   445: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   448: iconst_m1
    //   449: ldc -12
    //   451: invokevirtual 247	com/luajava/LuaState:getField	(ILjava/lang/String;)I
    //   454: pop
    //   455: aload_0
    //   456: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   459: bipush -2
    //   461: invokevirtual 250	com/luajava/LuaState:remove	(I)V
    //   464: aload_0
    //   465: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   468: bipush -2
    //   470: invokevirtual 253	com/luajava/LuaState:insert	(I)V
    //   473: aload_1
    //   474: arraylength
    //   475: istore 10
    //   477: iconst_0
    //   478: istore 11
    //   480: iload 11
    //   482: iload 10
    //   484: if_icmpge +20 -> 504
    //   487: aload_0
    //   488: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   491: aload_1
    //   492: iload 11
    //   494: aaload
    //   495: invokevirtual 256	com/luajava/LuaState:pushObjectValue	(Ljava/lang/Object;)V
    //   498: iinc 11 1
    //   501: goto -21 -> 480
    //   504: aload_0
    //   505: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   508: iload 10
    //   510: iconst_m1
    //   511: bipush -2
    //   513: iload 10
    //   515: isub
    //   516: invokevirtual 260	com/luajava/LuaState:pcall	(III)I
    //   519: istore 7
    //   521: iload 7
    //   523: ifne +50 -> 573
    //   526: aload_0
    //   527: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   530: invokevirtual 264	com/luajava/LuaState:getTop	()I
    //   533: iconst_1
    //   534: isub
    //   535: istore 12
    //   537: iload 12
    //   539: anewarray 225	java/lang/Object
    //   542: astore 13
    //   544: iload 5
    //   546: iload 12
    //   548: if_icmpge +100 -> 648
    //   551: aload 13
    //   553: iload 5
    //   555: aload_0
    //   556: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   559: iload 5
    //   561: iconst_2
    //   562: iadd
    //   563: invokevirtual 268	com/luajava/LuaState:toJavaObject	(I)Ljava/lang/Object;
    //   566: aastore
    //   567: iinc 5 1
    //   570: goto -26 -> 544
    //   573: new 95	java/lang/StringBuilder
    //   576: dup
    //   577: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   580: astore 14
    //   582: aload 14
    //   584: aload_0
    //   585: iload 7
    //   587: invokespecial 270	com/androlua/LuaAsyncTask:a	(I)Ljava/lang/String;
    //   590: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   593: pop
    //   594: aload 14
    //   596: ldc_w 272
    //   599: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   602: pop
    //   603: aload 14
    //   605: aload_0
    //   606: getfield 139	com/androlua/LuaAsyncTask:c	Lcom/luajava/LuaState;
    //   609: iconst_m1
    //   610: invokevirtual 274	com/luajava/LuaState:toString	(I)Ljava/lang/String;
    //   613: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   616: pop
    //   617: new 126	com/luajava/LuaException
    //   620: dup
    //   621: aload 14
    //   623: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   626: invokespecial 276	com/luajava/LuaException:<init>	(Ljava/lang/String;)V
    //   629: athrow
    //   630: astore 6
    //   632: aload_0
    //   633: getfield 45	com/androlua/LuaAsyncTask:d	Lcom/androlua/LuaContext;
    //   636: ldc_w 278
    //   639: aload 6
    //   641: invokeinterface 221 3 0
    //   646: aconst_null
    //   647: areturn
    //   648: aload 13
    //   650: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	651	0	this	LuaAsyncTask
    //   0	651	1	paramArrayOfObject	Object[]
    //   285	8	3	localLuaException1	LuaException
    //   302	6	4	arrayOfObject1	Object[]
    //   305	258	5	i	int
    //   630	10	6	localLuaException2	LuaException
    //   427	159	7	j	int
    //   475	41	10	k	int
    //   478	15	11	m	int
    //   535	14	12	n	int
    //   542	107	13	arrayOfObject2	Object[]
    //   580	42	14	localStringBuilder	StringBuilder
    //   321	3	18	localLuaObject1	LuaObject
    //   347	46	20	localLuaObject2	LuaObject
    //   19	1	21	localInterruptedException	InterruptedException
    //   353	18	21	arrayOfObject3	Object[]
    //   358	10	22	i1	int
    //   406	1	22	localLuaException3	LuaException
    //   361	40	23	i2	int
    //   375	12	24	localObject	Object
    //   381	14	25	arrayOfObject4	Object[]
    //   61	31	28	localLuaState	LuaState
    //   65	31	29	str	String
    // Exception table:
    //   from	to	target	type
    //   9	16	19	java/lang/InterruptedException
    //   173	282	285	com/luajava/LuaException
    //   323	360	406	com/luajava/LuaException
    //   370	400	406	com/luajava/LuaException
    //   406	429	630	com/luajava/LuaException
    //   434	477	630	com/luajava/LuaException
    //   487	498	630	com/luajava/LuaException
    //   504	521	630	com/luajava/LuaException
    //   526	544	630	com/luajava/LuaException
    //   551	567	630	com/luajava/LuaException
    //   573	630	630	com/luajava/LuaException
  }
  
  protected void a(Object paramObject)
  {
    if (isCancelled()) {
      return;
    }
    try
    {
      if (this.g != null) {
        this.g.call((Object[])paramObject);
      }
    }
    catch (LuaException localLuaException)
    {
      this.d.sendError("onPostExecute", localLuaException);
    }
    if (this.c != null) {
      this.c.gc(2, 1);
    }
    System.gc();
  }
  
  protected void b(Object[] paramArrayOfObject)
  {
    try
    {
      if (this.h != null) {
        this.h.call(paramArrayOfObject);
      }
    }
    catch (LuaException localLuaException)
    {
      this.d.sendError("onProgressUpdate", localLuaException);
    }
    super.b(paramArrayOfObject);
  }
  
  public void execute()
  {
    super.execute(new Object[0]);
  }
  
  public void gc()
  {
    if (getStatus() == AsyncTaskX.Status.RUNNING) {
      cancel(true);
    }
    this.b = true;
  }
  
  public boolean isGc()
  {
    return this.b;
  }
  
  public void update(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    c(arrayOfObject);
  }
  
  public void update(Object paramObject)
  {
    c(new Object[] { paramObject });
  }
  
  public void update(String paramString)
  {
    c(new Object[] { paramString });
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaAsyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */