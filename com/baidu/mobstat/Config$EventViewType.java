package com.baidu.mobstat;

public enum Config$EventViewType
{
  private int a;
  
  static
  {
    EventViewType[] arrayOfEventViewType = new EventViewType[1];
    arrayOfEventViewType[0] = BUTTON;
    b = arrayOfEventViewType;
  }
  
  private Config$EventViewType(int paramInt)
  {
    this.a = paramInt;
  }
  
  public int getValue()
  {
    return this.a;
  }
  
  public String toString()
  {
    return String.valueOf(this.a);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\Config$EventViewType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */