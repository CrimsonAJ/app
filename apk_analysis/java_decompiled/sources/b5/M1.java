package b5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M1 extends G4.a {
    public static final Parcelable.Creator<M1> CREATOR = new android.support.v4.media.a(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f10803a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10804b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10805c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f10806d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10807e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10808f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f10809g;

    public M1(int i9, String str, long j, Long l9, Float f9, String str2, String str3, Double d9) {
        this.f10803a = i9;
        this.f10804b = str;
        this.f10805c = j;
        this.f10806d = l9;
        this.f10809g = i9 == 1 ? f9 != null ? Double.valueOf(f9.doubleValue()) : null : d9;
        this.f10807e = str2;
        this.f10808f = str3;
    }

    public final Object f() {
        Long l9 = this.f10806d;
        if (l9 != null) {
            return l9;
        }
        Double d9 = this.f10809g;
        if (d9 != null) {
            return d9;
        }
        String str = this.f10807e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        android.support.v4.media.a.b(this, parcel);
    }

    public M1(long j, Object obj, String str, String str2) {
        F4.y.e(str);
        this.f10803a = 2;
        this.f10804b = str;
        this.f10805c = j;
        this.f10808f = str2;
        if (obj == null) {
            this.f10806d = null;
            this.f10809g = null;
            this.f10807e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f10806d = (Long) obj;
            this.f10809g = null;
            this.f10807e = null;
        } else if (obj instanceof String) {
            this.f10806d = null;
            this.f10809g = null;
            this.f10807e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f10806d = null;
                this.f10809g = (Double) obj;
                this.f10807e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M1(b5.N1 r7) {
        /*
            r6 = this;
            java.lang.String r4 = r7.f10818c
            java.lang.Object r3 = r7.f10820e
            java.lang.String r5 = r7.f10817b
            long r1 = r7.f10819d
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.M1.<init>(b5.N1):void");
    }
}
