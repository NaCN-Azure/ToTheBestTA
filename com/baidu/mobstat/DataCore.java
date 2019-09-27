package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataCore
{
  private static JSONObject a = new JSONObject();
  private static DataCore b = new DataCore();
  private JSONArray c = new JSONArray();
  private JSONArray d = new JSONArray();
  private JSONArray e = new JSONArray();
  private boolean f = false;
  private volatile int g = 0;
  private StatService.WearListener h;
  
  private void a(Context paramContext)
  {
    clearCache(paramContext);
    CooperService.a().setHeadSqCounted(true);
    ch.a().d();
  }
  
  private void a(Context paramContext, String paramString)
  {
    if ((this.h != null) && (this.h.onSendLogData(paramString)))
    {
      cz.a("log data has been passed to app level");
      return;
    }
    by.a().a(paramContext, paramString);
  }
  
  /* Error */
  private void a(JSONObject paramJSONObject, String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, String paramString5, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   4: astore 11
    //   6: aload 11
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   13: invokevirtual 94	org/json/JSONArray:length	()I
    //   16: istore 13
    //   18: aload 4
    //   20: ifnull +13 -> 33
    //   23: aload 4
    //   25: ldc 96
    //   27: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   30: ifeq +20 -> 50
    //   33: aload_1
    //   34: ldc 104
    //   36: ldc 106
    //   38: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   41: pop
    //   42: goto +8 -> 50
    //   45: ldc 112
    //   47: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   50: iload 13
    //   52: istore 14
    //   54: iconst_0
    //   55: istore 15
    //   57: iload 15
    //   59: iload 13
    //   61: if_icmpge +429 -> 490
    //   64: aload_0
    //   65: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   68: iload 15
    //   70: invokevirtual 116	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   73: astore 21
    //   75: aload 21
    //   77: ldc 118
    //   79: invokevirtual 122	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   82: astore 22
    //   84: aload 21
    //   86: ldc 124
    //   88: invokevirtual 122	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   91: astore 23
    //   93: aload 21
    //   95: ldc 126
    //   97: invokevirtual 130	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   100: ldc2_w 131
    //   103: ldiv
    //   104: lstore 24
    //   106: aload 21
    //   108: ldc -123
    //   110: invokevirtual 137	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   113: istore 26
    //   115: goto +11 -> 126
    //   118: ldc -117
    //   120: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   123: iconst_0
    //   124: istore 26
    //   126: aload 21
    //   128: ldc -116
    //   130: invokevirtual 143	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   133: astore 27
    //   135: aload 21
    //   137: ldc -111
    //   139: invokevirtual 143	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   142: astore 28
    //   144: aload 21
    //   146: ldc -109
    //   148: invokevirtual 150	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   151: istore 29
    //   153: iload 14
    //   155: istore 19
    //   157: aload 21
    //   159: ldc -104
    //   161: invokevirtual 155	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   164: istore 30
    //   166: lload 24
    //   168: lload 5
    //   170: lcmp
    //   171: ifne +232 -> 403
    //   174: iload 26
    //   176: ifeq +6 -> 182
    //   179: goto +224 -> 403
    //   182: aload 22
    //   184: aload_2
    //   185: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   188: ifeq +207 -> 395
    //   191: aload 23
    //   193: aload_3
    //   194: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   197: ifeq +198 -> 395
    //   200: aload 27
    //   202: aload 7
    //   204: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   207: istore 31
    //   209: iload 31
    //   211: ifeq +184 -> 395
    //   214: aload 28
    //   216: aload 8
    //   218: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   221: istore 32
    //   223: iload 32
    //   225: ifeq +170 -> 395
    //   228: iload 29
    //   230: iload 9
    //   232: if_icmpne +163 -> 395
    //   235: iload 30
    //   237: iload 10
    //   239: if_icmpne +241 -> 480
    //   242: aload_1
    //   243: ldc -100
    //   245: invokevirtual 137	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   248: aload 21
    //   250: ldc -100
    //   252: invokevirtual 137	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   255: iadd
    //   256: istore 33
    //   258: aload 21
    //   260: ldc 104
    //   262: invokevirtual 143	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   265: astore 34
    //   267: aload 34
    //   269: ifnull +204 -> 473
    //   272: aload 34
    //   274: ldc 96
    //   276: invokevirtual 159	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   279: ifeq +6 -> 285
    //   282: goto +191 -> 473
    //   285: aload_1
    //   286: ldc 126
    //   288: invokevirtual 130	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   291: aload 21
    //   293: ldc 126
    //   295: invokevirtual 130	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   298: lsub
    //   299: lstore 35
    //   301: new 161	java/lang/StringBuilder
    //   304: dup
    //   305: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   308: astore 37
    //   310: aload 37
    //   312: aload 34
    //   314: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: aload 37
    //   320: lload 35
    //   322: invokevirtual 169	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   325: pop
    //   326: aload 37
    //   328: ldc -85
    //   330: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: pop
    //   334: aload 37
    //   336: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   339: astore 41
    //   341: aload 21
    //   343: ldc -100
    //   345: invokevirtual 179	org/json/JSONObject:remove	(Ljava/lang/String;)Ljava/lang/Object;
    //   348: pop
    //   349: aload 21
    //   351: ldc -100
    //   353: iload 33
    //   355: invokevirtual 182	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   358: pop
    //   359: aload 21
    //   361: ldc 104
    //   363: aload 41
    //   365: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   368: pop
    //   369: goto +60 -> 429
    //   372: astore 42
    //   374: aload 42
    //   376: astore 20
    //   378: iload 15
    //   380: istore 19
    //   382: goto +39 -> 421
    //   385: astore 18
    //   387: goto +30 -> 417
    //   390: astore 18
    //   392: goto +16 -> 408
    //   395: goto +85 -> 480
    //   398: astore 18
    //   400: goto +8 -> 408
    //   403: goto -8 -> 395
    //   406: astore 18
    //   408: goto +9 -> 417
    //   411: astore 18
    //   413: iload 14
    //   415: istore 19
    //   417: aload 18
    //   419: astore 20
    //   421: aload 20
    //   423: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   426: goto +54 -> 480
    //   429: iload 15
    //   431: iload 13
    //   433: if_icmpge +7 -> 440
    //   436: aload 11
    //   438: monitorexit
    //   439: return
    //   440: aload_0
    //   441: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   444: iload 13
    //   446: aload_1
    //   447: invokevirtual 188	org/json/JSONArray:put	(ILjava/lang/Object;)Lorg/json/JSONArray;
    //   450: pop
    //   451: goto +10 -> 461
    //   454: astore 16
    //   456: aload 16
    //   458: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   461: aload 11
    //   463: monitorexit
    //   464: return
    //   465: astore 12
    //   467: aload 11
    //   469: monitorexit
    //   470: aload 12
    //   472: athrow
    //   473: ldc 106
    //   475: astore 34
    //   477: goto -192 -> 285
    //   480: iload 19
    //   482: istore 14
    //   484: iinc 15 1
    //   487: goto -430 -> 57
    //   490: iload 14
    //   492: istore 15
    //   494: goto -65 -> 429
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	497	0	this	DataCore
    //   0	497	1	paramJSONObject	JSONObject
    //   0	497	2	paramString1	String
    //   0	497	3	paramString2	String
    //   0	497	4	paramString3	String
    //   0	497	5	paramLong	long
    //   0	497	7	paramString4	String
    //   0	497	8	paramString5	String
    //   0	497	9	paramInt	int
    //   0	497	10	paramBoolean	boolean
    //   4	464	11	localJSONArray	JSONArray
    //   465	6	12	localObject1	Object
    //   16	429	13	i	int
    //   52	439	14	j	int
    //   55	438	15	k	int
    //   454	3	16	localJSONException1	JSONException
    //   385	1	18	localJSONException2	JSONException
    //   390	1	18	localJSONException3	JSONException
    //   398	1	18	localJSONException4	JSONException
    //   406	1	18	localJSONException5	JSONException
    //   411	7	18	localJSONException6	JSONException
    //   155	326	19	m	int
    //   376	46	20	localObject2	Object
    //   73	287	21	localJSONObject	JSONObject
    //   82	101	22	str1	String
    //   91	101	23	str2	String
    //   104	63	24	l1	long
    //   113	62	26	n	int
    //   133	68	27	str3	String
    //   142	73	28	str4	String
    //   151	82	29	i1	int
    //   164	76	30	bool1	boolean
    //   207	3	31	bool2	boolean
    //   221	3	32	bool3	boolean
    //   256	98	33	i2	int
    //   265	211	34	str5	String
    //   299	22	35	l2	long
    //   308	27	37	localStringBuilder	StringBuilder
    //   45	1	40	localJSONException7	JSONException
    //   118	1	41	localJSONException8	JSONException
    //   339	25	41	str6	String
    //   372	3	42	localJSONException9	JSONException
    // Exception table:
    //   from	to	target	type
    //   23	33	45	org/json/JSONException
    //   33	42	45	org/json/JSONException
    //   106	115	118	org/json/JSONException
    //   341	369	372	org/json/JSONException
    //   242	267	385	org/json/JSONException
    //   272	282	385	org/json/JSONException
    //   285	341	385	org/json/JSONException
    //   214	223	390	org/json/JSONException
    //   182	209	398	org/json/JSONException
    //   157	166	406	org/json/JSONException
    //   64	106	411	org/json/JSONException
    //   118	123	411	org/json/JSONException
    //   126	153	411	org/json/JSONException
    //   440	451	454	org/json/JSONException
    //   9	18	465	finally
    //   23	33	465	finally
    //   33	42	465	finally
    //   45	50	465	finally
    //   64	106	465	finally
    //   106	115	465	finally
    //   118	123	465	finally
    //   126	153	465	finally
    //   157	166	465	finally
    //   182	209	465	finally
    //   214	223	465	finally
    //   242	267	465	finally
    //   272	282	465	finally
    //   285	341	465	finally
    //   341	369	465	finally
    //   421	426	465	finally
    //   436	439	465	finally
    //   440	451	465	finally
    //   456	461	465	finally
    //   461	464	465	finally
    //   467	470	465	finally
  }
  
  private void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  private boolean a()
  {
    return this.f;
  }
  
  private boolean a(String paramString)
  {
    return paramString.getBytes().length + ch.a().b() + this.g > 204800;
  }
  
  private void b(Context paramContext)
  {
    synchronized (this.d)
    {
      this.d = new JSONArray();
      synchronized (this.c)
      {
        this.c = new JSONArray();
        synchronized (this.e)
        {
          this.e = new JSONArray();
          flush(paramContext);
          return;
        }
      }
    }
  }
  
  public static DataCore instance()
  {
    return b;
  }
  
  public void clearCache(Context paramContext)
  {
    a(false);
    synchronized (a)
    {
      a = new JSONObject();
      installHeader(paramContext);
      b(paramContext);
      return;
    }
  }
  
  /* Error */
  public String constructLogWithEmptyBody(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 22	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 25	org/json/JSONObject:<init>	()V
    //   7: astore_3
    //   8: new 22	org/json/JSONObject
    //   11: dup
    //   12: invokespecial 25	org/json/JSONObject:<init>	()V
    //   15: astore 4
    //   17: invokestatic 53	com/baidu/mobstat/CooperService:a	()Lcom/baidu/mobstat/CooperService;
    //   20: invokevirtual 216	com/baidu/mobstat/CooperService:getHeadObject	()Lcom/baidu/mobstat/bu;
    //   23: astore 5
    //   25: aload 5
    //   27: getfield 221	com/baidu/mobstat/bu:f	Ljava/lang/String;
    //   30: invokestatic 227	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   33: ifeq +14 -> 47
    //   36: aload 5
    //   38: aload_1
    //   39: aload 4
    //   41: invokevirtual 230	com/baidu/mobstat/bu:a	(Landroid/content/Context;Lorg/json/JSONObject;)V
    //   44: goto +11 -> 55
    //   47: aload 5
    //   49: aload_1
    //   50: aload 4
    //   52: invokevirtual 232	com/baidu/mobstat/bu:b	(Landroid/content/Context;Lorg/json/JSONObject;)V
    //   55: new 33	org/json/JSONArray
    //   58: dup
    //   59: invokespecial 34	org/json/JSONArray:<init>	()V
    //   62: astore 6
    //   64: invokestatic 238	java/lang/System:currentTimeMillis	()J
    //   67: lstore 7
    //   69: aload 4
    //   71: ldc 126
    //   73: lload 7
    //   75: invokevirtual 241	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   78: pop
    //   79: aload 4
    //   81: ldc -13
    //   83: lload 7
    //   85: invokevirtual 241	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   88: pop
    //   89: aload 4
    //   91: ldc -11
    //   93: aload 6
    //   95: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   98: pop
    //   99: aload 4
    //   101: ldc -9
    //   103: iconst_0
    //   104: invokevirtual 182	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   107: pop
    //   108: aload 4
    //   110: ldc -7
    //   112: invokestatic 53	com/baidu/mobstat/CooperService:a	()Lcom/baidu/mobstat/CooperService;
    //   115: invokevirtual 252	com/baidu/mobstat/CooperService:getUUID	()Ljava/lang/String;
    //   118: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   121: pop
    //   122: aload 4
    //   124: ldc -2
    //   126: aload_2
    //   127: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   130: pop
    //   131: aload_3
    //   132: ldc_w 256
    //   135: aload 4
    //   137: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   140: pop
    //   141: aload_3
    //   142: ldc_w 258
    //   145: aload 6
    //   147: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   150: pop
    //   151: aload_3
    //   152: ldc_w 260
    //   155: aload 6
    //   157: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   160: pop
    //   161: aload_3
    //   162: ldc_w 262
    //   165: aload 6
    //   167: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   170: pop
    //   171: aload_3
    //   172: invokevirtual 263	org/json/JSONObject:toString	()Ljava/lang/String;
    //   175: areturn
    //   176: astore 21
    //   178: aload 21
    //   180: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   183: aconst_null
    //   184: areturn
    //   185: astore 19
    //   187: aload 19
    //   189: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   192: aconst_null
    //   193: areturn
    //   194: astore 17
    //   196: aload 17
    //   198: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   201: aconst_null
    //   202: areturn
    //   203: astore 9
    //   205: aload 9
    //   207: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   210: aconst_null
    //   211: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	DataCore
    //   0	212	1	paramContext	Context
    //   0	212	2	paramString	String
    //   7	165	3	localJSONObject1	JSONObject
    //   15	121	4	localJSONObject2	JSONObject
    //   23	25	5	localbu	bu
    //   62	104	6	localJSONArray	JSONArray
    //   67	17	7	l	long
    //   203	3	9	localException	Exception
    //   194	3	17	localJSONException1	JSONException
    //   185	3	19	localJSONException2	JSONException
    //   176	3	21	localJSONException3	JSONException
    // Exception table:
    //   from	to	target	type
    //   161	171	176	org/json/JSONException
    //   151	161	185	org/json/JSONException
    //   141	151	194	org/json/JSONException
    //   69	141	203	java/lang/Exception
  }
  
  /* Error */
  public void flush(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 22	org/json/JSONObject
    //   5: dup
    //   6: invokespecial 25	org/json/JSONObject:<init>	()V
    //   9: astore_2
    //   10: aload_0
    //   11: getfield 36	com/baidu/mobstat/DataCore:c	Lorg/json/JSONArray;
    //   14: astore 21
    //   16: aload 21
    //   18: monitorenter
    //   19: aload_2
    //   20: ldc_w 258
    //   23: new 33	org/json/JSONArray
    //   26: dup
    //   27: aload_0
    //   28: getfield 36	com/baidu/mobstat/DataCore:c	Lorg/json/JSONArray;
    //   31: invokevirtual 264	org/json/JSONArray:toString	()Ljava/lang/String;
    //   34: invokespecial 266	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   37: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   40: pop
    //   41: aload 21
    //   43: monitorexit
    //   44: aload_0
    //   45: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   48: astore 24
    //   50: aload 24
    //   52: monitorenter
    //   53: aload_2
    //   54: ldc_w 260
    //   57: new 33	org/json/JSONArray
    //   60: dup
    //   61: aload_0
    //   62: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   65: invokevirtual 264	org/json/JSONArray:toString	()Ljava/lang/String;
    //   68: invokespecial 266	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   71: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   74: pop
    //   75: aload 24
    //   77: monitorexit
    //   78: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   81: astore 27
    //   83: aload 27
    //   85: monitorenter
    //   86: aload_2
    //   87: ldc_w 256
    //   90: new 22	org/json/JSONObject
    //   93: dup
    //   94: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   97: invokevirtual 263	org/json/JSONObject:toString	()Ljava/lang/String;
    //   100: invokespecial 267	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   103: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   106: pop
    //   107: aload 27
    //   109: monitorexit
    //   110: goto +33 -> 143
    //   113: astore 28
    //   115: aload 27
    //   117: monitorexit
    //   118: aload 28
    //   120: athrow
    //   121: astore 25
    //   123: aload 24
    //   125: monitorexit
    //   126: aload 25
    //   128: athrow
    //   129: astore 22
    //   131: aload 21
    //   133: monitorexit
    //   134: aload 22
    //   136: athrow
    //   137: ldc_w 269
    //   140: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   143: aload_2
    //   144: invokevirtual 263	org/json/JSONObject:toString	()Ljava/lang/String;
    //   147: astore 4
    //   149: aload_0
    //   150: invokespecial 271	com/baidu/mobstat/DataCore:a	()Z
    //   153: ifeq +12 -> 165
    //   156: ldc_w 273
    //   159: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   162: aload_0
    //   163: monitorexit
    //   164: return
    //   165: aload 4
    //   167: invokevirtual 193	java/lang/String:getBytes	()[B
    //   170: arraylength
    //   171: istore 5
    //   173: iload 5
    //   175: ldc -60
    //   177: if_icmplt +11 -> 188
    //   180: aload_0
    //   181: iconst_1
    //   182: invokespecial 203	com/baidu/mobstat/DataCore:a	(Z)V
    //   185: aload_0
    //   186: monitorexit
    //   187: return
    //   188: aload_0
    //   189: iload 5
    //   191: putfield 44	com/baidu/mobstat/DataCore:g	I
    //   194: new 161	java/lang/StringBuilder
    //   197: dup
    //   198: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   201: astore 6
    //   203: aload 6
    //   205: ldc_w 275
    //   208: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: aload 6
    //   214: aload_0
    //   215: getfield 44	com/baidu/mobstat/DataCore:g	I
    //   218: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: aload 6
    //   224: ldc_w 280
    //   227: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: aload 6
    //   233: ldc -60
    //   235: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   238: pop
    //   239: aload 6
    //   241: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   247: aload_1
    //   248: invokestatic 286	com/baidu/mobstat/dc:q	(Landroid/content/Context;)Ljava/lang/String;
    //   251: astore 11
    //   253: new 161	java/lang/StringBuilder
    //   256: dup
    //   257: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   260: astore 12
    //   262: aload 12
    //   264: aload 11
    //   266: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: pop
    //   270: aload 12
    //   272: ldc_w 288
    //   275: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: aload_1
    //   280: aload 12
    //   282: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: aload 4
    //   287: iconst_0
    //   288: invokestatic 293	com/baidu/mobstat/cs:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    //   291: aload_0
    //   292: getfield 40	com/baidu/mobstat/DataCore:e	Lorg/json/JSONArray;
    //   295: astore 15
    //   297: aload 15
    //   299: monitorenter
    //   300: aload_0
    //   301: getfield 40	com/baidu/mobstat/DataCore:e	Lorg/json/JSONArray;
    //   304: invokevirtual 264	org/json/JSONArray:toString	()Ljava/lang/String;
    //   307: astore 17
    //   309: new 161	java/lang/StringBuilder
    //   312: dup
    //   313: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   316: astore 18
    //   318: aload 18
    //   320: ldc_w 295
    //   323: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: aload 18
    //   329: aload 17
    //   331: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload 18
    //   337: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   340: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   343: aload_1
    //   344: ldc_w 297
    //   347: aload 17
    //   349: iconst_0
    //   350: invokestatic 293	com/baidu/mobstat/cs:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    //   353: aload 15
    //   355: monitorexit
    //   356: aload_0
    //   357: monitorexit
    //   358: return
    //   359: astore 16
    //   361: aload 15
    //   363: monitorexit
    //   364: aload 16
    //   366: athrow
    //   367: astore_3
    //   368: aload_0
    //   369: monitorexit
    //   370: aload_3
    //   371: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	372	0	this	DataCore
    //   0	372	1	paramContext	Context
    //   9	135	2	localJSONObject1	JSONObject
    //   367	4	3	localObject1	Object
    //   147	139	4	str1	String
    //   171	19	5	i	int
    //   201	39	6	localStringBuilder1	StringBuilder
    //   251	14	11	str2	String
    //   260	21	12	localStringBuilder2	StringBuilder
    //   359	6	16	localObject2	Object
    //   307	41	17	str3	String
    //   316	20	18	localStringBuilder3	StringBuilder
    //   137	1	19	localException	Exception
    //   129	6	22	localObject3	Object
    //   121	6	25	localObject4	Object
    //   113	6	28	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   86	110	113	finally
    //   115	118	113	finally
    //   53	78	121	finally
    //   123	126	121	finally
    //   19	44	129	finally
    //   131	134	129	finally
    //   10	19	137	java/lang/Exception
    //   44	53	137	java/lang/Exception
    //   78	86	137	java/lang/Exception
    //   118	121	137	java/lang/Exception
    //   126	129	137	java/lang/Exception
    //   134	137	137	java/lang/Exception
    //   300	356	359	finally
    //   361	364	359	finally
    //   2	10	367	finally
    //   10	19	367	finally
    //   44	53	367	finally
    //   78	86	367	finally
    //   118	121	367	finally
    //   126	129	367	finally
    //   134	137	367	finally
    //   137	143	367	finally
    //   143	162	367	finally
    //   165	173	367	finally
    //   180	185	367	finally
    //   188	300	367	finally
    //   364	367	367	finally
  }
  
  public int getCacheFileSzie()
  {
    return this.g;
  }
  
  public void installHeader(Context paramContext)
  {
    synchronized (a)
    {
      CooperService.a().getHeadObject().a(paramContext, a);
      return;
    }
  }
  
  public boolean isPartEmpty()
  {
    for (;;)
    {
      synchronized (this.c)
      {
        if (this.c.length() == 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public void loadLastSession(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    String str1 = dc.q(paramContext);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append("__local_last_session.json");
    String str2 = localStringBuilder.toString();
    if (!cs.c(paramContext, str2)) {
      return;
    }
    String str3 = cs.a(paramContext, str2);
    if (TextUtils.isEmpty(str3))
    {
      cz.a("loadLastSession(): last_session.json file not found.");
      return;
    }
    cs.a(paramContext, str2, new JSONObject().toString(), false);
    putSession(str3);
    flush(paramContext);
  }
  
  /* Error */
  public void loadStatData(Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_1
    //   6: invokestatic 286	com/baidu/mobstat/dc:q	(Landroid/content/Context;)Ljava/lang/String;
    //   9: astore_2
    //   10: new 161	java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   17: astore_3
    //   18: aload_3
    //   19: aload_2
    //   20: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload_3
    //   25: ldc_w 288
    //   28: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_3
    //   33: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: astore 6
    //   38: aload_1
    //   39: aload 6
    //   41: invokestatic 305	com/baidu/mobstat/cs:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   44: ifne +4 -> 48
    //   47: return
    //   48: aload_1
    //   49: aload 6
    //   51: invokestatic 307	com/baidu/mobstat/cs:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   54: astore 7
    //   56: aload 7
    //   58: ldc 96
    //   60: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   63: ifeq +10 -> 73
    //   66: ldc_w 315
    //   69: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   72: return
    //   73: ldc_w 317
    //   76: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   79: aload_0
    //   80: aload 7
    //   82: invokevirtual 193	java/lang/String:getBytes	()[B
    //   85: arraylength
    //   86: putfield 44	com/baidu/mobstat/DataCore:g	I
    //   89: new 161	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   96: astore 12
    //   98: aload 12
    //   100: ldc_w 319
    //   103: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload 12
    //   109: aload_0
    //   110: getfield 44	com/baidu/mobstat/DataCore:g	I
    //   113: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload 12
    //   119: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   125: new 22	org/json/JSONObject
    //   128: dup
    //   129: aload 7
    //   131: invokespecial 267	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   134: astore 15
    //   136: new 161	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   143: astore 16
    //   145: aload 16
    //   147: ldc_w 321
    //   150: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload 16
    //   156: aload 7
    //   158: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload 16
    //   164: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   170: invokestatic 238	java/lang/System:currentTimeMillis	()J
    //   173: lstore 19
    //   175: aload 15
    //   177: ldc_w 258
    //   180: invokevirtual 325	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   183: astore 21
    //   185: iconst_0
    //   186: istore 22
    //   188: iconst_0
    //   189: istore 23
    //   191: iload 23
    //   193: aload 21
    //   195: invokevirtual 94	org/json/JSONArray:length	()I
    //   198: if_icmpge +41 -> 239
    //   201: aload 21
    //   203: iload 23
    //   205: invokevirtual 116	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   208: astore 31
    //   210: lload 19
    //   212: aload 31
    //   214: ldc 104
    //   216: invokevirtual 130	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   219: lsub
    //   220: ldc2_w 326
    //   223: lcmp
    //   224: ifle +6 -> 230
    //   227: goto +163 -> 390
    //   230: aload_0
    //   231: aload 31
    //   233: invokevirtual 330	com/baidu/mobstat/DataCore:putSession	(Lorg/json/JSONObject;)V
    //   236: goto +154 -> 390
    //   239: aload 15
    //   241: ldc_w 260
    //   244: invokevirtual 325	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   247: astore 24
    //   249: iload 22
    //   251: aload 24
    //   253: invokevirtual 94	org/json/JSONArray:length	()I
    //   256: if_icmpge +43 -> 299
    //   259: aload 24
    //   261: iload 22
    //   263: invokevirtual 116	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   266: astore 30
    //   268: lload 19
    //   270: aload 30
    //   272: ldc 126
    //   274: invokevirtual 130	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   277: lsub
    //   278: ldc2_w 326
    //   281: lcmp
    //   282: ifle +6 -> 288
    //   285: goto +111 -> 396
    //   288: aload_0
    //   289: aload_1
    //   290: aload 30
    //   292: iconst_1
    //   293: invokevirtual 334	com/baidu/mobstat/DataCore:putEvent	(Landroid/content/Context;Lorg/json/JSONObject;Z)V
    //   296: goto +100 -> 396
    //   299: aload_0
    //   300: invokevirtual 336	com/baidu/mobstat/DataCore:isPartEmpty	()Z
    //   303: istore 25
    //   305: iload 25
    //   307: ifne +82 -> 389
    //   310: aload 15
    //   312: ldc_w 256
    //   315: invokevirtual 339	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   318: astore 27
    //   320: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   323: astore 28
    //   325: aload 28
    //   327: monitorenter
    //   328: aload 27
    //   330: putstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   333: aload 28
    //   335: monitorexit
    //   336: return
    //   337: astore 29
    //   339: aload 28
    //   341: monitorexit
    //   342: aload 29
    //   344: athrow
    //   345: astore 26
    //   347: aload 26
    //   349: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   352: return
    //   353: astore 8
    //   355: new 161	java/lang/StringBuilder
    //   358: dup
    //   359: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   362: astore 9
    //   364: aload 9
    //   366: ldc_w 341
    //   369: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: pop
    //   373: aload 9
    //   375: aload 8
    //   377: invokevirtual 344	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload 9
    //   383: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   386: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   389: return
    //   390: iinc 23 1
    //   393: goto -202 -> 191
    //   396: iinc 22 1
    //   399: goto -150 -> 249
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	402	0	this	DataCore
    //   0	402	1	paramContext	Context
    //   9	11	2	str1	String
    //   17	16	3	localStringBuilder1	StringBuilder
    //   36	14	6	str2	String
    //   54	103	7	str3	String
    //   353	23	8	localJSONException1	JSONException
    //   362	20	9	localStringBuilder2	StringBuilder
    //   96	22	12	localStringBuilder3	StringBuilder
    //   134	177	15	localJSONObject1	JSONObject
    //   143	20	16	localStringBuilder4	StringBuilder
    //   173	96	19	l	long
    //   183	19	21	localJSONArray1	JSONArray
    //   186	211	22	i	int
    //   189	202	23	j	int
    //   247	13	24	localJSONArray2	JSONArray
    //   303	3	25	bool	boolean
    //   345	3	26	localJSONException2	JSONException
    //   318	11	27	localJSONObject2	JSONObject
    //   337	6	29	localObject	Object
    //   266	25	30	localJSONObject4	JSONObject
    //   208	24	31	localJSONObject5	JSONObject
    // Exception table:
    //   from	to	target	type
    //   328	336	337	finally
    //   339	342	337	finally
    //   310	328	345	org/json/JSONException
    //   342	345	345	org/json/JSONException
    //   79	185	353	org/json/JSONException
    //   191	227	353	org/json/JSONException
    //   230	236	353	org/json/JSONException
    //   239	249	353	org/json/JSONException
    //   249	285	353	org/json/JSONException
    //   288	296	353	org/json/JSONException
    //   299	305	353	org/json/JSONException
    //   347	352	353	org/json/JSONException
  }
  
  public void loadWifiData(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    if (!cs.c(paramContext, "__local_ap_info_cache.json")) {
      return;
    }
    String str1 = cs.a(paramContext, "__local_ap_info_cache.json");
    for (;;)
    {
      try
      {
        Object localObject1 = new JSONArray(str1);
        int i = ((JSONArray)localObject1).length();
        JSONArray localJSONArray1;
        if (i >= 10)
        {
          localJSONArray1 = new JSONArray();
          int j = i - 10;
          if (j < i)
          {
            localJSONArray1.put(((JSONArray)localObject1).get(j));
            j++;
            continue;
          }
        }
        else
        {
          String str2 = dc.g(1, paramContext);
          if (!TextUtils.isEmpty(str2)) {
            ((JSONArray)localObject1).put(str2);
          }
          synchronized (this.e)
          {
            this.e = ((JSONArray)localObject1);
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("wifiPart: ");
            localStringBuilder.append(this.e.toString());
            cz.a(localStringBuilder.toString());
            return;
          }
        }
        localObject1 = localJSONArray1;
      }
      catch (JSONException localJSONException)
      {
        cz.b(localJSONException);
        return;
      }
    }
  }
  
  public void putEvent(Context paramContext, String paramString1, String paramString2, int paramInt1, long paramLong1, long paramLong2, String paramString3, String paramString4, int paramInt2, boolean paramBoolean, ExtraInfo paramExtraInfo)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("i", paramString1);
      localJSONObject.put("l", paramString2);
      localJSONObject.put("c", paramInt1);
      localJSONObject.put("t", paramLong1);
      localJSONObject.put("d", paramLong2);
      localJSONObject.put("h", paramString3);
      localJSONObject.put("p", paramString4);
      localJSONObject.put("v", paramInt2);
      localJSONObject.put("at", paramBoolean);
      if ((paramExtraInfo != null) && (paramExtraInfo.dumpToJson().length() != 0)) {
        localJSONObject.put("ext", paramExtraInfo.dumpToJson());
      }
      putEvent(paramContext, localJSONObject, false);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("put event:");
      localStringBuilder.append(localJSONObject.toString());
      cz.a(localStringBuilder.toString());
      return;
    }
    catch (JSONException localJSONException)
    {
      cz.a(localJSONException);
    }
  }
  
  /* Error */
  public void putEvent(Context paramContext, JSONObject paramJSONObject, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: aload_2
    //   7: invokevirtual 263	org/json/JSONObject:toString	()Ljava/lang/String;
    //   10: invokespecial 373	com/baidu/mobstat/DataCore:a	(Ljava/lang/String;)Z
    //   13: ifeq +10 -> 23
    //   16: ldc_w 375
    //   19: invokestatic 377	com/baidu/mobstat/cz:b	(Ljava/lang/String;)V
    //   22: return
    //   23: aload_2
    //   24: ldc 118
    //   26: invokevirtual 122	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   29: astore 5
    //   31: aload_2
    //   32: ldc 124
    //   34: invokevirtual 122	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   37: astore 6
    //   39: aload_2
    //   40: ldc 126
    //   42: invokevirtual 130	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   45: ldc2_w 131
    //   48: ldiv
    //   49: lstore 7
    //   51: aload_2
    //   52: ldc 104
    //   54: invokevirtual 143	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   57: astore 9
    //   59: aload_2
    //   60: ldc -116
    //   62: invokevirtual 143	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   65: astore 10
    //   67: aload_2
    //   68: ldc -111
    //   70: invokevirtual 143	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   73: astore 11
    //   75: aload_2
    //   76: ldc -109
    //   78: invokevirtual 150	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   81: istore 12
    //   83: aload_2
    //   84: ldc -104
    //   86: invokevirtual 155	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   89: istore 13
    //   91: aload_2
    //   92: ldc_w 369
    //   95: invokevirtual 143	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   98: astore 14
    //   100: aload_2
    //   101: ldc -123
    //   103: invokevirtual 137	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   106: istore 15
    //   108: goto +11 -> 119
    //   111: ldc -117
    //   113: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   116: iconst_0
    //   117: istore 15
    //   119: aload 14
    //   121: invokestatic 227	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   124: istore 16
    //   126: iconst_0
    //   127: istore 17
    //   129: iload 16
    //   131: ifne +31 -> 162
    //   134: new 22	org/json/JSONObject
    //   137: dup
    //   138: invokespecial 25	org/json/JSONObject:<init>	()V
    //   141: invokevirtual 263	org/json/JSONObject:toString	()Ljava/lang/String;
    //   144: aload 14
    //   146: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   149: istore 24
    //   151: iconst_0
    //   152: istore 17
    //   154: iload 24
    //   156: ifne +6 -> 162
    //   159: iconst_1
    //   160: istore 17
    //   162: iload 15
    //   164: ifne +30 -> 194
    //   167: iload 17
    //   169: ifne +25 -> 194
    //   172: aload_0
    //   173: aload_2
    //   174: aload 5
    //   176: aload 6
    //   178: aload 9
    //   180: lload 7
    //   182: aload 10
    //   184: aload 11
    //   186: iload 12
    //   188: iload 13
    //   190: invokespecial 379	com/baidu/mobstat/DataCore:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IZ)V
    //   193: return
    //   194: aload_0
    //   195: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   198: astore 18
    //   200: aload 18
    //   202: monitorenter
    //   203: aload_0
    //   204: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   207: invokevirtual 94	org/json/JSONArray:length	()I
    //   210: istore 20
    //   212: aload_2
    //   213: ldc 104
    //   215: ldc_w 381
    //   218: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   221: pop
    //   222: aload_0
    //   223: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   226: iload 20
    //   228: aload_2
    //   229: invokevirtual 188	org/json/JSONArray:put	(ILjava/lang/Object;)Lorg/json/JSONArray;
    //   232: pop
    //   233: goto +10 -> 243
    //   236: astore 21
    //   238: aload 21
    //   240: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   243: aload 18
    //   245: monitorexit
    //   246: return
    //   247: astore 19
    //   249: aload 18
    //   251: monitorexit
    //   252: aload 19
    //   254: athrow
    //   255: astore 4
    //   257: aload 4
    //   259: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   262: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	this	DataCore
    //   0	263	1	paramContext	Context
    //   0	263	2	paramJSONObject	JSONObject
    //   0	263	3	paramBoolean	boolean
    //   255	3	4	localJSONException1	JSONException
    //   29	146	5	str1	String
    //   37	140	6	str2	String
    //   49	132	7	l	long
    //   57	122	9	str3	String
    //   65	118	10	str4	String
    //   73	112	11	str5	String
    //   81	106	12	i	int
    //   89	100	13	bool1	boolean
    //   98	47	14	str6	String
    //   106	57	15	j	int
    //   124	6	16	bool2	boolean
    //   127	41	17	k	int
    //   247	6	19	localObject	Object
    //   210	17	20	m	int
    //   236	3	21	localJSONException2	JSONException
    //   111	1	22	localJSONException3	JSONException
    //   149	6	24	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   100	108	111	org/json/JSONException
    //   212	233	236	org/json/JSONException
    //   203	212	247	finally
    //   212	233	247	finally
    //   238	243	247	finally
    //   243	246	247	finally
    //   249	252	247	finally
    //   23	100	255	org/json/JSONException
  }
  
  public void putSession(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramString.equals(new JSONObject().toString())) {
        return;
      }
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        putSession(localJSONObject);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Load last session:");
        localStringBuilder.append(localJSONObject);
        cz.a(localStringBuilder.toString());
        return;
      }
      catch (JSONException localJSONException)
      {
        cz.a(localJSONException);
      }
    }
  }
  
  public void putSession(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return;
    }
    if (a(paramJSONObject.toString()))
    {
      cz.b("data to put exceed limit, will not put");
      return;
    }
    synchronized (this.c)
    {
      int i = this.c.length();
      try
      {
        this.c.put(i, paramJSONObject);
      }
      catch (JSONException localJSONException)
      {
        cz.a(localJSONException);
      }
      return;
    }
  }
  
  /* Error */
  public void saveLogDataToSend(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 386
    //   3: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   6: invokestatic 53	com/baidu/mobstat/CooperService:a	()Lcom/baidu/mobstat/CooperService;
    //   9: invokevirtual 216	com/baidu/mobstat/CooperService:getHeadObject	()Lcom/baidu/mobstat/bu;
    //   12: astore_2
    //   13: aload_2
    //   14: ifnull +104 -> 118
    //   17: aload_2
    //   18: getfield 221	com/baidu/mobstat/bu:f	Ljava/lang/String;
    //   21: invokestatic 227	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   24: ifeq +94 -> 118
    //   27: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   30: astore 30
    //   32: aload 30
    //   34: monitorenter
    //   35: aload_2
    //   36: aload_1
    //   37: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   40: invokevirtual 230	com/baidu/mobstat/bu:a	(Landroid/content/Context;Lorg/json/JSONObject;)V
    //   43: new 161	java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   50: astore 32
    //   52: aload 32
    //   54: ldc_w 388
    //   57: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload 32
    //   63: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   66: invokevirtual 344	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload 32
    //   72: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   75: invokevirtual 367	org/json/JSONObject:length	()I
    //   78: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload 32
    //   84: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   90: aload 30
    //   92: monitorexit
    //   93: aload_2
    //   94: getfield 221	com/baidu/mobstat/bu:f	Ljava/lang/String;
    //   97: invokestatic 227	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   100: ifeq +18 -> 118
    //   103: ldc_w 390
    //   106: invokestatic 392	com/baidu/mobstat/cz:c	(Ljava/lang/String;)V
    //   109: return
    //   110: astore 31
    //   112: aload 30
    //   114: monitorexit
    //   115: aload 31
    //   117: athrow
    //   118: new 22	org/json/JSONObject
    //   121: dup
    //   122: invokespecial 25	org/json/JSONObject:<init>	()V
    //   125: astore_3
    //   126: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   129: astore 4
    //   131: aload 4
    //   133: monitorenter
    //   134: invokestatic 238	java/lang/System:currentTimeMillis	()J
    //   137: lstore 6
    //   139: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   142: ldc 126
    //   144: lload 6
    //   146: invokevirtual 241	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   149: pop
    //   150: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   153: ldc -13
    //   155: invokestatic 62	com/baidu/mobstat/ch:a	()Lcom/baidu/mobstat/ch;
    //   158: invokevirtual 394	com/baidu/mobstat/ch:g	()J
    //   161: invokevirtual 241	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   164: pop
    //   165: aload_0
    //   166: getfield 40	com/baidu/mobstat/DataCore:e	Lorg/json/JSONArray;
    //   169: astore 11
    //   171: aload 11
    //   173: monitorenter
    //   174: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   177: ldc -11
    //   179: aload_0
    //   180: getfield 40	com/baidu/mobstat/DataCore:e	Lorg/json/JSONArray;
    //   183: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   186: pop
    //   187: aload 11
    //   189: monitorexit
    //   190: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   193: ldc -7
    //   195: invokestatic 53	com/baidu/mobstat/CooperService:a	()Lcom/baidu/mobstat/CooperService;
    //   198: invokevirtual 252	com/baidu/mobstat/CooperService:getUUID	()Ljava/lang/String;
    //   201: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   204: pop
    //   205: aload_3
    //   206: ldc_w 256
    //   209: getstatic 27	com/baidu/mobstat/DataCore:a	Lorg/json/JSONObject;
    //   212: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   215: pop
    //   216: aload_0
    //   217: getfield 36	com/baidu/mobstat/DataCore:c	Lorg/json/JSONArray;
    //   220: astore 16
    //   222: aload 16
    //   224: monitorenter
    //   225: aload_3
    //   226: ldc_w 258
    //   229: aload_0
    //   230: getfield 36	com/baidu/mobstat/DataCore:c	Lorg/json/JSONArray;
    //   233: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   236: pop
    //   237: aload_0
    //   238: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   241: astore 20
    //   243: aload 20
    //   245: monitorenter
    //   246: aload_3
    //   247: ldc_w 260
    //   250: aload_0
    //   251: getfield 38	com/baidu/mobstat/DataCore:d	Lorg/json/JSONArray;
    //   254: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   257: pop
    //   258: aload_3
    //   259: ldc_w 262
    //   262: new 33	org/json/JSONArray
    //   265: dup
    //   266: invokespecial 34	org/json/JSONArray:<init>	()V
    //   269: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   272: pop
    //   273: aload_3
    //   274: invokevirtual 263	org/json/JSONObject:toString	()Ljava/lang/String;
    //   277: astore 26
    //   279: new 161	java/lang/StringBuilder
    //   282: dup
    //   283: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   286: astore 27
    //   288: aload 27
    //   290: ldc_w 396
    //   293: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: pop
    //   297: aload 27
    //   299: aload 26
    //   301: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: aload 27
    //   307: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: invokestatic 80	com/baidu/mobstat/cz:a	(Ljava/lang/String;)V
    //   313: aload_0
    //   314: aload_1
    //   315: aload 26
    //   317: invokespecial 397	com/baidu/mobstat/DataCore:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   320: aload_0
    //   321: aload_1
    //   322: invokespecial 399	com/baidu/mobstat/DataCore:a	(Landroid/content/Context;)V
    //   325: aload 20
    //   327: monitorexit
    //   328: aload 16
    //   330: monitorexit
    //   331: aload 4
    //   333: monitorexit
    //   334: return
    //   335: astore 24
    //   337: aload 24
    //   339: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   342: aload 20
    //   344: monitorexit
    //   345: aload 16
    //   347: monitorexit
    //   348: aload 4
    //   350: monitorexit
    //   351: return
    //   352: astore 22
    //   354: goto +20 -> 374
    //   357: astore 21
    //   359: aload 21
    //   361: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   364: aload 20
    //   366: monitorexit
    //   367: aload 16
    //   369: monitorexit
    //   370: aload 4
    //   372: monitorexit
    //   373: return
    //   374: aload 20
    //   376: monitorexit
    //   377: aload 22
    //   379: athrow
    //   380: astore 17
    //   382: aload 17
    //   384: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   387: aload 16
    //   389: monitorexit
    //   390: aload 4
    //   392: monitorexit
    //   393: return
    //   394: aload 16
    //   396: monitorexit
    //   397: aload 18
    //   399: athrow
    //   400: astore 12
    //   402: aload 11
    //   404: monitorexit
    //   405: aload 12
    //   407: athrow
    //   408: astore 8
    //   410: aload 8
    //   412: invokestatic 185	com/baidu/mobstat/cz:a	(Ljava/lang/Throwable;)V
    //   415: aload 4
    //   417: monitorexit
    //   418: return
    //   419: astore 5
    //   421: aload 4
    //   423: monitorexit
    //   424: aload 5
    //   426: athrow
    //   427: astore 18
    //   429: goto -35 -> 394
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	432	0	this	DataCore
    //   0	432	1	paramContext	Context
    //   12	82	2	localbu	bu
    //   125	149	3	localJSONObject1	JSONObject
    //   129	293	4	localJSONObject2	JSONObject
    //   419	6	5	localObject1	Object
    //   137	8	6	l	long
    //   408	3	8	localException	Exception
    //   400	6	12	localObject2	Object
    //   380	3	17	localJSONException1	JSONException
    //   397	1	18	localObject3	Object
    //   427	1	18	localObject4	Object
    //   357	3	21	localJSONException2	JSONException
    //   352	26	22	localObject5	Object
    //   335	3	24	localJSONException3	JSONException
    //   277	39	26	str	String
    //   286	20	27	localStringBuilder1	StringBuilder
    //   30	83	30	localJSONObject3	JSONObject
    //   110	6	31	localObject6	Object
    //   50	33	32	localStringBuilder2	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   35	93	110	finally
    //   112	115	110	finally
    //   258	273	335	org/json/JSONException
    //   246	258	352	finally
    //   258	273	352	finally
    //   273	328	352	finally
    //   337	345	352	finally
    //   359	367	352	finally
    //   374	377	352	finally
    //   246	258	357	org/json/JSONException
    //   225	237	380	org/json/JSONException
    //   174	190	400	finally
    //   402	405	400	finally
    //   139	174	408	java/lang/Exception
    //   190	216	408	java/lang/Exception
    //   405	408	408	java/lang/Exception
    //   134	139	419	finally
    //   139	174	419	finally
    //   190	216	419	finally
    //   216	225	419	finally
    //   331	334	419	finally
    //   348	351	419	finally
    //   370	373	419	finally
    //   390	393	419	finally
    //   397	400	419	finally
    //   405	408	419	finally
    //   410	418	419	finally
    //   421	424	419	finally
    //   225	237	427	finally
    //   237	246	427	finally
    //   328	331	427	finally
    //   345	348	427	finally
    //   367	370	427	finally
    //   377	380	427	finally
    //   382	390	427	finally
    //   394	397	427	finally
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\DataCore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */