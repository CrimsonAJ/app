package n;

import P.X;
import android.view.View;
import android.view.animation.BaseInterpolator;
import com.google.android.gms.internal.measurement.D1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f20997c;

    /* renamed from: d, reason: collision with root package name */
    public D1 f20998d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20999e;

    /* renamed from: b, reason: collision with root package name */
    public long f20996b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f21000f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20995a = new ArrayList();

    public final void a() {
        if (!this.f20999e) {
            return;
        }
        ArrayList arrayList = this.f20995a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((X) obj).b();
        }
        this.f20999e = false;
    }

    public final void b() {
        View view;
        if (this.f20999e) {
            return;
        }
        ArrayList arrayList = this.f20995a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            X x5 = (X) obj;
            long j = this.f20996b;
            if (j >= 0) {
                x5.c(j);
            }
            BaseInterpolator baseInterpolator = this.f20997c;
            if (baseInterpolator != null && (view = (View) x5.f5563a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f20998d != null) {
                x5.d(this.f21000f);
            }
            View view2 = (View) x5.f5563a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f20999e = true;
    }
}
