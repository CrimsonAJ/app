package X2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s extends E {

    /* renamed from: a, reason: collision with root package name */
    public final long f8391a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8392b;

    /* renamed from: c, reason: collision with root package name */
    public final o f8393c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8394d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8395e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8396f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8397g;

    /* renamed from: h, reason: collision with root package name */
    public final v f8398h;

    /* renamed from: i, reason: collision with root package name */
    public final p f8399i;

    public s(long j, Integer num, o oVar, long j4, byte[] bArr, String str, long j9, v vVar, p pVar) {
        this.f8391a = j;
        this.f8392b = num;
        this.f8393c = oVar;
        this.f8394d = j4;
        this.f8395e = bArr;
        this.f8396f = str;
        this.f8397g = j9;
        this.f8398h = vVar;
        this.f8399i = pVar;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj != this) {
            if (obj instanceof E) {
                E e8 = (E) obj;
                s sVar = (s) e8;
                if (this.f8391a == sVar.f8391a) {
                    Integer num = this.f8392b;
                    if (num == null) {
                        if (sVar.f8392b != null) {
                            return false;
                        }
                    } else if (!num.equals(sVar.f8392b)) {
                        return false;
                    }
                    o oVar = this.f8393c;
                    if (oVar == null) {
                        if (sVar.f8393c != null) {
                            return false;
                        }
                    } else if (!oVar.equals(sVar.f8393c)) {
                        return false;
                    }
                    if (this.f8394d == sVar.f8394d) {
                        if (e8 instanceof s) {
                            bArr = ((s) e8).f8395e;
                        } else {
                            bArr = sVar.f8395e;
                        }
                        if (Arrays.equals(this.f8395e, bArr)) {
                            String str = sVar.f8396f;
                            String str2 = this.f8396f;
                            if (str2 == null) {
                                if (str != null) {
                                    return false;
                                }
                            } else if (!str2.equals(str)) {
                                return false;
                            }
                            if (this.f8397g == sVar.f8397g) {
                                v vVar = sVar.f8398h;
                                v vVar2 = this.f8398h;
                                if (vVar2 == null) {
                                    if (vVar != null) {
                                        return false;
                                    }
                                } else if (!vVar2.equals(vVar)) {
                                    return false;
                                }
                                p pVar = sVar.f8399i;
                                p pVar2 = this.f8399i;
                                if (pVar2 == null) {
                                    if (pVar == null) {
                                        return true;
                                    }
                                    return false;
                                }
                                if (pVar2.equals(pVar)) {
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
        int hashCode4;
        long j = this.f8391a;
        int i9 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f8392b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i9 ^ hashCode) * 1000003;
        o oVar = this.f8393c;
        if (oVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = oVar.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        long j4 = this.f8394d;
        int hashCode5 = (((i12 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f8395e)) * 1000003;
        String str = this.f8396f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (hashCode5 ^ hashCode3) * 1000003;
        long j9 = this.f8397g;
        int i14 = (i13 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        v vVar = this.f8398h;
        if (vVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = vVar.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        p pVar = this.f8399i;
        if (pVar != null) {
            i10 = pVar.hashCode();
        }
        return i15 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f8391a + ", eventCode=" + this.f8392b + ", complianceData=" + this.f8393c + ", eventUptimeMs=" + this.f8394d + ", sourceExtension=" + Arrays.toString(this.f8395e) + ", sourceExtensionJsonProto3=" + this.f8396f + ", timezoneOffsetSeconds=" + this.f8397g + ", networkConnectionInfo=" + this.f8398h + ", experimentIds=" + this.f8399i + "}";
    }
}
