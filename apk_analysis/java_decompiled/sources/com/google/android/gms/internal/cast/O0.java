package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class O0 extends N2 {
    private static final O0 zzb;
    private R2 zzA;
    private R2 zzB;
    private R2 zzC;
    private P1 zzD;
    private int zzE;
    private int zzF;
    private C0828h1 zzG;
    private int zzH;
    private M0 zzI;
    private R2 zzJ;
    private C0828h1 zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private C0813d2 zzR;
    private I0 zzS;
    private W0 zzT;
    private C0898z0 zzU;
    private C0871s1 zzV;
    private O1 zzW;
    private C0891x1 zzX;
    private R2 zzY;
    private C0887w1 zzZ;
    private int zzaa;
    private B1 zzab;
    private R2 zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private B0 zzag;
    private F1 zzah;
    private C0860p1 zzai;
    private C0804b1 zzaj;
    private A1 zzak;
    private U1 zzal;
    private C0808c1 zzam;
    private int zzan;
    private int zzao;
    private int zzap;
    private R2 zzaq;
    private C0825g2 zzar;
    private V1 zzas;
    private T1 zzat;
    private K0 zzau;
    private Y1 zzav;
    private M1 zzaw;
    private C0883v1 zzax;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private C0852n1 zzi;
    private E1 zzj;
    private C0848m1 zzk;
    private C0840k1 zzl;
    private L0 zzm;
    private D1 zzn;
    private D0 zzo;
    private C0805b2 zzp;
    private C0836j1 zzr;
    private C0866r0 zzs;
    private int zzv;
    private C0899z1 zzw;
    private R2 zzz;
    private byte zzay = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private P2 zzy = O2.f14753e;

    static {
        O0 o02 = new O0();
        zzb = o02;
        N2.e(O0.class, o02);
    }

    public O0() {
        e3 e3Var = e3.f14833e;
        this.zzz = e3Var;
        this.zzA = e3Var;
        this.zzB = e3Var;
        this.zzC = e3Var;
        this.zzJ = e3Var;
        this.zzY = e3Var;
        this.zzac = e3Var;
        this.zzaq = e3Var;
    }

    public static N0 m() {
        return (N0) zzb.j();
    }

    public static N0 n(O0 o02) {
        M2 j = zzb.j();
        N2 n22 = j.f14747a;
        if (!n22.equals(o02)) {
            if (!j.f14748b.g()) {
                N2 n23 = (N2) n22.h(4, null);
                d3.f14823c.a(n23.getClass()).f(n23, j.f14748b);
                j.f14748b = n23;
            }
            N2 n24 = j.f14748b;
            d3.f14823c.a(n24.getClass()).f(n24, o02);
        }
        return (N0) j;
    }

    public static void o(O0 o02, F0 f02) {
        R2 r22 = o02.zzY;
        if (!((F2) r22).f14714a) {
            int size = r22.size();
            o02.zzY = r22.a(size + size);
        }
        o02.zzY.add(f02);
    }

    public static /* synthetic */ void p(O0 o02, B0 b02) {
        o02.zzag = b02;
        o02.zze |= 8192;
    }

    public static /* synthetic */ void q(O0 o02, I0 i02) {
        o02.zzS = i02;
        o02.zze |= 2;
    }

    public static /* synthetic */ void r(O0 o02, String str) {
        str.getClass();
        o02.zzd |= 32768;
        o02.zzu = str;
    }

    public static /* synthetic */ void s(O0 o02, String str) {
        str.getClass();
        o02.zzd |= 2048;
        o02.zzq = str;
    }

    public static /* synthetic */ void t(O0 o02, int i9) {
        o02.zzd |= Integer.MIN_VALUE;
        o02.zzQ = i9;
    }

    public static /* synthetic */ void u(O0 o02, int i9) {
        o02.zzd |= 65536;
        o02.zzv = i9;
    }

    public static /* synthetic */ void v(O0 o02, T1 t12) {
        o02.zzat = t12;
        o02.zze |= 33554432;
    }

    public static /* synthetic */ void w(O0 o02, String str) {
        o02.zzd |= 262144;
        o02.zzx = str;
    }

    public static /* synthetic */ void x(O0 o02, String str) {
        str.getClass();
        o02.zzd |= 16384;
        o02.zzt = str;
    }

    public static /* synthetic */ void y(O0 o02, W0 w02) {
        o02.zzT = w02;
        o02.zze |= 4;
    }

    public static /* synthetic */ void z(O0 o02, long j) {
        o02.zzd |= 2;
        o02.zzg = j;
    }

    @Override // com.google.android.gms.internal.cast.N2
    public final Object h(int i9, N2 n22) {
        byte b9 = 1;
        int i10 = i9 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (n22 == null) {
                                b9 = 0;
                            }
                            this.zzay = b9;
                            return null;
                        }
                        return zzb;
                    }
                    return new M2(zzb);
                }
                return new O0();
            }
            return new f3(zzb, "\u0001G\u0000\u0002\u0001GG\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌(*ဉ)+\u001b,᠌\u001a-ဇ*.ဇ+/᠌,0ဉ-1င\u00172ဉ.3ဉ/4ဉ15ဉ26ဉ37᠌48᠌59᠌6:\u001b;ဈ\u000f<ဉ7=ဉ0>ဉ\u0013?ဉ\"@င\u0010Aဉ8Bဉ'Cဉ9Dဉ:Eဉ;Fဉ<Gဉ=", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C0878u0.f15010D, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", C0856o1.class, "zzA", C0864q1.class, "zzB", C0812d1.class, "zzC", Q1.class, "zzE", C0878u0.f15031v, "zzI", "zzJ", C0828h1.class, "zzK", "zzM", C0878u0.f15013c, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", C0878u0.f15029t, "zzG", "zzV", "zzW", "zzX", "zzY", F0.class, "zzaa", C0878u0.f15030u, "zzab", "zzac", J0.class, "zzL", C0878u0.f15012b, "zzad", "zzae", "zzaf", C0879u1.f15039D, "zzag", "zzH", "zzah", "zzai", "zzak", "zzal", "zzam", "zzan", C0879u1.f15058t, "zzao", C0878u0.f15022m, "zzap", C0879u1.f15057s, "zzaq", Z1.class, "zzu", "zzar", "zzaj", "zzD", "zzT", "zzv", "zzas", "zzZ", "zzat", "zzau", "zzav", "zzaw", "zzax"});
        }
        return Byte.valueOf(this.zzay);
    }

    public final I0 l() {
        I0 i02 = this.zzS;
        if (i02 == null) {
            return I0.n();
        }
        return i02;
    }
}
