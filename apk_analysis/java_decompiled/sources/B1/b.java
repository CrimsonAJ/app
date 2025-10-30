package B1;

import android.graphics.Bitmap;
import f5.C1183o;
import i8.A;
import i8.C1418h;
import i8.L;
import i8.w;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import x8.B;
import x8.C;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f600a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f601b;

    /* renamed from: c, reason: collision with root package name */
    public final long f602c;

    /* renamed from: d, reason: collision with root package name */
    public final long f603d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f604e;

    /* renamed from: f, reason: collision with root package name */
    public final w f605f;

    public b(C c3) {
        A7.f fVar = A7.f.f545a;
        final int i9 = 0;
        this.f600a = Z0.a.p(fVar, new O7.a(this) { // from class: B1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f599b;

            {
                this.f599b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                b bVar = this.f599b;
                switch (i9) {
                    case 0:
                        C1418h c1418h = C1418h.f19086n;
                        return s8.e.M(bVar.f605f);
                    default:
                        String b9 = bVar.f605f.b("Content-Type");
                        if (b9 != null) {
                            Pattern pattern = A.f18925d;
                            try {
                                return M4.a.o(b9);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f601b = Z0.a.p(fVar, new O7.a(this) { // from class: B1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f599b;

            {
                this.f599b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                b bVar = this.f599b;
                switch (i10) {
                    case 0:
                        C1418h c1418h = C1418h.f19086n;
                        return s8.e.M(bVar.f605f);
                    default:
                        String b9 = bVar.f605f.b("Content-Type");
                        if (b9 != null) {
                            Pattern pattern = A.f18925d;
                            try {
                                return M4.a.o(b9);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return null;
                }
            }
        });
        this.f602c = Long.parseLong(c3.a0(Long.MAX_VALUE));
        this.f603d = Long.parseLong(c3.a0(Long.MAX_VALUE));
        this.f604e = Integer.parseInt(c3.a0(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(c3.a0(Long.MAX_VALUE));
        C1183o c1183o = new C1183o(5);
        for (int i11 = 0; i11 < parseInt; i11++) {
            String a02 = c3.a0(Long.MAX_VALUE);
            Bitmap.Config[] configArr = H1.f.f2949a;
            int R2 = W7.d.R(a02, ':', 0, 6);
            if (R2 != -1) {
                String substring = a02.substring(0, R2);
                h.d(substring, "substring(...)");
                String obj = W7.d.j0(substring).toString();
                String substring2 = a02.substring(R2 + 1);
                h.d(substring2, "substring(...)");
                c1183o.y(obj, substring2);
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(a02).toString());
            }
        }
        this.f605f = c1183o.z();
    }

    public final void a(B b9) {
        long j;
        b9.Y(this.f602c);
        b9.y(10);
        b9.Y(this.f603d);
        b9.y(10);
        if (this.f604e) {
            j = 1;
        } else {
            j = 0;
        }
        b9.Y(j);
        b9.y(10);
        w wVar = this.f605f;
        b9.Y(wVar.size());
        b9.y(10);
        int size = wVar.size();
        for (int i9 = 0; i9 < size; i9++) {
            b9.X(wVar.c(i9));
            b9.X(": ");
            b9.X(wVar.f(i9));
            b9.y(10);
        }
    }

    public b(L l9) {
        A7.f fVar = A7.f.f545a;
        final int i9 = 0;
        this.f600a = Z0.a.p(fVar, new O7.a(this) { // from class: B1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f599b;

            {
                this.f599b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                b bVar = this.f599b;
                switch (i9) {
                    case 0:
                        C1418h c1418h = C1418h.f19086n;
                        return s8.e.M(bVar.f605f);
                    default:
                        String b9 = bVar.f605f.b("Content-Type");
                        if (b9 != null) {
                            Pattern pattern = A.f18925d;
                            try {
                                return M4.a.o(b9);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f601b = Z0.a.p(fVar, new O7.a(this) { // from class: B1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f599b;

            {
                this.f599b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                b bVar = this.f599b;
                switch (i10) {
                    case 0:
                        C1418h c1418h = C1418h.f19086n;
                        return s8.e.M(bVar.f605f);
                    default:
                        String b9 = bVar.f605f.b("Content-Type");
                        if (b9 != null) {
                            Pattern pattern = A.f18925d;
                            try {
                                return M4.a.o(b9);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return null;
                }
            }
        });
        this.f602c = l9.f19038k;
        this.f603d = l9.f19039l;
        this.f604e = l9.f19033e != null;
        this.f605f = l9.f19034f;
    }
}
