package K1;

import A7.l;
import B2.i;
import C2.P;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4248a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4249b;

    /* renamed from: c, reason: collision with root package name */
    public final l f4250c;

    public g(Context context) {
        h.e(context, "context");
        this.f4248a = context;
        this.f4249b = Z0.a.q(new P(2));
        this.f4250c = Z0.a.q(new i(4, this));
    }

    public static File c(String str, InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        File file = new File(str);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        inputStream.close();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r5, java.lang.String r6, q2.C1892u r7, G7.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof K1.d
            if (r0 == 0) goto L13
            r0 = r8
            K1.d r0 = (K1.d) r0
            int r1 = r0.f4241v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4241v = r1
            goto L18
        L13:
            K1.d r0 = new K1.d
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f4239t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f4241v
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            K1.g r5 = r0.f4238s
            java.lang.String r6 = r0.f4237r
            a.AbstractC0485a.A(r8)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r5 = move-exception
            goto L6d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0485a.A(r8)
            A7.l r8 = r4.f4249b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2b
            K1.f r8 = (K1.f) r8     // Catch: java.lang.Throwable -> L2b
            r8.f4247a = r7     // Catch: java.lang.Throwable -> L2b
            A7.l r7 = r4.f4250c     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L2b
            K1.c r7 = (K1.c) r7     // Catch: java.lang.Throwable -> L2b
            r0.f4237r = r6     // Catch: java.lang.Throwable -> L2b
            r0.f4238s = r4     // Catch: java.lang.Throwable -> L2b
            r0.f4241v = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r7.a(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r1) goto L57
            return r1
        L57:
            r5 = r4
        L58:
            i8.N r8 = (i8.N) r8     // Catch: java.lang.Throwable -> L2b
            x8.i r7 = r8.g()     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r7 = r7.e0()     // Catch: java.lang.Throwable -> L2b
            r5.getClass()     // Catch: java.lang.Throwable -> L2b
            java.io.File r5 = c(r6, r7)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.h.b(r5)     // Catch: java.lang.Throwable -> L2b
            return r5
        L6d:
            A7.i r5 = a.AbstractC0485a.h(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.g.a(java.lang.String, java.lang.String, q2.u, G7.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, android.net.Uri r6, q2.C1892u r7, G7.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof K1.e
            if (r0 == 0) goto L13
            r0 = r8
            K1.e r0 = (K1.e) r0
            int r1 = r0.f4246v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4246v = r1
            goto L18
        L13:
            K1.e r0 = new K1.e
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f4244t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f4246v
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            K1.g r5 = r0.f4243s
            android.net.Uri r6 = r0.f4242r
            a.AbstractC0485a.A(r8)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r5 = move-exception
            goto L6a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0485a.A(r8)
            A7.l r8 = r4.f4249b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2b
            K1.f r8 = (K1.f) r8     // Catch: java.lang.Throwable -> L2b
            r8.f4247a = r7     // Catch: java.lang.Throwable -> L2b
            A7.l r7 = r4.f4250c     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L2b
            K1.c r7 = (K1.c) r7     // Catch: java.lang.Throwable -> L2b
            r0.f4242r = r6     // Catch: java.lang.Throwable -> L2b
            r0.f4243s = r4     // Catch: java.lang.Throwable -> L2b
            r0.f4246v = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r7.a(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r1) goto L57
            return r1
        L57:
            r5 = r4
        L58:
            i8.N r8 = (i8.N) r8     // Catch: java.lang.Throwable -> L2b
            x8.i r7 = r8.g()     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r7 = r7.e0()     // Catch: java.lang.Throwable -> L2b
            android.net.Uri r5 = r5.d(r6, r7)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.h.b(r5)     // Catch: java.lang.Throwable -> L2b
            return r5
        L6a:
            A7.i r5 = a.AbstractC0485a.h(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.g.b(java.lang.String, android.net.Uri, q2.u, G7.c):java.lang.Object");
    }

    public final Uri d(Uri uri, InputStream inputStream) {
        OutputStream openOutputStream;
        if (inputStream == null || uri == null || (openOutputStream = this.f4248a.getContentResolver().openOutputStream(uri)) == null) {
            return null;
        }
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        openOutputStream.write(bArr, 0, read);
                    } else {
                        openOutputStream.flush();
                        inputStream.close();
                        openOutputStream.close();
                        return uri;
                    }
                }
            } finally {
            }
        } finally {
        }
    }
}
