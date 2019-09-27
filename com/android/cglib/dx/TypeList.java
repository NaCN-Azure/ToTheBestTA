package com.android.cglib.dx;

import com.android.cglib.dx.c.d.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class TypeList
{
  final TypeId<?>[] a;
  final b b;
  
  TypeList(TypeId<?>[] paramArrayOfTypeId)
  {
    this.a = ((TypeId[])paramArrayOfTypeId.clone());
    this.b = new b(paramArrayOfTypeId.length);
    for (int i = 0; i < paramArrayOfTypeId.length; i++) {
      this.b.a(i, paramArrayOfTypeId[i].b);
    }
  }
  
  public List<TypeId<?>> asList()
  {
    return Collections.unmodifiableList(Arrays.asList(this.a));
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof TypeList)) && (Arrays.equals(((TypeList)paramObject).a, this.a));
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(this.a);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < this.a.length; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(this.a[i]);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\TypeList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */