package i0;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class X extends Writer implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f18270b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f18269a = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f18270b;
        if (sb.length() > 0) {
            Log.d(this.f18269a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c3 = cArr[i9 + i11];
            if (c3 == '\n') {
                a();
            } else {
                this.f18270b.append(c3);
            }
        }
    }
}
