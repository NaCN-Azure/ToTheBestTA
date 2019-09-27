package com.baidu.mobstat;

import java.util.Comparator;

class h
  implements Comparator<i>
{
  h(g paramg) {}
  
  public int a(i parami1, i parami2)
  {
    int i = parami2.b - parami1.b;
    if (i == 0)
    {
      if ((parami1.d) && (parami2.d)) {
        return 0;
      }
      if (parami1.d) {
        return -1;
      }
      if (parami2.d) {
        return 1;
      }
    }
    return i;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */