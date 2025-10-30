package H2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new A1.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f3031a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3032b;

    public j(String id, String title) {
        kotlin.jvm.internal.h.e(id, "id");
        kotlin.jvm.internal.h.e(title, "title");
        this.f3031a = id;
        this.f3032b = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (kotlin.jvm.internal.h.a(this.f3031a, jVar.f3031a) && kotlin.jvm.internal.h.a(this.f3032b, jVar.f3032b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3032b.hashCode() + (this.f3031a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Filter(id=");
        sb.append(this.f3031a);
        sb.append(", title=");
        return AbstractC0953k1.q(sb, this.f3032b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeString(this.f3031a);
        dest.writeString(this.f3032b);
    }
}
