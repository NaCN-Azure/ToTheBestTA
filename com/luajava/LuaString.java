package com.luajava;

public class LuaString
  implements CharSequence
{
  private byte[] a = new byte[0];
  
  public LuaString(String paramString)
  {
    this.a = paramString.getBytes();
  }
  
  public LuaString(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public char charAt(int paramInt)
  {
    return (char)this.a[paramInt];
  }
  
  public int length()
  {
    return this.a.length;
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return new String(this.a, paramInt1, paramInt2);
  }
  
  public byte[] toByteArray()
  {
    return this.a;
  }
  
  public String toString()
  {
    return new String(this.a);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\luajava\LuaString.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */