package com.luajava;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LuaList
  extends LuaObject
  implements List
{
  public LuaList(LuaState paramLuaState)
  {
    super(paramLuaState);
    paramLuaState.newTable();
    a(-1);
  }
  
  public void add(int paramInt, Object paramObject) {}
  
  /* Error */
  public boolean add(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 28	com/luajava/LuaList:push	()V
    //   4: aload_0
    //   5: getfield 32	com/luajava/LuaList:b	Lcom/luajava/LuaState;
    //   8: iconst_m1
    //   9: invokevirtual 36	com/luajava/LuaState:rawLen	(I)I
    //   12: istore_2
    //   13: aload_0
    //   14: getfield 32	com/luajava/LuaList:b	Lcom/luajava/LuaState;
    //   17: aload_1
    //   18: invokevirtual 40	com/luajava/LuaState:pushObjectValue	(Ljava/lang/Object;)V
    //   21: aload_0
    //   22: getfield 32	com/luajava/LuaList:b	Lcom/luajava/LuaState;
    //   25: bipush -2
    //   27: iload_2
    //   28: iconst_1
    //   29: iadd
    //   30: i2l
    //   31: invokevirtual 44	com/luajava/LuaState:setI	(IJ)V
    //   34: aload_0
    //   35: invokevirtual 47	com/luajava/LuaList:pop	()V
    //   38: iconst_1
    //   39: ireturn
    //   40: aload_0
    //   41: invokevirtual 47	com/luajava/LuaList:pop	()V
    //   44: iconst_0
    //   45: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	LuaList
    //   0	46	1	paramObject	Object
    //   12	18	2	i	int
    //   40	1	3	localLuaException	LuaException
    // Exception table:
    //   from	to	target	type
    //   13	38	40	com/luajava/LuaException
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    return false;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    return false;
  }
  
  public void clear() {}
  
  public boolean contains(Object paramObject)
  {
    return false;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return false;
  }
  
  public Object get(int paramInt)
  {
    return null;
  }
  
  public int indexOf(Object paramObject)
  {
    return 0;
  }
  
  public boolean isEmpty()
  {
    push();
    int i = this.b.rawLen(-1);
    this.b.pop(1);
    return i == 0;
  }
  
  public Iterator iterator()
  {
    return null;
  }
  
  public int lastIndexOf(Object paramObject)
  {
    return 0;
  }
  
  public ListIterator listIterator()
  {
    return null;
  }
  
  public ListIterator listIterator(int paramInt)
  {
    return null;
  }
  
  public Object remove(int paramInt)
  {
    return null;
  }
  
  public boolean remove(Object paramObject)
  {
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    return false;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return false;
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    return null;
  }
  
  public int size()
  {
    push();
    int i = this.b.rawLen(-1);
    this.b.pop(1);
    return i;
  }
  
  public List subList(int paramInt1, int paramInt2)
  {
    return null;
  }
  
  public Object[] toArray()
  {
    return null;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return null;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\LuaList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */