package bsh.org.objectweb.asm;

import java.lang.reflect.Method;

public class Type
{
  public static final int ARRAY = 9;
  public static final int BOOLEAN = 1;
  public static final Type BOOLEAN_TYPE;
  public static final int BYTE = 3;
  public static final Type BYTE_TYPE;
  public static final int CHAR = 2;
  public static final Type CHAR_TYPE;
  public static final int DOUBLE = 8;
  public static final Type DOUBLE_TYPE = new Type(8);
  public static final int FLOAT = 6;
  public static final Type FLOAT_TYPE;
  public static final int INT = 5;
  public static final Type INT_TYPE;
  public static final int LONG = 7;
  public static final Type LONG_TYPE;
  public static final int OBJECT = 10;
  public static final int SHORT = 4;
  public static final Type SHORT_TYPE;
  public static final int VOID;
  public static final Type VOID_TYPE = new Type(0);
  private final int a;
  private char[] b;
  private int c;
  private int d;
  
  static
  {
    BOOLEAN_TYPE = new Type(1);
    CHAR_TYPE = new Type(2);
    BYTE_TYPE = new Type(3);
    SHORT_TYPE = new Type(4);
    INT_TYPE = new Type(5);
    FLOAT_TYPE = new Type(6);
    LONG_TYPE = new Type(7);
  }
  
  private Type(int paramInt)
  {
    this.a = paramInt;
    this.d = 1;
  }
  
  private Type(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramArrayOfChar;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  private static Type a(char[] paramArrayOfChar, int paramInt)
  {
    int k;
    switch (paramArrayOfChar[paramInt])
    {
    default: 
      k = 1;
      break;
    case '[': 
      for (int i = 1;; i++)
      {
        int j = paramInt + i;
        if (paramArrayOfChar[j] != '[')
        {
          if (paramArrayOfChar[j] == 'L') {
            do
            {
              i++;
            } while (paramArrayOfChar[(paramInt + i)] != ';');
          }
          return new Type(9, paramArrayOfChar, paramInt, i + 1);
        }
      }
    case 'Z': 
      return BOOLEAN_TYPE;
    case 'V': 
      return VOID_TYPE;
    case 'S': 
      return SHORT_TYPE;
    case 'J': 
      return LONG_TYPE;
    case 'I': 
      return INT_TYPE;
    case 'F': 
      return FLOAT_TYPE;
    case 'D': 
      return DOUBLE_TYPE;
    case 'C': 
      return CHAR_TYPE;
    case 'B': 
      return BYTE_TYPE;
    }
    for (;;)
    {
      if (paramArrayOfChar[(paramInt + k)] == ';') {
        return new Type(10, paramArrayOfChar, paramInt, k + 1);
      }
      k++;
    }
  }
  
  private void a(StringBuffer paramStringBuffer)
  {
    switch (this.a)
    {
    default: 
      paramStringBuffer.append(this.b, this.c, this.d);
      return;
    case 8: 
      paramStringBuffer.append('D');
      return;
    case 7: 
      paramStringBuffer.append('J');
      return;
    case 6: 
      paramStringBuffer.append('F');
      return;
    case 5: 
      paramStringBuffer.append('I');
      return;
    case 4: 
      paramStringBuffer.append('S');
      return;
    case 3: 
      paramStringBuffer.append('B');
      return;
    case 2: 
      paramStringBuffer.append('C');
      return;
    case 1: 
      paramStringBuffer.append('Z');
      return;
    }
    paramStringBuffer.append('V');
  }
  
  private static void a(StringBuffer paramStringBuffer, Class paramClass)
  {
    for (;;)
    {
      if (paramClass.isPrimitive())
      {
        char c2;
        if (paramClass == Integer.TYPE) {
          c2 = 'I';
        } else if (paramClass == Void.TYPE) {
          c2 = 'V';
        } else if (paramClass == Boolean.TYPE) {
          c2 = 'Z';
        } else if (paramClass == Byte.TYPE) {
          c2 = 'B';
        } else if (paramClass == Character.TYPE) {
          c2 = 'C';
        } else if (paramClass == Short.TYPE) {
          c2 = 'S';
        } else if (paramClass == Double.TYPE) {
          c2 = 'D';
        } else if (paramClass == Float.TYPE) {
          c2 = 'F';
        } else {
          c2 = 'J';
        }
        paramStringBuffer.append(c2);
        return;
      }
      if (!paramClass.isArray()) {
        break;
      }
      paramStringBuffer.append('[');
      paramClass = paramClass.getComponentType();
    }
    paramStringBuffer.append('L');
    String str = paramClass.getName();
    int i = str.length();
    for (int j = 0;; j++)
    {
      if (j >= i)
      {
        paramStringBuffer.append(';');
        return;
      }
      char c1 = str.charAt(j);
      if (c1 == '.') {
        c1 = '/';
      }
      paramStringBuffer.append(c1);
    }
  }
  
  public static Type[] getArgumentTypes(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    int i = 1;
    int j = 0;
    for (;;)
    {
      int k = i + 1;
      int m = arrayOfChar[i];
      if (m == 41)
      {
        Type[] arrayOfType = new Type[j];
        int n = 1;
        for (int i1 = 0;; i1++)
        {
          if (arrayOfChar[n] == ')') {
            return arrayOfType;
          }
          arrayOfType[i1] = a(arrayOfChar, n);
          n += arrayOfType[i1].d;
        }
      }
      if (m == 76) {
        for (;;)
        {
          i = k + 1;
          if (arrayOfChar[k] == ';')
          {
            j++;
            break;
          }
          k = i;
        }
      }
      if (m != 91) {
        j++;
      }
      i = k;
    }
  }
  
  public static Type[] getArgumentTypes(Method paramMethod)
  {
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    Type[] arrayOfType = new Type[arrayOfClass.length];
    for (int i = -1 + arrayOfClass.length;; i--)
    {
      if (i < 0) {
        return arrayOfType;
      }
      arrayOfType[i] = getType(arrayOfClass[i]);
    }
  }
  
  public static String getDescriptor(Class paramClass)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    a(localStringBuffer, paramClass);
    return localStringBuffer.toString();
  }
  
  public static String getInternalName(Class paramClass)
  {
    return paramClass.getName().replace('.', '/');
  }
  
  public static String getMethodDescriptor(Type paramType, Type[] paramArrayOfType)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append('(');
    for (int i = 0;; i++)
    {
      if (i >= paramArrayOfType.length)
      {
        localStringBuffer.append(')');
        paramType.a(localStringBuffer);
        return localStringBuffer.toString();
      }
      paramArrayOfType[i].a(localStringBuffer);
    }
  }
  
  public static String getMethodDescriptor(Method paramMethod)
  {
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append('(');
    for (int i = 0;; i++)
    {
      if (i >= arrayOfClass.length)
      {
        localStringBuffer.append(')');
        a(localStringBuffer, paramMethod.getReturnType());
        return localStringBuffer.toString();
      }
      a(localStringBuffer, arrayOfClass[i]);
    }
  }
  
  public static Type getReturnType(String paramString)
  {
    return a(paramString.toCharArray(), 1 + paramString.indexOf(')'));
  }
  
  public static Type getReturnType(Method paramMethod)
  {
    return getType(paramMethod.getReturnType());
  }
  
  public static Type getType(Class paramClass)
  {
    if (paramClass.isPrimitive())
    {
      if (paramClass == Integer.TYPE) {
        return INT_TYPE;
      }
      if (paramClass == Void.TYPE) {
        return VOID_TYPE;
      }
      if (paramClass == Boolean.TYPE) {
        return BOOLEAN_TYPE;
      }
      if (paramClass == Byte.TYPE) {
        return BYTE_TYPE;
      }
      if (paramClass == Character.TYPE) {
        return CHAR_TYPE;
      }
      if (paramClass == Short.TYPE) {
        return SHORT_TYPE;
      }
      if (paramClass == Double.TYPE) {
        return DOUBLE_TYPE;
      }
      if (paramClass == Float.TYPE) {
        return FLOAT_TYPE;
      }
      return LONG_TYPE;
    }
    return getType(getDescriptor(paramClass));
  }
  
  public static Type getType(String paramString)
  {
    return a(paramString.toCharArray(), 0);
  }
  
  public String getClassName()
  {
    return new String(this.b, 1 + this.c, -2 + this.d).replace('/', '.');
  }
  
  public String getDescriptor()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    a(localStringBuffer);
    return localStringBuffer.toString();
  }
  
  public int getDimensions()
  {
    for (int i = 1;; i++) {
      if (this.b[(i + this.c)] != '[') {
        return i;
      }
    }
  }
  
  public Type getElementType()
  {
    return a(this.b, this.c + getDimensions());
  }
  
  public String getInternalName()
  {
    return new String(this.b, 1 + this.c, -2 + this.d);
  }
  
  public int getOpcode(int paramInt)
  {
    if ((paramInt != 46) && (paramInt != 79))
    {
      switch (this.a)
      {
      default: 
        return paramInt + 4;
      case 8: 
        return paramInt + 3;
      case 7: 
        return paramInt + 1;
      case 6: 
        paramInt += 2;
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        return paramInt;
      }
      return paramInt + 5;
    }
    switch (this.a)
    {
    default: 
      return paramInt + 4;
    case 8: 
      return paramInt + 3;
    case 7: 
      return paramInt + 1;
    case 6: 
      paramInt += 2;
    case 5: 
      return paramInt;
    case 4: 
      return paramInt + 8;
    case 2: 
      return paramInt + 7;
    case 1: 
    case 3: 
      return paramInt + 6;
    }
    return paramInt + 5;
  }
  
  public int getSize()
  {
    if ((this.a != 7) && (this.a != 8)) {
      return 1;
    }
    return 2;
  }
  
  public int getSort()
  {
    return this.a;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\org\objectweb\asm\Type.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */