package bsh;

import java.lang.reflect.Array;

class BSHArrayInitializer
  extends SimpleNode
{
  BSHArrayInitializer(int paramInt)
  {
    super(paramInt);
  }
  
  private void a(Class paramClass, Object paramObject, int paramInt, CallStack paramCallStack)
  {
    String str;
    if ((paramObject instanceof Primitive)) {
      str = ((Primitive)paramObject).getType().getName();
    } else {
      str = Reflect.normalizeClassName(paramObject.getClass());
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Incompatible type: ");
    localStringBuffer.append(str);
    localStringBuffer.append(" in initializer of array type: ");
    localStringBuffer.append(paramClass);
    localStringBuffer.append(" at position: ");
    localStringBuffer.append(paramInt);
    throw new EvalError(localStringBuffer.toString(), this, paramCallStack);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    throw new EvalError("Array initializer has no base type.", this, paramCallStack);
  }
  
  public Object eval(Class paramClass, int paramInt, CallStack paramCallStack, Interpreter paramInterpreter)
  {
    int i = jjtGetNumChildren();
    int[] arrayOfInt = new int[paramInt];
    arrayOfInt[0] = i;
    Object localObject1 = Array.newInstance(paramClass, arrayOfInt);
    for (int j = 0;; j++)
    {
      if (j >= i) {
        return localObject1;
      }
      SimpleNode localSimpleNode = (SimpleNode)jjtGetChild(j);
      Object localObject2;
      if ((localSimpleNode instanceof BSHArrayInitializer))
      {
        if (paramInt < 2)
        {
          StringBuffer localStringBuffer3 = new StringBuffer();
          localStringBuffer3.append("Invalid Location for Intializer, position: ");
          localStringBuffer3.append(j);
          throw new EvalError(localStringBuffer3.toString(), this, paramCallStack);
        }
        localObject2 = ((BSHArrayInitializer)localSimpleNode).eval(paramClass, paramInt - 1, paramCallStack, paramInterpreter);
      }
      else
      {
        localObject2 = localSimpleNode.eval(paramCallStack, paramInterpreter);
      }
      if (localObject2 == Primitive.VOID)
      {
        StringBuffer localStringBuffer1 = new StringBuffer();
        localStringBuffer1.append("Void in array initializer, position");
        localStringBuffer1.append(j);
        throw new EvalError(localStringBuffer1.toString(), this, paramCallStack);
      }
      Object localObject3;
      if (paramInt == 1) {
        try
        {
          Object localObject4 = Types.castObject(localObject2, paramClass, 0);
          localObject3 = Primitive.unwrap(localObject4);
        }
        catch (UtilEvalError localUtilEvalError)
        {
          throw localUtilEvalError.toEvalError("Error in array initializer", this, paramCallStack);
        }
      } else {
        localObject3 = localObject2;
      }
      StringBuffer localStringBuffer2;
      String str;
      try
      {
        Array.set(localObject1, j, localObject3);
      }
      catch (ArrayStoreException localArrayStoreException)
      {
        localStringBuffer2 = new StringBuffer();
        str = "arraystore";
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localStringBuffer2 = new StringBuffer();
        str = "illegal arg";
      }
      localStringBuffer2.append(str);
      localStringBuffer2.append(localIllegalArgumentException);
      Interpreter.debug(localStringBuffer2.toString());
      a(paramClass, localObject2, j, paramCallStack);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHArrayInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */