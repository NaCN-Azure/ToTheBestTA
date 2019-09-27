package bsh;

class BSHAmbiguousName
  extends SimpleNode
{
  public String text;
  
  BSHAmbiguousName(int paramInt)
  {
    super(paramInt);
  }
  
  Object a(CallStack paramCallStack, Interpreter paramInterpreter, boolean paramBoolean)
  {
    try
    {
      Object localObject = getName(paramCallStack.top()).toObject(paramCallStack, paramInterpreter, paramBoolean);
      return localObject;
    }
    catch (UtilEvalError localUtilEvalError)
    {
      throw localUtilEvalError.toEvalError(this, paramCallStack);
    }
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    throw new InterpreterError("Don't know how to eval an ambiguous name!  Use toObject() if you want an object.");
  }
  
  public Name getName(NameSpace paramNameSpace)
  {
    return paramNameSpace.b(this.text);
  }
  
  public Class toClass(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    try
    {
      Class localClass = getName(paramCallStack.top()).toClass();
      return localClass;
    }
    catch (UtilEvalError localUtilEvalError)
    {
      throw localUtilEvalError.toEvalError(this, paramCallStack);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new EvalError(localClassNotFoundException.getMessage(), this, paramCallStack);
    }
  }
  
  public LHS toLHS(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    try
    {
      LHS localLHS = getName(paramCallStack.top()).toLHS(paramCallStack, paramInterpreter);
      return localLHS;
    }
    catch (UtilEvalError localUtilEvalError)
    {
      throw localUtilEvalError.toEvalError(this, paramCallStack);
    }
  }
  
  public Object toObject(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    return a(paramCallStack, paramInterpreter, false);
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("AmbigousName: ");
    localStringBuffer.append(this.text);
    return localStringBuffer.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHAmbiguousName.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */