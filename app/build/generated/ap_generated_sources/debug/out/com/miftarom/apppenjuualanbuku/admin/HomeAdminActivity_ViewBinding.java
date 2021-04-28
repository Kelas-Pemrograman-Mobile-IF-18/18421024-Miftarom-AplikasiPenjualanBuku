// Generated code from Butter Knife. Do not modify!
package com.miftarom.apppenjuualanbuku.admin;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.miftarom.apppenjuualanbuku.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeAdminActivity_ViewBinding implements Unbinder {
  private HomeAdminActivity target;

  private View view7f08005b;

  @UiThread
  public HomeAdminActivity_ViewBinding(HomeAdminActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeAdminActivity_ViewBinding(final HomeAdminActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btnKeluar, "method 'keluar'");
    view7f08005b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.keluar();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f08005b.setOnClickListener(null);
    view7f08005b = null;
  }
}
