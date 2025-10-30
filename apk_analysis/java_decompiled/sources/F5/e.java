package F5;

import a4.C0492a;
import android.content.Context;
import b4.C0608b;
import b5.C;
import b5.E;
import b5.InterfaceC0625f;
import co.notix.R;
import com.google.android.gms.internal.measurement.C0945i3;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.U2;
import com.google.android.gms.internal.measurement.W2;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.k4;
import d4.C1122a;
import e4.C1143a;
import f4.C1165c;
import g4.C1252a;
import j3.M;
import java.util.List;
import java.util.NoSuchElementException;
import k4.O;
import l4.AbstractC1566a;
import l4.y;
import org.json.JSONObject;
import u0.z;
import z2.C2235a;

/* loaded from: classes.dex */
public class e implements A6.d, C3.l, G6.f, E7.h, O4.e, P3.l, Q0.c, T3.q, Y3.j, InterfaceC0625f, C {

    /* renamed from: b, reason: collision with root package name */
    public static e f2463b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2464a;

    public /* synthetic */ e(int i9) {
        this.f2464a = i9;
    }

    public static G6.c n(d0.o oVar) {
        return new G6.c(System.currentTimeMillis() + 3600000, new e1.q(8), new G6.b(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // b5.C
    public Object a() {
        switch (this.f2464a) {
            case 18:
                List list = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15378o0.b()).longValue());
            case 19:
                List list2 = E.f10635a;
                Boolean bool = (Boolean) k4.f15521a.b();
                bool.getClass();
                return bool;
            case 20:
                List list3 = E.f10635a;
                Boolean bool2 = (Boolean) C0945i3.f15504a.b();
                bool2.getClass();
                return bool2;
            case 21:
                List list4 = E.f10635a;
                Boolean bool3 = (Boolean) Y3.f15421a.b();
                bool3.getClass();
                return bool3;
            case 22:
                List list5 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15361f0.b()).longValue());
            case 23:
                List list6 = E.f10635a;
                c4.f15457b.get();
                Boolean bool4 = (Boolean) e4.f15477f.b();
                bool4.getClass();
                return bool4;
            case 24:
                List list7 = E.f10635a;
                c4.f15457b.get();
                Boolean bool5 = (Boolean) e4.f15472a.b();
                bool5.getClass();
                return bool5;
            case 25:
                List list8 = E.f10635a;
                K3.f15248b.get();
                Boolean bool6 = (Boolean) M3.f15273f.b();
                bool6.getClass();
                return bool6;
            case 26:
                List list9 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15368j0.b()).longValue());
            case 27:
                List list10 = E.f10635a;
                Boolean bool7 = (Boolean) P3.f15283a.b();
                bool7.getClass();
                return bool7;
            case 28:
                List list11 = E.f10635a;
                Boolean bool8 = (Boolean) h4.f15497a.b();
                bool8.getClass();
                return bool8;
            default:
                List list12 = E.f10635a;
                U2.f15316b.get();
                Long l9 = (Long) W2.f15350a.b();
                l9.getClass();
                return l9;
        }
    }

    @Override // P3.l
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // G6.f
    public G6.c d(d0.o oVar, JSONObject jSONObject) {
        return n(oVar);
    }

    @Override // Q0.c
    public Q0.d e(A6.t tVar) {
        return new R0.h((Context) tVar.f540b, (String) tVar.f541c, (Q0.b) tVar.f542d, tVar.f539a);
    }

    @Override // A6.d
    public String f() {
        return null;
    }

    @Override // T3.q
    public O g(T3.m mVar, T3.j jVar) {
        return new T3.p(mVar, jVar);
    }

    @Override // P3.l
    public long h() {
        throw new NoSuchElementException();
    }

    @Override // T3.q
    public O i() {
        return new T3.p(T3.m.f7141n, null);
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
                    return new S2.c(1);
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
                    return new Z3.g(list, i9);
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
    public O4.d l(Context context, String str, O4.c cVar) {
        O4.d dVar = new O4.d();
        dVar.f5459a = cVar.b(context, str);
        int i9 = 1;
        int g9 = cVar.g(context, str, true);
        dVar.f5460b = g9;
        int i10 = dVar.f5459a;
        if (i10 == 0) {
            i10 = 0;
            if (g9 == 0) {
                i9 = 0;
                dVar.f5461c = i9;
                return dVar;
            }
        }
        if (i10 >= g9) {
            i9 = -1;
        }
        dVar.f5461c = i9;
        return dVar;
    }

    @Override // P3.l
    public boolean next() {
        return false;
    }

    @Override // b5.InterfaceC0625f
    public String o(String str, String str2) {
        return null;
    }

    @Override // C3.l
    public C3.m p(C3.k kVar) {
        int i9 = y.f20553a;
        if (i9 >= 23 && i9 >= 31) {
            int h7 = l4.n.h(kVar.f1475c.f19435l);
            AbstractC1566a.A("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + y.C(h7));
            return new A1.g(h7).p(kVar);
        }
        return new C2235a(2).p(kVar);
    }

    public boolean q() {
        return this instanceof f;
    }

    public void r(float f9, float f10, float f11, w wVar) {
        wVar.c(f9, 0.0f);
    }

    @Override // A6.d
    public void b() {
    }

    @Override // A6.d
    public void m(long j, String str) {
    }
}
