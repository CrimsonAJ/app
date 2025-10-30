package k4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import l4.AbstractC1566a;

/* renamed from: k4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519t implements InterfaceC1513m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20111a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20112b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1513m f20113c;

    /* renamed from: d, reason: collision with root package name */
    public z f20114d;

    /* renamed from: e, reason: collision with root package name */
    public C1503c f20115e;

    /* renamed from: f, reason: collision with root package name */
    public C1509i f20116f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1513m f20117g;

    /* renamed from: h, reason: collision with root package name */
    public Y f20118h;

    /* renamed from: i, reason: collision with root package name */
    public C1511k f20119i;
    public S j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1513m f20120k;

    public C1519t(Context context, InterfaceC1513m interfaceC1513m) {
        this.f20111a = context.getApplicationContext();
        interfaceC1513m.getClass();
        this.f20113c = interfaceC1513m;
        this.f20112b = new ArrayList();
    }

    public static void d(InterfaceC1513m interfaceC1513m, W w7) {
        if (interfaceC1513m != null) {
            interfaceC1513m.a(w7);
        }
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        InterfaceC1513m interfaceC1513m = this.f20120k;
        interfaceC1513m.getClass();
        return interfaceC1513m.D(bArr, i9, i10);
    }

    @Override // k4.InterfaceC1513m
    public final void a(W w7) {
        w7.getClass();
        this.f20113c.a(w7);
        this.f20112b.add(w7);
        d(this.f20114d, w7);
        d(this.f20115e, w7);
        d(this.f20116f, w7);
        d(this.f20117g, w7);
        d(this.f20118h, w7);
        d(this.f20119i, w7);
        d(this.j, w7);
    }

    public final void c(InterfaceC1513m interfaceC1513m) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f20112b;
            if (i9 < arrayList.size()) {
                interfaceC1513m.a((W) arrayList.get(i9));
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        InterfaceC1513m interfaceC1513m = this.f20120k;
        if (interfaceC1513m != null) {
            try {
                interfaceC1513m.close();
            } finally {
                this.f20120k = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [k4.g, k4.k, k4.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [k4.g, k4.z, k4.m] */
    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        boolean z9;
        if (this.f20120k == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        String scheme = c1516p.f20077a.getScheme();
        int i9 = l4.y.f20553a;
        Uri uri = c1516p.f20077a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f20111a;
        if (!isEmpty && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.f20115e == null) {
                    C1503c c1503c = new C1503c(context);
                    this.f20115e = c1503c;
                    c(c1503c);
                }
                this.f20120k = this.f20115e;
            } else if ("content".equals(scheme)) {
                if (this.f20116f == null) {
                    C1509i c1509i = new C1509i(context);
                    this.f20116f = c1509i;
                    c(c1509i);
                }
                this.f20120k = this.f20116f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                InterfaceC1513m interfaceC1513m = this.f20113c;
                if (equals) {
                    if (this.f20117g == null) {
                        try {
                            InterfaceC1513m interfaceC1513m2 = (InterfaceC1513m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f20117g = interfaceC1513m2;
                            c(interfaceC1513m2);
                        } catch (ClassNotFoundException unused) {
                            AbstractC1566a.P("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e8) {
                            throw new RuntimeException("Error instantiating RTMP extension", e8);
                        }
                        if (this.f20117g == null) {
                            this.f20117g = interfaceC1513m;
                        }
                    }
                    this.f20120k = this.f20117g;
                } else if ("udp".equals(scheme)) {
                    if (this.f20118h == null) {
                        Y y9 = new Y(8000);
                        this.f20118h = y9;
                        c(y9);
                    }
                    this.f20120k = this.f20118h;
                } else if ("data".equals(scheme)) {
                    if (this.f20119i == null) {
                        ?? abstractC1507g = new AbstractC1507g(false);
                        this.f20119i = abstractC1507g;
                        c(abstractC1507g);
                    }
                    this.f20120k = this.f20119i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f20120k = interfaceC1513m;
                } else {
                    if (this.j == null) {
                        S s9 = new S(context);
                        this.j = s9;
                        c(s9);
                    }
                    this.f20120k = this.j;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f20115e == null) {
                    C1503c c1503c2 = new C1503c(context);
                    this.f20115e = c1503c2;
                    c(c1503c2);
                }
                this.f20120k = this.f20115e;
            } else {
                if (this.f20114d == null) {
                    ?? abstractC1507g2 = new AbstractC1507g(false);
                    this.f20114d = abstractC1507g2;
                    c(abstractC1507g2);
                }
                this.f20120k = this.f20114d;
            }
        }
        return this.f20120k.g(c1516p);
    }

    @Override // k4.InterfaceC1513m
    public final Map l() {
        InterfaceC1513m interfaceC1513m = this.f20120k;
        if (interfaceC1513m == null) {
            return Collections.EMPTY_MAP;
        }
        return interfaceC1513m.l();
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        InterfaceC1513m interfaceC1513m = this.f20120k;
        if (interfaceC1513m == null) {
            return null;
        }
        return interfaceC1513m.s();
    }
}
