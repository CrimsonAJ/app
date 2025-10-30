package p;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import com.google.android.gms.internal.cast.RunnableC0869s;
import java.lang.ref.WeakReference;

/* renamed from: p.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1758N extends G.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21849h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21850i;
    public final /* synthetic */ WeakReference j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1769T f21851k;

    public C1758N(C1769T c1769t, int i9, int i10, WeakReference weakReference) {
        this.f21851k = c1769t;
        this.f21849h = i9;
        this.f21850i = i10;
        this.j = weakReference;
    }

    @Override // G.b
    public final void i(Typeface typeface) {
        int i9;
        boolean z9;
        if (Build.VERSION.SDK_INT >= 28 && (i9 = this.f21849h) != -1) {
            if ((this.f21850i & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            typeface = AbstractC1767S.a(typeface, i9, z9);
        }
        C1769T c1769t = this.f21851k;
        if (c1769t.f21916m) {
            c1769t.f21915l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0869s(textView, typeface, c1769t.j, 7));
                } else {
                    textView.setTypeface(typeface, c1769t.j);
                }
            }
        }
    }

    @Override // G.b
    public final void h(int i9) {
    }
}
