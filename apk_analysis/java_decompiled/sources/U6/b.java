package U6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7528a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7529b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7530c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7531d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7532e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7533f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7534g;

    public b(String str, int i9, String str2, String str3, long j, long j4, String str4) {
        this.f7528a = str;
        this.f7529b = i9;
        this.f7530c = str2;
        this.f7531d = str3;
        this.f7532e = j;
        this.f7533f = j4;
        this.f7534g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U6.a, java.lang.Object] */
    public final a a() {
        ?? obj = new Object();
        obj.f7522b = this.f7528a;
        obj.f7521a = this.f7529b;
        obj.f7523c = this.f7530c;
        obj.f7524d = this.f7531d;
        obj.f7526f = Long.valueOf(this.f7532e);
        obj.f7527g = Long.valueOf(this.f7533f);
        obj.f7525e = this.f7534g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = this.f7528a;
                if (str == null) {
                    if (bVar.f7528a != null) {
                        return false;
                    }
                } else if (!str.equals(bVar.f7528a)) {
                    return false;
                }
                if (AbstractC2128h.a(this.f7529b, bVar.f7529b)) {
                    String str2 = bVar.f7530c;
                    String str3 = this.f7530c;
                    if (str3 == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (!str3.equals(str2)) {
                        return false;
                    }
                    String str4 = bVar.f7531d;
                    String str5 = this.f7531d;
                    if (str5 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (!str5.equals(str4)) {
                        return false;
                    }
                    if (this.f7532e == bVar.f7532e && this.f7533f == bVar.f7533f) {
                        String str6 = bVar.f7534g;
                        String str7 = this.f7534g;
                        if (str7 == null) {
                            if (str6 == null) {
                                return true;
                            }
                            return false;
                        }
                        if (str7.equals(str6)) {
                            return true;
                        }
                        return false;
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i9 = 0;
        String str = this.f7528a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b9 = (((hashCode ^ 1000003) * 1000003) ^ AbstractC2128h.b(this.f7529b)) * 1000003;
        String str2 = this.f7530c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (b9 ^ hashCode2) * 1000003;
        String str3 = this.f7531d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        long j = this.f7532e;
        int i12 = (i11 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j4 = this.f7533f;
        int i13 = (i12 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str4 = this.f7534g;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        return i9 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f7528a);
        sb.append(", registrationStatus=");
        int i9 = this.f7529b;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            str = "null";
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f7530c);
        sb.append(", refreshToken=");
        sb.append(this.f7531d);
        sb.append(", expiresInSecs=");
        sb.append(this.f7532e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f7533f);
        sb.append(", fisError=");
        return AbstractC0953k1.q(sb, this.f7534g, "}");
    }
}
