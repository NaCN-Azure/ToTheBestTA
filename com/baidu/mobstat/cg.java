package com.baidu.mobstat;

import org.json.JSONObject;

class cg
{
  private String a;
  private String b;
  private String c;
  private long d;
  private long e;
  private boolean f;
  private JSONObject g;
  
  public cg(String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, boolean paramBoolean, ExtraInfo paramExtraInfo)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.a = paramString3;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramBoolean;
    JSONObject localJSONObject = new JSONObject();
    if (paramExtraInfo != null) {
      localJSONObject = paramExtraInfo.dumpToJson();
    }
    this.g = localJSONObject;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(cg paramcg)
  {
    this.a = paramcg.a;
    this.b = paramcg.b;
    this.c = paramcg.c;
    this.d = paramcg.d;
    this.e = paramcg.e;
    this.f = paramcg.f;
    this.g = paramcg.g;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public long c()
  {
    return this.d;
  }
  
  public long d()
  {
    return this.e;
  }
  
  public JSONObject e()
  {
    return this.g;
  }
  
  public boolean f()
  {
    return this.f;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\baidu\mobstat\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */