package android.widget;

import android.graphics.drawable.Drawable;

abstract interface CardViewDelegate
{
  public abstract Drawable getBackground();
  
  public abstract boolean getPreventCornerOverlap();
  
  public abstract float getRadius();
  
  public abstract boolean getUseCompatPadding();
  
  public abstract void setBackgroundDrawable(Drawable paramDrawable);
  
  public abstract void setShadowPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\android\widget\CardViewDelegate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */