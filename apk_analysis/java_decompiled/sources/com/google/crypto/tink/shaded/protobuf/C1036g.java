package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0518d;
import java.util.Iterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1036g extends AbstractC1037h {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16354d;

    public C1036g(byte[] bArr) {
        this.f16358a = 0;
        bArr.getClass();
        this.f16354d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1037h
    public byte b(int i9) {
        return this.f16354d[i9];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1037h
    public void e(int i9, byte[] bArr) {
        System.arraycopy(this.f16354d, 0, bArr, 0, i9);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof AbstractC1037h) && size() == ((AbstractC1037h) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof C1036g) {
                        C1036g c1036g = (C1036g) obj;
                        int i9 = this.f16358a;
                        int i10 = c1036g.f16358a;
                        if (i9 == 0 || i10 == 0 || i9 == i10) {
                            int size = size();
                            if (size <= c1036g.size()) {
                                if (size <= c1036g.size()) {
                                    int g9 = g() + size;
                                    int g10 = g();
                                    int g11 = c1036g.g();
                                    while (g10 < g9) {
                                        if (this.f16354d[g10] != c1036g.f16354d[g11]) {
                                            return false;
                                        }
                                        g10++;
                                        g11++;
                                    }
                                    return true;
                                }
                                StringBuilder p9 = A0.a.p("Ran off end of other: 0, ", size, ", ");
                                p9.append(c1036g.size());
                                throw new IllegalArgumentException(p9.toString());
                            }
                            throw new IllegalArgumentException("Length too large: " + size + size());
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    public byte i(int i9) {
        return this.f16354d[i9];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0518d(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1037h
    public int size() {
        return this.f16354d.length;
    }
}
