package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058d extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f16470a;

    /* renamed from: b, reason: collision with root package name */
    public long f16471b;

    public C1058d(InputStream inputStream) {
        super(inputStream);
        this.f16471b = -1L;
        this.f16470a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f16470a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i9) {
        ((FilterInputStream) this).in.mark(i9);
        this.f16471b = this.f16470a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f16470a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f16470a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f16471b != -1) {
                ((FilterInputStream) this).in.reset();
                this.f16470a = this.f16471b;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f16470a));
        this.f16470a -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        long j = this.f16470a;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i9, (int) Math.min(i10, j));
        if (read != -1) {
            this.f16470a -= read;
        }
        return read;
    }
}
