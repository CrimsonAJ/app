package O3;

import android.net.Uri;
import j3.InterfaceC1453f;
import java.util.Arrays;
import l4.y;

/* loaded from: classes.dex */
public final class b implements InterfaceC1453f {

    /* renamed from: f, reason: collision with root package name */
    public static final b f5451f = new b(new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final a f5452g;

    /* renamed from: h, reason: collision with root package name */
    public static final C6.a f5453h;

    /* renamed from: a, reason: collision with root package name */
    public final int f5454a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5455b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5456c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5457d;

    /* renamed from: e, reason: collision with root package name */
    public final a[] f5458e;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, -9223372036854775807L);
        f5452g = new a(0L, 0, -1, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2, 0L, false);
        f5453h = new C6.a(16);
    }

    public b(a[] aVarArr, long j, long j4, int i9) {
        this.f5455b = j;
        this.f5456c = j4;
        this.f5454a = aVarArr.length + i9;
        this.f5458e = aVarArr;
        this.f5457d = i9;
    }

    public final a a(int i9) {
        int i10 = this.f5457d;
        if (i9 < i10) {
            return f5452g;
        }
        return this.f5458e[i9 - i10];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                int i9 = y.f20553a;
                if (this.f5454a == bVar.f5454a && this.f5455b == bVar.f5455b && this.f5456c == bVar.f5456c && this.f5457d == bVar.f5457d && Arrays.equals(this.f5458e, bVar.f5458e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.f5454a * 961) + ((int) this.f5455b)) * 31) + ((int) this.f5456c)) * 31) + this.f5457d) * 31) + Arrays.hashCode(this.f5458e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f5455b);
        sb.append(", adGroups=[");
        int i9 = 0;
        while (true) {
            a[] aVarArr = this.f5458e;
            if (i9 < aVarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(aVarArr[i9].f5443a);
                sb.append(", ads=[");
                for (int i10 = 0; i10 < aVarArr[i9].f5447e.length; i10++) {
                    sb.append("ad(state=");
                    int i11 = aVarArr[i9].f5447e[i10];
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(aVarArr[i9].f5448f[i10]);
                    sb.append(')');
                    if (i10 < aVarArr[i9].f5447e.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i9 < aVarArr.length - 1) {
                    sb.append(", ");
                }
                i9++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
