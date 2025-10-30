package P3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final long f5820a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5821b;

    /* renamed from: c, reason: collision with root package name */
    public long f5822c;

    public b(long j, long j4) {
        this.f5820a = j;
        this.f5821b = j4;
        this.f5822c = j - 1;
    }

    public final void a() {
        long j = this.f5822c;
        if (j >= this.f5820a && j <= this.f5821b) {
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // P3.l
    public final boolean next() {
        boolean z9;
        long j = this.f5822c + 1;
        this.f5822c = j;
        if (j > this.f5821b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
