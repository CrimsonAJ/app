package A3;

import P.Q;
import P5.AbstractC0349q;
import P5.V;
import P5.X;
import P5.f0;
import a.AbstractC0485a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.widget.ImageView;
import b5.G1;
import c7.C0790j;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import f5.InterfaceC1173e;
import h.AbstractC1260a;
import i8.C1425o;
import j3.j0;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l4.AbstractC1566a;
import o1.C1671f;
import p.AbstractC1800i0;
import p.C1821t;
import q3.C1899d;
import q3.C1902g;
import q3.C1909n;
import q3.InterfaceC1900e;
import s.C1939i;

/* loaded from: classes.dex */
public final class E implements InterfaceC1900e, InterfaceC1173e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45a;

    /* renamed from: b, reason: collision with root package name */
    public int f46b;

    /* renamed from: c, reason: collision with root package name */
    public Object f47c;

    /* renamed from: d, reason: collision with root package name */
    public Object f48d;

    public /* synthetic */ E(Object obj, int i9, Serializable serializable, int i10) {
        this.f45a = i10;
        this.f47c = obj;
        this.f46b = i9;
        this.f48d = serializable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r4.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A3.E e(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.E.e(android.content.res.Resources, int, android.content.res.Resources$Theme):A3.E");
    }

    private final /* synthetic */ void m() {
    }

    @Override // q3.InterfaceC1900e
    public void a() {
        switch (this.f45a) {
            case 0:
                byte[] bArr = l4.y.f20558f;
                A4.r rVar = (A4.r) this.f48d;
                rVar.getClass();
                rVar.F(bArr.length, bArr);
                return;
            default:
                return;
        }
    }

    public void b() {
        C1425o c1425o;
        ImageView imageView = (ImageView) this.f47c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1800i0.a(drawable);
        }
        if (drawable != null && (c1425o = (C1425o) this.f48d) != null) {
            C1821t.e(drawable, c1425o, imageView.getDrawableState());
        }
    }

    public V6.b c() {
        if ("".isEmpty()) {
            return new V6.b(((Long) this.f48d).longValue(), (String) this.f47c, this.f46b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public X d() {
        P5.H h7 = (P5.H) this.f48d;
        if (h7 == null) {
            X b9 = X.b(this.f46b, (Object[]) this.f47c, this);
            P5.H h9 = (P5.H) this.f48d;
            if (h9 == null) {
                return b9;
            }
            throw h9.a();
        }
        throw h7.a();
    }

    public void f(String str, Object... objArr) {
        if (this.f46b <= 3) {
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d((String) this.f47c, ((String) this.f48d).concat(str));
        }
    }

    public long g(C1902g c1902g) {
        long j;
        C0790j c0790j;
        C1909n c1909n;
        long j4;
        boolean f9;
        int h7;
        while (true) {
            long w7 = c1902g.w();
            j = c1902g.f22311c;
            long j9 = j - 6;
            c0790j = (C0790j) this.f48d;
            c1909n = (C1909n) this.f47c;
            if (w7 < j9) {
                long w9 = c1902g.w();
                byte[] bArr = new byte[2];
                c1902g.t(bArr, 0, 2, false);
                int i9 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i10 = this.f46b;
                if (i9 != i10) {
                    c1902g.f22314f = 0;
                    c1902g.c((int) (w9 - c1902g.f22312d), false);
                    j4 = 6;
                    f9 = false;
                } else {
                    j4 = 6;
                    A4.r rVar = new A4.r(16);
                    System.arraycopy(bArr, 0, (byte[]) rVar.f384c, 0, 2);
                    byte[] bArr2 = (byte[]) rVar.f384c;
                    int i11 = 0;
                    for (int i12 = 2; i11 < 14 && (h7 = c1902g.h(bArr2, i12 + i11, 14 - i11)) != -1; i12 = 2) {
                        i11 += h7;
                    }
                    rVar.G(i11);
                    c1902g.f22314f = 0;
                    c1902g.c((int) (w9 - c1902g.f22312d), false);
                    f9 = D1.f(rVar, c1909n, i10, c0790j);
                }
                if (f9) {
                    break;
                }
                c1902g.c(1, false);
            } else {
                j4 = 6;
                break;
            }
        }
        if (c1902g.w() >= j - j4) {
            c1902g.c((int) (j - c1902g.w()), false);
            return c1909n.j;
        }
        return c0790j.f11723a;
    }

    @Override // q3.InterfaceC1900e
    public C1899d h(C1902g c1902g, long j) {
        long j4;
        C1899d c1899d;
        switch (this.f45a) {
            case 0:
                long j9 = c1902g.f22312d;
                int min = (int) Math.min(112800, c1902g.f22311c - j9);
                A4.r rVar = (A4.r) this.f48d;
                rVar.E(min);
                c1902g.t((byte[]) rVar.f384c, 0, min, false);
                int i9 = rVar.f383b;
                long j10 = -1;
                long j11 = -1;
                long j12 = -9223372036854775807L;
                while (true) {
                    if (rVar.e() >= 188) {
                        byte[] bArr = (byte[]) rVar.f384c;
                        int i10 = rVar.f382a;
                        while (true) {
                            if (i10 < i9) {
                                j4 = -9223372036854775807L;
                                if (bArr[i10] != 71) {
                                    i10++;
                                }
                            } else {
                                j4 = -9223372036854775807L;
                            }
                        }
                        int i11 = i10 + 188;
                        if (i11 <= i9) {
                            long y9 = M4.a.y(rVar, i10, this.f46b);
                            if (y9 != j4) {
                                long b9 = ((l4.x) this.f47c).b(y9);
                                if (b9 > j) {
                                    if (j12 == j4) {
                                        return new C1899d(b9, j9, -1);
                                    }
                                    c1899d = new C1899d(-9223372036854775807L, j9 + j11, 0);
                                } else {
                                    j12 = b9;
                                    if (100000 + j12 > j) {
                                        return new C1899d(-9223372036854775807L, j9 + i10, 0);
                                    }
                                    j11 = i10;
                                }
                            }
                            rVar.H(i11);
                            j10 = i11;
                        }
                    } else {
                        j4 = -9223372036854775807L;
                    }
                }
                if (j12 != j4) {
                    c1899d = new C1899d(j12, j9 + j10, -2);
                    return c1899d;
                }
                return C1899d.f22299d;
            default:
                long j13 = c1902g.f22312d;
                long g9 = g(c1902g);
                long w7 = c1902g.w();
                c1902g.c(Math.max(6, ((C1909n) this.f47c).f22326c), false);
                long g10 = g(c1902g);
                long w9 = c1902g.w();
                if (g9 <= j && g10 > j) {
                    return new C1899d(-9223372036854775807L, w7, 0);
                }
                if (g10 <= j) {
                    return new C1899d(g10, w9, -2);
                }
                return new C1899d(g9, j13, -1);
        }
    }

    public Object i(int i9) {
        SparseArray sparseArray;
        if (this.f46b == -1) {
            this.f46b = 0;
        }
        while (true) {
            int i10 = this.f46b;
            sparseArray = (SparseArray) this.f47c;
            if (i10 <= 0 || i9 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f46b--;
        }
        while (this.f46b < sparseArray.size() - 1 && i9 >= sparseArray.keyAt(this.f46b + 1)) {
            this.f46b++;
        }
        return sparseArray.valueAt(this.f46b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [N3.M, java.io.IOException] */
    public U3.z j(int i9, String str, Map map, Uri uri) {
        U3.n nVar = (U3.n) this.f48d;
        String str2 = nVar.f7408c;
        int i10 = this.f46b;
        this.f46b = i10 + 1;
        C1671f c1671f = new C1671f(str2, i10, str);
        if (nVar.f7417m != null) {
            AbstractC1566a.n(nVar.j);
            try {
                c1671f.i("Authorization", nVar.f7417m.c(nVar.j, uri, i9));
            } catch (j0 e8) {
                U3.n.d(nVar, new IOException(e8));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            c1671f.i((String) entry.getKey(), (String) entry.getValue());
        }
        return new U3.z(uri, i9, new U3.o(c1671f), "");
    }

    public boolean k() {
        ColorStateList colorStateList;
        if (((Shader) this.f47c) == null && (colorStateList = (ColorStateList) this.f48d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void l(AttributeSet attributeSet, int i9) {
        int resourceId;
        ImageView imageView = (ImageView) this.f47c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1260a.f17810f;
        G1 w7 = G1.w(context, attributeSet, iArr, i9);
        Q.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) w7.f10718c, i9);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) w7.f10718c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0485a.q(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1800i0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(w7.n(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1800i0.c(typedArray.getInt(3, -1), null));
            }
            w7.y();
        } catch (Throwable th) {
            w7.y();
            throw th;
        }
    }

    public void n(Object obj, Object obj2) {
        int i9 = (this.f46b + 1) * 2;
        Object[] objArr = (Object[]) this.f47c;
        if (i9 > objArr.length) {
            this.f47c = Arrays.copyOf(objArr, P5.C.e(objArr.length, i9));
        }
        AbstractC0349q.b(obj, obj2);
        Object[] objArr2 = (Object[]) this.f47c;
        int i10 = this.f46b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f46b = i10 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // f5.InterfaceC1173e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto Lb
            goto L8d
        Lb:
            java.lang.Object r7 = r6.f48d
            com.google.android.gms.internal.cast.O0 r7 = (com.google.android.gms.internal.cast.O0) r7
            com.google.android.gms.internal.cast.N0 r7 = com.google.android.gms.internal.cast.O0.n(r7)
            java.lang.Object r1 = r6.f47c
            com.google.android.gms.internal.cast.Y r1 = (com.google.android.gms.internal.cast.Y) r1
            java.lang.String r2 = r1.f14794d
            r7.e()
            com.google.android.gms.internal.cast.N2 r3 = r7.f14748b
            com.google.android.gms.internal.cast.O0 r3 = (com.google.android.gms.internal.cast.O0) r3
            com.google.android.gms.internal.cast.O0.x(r3, r2)
            r7.e()
            com.google.android.gms.internal.cast.N2 r3 = r7.f14748b
            com.google.android.gms.internal.cast.O0 r3 = (com.google.android.gms.internal.cast.O0) r3
            com.google.android.gms.internal.cast.O0.r(r3, r2)
            java.lang.Long r2 = r1.f14795e
            if (r2 == 0) goto L40
            long r2 = r2.longValue()
            int r2 = (int) r2
            r7.e()
            com.google.android.gms.internal.cast.N2 r3 = r7.f14748b
            com.google.android.gms.internal.cast.O0 r3 = (com.google.android.gms.internal.cast.O0) r3
            com.google.android.gms.internal.cast.O0.u(r3, r2)
        L40:
            com.google.android.gms.internal.cast.N2 r7 = r7.b()
            com.google.android.gms.internal.cast.O0 r7 = (com.google.android.gms.internal.cast.O0) r7
            int r2 = r1.f14799i
            int r3 = r2 + (-1)
            r4 = 0
            if (r2 == 0) goto L8e
            int r2 = r6.f46b
            if (r3 == 0) goto L63
            if (r3 == r0) goto L54
            goto L71
        L54:
            int r2 = r2 + (-1)
            V2.a r3 = new V2.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            V2.d r5 = V2.d.f7660a
            r3.<init>(r2, r7, r5, r4)
        L61:
            r4 = r3
            goto L71
        L63:
            int r2 = r2 + (-1)
            V2.a r3 = new V2.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            V2.d r5 = V2.d.f7661b
            r3.<init>(r2, r7, r5, r4)
            goto L61
        L71:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r0 = 0
            r7[r0] = r4
            java.lang.String r0 = "analytics event: %s"
            y4.b r2 = com.google.android.gms.internal.cast.Y.j
            r2.b(r0, r7)
            F4.y.h(r4)
            Y2.r r7 = r1.f14797g
            if (r7 == 0) goto L8d
            X0.k r0 = new X0.k
            r1 = 3
            r0.<init>(r1)
            r7.L(r4, r0)
        L8d:
            return
        L8e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.E.o(java.lang.Object):void");
    }

    public void p(Collection collection) {
        if (u0.z.i(collection)) {
            int size = (collection.size() + this.f46b) * 2;
            Object[] objArr = (Object[]) this.f47c;
            if (size > objArr.length) {
                this.f47c = Arrays.copyOf(objArr, P5.C.e(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q() {
        AbstractC1566a.n((U3.z) this.f47c);
        P5.G g9 = ((U3.z) this.f47c).f7492c.f7423a;
        HashMap hashMap = new HashMap();
        f0 it = ((V) g9.f5902d.keySet()).iterator();
        while (true) {
            P5.D d9 = (P5.D) it;
            if (d9.hasNext()) {
                String str = (String) d9.next();
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) AbstractC0349q.i(g9.c(str)));
                }
            } else {
                U3.z zVar = (U3.z) this.f47c;
                r(j(zVar.f7491b, ((U3.n) this.f48d).f7415k, hashMap, zVar.f7490a));
                return;
            }
        }
    }

    public void r(U3.z zVar) {
        boolean z9;
        String b9 = zVar.f7492c.b("CSeq");
        b9.getClass();
        int parseInt = Integer.parseInt(b9);
        U3.n nVar = (U3.n) this.f48d;
        if (nVar.f7411f.get(parseInt) == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        nVar.f7411f.append(parseInt, zVar);
        nVar.f7414i.d(U3.y.f(zVar));
        this.f47c = zVar;
    }

    public List s(CharSequence charSequence) {
        charSequence.getClass();
        C1671f c1671f = (C1671f) this.f48d;
        c1671f.getClass();
        O5.m mVar = new O5.m(c1671f, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mVar.hasNext()) {
            arrayList.add((String) mVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        switch (this.f45a) {
            case 13:
                StringBuilder sb = new StringBuilder();
                if (((i8.F) this.f47c) == i8.F.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f46b);
                sb.append(' ');
                sb.append((String) this.f48d);
                String sb2 = sb.toString();
                kotlin.jvm.internal.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ E(Object obj, Object obj2, int i9, int i10) {
        this.f45a = i10;
        this.f47c = obj;
        this.f48d = obj2;
        this.f46b = i9;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, s.i] */
    public E(int i9, byte b9) {
        this.f45a = i9;
        switch (i9) {
            case 9:
                return;
            default:
                this.f47c = Collections.synchronizedMap(new C1939i(0));
                this.f46b = 0;
                return;
        }
    }

    public E(String str, String[] strArr) {
        String sb;
        int i9 = 2;
        this.f45a = 3;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f48d = sb;
        this.f47c = str;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            while (i9 <= 7 && !Log.isLoggable((String) this.f47c, i9)) {
                i9++;
            }
            this.f46b = i9;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public E(int i9, U3.o oVar, String str) {
        this.f45a = 8;
        this.f46b = i9;
        this.f47c = oVar;
        this.f48d = str;
    }

    public E(ImageView imageView) {
        this.f45a = 14;
        this.f46b = 0;
        this.f47c = imageView;
    }

    public E(C6.a aVar) {
        this.f45a = 4;
        this.f47c = new SparseArray();
        this.f48d = aVar;
        this.f46b = -1;
    }

    public E(C1909n c1909n, int i9) {
        this.f45a = 15;
        this.f47c = c1909n;
        this.f46b = i9;
        this.f48d = new Object();
    }

    public E(int i9, l4.x xVar) {
        this.f45a = 0;
        this.f46b = i9;
        this.f47c = xVar;
        this.f48d = new A4.r(5, false);
    }

    public E(C1671f c1671f) {
        this.f45a = 5;
        this.f48d = c1671f;
        this.f47c = O5.d.f5488a;
        this.f46b = Integer.MAX_VALUE;
    }

    public E(U3.n nVar) {
        this.f45a = 7;
        this.f48d = nVar;
    }

    public E(int i9, int i10) {
        this.f45a = i10;
        switch (i10) {
            case R.styleable.GradientColor_android_endX /* 10 */:
                this.f46b = i9;
                return;
            default:
                this.f47c = new Object[i9 * 2];
                this.f46b = 0;
                return;
        }
    }
}
