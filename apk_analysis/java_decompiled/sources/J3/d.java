package J3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.M;
import java.util.ArrayList;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class d implements D3.b {
    public static final Parcelable.Creator<d> CREATOR = new H3.b(17);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4185a;

    public d(ArrayList arrayList) {
        this.f4185a = arrayList;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            long j = ((c) arrayList.get(0)).f4183b;
            int i9 = 1;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                if (((c) arrayList.get(i9)).f4182a < j) {
                    z9 = true;
                    break;
                } else {
                    j = ((c) arrayList.get(i9)).f4183b;
                    i9++;
                }
            }
        }
        AbstractC1566a.h(!z9);
    }

    @Override // D3.b
    public final /* synthetic */ void b(C1444a0 c1444a0) {
    }

    @Override // D3.b
    public final /* synthetic */ M c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // D3.b
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f4185a.equals(((d) obj).f4185a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4185a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f4185a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeList(this.f4185a);
    }
}
