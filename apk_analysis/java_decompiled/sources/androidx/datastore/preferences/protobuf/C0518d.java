package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.cast.I2;
import com.google.android.gms.internal.measurement.T1;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9691a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9692b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f9693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9694d;

    public C0518d(I2 i22) {
        this.f9694d = i22;
        this.f9693c = i22.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9691a) {
            case 0:
                if (this.f9692b < this.f9693c) {
                    return true;
                }
                return false;
            case 1:
                if (this.f9692b < this.f9693c) {
                    return true;
                }
                return false;
            case 2:
                if (this.f9692b < this.f9693c) {
                    return true;
                }
                return false;
            default:
                if (this.f9692b < this.f9693c) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9691a) {
            case 0:
                int i9 = this.f9692b;
                if (i9 < this.f9693c) {
                    this.f9692b = i9 + 1;
                    return Byte.valueOf(((C0521g) this.f9694d).g(i9));
                }
                throw new NoSuchElementException();
            case 1:
                int i10 = this.f9692b;
                if (i10 < this.f9693c) {
                    this.f9692b = i10 + 1;
                    return Byte.valueOf(((I2) this.f9694d).c(i10));
                }
                throw new NoSuchElementException();
            case 2:
                int i11 = this.f9692b;
                if (i11 < this.f9693c) {
                    this.f9692b = i11 + 1;
                    return Byte.valueOf(((T1) this.f9694d).c(i11));
                }
                throw new NoSuchElementException();
            default:
                int i12 = this.f9692b;
                if (i12 < this.f9693c) {
                    this.f9692b = i12 + 1;
                    return Byte.valueOf(((C1036g) this.f9694d).i(i12));
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9691a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0518d(T1 t12) {
        this.f9694d = t12;
        this.f9693c = t12.d();
    }

    public C0518d(C0521g c0521g) {
        this.f9694d = c0521g;
        this.f9693c = c0521g.size();
    }

    public C0518d(C1036g c1036g) {
        this.f9694d = c1036g;
        this.f9693c = c1036g.size();
    }
}
