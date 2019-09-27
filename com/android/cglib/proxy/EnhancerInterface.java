package com.android.cglib.proxy;

public abstract interface EnhancerInterface
{
  public static final String EXECUTE_SUPER_METHOD_ENHANCER = "executeSuperMethod_Enhancer";
  public static final String SET_METHOD_INTERCEPTOR_ENHANCER = "setMethodInterceptor_Enhancer";
  
  public abstract Object executeSuperMethod_Enhancer(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject);
  
  public abstract void setMethodInterceptor_Enhancer(MethodInterceptor paramMethodInterceptor);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\proxy\EnhancerInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */