package b5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC1015x;
import com.google.android.gms.internal.measurement.AbstractC1020y;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b5.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0633h1 extends AbstractBinderC1015x implements K {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0648m1 f11138f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0633h1(C0648m1 c0648m1, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f11137e = atomicReference;
        this.f11138f = c0648m1;
    }

    @Override // b5.K
    public final void a1(C1 c12) {
        AtomicReference atomicReference = this.f11137e;
        synchronized (atomicReference) {
            V v8 = ((C0650n0) this.f11138f.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10978n.c(Integer.valueOf(c12.f10567a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(c12);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1015x
    public final boolean d(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 == 2) {
            C1 c12 = (C1) AbstractC1020y.a(parcel, C1.CREATOR);
            AbstractC1020y.b(parcel);
            a1(c12);
            return true;
        }
        return false;
    }
}
