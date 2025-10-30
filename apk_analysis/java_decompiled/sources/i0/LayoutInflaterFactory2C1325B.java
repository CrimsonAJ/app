package i0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import h0.AbstractC1261a;
import j0.AbstractC1430d;
import j0.C1427a;
import j0.C1429c;

/* renamed from: i0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C1325B implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1336M f18166a;

    public LayoutInflaterFactory2C1325B(AbstractC1336M abstractC1336M) {
        this.f18166a = abstractC1336M;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z9;
        C1343U f9;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        AbstractC1336M abstractC1336M = this.f18166a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, abstractC1336M);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1261a.f17830a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z9 = AbstractComponentCallbacksC1366v.class.isAssignableFrom(C1329F.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z9 = false;
                }
                if (z9) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC1366v B9 = resourceId != -1 ? abstractC1336M.B(resourceId) : null;
                    if (B9 == null && string != null) {
                        B9 = abstractC1336M.C(string);
                    }
                    if (B9 == null && id != -1) {
                        B9 = abstractC1336M.B(id);
                    }
                    if (B9 == null) {
                        C1329F E8 = abstractC1336M.E();
                        context.getClassLoader();
                        B9 = E8.a(attributeValue);
                        B9.f18405n = true;
                        B9.f18420w = resourceId != 0 ? resourceId : id;
                        B9.f18421x = id;
                        B9.f18422y = string;
                        B9.f18407o = true;
                        B9.f18414s = abstractC1336M;
                        C1368x c1368x = abstractC1336M.f18215u;
                        B9.f18416t = c1368x;
                        B9.M(c1368x.f18427o, attributeSet, B9.f18386b);
                        f9 = abstractC1336M.a(B9);
                        if (AbstractC1336M.H(2)) {
                            Log.v("FragmentManager", "Fragment " + B9 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!B9.f18407o) {
                        B9.f18407o = true;
                        B9.f18414s = abstractC1336M;
                        C1368x c1368x2 = abstractC1336M.f18215u;
                        B9.f18416t = c1368x2;
                        B9.M(c1368x2.f18427o, attributeSet, B9.f18386b);
                        f9 = abstractC1336M.f(B9);
                        if (AbstractC1336M.H(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + B9 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C1429c c1429c = AbstractC1430d.f19185a;
                    AbstractC1430d.b(new C1427a(B9, "Attempting to use <fragment> tag to add fragment " + B9 + " to container " + viewGroup));
                    AbstractC1430d.a(B9).getClass();
                    B9.f18383X = viewGroup;
                    f9.k();
                    f9.j();
                    View view2 = B9.Y;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (B9.Y.getTag() == null) {
                            B9.Y.setTag(string);
                        }
                        B9.Y.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1324A(this, f9));
                        return B9.Y;
                    }
                    throw new IllegalStateException(A0.a.n("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
