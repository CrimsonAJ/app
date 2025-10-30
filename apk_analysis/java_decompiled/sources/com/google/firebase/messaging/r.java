package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import l1.C1535g;
import s.C1935e;
import s.C1939i;

/* loaded from: classes.dex */
public final class r extends G4.a {
    public static final Parcelable.Creator<r> CREATOR = new android.support.v4.media.a(19);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f16499a;

    /* renamed from: b, reason: collision with root package name */
    public C1935e f16500b;

    /* renamed from: c, reason: collision with root package name */
    public C1535g f16501c;

    public r(Bundle bundle) {
        this.f16499a = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [s.e, s.i] */
    public final Map f() {
        if (this.f16500b == null) {
            ?? c1939i = new C1939i(0);
            Bundle bundle = this.f16499a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c1939i.put(str, str2);
                    }
                }
            }
            this.f16500b = c1939i;
        }
        return this.f16500b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.F(parcel, 2, this.f16499a);
        s8.n.U(parcel, R2);
    }
}
