package e0;

import B7.m;
import C4.f;
import C4.g;
import D4.InterfaceC0093l;
import android.content.Context;
import android.media.MediaDrmException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.C;
import f5.C1177i;
import f5.C1185q;
import f5.InterfaceC1175g;
import h3.InterfaceC1276a;
import i.G;
import i6.j;
import i8.F;
import i8.K;
import i8.L;
import i8.N;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k3.l;
import kotlin.jvm.internal.h;
import m3.InterfaceC1588a;
import n3.C1643t;
import n3.C1644u;
import n3.InterfaceC1645v;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import q3.C1902g;
import q3.C1904i;
import q3.C1908m;
import q3.InterfaceC1907l;
import q3.r;
import q3.u;
import s8.n;
import t4.C2009A;
import x8.AbstractC2181a;
import x8.C2190j;
import y4.w;
import z3.InterfaceC2243g;

/* loaded from: classes.dex */
public final class c implements InterfaceC1276a, j, InterfaceC1645v, InterfaceC1907l, InterfaceC0093l, InterfaceC1175g, InterfaceC2243g {

    /* renamed from: b, reason: collision with root package name */
    public static c f17018b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17019a;

    public /* synthetic */ c(int i9) {
        this.f17019a = i9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, x8.g] */
    public static byte[] A(List protocols) {
        h.e(protocols, "protocols");
        ?? obj = new Object();
        ArrayList z9 = z(protocols);
        int size = z9.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj2 = z9.get(i9);
            i9++;
            String str = (String) obj2;
            obj.w0(str.length());
            obj.B0(str);
        }
        return obj.i0(obj.f24644b);
    }

    public static C2190j B(String str) {
        char c3;
        int i9;
        char charAt;
        char c9 = 'A';
        h.e(str, "<this>");
        byte[] bArr = AbstractC2181a.f24626a;
        int length = str.length();
        while (true) {
            c3 = '\t';
            if (length <= 0 || !((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                break;
            }
            length--;
        }
        int i10 = (int) ((length * 6) / 8);
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i11 < length) {
                char charAt2 = str.charAt(i11);
                char c10 = c9;
                if (c9 <= charAt2 && charAt2 < '[') {
                    i9 = charAt2 - 'A';
                } else if ('a' <= charAt2 && charAt2 < '{') {
                    i9 = charAt2 - 'G';
                } else if ('0' <= charAt2 && charAt2 < ':') {
                    i9 = charAt2 + 4;
                } else if (charAt2 != '+' && charAt2 != '-') {
                    if (charAt2 != '/' && charAt2 != '_') {
                        if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != c3) {
                            break;
                        }
                        i11++;
                        c9 = c10;
                        c3 = '\t';
                    } else {
                        i9 = 63;
                    }
                } else {
                    i9 = 62;
                }
                int i15 = i9 | (i13 << 6);
                i12++;
                if (i12 % 4 == 0) {
                    bArr2[i14] = (byte) (i15 >> 16);
                    int i16 = i14 + 2;
                    bArr2[i14 + 1] = (byte) (i15 >> 8);
                    i14 += 3;
                    bArr2[i16] = (byte) i15;
                }
                i13 = i15;
                i11++;
                c9 = c10;
                c3 = '\t';
            } else {
                int i17 = i12 % 4;
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 == 3) {
                            int i18 = i13 << 6;
                            int i19 = 1 + i14;
                            bArr2[i14] = (byte) (i18 >> 16);
                            i14 += 2;
                            bArr2[i19] = (byte) (i18 >> 8);
                        }
                    } else {
                        bArr2[i14] = (byte) ((i13 << 12) >> 16);
                        i14 = 1 + i14;
                    }
                    if (i14 != i10) {
                        bArr2 = Arrays.copyOf(bArr2, i14);
                        h.d(bArr2, "copyOf(...)");
                    }
                }
            }
        }
        bArr2 = null;
        if (bArr2 == null) {
            return null;
        }
        return new C2190j(bArr2);
    }

    public static C2190j C(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = i9 * 2;
                bArr[i9] = (byte) (y8.b.a(str.charAt(i10 + 1)) + (y8.b.a(str.charAt(i10)) << 4));
            }
            return new C2190j(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static C2190j D(String str) {
        h.e(str, "<this>");
        byte[] bytes = str.getBytes(W7.a.f7934a);
        h.d(bytes, "getBytes(...)");
        C2190j c2190j = new C2190j(bytes);
        c2190j.f24648c = str;
        return c2190j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean E(f0.C1150b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.c.E(f0.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean F() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean G(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static C2190j I(byte[] bArr) {
        C2190j c2190j = C2190j.f24645d;
        int length = bArr.length;
        n.f(bArr.length, 0, length);
        return new C2190j(B7.j.g0(bArr, 0, length));
    }

    public static final String x(byte[] bArr, byte[][] bArr2, int i9) {
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f21761e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > i13 && bArr[i15] != 10) {
                i15 += i13;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i10 = i16 + i17;
                if (bArr[i10] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i10 - i16;
            int i19 = i9;
            boolean z10 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z10) {
                    i11 = 46;
                    z9 = false;
                } else {
                    byte b9 = bArr2[i19][i20];
                    byte[] bArr4 = k8.c.f20141a;
                    int i22 = b9 & 255;
                    z9 = z10;
                    i11 = i22;
                }
                byte b10 = bArr[i16 + i21];
                byte[] bArr5 = k8.c.f20141a;
                i12 = i11 - (b10 & 255);
                if (i12 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length == i20) {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    z10 = true;
                    i20 = -1;
                } else {
                    z10 = z9;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            h.d(UTF_8, "UTF_8");
                            return new String(bArr, i16, i18, UTF_8);
                        }
                    }
                }
                i14 = i10 + 1;
                i13 = -1;
            }
            length = i15;
            i13 = -1;
        }
        return null;
    }

    public static final L y(L l9) {
        N n7;
        if (l9 != null) {
            n7 = l9.f19035g;
        } else {
            n7 = null;
        }
        if (n7 != null) {
            K s9 = l9.s();
            s9.f19023g = null;
            return s9.a();
        }
        return l9;
    }

    public static ArrayList z(List protocols) {
        h.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((F) obj) != F.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.f0(arrayList, 10));
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            arrayList2.add(((F) obj2).f19004a);
        }
        return arrayList2;
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        w wVar = (w) obj;
        y4.b bVar = C2009A.f23120G;
        Context context = wVar.f2370c;
        g gVar = new g(-1, -1, 0, true);
        y4.g gVar2 = (y4.g) wVar.u();
        f fVar = new f(gVar);
        Parcel Q7 = gVar2.Q();
        C.c(Q7, fVar);
        gVar2.i1(Q7, 19);
        ((C1177i) obj2).b(Boolean.TRUE);
    }

    @Override // n3.InterfaceC1645v
    public void b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // n3.InterfaceC1645v
    public Map c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // z3.InterfaceC2243g
    public r e() {
        return new C1908m(-9223372036854775807L);
    }

    @Override // i6.j
    public Object f(String str, Provider provider) {
        switch (this.f17019a) {
            case 4:
                if (provider == null) {
                    return KeyFactory.getInstance(str);
                }
                return KeyFactory.getInstance(str, provider);
            default:
                if (provider == null) {
                    return MessageDigest.getInstance(str);
                }
                return MessageDigest.getInstance(str, provider);
        }
    }

    @Override // n3.InterfaceC1645v
    public byte[] h(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // n3.InterfaceC1645v
    public C1644u j() {
        throw new IllegalStateException();
    }

    @Override // n3.InterfaceC1645v
    public /* synthetic */ void k(byte[] bArr, l lVar) {
    }

    @Override // h3.InterfaceC1276a
    public long l() {
        return SystemClock.elapsedRealtime();
    }

    @Override // n3.InterfaceC1645v
    public void m(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // n3.InterfaceC1645v
    public C1643t n(byte[] bArr, List list, int i9, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // z3.InterfaceC2243g
    public long o(C1902g c1902g) {
        return -1L;
    }

    @Override // n3.InterfaceC1645v
    public int p() {
        return 1;
    }

    @Override // n3.InterfaceC1645v
    public InterfaceC1588a q(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        return n.p(Boolean.TRUE);
    }

    @Override // q3.InterfaceC1907l
    public u u(int i9, int i10) {
        return new C1904i();
    }

    @Override // n3.InterfaceC1645v
    public boolean v(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // n3.InterfaceC1645v
    public byte[] w() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // n3.InterfaceC1645v
    public void a() {
    }

    @Override // q3.InterfaceC1907l
    public void i() {
    }

    @Override // n3.InterfaceC1645v
    public void d(byte[] bArr) {
    }

    @Override // n3.InterfaceC1645v
    public void g(G g9) {
    }

    @Override // q3.InterfaceC1907l
    public void r(r rVar) {
    }

    @Override // z3.InterfaceC2243g
    public void t(long j) {
    }
}
