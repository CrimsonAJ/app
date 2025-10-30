package k4;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503c extends AbstractC1507g {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f20045e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f20046f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f20047g;

    /* renamed from: h, reason: collision with root package name */
    public long f20048h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20049i;

    public C1503c(Context context) {
        super(false);
        this.f20045e = context.getAssets();
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f20048h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e8) {
                    throw new C1514n(e8, 2000);
                }
            }
            InputStream inputStream = this.f20047g;
            int i11 = l4.y.f20553a;
            int read = inputStream.read(bArr, i9, i10);
            if (read != -1) {
                long j4 = this.f20048h;
                if (j4 != -1) {
                    this.f20048h = j4 - read;
                }
                c(read);
                return read;
            }
        }
        return -1;
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        this.f20046f = null;
        try {
            try {
                InputStream inputStream = this.f20047g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e8) {
                throw new C1514n(e8, 2000);
            }
        } finally {
            this.f20047g = null;
            if (this.f20049i) {
                this.f20049i = false;
                d();
            }
        }
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        int i9;
        try {
            Uri uri = c1516p.f20077a;
            long j = c1516p.f20081e;
            this.f20046f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h();
            InputStream open = this.f20045e.open(path, 1);
            this.f20047g = open;
            if (open.skip(j) >= j) {
                long j4 = c1516p.f20082f;
                if (j4 != -1) {
                    this.f20048h = j4;
                } else {
                    long available = this.f20047g.available();
                    this.f20048h = available;
                    if (available == 2147483647L) {
                        this.f20048h = -1L;
                    }
                }
                this.f20049i = true;
                i(c1516p);
                return this.f20048h;
            }
            throw new C1514n((Exception) null, 2008);
        } catch (C1502b e8) {
            throw e8;
        } catch (IOException e9) {
            if (e9 instanceof FileNotFoundException) {
                i9 = 2005;
            } else {
                i9 = 2000;
            }
            throw new C1514n(e9, i9);
        }
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f20046f;
    }
}
