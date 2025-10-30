package k4;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class z extends AbstractC1507g {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f20133e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f20134f;

    /* renamed from: g, reason: collision with root package name */
    public long f20135g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20136h;

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f20135g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f20133e;
            int i11 = l4.y.f20553a;
            int read = randomAccessFile.read(bArr, i9, (int) Math.min(j, i10));
            if (read > 0) {
                this.f20135g -= read;
                c(read);
            }
            return read;
        } catch (IOException e8) {
            throw new C1514n(e8, 2000);
        }
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        this.f20134f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f20133e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e8) {
                throw new C1514n(e8, 2000);
            }
        } finally {
            this.f20133e = null;
            if (this.f20136h) {
                this.f20136h = false;
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // k4.InterfaceC1513m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(k4.C1516p r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.f20077a
            long r1 = r9.f20081e
            r8.f20134f = r0
            r8.h()
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r6 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r6.getClass()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r8.f20133e = r5
            r5.seek(r1)     // Catch: java.io.IOException -> L30
            long r4 = r9.f20082f     // Catch: java.io.IOException -> L30
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r8.f20133e     // Catch: java.io.IOException -> L30
            long r4 = r0.length()     // Catch: java.io.IOException -> L30
            long r4 = r4 - r1
            goto L32
        L30:
            r9 = move-exception
            goto L4c
        L32:
            r8.f20135g = r4     // Catch: java.io.IOException -> L30
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L43
            r0 = 1
            r8.f20136h = r0
            r8.i(r9)
            long r0 = r8.f20135g
            return r0
        L43:
            k4.y r9 = new k4.y
            r0 = 0
            r1 = 2008(0x7d8, float:2.814E-42)
            r9.<init>(r0, r0, r1)
            throw r9
        L4c:
            k4.y r0 = new k4.y
            r0.<init>(r9, r3)
            throw r0
        L52:
            r9 = move-exception
            goto L58
        L54:
            r9 = move-exception
            goto L5e
        L56:
            r9 = move-exception
            goto L64
        L58:
            k4.y r0 = new k4.y
            r0.<init>(r9, r3)
            throw r0
        L5e:
            k4.y r0 = new k4.y
            r0.<init>(r9, r4)
            throw r0
        L64:
            java.lang.String r1 = r0.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            java.lang.String r1 = r0.getFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            k4.y r0 = new k4.y
            int r1 = l4.y.f20553a
            r2 = 21
            if (r1 < r2) goto L8b
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = k4.AbstractC1523x.a(r1)
            if (r1 == 0) goto L8b
            goto L8d
        L8b:
            r4 = 2005(0x7d5, float:2.81E-42)
        L8d:
            r0.<init>(r9, r4)
            throw r0
        L91:
            k4.y r1 = new k4.y
            java.lang.String r2 = r0.getPath()
            java.lang.String r3 = r0.getQuery()
            java.lang.String r0 = r0.getFragment()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ",query="
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ",fragment="
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r0, r9, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.z.g(k4.p):long");
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f20134f;
    }
}
