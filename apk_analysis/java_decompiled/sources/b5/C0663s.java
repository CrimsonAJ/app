package b5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* renamed from: b5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663s extends G4.a implements Iterable {
    public static final Parcelable.Creator<C0663s> CREATOR = new android.support.v4.media.a(7);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11300a;

    public C0663s(Bundle bundle) {
        this.f11300a = bundle;
    }

    public final Bundle f() {
        return new Bundle(this.f11300a);
    }

    public final Double g() {
        return Double.valueOf(this.f11300a.getDouble("value"));
    }

    public final Object i(String str) {
        return this.f11300a.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new P5.M(this);
    }

    public final String k() {
        return this.f11300a.getString("currency");
    }

    public final String toString() {
        return this.f11300a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.F(parcel, 2, f());
        s8.n.U(parcel, R2);
    }
}
