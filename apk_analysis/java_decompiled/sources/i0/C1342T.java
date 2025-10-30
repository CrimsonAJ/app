package i0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0555p;

/* renamed from: i0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342T implements Parcelable {
    public static final Parcelable.Creator<C1342T> CREATOR = new android.support.v4.media.a(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f18236a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18237b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18238c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18239d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18240e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18241f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18242g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18243h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18244i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18245k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18246l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18247m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18248n;

    public C1342T(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        this.f18236a = abstractComponentCallbacksC1366v.getClass().getName();
        this.f18237b = abstractComponentCallbacksC1366v.f18389e;
        this.f18238c = abstractComponentCallbacksC1366v.f18405n;
        this.f18239d = abstractComponentCallbacksC1366v.f18420w;
        this.f18240e = abstractComponentCallbacksC1366v.f18421x;
        this.f18241f = abstractComponentCallbacksC1366v.f18422y;
        this.f18242g = abstractComponentCallbacksC1366v.f18380B;
        this.f18243h = abstractComponentCallbacksC1366v.f18401l;
        this.f18244i = abstractComponentCallbacksC1366v.f18379A;
        this.j = abstractComponentCallbacksC1366v.f18423z;
        this.f18245k = abstractComponentCallbacksC1366v.f18402l0.ordinal();
        this.f18246l = abstractComponentCallbacksC1366v.f18394h;
        this.f18247m = abstractComponentCallbacksC1366v.f18396i;
        this.f18248n = abstractComponentCallbacksC1366v.f18391f0;
    }

    public final AbstractComponentCallbacksC1366v a(C1329F c1329f) {
        AbstractComponentCallbacksC1366v a5 = c1329f.a(this.f18236a);
        a5.f18389e = this.f18237b;
        a5.f18405n = this.f18238c;
        a5.f18409p = true;
        a5.f18420w = this.f18239d;
        a5.f18421x = this.f18240e;
        a5.f18422y = this.f18241f;
        a5.f18380B = this.f18242g;
        a5.f18401l = this.f18243h;
        a5.f18379A = this.f18244i;
        a5.f18423z = this.j;
        a5.f18402l0 = EnumC0555p.values()[this.f18245k];
        a5.f18394h = this.f18246l;
        a5.f18396i = this.f18247m;
        a5.f18391f0 = this.f18248n;
        return a5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f18236a);
        sb.append(" (");
        sb.append(this.f18237b);
        sb.append(")}:");
        if (this.f18238c) {
            sb.append(" fromLayout");
        }
        int i9 = this.f18240e;
        if (i9 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i9));
        }
        String str = this.f18241f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f18242g) {
            sb.append(" retainInstance");
        }
        if (this.f18243h) {
            sb.append(" removing");
        }
        if (this.f18244i) {
            sb.append(" detached");
        }
        if (this.j) {
            sb.append(" hidden");
        }
        String str2 = this.f18246l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f18247m);
        }
        if (this.f18248n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18236a);
        parcel.writeString(this.f18237b);
        parcel.writeInt(this.f18238c ? 1 : 0);
        parcel.writeInt(this.f18239d);
        parcel.writeInt(this.f18240e);
        parcel.writeString(this.f18241f);
        parcel.writeInt(this.f18242g ? 1 : 0);
        parcel.writeInt(this.f18243h ? 1 : 0);
        parcel.writeInt(this.f18244i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.f18245k);
        parcel.writeString(this.f18246l);
        parcel.writeInt(this.f18247m);
        parcel.writeInt(this.f18248n ? 1 : 0);
    }

    public C1342T(Parcel parcel) {
        this.f18236a = parcel.readString();
        this.f18237b = parcel.readString();
        this.f18238c = parcel.readInt() != 0;
        this.f18239d = parcel.readInt();
        this.f18240e = parcel.readInt();
        this.f18241f = parcel.readString();
        this.f18242g = parcel.readInt() != 0;
        this.f18243h = parcel.readInt() != 0;
        this.f18244i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.f18245k = parcel.readInt();
        this.f18246l = parcel.readString();
        this.f18247m = parcel.readInt();
        this.f18248n = parcel.readInt() != 0;
    }
}
