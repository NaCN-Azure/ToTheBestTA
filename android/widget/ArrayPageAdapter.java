package android.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPageAdapter
  extends BasePageAdapter
{
  public ArrayList<View> mListViews;
  
  public ArrayPageAdapter()
  {
    this.mListViews = new ArrayList();
  }
  
  public ArrayPageAdapter(ArrayList<View> paramArrayList)
  {
    this.mListViews = paramArrayList;
  }
  
  public ArrayPageAdapter(View[] paramArrayOfView)
  {
    this.mListViews = new ArrayList(Arrays.asList(paramArrayOfView));
  }
  
  public void add(View paramView)
  {
    this.mListViews.add(paramView);
  }
  
  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
    ((PageView)paramView).removeView((View)this.mListViews.get(paramInt));
  }
  
  public int getCount()
  {
    return this.mListViews.size();
  }
  
  public ArrayList<View> getData()
  {
    return this.mListViews;
  }
  
  public View getItem(int paramInt)
  {
    return (View)this.mListViews.get(paramInt);
  }
  
  public void insert(int paramInt, View paramView)
  {
    this.mListViews.add(paramInt, paramView);
  }
  
  public Object instantiateItem(View paramView, int paramInt)
  {
    ((PageView)paramView).addView((View)this.mListViews.get(paramInt), 0);
    return this.mListViews.get(paramInt);
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
  
  public View remove(int paramInt)
  {
    return (View)this.mListViews.remove(paramInt);
  }
  
  public boolean remove(View paramView)
  {
    return this.mListViews.remove(paramView);
  }
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\android\widget\ArrayPageAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */