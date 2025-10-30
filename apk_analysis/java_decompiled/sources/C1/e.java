package C1;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1173b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f1174c;

    public e(Drawable drawable, i iVar, Throwable th) {
        this.f1172a = drawable;
        this.f1173b = iVar;
        this.f1174c = th;
    }

    @Override // C1.j
    public final Drawable a() {
        return this.f1172a;
    }

    @Override // C1.j
    public final i b() {
        return this.f1173b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (kotlin.jvm.internal.h.a(this.f1172a, eVar.f1172a)) {
                if (kotlin.jvm.internal.h.a(this.f1173b, eVar.f1173b) && kotlin.jvm.internal.h.a(this.f1174c, eVar.f1174c)) {
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
        Drawable drawable = this.f1172a;
        if (drawable != null) {
            i9 = drawable.hashCode();
        } else {
            i9 = 0;
        }
        return this.f1174c.hashCode() + ((this.f1173b.hashCode() + (i9 * 31)) * 31);
    }
}
