package com.android.cglib.dx;

import com.android.cglib.dx.c.c.j;
import com.android.cglib.dx.c.c.t;
import com.android.cglib.dx.c.c.v;

public final class FieldId<D, V>
{
  final TypeId<D> a;
  final TypeId<V> b;
  final String c;
  final t d;
  final j e;
  
  FieldId(TypeId<D> paramTypeId, TypeId<V> paramTypeId1, String paramString)
  {
    if ((paramTypeId != null) && (paramTypeId1 != null) && (paramString != null))
    {
      this.a = paramTypeId;
      this.b = paramTypeId1;
      this.c = paramString;
      this.d = new t(new v(paramString), new v(paramTypeId1.a));
      this.e = new j(paramTypeId.c, this.d);
      return;
    }
    throw new NullPointerException();
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof FieldId))
    {
      FieldId localFieldId = (FieldId)paramObject;
      if ((localFieldId.a.equals(this.a)) && (localFieldId.c.equals(this.c))) {
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
  
  public TypeId<V> getType()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    return this.a.hashCode() + 37 * this.c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(".");
    localStringBuilder.append(this.c);
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\FieldId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */