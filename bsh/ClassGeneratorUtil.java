package bsh;

import bsh.org.objectweb.asm.ClassWriter;
import bsh.org.objectweb.asm.CodeVisitor;
import bsh.org.objectweb.asm.Constants;
import bsh.org.objectweb.asm.Label;
import bsh.org.objectweb.asm.Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassGeneratorUtil
  implements Constants
{
  static Class m;
  static Class n;
  static Class o;
  static Class p;
  static Class q;
  static Class r;
  String a;
  String b;
  Class c;
  String d;
  Class[] e;
  Variable[] f;
  Constructor[] g;
  DelayedEvalBshMethod[] h;
  DelayedEvalBshMethod[] i;
  NameSpace j;
  Modifiers k;
  boolean l;
  
  /* Error */
  public ClassGeneratorUtil(Modifiers paramModifiers, String paramString1, String paramString2, Class paramClass, Class[] paramArrayOfClass, Variable[] paramArrayOfVariable, DelayedEvalBshMethod[] paramArrayOfDelayedEvalBshMethod, NameSpace paramNameSpace, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 40	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield 42	bsh/ClassGeneratorUtil:k	Lbsh/Modifiers;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield 44	bsh/ClassGeneratorUtil:a	Ljava/lang/String;
    //   14: aload_3
    //   15: ifnull +53 -> 68
    //   18: new 46	java/lang/StringBuffer
    //   21: dup
    //   22: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   25: astore 10
    //   27: aload 10
    //   29: aload_3
    //   30: bipush 46
    //   32: bipush 47
    //   34: invokevirtual 53	java/lang/String:replace	(CC)Ljava/lang/String;
    //   37: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   40: pop
    //   41: aload 10
    //   43: ldc 59
    //   45: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   48: pop
    //   49: aload 10
    //   51: aload_2
    //   52: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   55: pop
    //   56: aload_0
    //   57: aload 10
    //   59: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   62: putfield 65	bsh/ClassGeneratorUtil:b	Ljava/lang/String;
    //   65: goto +8 -> 73
    //   68: aload_0
    //   69: aload_2
    //   70: putfield 65	bsh/ClassGeneratorUtil:b	Ljava/lang/String;
    //   73: aload 4
    //   75: ifnonnull +36 -> 111
    //   78: getstatic 67	bsh/ClassGeneratorUtil:m	Ljava/lang/Class;
    //   81: ifnonnull +22 -> 103
    //   84: ldc 69
    //   86: invokestatic 72	bsh/ClassGeneratorUtil:a	(Ljava/lang/String;)Ljava/lang/Class;
    //   89: astore 20
    //   91: aload 20
    //   93: putstatic 67	bsh/ClassGeneratorUtil:m	Ljava/lang/Class;
    //   96: aload 20
    //   98: astore 4
    //   100: goto +11 -> 111
    //   103: getstatic 67	bsh/ClassGeneratorUtil:m	Ljava/lang/Class;
    //   106: astore 20
    //   108: goto -12 -> 96
    //   111: aload_0
    //   112: aload 4
    //   114: putfield 74	bsh/ClassGeneratorUtil:c	Ljava/lang/Class;
    //   117: aload_0
    //   118: aload 4
    //   120: invokestatic 80	bsh/org/objectweb/asm/Type:getInternalName	(Ljava/lang/Class;)Ljava/lang/String;
    //   123: putfield 82	bsh/ClassGeneratorUtil:d	Ljava/lang/String;
    //   126: aload 5
    //   128: ifnonnull +9 -> 137
    //   131: iconst_0
    //   132: anewarray 84	java/lang/Class
    //   135: astore 5
    //   137: aload_0
    //   138: aload 5
    //   140: putfield 86	bsh/ClassGeneratorUtil:e	[Ljava/lang/Class;
    //   143: aload_0
    //   144: aload 6
    //   146: putfield 88	bsh/ClassGeneratorUtil:f	[Lbsh/Variable;
    //   149: aload_0
    //   150: aload 8
    //   152: putfield 90	bsh/ClassGeneratorUtil:j	Lbsh/NameSpace;
    //   155: aload_0
    //   156: aload 4
    //   158: invokevirtual 94	java/lang/Class:getDeclaredConstructors	()[Ljava/lang/reflect/Constructor;
    //   161: putfield 96	bsh/ClassGeneratorUtil:g	[Ljava/lang/reflect/Constructor;
    //   164: new 98	java/util/ArrayList
    //   167: dup
    //   168: invokespecial 99	java/util/ArrayList:<init>	()V
    //   171: astore 14
    //   173: new 98	java/util/ArrayList
    //   176: dup
    //   177: invokespecial 99	java/util/ArrayList:<init>	()V
    //   180: astore 15
    //   182: aload_2
    //   183: invokestatic 102	bsh/ClassGeneratorUtil:d	(Ljava/lang/String;)Ljava/lang/String;
    //   186: astore 16
    //   188: iconst_0
    //   189: istore 17
    //   191: iload 17
    //   193: aload 7
    //   195: arraylength
    //   196: if_icmplt +68 -> 264
    //   199: aload_0
    //   200: aload 14
    //   202: iconst_0
    //   203: anewarray 104	bsh/DelayedEvalBshMethod
    //   206: invokeinterface 110 2 0
    //   211: checkcast 111	[Lbsh/DelayedEvalBshMethod;
    //   214: putfield 113	bsh/ClassGeneratorUtil:h	[Lbsh/DelayedEvalBshMethod;
    //   217: aload_0
    //   218: aload 15
    //   220: iconst_0
    //   221: anewarray 104	bsh/DelayedEvalBshMethod
    //   224: invokeinterface 110 2 0
    //   229: checkcast 111	[Lbsh/DelayedEvalBshMethod;
    //   232: putfield 115	bsh/ClassGeneratorUtil:i	[Lbsh/DelayedEvalBshMethod;
    //   235: aload 8
    //   237: ldc 117
    //   239: aload_0
    //   240: getfield 113	bsh/ClassGeneratorUtil:h	[Lbsh/DelayedEvalBshMethod;
    //   243: iconst_0
    //   244: invokevirtual 122	bsh/NameSpace:a	(Ljava/lang/String;Ljava/lang/Object;Z)V
    //   247: aload_0
    //   248: iload 9
    //   250: putfield 124	bsh/ClassGeneratorUtil:l	Z
    //   253: return
    //   254: new 126	bsh/InterpreterError
    //   257: dup
    //   258: ldc -128
    //   260: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   263: athrow
    //   264: aload 7
    //   266: iload 17
    //   268: aaload
    //   269: invokevirtual 134	bsh/DelayedEvalBshMethod:getName	()Ljava/lang/String;
    //   272: aload 16
    //   274: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   277: ifeq +19 -> 296
    //   280: aload 14
    //   282: aload 7
    //   284: iload 17
    //   286: aaload
    //   287: invokeinterface 141 2 0
    //   292: pop
    //   293: goto +16 -> 309
    //   296: aload 15
    //   298: aload 7
    //   300: iload 17
    //   302: aaload
    //   303: invokeinterface 141 2 0
    //   308: pop
    //   309: iinc 17 1
    //   312: goto -121 -> 191
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	315	0	this	ClassGeneratorUtil
    //   0	315	1	paramModifiers	Modifiers
    //   0	315	2	paramString1	String
    //   0	315	3	paramString2	String
    //   0	315	4	paramClass	Class
    //   0	315	5	paramArrayOfClass	Class[]
    //   0	315	6	paramArrayOfVariable	Variable[]
    //   0	315	7	paramArrayOfDelayedEvalBshMethod	DelayedEvalBshMethod[]
    //   0	315	8	paramNameSpace	NameSpace
    //   0	315	9	paramBoolean	boolean
    //   25	33	10	localStringBuffer	StringBuffer
    //   171	110	14	localArrayList1	java.util.ArrayList
    //   180	117	15	localArrayList2	java.util.ArrayList
    //   186	87	16	str	String
    //   254	1	16	localUtilEvalError	UtilEvalError
    //   189	121	17	i1	int
    //   89	18	20	localClass	Class
    // Exception table:
    //   from	to	target	type
    //   235	247	254	bsh/UtilEvalError
  }
  
  static int a(Modifiers paramModifiers)
  {
    if (paramModifiers == null) {
      return 0;
    }
    boolean bool = paramModifiers.hasModifier("public");
    int i1 = 0;
    if (bool) {
      i1 = 1;
    }
    if (paramModifiers.hasModifier("protected")) {
      i1 += 4;
    }
    if (paramModifiers.hasModifier("static")) {
      i1 += 8;
    }
    if (paramModifiers.hasModifier("synchronized")) {
      i1 += 32;
    }
    if (paramModifiers.hasModifier("abstract")) {
      i1 += 1024;
    }
    return i1;
  }
  
  static This a(Class paramClass, String paramString)
  {
    try
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("_bshStatic");
      localStringBuffer1.append(paramString);
      This localThis = (This)Reflect.getStaticFieldValue(paramClass, localStringBuffer1.toString());
      return localThis;
    }
    catch (Exception localException)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("Unable to get class static space: ");
      localStringBuffer2.append(localException);
      throw new InterpreterError(localStringBuffer2.toString());
    }
  }
  
  static This a(Object paramObject, String paramString)
  {
    try
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("_bshThis");
      localStringBuffer1.append(paramString);
      This localThis = (This)Primitive.unwrap(Reflect.getObjectFieldValue(paramObject, localStringBuffer1.toString()));
      return localThis;
    }
    catch (Exception localException)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("Generated class: Error getting This");
      localStringBuffer2.append(localException);
      throw new InterpreterError(localStringBuffer2.toString());
    }
  }
  
  static Class a(String paramString)
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
  
  static String a(String paramString, String[] paramArrayOfString)
  {
    StringBuffer localStringBuffer1 = new StringBuffer("(");
    for (int i1 = 0;; i1++)
    {
      if (i1 >= paramArrayOfString.length)
      {
        StringBuffer localStringBuffer2 = new StringBuffer();
        localStringBuffer2.append(")");
        localStringBuffer2.append(paramString);
        localStringBuffer1.append(localStringBuffer2.toString());
        return localStringBuffer1.toString();
      }
      localStringBuffer1.append(paramArrayOfString[i1]);
    }
  }
  
  static void a(int paramInt1, String paramString, String[] paramArrayOfString, Label paramLabel, Label[] paramArrayOfLabel, int paramInt2, CodeVisitor paramCodeVisitor)
  {
    paramCodeVisitor.visitLabel(paramArrayOfLabel[paramInt1]);
    int i1 = 0;
    paramCodeVisitor.visitVarInsn(25, 0);
    for (;;)
    {
      if (i1 >= paramArrayOfString.length)
      {
        paramCodeVisitor.visitMethodInsn(183, paramString, "<init>", a("V", paramArrayOfString));
        paramCodeVisitor.visitJumpInsn(167, paramLabel);
        return;
      }
      String str1 = paramArrayOfString[i1];
      String str2;
      if (str1.equals("Z")) {
        str2 = "getBoolean";
      } else if (str1.equals("B")) {
        str2 = "getByte";
      } else if (str1.equals("C")) {
        str2 = "getChar";
      } else if (str1.equals("S")) {
        str2 = "getShort";
      } else if (str1.equals("I")) {
        str2 = "getInt";
      } else if (str1.equals("J")) {
        str2 = "getLong";
      } else if (str1.equals("D")) {
        str2 = "getDouble";
      } else if (str1.equals("F")) {
        str2 = "getFloat";
      } else {
        str2 = "getObject";
      }
      paramCodeVisitor.visitVarInsn(25, paramInt2);
      String str3;
      if (str2.equals("getObject")) {
        str3 = "Ljava/lang/Object;";
      } else {
        str3 = str1;
      }
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("()");
      localStringBuffer.append(str3);
      paramCodeVisitor.visitMethodInsn(182, "bsh/ClassGeneratorUtil$ConstructorArgs", str2, localStringBuffer.toString());
      if (str2.equals("getObject")) {
        paramCodeVisitor.visitTypeInsn(192, c(str1));
      }
      i1++;
    }
  }
  
  static void a(String paramString, CodeVisitor paramCodeVisitor)
  {
    if (paramString.equals("V")) {}
    for (int i1 = 177;; i1 = 176)
    {
      paramCodeVisitor.visitInsn(i1);
      return;
      if (b(paramString))
      {
        int i2 = 172;
        if (paramString.equals("D")) {
          i2 = 175;
        } else if (paramString.equals("F")) {
          i2 = 174;
        } else if (paramString.equals("J")) {
          i2 = 173;
        }
        paramCodeVisitor.visitInsn(i2);
        return;
      }
      paramCodeVisitor.visitTypeInsn(192, c(paramString));
    }
  }
  
  static void a(String paramString1, String paramString2, int paramInt, ClassWriter paramClassWriter)
  {
    paramClassWriter.visitField(paramInt, paramString1, paramString2, null);
  }
  
  static void a(String paramString1, String paramString2, String paramString3, String paramString4, String[] paramArrayOfString, int paramInt, ClassWriter paramClassWriter)
  {
    boolean bool;
    if ((paramInt & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (paramString4 == null) {
      paramString4 = "Ljava/lang/Object;";
    }
    CodeVisitor localCodeVisitor = paramClassWriter.visitMethod(paramInt, paramString3, a(paramString4, paramArrayOfString), null);
    if ((paramInt & 0x400) != 0) {
      return;
    }
    int i1;
    StringBuffer localStringBuffer;
    if (bool)
    {
      i1 = 178;
      localStringBuffer = new StringBuffer();
    }
    for (String str = "_bshStatic";; str = "_bshThis")
    {
      localStringBuffer.append(str);
      localStringBuffer.append(paramString1);
      localCodeVisitor.visitFieldInsn(i1, paramString2, localStringBuffer.toString(), "Lbsh/This;");
      break;
      localCodeVisitor.visitVarInsn(25, 0);
      i1 = 180;
      localStringBuffer = new StringBuffer();
    }
    localCodeVisitor.visitLdcInsn(paramString3);
    generateParameterReifierCode(paramArrayOfString, bool, localCodeVisitor);
    localCodeVisitor.visitInsn(1);
    localCodeVisitor.visitInsn(1);
    localCodeVisitor.visitInsn(1);
    localCodeVisitor.visitInsn(4);
    Class localClass1;
    if (m == null)
    {
      localClass1 = a("java.lang.Object");
      m = localClass1;
    }
    else
    {
      localClass1 = m;
    }
    Type localType = Type.getType(localClass1);
    Type[] arrayOfType = new Type[6];
    Class localClass2;
    if (n == null)
    {
      localClass2 = a("java.lang.String");
      n = localClass2;
    }
    else
    {
      localClass2 = n;
    }
    arrayOfType[0] = Type.getType(localClass2);
    Class localClass3;
    if (o == null)
    {
      localClass3 = a("[Ljava.lang.Object;");
      o = localClass3;
    }
    else
    {
      localClass3 = o;
    }
    arrayOfType[1] = Type.getType(localClass3);
    Class localClass4;
    if (p == null)
    {
      localClass4 = a("bsh.Interpreter");
      p = localClass4;
    }
    else
    {
      localClass4 = p;
    }
    arrayOfType[2] = Type.getType(localClass4);
    Class localClass5;
    if (q == null)
    {
      localClass5 = a("bsh.CallStack");
      q = localClass5;
    }
    else
    {
      localClass5 = q;
    }
    arrayOfType[3] = Type.getType(localClass5);
    Class localClass6;
    if (r == null)
    {
      localClass6 = a("bsh.SimpleNode");
      r = localClass6;
    }
    else
    {
      localClass6 = r;
    }
    arrayOfType[4] = Type.getType(localClass6);
    arrayOfType[5] = Type.getType(Boolean.TYPE);
    localCodeVisitor.visitMethodInsn(182, "bsh/This", "invokeMethod", Type.getMethodDescriptor(localType, arrayOfType));
    localCodeVisitor.visitMethodInsn(184, "bsh/Primitive", "unwrap", "(Ljava/lang/Object;)Ljava/lang/Object;");
    generateReturnCode(paramString4, localCodeVisitor);
    localCodeVisitor.visitMaxs(20, 20);
  }
  
  static void a(String paramString1, String paramString2, String paramString3, String[] paramArrayOfString, int paramInt, ClassWriter paramClassWriter)
  {
    if (paramString3 == null) {
      paramString3 = "Ljava/lang/Object;";
    }
    String str = a(paramString3, paramArrayOfString);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("_bshSuper");
    localStringBuffer.append(paramString2);
    CodeVisitor localCodeVisitor = paramClassWriter.visitMethod(paramInt, localStringBuffer.toString(), str, null);
    int i1 = 0;
    localCodeVisitor.visitVarInsn(25, 0);
    int i2 = 1;
    for (;;)
    {
      if (i1 >= paramArrayOfString.length)
      {
        localCodeVisitor.visitMethodInsn(183, paramString1, paramString2, str);
        a(paramString3, localCodeVisitor);
        localCodeVisitor.visitMaxs(20, 20);
        return;
      }
      if (b(paramArrayOfString[i1])) {
        localCodeVisitor.visitVarInsn(21, i2);
      } else {
        localCodeVisitor.visitVarInsn(25, i2);
      }
      int i3;
      if ((!paramArrayOfString[i1].equals("D")) && (!paramArrayOfString[i1].equals("J"))) {
        i3 = 1;
      } else {
        i3 = 2;
      }
      i2 += i3;
      i1++;
    }
  }
  
  static String[] a(Class[] paramArrayOfClass)
  {
    String[] arrayOfString = new String[paramArrayOfClass.length];
    for (int i1 = 0;; i1++)
    {
      if (i1 >= arrayOfString.length) {
        return arrayOfString;
      }
      arrayOfString[i1] = BSHType.getTypeDescriptor(paramArrayOfClass[i1]);
    }
  }
  
  private static boolean b(String paramString)
  {
    return paramString.length() == 1;
  }
  
  private static String c(String paramString)
  {
    if (!paramString.startsWith("["))
    {
      if (!paramString.startsWith("L")) {
        return paramString;
      }
      paramString = paramString.substring(1, paramString.length() - 1);
    }
    return paramString;
  }
  
  private static String d(String paramString)
  {
    int i1 = paramString.indexOf("$");
    if (i1 == -1) {
      return paramString;
    }
    return paramString.substring(i1 + 1);
  }
  
  public static void generateParameterReifierCode(String[] paramArrayOfString, boolean paramBoolean, CodeVisitor paramCodeVisitor)
  {
    paramCodeVisitor.visitIntInsn(17, paramArrayOfString.length);
    paramCodeVisitor.visitTypeInsn(189, "java/lang/Object");
    int i1 = paramBoolean ^ true;
    for (int i3 = 0;; i3++)
    {
      if (i3 >= paramArrayOfString.length) {
        return;
      }
      String str = paramArrayOfString[i3];
      paramCodeVisitor.visitInsn(89);
      paramCodeVisitor.visitIntInsn(17, i3);
      if (b(str))
      {
        int i5;
        if (str.equals("F")) {
          i5 = 23;
        } else if (str.equals("D")) {
          i5 = 24;
        } else if (str.equals("J")) {
          i5 = 22;
        } else {
          i5 = 21;
        }
        paramCodeVisitor.visitTypeInsn(187, "bsh/Primitive");
        paramCodeVisitor.visitInsn(89);
        paramCodeVisitor.visitVarInsn(i5, i1);
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("(");
        localStringBuffer.append(str);
        localStringBuffer.append(")V");
        paramCodeVisitor.visitMethodInsn(183, "bsh/Primitive", "<init>", localStringBuffer.toString());
      }
      else
      {
        paramCodeVisitor.visitVarInsn(25, i1);
      }
      paramCodeVisitor.visitInsn(83);
      int i4;
      if ((!str.equals("D")) && (!str.equals("J"))) {
        i4 = 1;
      } else {
        i4 = 2;
      }
      int i2;
      i1 += i4;
    }
  }
  
  public static void generateReturnCode(String paramString, CodeVisitor paramCodeVisitor)
  {
    if (paramString.equals("V")) {
      paramCodeVisitor.visitInsn(87);
    }
    for (int i1 = 177;; i1 = 176)
    {
      paramCodeVisitor.visitInsn(i1);
      return;
      if (b(paramString))
      {
        int i2 = 172;
        String str1;
        String str2;
        if (paramString.equals("B"))
        {
          str1 = "java/lang/Byte";
          str2 = "byteValue";
        }
        else if (paramString.equals("I"))
        {
          str1 = "java/lang/Integer";
          str2 = "intValue";
        }
        else if (paramString.equals("Z"))
        {
          str1 = "java/lang/Boolean";
          str2 = "booleanValue";
        }
        else if (paramString.equals("D"))
        {
          i2 = 175;
          str1 = "java/lang/Double";
          str2 = "doubleValue";
        }
        else if (paramString.equals("F"))
        {
          i2 = 174;
          str1 = "java/lang/Float";
          str2 = "floatValue";
        }
        else if (paramString.equals("J"))
        {
          i2 = 173;
          str1 = "java/lang/Long";
          str2 = "longValue";
        }
        else if (paramString.equals("C"))
        {
          str1 = "java/lang/Character";
          str2 = "charValue";
        }
        else
        {
          str1 = "java/lang/Short";
          str2 = "shortValue";
        }
        paramCodeVisitor.visitTypeInsn(192, str1);
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("()");
        localStringBuffer.append(paramString);
        paramCodeVisitor.visitMethodInsn(182, str1, str2, localStringBuffer.toString());
        paramCodeVisitor.visitInsn(i2);
        return;
      }
      paramCodeVisitor.visitTypeInsn(192, c(paramString));
    }
  }
  
  /* Error */
  public static ConstructorArgs getConstructorArgs(String paramString, This paramThis, Object[] paramArrayOfObject, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 434	bsh/This:getNameSpace	()Lbsh/NameSpace;
    //   4: ldc 117
    //   6: invokevirtual 438	bsh/NameSpace:getVariable	(Ljava/lang/String;)Ljava/lang/Object;
    //   9: checkcast 111	[Lbsh/DelayedEvalBshMethod;
    //   12: astore 8
    //   14: iconst_m1
    //   15: istore 9
    //   17: iload_3
    //   18: iload 9
    //   20: if_icmpne +7 -> 27
    //   23: getstatic 443	bsh/ClassGeneratorUtil$ConstructorArgs:DEFAULT	Lbsh/ClassGeneratorUtil$ConstructorArgs;
    //   26: areturn
    //   27: aload 8
    //   29: iload_3
    //   30: aaload
    //   31: astore 10
    //   33: aload 10
    //   35: getfield 446	bsh/DelayedEvalBshMethod:c	Lbsh/BSHBlock;
    //   38: invokevirtual 451	bsh/BSHBlock:jjtGetNumChildren	()I
    //   41: ifne +7 -> 48
    //   44: getstatic 443	bsh/ClassGeneratorUtil$ConstructorArgs:DEFAULT	Lbsh/ClassGeneratorUtil$ConstructorArgs;
    //   47: areturn
    //   48: aload 10
    //   50: getfield 446	bsh/DelayedEvalBshMethod:c	Lbsh/BSHBlock;
    //   53: astore 11
    //   55: iconst_0
    //   56: istore 12
    //   58: aload 11
    //   60: iconst_0
    //   61: invokevirtual 455	bsh/BSHBlock:jjtGetChild	(I)Lbsh/Node;
    //   64: checkcast 457	bsh/SimpleNode
    //   67: astore 13
    //   69: aload 13
    //   71: instanceof 459
    //   74: ifeq +14 -> 88
    //   77: aload 13
    //   79: iconst_0
    //   80: invokevirtual 460	bsh/SimpleNode:jjtGetChild	(I)Lbsh/Node;
    //   83: checkcast 457	bsh/SimpleNode
    //   86: astore 13
    //   88: aload 13
    //   90: instanceof 462
    //   93: ifeq +62 -> 155
    //   96: aload 13
    //   98: checkcast 462	bsh/BSHMethodInvocation
    //   101: astore 42
    //   103: aload 42
    //   105: invokevirtual 465	bsh/BSHMethodInvocation:a	()Lbsh/BSHAmbiguousName;
    //   108: astore 43
    //   110: aload 43
    //   112: getfield 470	bsh/BSHAmbiguousName:text	Ljava/lang/String;
    //   115: ldc_w 472
    //   118: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   121: ifne +17 -> 138
    //   124: aload 43
    //   126: getfield 470	bsh/BSHAmbiguousName:text	Ljava/lang/String;
    //   129: ldc_w 474
    //   132: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   135: ifeq +20 -> 155
    //   138: aload 43
    //   140: getfield 470	bsh/BSHAmbiguousName:text	Ljava/lang/String;
    //   143: astore 15
    //   145: aload 42
    //   147: invokevirtual 477	bsh/BSHMethodInvocation:b	()Lbsh/BSHArguments;
    //   150: astore 14
    //   152: goto +9 -> 161
    //   155: aconst_null
    //   156: astore 14
    //   158: aconst_null
    //   159: astore 15
    //   161: aload 15
    //   163: ifnonnull +7 -> 170
    //   166: getstatic 443	bsh/ClassGeneratorUtil$ConstructorArgs:DEFAULT	Lbsh/ClassGeneratorUtil$ConstructorArgs;
    //   169: areturn
    //   170: new 119	bsh/NameSpace
    //   173: dup
    //   174: aload_1
    //   175: invokevirtual 434	bsh/This:getNameSpace	()Lbsh/NameSpace;
    //   178: ldc_w 479
    //   181: invokespecial 482	bsh/NameSpace:<init>	(Lbsh/NameSpace;Ljava/lang/String;)V
    //   184: astore 16
    //   186: aload 10
    //   188: invokevirtual 486	bsh/DelayedEvalBshMethod:getParameterNames	()[Ljava/lang/String;
    //   191: astore 17
    //   193: aload 10
    //   195: invokevirtual 490	bsh/DelayedEvalBshMethod:getParameterTypes	()[Ljava/lang/Class;
    //   198: astore 18
    //   200: iconst_0
    //   201: istore 19
    //   203: iload 19
    //   205: aload_2
    //   206: arraylength
    //   207: if_icmplt +305 -> 512
    //   210: new 492	bsh/CallStack
    //   213: dup
    //   214: invokespecial 493	bsh/CallStack:<init>	()V
    //   217: astore 20
    //   219: aload 20
    //   221: aload 16
    //   223: invokevirtual 497	bsh/CallStack:push	(Lbsh/NameSpace;)V
    //   226: aload_1
    //   227: getfield 500	bsh/This:b	Lbsh/Interpreter;
    //   230: astore 21
    //   232: aload 14
    //   234: aload 20
    //   236: aload 21
    //   238: invokevirtual 506	bsh/BSHArguments:getArguments	(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Object;
    //   241: astore 26
    //   243: aload 26
    //   245: invokestatic 512	bsh/Types:getTypes	([Ljava/lang/Object;)[Ljava/lang/Class;
    //   248: astore 27
    //   250: aload 26
    //   252: invokestatic 514	bsh/Primitive:unwrap	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   255: astore 28
    //   257: aload 21
    //   259: invokevirtual 520	bsh/Interpreter:getClassManager	()Lbsh/BshClassManager;
    //   262: aload_0
    //   263: invokevirtual 525	bsh/BshClassManager:classForName	(Ljava/lang/String;)Ljava/lang/Class;
    //   266: astore 29
    //   268: aload 29
    //   270: ifnonnull +41 -> 311
    //   273: new 46	java/lang/StringBuffer
    //   276: dup
    //   277: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   280: astore 30
    //   282: aload 30
    //   284: ldc_w 527
    //   287: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   290: pop
    //   291: aload 30
    //   293: aload_0
    //   294: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   297: pop
    //   298: new 126	bsh/InterpreterError
    //   301: dup
    //   302: aload 30
    //   304: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   307: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   310: athrow
    //   311: aload 29
    //   313: invokevirtual 94	java/lang/Class:getDeclaredConstructors	()[Ljava/lang/reflect/Constructor;
    //   316: astore 33
    //   318: aload 15
    //   320: ldc_w 472
    //   323: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   326: ifeq +42 -> 368
    //   329: aload 27
    //   331: aload 33
    //   333: invokestatic 530	bsh/Reflect:b	([Ljava/lang/Class;[Ljava/lang/reflect/Constructor;)I
    //   336: istore 37
    //   338: iload 37
    //   340: iload 9
    //   342: if_icmpne +14 -> 356
    //   345: new 126	bsh/InterpreterError
    //   348: dup
    //   349: ldc_w 532
    //   352: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   355: athrow
    //   356: new 439	bsh/ClassGeneratorUtil$ConstructorArgs
    //   359: dup
    //   360: iload 37
    //   362: aload 28
    //   364: invokespecial 535	bsh/ClassGeneratorUtil$ConstructorArgs:<init>	(I[Ljava/lang/Object;)V
    //   367: areturn
    //   368: aload 8
    //   370: arraylength
    //   371: anewarray 536	[Ljava/lang/Class;
    //   374: astore 34
    //   376: iload 12
    //   378: aload 34
    //   380: arraylength
    //   381: if_icmplt +71 -> 452
    //   384: aload 27
    //   386: aload 34
    //   388: invokestatic 539	bsh/Reflect:a	([Ljava/lang/Class;[[Ljava/lang/Class;)I
    //   391: istore 35
    //   393: iload 35
    //   395: iload 9
    //   397: if_icmpne +14 -> 411
    //   400: new 126	bsh/InterpreterError
    //   403: dup
    //   404: ldc_w 541
    //   407: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   410: athrow
    //   411: iload 35
    //   413: aload 33
    //   415: arraylength
    //   416: iadd
    //   417: istore 36
    //   419: iload 36
    //   421: iload_3
    //   422: aload 33
    //   424: arraylength
    //   425: iadd
    //   426: if_icmpne +14 -> 440
    //   429: new 126	bsh/InterpreterError
    //   432: dup
    //   433: ldc_w 543
    //   436: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   439: athrow
    //   440: new 439	bsh/ClassGeneratorUtil$ConstructorArgs
    //   443: dup
    //   444: iload 36
    //   446: aload 28
    //   448: invokespecial 535	bsh/ClassGeneratorUtil$ConstructorArgs:<init>	(I[Ljava/lang/Object;)V
    //   451: areturn
    //   452: aload 34
    //   454: iload 12
    //   456: aload 8
    //   458: iload 12
    //   460: aaload
    //   461: invokevirtual 490	bsh/DelayedEvalBshMethod:getParameterTypes	()[Ljava/lang/Class;
    //   464: aastore
    //   465: iinc 12 1
    //   468: goto -92 -> 376
    //   471: astore 22
    //   473: new 46	java/lang/StringBuffer
    //   476: dup
    //   477: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   480: astore 23
    //   482: aload 23
    //   484: ldc_w 545
    //   487: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   490: pop
    //   491: aload 23
    //   493: aload 22
    //   495: invokevirtual 176	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   498: pop
    //   499: new 126	bsh/InterpreterError
    //   502: dup
    //   503: aload 23
    //   505: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   508: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   511: athrow
    //   512: aload 16
    //   514: aload 17
    //   516: iload 19
    //   518: aaload
    //   519: aload 18
    //   521: iload 19
    //   523: aaload
    //   524: aload_2
    //   525: iload 19
    //   527: aaload
    //   528: aconst_null
    //   529: invokevirtual 549	bsh/NameSpace:setTypedVariable	(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    //   532: iinc 19 1
    //   535: iconst_m1
    //   536: istore 9
    //   538: iconst_0
    //   539: istore 12
    //   541: goto -338 -> 203
    //   544: astore 38
    //   546: new 46	java/lang/StringBuffer
    //   549: dup
    //   550: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   553: astore 39
    //   555: aload 39
    //   557: ldc_w 551
    //   560: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   563: pop
    //   564: aload 39
    //   566: aload 38
    //   568: invokevirtual 176	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   571: pop
    //   572: new 126	bsh/InterpreterError
    //   575: dup
    //   576: aload 39
    //   578: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   581: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   584: athrow
    //   585: astore 4
    //   587: new 46	java/lang/StringBuffer
    //   590: dup
    //   591: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   594: astore 5
    //   596: aload 5
    //   598: ldc_w 553
    //   601: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   604: pop
    //   605: aload 5
    //   607: aload 4
    //   609: invokevirtual 176	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   612: pop
    //   613: new 126	bsh/InterpreterError
    //   616: dup
    //   617: aload 5
    //   619: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   622: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   625: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	626	0	paramString	String
    //   0	626	1	paramThis	This
    //   0	626	2	paramArrayOfObject	Object[]
    //   0	626	3	paramInt	int
    //   585	23	4	localException	Exception
    //   594	24	5	localStringBuffer1	StringBuffer
    //   12	445	8	arrayOfDelayedEvalBshMethod	DelayedEvalBshMethod[]
    //   15	522	9	i1	int
    //   31	163	10	localDelayedEvalBshMethod	DelayedEvalBshMethod
    //   53	6	11	localBSHBlock	BSHBlock
    //   56	484	12	i2	int
    //   67	30	13	localSimpleNode	SimpleNode
    //   150	83	14	localBSHArguments	BSHArguments
    //   143	176	15	str	String
    //   184	329	16	localNameSpace	NameSpace
    //   191	324	17	arrayOfString	String[]
    //   198	322	18	arrayOfClass1	Class[]
    //   201	332	19	i3	int
    //   217	18	20	localCallStack	CallStack
    //   230	28	21	localInterpreter	Interpreter
    //   471	23	22	localEvalError	EvalError
    //   480	24	23	localStringBuffer2	StringBuffer
    //   241	10	26	arrayOfObject1	Object[]
    //   248	137	27	arrayOfClass2	Class[]
    //   255	192	28	arrayOfObject2	Object[]
    //   266	46	29	localClass	Class
    //   280	23	30	localStringBuffer3	StringBuffer
    //   316	107	33	arrayOfConstructor	Constructor[]
    //   374	79	34	arrayOfClass	Class[][]
    //   391	26	35	i4	int
    //   417	28	36	i5	int
    //   336	25	37	i6	int
    //   544	23	38	localUtilEvalError	UtilEvalError
    //   553	24	39	localStringBuffer4	StringBuffer
    //   101	45	42	localBSHMethodInvocation	BSHMethodInvocation
    //   108	31	43	localBSHAmbiguousName	BSHAmbiguousName
    // Exception table:
    //   from	to	target	type
    //   232	243	471	bsh/EvalError
    //   512	532	544	bsh/UtilEvalError
    //   0	14	585	java/lang/Exception
  }
  
  /* Error */
  public static void initInstance(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 512	bsh/Types:getTypes	([Ljava/lang/Object;)[Ljava/lang/Class;
    //   4: astore_3
    //   5: new 492	bsh/CallStack
    //   8: dup
    //   9: invokespecial 493	bsh/CallStack:<init>	()V
    //   12: astore 4
    //   14: aload_0
    //   15: aload_1
    //   16: invokestatic 557	bsh/ClassGeneratorUtil:a	(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;
    //   19: astore 5
    //   21: aload 5
    //   23: ifnonnull +265 -> 288
    //   26: aload_0
    //   27: invokevirtual 561	java/lang/Object:getClass	()Ljava/lang/Class;
    //   30: aload_1
    //   31: invokestatic 563	bsh/ClassGeneratorUtil:a	(Ljava/lang/Class;Ljava/lang/String;)Lbsh/This;
    //   34: astore 19
    //   36: aload 19
    //   38: getfield 500	bsh/This:b	Lbsh/Interpreter;
    //   41: astore 8
    //   43: aload 19
    //   45: invokevirtual 434	bsh/This:getNameSpace	()Lbsh/NameSpace;
    //   48: ldc_w 565
    //   51: invokevirtual 438	bsh/NameSpace:getVariable	(Ljava/lang/String;)Ljava/lang/Object;
    //   54: checkcast 448	bsh/BSHBlock
    //   57: astore 24
    //   59: new 119	bsh/NameSpace
    //   62: dup
    //   63: aload 19
    //   65: invokevirtual 434	bsh/This:getNameSpace	()Lbsh/NameSpace;
    //   68: aload_1
    //   69: invokespecial 482	bsh/NameSpace:<init>	(Lbsh/NameSpace;Ljava/lang/String;)V
    //   72: astore 7
    //   74: aload 7
    //   76: iconst_1
    //   77: putfield 567	bsh/NameSpace:d	Z
    //   80: aload 7
    //   82: aload 8
    //   84: invokevirtual 570	bsh/NameSpace:a	(Lbsh/Interpreter;)Lbsh/This;
    //   87: astore 25
    //   89: new 46	java/lang/StringBuffer
    //   92: dup
    //   93: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   96: astore 26
    //   98: aload 26
    //   100: ldc -77
    //   102: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   105: pop
    //   106: aload 26
    //   108: aload_1
    //   109: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   112: pop
    //   113: aload_0
    //   114: aload 26
    //   116: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   119: invokestatic 573	bsh/Reflect:a	(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;
    //   122: aload 25
    //   124: iconst_0
    //   125: invokevirtual 579	bsh/LHS:assign	(Ljava/lang/Object;Z)Ljava/lang/Object;
    //   128: pop
    //   129: aload 7
    //   131: aload_0
    //   132: invokevirtual 581	bsh/NameSpace:a	(Ljava/lang/Object;)V
    //   135: aload 4
    //   137: aload 7
    //   139: invokevirtual 497	bsh/CallStack:push	(Lbsh/NameSpace;)V
    //   142: aload 24
    //   144: aload 4
    //   146: aload 8
    //   148: iconst_1
    //   149: getstatic 587	bsh/ClassGeneratorImpl$ClassNodeFilter:CLASSINSTANCE	Lbsh/ClassGeneratorImpl$ClassNodeFilter;
    //   152: invokevirtual 590	bsh/BSHBlock:a	(Lbsh/CallStack;Lbsh/Interpreter;ZLbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;
    //   155: pop
    //   156: aload 4
    //   158: invokevirtual 593	bsh/CallStack:pop	()Lbsh/NameSpace;
    //   161: pop
    //   162: goto +144 -> 306
    //   165: astore 34
    //   167: new 46	java/lang/StringBuffer
    //   170: dup
    //   171: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   174: astore 35
    //   176: aload 35
    //   178: ldc_w 595
    //   181: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   184: pop
    //   185: aload 35
    //   187: aload 34
    //   189: invokevirtual 176	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   192: pop
    //   193: new 126	bsh/InterpreterError
    //   196: dup
    //   197: aload 35
    //   199: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   202: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   205: athrow
    //   206: astore 27
    //   208: new 46	java/lang/StringBuffer
    //   211: dup
    //   212: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   215: astore 28
    //   217: aload 28
    //   219: ldc_w 597
    //   222: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   225: pop
    //   226: aload 28
    //   228: aload 27
    //   230: invokevirtual 176	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   233: pop
    //   234: new 126	bsh/InterpreterError
    //   237: dup
    //   238: aload 28
    //   240: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   243: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   246: athrow
    //   247: astore 20
    //   249: new 46	java/lang/StringBuffer
    //   252: dup
    //   253: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   256: astore 21
    //   258: aload 21
    //   260: ldc_w 553
    //   263: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   266: pop
    //   267: aload 21
    //   269: aload 20
    //   271: invokevirtual 176	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   274: pop
    //   275: new 126	bsh/InterpreterError
    //   278: dup
    //   279: aload 21
    //   281: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   284: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   287: athrow
    //   288: aload 5
    //   290: getfield 500	bsh/This:b	Lbsh/Interpreter;
    //   293: astore 6
    //   295: aload 5
    //   297: invokevirtual 434	bsh/This:getNameSpace	()Lbsh/NameSpace;
    //   300: astore 7
    //   302: aload 6
    //   304: astore 8
    //   306: aload_1
    //   307: invokestatic 102	bsh/ClassGeneratorUtil:d	(Ljava/lang/String;)Ljava/lang/String;
    //   310: astore 9
    //   312: aload 7
    //   314: aload 9
    //   316: aload_3
    //   317: iconst_1
    //   318: invokevirtual 601	bsh/NameSpace:getMethod	(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;
    //   321: astore 14
    //   323: aload_2
    //   324: arraylength
    //   325: ifle +46 -> 371
    //   328: aload 14
    //   330: ifnonnull +41 -> 371
    //   333: new 46	java/lang/StringBuffer
    //   336: dup
    //   337: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   340: astore 15
    //   342: aload 15
    //   344: ldc_w 603
    //   347: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   350: pop
    //   351: aload 15
    //   353: aload_1
    //   354: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   357: pop
    //   358: new 126	bsh/InterpreterError
    //   361: dup
    //   362: aload 15
    //   364: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   367: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   370: athrow
    //   371: aload 14
    //   373: ifnull +16 -> 389
    //   376: aload 14
    //   378: aload_2
    //   379: aload 8
    //   381: aload 4
    //   383: aconst_null
    //   384: iconst_0
    //   385: invokevirtual 608	bsh/BshMethod:a	([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/SimpleNode;Z)Ljava/lang/Object;
    //   388: pop
    //   389: return
    //   390: astore 10
    //   392: aload 10
    //   394: instanceof 610
    //   397: ifeq +16 -> 413
    //   400: aload 10
    //   402: checkcast 610	bsh/TargetError
    //   405: invokevirtual 614	bsh/TargetError:getTarget	()Ljava/lang/Throwable;
    //   408: checkcast 161	java/lang/Exception
    //   411: astore 10
    //   413: aload 10
    //   415: instanceof 616
    //   418: ifeq +16 -> 434
    //   421: aload 10
    //   423: checkcast 616	java/lang/reflect/InvocationTargetException
    //   426: invokevirtual 619	java/lang/reflect/InvocationTargetException:getTargetException	()Ljava/lang/Throwable;
    //   429: checkcast 161	java/lang/Exception
    //   432: astore 10
    //   434: aload 10
    //   436: getstatic 625	java/lang/System:err	Ljava/io/PrintStream;
    //   439: invokestatic 630	com/a/a/a/a/a/a/a:a	(Ljava/lang/Throwable;Ljava/io/PrintStream;)V
    //   442: new 46	java/lang/StringBuffer
    //   445: dup
    //   446: invokespecial 47	java/lang/StringBuffer:<init>	()V
    //   449: astore 11
    //   451: aload 11
    //   453: ldc_w 595
    //   456: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   459: pop
    //   460: aload 11
    //   462: aload 10
    //   464: invokevirtual 176	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   467: pop
    //   468: new 126	bsh/InterpreterError
    //   471: dup
    //   472: aload 11
    //   474: invokevirtual 63	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   477: invokespecial 131	bsh/InterpreterError:<init>	(Ljava/lang/String;)V
    //   480: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	481	0	paramObject	Object
    //   0	481	1	paramString	String
    //   0	481	2	paramArrayOfObject	Object[]
    //   4	313	3	arrayOfClass	Class[]
    //   12	370	4	localCallStack	CallStack
    //   19	277	5	localThis1	This
    //   293	10	6	localInterpreter	Interpreter
    //   72	241	7	localNameSpace	NameSpace
    //   41	339	8	localObject	Object
    //   310	5	9	str	String
    //   390	11	10	localException1	Exception
    //   411	52	10	localException2	Exception
    //   449	24	11	localStringBuffer1	StringBuffer
    //   321	56	14	localBshMethod	BshMethod
    //   340	23	15	localStringBuffer2	StringBuffer
    //   34	30	19	localThis2	This
    //   247	23	20	localException3	Exception
    //   256	24	21	localStringBuffer3	StringBuffer
    //   57	86	24	localBSHBlock	BSHBlock
    //   87	36	25	localThis3	This
    //   96	19	26	localStringBuffer4	StringBuffer
    //   206	23	27	localException4	Exception
    //   215	24	28	localStringBuffer5	StringBuffer
    //   165	23	34	localException5	Exception
    //   174	24	35	localStringBuffer6	StringBuffer
    // Exception table:
    //   from	to	target	type
    //   142	156	165	java/lang/Exception
    //   89	129	206	java/lang/Exception
    //   43	59	247	java/lang/Exception
    //   312	328	390	java/lang/Exception
    //   333	371	390	java/lang/Exception
    //   376	389	390	java/lang/Exception
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, CodeVisitor paramCodeVisitor)
  {
    Label localLabel1 = new Label();
    Label localLabel2 = new Label();
    int i1 = this.g.length + this.h.length;
    Label[] arrayOfLabel = new Label[i1];
    for (int i2 = 0;; i2++)
    {
      if (i2 >= i1)
      {
        paramCodeVisitor.visitLdcInsn(this.c.getName());
        String str1 = this.b;
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("_bshStatic");
        localStringBuffer.append(this.a);
        paramCodeVisitor.visitFieldInsn(178, str1, localStringBuffer.toString(), "Lbsh/This;");
        paramCodeVisitor.visitVarInsn(25, paramInt2);
        paramCodeVisitor.visitIntInsn(16, paramInt1);
        paramCodeVisitor.visitMethodInsn(184, "bsh/ClassGeneratorUtil", "getConstructorArgs", "(Ljava/lang/String;Lbsh/This;[Ljava/lang/Object;I)Lbsh/ClassGeneratorUtil$ConstructorArgs;");
        paramCodeVisitor.visitVarInsn(58, paramInt3);
        paramCodeVisitor.visitVarInsn(25, paramInt3);
        paramCodeVisitor.visitFieldInsn(180, "bsh/ClassGeneratorUtil$ConstructorArgs", "selector", "I");
        paramCodeVisitor.visitTableSwitchInsn(0, i1 - 1, localLabel1, arrayOfLabel);
        int i3 = 0;
        for (int i4 = 0;; i4++)
        {
          if (i3 >= this.g.length)
          {
            int i5 = 0;
            for (;;)
            {
              if (i5 >= this.h.length)
              {
                paramCodeVisitor.visitLabel(localLabel1);
                paramCodeVisitor.visitVarInsn(25, 0);
                paramCodeVisitor.visitMethodInsn(183, this.d, "<init>", "()V");
                paramCodeVisitor.visitLabel(localLabel2);
                return;
              }
              String str3 = this.b;
              String[] arrayOfString2 = this.h[i5].getParamTypeDescriptors();
              a(i4, str3, arrayOfString2, localLabel2, arrayOfLabel, paramInt3, paramCodeVisitor);
              i5++;
              i4++;
            }
          }
          String str2 = this.d;
          String[] arrayOfString1 = a(this.g[i3].getParameterTypes());
          a(i4, str2, arrayOfString1, localLabel2, arrayOfLabel, paramInt3, paramCodeVisitor);
          i3++;
        }
      }
      arrayOfLabel[i2] = new Label();
    }
  }
  
  void a(int paramInt1, String[] paramArrayOfString, int paramInt2, ClassWriter paramClassWriter)
  {
    int i1 = 1 + paramArrayOfString.length;
    int i2 = 2 + paramArrayOfString.length;
    CodeVisitor localCodeVisitor = paramClassWriter.visitMethod(paramInt2, "<init>", a("V", paramArrayOfString), null);
    generateParameterReifierCode(paramArrayOfString, false, localCodeVisitor);
    localCodeVisitor.visitVarInsn(58, i1);
    a(paramInt1, i1, i2, localCodeVisitor);
    localCodeVisitor.visitVarInsn(25, 0);
    localCodeVisitor.visitLdcInsn(this.a);
    localCodeVisitor.visitVarInsn(25, i1);
    localCodeVisitor.visitMethodInsn(184, "bsh/ClassGeneratorUtil", "initInstance", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V");
    localCodeVisitor.visitInsn(177);
    localCodeVisitor.visitMaxs(20, 20);
  }
  
  boolean a(Class paramClass, String paramString, String[] paramArrayOfString)
  {
    if (paramClass == null) {
      return false;
    }
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    for (int i1 = 0;; i1++)
    {
      if (i1 >= arrayOfMethod.length)
      {
        paramClass = paramClass.getSuperclass();
        break;
      }
      if (arrayOfMethod[i1].getName().equals(paramString))
      {
        String[] arrayOfString = a(arrayOfMethod[i1].getParameterTypes());
        for (int i2 = 0;; i2++)
        {
          int i3;
          if (i2 >= arrayOfString.length)
          {
            i3 = 1;
          }
          else
          {
            if (paramArrayOfString[i2].equals(arrayOfString[i2])) {
              continue;
            }
            i3 = 0;
          }
          if (i3 == 0) {
            break;
          }
          return true;
        }
      }
    }
  }
  
  public byte[] generateClass()
  {
    int i1 = 0x1 | a(this.k);
    if (this.l) {
      i1 |= 0x200;
    }
    int i2 = i1;
    String[] arrayOfString1 = new String[this.e.length];
    for (int i3 = 0;; i3++)
    {
      if (i3 >= this.e.length)
      {
        Object localObject1 = new ClassWriter(false);
        String str1 = this.b;
        String str2 = this.d;
        ((ClassWriter)localObject1).visit(i2, str1, str2, arrayOfString1, "BeanShell Generated via ASM (www.objectweb.org)");
        if (!this.l)
        {
          StringBuffer localStringBuffer1 = new StringBuffer();
          localStringBuffer1.append("_bshThis");
          localStringBuffer1.append(this.a);
          a(localStringBuffer1.toString(), "Lbsh/This;", 1, (ClassWriter)localObject1);
          StringBuffer localStringBuffer2 = new StringBuffer();
          localStringBuffer2.append("_bshStatic");
          localStringBuffer2.append(this.a);
          a(localStringBuffer2.toString(), "Lbsh/This;", 9, (ClassWriter)localObject1);
        }
        int i4 = 0;
        for (;;)
        {
          if (i4 >= this.f.length)
          {
            int i6 = 0;
            int i7 = 0;
            for (;;)
            {
              if (i6 >= this.h.length)
              {
                if ((!this.l) && (i7 == 0)) {
                  a(-1, new String[0], 1, (ClassWriter)localObject1);
                }
                int i9 = 0;
                for (;;)
                {
                  if (i9 >= this.i.length) {
                    return ((ClassWriter)localObject1).toByteArray();
                  }
                  String str4 = this.i[i9].getReturnTypeDescriptor();
                  Object localObject4;
                  if (this.i[i9].hasModifier("private"))
                  {
                    localObject4 = localObject1;
                  }
                  else
                  {
                    int i10 = a(this.i[i9].getModifiers());
                    if (this.l) {
                      i10 |= 0x401;
                    }
                    String str5 = this.a;
                    String str6 = this.b;
                    String str7 = this.i[i9].getName();
                    String[] arrayOfString2 = this.i[i9].getParamTypeDescriptors();
                    int i11 = i10;
                    localObject4 = localObject1;
                    a(str5, str6, str7, str4, arrayOfString2, i11, (ClassWriter)localObject1);
                    int i12;
                    if ((i10 & 0x8) > 0) {
                      i12 = 1;
                    } else {
                      i12 = 0;
                    }
                    boolean bool = a(this.c, this.i[i9].getName(), this.i[i9].getParamTypeDescriptors());
                    if ((i12 == 0) && (bool)) {
                      a(this.d, this.i[i9].getName(), str4, this.i[i9].getParamTypeDescriptors(), i10, (ClassWriter)localObject4);
                    }
                  }
                  i9++;
                  localObject1 = localObject4;
                }
              }
              Object localObject3 = localObject1;
              if (!this.h[i6].hasModifier("private"))
              {
                int i8 = a(this.h[i6].getModifiers());
                a(i6, this.h[i6].getParamTypeDescriptors(), i8, (ClassWriter)localObject3);
                i7 = 1;
              }
              i6++;
              localObject1 = localObject3;
            }
          }
          Object localObject2 = localObject1;
          String str3 = this.f[i4].getTypeDescriptor();
          if ((!this.f[i4].hasModifier("private")) && (str3 != null))
          {
            int i5;
            if (this.l) {
              i5 = 25;
            } else {
              i5 = a(this.f[i4].getModifiers());
            }
            a(this.f[i4].getName(), str3, i5, (ClassWriter)localObject2);
          }
          i4++;
          localObject1 = localObject2;
        }
      }
      arrayOfString1[i3] = Type.getInternalName(this.e[i3]);
    }
  }
  
  public static class ConstructorArgs
  {
    public static ConstructorArgs DEFAULT = new ConstructorArgs();
    Object[] a;
    int b = 0;
    public int selector = -1;
    
    ConstructorArgs() {}
    
    ConstructorArgs(int paramInt, Object[] paramArrayOfObject)
    {
      this.selector = paramInt;
      this.a = paramArrayOfObject;
    }
    
    Object a()
    {
      Object[] arrayOfObject = this.a;
      int i = this.b;
      this.b = (i + 1);
      return arrayOfObject[i];
    }
    
    public boolean getBoolean()
    {
      return ((Boolean)a()).booleanValue();
    }
    
    public byte getByte()
    {
      return ((Byte)a()).byteValue();
    }
    
    public char getChar()
    {
      return ((Character)a()).charValue();
    }
    
    public double getDouble()
    {
      return ((Double)a()).doubleValue();
    }
    
    public float getFloat()
    {
      return ((Float)a()).floatValue();
    }
    
    public int getInt()
    {
      return ((Integer)a()).intValue();
    }
    
    public long getLong()
    {
      return ((Long)a()).longValue();
    }
    
    public Object getObject()
    {
      return a();
    }
    
    public short getShort()
    {
      return ((Short)a()).shortValue();
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\ClassGeneratorUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */