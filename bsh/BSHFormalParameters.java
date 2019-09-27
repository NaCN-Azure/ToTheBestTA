package bsh;

class BSHFormalParameters
  extends SimpleNode
{
  Class[] a;
  int b;
  String[] c;
  private String[] d;
  
  BSHFormalParameters(int paramInt)
  {
    super(paramInt);
  }
  
  void a()
  {
    if (this.d != null) {
      return;
    }
    this.b = jjtGetNumChildren();
    String[] arrayOfString = new String[this.b];
    for (int i = 0;; i++)
    {
      if (i >= this.b)
      {
        this.d = arrayOfString;
        return;
      }
      arrayOfString[i] = ((BSHFormalParameter)jjtGetChild(i)).name;
    }
  }
  
  public Object eval(CallStack paramCallStack, Interpreter paramInterpreter)
  {
    if (this.a != null) {
      return this.a;
    }
    a();
    Class[] arrayOfClass = new Class[this.b];
    for (int i = 0;; i++)
    {
      if (i >= this.b)
      {
        this.a = arrayOfClass;
        return arrayOfClass;
      }
      arrayOfClass[i] = ((Class)((BSHFormalParameter)jjtGetChild(i)).eval(paramCallStack, paramInterpreter));
    }
  }
  
  public String[] getParamNames()
  {
    a();
    return this.d;
  }
  
  public String[] getTypeDescriptors(CallStack paramCallStack, Interpreter paramInterpreter, String paramString)
  {
    if (this.c != null) {
      return this.c;
    }
    a();
    String[] arrayOfString = new String[this.b];
    for (int i = 0;; i++)
    {
      if (i >= this.b)
      {
        this.c = arrayOfString;
        return arrayOfString;
      }
      arrayOfString[i] = ((BSHFormalParameter)jjtGetChild(i)).getTypeDescriptor(paramCallStack, paramInterpreter, paramString);
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\BSHFormalParameters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */