package bsh;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class XThis
  extends This
{
  static Class e;
  Hashtable c;
  InvocationHandler d = new Handler();
  
  public XThis(NameSpace paramNameSpace, Interpreter paramInterpreter)
  {
    super(paramNameSpace, paramInterpreter);
  }
  
  static Class b(String paramString)
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
  
  public Object getInterface(Class paramClass)
  {
    return getInterface(new Class[] { paramClass });
  }
  
  public Object getInterface(Class[] paramArrayOfClass)
  {
    if (this.c == null) {
      this.c = new Hashtable();
    }
    int i = 0;
    int j = 21;
    for (;;)
    {
      if (i >= paramArrayOfClass.length)
      {
        Integer localInteger = new Integer(j);
        Object localObject = this.c.get(localInteger);
        if (localObject == null)
        {
          localObject = Proxy.newProxyInstance(paramArrayOfClass[0].getClassLoader(), paramArrayOfClass, this.d);
          this.c.put(localInteger, localObject);
        }
        return localObject;
      }
      j *= (3 + paramArrayOfClass[i].hashCode());
      i++;
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("'this' reference (XThis) to Bsh object: ");
    localStringBuffer.append(this.a);
    return localStringBuffer.toString();
  }
  
  class Handler
    implements Serializable, InvocationHandler
  {
    Handler() {}
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      try
      {
        Object localObject = invokeImpl(paramObject, paramMethod, paramArrayOfObject);
        return localObject;
      }
      catch (EvalError localEvalError)
      {
        if (Interpreter.DEBUG)
        {
          StringBuffer localStringBuffer = new StringBuffer();
          localStringBuffer.append("EvalError in scripted interface: ");
          localStringBuffer.append(XThis.this.toString());
          localStringBuffer.append(": ");
          localStringBuffer.append(localEvalError);
          Interpreter.debug(localStringBuffer.toString());
        }
        throw localEvalError;
      }
      catch (TargetError localTargetError)
      {
        throw localTargetError.getTarget();
      }
    }
    
    /* Error */
    public Object invokeImpl(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      // Byte code:
      //   0: aload_2
      //   1: invokevirtual 68	java/lang/reflect/Method:getName	()Ljava/lang/String;
      //   4: astore 4
      //   6: new 70	bsh/CallStack
      //   9: dup
      //   10: aload_0
      //   11: getfield 17	bsh/XThis$Handler:a	Lbsh/XThis;
      //   14: getfield 73	bsh/XThis:a	Lbsh/NameSpace;
      //   17: invokespecial 76	bsh/CallStack:<init>	(Lbsh/NameSpace;)V
      //   20: pop
      //   21: aconst_null
      //   22: astore 6
      //   24: iconst_1
      //   25: istore 7
      //   27: iconst_0
      //   28: istore 8
      //   30: aload_0
      //   31: getfield 17	bsh/XThis$Handler:a	Lbsh/XThis;
      //   34: getfield 73	bsh/XThis:a	Lbsh/NameSpace;
      //   37: astore 24
      //   39: iload 7
      //   41: anewarray 78	java/lang/Class
      //   44: astore 25
      //   46: getstatic 82	bsh/XThis:e	Ljava/lang/Class;
      //   49: ifnonnull +18 -> 67
      //   52: ldc 84
      //   54: invokestatic 88	bsh/XThis:b	(Ljava/lang/String;)Ljava/lang/Class;
      //   57: astore 26
      //   59: aload 26
      //   61: putstatic 82	bsh/XThis:e	Ljava/lang/Class;
      //   64: goto +8 -> 72
      //   67: getstatic 82	bsh/XThis:e	Ljava/lang/Class;
      //   70: astore 26
      //   72: aload 25
      //   74: iconst_0
      //   75: aload 26
      //   77: aastore
      //   78: aload 24
      //   80: ldc 90
      //   82: aload 25
      //   84: invokevirtual 96	bsh/NameSpace:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;
      //   87: astore 9
      //   89: goto +6 -> 95
      //   92: aconst_null
      //   93: astore 9
      //   95: aload 4
      //   97: ldc 90
      //   99: invokevirtual 101	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   102: ifeq +31 -> 133
      //   105: aload 9
      //   107: ifnonnull +26 -> 133
      //   110: aload_1
      //   111: aload_3
      //   112: iconst_0
      //   113: aaload
      //   114: if_acmpne +6 -> 120
      //   117: goto +6 -> 123
      //   120: iconst_0
      //   121: istore 7
      //   123: new 103	java/lang/Boolean
      //   126: dup
      //   127: iload 7
      //   129: invokespecial 106	java/lang/Boolean:<init>	(Z)V
      //   132: areturn
      //   133: aload_0
      //   134: getfield 17	bsh/XThis$Handler:a	Lbsh/XThis;
      //   137: getfield 73	bsh/XThis:a	Lbsh/NameSpace;
      //   140: ldc 107
      //   142: iconst_0
      //   143: anewarray 78	java/lang/Class
      //   146: invokevirtual 96	bsh/NameSpace:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;
      //   149: astore 23
      //   151: aload 23
      //   153: astore 6
      //   155: goto +4 -> 159
      //   158: pop
      //   159: aload 4
      //   161: ldc 107
      //   163: invokevirtual 101	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   166: ifeq +150 -> 316
      //   169: aload 6
      //   171: ifnonnull +145 -> 316
      //   174: aload_1
      //   175: invokevirtual 111	java/lang/Object:getClass	()Ljava/lang/Class;
      //   178: invokevirtual 115	java/lang/Class:getInterfaces	()[Ljava/lang/Class;
      //   181: astore 12
      //   183: new 34	java/lang/StringBuffer
      //   186: dup
      //   187: invokespecial 35	java/lang/StringBuffer:<init>	()V
      //   190: astore 13
      //   192: aload 13
      //   194: aload_0
      //   195: getfield 17	bsh/XThis$Handler:a	Lbsh/XThis;
      //   198: invokevirtual 47	bsh/XThis:toString	()Ljava/lang/String;
      //   201: invokevirtual 41	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   204: pop
      //   205: aload 13
      //   207: ldc 117
      //   209: invokevirtual 41	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   212: pop
      //   213: new 34	java/lang/StringBuffer
      //   216: dup
      //   217: aload 13
      //   219: invokevirtual 53	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   222: invokespecial 119	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
      //   225: astore 16
      //   227: iload 8
      //   229: aload 12
      //   231: arraylength
      //   232: if_icmplt +9 -> 241
      //   235: aload 16
      //   237: invokevirtual 53	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   240: areturn
      //   241: new 34	java/lang/StringBuffer
      //   244: dup
      //   245: invokespecial 35	java/lang/StringBuffer:<init>	()V
      //   248: astore 17
      //   250: aload 17
      //   252: ldc 121
      //   254: invokevirtual 41	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   257: pop
      //   258: aload 17
      //   260: aload 12
      //   262: iload 8
      //   264: aaload
      //   265: invokevirtual 122	java/lang/Class:getName	()Ljava/lang/String;
      //   268: invokevirtual 41	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   271: pop
      //   272: aload 12
      //   274: arraylength
      //   275: iload 7
      //   277: if_icmple +10 -> 287
      //   280: ldc 124
      //   282: astore 20
      //   284: goto +7 -> 291
      //   287: ldc 126
      //   289: astore 20
      //   291: aload 17
      //   293: aload 20
      //   295: invokevirtual 41	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   298: pop
      //   299: aload 16
      //   301: aload 17
      //   303: invokevirtual 53	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   306: invokevirtual 41	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   309: pop
      //   310: iinc 8 1
      //   313: goto -86 -> 227
      //   316: aload_2
      //   317: invokevirtual 129	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
      //   320: astore 11
      //   322: aload_0
      //   323: getfield 17	bsh/XThis$Handler:a	Lbsh/XThis;
      //   326: aload 4
      //   328: aload_3
      //   329: aload 11
      //   331: invokestatic 135	bsh/Primitive:wrap	([Ljava/lang/Object;[Ljava/lang/Class;)[Ljava/lang/Object;
      //   334: invokevirtual 139	bsh/XThis:invokeMethod	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      //   337: invokestatic 143	bsh/Primitive:unwrap	(Ljava/lang/Object;)Ljava/lang/Object;
      //   340: areturn
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	341	0	this	Handler
      //   0	341	1	paramObject	Object
      //   0	341	2	paramMethod	Method
      //   0	341	3	paramArrayOfObject	Object[]
      //   4	323	4	str1	String
      //   22	148	6	localObject	Object
      //   25	253	7	i	int
      //   28	283	8	j	int
      //   87	19	9	localBshMethod1	BshMethod
      //   320	10	11	arrayOfClass1	Class[]
      //   181	92	12	arrayOfClass2	Class[]
      //   190	28	13	localStringBuffer1	StringBuffer
      //   225	75	16	localStringBuffer2	StringBuffer
      //   248	54	17	localStringBuffer3	StringBuffer
      //   92	1	19	localUtilEvalError1	UtilEvalError
      //   158	1	20	localUtilEvalError2	UtilEvalError
      //   282	12	20	str2	String
      //   149	3	23	localBshMethod2	BshMethod
      //   37	42	24	localNameSpace	NameSpace
      //   44	39	25	arrayOfClass3	Class[]
      //   57	19	26	localClass	Class
      // Exception table:
      //   from	to	target	type
      //   30	64	92	bsh/UtilEvalError
      //   67	72	92	bsh/UtilEvalError
      //   72	89	92	bsh/UtilEvalError
      //   133	151	158	bsh/UtilEvalError
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\XThis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */