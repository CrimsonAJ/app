package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1311A implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f17972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17973b;

    /* renamed from: c, reason: collision with root package name */
    public Method f17974c;

    /* renamed from: d, reason: collision with root package name */
    public Context f17975d;

    public ViewOnClickListenerC1311A(View view, String str) {
        this.f17972a = view;
        this.f17973b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f17974c == null) {
            View view2 = this.f17972a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f17973b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f17974c = method;
                            this.f17975d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder r5 = AbstractC0953k1.r("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    r5.append(view2.getClass());
                    r5.append(str);
                    throw new IllegalStateException(r5.toString());
                }
            }
        }
        try {
            this.f17974c.invoke(this.f17975d, view);
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
        } catch (InvocationTargetException e9) {
            throw new IllegalStateException("Could not execute method for android:onClick", e9);
        }
    }
}
