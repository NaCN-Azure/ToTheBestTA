package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Vector;

class Reflect
{
  static int a(Class[] paramArrayOfClass, Class[][] paramArrayOfClass1)
  {
    int i = 1;
    int j = -1;
    if (i > 4) {
      return j;
    }
    Object localObject = null;
    for (int k = 0;; k++)
    {
      if (k >= paramArrayOfClass1.length)
      {
        if (localObject != null) {
          return j;
        }
        i++;
        break;
      }
      Class[] arrayOfClass = paramArrayOfClass1[k];
      if ((Types.a(paramArrayOfClass, arrayOfClass, i)) && ((localObject == null) || (Types.a(arrayOfClass, (Class[])localObject, 1))))
      {
        j = k;
        localObject = arrayOfClass;
      }
    }
  }
  
  static LHS a(Class paramClass, String paramString)
  {
    return new LHS(b(paramClass, paramString, true));
  }
  
  static LHS a(Object paramObject, String paramString)
  {
    if ((paramObject instanceof This)) {
      return new LHS(((This)paramObject).a, paramString, false);
    }
    try
    {
      LHS localLHS = new LHS(paramObject, b(paramObject.getClass(), paramString, false));
      return localLHS;
    }
    catch (ReflectError localReflectError)
    {
      if (hasObjectPropertySetter(paramObject.getClass(), paramString)) {
        return new LHS(paramObject, paramString);
      }
      throw localReflectError;
    }
  }
  
  private static ReflectError a(Class paramClass, Class[] paramArrayOfClass)
  {
    if (paramArrayOfClass.length == 0)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("Can't find default constructor for: ");
      localStringBuffer1.append(paramClass);
      return new ReflectError(localStringBuffer1.toString());
    }
    StringBuffer localStringBuffer2 = new StringBuffer();
    localStringBuffer2.append("Can't find constructor: ");
    localStringBuffer2.append(StringUtil.methodString(paramClass.getName(), paramArrayOfClass));
    localStringBuffer2.append(" in class: ");
    localStringBuffer2.append(paramClass.getName());
    return new ReflectError(localStringBuffer2.toString());
  }
  
  /* Error */
  private static Object a(Class paramClass, Object paramObject, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: iload_3
    //   3: invokestatic 22	bsh/Reflect:b	(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;
    //   6: astore 11
    //   8: aload 11
    //   10: aload_1
    //   11: invokevirtual 96	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   14: aload 11
    //   16: invokevirtual 99	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   19: invokestatic 105	bsh/Primitive:wrap	(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   22: astore 12
    //   24: aload 12
    //   26: areturn
    //   27: new 53	java/lang/StringBuffer
    //   30: dup
    //   31: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   34: astore 8
    //   36: aload 8
    //   38: ldc 107
    //   40: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   43: pop
    //   44: aload 8
    //   46: aload_2
    //   47: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   50: pop
    //   51: new 28	bsh/ReflectError
    //   54: dup
    //   55: aload 8
    //   57: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   60: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   63: athrow
    //   64: new 53	java/lang/StringBuffer
    //   67: dup
    //   68: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   71: astore 4
    //   73: aload 4
    //   75: ldc 109
    //   77: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   80: pop
    //   81: aload 4
    //   83: aload_2
    //   84: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   87: pop
    //   88: aload 4
    //   90: ldc 111
    //   92: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   95: pop
    //   96: new 28	bsh/ReflectError
    //   99: dup
    //   100: aload 4
    //   102: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   105: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	paramClass	Class
    //   0	109	1	paramObject	Object
    //   0	109	2	paramString	String
    //   0	109	3	paramBoolean	boolean
    //   71	30	4	localStringBuffer1	StringBuffer
    //   27	1	8	localIllegalAccessException	IllegalAccessException
    //   34	22	8	localStringBuffer2	StringBuffer
    //   64	1	9	localNullPointerException	NullPointerException
    //   6	9	11	localField	Field
    //   22	3	12	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	24	27	java/lang/IllegalAccessException
    //   0	24	64	java/lang/NullPointerException
  }
  
  /* Error */
  static Object a(Class paramClass, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 122	java/lang/Class:isInterface	()Z
    //   4: ifeq +36 -> 40
    //   7: new 53	java/lang/StringBuffer
    //   10: dup
    //   11: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   14: astore_2
    //   15: aload_2
    //   16: ldc 124
    //   18: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   21: pop
    //   22: aload_2
    //   23: aload_0
    //   24: invokevirtual 63	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   27: pop
    //   28: new 28	bsh/ReflectError
    //   31: dup
    //   32: aload_2
    //   33: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   36: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   39: athrow
    //   40: aload_1
    //   41: invokestatic 128	bsh/Types:getTypes	([Ljava/lang/Object;)[Ljava/lang/Class;
    //   44: astore 5
    //   46: invokestatic 133	bsh/Capabilities:haveAccessibility	()Z
    //   49: ifeq +12 -> 61
    //   52: aload_0
    //   53: invokevirtual 137	java/lang/Class:getDeclaredConstructors	()[Ljava/lang/reflect/Constructor;
    //   56: astore 6
    //   58: goto +9 -> 67
    //   61: aload_0
    //   62: invokevirtual 140	java/lang/Class:getConstructors	()[Ljava/lang/reflect/Constructor;
    //   65: astore 6
    //   67: getstatic 146	bsh/Interpreter:DEBUG	Z
    //   70: ifeq +35 -> 105
    //   73: new 53	java/lang/StringBuffer
    //   76: dup
    //   77: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   80: astore 7
    //   82: aload 7
    //   84: ldc -108
    //   86: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   89: pop
    //   90: aload 7
    //   92: aload_0
    //   93: invokevirtual 63	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   96: pop
    //   97: aload 7
    //   99: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   102: invokestatic 151	bsh/Interpreter:debug	(Ljava/lang/String;)V
    //   105: aload 5
    //   107: aload 6
    //   109: invokestatic 154	bsh/Reflect:a	([Ljava/lang/Class;[Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;
    //   112: astore 10
    //   114: aload 10
    //   116: ifnonnull +10 -> 126
    //   119: aload_0
    //   120: aload 5
    //   122: invokestatic 156	bsh/Reflect:a	(Ljava/lang/Class;[Ljava/lang/Class;)Lbsh/ReflectError;
    //   125: athrow
    //   126: aload 10
    //   128: invokestatic 159	bsh/Reflect:a	(Ljava/lang/reflect/Constructor;)Z
    //   131: ifne +12 -> 143
    //   134: aload 10
    //   136: invokestatic 165	bsh/ReflectManager:RMSetAccessible	(Ljava/lang/Object;)Z
    //   139: pop
    //   140: goto +4 -> 144
    //   143: pop
    //   144: aload_1
    //   145: invokestatic 169	bsh/Primitive:unwrap	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   148: astore 12
    //   150: aload 10
    //   152: aload 12
    //   154: invokevirtual 175	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   157: astore 17
    //   159: aload 17
    //   161: ifnonnull +13 -> 174
    //   164: new 28	bsh/ReflectError
    //   167: dup
    //   168: ldc -79
    //   170: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   173: athrow
    //   174: aload 17
    //   176: areturn
    //   177: new 28	bsh/ReflectError
    //   180: dup
    //   181: ldc -77
    //   183: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   186: athrow
    //   187: new 28	bsh/ReflectError
    //   190: dup
    //   191: ldc -75
    //   193: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   196: athrow
    //   197: new 53	java/lang/StringBuffer
    //   200: dup
    //   201: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   204: astore 13
    //   206: aload 13
    //   208: ldc -73
    //   210: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   213: pop
    //   214: aload 13
    //   216: aload_0
    //   217: invokevirtual 63	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   220: pop
    //   221: aload 13
    //   223: ldc -71
    //   225: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   228: pop
    //   229: new 28	bsh/ReflectError
    //   232: dup
    //   233: aload 13
    //   235: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   238: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   241: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	242	0	paramClass	Class
    //   0	242	1	paramArrayOfObject	Object[]
    //   14	19	2	localStringBuffer1	StringBuffer
    //   44	77	5	arrayOfClass	Class[]
    //   56	52	6	arrayOfConstructor	Constructor[]
    //   80	18	7	localStringBuffer2	StringBuffer
    //   112	39	10	localConstructor	Constructor
    //   143	1	10	localUtilEvalError	UtilEvalError
    //   177	1	11	localIllegalArgumentException	IllegalArgumentException
    //   148	5	12	arrayOfObject	Object[]
    //   187	1	12	localIllegalAccessException	IllegalAccessException
    //   197	1	13	localInstantiationException	InstantiationException
    //   204	30	13	localStringBuffer3	StringBuffer
    //   157	18	17	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   134	140	143	bsh/UtilEvalError
    //   150	159	177	java/lang/IllegalArgumentException
    //   150	159	187	java/lang/IllegalAccessException
    //   150	159	197	java/lang/InstantiationException
  }
  
  /* Error */
  static Object a(Method paramMethod, Object paramObject, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_2
    //   3: ifnonnull +8 -> 11
    //   6: iconst_0
    //   7: anewarray 4	java/lang/Object
    //   10: astore_2
    //   11: ldc -68
    //   13: aload_0
    //   14: aload_2
    //   15: invokestatic 191	bsh/Reflect:a	(Ljava/lang/String;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    //   18: aload_2
    //   19: arraylength
    //   20: anewarray 4	java/lang/Object
    //   23: astore 4
    //   25: aload_0
    //   26: invokevirtual 197	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
    //   29: astore 5
    //   31: aload_2
    //   32: arraylength
    //   33: istore 10
    //   35: iload_3
    //   36: iload 10
    //   38: if_icmplt +134 -> 172
    //   41: aload 4
    //   43: invokestatic 169	bsh/Primitive:unwrap	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   46: astore 11
    //   48: ldc -57
    //   50: aload_0
    //   51: aload 11
    //   53: invokestatic 191	bsh/Reflect:a	(Ljava/lang/String;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    //   56: aload_0
    //   57: aload_1
    //   58: aload 11
    //   60: invokevirtual 203	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   63: astore 20
    //   65: aload 20
    //   67: ifnonnull +8 -> 75
    //   70: getstatic 207	bsh/Primitive:NULL	Lbsh/Primitive;
    //   73: astore 20
    //   75: aload 20
    //   77: aload_0
    //   78: invokevirtual 210	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
    //   81: invokestatic 105	bsh/Primitive:wrap	(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   84: astore 21
    //   86: aload 21
    //   88: areturn
    //   89: astore 12
    //   91: new 53	java/lang/StringBuffer
    //   94: dup
    //   95: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   98: astore 13
    //   100: aload 13
    //   102: ldc -44
    //   104: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   107: pop
    //   108: aload 13
    //   110: aload_0
    //   111: invokevirtual 213	java/lang/reflect/Method:getName	()Ljava/lang/String;
    //   114: aload_0
    //   115: invokevirtual 197	java/lang/reflect/Method:getParameterTypes	()[Ljava/lang/Class;
    //   118: invokestatic 83	bsh/StringUtil:methodString	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;
    //   121: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   124: pop
    //   125: aload 13
    //   127: ldc -41
    //   129: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   132: pop
    //   133: aload 13
    //   135: aload_0
    //   136: invokevirtual 218	java/lang/reflect/Method:getDeclaringClass	()Ljava/lang/Class;
    //   139: invokevirtual 63	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   142: pop
    //   143: aload 13
    //   145: ldc -36
    //   147: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   150: pop
    //   151: aload 13
    //   153: aload 12
    //   155: invokevirtual 63	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   158: pop
    //   159: new 28	bsh/ReflectError
    //   162: dup
    //   163: aload 13
    //   165: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   168: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   171: athrow
    //   172: aload 4
    //   174: iload_3
    //   175: aload_2
    //   176: iload_3
    //   177: aaload
    //   178: aload 5
    //   180: iload_3
    //   181: aaload
    //   182: iconst_1
    //   183: invokestatic 224	bsh/Types:castObject	(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;
    //   186: aastore
    //   187: iinc 3 1
    //   190: goto -159 -> 31
    //   193: astore 6
    //   195: new 53	java/lang/StringBuffer
    //   198: dup
    //   199: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   202: astore 7
    //   204: aload 7
    //   206: ldc -30
    //   208: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   211: pop
    //   212: aload 7
    //   214: aload 6
    //   216: invokevirtual 63	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   219: pop
    //   220: new 228	bsh/InterpreterError
    //   223: dup
    //   224: aload 7
    //   226: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   229: invokespecial 229	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   232: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	paramMethod	Method
    //   0	233	1	paramObject	Object
    //   0	233	2	paramArrayOfObject	Object[]
    //   1	187	3	i	int
    //   23	150	4	arrayOfObject1	Object[]
    //   29	150	5	arrayOfClass	Class[]
    //   193	22	6	localUtilEvalError	UtilEvalError
    //   202	23	7	localStringBuffer1	StringBuffer
    //   33	6	10	j	int
    //   46	13	11	arrayOfObject2	Object[]
    //   89	65	12	localIllegalAccessException	IllegalAccessException
    //   98	66	13	localStringBuffer2	StringBuffer
    //   63	13	20	localObject1	Object
    //   84	3	21	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   56	65	89	java/lang/IllegalAccessException
    //   70	75	89	java/lang/IllegalAccessException
    //   75	86	89	java/lang/IllegalAccessException
    //   31	35	193	bsh/UtilEvalError
    //   172	187	193	bsh/UtilEvalError
  }
  
  private static String a(String paramString1, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString1);
    localStringBuffer.append(String.valueOf(Character.toUpperCase(paramString2.charAt(0))));
    localStringBuffer.append(paramString2.substring(1));
    return localStringBuffer.toString();
  }
  
  static Constructor a(Class[] paramArrayOfClass, Constructor[] paramArrayOfConstructor)
  {
    int i = b(paramArrayOfClass, paramArrayOfConstructor);
    if (i == -1) {
      return null;
    }
    return paramArrayOfConstructor[i];
  }
  
  /* Error */
  protected static Field a(Class paramClass, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokestatic 22	bsh/Reflect:b	(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;
    //   6: astore_3
    //   7: aload_3
    //   8: areturn
    //   9: aconst_null
    //   10: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	11	0	paramClass	Class
    //   0	11	1	paramString	String
    //   0	11	2	paramBoolean	boolean
    //   6	2	3	localField	Field
    //   9	1	4	localReflectError	ReflectError
    // Exception table:
    //   from	to	target	type
    //   0	7	9	bsh/ReflectError
  }
  
  protected static Method a(BshClassManager paramBshClassManager, Class paramClass, Object paramObject, String paramString, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    if (paramObject == Primitive.NULL)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("Attempt to invoke method ");
      localStringBuffer1.append(paramString);
      localStringBuffer1.append(" on null value");
      throw new UtilTargetError(new NullPointerException(localStringBuffer1.toString()));
    }
    Class[] arrayOfClass = Types.getTypes(paramArrayOfObject);
    Method localMethod = a(paramBshClassManager, paramClass, paramString, arrayOfClass, paramBoolean);
    if (localMethod == null)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      String str;
      if (paramBoolean) {
        str = "Static method ";
      } else {
        str = "Method ";
      }
      localStringBuffer2.append(str);
      localStringBuffer2.append(StringUtil.methodString(paramString, arrayOfClass));
      localStringBuffer2.append(" not found in class'");
      localStringBuffer2.append(paramClass.getName());
      localStringBuffer2.append("'");
      throw new ReflectError(localStringBuffer2.toString());
    }
    return localMethod;
  }
  
  protected static Method a(BshClassManager paramBshClassManager, Class paramClass, String paramString, Class[] paramArrayOfClass, boolean paramBoolean)
  {
    if (paramClass == null) {
      throw new InterpreterError("null class");
    }
    Method localMethod1;
    if (paramBshClassManager == null)
    {
      Interpreter.debug("resolveJavaMethod UNOPTIMIZED lookup");
      localMethod1 = null;
    }
    else
    {
      localMethod1 = paramBshClassManager.a(paramClass, paramString, paramArrayOfClass, paramBoolean);
    }
    if (localMethod1 == null)
    {
      boolean bool = true ^ Capabilities.haveAccessibility();
      try
      {
        localMethod2 = a(paramClass, paramString, paramArrayOfClass, bool);
        a(localMethod2, paramBoolean, paramClass);
        if ((localMethod2 != null) && (!bool)) {}
        try
        {
          ReflectManager.RMSetAccessible(localMethod2);
        }
        catch (UtilEvalError localUtilEvalError) {}
        if ((localMethod2 == null) || (paramBshClassManager == null)) {
          break label158;
        }
        paramBshClassManager.cacheResolvedMethod(paramClass, paramArrayOfClass, localMethod2);
        return localMethod2;
      }
      catch (SecurityException localSecurityException)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("Security Exception while searching methods of: ");
        localStringBuffer.append(paramClass);
        throw new UtilTargetError(localStringBuffer.toString(), localSecurityException);
      }
    }
    Method localMethod2 = localMethod1;
    label158:
    return localMethod2;
  }
  
  private static Method a(Class paramClass, String paramString, Class[] paramArrayOfClass, boolean paramBoolean)
  {
    if (Interpreter.DEBUG)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("Searching for method: ");
      localStringBuffer1.append(StringUtil.methodString(paramString, paramArrayOfClass));
      localStringBuffer1.append(" in '");
      localStringBuffer1.append(paramClass.getName());
      localStringBuffer1.append("'");
      Interpreter.debug(localStringBuffer1.toString());
    }
    Method[] arrayOfMethod = a(paramClass, paramString, paramArrayOfClass.length, paramBoolean);
    if (Interpreter.DEBUG)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("Looking for most specific method: ");
      localStringBuffer2.append(paramString);
      Interpreter.debug(localStringBuffer2.toString());
    }
    return a(paramArrayOfClass, arrayOfMethod);
  }
  
  static Method a(Class[] paramArrayOfClass, Method[] paramArrayOfMethod)
  {
    Class[][] arrayOfClass = new Class[paramArrayOfMethod.length][];
    for (int i = 0;; i++)
    {
      if (i >= paramArrayOfMethod.length)
      {
        int j = a(paramArrayOfClass, arrayOfClass);
        if (j == -1) {
          return null;
        }
        return paramArrayOfMethod[j];
      }
      arrayOfClass[i] = paramArrayOfMethod[i].getParameterTypes();
    }
  }
  
  private static Vector a(Class paramClass, String paramString, int paramInt, boolean paramBoolean, Vector paramVector)
  {
    if (paramVector == null) {
      paramVector = new Vector();
    }
    Method[] arrayOfMethod;
    if (paramBoolean)
    {
      if (!a(paramClass)) {
        break label51;
      }
      arrayOfMethod = paramClass.getMethods();
    }
    else
    {
      arrayOfMethod = paramClass.getDeclaredMethods();
    }
    a(arrayOfMethod, paramString, paramInt, paramBoolean, paramVector);
    label51:
    Class[] arrayOfClass = paramClass.getInterfaces();
    for (int i = 0;; i++)
    {
      if (i >= arrayOfClass.length)
      {
        Class localClass = paramClass.getSuperclass();
        if (localClass != null) {
          a(localClass, paramString, paramInt, paramBoolean, paramVector);
        }
        return paramVector;
      }
      a(arrayOfClass[i], paramString, paramInt, paramBoolean, paramVector);
    }
  }
  
  private static Vector a(Method[] paramArrayOfMethod, String paramString, int paramInt, boolean paramBoolean, Vector paramVector)
  {
    for (int i = 0;; i++)
    {
      if (i >= paramArrayOfMethod.length) {
        return paramVector;
      }
      Method localMethod = paramArrayOfMethod[i];
      if ((localMethod.getName().equals(paramString)) && (localMethod.getParameterTypes().length == paramInt) && ((!paramBoolean) || (a(localMethod)))) {
        paramVector.add(localMethod);
      }
    }
  }
  
  private static void a(String paramString, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (Interpreter.DEBUG)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append(paramString);
      localStringBuffer1.append(paramMethod);
      localStringBuffer1.append(" with args:");
      Interpreter.debug(localStringBuffer1.toString());
      for (int i = 0;; i++)
      {
        if (i >= paramArrayOfObject.length) {
          return;
        }
        StringBuffer localStringBuffer2 = new StringBuffer();
        localStringBuffer2.append("args[");
        localStringBuffer2.append(i);
        localStringBuffer2.append("] = ");
        localStringBuffer2.append(paramArrayOfObject[i]);
        localStringBuffer2.append(" type = ");
        localStringBuffer2.append(paramArrayOfObject[i].getClass());
        Interpreter.debug(localStringBuffer2.toString());
      }
    }
  }
  
  private static void a(Method paramMethod, boolean paramBoolean, Class paramClass)
  {
    if ((paramMethod != null) && (paramBoolean) && (!b(paramMethod)))
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("Cannot reach instance method: ");
      localStringBuffer.append(StringUtil.methodString(paramMethod.getName(), paramMethod.getParameterTypes()));
      localStringBuffer.append(" from static context: ");
      localStringBuffer.append(paramClass.getName());
      throw new UtilEvalError(localStringBuffer.toString());
    }
  }
  
  private static boolean a(Class paramClass)
  {
    return Modifier.isPublic(paramClass.getModifiers());
  }
  
  private static boolean a(Constructor paramConstructor)
  {
    return Modifier.isPublic(paramConstructor.getModifiers());
  }
  
  private static boolean a(Method paramMethod)
  {
    return Modifier.isPublic(paramMethod.getModifiers());
  }
  
  static Method[] a(Class paramClass, String paramString, int paramInt, boolean paramBoolean)
  {
    Vector localVector = a(paramClass, paramString, paramInt, paramBoolean, null);
    Method[] arrayOfMethod = new Method[localVector.size()];
    localVector.copyInto(arrayOfMethod);
    return arrayOfMethod;
  }
  
  static int b(Class[] paramArrayOfClass, Constructor[] paramArrayOfConstructor)
  {
    Class[][] arrayOfClass = new Class[paramArrayOfConstructor.length][];
    for (int i = 0;; i++)
    {
      if (i >= arrayOfClass.length) {
        return a(paramArrayOfClass, arrayOfClass);
      }
      arrayOfClass[i] = paramArrayOfConstructor[i].getParameterTypes();
    }
  }
  
  private static Field b(Class paramClass, String paramString)
  {
    try
    {
      Field localField2 = paramClass.getField(paramString);
      ReflectManager.RMSetAccessible(localField2);
      return localField2;
    }
    catch (NoSuchFieldException localNoSuchFieldException2)
    {
      for (;;)
      {
        if (paramClass == null) {
          throw new NoSuchFieldException(paramString);
        }
        try
        {
          Field localField1 = paramClass.getDeclaredField(paramString);
          ReflectManager.RMSetAccessible(localField1);
          return localField1;
        }
        catch (NoSuchFieldException localNoSuchFieldException2)
        {
          paramClass = paramClass.getSuperclass();;
        }
      }
    }
  }
  
  /* Error */
  protected static Field b(Class paramClass, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: invokestatic 133	bsh/Capabilities:haveAccessibility	()Z
    //   3: ifeq +13 -> 16
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 398	bsh/Reflect:b	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   11: astore 10
    //   13: goto +10 -> 23
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 392	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   21: astore 10
    //   23: iload_2
    //   24: ifeq +71 -> 95
    //   27: aload 10
    //   29: invokevirtual 399	java/lang/reflect/Field:getModifiers	()I
    //   32: invokestatic 402	java/lang/reflect/Modifier:isStatic	(I)Z
    //   35: ifne +60 -> 95
    //   38: new 53	java/lang/StringBuffer
    //   41: dup
    //   42: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   45: astore 11
    //   47: aload 11
    //   49: ldc_w 404
    //   52: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   55: pop
    //   56: aload 11
    //   58: aload_1
    //   59: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   62: pop
    //   63: aload 11
    //   65: ldc_w 364
    //   68: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   71: pop
    //   72: aload 11
    //   74: aload_0
    //   75: invokevirtual 77	java/lang/Class:getName	()Ljava/lang/String;
    //   78: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   81: pop
    //   82: new 114	bsh/UtilEvalError
    //   85: dup
    //   86: aload 11
    //   88: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   91: invokespecial 365	bsh/UtilEvalError:<init>	(Ljava/lang/String;)V
    //   94: athrow
    //   95: aload 10
    //   97: areturn
    //   98: astore 6
    //   100: new 53	java/lang/StringBuffer
    //   103: dup
    //   104: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   107: astore 7
    //   109: aload 7
    //   111: ldc_w 406
    //   114: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   117: pop
    //   118: aload 7
    //   120: aload_0
    //   121: invokevirtual 63	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   124: pop
    //   125: new 260	bsh/UtilTargetError
    //   128: dup
    //   129: aload 7
    //   131: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   134: aload 6
    //   136: invokespecial 299	bsh/UtilTargetError:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   139: athrow
    //   140: new 53	java/lang/StringBuffer
    //   143: dup
    //   144: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   147: astore_3
    //   148: aload_3
    //   149: ldc_w 408
    //   152: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   155: pop
    //   156: aload_3
    //   157: aload_1
    //   158: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   161: pop
    //   162: new 28	bsh/ReflectError
    //   165: dup
    //   166: aload_3
    //   167: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   170: invokespecial 70	bsh/ReflectError:<init>	(Ljava/lang/String;)V
    //   173: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	paramClass	Class
    //   0	174	1	paramString	String
    //   0	174	2	paramBoolean	boolean
    //   147	20	3	localStringBuffer1	StringBuffer
    //   98	37	6	localSecurityException	SecurityException
    //   107	23	7	localStringBuffer2	StringBuffer
    //   140	1	8	localNoSuchFieldException	NoSuchFieldException
    //   11	85	10	localField	Field
    //   45	42	11	localStringBuffer3	StringBuffer
    // Exception table:
    //   from	to	target	type
    //   0	13	98	java/lang/SecurityException
    //   16	23	98	java/lang/SecurityException
    //   0	13	140	java/lang/NoSuchFieldException
    //   16	23	140	java/lang/NoSuchFieldException
  }
  
  private static boolean b(Method paramMethod)
  {
    return Modifier.isStatic(paramMethod.getModifiers());
  }
  
  public static Class getArrayBaseType(Class paramClass)
  {
    if (!paramClass.isArray()) {
      throw new ReflectError("The class is not an array.");
    }
    return paramClass.getComponentType();
  }
  
  public static int getArrayDimensions(Class paramClass)
  {
    if (!paramClass.isArray()) {
      return 0;
    }
    return 1 + paramClass.getName().lastIndexOf('[');
  }
  
  public static Object getIndex(Object paramObject, int paramInt)
  {
    if (Interpreter.DEBUG)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("getIndex: ");
      localStringBuffer1.append(paramObject);
      localStringBuffer1.append(", index=");
      localStringBuffer1.append(paramInt);
      Interpreter.debug(localStringBuffer1.toString());
    }
    try
    {
      Object localObject = Primitive.wrap(Array.get(paramObject, paramInt), paramObject.getClass().getComponentType());
      return localObject;
    }
    catch (Exception localException)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("Array access:");
      localStringBuffer2.append(localException);
      throw new ReflectError(localStringBuffer2.toString());
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new UtilTargetError(localArrayIndexOutOfBoundsException);
    }
  }
  
  public static Object getObjectFieldValue(Object paramObject, String paramString)
  {
    if ((paramObject instanceof This)) {
      return ((This)paramObject).a.getVariable(paramString);
    }
    try
    {
      Object localObject = a(paramObject.getClass(), paramObject, paramString, false);
      return localObject;
    }
    catch (ReflectError localReflectError)
    {
      if (hasObjectPropertyGetter(paramObject.getClass(), paramString)) {
        return getObjectProperty(paramObject, paramString);
      }
      throw localReflectError;
    }
  }
  
  public static Object getObjectProperty(Object paramObject, String paramString)
  {
    Object[] arrayOfObject = new Object[0];
    Interpreter.debug("property access: ");
    Object localObject2;
    Object localObject1;
    try
    {
      String str3 = a("get", paramString);
      Method localMethod2 = a(null, paramObject.getClass(), paramObject, str3, arrayOfObject, false);
      localObject2 = localMethod2;
      localObject1 = null;
    }
    catch (Exception localException1)
    {
      localObject1 = localException1;
      localObject2 = null;
    }
    Object localObject3 = null;
    if (localObject2 == null) {
      try
      {
        String str2 = a("is", paramString);
        Method localMethod1 = a(null, paramObject.getClass(), paramObject, str2, arrayOfObject, false);
        try
        {
          Class localClass1 = localMethod1.getReturnType();
          Class localClass2 = Boolean.TYPE;
          if (localClass1 != localClass2)
          {
            localObject3 = null;
            localObject2 = null;
          }
          else
          {
            localObject2 = localMethod1;
            localObject3 = null;
          }
        }
        catch (Exception localException3)
        {
          localObject2 = localMethod1;
          localObject3 = localException3;
        }
        if (localObject2 != null) {
          break label239;
        }
      }
      catch (Exception localException2)
      {
        localObject3 = localException2;
      }
    }
    StringBuffer localStringBuffer1 = new StringBuffer();
    localStringBuffer1.append("Error in property getter: ");
    localStringBuffer1.append(localObject1);
    String str1;
    if (localObject3 != null)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append(" : ");
      localStringBuffer2.append(localObject3);
      str1 = localStringBuffer2.toString();
    }
    else
    {
      str1 = "";
    }
    localStringBuffer1.append(str1);
    throw new ReflectError(localStringBuffer1.toString());
    try
    {
      label239:
      Object localObject4 = a((Method)localObject2, paramObject, arrayOfObject);
      return localObject4;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      StringBuffer localStringBuffer3 = new StringBuffer();
      localStringBuffer3.append("Property accessor threw exception: ");
      localStringBuffer3.append(localInvocationTargetException.getTargetException());
      throw new UtilEvalError(localStringBuffer3.toString());
    }
  }
  
  public static Object getStaticFieldValue(Class paramClass, String paramString)
  {
    return a(paramClass, null, paramString, true);
  }
  
  /* Error */
  public static boolean hasObjectPropertyGetter(Class paramClass, String paramString)
  {
    // Byte code:
    //   0: ldc_w 461
    //   3: aload_1
    //   4: invokestatic 463	bsh/Reflect:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: iconst_0
    //   11: anewarray 74	java/lang/Class
    //   14: invokevirtual 495	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   17: pop
    //   18: iconst_1
    //   19: ireturn
    //   20: ldc_w 467
    //   23: aload_1
    //   24: invokestatic 463	bsh/Reflect:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   27: astore_3
    //   28: aload_0
    //   29: aload_3
    //   30: iconst_0
    //   31: anewarray 74	java/lang/Class
    //   34: invokevirtual 495	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   37: invokevirtual 210	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
    //   40: astore 4
    //   42: getstatic 473	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   45: astore 5
    //   47: aload 4
    //   49: aload 5
    //   51: if_acmpne +5 -> 56
    //   54: iconst_1
    //   55: ireturn
    //   56: iconst_0
    //   57: ireturn
    //   58: iconst_0
    //   59: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	paramClass	Class
    //   0	60	1	paramString	String
    //   7	3	2	str1	String
    //   27	3	3	str2	String
    //   40	8	4	localClass1	Class
    //   45	5	5	localClass2	Class
    //   20	1	6	localNoSuchMethodException1	NoSuchMethodException
    //   58	1	7	localNoSuchMethodException2	NoSuchMethodException
    // Exception table:
    //   from	to	target	type
    //   8	18	20	java/lang/NoSuchMethodException
    //   28	47	58	java/lang/NoSuchMethodException
  }
  
  public static boolean hasObjectPropertySetter(Class paramClass, String paramString)
  {
    String str = a("set", paramString);
    Method[] arrayOfMethod = paramClass.getMethods();
    for (int i = 0;; i++)
    {
      if (i >= arrayOfMethod.length) {
        return false;
      }
      if (arrayOfMethod[i].getName().equals(str)) {
        return true;
      }
    }
  }
  
  public static Object invokeCompiledCommand(Class paramClass, Object[] paramArrayOfObject, Interpreter paramInterpreter, CallStack paramCallStack)
  {
    Object[] arrayOfObject = new Object[2 + paramArrayOfObject.length];
    arrayOfObject[0] = paramInterpreter;
    arrayOfObject[1] = paramCallStack;
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 2, paramArrayOfObject.length);
    BshClassManager localBshClassManager = paramInterpreter.getClassManager();
    try
    {
      Object localObject = invokeStaticMethod(localBshClassManager, paramClass, "invoke", arrayOfObject);
      return localObject;
    }
    catch (ReflectError localReflectError)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("Error invoking compiled command: ");
      localStringBuffer2.append(localReflectError);
      throw new UtilEvalError(localStringBuffer2.toString());
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("Error in compiled command: ");
      localStringBuffer1.append(localInvocationTargetException.getTargetException());
      throw new UtilEvalError(localStringBuffer1.toString());
    }
  }
  
  public static Object invokeObjectMethod(Object paramObject, String paramString, Object[] paramArrayOfObject, Interpreter paramInterpreter, CallStack paramCallStack, SimpleNode paramSimpleNode)
  {
    if (((paramObject instanceof This)) && (!This.a(paramString))) {
      return ((This)paramObject).invokeMethod(paramString, paramArrayOfObject, paramInterpreter, paramCallStack, paramSimpleNode, false);
    }
    BshClassManager localBshClassManager1;
    if (paramInterpreter == null) {
      localBshClassManager1 = null;
    }
    for (;;)
    {
      BshClassManager localBshClassManager2 = localBshClassManager1;
      try
      {
        localBshClassManager1 = paramInterpreter.getClassManager();
      }
      catch (UtilEvalError localUtilEvalError)
      {
        Object localObject;
        throw localUtilEvalError.toEvalError(paramSimpleNode, paramCallStack);
      }
    }
    localObject = a(a(localBshClassManager2, paramObject.getClass(), paramObject, paramString, paramArrayOfObject, false), paramObject, paramArrayOfObject);
    return localObject;
  }
  
  public static Object invokeStaticMethod(BshClassManager paramBshClassManager, Class paramClass, String paramString, Object[] paramArrayOfObject)
  {
    Interpreter.debug("invoke static Method");
    return a(a(paramBshClassManager, paramClass, null, paramString, paramArrayOfObject, true), null, paramArrayOfObject);
  }
  
  /* Error */
  public static String normalizeClassName(Class paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 413	java/lang/Class:isArray	()Z
    //   4: ifne +8 -> 12
    //   7: aload_0
    //   8: invokevirtual 77	java/lang/Class:getName	()Ljava/lang/String;
    //   11: areturn
    //   12: new 53	java/lang/StringBuffer
    //   15: dup
    //   16: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   19: astore_1
    //   20: new 53	java/lang/StringBuffer
    //   23: dup
    //   24: invokespecial 54	java/lang/StringBuffer:<init>	()V
    //   27: astore_2
    //   28: aload_2
    //   29: aload_0
    //   30: invokestatic 537	bsh/Reflect:getArrayBaseType	(Ljava/lang/Class;)Ljava/lang/Class;
    //   33: invokevirtual 77	java/lang/Class:getName	()Ljava/lang/String;
    //   36: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   39: pop
    //   40: aload_2
    //   41: ldc_w 539
    //   44: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   47: pop
    //   48: aload_1
    //   49: aload_2
    //   50: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   53: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   56: pop
    //   57: iconst_0
    //   58: istore 6
    //   60: iload 6
    //   62: aload_0
    //   63: invokestatic 541	bsh/Reflect:getArrayDimensions	(Ljava/lang/Class;)I
    //   66: if_icmplt +6 -> 72
    //   69: goto +17 -> 86
    //   72: aload_1
    //   73: ldc_w 543
    //   76: invokevirtual 60	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   79: pop
    //   80: iinc 6 1
    //   83: goto -23 -> 60
    //   86: aload_1
    //   87: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   90: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	paramClass	Class
    //   19	68	1	localStringBuffer1	StringBuffer
    //   27	23	2	localStringBuffer2	StringBuffer
    //   86	1	4	localReflectError	ReflectError
    //   58	23	6	i	int
    // Exception table:
    //   from	to	target	type
    //   20	57	86	bsh/ReflectError
    //   60	69	86	bsh/ReflectError
    //   72	80	86	bsh/ReflectError
  }
  
  public static void setIndex(Object paramObject1, int paramInt, Object paramObject2)
  {
    try
    {
      Array.set(paramObject1, paramInt, Primitive.unwrap(paramObject2));
      return;
    }
    catch (Exception localException)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("Array access:");
      localStringBuffer.append(localException);
      throw new ReflectError(localStringBuffer.toString());
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new UtilTargetError(new ArrayStoreException(localIllegalArgumentException.toString()));
    }
    catch (ArrayStoreException localArrayStoreException)
    {
      throw new UtilTargetError(localArrayStoreException);
    }
  }
  
  public static void setObjectProperty(Object paramObject1, String paramString, Object paramObject2)
  {
    String str = a("set", paramString);
    Object[] arrayOfObject = { paramObject2 };
    Interpreter.debug("property access: ");
    try
    {
      a(a(null, paramObject1.getClass(), paramObject1, str, arrayOfObject, false), paramObject1, arrayOfObject);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("Property accessor threw exception: ");
      localStringBuffer.append(localInvocationTargetException.getTargetException());
      throw new UtilEvalError(localStringBuffer.toString());
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\Reflect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */