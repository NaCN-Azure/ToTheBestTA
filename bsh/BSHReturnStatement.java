package bsh;

class BSHReturnStatement
  extends SimpleNode
  implements ParserConstants
{
  public int kind;
  
  BSHReturnStatement(int paramInt)
  {
    super(paramInt);
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    Object localObject;
    if (jjtGetNumChildren() > 0) {
      localObject = ((SimpleNode)jjtGetChild(0)).eval(paramCallStack, paramInterpreter);
    } else {
      localObject = Primitive.VOID;
    }
    return new ReturnControl(this.kind, localObject, this);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHReturnStatement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */