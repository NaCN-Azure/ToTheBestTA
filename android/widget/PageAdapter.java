package android.widget;

import android.view.View;

public class PageAdapter
  extends BasePageAdapter
{
  private final Adapter a;
  private View[] b;
  
  public PageAdapter(Adapter paramAdapter)
  {
    this.a = paramAdapter;
    this.b = new View[paramAdapter.getViewTypeCount()];
  }
  
  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
    View localView = (View)paramObject;
    ((PageView)paramView).removeView(localView);
    this.b[this.a.getItemViewType(paramInt)] = localView;
  }
  
  public int getCount()
  {
    return this.a.getCount();
  }
  
  public Object instantiateItem(View paramView, int paramInt)
  {
    int i = this.a.getItemViewType(paramInt);
    if (this.b[i] != null) {
      ((PageView)paramView).removeView(this.b[i]);
    }
    Adapter localAdapter = this.a;
    View localView1 = this.b[i];
    PageView localPageView = (PageView)paramView;
    View localView2 = localAdapter.getView(paramInt, localView1, localPageView);
    localPageView.addView(localView2, 0);
    this.b[i] = null;
    return localView2;
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\android\widget\PageAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */