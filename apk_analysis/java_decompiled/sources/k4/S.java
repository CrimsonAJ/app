package k4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class S extends AbstractC1507g {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f20014e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20015f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f20016g;

    /* renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f20017h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f20018i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20019k;

    public S(Context context) {
        super(false);
        this.f20014e = context.getResources();
        this.f20015f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i9) {
        return Uri.parse("rawresource:///" + i9);
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.j;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e8) {
                    throw new C1514n(null, e8, 2000);
                }
            }
            FileInputStream fileInputStream = this.f20018i;
            int i11 = l4.y.f20553a;
            int read = fileInputStream.read(bArr, i9, i10);
            if (read == -1) {
                if (this.j != -1) {
                    throw new C1514n("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
                long j4 = this.j;
                if (j4 != -1) {
                    this.j = j4 - read;
                }
                c(read);
                return read;
            }
        }
        return -1;
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        this.f20016g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f20018i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f20018i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f20017h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e8) {
                        throw new C1514n(null, e8, 2000);
                    }
                } finally {
                    this.f20017h = null;
                    if (this.f20019k) {
                        this.f20019k = false;
                        d();
                    }
                }
            } catch (IOException e9) {
                throw new C1514n(null, e9, 2000);
            }
        } catch (Throwable th) {
            this.f20018i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f20017h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f20017h = null;
                    if (this.f20019k) {
                        this.f20019k = false;
                        d();
                    }
                    throw th;
                } catch (IOException e10) {
                    throw new C1514n(null, e10, 2000);
                }
            } finally {
                this.f20017h = null;
                if (this.f20019k) {
                    this.f20019k = false;
                    d();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r3.matches("\\d+") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    @Override // k4.InterfaceC1513m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(k4.C1516p r20) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.S.g(k4.p):long");
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f20016g;
    }
}
