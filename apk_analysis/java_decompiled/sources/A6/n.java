package A6;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f523c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f524a;

    /* renamed from: b, reason: collision with root package name */
    public m f525b;

    public n(File file) {
        this.f524a = file;
    }

    public final void a() {
        File file = this.f524a;
        if (this.f525b == null) {
            try {
                this.f525b = new m(file);
            } catch (IOException e8) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e8);
            }
        }
    }

    @Override // A6.d
    public final void b() {
        y6.g.b(this.f525b, "There was a problem closing the Crashlytics log file.");
        this.f525b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    @Override // A6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f() {
        /*
            r7 = this;
            java.io.File r0 = r7.f524a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L38
        Lc:
            r7.a()
            A6.m r0 = r7.f525b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.a0()
            byte[] r0 = new byte[r0]
            A6.m r4 = r7.f525b     // Catch: java.io.IOException -> L29
            A6.f r5 = new A6.f     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.s(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L31:
            A1.i r4 = new A1.i
            r3 = r3[r2]
            r4.<init>(r3, r0)
        L38:
            if (r4 != 0) goto L3c
            r3 = r1
            goto L47
        L3c:
            int r0 = r4.f24a
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f25b
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L47:
            if (r3 == 0) goto L51
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = A6.n.f523c
            r0.<init>(r3, r1)
            return r0
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.n.f():java.lang.String");
    }

    @Override // A6.d
    public final void m(long j, String str) {
        a();
        if (this.f525b != null) {
            if (str == null) {
                str = "null";
            }
            try {
                if (str.length() > 16384) {
                    str = "..." + str.substring(str.length() - 16384);
                }
                this.f525b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f523c));
                while (!this.f525b.x() && this.f525b.a0() > 65536) {
                    this.f525b.N();
                }
            } catch (IOException e8) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e8);
            }
        }
    }
}
