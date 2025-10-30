package u0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0555p;
import t4.C2010B;

/* renamed from: u0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2043n implements Parcelable {
    public static final Parcelable.Creator<C2043n> CREATOR = new C2010B(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f23507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23508b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f23509c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f23510d;

    public C2043n(C2042m entry) {
        kotlin.jvm.internal.h.e(entry, "entry");
        this.f23507a = entry.f23500f;
        this.f23508b = entry.f23496b.f23381h;
        this.f23509c = entry.a();
        Bundle bundle = new Bundle();
        this.f23510d = bundle;
        entry.f23503i.c(bundle);
    }

    public final C2042m a(Context context, C c3, EnumC0555p hostLifecycleState, C2049u c2049u) {
        kotlin.jvm.internal.h.e(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f23509c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String id = this.f23507a;
        kotlin.jvm.internal.h.e(id, "id");
        return new C2042m(context, c3, bundle2, hostLifecycleState, c2049u, id, this.f23510d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        kotlin.jvm.internal.h.e(parcel, "parcel");
        parcel.writeString(this.f23507a);
        parcel.writeInt(this.f23508b);
        parcel.writeBundle(this.f23509c);
        parcel.writeBundle(this.f23510d);
    }

    public C2043n(Parcel parcel) {
        String readString = parcel.readString();
        kotlin.jvm.internal.h.b(readString);
        this.f23507a = readString;
        this.f23508b = parcel.readInt();
        this.f23509c = parcel.readBundle(C2043n.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(C2043n.class.getClassLoader());
        kotlin.jvm.internal.h.b(readBundle);
        this.f23510d = readBundle;
    }
}
