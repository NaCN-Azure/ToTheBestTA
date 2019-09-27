package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

class BSHAllocationExpression
  extends SimpleNode
{
  private static int a;
  
  BSHAllocationExpression(int paramInt)
  {
    super(paramInt);
  }
  
  private Object a(BSHAmbiguousName paramBSHAmbiguousName, BSHArguments paramBSHArguments, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    paramCallStack.top();
    Object[] arrayOfObject = paramBSHArguments.getArguments(paramCallStack, paramInterpreter);
    if (arrayOfObject == null) {
      throw new EvalError("Null args in new.", this, paramCallStack);
    }
    paramBSHAmbiguousName.a(paramCallStack, paramInterpreter, false);
    Object localObject = paramBSHAmbiguousName.a(paramCallStack, paramInterpreter, true);
    if ((localObject instanceof ClassIdentifier))
    {
      Class localClass = ((ClassIdentifier)localObject).getTargetClass();
      int i = jjtGetNumChildren();
      int j = 0;
      if (i > 2) {
        j = 1;
      }
      if (j != 0)
      {
        BSHBlock localBSHBlock = (BSHBlock)jjtGetChild(2);
        if (localClass.isInterface()) {
          return b(localClass, arrayOfObject, localBSHBlock, paramCallStack, paramInterpreter);
        }
        return a(localClass, arrayOfObject, localBSHBlock, paramCallStack, paramInterpreter);
      }
      return a(localClass, arrayOfObject, paramCallStack);
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Unknown class: ");
    localStringBuffer.append(paramBSHAmbiguousName.text);
    throw new EvalError(localStringBuffer.toString(), this, paramCallStack);
  }
  
  private Object a(BSHAmbiguousName paramBSHAmbiguousName, BSHArrayDimensions paramBSHArrayDimensions, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    NameSpace localNameSpace = paramCallStack.top();
    Class localClass = paramBSHAmbiguousName.toClass(paramCallStack, paramInterpreter);
    if (localClass == null)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("Class ");
      localStringBuffer.append(paramBSHAmbiguousName.getName(localNameSpace));
      localStringBuffer.append(" not found.");
      throw new EvalError(localStringBuffer.toString(), this, paramCallStack);
    }
    return a(paramBSHArrayDimensions, localClass, paramCallStack, paramInterpreter);
  }
  
  private Object a(BSHArrayDimensions paramBSHArrayDimensions, Class paramClass, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    Object localObject = paramBSHArrayDimensions.eval(paramClass, paramCallStack, paramInterpreter);
    if (localObject != Primitive.VOID) {
      return localObject;
    }
    return a(paramClass, paramBSHArrayDimensions, paramCallStack);
  }
  
  private Object a(BSHPrimitiveType paramBSHPrimitiveType, BSHArrayDimensions paramBSHArrayDimensions, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    return a(paramBSHArrayDimensions, paramBSHPrimitiveType.getType(), paramCallStack, paramInterpreter);
  }
  
  private Object a(Class paramClass, BSHArrayDimensions paramBSHArrayDimensions, CallStack paramCallStack)
  {
    if (paramBSHArrayDimensions.numUndefinedDims > 0) {
      paramClass = Array.newInstance(paramClass, new int[paramBSHArrayDimensions.numUndefinedDims]).getClass();
    }
    try
    {
      Object localObject = Array.newInstance(paramClass, paramBSHArrayDimensions.definedDimensions);
      return localObject;
    }
    catch (Exception localException)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("Can't construct primitive array: ");
      localStringBuffer.append(localException.getMessage());
      throw new EvalError(localStringBuffer.toString(), this, paramCallStack);
    }
    catch (NegativeArraySizeException localNegativeArraySizeException)
    {
      throw new TargetError(localNegativeArraySizeException, this, paramCallStack);
    }
  }
  
  /* Error */
  private Object a(Class paramClass, Object[] paramArrayOfObject, BSHBlock paramBSHBlock, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    // Byte code:
    //   0: new 70	java/lang/StringBuffer
    //   3: dup
    //   4: invokespecial 72	java/lang/StringBuffer:<init>	()V
    //   7: astore 6
    //   9: aload 6
    //   11: aload 4
    //   13: invokevirtual 19	bsh/CallStack:top	()Lbsh/NameSpace;
    //   16: invokevirtual 164	bsh/NameSpace:getName	()Ljava/lang/String;
    //   19: invokevirtual 78	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   22: pop
    //   23: aload 6
    //   25: ldc -90
    //   27: invokevirtual 78	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   30: pop
    //   31: iconst_1
    //   32: getstatic 168	bsh/BSHAllocationExpression:a	I
    //   35: iadd
    //   36: istore 9
    //   38: iload 9
    //   40: putstatic 168	bsh/BSHAllocationExpression:a	I
    //   43: aload 6
    //   45: iload 9
    //   47: invokevirtual 171	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   50: pop
    //   51: aload 6
    //   53: invokevirtual 86	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   56: astore 11
    //   58: new 173	bsh/Modifiers
    //   61: dup
    //   62: invokespecial 174	bsh/Modifiers:<init>	()V
    //   65: astore 12
    //   67: aload 12
    //   69: iconst_0
    //   70: ldc -80
    //   72: invokevirtual 180	bsh/Modifiers:addModifier	(ILjava/lang/String;)V
    //   75: invokestatic 186	bsh/ClassGenerator:getClassGenerator	()Lbsh/ClassGenerator;
    //   78: aload 11
    //   80: aload 12
    //   82: aconst_null
    //   83: aload_1
    //   84: aload_3
    //   85: iconst_0
    //   86: aload 4
    //   88: aload 5
    //   90: invokevirtual 190	bsh/ClassGenerator:generateClass	(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;ZLbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    //   93: astore 14
    //   95: aload 14
    //   97: aload_2
    //   98: invokestatic 195	bsh/Reflect:a	(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   101: astore 20
    //   103: aload 20
    //   105: areturn
    //   106: astore 15
    //   108: aload 15
    //   110: instanceof 197
    //   113: ifeq +19 -> 132
    //   116: aload 15
    //   118: checkcast 197	java/lang/reflect/InvocationTargetException
    //   121: invokevirtual 201	java/lang/reflect/InvocationTargetException:getTargetException	()Ljava/lang/Throwable;
    //   124: checkcast 130	java/lang/Exception
    //   127: astore 16
    //   129: goto +7 -> 136
    //   132: aload 15
    //   134: astore 16
    //   136: new 70	java/lang/StringBuffer
    //   139: dup
    //   140: invokespecial 72	java/lang/StringBuffer:<init>	()V
    //   143: astore 17
    //   145: aload 17
    //   147: ldc -53
    //   149: invokevirtual 78	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   152: pop
    //   153: aload 17
    //   155: aload 16
    //   157: invokevirtual 100	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   160: pop
    //   161: new 27	bsh/EvalError
    //   164: dup
    //   165: aload 17
    //   167: invokevirtual 86	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   170: aload_0
    //   171: aload 4
    //   173: invokespecial 32	bsh/EvalError:<init>	(Ljava/lang/String;Lbsh/SimpleNode;Lbsh/CallStack;)V
    //   176: athrow
    //   177: astore 13
    //   179: aload 13
    //   181: aload_0
    //   182: aload 4
    //   184: invokevirtual 207	bsh/UtilEvalError:toEvalError	(Lbsh/SimpleNode;Lbsh/CallStack;)Lbsh/EvalError;
    //   187: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	this	BSHAllocationExpression
    //   0	188	1	paramClass	Class
    //   0	188	2	paramArrayOfObject	Object[]
    //   0	188	3	paramBSHBlock	BSHBlock
    //   0	188	4	paramCallStack	CallStack
    //   0	188	5	paramInterpreter	Interpreter
    //   7	45	6	localStringBuffer1	StringBuffer
    //   36	10	9	i	int
    //   56	23	11	str	String
    //   65	16	12	localModifiers	Modifiers
    //   177	3	13	localUtilEvalError	UtilEvalError
    //   93	3	14	localClass	Class
    //   106	27	15	localException1	Exception
    //   127	29	16	localException2	Exception
    //   143	23	17	localStringBuffer2	StringBuffer
    //   101	3	20	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   95	103	106	java/lang/Exception
    //   75	95	177	bsh/UtilEvalError
  }
  
  private Object a(Class paramClass, Object[] paramArrayOfObject, CallStack paramCallStack)
  {
    try
    {
      Object localObject = Reflect.a(paramClass, paramArrayOfObject);
      String str = paramClass.getName();
      if (str.indexOf("$") == -1) {
        return localObject;
      }
      NameSpace localNameSpace = Name.a(paramCallStack.top().a(null).getNameSpace());
      if (localNameSpace != null)
      {
        StringBuffer localStringBuffer3 = new StringBuffer();
        localStringBuffer3.append(localNameSpace.getName());
        localStringBuffer3.append("$");
        if (str.startsWith(localStringBuffer3.toString())) {
          try
          {
            ClassGenerator.getClassGenerator().setInstanceNameSpaceParent(localObject, str, localNameSpace);
            return localObject;
          }
          catch (UtilEvalError localUtilEvalError)
          {
            throw localUtilEvalError.toEvalError(this, paramCallStack);
          }
        }
      }
      return localObject;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("The constructor threw an exception:\n\t");
      localStringBuffer2.append(localInvocationTargetException.getTargetException());
      Interpreter.debug(localStringBuffer2.toString());
      TargetError localTargetError = new TargetError("Object constructor", localInvocationTargetException.getTargetException(), this, paramCallStack, true);
      throw localTargetError;
    }
    catch (ReflectError localReflectError)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append("Constructor error: ");
      localStringBuffer1.append(localReflectError.getMessage());
      throw new EvalError(localStringBuffer1.toString(), this, paramCallStack);
    }
  }
  
  private Object b(Class paramClass, Object[] paramArrayOfObject, BSHBlock paramBSHBlock, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    NameSpace localNameSpace = new NameSpace(paramCallStack.top(), "AnonymousBlock");
    paramCallStack.push(localNameSpace);
    paramBSHBlock.eval(paramCallStack, paramInterpreter, true);
    paramCallStack.pop();
    localNameSpace.importStatic(paramClass);
    try
    {
      Object localObject = localNameSpace.a(paramInterpreter).getInterface(paramClass);
      return localObject;
    }
    catch (UtilEvalError localUtilEvalError)
    {
      throw localUtilEvalError.toEvalError(this, paramCallStack);
    }
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    SimpleNode localSimpleNode1 = (SimpleNode)jjtGetChild(0);
    SimpleNode localSimpleNode2 = (SimpleNode)jjtGetChild(1);
    if ((localSimpleNode1 instanceof BSHAmbiguousName))
    {
      BSHAmbiguousName localBSHAmbiguousName = (BSHAmbiguousName)localSimpleNode1;
      if ((localSimpleNode2 instanceof BSHArguments)) {
        return a(localBSHAmbiguousName, (BSHArguments)localSimpleNode2, paramCallStack, paramInterpreter);
      }
      return a(localBSHAmbiguousName, (BSHArrayDimensions)localSimpleNode2, paramCallStack, paramInterpreter);
    }
    return a((BSHPrimitiveType)localSimpleNode1, (BSHArrayDimensions)localSimpleNode2, paramCallStack, paramInterpreter);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHAllocationExpression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */