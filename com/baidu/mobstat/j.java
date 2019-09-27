package com.baidu.mobstat;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

class j
{
  public String a;
  public String b;
  public int c = 2;
  
  public static j a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      String str1 = localJSONObject.getString("deviceid");
      String str2 = localJSONObject.getString("imei");
      int i = localJSONObject.getInt("ver");
      if ((!TextUtils.isEmpty(str1)) && (str2 != null))
      {
        j localj = new j();
        localj.a = str1;
        localj.b = str2;
        localj.c = i;
        return localj;
      }
    }
    catch (JSONException localJSONException)
    {
      g.a(localJSONException);
    }
    return null;
  }
  
  public String a()
  {
    try
    {
      String str = new JSONObject().put("deviceid", this.a).put("imei", this.b).put("ver", this.c).toString();
      return str;
    }
    catch (JSONException localJSONException)
    {
      g.a(localJSONException);
    }
    return null;
  }
  
  public String b()
  {
    String str1 = this.b;
    if (TextUtils.isEmpty(str1)) {
      str1 = "0";
    }
    String str2 = new StringBuffer(str1).reverse().toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append("|");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */