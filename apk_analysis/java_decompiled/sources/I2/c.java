package I2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;
import u0.z;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new H3.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final long f3461a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3462b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3463c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3464d;

    public c(long j, String code, String name, String path) {
        h.e(code, "code");
        h.e(name, "name");
        h.e(path, "path");
        this.f3461a = j;
        this.f3462b = code;
        this.f3463c = name;
        this.f3464d = path;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3461a == cVar.f3461a && h.a(this.f3462b, cVar.f3462b) && h.a(this.f3463c, cVar.f3463c) && h.a(this.f3464d, cVar.f3464d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3461a;
        return this.f3464d.hashCode() + z.c(this.f3463c, z.c(this.f3462b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimeSubtitle(id=" + this.f3461a + ", code=" + this.f3462b + ", name=" + this.f3463c + ", path=" + this.f3464d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        h.e(dest, "dest");
        dest.writeLong(this.f3461a);
        dest.writeString(this.f3462b);
        dest.writeString(this.f3463c);
        dest.writeString(this.f3464d);
    }
}
