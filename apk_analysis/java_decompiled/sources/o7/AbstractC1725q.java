package o7;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: o7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1725q implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    public int f21704a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f21705b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f21706c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f21707d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21708e;

    /* renamed from: f, reason: collision with root package name */
    public int f21709f;

    public abstract C1724p F();

    public final int I() {
        int i9 = this.f21704a;
        if (i9 != 0) {
            return this.f21705b[i9 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract C1724p N(long j);

    public abstract C1724p O(String str);

    public abstract C1724p a();

    public abstract C1724p d();

    public abstract C1724p g();

    public final String s() {
        return AbstractC1708D.c(this.f21704a, this.f21705b, this.f21707d, this.f21706c);
    }

    public abstract C1724p x(String str);
}
