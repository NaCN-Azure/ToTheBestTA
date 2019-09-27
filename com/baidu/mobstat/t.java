package com.baidu.mobstat;

import org.json.JSONException;
import org.json.JSONObject;

class t
{
  private String a;
  private String b;
  private String c;
  
  public t(String paramString1, String paramString2, String paramString3)
  {
    if (paramString1 == null) {
      paramString1 = "";
    }
    this.a = paramString1;
    if (paramString2 == null) {
      paramString2 = "";
    }
    this.b = paramString2;
    if (paramString3 == null) {
      paramString3 = "";
    }
    this.c = paramString3;
  }
  
  public JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("n", this.a);
      localJSONObject.put("v", this.b);
      localJSONObject.put("w", this.c);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      bd.b(localJSONException);
    }
    return null;
  }
  
  public String b()
  {
    return this.a;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */