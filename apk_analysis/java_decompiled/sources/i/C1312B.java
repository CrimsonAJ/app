package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import p.C1813p;
import p.C1815q;
import p.C1817r;
import p.C1833z;
import s.C1939i;

/* renamed from: i.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1312B {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f17976b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17977c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17978d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f17979e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f17980f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f17981g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final C1939i f17982h = new C1939i(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f17983a = new Object[2];

    public C1813p a(Context context, AttributeSet attributeSet) {
        return new C1813p(context, attributeSet);
    }

    public C1815q b(Context context, AttributeSet attributeSet) {
        return new C1815q(context, attributeSet, co.notix.R.attr.buttonStyle);
    }

    public C1817r c(Context context, AttributeSet attributeSet) {
        return new C1817r(context, attributeSet, co.notix.R.attr.checkboxStyle);
    }

    public C1833z d(Context context, AttributeSet attributeSet) {
        return new C1833z(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        C1939i c1939i = f17982h;
        Constructor constructor = (Constructor) c1939i.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f17976b);
            c1939i.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f17983a);
    }
}
