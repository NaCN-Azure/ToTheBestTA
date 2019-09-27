package com.android.cglib.dx;

import com.android.cglib.dx.c.c.s;
import com.android.cglib.dx.c.c.t;
import com.android.cglib.dx.c.c.v;
import com.android.cglib.dx.c.d.a;
import java.util.List;

public final class MethodId<D, R>
{
  final TypeId<D> a;
  final TypeId<R> b;
  final String c;
  final TypeList d;
  final t e;
  final s f;
  
  MethodId(TypeId<D> paramTypeId, TypeId<R> paramTypeId1, String paramString, TypeList paramTypeList)
  {
    if ((paramTypeId != null) && (paramTypeId1 != null) && (paramString != null) && (paramTypeList != null))
    {
      this.a = paramTypeId;
      this.b = paramTypeId1;
      this.c = paramString;
      this.d = paramTypeList;
      this.e = new t(new v(paramString), new v(a(false)));
      this.f = new s(paramTypeId.c, this.e);
      return;
    }
    throw new NullPointerException();
  }
  
  String a(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    if (paramBoolean) {
      localStringBuilder.append(this.a.a);
    }
    TypeId[] arrayOfTypeId = this.d.a;
    int i = arrayOfTypeId.length;
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(arrayOfTypeId[j].a);
    }
    localStringBuilder.append(")");
    localStringBuilder.append(this.b.a);
    return localStringBuilder.toString();
  }
  
  a b(boolean paramBoolean)
  {
    return a.a(a(paramBoolean));
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof MethodId))
    {
      MethodId localMethodId = (MethodId)paramObject;
      if ((localMethodId.a.equals(this.a)) && (localMethodId.c.equals(this.c)) && (localMethodId.d.equals(this.d)) && (localMethodId.b.equals(this.b))) {
        return true;
      }
    }
    return false;
  }
  
  public TypeId<D> getDeclaringType()
  {
    return this.a;
  }
  
  public String getName()
  {
    return this.c;
  }
  
  public List<TypeId<?>> getParameters()
  {
    return this.d.asList();
  }
  
  public TypeId<R> getReturnType()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    return 31 * (31 * (31 * (527 + this.a.hashCode()) + this.c.hashCode()) + this.d.hashCode()) + this.b.hashCode();
  }
  
  public boolean isConstructor()
  {
    return this.c.equals("<init>");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(".");
    localStringBuilder.append(this.c);
    localStringBuilder.append("(");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\MethodId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */