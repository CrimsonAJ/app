package O3;

import android.net.Uri;
import j3.InterfaceC1453f;
import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class a implements InterfaceC1453f {

    /* renamed from: i, reason: collision with root package name */
    public static final C6.a f5442i = new C6.a(17);

    /* renamed from: a, reason: collision with root package name */
    public final long f5443a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5444b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5445c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri[] f5446d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f5447e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f5448f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5449g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5450h;

    public a(long j, int i9, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j4, boolean z9) {
        boolean z10;
        if (iArr.length == uriArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1566a.h(z10);
        this.f5443a = j;
        this.f5444b = i9;
        this.f5445c = i10;
        this.f5447e = iArr;
        this.f5446d = uriArr;
        this.f5448f = jArr;
        this.f5449g = j4;
        this.f5450h = z9;
    }

    public final int a(int i9) {
        int i10;
        int i11 = i9 + 1;
        while (true) {
            int[] iArr = this.f5447e;
            if (i11 >= iArr.length || this.f5450h || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5443a == aVar.f5443a && this.f5444b == aVar.f5444b && this.f5445c == aVar.f5445c && Arrays.equals(this.f5446d, aVar.f5446d) && Arrays.equals(this.f5447e, aVar.f5447e) && Arrays.equals(this.f5448f, aVar.f5448f) && this.f5449g == aVar.f5449g && this.f5450h == aVar.f5450h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = ((this.f5444b * 31) + this.f5445c) * 31;
        long j = this.f5443a;
        int hashCode = (Arrays.hashCode(this.f5448f) + ((Arrays.hashCode(this.f5447e) + ((((i9 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f5446d)) * 31)) * 31)) * 31;
        long j4 = this.f5449g;
        return ((hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f5450h ? 1 : 0);
    }
}
