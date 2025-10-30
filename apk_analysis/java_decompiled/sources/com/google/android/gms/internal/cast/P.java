package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class P extends G4.a {
    public static final Parcelable.Creator<P> CREATOR = new F(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f14756a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14757b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14758c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14759d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14760e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14761f;

    public P(int i9, boolean z9, ArrayList arrayList, int i10, String str, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        this.f14758c = arrayList2;
        this.f14756a = i9;
        this.f14757b = z9;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f14759d = i10;
        this.f14760e = str;
        this.f14761f = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f14756a);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f14757b ? 1 : 0);
        s8.n.N(parcel, 4, this.f14758c);
        s8.n.V(parcel, 5, 4);
        parcel.writeInt(this.f14759d);
        s8.n.M(parcel, 6, this.f14760e);
        s8.n.V(parcel, 7, 4);
        parcel.writeInt(this.f14761f ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
