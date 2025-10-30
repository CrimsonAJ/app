package Y2;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f8620a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8621b;

    /* renamed from: c, reason: collision with root package name */
    public final m f8622c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8623d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8624e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f8625f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f8626g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8627h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f8628i;
    public final byte[] j;

    public i(String str, Integer num, m mVar, long j, long j4, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f8620a = str;
        this.f8621b = num;
        this.f8622c = mVar;
        this.f8623d = j;
        this.f8624e = j4;
        this.f8625f = hashMap;
        this.f8626g = num2;
        this.f8627h = str2;
        this.f8628i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f8625f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f8625f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Y2.h] */
    public final h c() {
        ?? obj = new Object();
        String str = this.f8620a;
        if (str != null) {
            obj.f8611a = str;
            obj.f8613c = this.f8621b;
            obj.f8614d = this.f8626g;
            obj.f8612b = this.f8627h;
            obj.f8619i = this.f8628i;
            obj.j = this.j;
            m mVar = this.f8622c;
            if (mVar != null) {
                obj.f8615e = mVar;
                obj.f8616f = Long.valueOf(this.f8623d);
                obj.f8617g = Long.valueOf(this.f8624e);
                obj.f8618h = new HashMap(this.f8625f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.f8620a.equals(iVar.f8620a)) {
                    Integer num = iVar.f8621b;
                    Integer num2 = this.f8621b;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    if (this.f8622c.equals(iVar.f8622c) && this.f8623d == iVar.f8623d && this.f8624e == iVar.f8624e && this.f8625f.equals(iVar.f8625f)) {
                        Integer num3 = iVar.f8626g;
                        Integer num4 = this.f8626g;
                        if (num4 == null) {
                            if (num3 != null) {
                                return false;
                            }
                        } else if (!num4.equals(num3)) {
                            return false;
                        }
                        String str = iVar.f8627h;
                        String str2 = this.f8627h;
                        if (str2 == null) {
                            if (str != null) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                        if (Arrays.equals(this.f8628i, iVar.f8628i) && Arrays.equals(this.j, iVar.j)) {
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
        int hashCode3 = (this.f8620a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        Integer num = this.f8621b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ hashCode) * 1000003) ^ this.f8622c.hashCode()) * 1000003;
        long j = this.f8623d;
        int i10 = (hashCode4 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j4 = this.f8624e;
        int hashCode5 = (((i10 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f8625f.hashCode()) * 1000003;
        Integer num2 = this.f8626g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode2) * 1000003;
        String str = this.f8627h;
        if (str != null) {
            i9 = str.hashCode();
        }
        return ((((i11 ^ i9) * 1000003) ^ Arrays.hashCode(this.f8628i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f8620a + ", code=" + this.f8621b + ", encodedPayload=" + this.f8622c + ", eventMillis=" + this.f8623d + ", uptimeMillis=" + this.f8624e + ", autoMetadata=" + this.f8625f + ", productId=" + this.f8626g + ", pseudonymousId=" + this.f8627h + ", experimentIdsClear=" + Arrays.toString(this.f8628i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
