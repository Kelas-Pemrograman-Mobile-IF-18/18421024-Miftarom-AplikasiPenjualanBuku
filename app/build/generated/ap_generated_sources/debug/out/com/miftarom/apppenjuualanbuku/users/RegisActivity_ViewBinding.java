// Generated code from Butter Knife. Do not modify!
package com.miftarom.apppenjuualanbuku.users;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.miftarom.apppenjuualanbuku.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisActivity_ViewBinding implements Unbinder {
  private RegisActivity target;

  private View view7f08005c;

  @UiThread
  public RegisActivity_ViewBinding(RegisActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisActivity_ViewBinding(final RegisActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btnLogin, "method 'Login'");
    view7f08005c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.Login();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f08005c.setOnClickListener(null);
    view7f08005c = null;
  }
}
