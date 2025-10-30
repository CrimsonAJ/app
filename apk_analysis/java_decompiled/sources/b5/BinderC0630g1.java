package b5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC1015x;
import com.google.android.gms.internal.measurement.AbstractC1020y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b5.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0630g1 extends AbstractBinderC1015x implements I {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0630g1(AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f11123e = atomicReference;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1015x
    public final boolean d(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 == 2) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(x1.CREATOR);
            AbstractC1020y.b(parcel);
            y0(createTypedArrayList);
            return true;
        }
        return false;
    }

    @Override // b5.I
    public final void y0(List list) {
        AtomicReference atomicReference = this.f11123e;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
