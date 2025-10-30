package com.google.android.gms.internal.cast;

import android.os.Parcel;
import co.notix.R;
import com.google.android.gms.common.api.Status;
import f5.C1177i;

/* loaded from: classes.dex */
public final class K extends S4.c implements Q {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1177i f14738f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C1177i c1177i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks", 2);
        this.f14738f = c1177i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.cast.M, java.lang.Object] */
    @Override // com.google.android.gms.internal.cast.Q
    public final void H(Status status, P p9) {
        T t7 = new T(p9);
        ?? obj = new Object();
        obj.f14746a = t7;
        boolean f9 = status.f();
        C1177i c1177i = this.f14738f;
        if (f9) {
            c1177i.b(obj);
        } else {
            c1177i.a(F4.y.l(status));
        }
    }

    @Override // S4.c
    public final boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 2:
                Status status = (Status) C.a(parcel, Status.CREATOR);
                P p9 = (P) C.a(parcel, P.CREATOR);
                C.b(parcel);
                H(status, p9);
                return true;
            case 3:
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 5:
                Status status2 = (Status) C.a(parcel, Status.CREATOR);
                C.b(parcel);
                k0(status2);
                return true;
            case 6:
                parcel.createStringArrayList();
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                parcel.readInt();
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                C.b(parcel);
                throw new IllegalStateException("Not implemented");
            case R.styleable.GradientColor_android_endX /* 10 */:
                C.b(parcel);
                throw new IllegalStateException("Not implemented");
            case R.styleable.GradientColor_android_endY /* 11 */:
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 12:
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 14:
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 15:
                C.b(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.cast.Q
    public void k0(Status status) {
        throw new IllegalStateException("Not implemented.");
    }
}
