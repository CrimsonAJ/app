package com.google.android.gms.common.api;

import A1.g;
import B4.b;
import C4.o;
import C4.s;
import F4.y;
import G4.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import s8.n;
import t4.v;

/* loaded from: classes.dex */
public final class Status extends a implements o, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f14660a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14661b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f14662c;

    /* renamed from: d, reason: collision with root package name */
    public final b f14663d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f14655e = new Status(0, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f14656f = new Status(14, null, null, null);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f14657g = new Status(8, null, null, null);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f14658h = new Status(15, null, null, null);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f14659i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new s(3);

    public Status(int i9, String str, PendingIntent pendingIntent, b bVar) {
        this.f14660a = i9;
        this.f14661b = str;
        this.f14662c = pendingIntent;
        this.f14663d = bVar;
    }

    @Override // C4.o
    public final Status d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f14660a != status.f14660a || !y.k(this.f14661b, status.f14661b) || !y.k(this.f14662c, status.f14662c) || !y.k(this.f14663d, status.f14663d)) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.f14660a <= 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14660a), this.f14661b, this.f14662c, this.f14663d});
    }

    public final String toString() {
        g gVar = new g(this);
        String str = this.f14661b;
        if (str == null) {
            str = v.b(this.f14660a);
        }
        gVar.j(str, "statusCode");
        gVar.j(this.f14662c, "resolution");
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(this.f14660a);
        n.M(parcel, 2, this.f14661b);
        n.L(parcel, 3, this.f14662c, i9);
        n.L(parcel, 4, this.f14663d, i9);
        n.U(parcel, R2);
    }
}
