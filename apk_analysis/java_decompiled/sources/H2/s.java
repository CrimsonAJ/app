package H2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new A1.a(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f3051a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3052b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3053c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3054d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3055e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3056f;

    public s(int i9, long j, long j4, String animeName, String animePoster, List allNames) {
        kotlin.jvm.internal.h.e(animeName, "animeName");
        kotlin.jvm.internal.h.e(animePoster, "animePoster");
        kotlin.jvm.internal.h.e(allNames, "allNames");
        this.f3051a = j;
        this.f3052b = animeName;
        this.f3053c = animePoster;
        this.f3054d = j4;
        this.f3055e = i9;
        this.f3056f = allNames;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f3051a == sVar.f3051a && kotlin.jvm.internal.h.a(this.f3052b, sVar.f3052b) && kotlin.jvm.internal.h.a(this.f3053c, sVar.f3053c) && this.f3054d == sVar.f3054d && this.f3055e == sVar.f3055e && kotlin.jvm.internal.h.a(this.f3056f, sVar.f3056f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3051a;
        int c3 = u0.z.c(this.f3053c, u0.z.c(this.f3052b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        long j4 = this.f3054d;
        return this.f3056f.hashCode() + ((((c3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f3055e) * 31);
    }

    public final String toString() {
        return "PlayableData(animeId=" + this.f3051a + ", animeName=" + this.f3052b + ", animePoster=" + this.f3053c + ", episodeId=" + this.f3054d + ", year=" + this.f3055e + ", allNames=" + this.f3056f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeLong(this.f3051a);
        dest.writeString(this.f3052b);
        dest.writeString(this.f3053c);
        dest.writeLong(this.f3054d);
        dest.writeInt(this.f3055e);
        dest.writeStringList(this.f3056f);
    }

    public /* synthetic */ s(long j, String str, String str2, long j4, int i9, List list, int i10) {
        this((i10 & 16) != 0 ? 0 : i9, j, (i10 & 8) != 0 ? -1L : j4, str, str2, (i10 & 32) != 0 ? B7.t.f1135a : list);
    }
}
