package C1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import i8.w;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1218a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f1219b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f1220c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.h f1221d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.g f1222e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1223f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1224g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1225h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1226i;
    public final w j;

    /* renamed from: k, reason: collision with root package name */
    public final q f1227k;

    /* renamed from: l, reason: collision with root package name */
    public final n f1228l;

    /* renamed from: m, reason: collision with root package name */
    public final b f1229m;

    /* renamed from: n, reason: collision with root package name */
    public final b f1230n;

    /* renamed from: o, reason: collision with root package name */
    public final b f1231o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, D1.h hVar, D1.g gVar, boolean z9, boolean z10, boolean z11, String str, w wVar, q qVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f1218a = context;
        this.f1219b = config;
        this.f1220c = colorSpace;
        this.f1221d = hVar;
        this.f1222e = gVar;
        this.f1223f = z9;
        this.f1224g = z10;
        this.f1225h = z11;
        this.f1226i = str;
        this.j = wVar;
        this.f1227k = qVar;
        this.f1228l = nVar;
        this.f1229m = bVar;
        this.f1230n = bVar2;
        this.f1231o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (kotlin.jvm.internal.h.a(this.f1218a, mVar.f1218a) && this.f1219b == mVar.f1219b) {
                if ((Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.h.a(this.f1220c, mVar.f1220c)) && kotlin.jvm.internal.h.a(this.f1221d, mVar.f1221d) && this.f1222e == mVar.f1222e && this.f1223f == mVar.f1223f && this.f1224g == mVar.f1224g && this.f1225h == mVar.f1225h && kotlin.jvm.internal.h.a(this.f1226i, mVar.f1226i) && kotlin.jvm.internal.h.a(this.j, mVar.j) && kotlin.jvm.internal.h.a(this.f1227k, mVar.f1227k) && kotlin.jvm.internal.h.a(this.f1228l, mVar.f1228l) && this.f1229m == mVar.f1229m && this.f1230n == mVar.f1230n && this.f1231o == mVar.f1231o) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        int hashCode = (this.f1219b.hashCode() + (this.f1218a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f1220c;
        int i12 = 0;
        if (colorSpace != null) {
            i9 = colorSpace.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = (this.f1222e.hashCode() + ((this.f1221d.hashCode() + ((hashCode + i9) * 31)) * 31)) * 31;
        int i13 = 1237;
        if (this.f1223f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (hashCode2 + i10) * 31;
        if (this.f1224g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f1225h) {
            i13 = 1231;
        }
        int i16 = (i15 + i13) * 31;
        String str = this.f1226i;
        if (str != null) {
            i12 = str.hashCode();
        }
        return this.f1231o.hashCode() + ((this.f1230n.hashCode() + ((this.f1229m.hashCode() + ((this.f1228l.f1233a.hashCode() + ((this.f1227k.f1242a.hashCode() + ((((i16 + i12) * 31) + Arrays.hashCode(this.j.f19159a)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
