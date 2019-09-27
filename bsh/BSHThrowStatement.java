package bsh;

class BSHThrowStatement
  extends SimpleNode
{
  BSHThrowStatement(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    Object localObject = ((SimpleNode)jjtGetChild(0)).eval(paramCallStack, paramInterpreter);
    if (!(localObject instanceof Exception)) {
      throw new EvalError("Expression in 'throw' must be Exception type", this, paramCallStack);
    }
    throw new TargetError((Exception)localObject, this, paramCallStack);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHThrowStatement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */