package com.android.cglib.dx.a;

public final class a
{
  public static String a(int paramInt)
  {
    String str;
    if (paramInt >= 14) {
      str = "036";
    } else {
      str = "035";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("dex\n");
    localStringBuilder.append(str);
    localStringBuilder.append("\000");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\android\cglib\dx\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */