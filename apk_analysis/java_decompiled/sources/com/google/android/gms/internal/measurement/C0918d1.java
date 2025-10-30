package com.google.android.gms.internal.measurement;

import android.os.Build;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918d1 extends AbstractC0909b2 {
    private static final C0918d1 zzb;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private InterfaceC0939h2 zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private C0923e1 zzR;
    private InterfaceC0929f2 zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private Z0 zzab;
    private String zzac;
    private InterfaceC0939h2 zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private P0 zzam;
    private int zzan;
    private M0 zzao;
    private String zzap;
    private C0958l1 zzaq;
    private long zzar;
    private String zzas;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC0939h2 zzg;
    private InterfaceC0939h2 zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        C0918d1 c0918d1 = new C0918d1();
        zzb = c0918d1;
        AbstractC0909b2.j(C0918d1.class, c0918d1);
    }

    public C0918d1() {
        C1028z2 c1028z2 = C1028z2.f15711e;
        this.zzg = c1028z2;
        this.zzh = c1028z2;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = c1028z2;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = C0914c2.f15451e;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = c1028z2;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
    }

    public static /* synthetic */ void A0(C0918d1 c0918d1) {
        c0918d1.zzd &= -17;
        c0918d1.zzl = 0L;
    }

    public static /* synthetic */ void A1(C0918d1 c0918d1, int i9) {
        c0918d1.zzd |= 1024;
        c0918d1.zzr = i9;
    }

    public static /* synthetic */ void B0(C0918d1 c0918d1) {
        c0918d1.zzd &= -65537;
        c0918d1.zzx = zzb.zzx;
    }

    public static /* synthetic */ void B1(C0918d1 c0918d1, long j) {
        c0918d1.zzd |= 2;
        c0918d1.zzi = j;
    }

    public static /* synthetic */ void C0(C0918d1 c0918d1) {
        c0918d1.zze &= -8193;
        c0918d1.zzac = zzb.zzac;
    }

    public static /* synthetic */ void C1(C0918d1 c0918d1) {
        c0918d1.zzd |= 32768;
        c0918d1.zzw = 119002L;
    }

    public static /* synthetic */ void D0(C0918d1 c0918d1) {
        c0918d1.zzd &= -268435457;
        c0918d1.zzK = zzb.zzK;
    }

    public static /* synthetic */ void D1(C0918d1 c0918d1, int i9, C0968n1 c0968n1) {
        c0918d1.O1();
        c0918d1.zzh.set(i9, c0968n1);
    }

    public static /* synthetic */ void E0(C0918d1 c0918d1) {
        c0918d1.zzd &= -3;
        c0918d1.zzi = 0L;
    }

    public static /* synthetic */ void E1(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zzd |= 512;
        c0918d1.zzq = str;
    }

    public static /* synthetic */ void F0(C0918d1 c0918d1, int i9) {
        c0918d1.N1();
        c0918d1.zzg.remove(i9);
    }

    public static /* synthetic */ void G0(C0918d1 c0918d1, int i9) {
        c0918d1.O1();
        c0918d1.zzh.remove(i9);
    }

    public static /* synthetic */ void H0(C0918d1 c0918d1, M0 m02) {
        c0918d1.zzao = m02;
        c0918d1.zze |= 16777216;
    }

    public static /* synthetic */ void I0(C0918d1 c0918d1, int i9) {
        c0918d1.zze |= 1048576;
        c0918d1.zzak = i9;
    }

    public static /* synthetic */ void J0(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zze |= 4;
        c0918d1.zzQ = str;
    }

    public static /* synthetic */ void K0(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zzd |= 4096;
        c0918d1.zzt = str;
    }

    public static void L(C0918d1 c0918d1, ArrayList arrayList) {
        InterfaceC0939h2 interfaceC0939h2 = c0918d1.zzF;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            c0918d1.zzF = interfaceC0939h2.a(size + size);
        }
        N1.b(arrayList, c0918d1.zzF);
    }

    public static /* synthetic */ void L0(C0918d1 c0918d1, String str) {
        c0918d1.zzd |= 262144;
        c0918d1.zzz = str;
    }

    public static /* synthetic */ void N(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zzd |= 2048;
        c0918d1.zzs = str;
    }

    public static /* synthetic */ void O(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zzd |= 8192;
        c0918d1.zzu = str;
    }

    public static /* synthetic */ void P(C0918d1 c0918d1, int i9) {
        c0918d1.zzd |= 33554432;
        c0918d1.zzH = i9;
    }

    public static /* synthetic */ void Q(C0918d1 c0918d1, P0 p02) {
        c0918d1.zzam = p02;
        c0918d1.zze |= 4194304;
    }

    public static /* synthetic */ void R(C0918d1 c0918d1, long j) {
        c0918d1.zze |= 134217728;
        c0918d1.zzar = j;
    }

    public static /* synthetic */ void S(C0918d1 c0918d1, int i9) {
        c0918d1.zzd |= 1048576;
        c0918d1.zzB = i9;
    }

    public static /* synthetic */ void T(C0918d1 c0918d1, long j) {
        c0918d1.zze |= 32;
        c0918d1.zzU = j;
    }

    public static /* synthetic */ void U(C0918d1 c0918d1, long j) {
        c0918d1.zzd |= 536870912;
        c0918d1.zzL = j;
    }

    public static /* synthetic */ void V(C0918d1 c0918d1, String str) {
        c0918d1.zze |= 131072;
        c0918d1.zzah = str;
    }

    public static /* synthetic */ void W(C0918d1 c0918d1, String str) {
        c0918d1.zze |= 128;
        c0918d1.zzW = str;
    }

    public static /* synthetic */ void X(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zze |= 524288;
        c0918d1.zzaj = str;
    }

    public static /* synthetic */ void Y(C0918d1 c0918d1, int i9) {
        c0918d1.zze |= 8388608;
        c0918d1.zzan = i9;
    }

    public static /* synthetic */ void Z(C0918d1 c0918d1, long j) {
        c0918d1.zzd |= 524288;
        c0918d1.zzA = j;
    }

    public static /* synthetic */ void a0(C0918d1 c0918d1) {
        String str = Build.MODEL;
        str.getClass();
        c0918d1.zzd |= 256;
        c0918d1.zzp = str;
    }

    public static /* synthetic */ void b0(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zzd |= Integer.MIN_VALUE;
        c0918d1.zzN = str;
    }

    public static /* synthetic */ void c0(C0918d1 c0918d1, long j) {
        c0918d1.zze |= 16;
        c0918d1.zzT = j;
    }

    public static /* synthetic */ void d0(C0918d1 c0918d1, boolean z9) {
        c0918d1.zze |= 65536;
        c0918d1.zzag = z9;
    }

    public static /* synthetic */ void e0(C0918d1 c0918d1, long j) {
        c0918d1.zzd |= 8;
        c0918d1.zzk = j;
    }

    public static /* synthetic */ void f0(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zze |= 16384;
        c0918d1.zzae = str;
    }

    public static /* synthetic */ void g0(C0918d1 c0918d1, int i9, V0 v02) {
        c0918d1.N1();
        c0918d1.zzg.set(i9, v02);
    }

    public static /* synthetic */ void h0(C0918d1 c0918d1) {
        c0918d1.zze |= 268435456;
        c0918d1.zzas = "";
    }

    public static /* synthetic */ void i0(C0918d1 c0918d1, String str) {
        c0918d1.zzd |= 16777216;
        c0918d1.zzG = str;
    }

    public static /* synthetic */ void j0(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zzd |= 4194304;
        c0918d1.zzD = str;
    }

    public static /* synthetic */ void k0(C0918d1 c0918d1, long j) {
        c0918d1.zzd |= 16384;
        c0918d1.zzv = j;
    }

    public static C0913c1 k2() {
        return (C0913c1) zzb.e();
    }

    public static /* synthetic */ void l0(C0918d1 c0918d1, String str) {
        c0918d1.zzd |= 2097152;
        c0918d1.zzC = str;
    }

    public static /* synthetic */ void m0(C0918d1 c0918d1, boolean z9) {
        c0918d1.zze |= 262144;
        c0918d1.zzai = z9;
    }

    public static C0913c1 n(C0918d1 c0918d1) {
        AbstractC0904a2 e8 = zzb.e();
        e8.e(c0918d1);
        return (C0913c1) e8;
    }

    public static /* synthetic */ void n0(C0918d1 c0918d1, ArrayList arrayList) {
        c0918d1.N1();
        N1.b(arrayList, c0918d1.zzg);
    }

    public static /* synthetic */ void n1(C0918d1 c0918d1, boolean z9) {
        c0918d1.zzd |= 131072;
        c0918d1.zzy = z9;
    }

    public static void o0(C0918d1 c0918d1, ArrayList arrayList) {
        RandomAccess randomAccess = c0918d1.zzS;
        if (!((O1) randomAccess).f15279a) {
            C0914c2 c0914c2 = (C0914c2) randomAccess;
            int i9 = c0914c2.f15453c;
            c0918d1.zzS = c0914c2.a(i9 + i9);
        }
        N1.b(arrayList, c0918d1.zzS);
    }

    public static /* synthetic */ void o1(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zzd |= 128;
        c0918d1.zzo = str;
    }

    public static void p0(C0918d1 c0918d1, Set set) {
        InterfaceC0939h2 interfaceC0939h2 = c0918d1.zzad;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            c0918d1.zzad = interfaceC0939h2.a(size + size);
        }
        N1.b(set, c0918d1.zzad);
    }

    public static /* synthetic */ void p1(C0918d1 c0918d1) {
        c0918d1.zzd |= 64;
        c0918d1.zzn = "android";
    }

    public static /* synthetic */ void q0(C0918d1 c0918d1, V0 v02) {
        c0918d1.N1();
        c0918d1.zzg.add(v02);
    }

    public static /* synthetic */ void q1(C0918d1 c0918d1, long j) {
        c0918d1.zzd |= 32;
        c0918d1.zzm = j;
    }

    public static /* synthetic */ void r0(C0918d1 c0918d1, C0968n1 c0968n1) {
        c0918d1.O1();
        c0918d1.zzh.add(c0968n1);
    }

    public static /* synthetic */ void r1(C0918d1 c0918d1, long j) {
        c0918d1.zzd |= 16;
        c0918d1.zzl = j;
    }

    public static /* synthetic */ void s0(C0918d1 c0918d1) {
        c0918d1.zzd &= -262145;
        c0918d1.zzz = zzb.zzz;
    }

    public static /* synthetic */ void s1(C0918d1 c0918d1) {
        c0918d1.zzd |= 1;
        c0918d1.zzf = 1;
    }

    public static void t0(C0918d1 c0918d1) {
        c0918d1.zzF = C1028z2.f15711e;
    }

    public static /* synthetic */ void t1(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zzd |= 65536;
        c0918d1.zzx = str;
    }

    public static /* synthetic */ void u0(C0918d1 c0918d1) {
        c0918d1.zzd &= -257;
        c0918d1.zzp = zzb.zzp;
    }

    public static /* synthetic */ void u1(C0918d1 c0918d1, int i9) {
        c0918d1.zze |= 2;
        c0918d1.zzP = i9;
    }

    public static /* synthetic */ void v0(C0918d1 c0918d1) {
        c0918d1.zzd &= Integer.MAX_VALUE;
        c0918d1.zzN = zzb.zzN;
    }

    public static /* synthetic */ void v1(C0918d1 c0918d1) {
        c0918d1.zzd |= 8388608;
        c0918d1.zzE = false;
    }

    public static void w0(C0918d1 c0918d1) {
        c0918d1.zzg = C1028z2.f15711e;
    }

    public static /* synthetic */ void w1(C0918d1 c0918d1, String str) {
        str.getClass();
        c0918d1.zze |= 8192;
        c0918d1.zzac = str;
    }

    public static /* synthetic */ void x0(C0918d1 c0918d1) {
        c0918d1.zzd &= -2097153;
        c0918d1.zzC = zzb.zzC;
    }

    public static /* synthetic */ void x1(C0918d1 c0918d1, C0958l1 c0958l1) {
        c0918d1.zzaq = c0958l1;
        c0918d1.zze |= 67108864;
    }

    public static /* synthetic */ void y0(C0918d1 c0918d1) {
        c0918d1.zzd &= -131073;
        c0918d1.zzy = false;
    }

    public static /* synthetic */ void y1(C0918d1 c0918d1, long j) {
        c0918d1.zzd |= 4;
        c0918d1.zzj = j;
    }

    public static /* synthetic */ void z0(C0918d1 c0918d1) {
        c0918d1.zzd &= -33;
        c0918d1.zzm = 0L;
    }

    public static /* synthetic */ void z1(C0918d1 c0918d1, long j) {
        c0918d1.zze |= 32768;
        c0918d1.zzaf = j;
    }

    public final String A() {
        return this.zzG;
    }

    public final String B() {
        return this.zzD;
    }

    public final String C() {
        return this.zzC;
    }

    public final String D() {
        return this.zzo;
    }

    public final String E() {
        return this.zzn;
    }

    public final String F() {
        return this.zzx;
    }

    public final boolean F1() {
        return this.zzag;
    }

    public final String G() {
        return this.zzac;
    }

    public final boolean G1() {
        return this.zzai;
    }

    public final String H() {
        return this.zzq;
    }

    public final boolean H1() {
        return this.zzy;
    }

    public final InterfaceC0939h2 I() {
        return this.zzF;
    }

    public final boolean I1() {
        return this.zzE;
    }

    public final InterfaceC0939h2 J() {
        return this.zzg;
    }

    public final boolean J1() {
        return (this.zze & 16777216) != 0;
    }

    public final InterfaceC0939h2 K() {
        return this.zzh;
    }

    public final boolean K1() {
        return (this.zzd & 33554432) != 0;
    }

    public final boolean L1() {
        return (this.zze & 4194304) != 0;
    }

    public final int M() {
        return this.zzak;
    }

    public final int M0() {
        return this.zzH;
    }

    public final int M1() {
        return this.zzB;
    }

    public final boolean N0() {
        return (this.zze & 134217728) != 0;
    }

    public final void N1() {
        InterfaceC0939h2 interfaceC0939h2 = this.zzg;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            this.zzg = interfaceC0939h2.a(size + size);
        }
    }

    public final boolean O0() {
        return (this.zzd & 1048576) != 0;
    }

    public final void O1() {
        InterfaceC0939h2 interfaceC0939h2 = this.zzh;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            this.zzh = interfaceC0939h2.a(size + size);
        }
    }

    public final boolean P0() {
        return (this.zzd & 536870912) != 0;
    }

    public final int P1() {
        return this.zzan;
    }

    public final boolean Q0() {
        return (this.zze & 131072) != 0;
    }

    public final int Q1() {
        return this.zzg.size();
    }

    public final boolean R0() {
        return (this.zze & 128) != 0;
    }

    public final int R1() {
        return this.zzf;
    }

    public final boolean S0() {
        return (this.zze & 524288) != 0;
    }

    public final int S1() {
        return this.zzP;
    }

    public final boolean T0() {
        return (this.zze & 8388608) != 0;
    }

    public final int T1() {
        return this.zzr;
    }

    public final boolean U0() {
        return (this.zzd & 524288) != 0;
    }

    public final int U1() {
        return this.zzh.size();
    }

    public final boolean V0() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final long V1() {
        return this.zzar;
    }

    public final boolean W0() {
        return (this.zze & 16) != 0;
    }

    public final long W1() {
        return this.zzL;
    }

    public final boolean X0() {
        return (this.zzd & 8) != 0;
    }

    public final long X1() {
        return this.zzA;
    }

    public final boolean Y0() {
        return (this.zzd & 16384) != 0;
    }

    public final long Y1() {
        return this.zzT;
    }

    public final boolean Z0() {
        return (this.zze & 262144) != 0;
    }

    public final long Z1() {
        return this.zzk;
    }

    public final boolean a1() {
        return (this.zzd & 131072) != 0;
    }

    public final long a2() {
        return this.zzv;
    }

    public final boolean b1() {
        return (this.zzd & 32) != 0;
    }

    public final long b2() {
        return this.zzm;
    }

    public final boolean c1() {
        return (this.zzd & 16) != 0;
    }

    public final long c2() {
        return this.zzl;
    }

    public final boolean d1() {
        return (this.zzd & 1) != 0;
    }

    public final long d2() {
        return this.zzj;
    }

    public final boolean e1() {
        return (this.zze & 2) != 0;
    }

    public final long e2() {
        return this.zzaf;
    }

    public final boolean f1() {
        return (this.zzd & 8388608) != 0;
    }

    public final long f2() {
        return this.zzi;
    }

    public final boolean g1() {
        return (this.zze & 8192) != 0;
    }

    public final long g2() {
        return this.zzw;
    }

    public final boolean h1() {
        return (this.zze & 67108864) != 0;
    }

    public final M0 h2() {
        M0 m02 = this.zzao;
        if (m02 == null) {
            return M0.y();
        }
        return m02;
    }

    public final boolean i1() {
        return (this.zzd & 4) != 0;
    }

    public final P0 i2() {
        P0 p02 = this.zzam;
        if (p02 == null) {
            return P0.o();
        }
        return p02;
    }

    public final boolean j1() {
        return (this.zze & 32768) != 0;
    }

    public final V0 j2(int i9) {
        return (V0) this.zzg.get(i9);
    }

    public final boolean k1() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean l1() {
        return (this.zzd & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0909b2
    public final Object m(int i9) {
        int i10 = i9 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new AbstractC0904a2(zzb);
                }
                return new C0918d1();
            }
            return new A2(zzb, "\u0004B\u0000\u0002\u0001SB\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<", new Object[]{"zzd", "zze", "zzf", "zzg", V0.class, "zzh", C0968n1.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", R0.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", C0991s0.f15583f, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        return (byte) 1;
    }

    public final boolean m1() {
        return (this.zzd & 32768) != 0;
    }

    public final C0958l1 o() {
        C0958l1 c0958l1 = this.zzaq;
        if (c0958l1 == null) {
            return C0958l1.p();
        }
        return c0958l1;
    }

    public final C0968n1 p(int i9) {
        return (C0968n1) this.zzh.get(i9);
    }

    public final String q() {
        return this.zzQ;
    }

    public final String r() {
        return this.zzt;
    }

    public final String s() {
        return this.zzz;
    }

    public final String t() {
        return this.zzs;
    }

    public final String u() {
        return this.zzu;
    }

    public final String v() {
        return this.zzah;
    }

    public final String w() {
        return this.zzW;
    }

    public final String x() {
        return this.zzaj;
    }

    public final String y() {
        return this.zzp;
    }

    public final String z() {
        return this.zzN;
    }
}
