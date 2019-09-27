package com.android.cglib.dx.d;

public final class b
{
  public static int a(int paramInt1, int paramInt2)
  {
    int i = Integer.numberOfTrailingZeros(paramInt1 & (0xFFFFFFFF ^ (1 << paramInt2) - 1));
    if (i == 32) {
      i = -1;
    }
    return i;
  }
  
  public static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramInt >> 5;
    return (1 << (paramInt & 0x1F) & paramArrayOfInt[i]) != 0;
  }
  
  public static int[] a(int paramInt)
  {
    return new int[paramInt + 31 >> 5];
  }
  
  public static void b(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramInt >> 5;
    paramArrayOfInt[i] = (1 << (paramInt & 0x1F) | paramArrayOfInt[i]);
  }
  
  public static void c(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramInt >> 5;
    int j = 1 << (paramInt & 0x1F);
    paramArrayOfInt[i] &= (j ^ 0xFFFFFFFF);
  }
  
  public static int d(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    int j = paramInt & 0x1F;
    int k = paramInt >> 5;
    while (k < i)
    {
      int m = paramArrayOfInt[k];
      if (m != 0)
      {
        int n = a(m, j);
        if (n >= 0) {
          return n + (k << 5);
        }
      }
      k++;
      j = 0;
    }
    return -1;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */