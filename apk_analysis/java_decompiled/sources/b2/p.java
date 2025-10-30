package b2;

import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f10501a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10502b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10503c;

    public p(Movie movie, String str, String str2) {
        this.f10501a = movie;
        this.f10502b = str;
        this.f10503c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (kotlin.jvm.internal.h.a(this.f10501a, pVar.f10501a) && kotlin.jvm.internal.h.a(this.f10502b, pVar.f10502b) && kotlin.jvm.internal.h.a(this.f10503c, pVar.f10503c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f10501a.hashCode() * 31;
        int i9 = 0;
        String str = this.f10502b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        String str2 = this.f10503c;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigateToDetail(movie=");
        sb.append(this.f10501a);
        sb.append(", parentId=");
        sb.append(this.f10502b);
        sb.append(", childId=");
        return AbstractC0953k1.q(sb, this.f10503c, ")");
    }
}
