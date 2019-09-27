package com.nirenr.screencapture;

import android.graphics.Bitmap;

public abstract interface ScreenCaptureListener
{
  public abstract void onScreenCaptureDone(Bitmap paramBitmap);
  
  public abstract void onScreenCaptureError(String paramString);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\nirenr\screencapture\ScreenCaptureListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */