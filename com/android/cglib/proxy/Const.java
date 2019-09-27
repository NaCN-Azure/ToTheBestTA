package com.android.cglib.proxy;

public class Const
{
  public static final String SUBCLASS_INVOKE_SUPER_SUFFIX = "_Super";
  public static final String SUBCLASS_SUFFIX = "_Enhancer";
  
  public static Class getPackedType(Class paramClass)
  {
    if (paramClass == Boolean.TYPE) {
      return Boolean.class;
    }
    if (paramClass == Byte.TYPE) {
      return Byte.class;
    }
    if (paramClass == Character.TYPE) {
      return Character.class;
    }
    if (paramClass == Double.TYPE) {
      return Double.class;
    }
    if (paramClass == Float.TYPE) {
      return Float.class;
    }
    if (paramClass == Integer.TYPE) {
      return Integer.class;
    }
    if (paramClass == Long.TYPE) {
      return Long.class;
    }
    if (paramClass == Short.TYPE) {
      paramClass = Short.class;
    }
    return paramClass;
  }
  
  public static String getPrimitiveValueMethodName(Class paramClass)
  {
    if (paramClass == Boolean.TYPE) {
      return "booleanValue";
    }
    if (paramClass == Byte.TYPE) {
      return "byteValue";
    }
    if (paramClass == Character.TYPE) {
      return "charValue";
    }
    if (paramClass == Double.TYPE) {
      return "doubleValue";
    }
    if (paramClass == Float.TYPE) {
      return "floatValue";
    }
    if (paramClass == Integer.TYPE) {
      return "intValue";
    }
    if (paramClass == Long.TYPE) {
      return "longValue";
    }
    if (paramClass == Short.TYPE) {
      return "shortValue";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramClass.getName());
    localStringBuilder.append(" dit not primitive class");
    throw new ProxyException(localStringBuilder.toString());
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\proxy\Const.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */