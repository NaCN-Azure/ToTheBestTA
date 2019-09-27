package com.androlua;

import com.a.a.a.a.a.a.a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class LuaServer
  implements LuaGcable
{
  private ServerSocket a;
  private OnReadLineListener b;
  private boolean c;
  
  public LuaServer() {}
  
  public LuaServer(LuaContext paramLuaContext)
  {
    paramLuaContext.regGc(this);
  }
  
  public void gc()
  {
    if (this.a == null) {
      return;
    }
    try
    {
      this.a.close();
    }
    catch (Exception localException)
    {
      a.a(localException);
    }
    this.c = true;
  }
  
  public boolean isGc()
  {
    return this.c;
  }
  
  public void setOnReadLineListener(OnReadLineListener paramOnReadLineListener)
  {
    this.b = paramOnReadLineListener;
  }
  
  public boolean start(int paramInt)
  {
    if (this.a != null) {
      return false;
    }
    try
    {
      this.a = new ServerSocket(paramInt);
      new ServerThread(this.a).start();
      return true;
    }
    catch (Exception localException)
    {
      a.a(localException);
    }
    return false;
  }
  
  public boolean stop()
  {
    try
    {
      this.a.close();
      this.a = null;
      return true;
    }
    catch (Exception localException)
    {
      a.a(localException);
    }
    return false;
  }
  
  public static abstract interface OnReadLineListener
  {
    public abstract void onReadLine(LuaServer paramLuaServer, LuaServer.SocketThread paramSocketThread, String paramString);
  }
  
  private class ServerThread
    extends Thread
  {
    private final ServerSocket b;
    
    public ServerThread(ServerSocket paramServerSocket)
    {
      this.b = paramServerSocket;
    }
    
    public void run()
    {
      try
      {
        for (;;)
        {
          Socket localSocket = LuaServer.a(LuaServer.this).accept();
          new LuaServer.SocketThread(LuaServer.this, localSocket).start();
        }
      }
      catch (Exception localException)
      {
        a.a(localException);
      }
    }
  }
  
  private class SocketThread
    extends Thread
  {
    private final Socket b;
    private BufferedWriter c;
    
    public SocketThread(Socket paramSocket)
    {
      this.b = paramSocket;
    }
    
    public boolean close()
    {
      try
      {
        this.b.close();
        return true;
      }
      catch (Exception localException)
      {
        a.a(localException);
      }
      return false;
    }
    
    public boolean flush()
    {
      try
      {
        this.c.flush();
        return true;
      }
      catch (Exception localException)
      {
        a.a(localException);
      }
      return false;
    }
    
    public boolean newLine()
    {
      try
      {
        this.c.newLine();
        this.c.flush();
        return true;
      }
      catch (Exception localException)
      {
        a.a(localException);
      }
      return false;
    }
    
    public void run()
    {
      try
      {
        BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
        this.c = new BufferedWriter(new OutputStreamWriter(this.b.getOutputStream()));
        for (;;)
        {
          String str = localBufferedReader.readLine();
          if (str == null) {
            break;
          }
          if (LuaServer.b(LuaServer.this) != null) {
            LuaServer.b(LuaServer.this).onReadLine(LuaServer.this, this, str);
          }
        }
        return;
      }
      catch (Exception localException)
      {
        a.a(localException);
      }
    }
    
    public boolean write(String paramString)
    {
      try
      {
        this.c.write(paramString);
        return true;
      }
      catch (Exception localException)
      {
        a.a(localException);
      }
      return false;
    }
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaServer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */