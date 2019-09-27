package android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

public class RippleLayout
  extends FrameLayout
{
  private int a;
  private int b;
  private int c = 1152035498;
  private boolean d;
  private boolean e;
  private int f;
  
  public RippleLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  private void setRippleDrawable(View paramView)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = localViewGroup.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = localViewGroup.getChildAt(j);
        if (!(localView instanceof RippleLayout)) {
          setRippleDrawable(localView);
        }
      }
    }
    Drawable localDrawable = paramView.getBackground();
    RippleHelper localRippleHelper;
    if ((localDrawable instanceof RippleHelper)) {
      localRippleHelper = (RippleHelper)localDrawable;
    } else {
      localRippleHelper = new RippleHelper(paramView);
    }
    localRippleHelper.setRippleColor(this.c);
    localRippleHelper.setRippleLineColor(this.f);
    localRippleHelper.setCircle(this.d);
    localRippleHelper.setSingle(this.e);
  }
  
  public boolean isCircle()
  {
    return this.d;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.b = getChildCount();
    if (this.a == this.b) {
      return;
    }
    this.a = this.b;
    setRippleDrawable(this);
  }
  
  public void setCircle(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void setRippleColor(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void setRippleLineColor(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void setSingle(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\android\widget\RippleLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */