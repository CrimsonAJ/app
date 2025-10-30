package C1;

import android.graphics.drawable.Drawable;
import u1.EnumC2057e;

/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f1234a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1235b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC2057e f1236c;

    /* renamed from: d, reason: collision with root package name */
    public final A1.b f1237d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1238e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1239f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1240g;

    public p(Drawable drawable, i iVar, EnumC2057e enumC2057e, A1.b bVar, String str, boolean z9, boolean z10) {
        this.f1234a = drawable;
        this.f1235b = iVar;
        this.f1236c = enumC2057e;
        this.f1237d = bVar;
        this.f1238e = str;
        this.f1239f = z9;
        this.f1240g = z10;
    }

    @Override // C1.j
    public final Drawable a() {
        return this.f1234a;
    }

    @Override // C1.j
    public final i b() {
        return this.f1235b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (kotlin.jvm.internal.h.a(this.f1234a, pVar.f1234a)) {
                if (kotlin.jvm.internal.h.a(this.f1235b, pVar.f1235b) && this.f1236c == pVar.f1236c && kotlin.jvm.internal.h.a(this.f1237d, pVar.f1237d) && kotlin.jvm.internal.h.a(this.f1238e, pVar.f1238e) && this.f1239f == pVar.f1239f && this.f1240g == pVar.f1240g) {
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
        int hashCode = (this.f1236c.hashCode() + ((this.f1235b.hashCode() + (this.f1234a.hashCode() * 31)) * 31)) * 31;
        int i11 = 0;
        A1.b bVar = this.f1237d;
        if (bVar != null) {
            i9 = bVar.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (hashCode + i9) * 31;
        String str = this.f1238e;
        if (str != null) {
            i11 = str.hashCode();
        }
        int i13 = (i12 + i11) * 31;
        int i14 = 1237;
        if (this.f1239f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (i13 + i10) * 31;
        if (this.f1240g) {
            i14 = 1231;
        }
        return i15 + i14;
    }
}
