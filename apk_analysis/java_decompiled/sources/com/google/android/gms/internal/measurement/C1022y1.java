package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022y1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15694a;

    /* renamed from: b, reason: collision with root package name */
    public final O5.n f15695b;

    public C1022y1(Context context, O5.n nVar) {
        this.f15694a = context;
        this.f15695b = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1022y1) {
            C1022y1 c1022y1 = (C1022y1) obj;
            if (this.f15694a.equals(c1022y1.f15694a)) {
                O5.n nVar = c1022y1.f15695b;
                O5.n nVar2 = this.f15695b;
                if (nVar2 != null ? nVar2.equals(nVar) : nVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f15694a.hashCode() ^ 1000003;
        O5.n nVar = this.f15695b;
        if (nVar == null) {
            hashCode = 0;
        } else {
            hashCode = nVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f15694a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.f15695b) + "}";
    }
}
