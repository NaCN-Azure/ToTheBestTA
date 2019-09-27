package com.androlua;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

class LuaCameraView
  extends SurfaceView
{
  private SurfaceHolder a = null;
  
  public LuaCameraView(Context paramContext)
  {
    super(paramContext);
    this.a.addCallback(new SurfaceHolder.Callback()
    {
      private Camera b;
      
      public void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        Camera.Parameters localParameters = this.b.getParameters();
        localParameters.setPictureFormat(256);
        localParameters.setPreviewSize(854, 480);
        localParameters.setFocusMode("auto");
        localParameters.setPictureSize(2592, 1456);
        this.b.startPreview();
      }
      
      /* Error */
      public void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        // Byte code:
        //   0: aload_0
        //   1: invokestatic 61	android/hardware/Camera:open	()Landroid/hardware/Camera;
        //   4: putfield 25	com/androlua/LuaCameraView$1:b	Landroid/hardware/Camera;
        //   7: aload_0
        //   8: getfield 25	com/androlua/LuaCameraView$1:b	Landroid/hardware/Camera;
        //   11: aload_1
        //   12: invokevirtual 64	android/hardware/Camera:setPreviewDisplay	(Landroid/view/SurfaceHolder;)V
        //   15: return
        //   16: aload_0
        //   17: aconst_null
        //   18: putfield 25	com/androlua/LuaCameraView$1:b	Landroid/hardware/Camera;
        //   21: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	22	0	this	1
        //   0	22	1	paramAnonymousSurfaceHolder	SurfaceHolder
        //   16	1	2	localIOException	java.io.IOException
        // Exception table:
        //   from	to	target	type
        //   7	15	16	java/io/IOException
      }
      
      public void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        this.b.stopPreview();
        this.b.release();
        this.b = null;
      }
    });
    this.a.setType(3);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaCameraView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */