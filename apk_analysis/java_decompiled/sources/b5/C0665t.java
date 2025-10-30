package b5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665t extends G4.a {
    public static final Parcelable.Creator<C0665t> CREATOR = new android.support.v4.media.a(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f11309a;

    /* renamed from: b, reason: collision with root package name */
    public final C0663s f11310b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11311c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11312d;

    public C0665t(C0665t c0665t, long j) {
        F4.y.h(c0665t);
        this.f11309a = c0665t.f11309a;
        this.f11310b = c0665t.f11310b;
        this.f11311c = c0665t.f11311c;
        this.f11312d = j;
    }

    public final String toString() {
        return "origin=" + this.f11311c + ",name=" + this.f11309a + ",params=" + String.valueOf(this.f11310b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        android.support.v4.media.a.a(this, parcel, i9);
    }

    public C0665t(String str, C0663s c0663s, String str2, long j) {
        this.f11309a = str;
        this.f11310b = c0663s;
        this.f11311c = str2;
        this.f11312d = j;
    }
}
