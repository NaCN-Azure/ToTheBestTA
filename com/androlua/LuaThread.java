package com.androlua;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.luajava.JavaFunction;
import com.luajava.LuaException;
import com.luajava.LuaMetaTable;
import com.luajava.LuaObject;
import com.luajava.LuaState;
import com.luajava.LuaStateFactory;
import java.util.regex.Pattern;

public class LuaThread
  extends Thread
  implements LuaGcable, LuaMetaTable, Runnable
{
  private boolean a;
  private LuaState b;
  private Handler c;
  private LuaContext d;
  private boolean e;
  private String f;
  private Object[] g = new Object[0];
  private byte[] h;
  public boolean isRun = false;
  
  public LuaThread(LuaContext paramLuaContext, LuaObject paramLuaObject)
  {
    this(paramLuaContext, paramLuaObject, false, null);
  }
  
  public LuaThread(LuaContext paramLuaContext, LuaObject paramLuaObject, boolean paramBoolean)
  {
    this(paramLuaContext, paramLuaObject, paramBoolean, null);
  }
  
  public LuaThread(LuaContext paramLuaContext, LuaObject paramLuaObject, boolean paramBoolean, Object[] paramArrayOfObject)
  {
    this.d = paramLuaContext;
    if (paramArrayOfObject != null) {
      this.g = paramArrayOfObject;
    }
    this.e = paramBoolean;
    this.h = paramLuaObject.dump();
  }
  
  public LuaThread(LuaContext paramLuaContext, LuaObject paramLuaObject, Object[] paramArrayOfObject)
  {
    this(paramLuaContext, paramLuaObject, false, paramArrayOfObject);
  }
  
  public LuaThread(LuaContext paramLuaContext, String paramString)
  {
    this(paramLuaContext, paramString, false, null);
  }
  
  public LuaThread(LuaContext paramLuaContext, String paramString, boolean paramBoolean)
  {
    this(paramLuaContext, paramString, paramBoolean, null);
  }
  
  public LuaThread(LuaContext paramLuaContext, String paramString, boolean paramBoolean, Object[] paramArrayOfObject)
  {
    paramLuaContext.regGc(this);
    this.d = paramLuaContext;
    this.f = paramString;
    this.e = paramBoolean;
    if (paramArrayOfObject != null) {
      this.g = paramArrayOfObject;
    }
  }
  
  public LuaThread(LuaContext paramLuaContext, String paramString, Object[] paramArrayOfObject)
  {
    this(paramLuaContext, paramString, false, paramArrayOfObject);
  }
  
  private String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown error ");
      localStringBuilder.append(paramInt);
      return localStringBuilder.toString();
    case 6: 
      return "error error";
    case 5: 
      return "GC error";
    case 4: 
      return "Out of memory";
    case 3: 
      return "Syntax error";
    case 2: 
      return "Runtime error";
    }
    return "Yield error";
  }
  
  private void a()
  {
    this.b = LuaStateFactory.newLuaState();
    this.b.openLibs();
    this.b.pushJavaObject(this.d.getContext());
    LuaState localLuaState;
    if ((this.d instanceof LuaActivity)) {
      localLuaState = this.b;
    }
    for (String str = "activity";; str = "service")
    {
      localLuaState.setGlobal(str);
      break;
      if (!(this.d instanceof LuaService)) {
        break;
      }
      localLuaState = this.b;
    }
    this.b.pushJavaObject(this);
    this.b.setGlobal("this");
    this.b.pushContext(this.d);
    new LuaPrint(this.d, this.b).register("print");
    this.b.getGlobal("package");
    this.b.pushString(this.d.getLuaLpath());
    this.b.setField(-2, "path");
    this.b.pushString(this.d.getLuaCpath());
    this.b.setField(-2, "cpath");
    this.b.pop(1);
    new JavaFunction(this.b)
    {
      public int execute()
      {
        LuaThread.a(LuaThread.this).set(this.b.toString(2), this.b.toJavaObject(3));
        return 0;
      }
    }.register("set");
    new JavaFunction(this.b)
    {
      public int execute()
      {
        int i = this.b.getTop();
        Object[] arrayOfObject;
        LuaContext localLuaContext;
        String str;
        if (i > 2)
        {
          arrayOfObject = new Object[i - 2];
          for (int j = 3; j <= i; j++) {
            arrayOfObject[(j - 3)] = this.b.toJavaObject(j);
          }
          localLuaContext = LuaThread.a(LuaThread.this);
          str = this.b.toString(2);
        }
        else
        {
          if (i != 2) {
            break label109;
          }
          localLuaContext = LuaThread.a(LuaThread.this);
          str = this.b.toString(2);
          arrayOfObject = new Object[0];
        }
        localLuaContext.call(str, arrayOfObject);
        label109:
        return 0;
      }
    }.register("call");
  }
  
  private void a(String paramString, Object paramObject)
  {
    try
    {
      this.b.pushObjectValue(paramObject);
      this.b.setGlobal(paramString);
      return;
    }
    catch (LuaException localLuaException)
    {
      this.d.sendError(toString(), localLuaException);
    }
  }
  
  private void a(String paramString, Object... paramVarArgs)
  {
    try
    {
      if (Pattern.matches("^\\w+$", paramString))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramString);
        localStringBuilder.append(".lua");
        doAsset(localStringBuilder.toString(), paramVarArgs);
        return;
      }
      if (Pattern.matches("^[\\w\\.\\_/]+$", paramString))
      {
        this.b.getGlobal("luajava");
        this.b.pushString(this.d.getLuaDir());
        this.b.setField(-2, "luadir");
        this.b.pushString(paramString);
        this.b.setField(-2, "luapath");
        this.b.pop(1);
        b(paramString, paramVarArgs);
        return;
      }
      c(paramString, paramVarArgs);
      return;
    }
    catch (Exception localException)
    {
      this.d.sendError(toString(), localException);
      quit();
    }
  }
  
  private void a(byte[] paramArrayOfByte, Object... paramVarArgs)
  {
    try
    {
      this.b.setTop(0);
      int i = this.b.LloadBuffer(paramArrayOfByte, "TimerTask");
      if (i == 0)
      {
        this.b.getGlobal("debug");
        this.b.getField(-1, "traceback");
        this.b.remove(-2);
        this.b.insert(-2);
        int j = paramVarArgs.length;
        for (int k = 0; k < j; k++) {
          this.b.pushObjectValue(paramVarArgs[k]);
        }
        i = this.b.pcall(j, 0, -2 - j);
        if (i == 0) {
          return;
        }
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a(i));
      localStringBuilder.append(": ");
      localStringBuilder.append(this.b.toString(-1));
      throw new LuaException(localStringBuilder.toString());
    }
    catch (Exception localException)
    {
      this.d.sendError(toString(), localException);
      quit();
    }
  }
  
  private void b(String paramString, Object... paramVarArgs)
  {
    this.b.setTop(0);
    int i = this.b.LloadFile(paramString);
    if (i == 0)
    {
      this.b.getGlobal("debug");
      this.b.getField(-1, "traceback");
      this.b.remove(-2);
      this.b.insert(-2);
      int j = paramVarArgs.length;
      for (int k = 0; k < j; k++) {
        this.b.pushObjectValue(paramVarArgs[k]);
      }
      i = this.b.pcall(j, 0, -2 - j);
      if (i == 0) {
        return;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a(i));
    localStringBuilder.append(": ");
    localStringBuilder.append(this.b.toString(-1));
    throw new LuaException(localStringBuilder.toString());
  }
  
  private void c(String paramString, Object... paramVarArgs)
  {
    this.b.setTop(0);
    int i = this.b.LloadString(paramString);
    if (i == 0)
    {
      this.b.getGlobal("debug");
      this.b.getField(-1, "traceback");
      this.b.remove(-2);
      this.b.insert(-2);
      int j = paramVarArgs.length;
      for (int k = 0; k < j; k++) {
        this.b.pushObjectValue(paramVarArgs[k]);
      }
      i = this.b.pcall(j, 0, -2 - j);
      if (i == 0) {
        return;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a(i));
    localStringBuilder.append(": ");
    localStringBuilder.append(this.b.toString(-1));
    throw new LuaException(localStringBuilder.toString());
  }
  
  private void d(String paramString, Object... paramVarArgs)
  {
    try
    {
      LuaState localLuaState = this.b;
      int i = 0;
      localLuaState.setTop(0);
      this.b.getGlobal(paramString);
      if (this.b.isFunction(-1))
      {
        this.b.getGlobal("debug");
        this.b.getField(-1, "traceback");
        this.b.remove(-2);
        this.b.insert(-2);
        int j = paramVarArgs.length;
        while (i < j)
        {
          this.b.pushObjectValue(paramVarArgs[i]);
          i++;
        }
        int k = this.b.pcall(j, 1, -2 - j);
        if (k == 0) {
          return;
        }
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(a(k));
        localStringBuilder2.append(": ");
        localStringBuilder2.append(this.b.toString(-1));
        throw new LuaException(localStringBuilder2.toString());
      }
    }
    catch (LuaException localLuaException)
    {
      LuaContext localLuaContext = this.d;
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append(toString());
      localStringBuilder1.append(" ");
      localStringBuilder1.append(paramString);
      localLuaContext.sendError(localStringBuilder1.toString(), localLuaException);
    }
  }
  
  public Object __call(Object[] paramArrayOfObject)
  {
    return null;
  }
  
  public Object __index(final String paramString)
  {
    new LuaMetaTable()
    {
      public Object __call(Object[] paramAnonymousArrayOfObject)
      {
        LuaThread.this.call(paramString, paramAnonymousArrayOfObject);
        return null;
      }
      
      public Object __index(String paramAnonymousString)
      {
        return null;
      }
      
      public void __newIndex(String paramAnonymousString, Object paramAnonymousObject) {}
    };
  }
  
  public void __newIndex(String paramString, Object paramObject)
  {
    set(paramString, paramObject);
  }
  
  public void call(String paramString)
  {
    push(3, paramString);
  }
  
  public void call(String paramString, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 0)
    {
      push(3, paramString);
      return;
    }
    push(1, paramString, paramArrayOfObject);
  }
  
  public void doAsset(String paramString, Object... paramVarArgs)
  {
    byte[] arrayOfByte = LuaUtil.readAsset(this.d.getContext(), paramString);
    this.b.setTop(0);
    int i = this.b.LloadBuffer(arrayOfByte, paramString);
    if (i == 0)
    {
      this.b.getGlobal("debug");
      this.b.getField(-1, "traceback");
      this.b.remove(-2);
      this.b.insert(-2);
      int j = paramVarArgs.length;
      for (int k = 0; k < j; k++) {
        this.b.pushObjectValue(paramVarArgs[k]);
      }
      i = this.b.pcall(j, 0, -2 - j);
      if (i == 0) {
        return;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a(i));
    localStringBuilder.append(": ");
    localStringBuilder.append(this.b.toString(-1));
    throw new LuaException(localStringBuilder.toString());
  }
  
  public void gc()
  {
    quit();
    this.a = true;
  }
  
  public Object get(String paramString)
  {
    this.b.getGlobal(paramString);
    return this.b.toJavaObject(-1);
  }
  
  public boolean isGc()
  {
    return this.a;
  }
  
  public void push(int paramInt, String paramString)
  {
    if (!this.isRun)
    {
      this.d.sendMsg("thread is not running");
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putString("data", paramString);
    localMessage.setData(localBundle);
    localMessage.what = paramInt;
    this.c.sendMessage(localMessage);
  }
  
  public void push(int paramInt, String paramString, Object[] paramArrayOfObject)
  {
    if (!this.isRun)
    {
      this.d.sendMsg("thread is not running");
      return;
    }
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putString("data", paramString);
    localBundle.putSerializable("args", paramArrayOfObject);
    localMessage.setData(localBundle);
    localMessage.what = paramInt;
    this.c.sendMessage(localMessage);
  }
  
  public void quit()
  {
    if (this.isRun)
    {
      this.isRun = false;
      this.c.getLooper().quit();
    }
  }
  
  public void run()
  {
    try
    {
      if (this.b == null)
      {
        a();
        if (this.h != null) {
          a(this.h, this.g);
        } else {
          a(this.f, this.g);
        }
      }
      if (this.e)
      {
        Looper.prepare();
        this.c = new ThreadHandler(null);
        this.isRun = true;
        this.b.getGlobal("run");
        if (!this.b.isNil(-1))
        {
          this.b.pop(1);
          d("run", new Object[0]);
        }
        Looper.loop();
      }
      this.isRun = false;
      this.b.gc(2, 1);
      System.gc();
      return;
    }
    catch (LuaException localLuaException)
    {
      this.d.sendError(toString(), localLuaException);
    }
  }
  
  public void set(String paramString, Object paramObject)
  {
    push(4, paramString, new Object[] { paramObject });
  }
  
  private class ThreadHandler
    extends Handler
  {
    private ThreadHandler() {}
    
    public void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      Bundle localBundle = paramMessage.getData();
      switch (paramMessage.what)
      {
      default: 
        return;
      case 4: 
        LuaThread.a(LuaThread.this, localBundle.getString("data"), ((Object[])localBundle.getSerializable("args"))[0]);
        return;
      case 3: 
        LuaThread.b(LuaThread.this, localBundle.getString("data"), new Object[0]);
        return;
      case 2: 
        LuaThread.a(LuaThread.this, localBundle.getString("data"), new Object[0]);
        return;
      case 1: 
        LuaThread.b(LuaThread.this, localBundle.getString("data"), (Object[])localBundle.getSerializable("args"));
        return;
      }
      LuaThread.a(LuaThread.this, localBundle.getString("data"), (Object[])localBundle.getSerializable("args"));
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */