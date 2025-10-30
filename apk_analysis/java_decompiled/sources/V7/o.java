package V7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements j, d {

    /* renamed from: a, reason: collision with root package name */
    public final j f7839a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7840b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7841c;

    public o(j jVar, int i9, int i10) {
        this.f7839a = jVar;
        this.f7840b = i9;
        this.f7841c = i10;
        if (i9 >= 0) {
            if (i10 >= 0) {
                if (i10 >= i9) {
                    return;
                } else {
                    throw new IllegalArgumentException(A0.a.l("endIndex should be not less than startIndex, but was ", i10, i9, " < ").toString());
                }
            }
            throw new IllegalArgumentException(AbstractC0953k1.j(i10, "endIndex should be non-negative, but is ").toString());
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "startIndex should be non-negative, but is ").toString());
    }

    @Override // V7.d
    public final j a(int i9) {
        int i10 = this.f7841c;
        int i11 = this.f7840b;
        if (i9 >= i10 - i11) {
            return e.f7818a;
        }
        return new o(this.f7839a, i11 + i9, i10);
    }

    @Override // V7.d
    public final j b() {
        int i9 = this.f7841c;
        int i10 = this.f7840b;
        if (15 >= i9 - i10) {
            return this;
        }
        return new o(this.f7839a, i10, i10 + 15);
    }

    @Override // V7.j
    public final Iterator iterator() {
        return new h(this);
    }
}
