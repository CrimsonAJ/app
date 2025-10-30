package z2;

import C3.k;
import C3.l;
import C3.m;
import D0.c;
import G2.q;
import H2.t;
import O4.d;
import O4.e;
import P.InterfaceC0317s;
import U3.G;
import U3.InterfaceC0397d;
import U3.InterfaceC0398e;
import Y3.j;
import Z3.g;
import a4.C0492a;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Looper;
import android.support.v4.media.session.y;
import android.util.Log;
import b4.C0608b;
import b5.C;
import b5.E;
import co.notix.R;
import com.anilab.data.model.response.PlayerResponse;
import com.google.android.gms.internal.measurement.C0915c3;
import com.google.android.gms.internal.measurement.C0960l3;
import com.google.android.gms.internal.measurement.C0989r3;
import com.google.android.gms.internal.measurement.D3;
import com.google.android.gms.internal.measurement.G3;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.T2;
import com.google.android.gms.internal.measurement.V3;
import com.google.android.gms.internal.measurement.Z2;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.e4;
import d4.C1122a;
import e4.C1143a;
import f4.C1165c;
import g4.C1252a;
import i8.s;
import j3.M;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.h;
import l4.AbstractC1566a;
import s8.n;
import u0.z;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2235a implements s, l, c, q, H6.a, e, InterfaceC0317s, j, InterfaceC0397d, C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25365a;

    public /* synthetic */ C2235a(int i9) {
        this.f25365a = i9;
    }

    public static MediaCodec d(k kVar) {
        kVar.f1473a.getClass();
        String str = kVar.f1473a.f1479a;
        AbstractC1566a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        AbstractC1566a.v();
        return createByCodecName;
    }

    public static final boolean f() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    @Override // b5.C
    public Object a() {
        switch (this.f25365a) {
            case 17:
                List list = E.f10635a;
                Boolean bool = (Boolean) C0960l3.f15532a.b();
                bool.getClass();
                return bool;
            case 18:
                List list2 = E.f10635a;
                Boolean bool2 = (Boolean) G3.f15217a.b();
                bool2.getClass();
                return bool2;
            case 19:
                List list3 = E.f10635a;
                return Integer.valueOf((int) ((Long) Z2.f15429a.b()).longValue());
            case 20:
                List list4 = E.f10635a;
                Boolean bool3 = (Boolean) T2.f15300a.b();
                bool3.getClass();
                return bool3;
            case 21:
                List list5 = E.f10635a;
                c4.f15457b.get();
                Boolean bool4 = (Boolean) e4.f15474c.b();
                bool4.getClass();
                return bool4;
            case 22:
                List list6 = E.f10635a;
                c4.f15457b.get();
                Boolean bool5 = (Boolean) e4.f15476e.b();
                bool5.getClass();
                return bool5;
            case 23:
                List list7 = E.f10635a;
                c4.f15457b.get();
                Boolean bool6 = (Boolean) e4.f15473b.b();
                bool6.getClass();
                return bool6;
            case 24:
                Boolean bool7 = (Boolean) D3.f15206a.b();
                bool7.getClass();
                return bool7;
            case 25:
                List list8 = E.f10635a;
                K3.f15248b.get();
                Boolean bool8 = (Boolean) M3.f15275h.b();
                bool8.getClass();
                return bool8;
            case 26:
                List list9 = E.f10635a;
                K3.f15248b.get();
                Boolean bool9 = (Boolean) M3.f15271d.b();
                bool9.getClass();
                return bool9;
            case 27:
                Boolean bool10 = (Boolean) V3.f15321a.b();
                bool10.getClass();
                return bool10;
            case 28:
                Boolean bool11 = (Boolean) C0915c3.f15456c.b();
                bool11.getClass();
                return bool11;
            default:
                Boolean bool12 = (Boolean) C0989r3.f15576a.b();
                bool12.getClass();
                return bool12;
        }
    }

    @Override // U3.InterfaceC0397d
    public InterfaceC0398e e(int i9) {
        int i10;
        G g9 = new G();
        G g10 = new G();
        boolean z9 = false;
        try {
            g9.f7334a.g(Z0.a.j(0));
            int f9 = g9.f();
            if (f9 % 2 == 0) {
                z9 = true;
            }
            if (z9) {
                i10 = f9 + 1;
            } else {
                i10 = f9 - 1;
            }
            g10.f7334a.g(Z0.a.j(i10));
            if (z9) {
                g9.f7335b = g10;
                return g9;
            }
            g10.f7335b = g9;
            return g10;
        } catch (IOException e8) {
            n.h(g9);
            n.h(g10);
            throw e8;
        }
    }

    @Override // D0.c
    public void h(int i9, Serializable serializable) {
        String str;
        switch (i9) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i9 != 6 && i9 != 7 && i9 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
    }

    @Override // i8.s
    public List i(String hostname) {
        switch (this.f25365a) {
            case 1:
                h.e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    h.d(allByName, "getAllByName(hostname)");
                    return B7.k.C0(B7.j.o0(allByName), new B.j(1));
                } catch (NullPointerException e8) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                    unknownHostException.initCause(e8);
                    throw unknownHostException;
                }
            default:
                h.e(hostname, "hostname");
                try {
                    InetAddress[] allByName2 = InetAddress.getAllByName(hostname);
                    h.d(allByName2, "getAllByName(hostname)");
                    return B7.k.C0(B7.j.o0(allByName2), new B.j(5));
                } catch (NullPointerException e9) {
                    UnknownHostException unknownHostException2 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                    unknownHostException2.initCause(e9);
                    throw unknownHostException2;
                }
        }
    }

    @Override // Y3.j
    public Y3.h j(M m9) {
        String str = m9.f19435l;
        if (str != null) {
            int i9 = m9.f19423D;
            List list = m9.f19437n;
            char c3 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c3 = '\b';
                        break;
                    }
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c3 = '\t';
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c3 = '\n';
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c3 = 11;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    return new C0492a(list);
                case 1:
                    return new C0608b();
                case 2:
                    return new C0492a();
                case 3:
                    return new S2.c(0);
                case 4:
                    return new C1252a(list);
                case 5:
                    return new C1122a(list);
                case 6:
                case '\b':
                    return new Z3.c(str, i9);
                case 7:
                    return new D4.n(3);
                case '\t':
                    return new g(list, i9);
                case R.styleable.GradientColor_android_endX /* 10 */:
                    return new C1143a();
                case R.styleable.GradientColor_android_endY /* 11 */:
                    return new C1165c();
            }
        }
        throw new IllegalArgumentException(z.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // Y3.j
    public boolean k(M m9) {
        String str = m9.f19435l;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // O4.e
    public d l(Context context, String str, O4.c cVar) {
        d dVar = new d();
        int g9 = cVar.g(context, str, true);
        dVar.f5460b = g9;
        if (g9 != 0) {
            dVar.f5461c = 1;
            return dVar;
        }
        int b9 = cVar.b(context, str);
        dVar.f5459a = b9;
        if (b9 != 0) {
            dVar.f5461c = -1;
        }
        return dVar;
    }

    @Override // G2.q
    public Object n(Object obj) {
        String str;
        String str2;
        boolean z9;
        boolean z10;
        String str3;
        String str4;
        PlayerResponse dto = (PlayerResponse) obj;
        h.e(dto, "dto");
        String str5 = dto.f14278b;
        if (str5 == null) {
            str = "";
        } else {
            str = str5;
        }
        String str6 = dto.f14279c;
        if (str6 == null) {
            str2 = "";
        } else {
            str2 = str6;
        }
        int i9 = 0;
        Integer num = dto.f14280d;
        if (num != null && num.intValue() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        Integer num2 = dto.f14281e;
        if (num2 != null && num2.intValue() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer num3 = dto.f14282f;
        if (num3 != null) {
            i9 = num3.intValue();
        }
        int i10 = i9;
        String str7 = dto.f14284h;
        if (str7 == null) {
            str3 = "";
        } else {
            str3 = str7;
        }
        String str8 = dto.f14283g;
        if (str8 == null) {
            str4 = "";
        } else {
            str4 = str8;
        }
        return new t(dto.f14277a, str, str2, z9, z10, i10, str3, str4);
    }

    @Override // H6.a
    public StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        int i9;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i11 - intValue;
                if (i11 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i11 + i14])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i10 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i10++;
                    }
                    i9 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i9 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i10 = 1;
            i9 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i9 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        if (i12 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override // C3.l
    public m p(k kVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = d(kVar);
            AbstractC1566a.c("configureCodec");
            mediaCodec.configure(kVar.f1474b, kVar.f1476d, kVar.f1477e, 0);
            AbstractC1566a.v();
            AbstractC1566a.c("startCodec");
            mediaCodec.start();
            AbstractC1566a.v();
            return new y(mediaCodec);
        } catch (IOException | RuntimeException e8) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e8;
        }
    }

    @Override // D0.c
    public void q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // P.InterfaceC0317s
    public void b(int i9, int i10, int i11, boolean z9) {
    }

    @Override // P.InterfaceC0317s
    public void c(int i9, int i10, int i11, int i12) {
    }
}
