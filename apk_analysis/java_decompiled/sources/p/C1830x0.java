package p;

import android.database.DataSetObserver;

/* renamed from: p.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1830x0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1733A0 f22090a;

    public C1830x0(C1733A0 c1733a0) {
        this.f22090a = c1733a0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C1733A0 c1733a0 = this.f22090a;
        if (c1733a0.f21795z.isShowing()) {
            c1733a0.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f22090a.dismiss();
    }
}
