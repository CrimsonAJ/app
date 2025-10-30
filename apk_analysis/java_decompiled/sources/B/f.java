package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import u0.z;

/* loaded from: classes.dex */
public final class f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c f567a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f570d;

    /* renamed from: e, reason: collision with root package name */
    public final int f571e;

    /* renamed from: f, reason: collision with root package name */
    public final int f572f;

    /* renamed from: g, reason: collision with root package name */
    public int f573g;

    /* renamed from: h, reason: collision with root package name */
    public int f574h;

    /* renamed from: i, reason: collision with root package name */
    public int f575i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public View f576k;

    /* renamed from: l, reason: collision with root package name */
    public View f577l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f578m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f579n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f580o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f581p;

    public f() {
        super(-2, -2);
        this.f568b = false;
        this.f569c = 0;
        this.f570d = 0;
        this.f571e = -1;
        this.f572f = -1;
        this.f573g = 0;
        this.f574h = 0;
        this.f581p = new Rect();
    }

    public final boolean a(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return false;
            }
            return this.f579n;
        }
        return this.f578m;
    }

    public final void b(c cVar) {
        c cVar2 = this.f567a;
        if (cVar2 != cVar) {
            if (cVar2 != null) {
                cVar2.j();
            }
            this.f567a = cVar;
            this.f568b = true;
            if (cVar != null) {
                cVar.g(this);
            }
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar;
        this.f568b = false;
        this.f569c = 0;
        this.f570d = 0;
        this.f571e = -1;
        this.f572f = -1;
        this.f573g = 0;
        this.f574h = 0;
        this.f581p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.a.f1b);
        this.f569c = obtainStyledAttributes.getInteger(0, 0);
        this.f572f = obtainStyledAttributes.getResourceId(1, -1);
        this.f570d = obtainStyledAttributes.getInteger(2, 0);
        this.f571e = obtainStyledAttributes.getInteger(6, -1);
        this.f573g = obtainStyledAttributes.getInt(5, 0);
        this.f574h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f568b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f9542t;
            if (TextUtils.isEmpty(string)) {
                cVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f9542t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f9544v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f9543u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    cVar = (c) constructor.newInstance(context, attributeSet);
                } catch (Exception e8) {
                    throw new RuntimeException(z.e("Could not inflate Behavior subclass ", string), e8);
                }
            }
            this.f567a = cVar;
        }
        obtainStyledAttributes.recycle();
        c cVar2 = this.f567a;
        if (cVar2 != null) {
            cVar2.g(this);
        }
    }

    public f(f fVar) {
        super((ViewGroup.MarginLayoutParams) fVar);
        this.f568b = false;
        this.f569c = 0;
        this.f570d = 0;
        this.f571e = -1;
        this.f572f = -1;
        this.f573g = 0;
        this.f574h = 0;
        this.f581p = new Rect();
    }

    public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f568b = false;
        this.f569c = 0;
        this.f570d = 0;
        this.f571e = -1;
        this.f572f = -1;
        this.f573g = 0;
        this.f574h = 0;
        this.f581p = new Rect();
    }

    public f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f568b = false;
        this.f569c = 0;
        this.f570d = 0;
        this.f571e = -1;
        this.f572f = -1;
        this.f573g = 0;
        this.f574h = 0;
        this.f581p = new Rect();
    }
}
