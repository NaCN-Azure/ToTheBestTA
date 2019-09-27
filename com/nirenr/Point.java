package com.nirenr;

public class Point
{
  public int t;
  public int x;
  public int y;
  
  public Point(int paramInt1, int paramInt2)
  {
    this.x = paramInt1;
    this.y = paramInt2;
  }
  
  public Point(int paramInt1, int paramInt2, int paramInt3)
  {
    this.x = paramInt1;
    this.y = paramInt2;
    this.t = paramInt3;
  }
  
  public Point(Point paramPoint)
  {
    this.x = paramPoint.x;
    this.y = paramPoint.y;
  }
  
  public final boolean equals(int paramInt1, int paramInt2)
  {
    return (this.x == paramInt1) && (this.y == paramInt2);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      Point localPoint = (Point)paramObject;
      if (this.x != localPoint.x) {
        return false;
      }
      return this.y == localPoint.y;
    }
    return false;
  }
  
  public int hashCode()
  {
    return 31 * this.x + this.y;
  }
  
  public final void negate()
  {
    this.x = (-this.x);
    this.y = (-this.y);
  }
  
  public final void offset(int paramInt1, int paramInt2)
  {
    this.x = (paramInt1 + this.x);
    this.y = (paramInt2 + this.y);
  }
  
  public void set(int paramInt1, int paramInt2)
  {
    this.x = paramInt1;
    this.y = paramInt2;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Point(");
    localStringBuilder.append(this.x);
    localStringBuilder.append(", ");
    localStringBuilder.append(this.y);
    localStringBuilder.append(": ");
    localStringBuilder.append(this.t);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\nirenr\Point.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */