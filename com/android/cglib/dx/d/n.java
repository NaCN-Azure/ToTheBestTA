package com.android.cglib.dx.d;

public final class n
{
  public static int a(int paramInt)
  {
    int i = paramInt >> 7;
    for (int j = 0; i != 0; j++) {
      i >>= 7;
    }
    return j + 1;
  }
  
  public static void a(e parame, int paramInt)
  {
    int j;
    for (;;)
    {
      int i = paramInt >>> 7;
      j = paramInt;
      paramInt = i;
      if (paramInt == 0) {
        break;
      }
      parame.b((byte)(0x80 | j & 0x7F));
    }
    parame.b((byte)(j & 0x7F));
  }
  
  public static void b(e parame, int paramInt)
  {
    int i = paramInt >> 7;
    int j;
    if ((0x80000000 & paramInt) == 0) {
      j = 0;
    } else {
      j = -1;
    }
    int k = paramInt;
    int m = 1;
    while (m != 0)
    {
      if ((i == j) && ((i & 0x1) == (0x1 & k >> 6))) {
        m = 0;
      } else {
        m = 1;
      }
      int n = k & 0x7F;
      int i1;
      if (m != 0) {
        i1 = 128;
      } else {
        i1 = 0;
      }
      parame.b((byte)(n | i1));
      int i2 = i >> 7;
      k = i;
      i = i2;
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\d\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */