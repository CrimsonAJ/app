package B6;

import android.os.Build;

/* renamed from: B6.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039o0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1039a;

    public C0039o0(boolean z9) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str != null) {
            if (str2 != null) {
                this.f1039a = z9;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0039o0) {
                C0039o0 c0039o0 = (C0039o0) obj;
                c0039o0.getClass();
                String str = Build.VERSION.RELEASE;
                if (str.equals(str)) {
                    String str2 = Build.VERSION.CODENAME;
                    if (str2.equals(str2) && this.f1039a == c0039o0.f1039a) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003;
        if (this.f1039a) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f1039a + "}";
    }
}
