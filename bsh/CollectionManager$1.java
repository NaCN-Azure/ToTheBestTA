package bsh;

import java.lang.reflect.Array;
import java.util.Enumeration;

class CollectionManager$1
  implements Enumeration
{
  int a;
  int b;
  private final Object c;
  private final CollectionManager.BasicBshIterator d;
  
  CollectionManager$1(CollectionManager.BasicBshIterator paramBasicBshIterator, Object paramObject)
  {
    this.d = paramBasicBshIterator;
    this.c = paramObject;
    this.a = 0;
    this.b = Array.getLength(this.c);
  }
  
  public boolean hasMoreElements()
  {
    return this.a < this.b;
  }
  
  public Object nextElement()
  {
    Object localObject = this.c;
    int i = this.a;
    this.a = (i + 1);
    return Array.get(localObject, i);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\CollectionManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */