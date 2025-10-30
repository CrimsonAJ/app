package A1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f6a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f7b;

    public b(String str, Map map) {
        this.f6a = str;
        this.f7b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (kotlin.jvm.internal.h.a(this.f6a, bVar.f6a) && kotlin.jvm.internal.h.a(this.f7b, bVar.f7b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7b.hashCode() + (this.f6a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f6a + ", extras=" + this.f7b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f6a);
        Map map = this.f7b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
