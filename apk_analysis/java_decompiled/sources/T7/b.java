package T7;

import B7.x;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends x {

    /* renamed from: a, reason: collision with root package name */
    public final int f7240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7241b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7242c;

    /* renamed from: d, reason: collision with root package name */
    public int f7243d;

    public b(int i9, int i10, int i11) {
        this.f7240a = i11;
        this.f7241b = i10;
        boolean z9 = false;
        if (i11 <= 0 ? i9 >= i10 : i9 <= i10) {
            z9 = true;
        }
        this.f7242c = z9;
        this.f7243d = z9 ? i9 : i10;
    }

    @Override // B7.x
    public final int a() {
        int i9 = this.f7243d;
        if (i9 == this.f7241b) {
            if (this.f7242c) {
                this.f7242c = false;
                return i9;
            }
            throw new NoSuchElementException();
        }
        this.f7243d = this.f7240a + i9;
        return i9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7242c;
    }
}
