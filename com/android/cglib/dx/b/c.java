package com.android.cglib.dx.b;

public final class c
{
  public static boolean a(int paramInt)
  {
    if (paramInt < -1) {
      return false;
    }
    if (paramInt == -1) {
      return true;
    }
    int i = paramInt & 0xFF;
    if (i != 0)
    {
      if (i == 255) {
        return true;
      }
      int j = paramInt & 0xFF00;
      boolean bool = false;
      if (j == 0) {
        bool = true;
      }
      return bool;
    }
    return true;
  }
  
  public static boolean b(int paramInt)
  {
    return paramInt >= 255;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */