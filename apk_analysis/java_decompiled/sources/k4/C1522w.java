package k4;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import l4.AbstractC1566a;

/* renamed from: k4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1522w extends AbstractC1507g {

    /* renamed from: e, reason: collision with root package name */
    public final int f20124e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20125f;

    /* renamed from: g, reason: collision with root package name */
    public final C1499E f20126g;

    /* renamed from: h, reason: collision with root package name */
    public final C1499E f20127h;

    /* renamed from: i, reason: collision with root package name */
    public HttpURLConnection f20128i;
    public InputStream j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20129k;

    /* renamed from: l, reason: collision with root package name */
    public int f20130l;

    /* renamed from: m, reason: collision with root package name */
    public long f20131m;

    /* renamed from: n, reason: collision with root package name */
    public long f20132n;

    public C1522w(int i9, int i10, C1499E c1499e) {
        super(true);
        this.f20124e = i9;
        this.f20125f = i10;
        this.f20126g = c1499e;
        this.f20127h = new C1499E(0);
    }

    public static void p(HttpURLConnection httpURLConnection, long j) {
        int i9;
        if (httpURLConnection != null && (i9 = l4.y.f20553a) >= 19 && i9 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j = this.f20131m;
            if (j != -1) {
                long j4 = j - this.f20132n;
                if (j4 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j4);
            }
            InputStream inputStream = this.j;
            int i11 = l4.y.f20553a;
            int read = inputStream.read(bArr, i9, i10);
            if (read != -1) {
                this.f20132n += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e8) {
            int i12 = l4.y.f20553a;
            throw C1496B.a(2, e8);
        }
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        try {
            InputStream inputStream = this.j;
            if (inputStream != null) {
                long j = this.f20131m;
                long j4 = -1;
                if (j != -1) {
                    j4 = j - this.f20132n;
                }
                p(this.f20128i, j4);
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    int i9 = l4.y.f20553a;
                    throw new C1496B(2000, 3, e8);
                }
            }
        } finally {
            this.j = null;
            k();
            if (this.f20129k) {
                this.f20129k = false;
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x013b A[Catch: IOException -> 0x0146, TRY_LEAVE, TryCatch #1 {IOException -> 0x0146, blocks: (B:22:0x0133, B:24:0x013b), top: B:21:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    @Override // k4.InterfaceC1513m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(k4.C1516p r27) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C1522w.g(k4.p):long");
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.f20128i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                AbstractC1566a.u("DefaultHttpDataSource", "Unexpected error while disconnecting", e8);
            }
            this.f20128i = null;
        }
    }

    @Override // k4.AbstractC1507g, k4.InterfaceC1513m
    public final Map l() {
        HttpURLConnection httpURLConnection = this.f20128i;
        if (httpURLConnection == null) {
            return P5.X.f5938g;
        }
        return new C1521v(httpURLConnection.getHeaderFields(), 0);
    }

    public final HttpURLConnection o(URL url, int i9, byte[] bArr, long j, long j4, boolean z9, boolean z10, Map map) {
        String str;
        boolean z11;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f20124e);
        httpURLConnection.setReadTimeout(this.f20125f);
        HashMap hashMap = new HashMap();
        C1499E c1499e = this.f20126g;
        if (c1499e != null) {
            hashMap.putAll(c1499e.l());
        }
        hashMap.putAll(this.f20127h.l());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a5 = AbstractC1500F.a(j, j4);
        if (a5 != null) {
            httpURLConnection.setRequestProperty("Range", a5);
        }
        if (z9) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z10);
        if (bArr != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        httpURLConnection.setDoOutput(z11);
        httpURLConnection.setRequestMethod(C1516p.b(i9));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final void q(long j) {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                int min = (int) Math.min(j, 4096);
                InputStream inputStream = this.j;
                int i9 = l4.y.f20553a;
                int read = inputStream.read(bArr, 0, min);
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j -= read;
                        c(read);
                    } else {
                        throw new C1496B(2008);
                    }
                } else {
                    throw new C1496B(2000, 1, new InterruptedIOException());
                }
            }
        }
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        HttpURLConnection httpURLConnection = this.f20128i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
