package com.luajava;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LuaTable<K, V>
  extends LuaObject
  implements Map<K, V>
{
  public LuaTable(LuaState paramLuaState)
  {
    super(paramLuaState);
    paramLuaState.newTable();
    a(-1);
  }
  
  protected LuaTable(LuaState paramLuaState, int paramInt)
  {
    super(paramLuaState, paramInt);
  }
  
  public void clear()
  {
    push();
    this.b.pushNil();
    while (this.b.next(-2) != 0)
    {
      this.b.pop(1);
      this.b.pushValue(-1);
      this.b.pushNil();
      this.b.setTable(-4);
    }
    this.b.pop(1);
  }
  
  /* Error */
  public boolean containsKey(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 28	com/luajava/LuaTable:push	()V
    //   4: aload_0
    //   5: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   8: aload_1
    //   9: invokevirtual 56	com/luajava/LuaState:pushObjectValue	(Ljava/lang/Object;)V
    //   12: aload_0
    //   13: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   16: bipush -2
    //   18: invokevirtual 59	com/luajava/LuaState:getTable	(I)I
    //   21: ifeq +28 -> 49
    //   24: iconst_1
    //   25: istore_2
    //   26: goto +3 -> 29
    //   29: aload_0
    //   30: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   33: iconst_1
    //   34: invokevirtual 42	com/luajava/LuaState:pop	(I)V
    //   37: aload_0
    //   38: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   41: iconst_1
    //   42: invokevirtual 42	com/luajava/LuaState:pop	(I)V
    //   45: iload_2
    //   46: ireturn
    //   47: iconst_0
    //   48: ireturn
    //   49: iconst_0
    //   50: istore_2
    //   51: goto -22 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	LuaTable
    //   0	54	1	paramObject	Object
    //   25	26	2	bool	boolean
    //   47	1	3	localLuaException	LuaException
    // Exception table:
    //   from	to	target	type
    //   4	24	47	com/luajava/LuaException
    //   29	37	47	com/luajava/LuaException
  }
  
  public boolean containsValue(Object paramObject)
  {
    return false;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    HashSet localHashSet = new HashSet();
    push();
    this.b.pushNil();
    while (this.b.next(-2) != 0)
    {
      try
      {
        localHashSet.add(new LuaEntry(this.b.toJavaObject(-2), this.b.toJavaObject(-1)));
      }
      catch (LuaException localLuaException) {}
      this.b.pop(1);
    }
    this.b.pop(1);
    return localHashSet;
  }
  
  /* Error */
  public V get(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 28	com/luajava/LuaTable:push	()V
    //   4: aload_0
    //   5: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   8: aload_1
    //   9: invokevirtual 56	com/luajava/LuaState:pushObjectValue	(Ljava/lang/Object;)V
    //   12: aload_0
    //   13: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   16: bipush -2
    //   18: invokevirtual 59	com/luajava/LuaState:getTable	(I)I
    //   21: pop
    //   22: aload_0
    //   23: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   26: iconst_m1
    //   27: invokevirtual 72	com/luajava/LuaState:toJavaObject	(I)Ljava/lang/Object;
    //   30: astore_2
    //   31: aload_0
    //   32: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   35: iconst_1
    //   36: invokevirtual 42	com/luajava/LuaState:pop	(I)V
    //   39: goto +8 -> 47
    //   42: aconst_null
    //   43: astore_2
    //   44: goto +4 -> 48
    //   47: pop
    //   48: aload_0
    //   49: getfield 32	com/luajava/LuaTable:b	Lcom/luajava/LuaState;
    //   52: iconst_1
    //   53: invokevirtual 42	com/luajava/LuaState:pop	(I)V
    //   56: aload_2
    //   57: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	LuaTable
    //   0	58	1	paramObject	Object
    //   30	27	2	localObject	Object
    //   42	1	3	localLuaException1	LuaException
    //   47	1	4	localLuaException2	LuaException
    // Exception table:
    //   from	to	target	type
    //   4	31	42	com/luajava/LuaException
    //   31	39	47	com/luajava/LuaException
  }
  
  public boolean isEmpty()
  {
    push();
    this.b.pushNil();
    boolean bool;
    if (this.b.next(-2) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      this.b.pop(1);
      return bool;
    }
    this.b.pop(3);
    return bool;
  }
  
  public boolean isList()
  {
    push();
    if (this.b.rawLen(-1) != 0)
    {
      pop();
      return true;
    }
    this.b.pushNil();
    boolean bool;
    if (this.b.next(-2) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      this.b.pop(1);
      return bool;
    }
    this.b.pop(3);
    return bool;
  }
  
  public Set<K> keySet()
  {
    HashSet localHashSet = new HashSet();
    push();
    this.b.pushNil();
    while (this.b.next(-2) != 0)
    {
      try
      {
        localHashSet.add(this.b.toJavaObject(-2));
      }
      catch (LuaException localLuaException) {}
      this.b.pop(1);
    }
    this.b.pop(1);
    return localHashSet;
  }
  
  public int length()
  {
    push();
    int i = this.b.rawLen(-1);
    pop();
    return i;
  }
  
  public V put(K paramK, V paramV)
  {
    push();
    try
    {
      this.b.pushObjectValue(paramK);
      this.b.pushObjectValue(paramV);
      this.b.setTable(-3);
    }
    catch (LuaException localLuaException) {}
    this.b.pop(1);
    return null;
  }
  
  public void putAll(Map paramMap) {}
  
  public V remove(Object paramObject)
  {
    push();
    try
    {
      this.b.pushObjectValue(paramObject);
      this.b.setTable(-2);
    }
    catch (LuaException localLuaException) {}
    this.b.pop(1);
    return null;
  }
  
  public int size()
  {
    push();
    this.b.pushNil();
    int i = 0;
    while (this.b.next(-2) != 0)
    {
      i++;
      this.b.pop(1);
    }
    this.b.pop(1);
    return i;
  }
  
  public Collection values()
  {
    return null;
  }
  
  public class LuaEntry<K, V>
    implements Map.Entry<K, V>
  {
    private K b;
    private V c;
    
    public LuaEntry(V paramV)
    {
      this.b = paramV;
      Object localObject;
      this.c = localObject;
    }
    
    public K getKey()
    {
      return (K)this.b;
    }
    
    public V getValue()
    {
      return (V)this.c;
    }
    
    public V setValue(V paramV)
    {
      Object localObject = this.c;
      this.c = paramV;
      return (V)localObject;
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\LuaTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */