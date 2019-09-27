package com.android.cglib.dx.c.d;

import java.util.HashMap;

public final class c
  implements d, Comparable<c>
{
  public static final c A = a("Ljava/lang/Void;");
  public static final c B = a.l();
  public static final c C = b.l();
  public static final c D = c.l();
  public static final c E = d.l();
  public static final c F = e.l();
  public static final c G = f.l();
  public static final c H = g.l();
  public static final c I = o.l();
  public static final c J = h.l();
  private static final HashMap<String, c> K = new HashMap(500);
  public static final c a = new c("Z", 1);
  public static final c b = new c("B", 2);
  public static final c c = new c("C", 3);
  public static final c d = new c("D", 4);
  public static final c e = new c("F", 5);
  public static final c f = new c("I", 6);
  public static final c g = new c("J", 7);
  public static final c h = new c("S", 8);
  public static final c i = new c("V", 0);
  public static final c j = new c("<null>", 9);
  public static final c k = new c("<addr>", 10);
  public static final c l;
  public static final c m;
  public static final c n;
  public static final c o;
  public static final c p;
  public static final c q;
  public static final c r;
  public static final c s;
  public static final c t;
  public static final c u;
  public static final c v;
  public static final c w;
  public static final c x;
  public static final c y;
  public static final c z;
  private final String L;
  private final int M;
  private final int N;
  private String O;
  private c P;
  private c Q;
  private c R;
  
  static
  {
    b(a);
    b(b);
    b(c);
    b(d);
    b(e);
    b(f);
    b(g);
    b(h);
    l = a("Ljava/lang/annotation/Annotation;");
    m = a("Ljava/lang/Class;");
    n = a("Ljava/lang/Cloneable;");
    o = a("Ljava/lang/Object;");
    p = a("Ljava/io/Serializable;");
    q = a("Ljava/lang/String;");
    r = a("Ljava/lang/Throwable;");
    s = a("Ljava/lang/Boolean;");
    t = a("Ljava/lang/Byte;");
    u = a("Ljava/lang/Character;");
    v = a("Ljava/lang/Double;");
    w = a("Ljava/lang/Float;");
    x = a("Ljava/lang/Integer;");
    y = a("Ljava/lang/Long;");
    z = a("Ljava/lang/Short;");
  }
  
  private c(String paramString, int paramInt)
  {
    this(paramString, paramInt, -1);
  }
  
  private c(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      throw new NullPointerException("descriptor == null");
    }
    if ((paramInt1 >= 0) && (paramInt1 < 11))
    {
      if (paramInt2 < -1) {
        throw new IllegalArgumentException("newAt < -1");
      }
      this.L = paramString;
      this.M = paramInt1;
      this.N = paramInt2;
      this.P = null;
      this.Q = null;
      this.R = null;
      return;
    }
    throw new IllegalArgumentException("bad basicType");
  }
  
  /* Error */
  public static c a(String paramString)
  {
    // Byte code:
    //   0: getstatic 67	com/android/cglib/dx/c/d/c:K	Ljava/util/HashMap;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: getstatic 67	com/android/cglib/dx/c/d/c:K	Ljava/util/HashMap;
    //   9: aload_0
    //   10: invokevirtual 235	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   13: checkcast 2	com/android/cglib/dx/c/d/c
    //   16: astore_3
    //   17: aload_1
    //   18: monitorexit
    //   19: aload_3
    //   20: ifnull +5 -> 25
    //   23: aload_3
    //   24: areturn
    //   25: aload_0
    //   26: iconst_0
    //   27: invokevirtual 241	java/lang/String:charAt	(I)C
    //   30: istore 4
    //   32: iload 4
    //   34: bipush 91
    //   36: if_icmpne +15 -> 51
    //   39: aload_0
    //   40: iconst_1
    //   41: invokevirtual 245	java/lang/String:substring	(I)Ljava/lang/String;
    //   44: invokestatic 116	com/android/cglib/dx/c/d/c:a	(Ljava/lang/String;)Lcom/android/cglib/dx/c/d/c;
    //   47: invokevirtual 180	com/android/cglib/dx/c/d/c:l	()Lcom/android/cglib/dx/c/d/c;
    //   50: areturn
    //   51: aload_0
    //   52: invokevirtual 249	java/lang/String:length	()I
    //   55: istore 5
    //   57: iload 4
    //   59: bipush 76
    //   61: if_icmpne +222 -> 283
    //   64: iload 5
    //   66: iconst_1
    //   67: isub
    //   68: istore 9
    //   70: aload_0
    //   71: iload 9
    //   73: invokevirtual 241	java/lang/String:charAt	(I)C
    //   76: bipush 59
    //   78: if_icmpeq +6 -> 84
    //   81: goto +202 -> 283
    //   84: iconst_1
    //   85: istore 10
    //   87: iload 10
    //   89: iload 9
    //   91: if_icmpge +178 -> 269
    //   94: aload_0
    //   95: iload 10
    //   97: invokevirtual 241	java/lang/String:charAt	(I)C
    //   100: lookupswitch	default:+60->160, 40:+126->226, 41:+126->226, 46:+126->226, 47:+63->163, 59:+126->226, 91:+126->226
    //   160: goto +103 -> 263
    //   163: iload 10
    //   165: iconst_1
    //   166: if_icmpeq +23 -> 189
    //   169: iload 10
    //   171: iload 9
    //   173: if_icmpeq +16 -> 189
    //   176: aload_0
    //   177: iload 10
    //   179: iconst_1
    //   180: isub
    //   181: invokevirtual 241	java/lang/String:charAt	(I)C
    //   184: bipush 47
    //   186: if_icmpne +77 -> 263
    //   189: new 251	java/lang/StringBuilder
    //   192: dup
    //   193: invokespecial 252	java/lang/StringBuilder:<init>	()V
    //   196: astore 14
    //   198: aload 14
    //   200: ldc -2
    //   202: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload 14
    //   208: aload_0
    //   209: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: new 212	java/lang/IllegalArgumentException
    //   216: dup
    //   217: aload 14
    //   219: invokevirtual 262	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: invokespecial 215	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   225: athrow
    //   226: new 251	java/lang/StringBuilder
    //   229: dup
    //   230: invokespecial 252	java/lang/StringBuilder:<init>	()V
    //   233: astore 11
    //   235: aload 11
    //   237: ldc -2
    //   239: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: aload 11
    //   245: aload_0
    //   246: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: pop
    //   250: new 212	java/lang/IllegalArgumentException
    //   253: dup
    //   254: aload 11
    //   256: invokevirtual 262	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   259: invokespecial 215	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   262: athrow
    //   263: iinc 10 1
    //   266: goto -179 -> 87
    //   269: new 2	com/android/cglib/dx/c/d/c
    //   272: dup
    //   273: aload_0
    //   274: bipush 9
    //   276: invokespecial 72	com/android/cglib/dx/c/d/c:<init>	(Ljava/lang/String;I)V
    //   279: invokestatic 111	com/android/cglib/dx/c/d/c:b	(Lcom/android/cglib/dx/c/d/c;)Lcom/android/cglib/dx/c/d/c;
    //   282: areturn
    //   283: new 251	java/lang/StringBuilder
    //   286: dup
    //   287: invokespecial 252	java/lang/StringBuilder:<init>	()V
    //   290: astore 6
    //   292: aload 6
    //   294: ldc -2
    //   296: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: aload 6
    //   302: aload_0
    //   303: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: new 212	java/lang/IllegalArgumentException
    //   310: dup
    //   311: aload 6
    //   313: invokevirtual 262	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokespecial 215	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   319: athrow
    //   320: new 205	java/lang/NullPointerException
    //   323: dup
    //   324: ldc -49
    //   326: invokespecial 210	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   329: athrow
    //   330: new 212	java/lang/IllegalArgumentException
    //   333: dup
    //   334: ldc_w 264
    //   337: invokespecial 215	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   340: athrow
    //   341: astore_2
    //   342: aload_1
    //   343: monitorexit
    //   344: aload_2
    //   345: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	paramString	String
    //   3	340	1	localHashMap	HashMap
    //   341	4	2	localObject	Object
    //   16	8	3	localc	c
    //   30	32	4	i1	int
    //   55	13	5	i2	int
    //   290	22	6	localStringBuilder1	StringBuilder
    //   68	106	9	i3	int
    //   85	179	10	i4	int
    //   233	22	11	localStringBuilder2	StringBuilder
    //   320	1	11	localNullPointerException	NullPointerException
    //   330	1	12	localIndexOutOfBoundsException	IndexOutOfBoundsException
    //   196	22	14	localStringBuilder3	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   25	32	320	java/lang/NullPointerException
    //   25	32	330	java/lang/IndexOutOfBoundsException
    //   6	19	341	finally
    //   342	344	341	finally
  }
  
  private static c b(c paramc)
  {
    synchronized (K)
    {
      String str = paramc.e();
      c localc = (c)K.get(str);
      if (localc != null) {
        return localc;
      }
      K.put(str, paramc);
      return paramc;
    }
  }
  
  /* Error */
  public static c b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 98
    //   3: invokevirtual 274	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   6: ifeq +9 -> 15
    //   9: getstatic 100	com/android/cglib/dx/c/d/c:i	Lcom/android/cglib/dx/c/d/c;
    //   12: astore_1
    //   13: aload_1
    //   14: areturn
    //   15: aload_0
    //   16: invokestatic 116	com/android/cglib/dx/c/d/c:a	(Ljava/lang/String;)Lcom/android/cglib/dx/c/d/c;
    //   19: areturn
    //   20: new 205	java/lang/NullPointerException
    //   23: dup
    //   24: ldc -49
    //   26: invokespecial 210	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	paramString	String
    //   12	2	1	localc	c
    //   20	1	2	localNullPointerException	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   0	13	20	java/lang/NullPointerException
  }
  
  public int a(c paramc)
  {
    return this.L.compareTo(paramc.L);
  }
  
  public String a_()
  {
    switch (this.M)
    {
    default: 
      return this.L;
    case 9: 
      if (k())
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(m().a_());
        localStringBuilder.append("[]");
        return localStringBuilder.toString();
      }
      return f().replace("/", ".");
    case 8: 
      return "short";
    case 7: 
      return "long";
    case 6: 
      return "int";
    case 5: 
      return "float";
    case 4: 
      return "double";
    case 3: 
      return "char";
    case 2: 
      return "byte";
    case 1: 
      return "boolean";
    }
    return "void";
  }
  
  public c b()
  {
    return this;
  }
  
  public int c()
  {
    return this.M;
  }
  
  public int d()
  {
    int i1 = this.M;
    if ((i1 != 6) && (i1 != 8)) {
      switch (i1)
      {
      default: 
        return this.M;
      }
    }
    return 6;
  }
  
  public String e()
  {
    return this.L;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    return this.L.equals(((c)paramObject).L);
  }
  
  public String f()
  {
    if (this.O == null)
    {
      if (!j())
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("not an object type: ");
        localStringBuilder.append(this.L);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      if (this.L.charAt(0) == '[') {}
      for (String str = this.L;; str = this.L.substring(1, this.L.length() - 1))
      {
        this.O = str;
        break;
      }
    }
    return this.O;
  }
  
  public int g()
  {
    int i1 = this.M;
    if ((i1 != 4) && (i1 != 7)) {
      return 1;
    }
    return 2;
  }
  
  public boolean h()
  {
    int i1 = this.M;
    return (i1 == 4) || (i1 == 7);
  }
  
  public int hashCode()
  {
    return this.L.hashCode();
  }
  
  public boolean i()
  {
    int i1 = this.M;
    if ((i1 != 6) && (i1 != 8)) {
      switch (i1)
      {
      default: 
        return false;
      }
    }
    return true;
  }
  
  public boolean j()
  {
    return this.M == 9;
  }
  
  public boolean k()
  {
    int i1 = this.L.charAt(0);
    boolean bool = false;
    if (i1 == 91) {
      bool = true;
    }
    return bool;
  }
  
  public c l()
  {
    if (this.P == null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append('[');
      localStringBuilder.append(this.L);
      this.P = b(new c(localStringBuilder.toString(), 9));
    }
    return this.P;
  }
  
  public c m()
  {
    if (this.Q == null)
    {
      if (this.L.charAt(0) != '[')
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("not an array type: ");
        localStringBuilder.append(this.L);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      this.Q = a(this.L.substring(1));
    }
    return this.Q;
  }
  
  public String toString()
  {
    return this.L;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\c\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */