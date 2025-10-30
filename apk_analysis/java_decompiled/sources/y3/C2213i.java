package y3;

import A3.E;
import android.util.SparseArray;
import j3.L;
import j3.M;
import j3.j0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import l4.AbstractC1566a;
import l4.x;
import l4.y;
import n3.C1629f;
import n3.C1630g;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import q3.u;

/* renamed from: y3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2213i implements InterfaceC1905j {

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f24806I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: J, reason: collision with root package name */
    public static final M f24807J;

    /* renamed from: A, reason: collision with root package name */
    public int f24808A;

    /* renamed from: B, reason: collision with root package name */
    public int f24809B;

    /* renamed from: C, reason: collision with root package name */
    public int f24810C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f24811D;

    /* renamed from: H, reason: collision with root package name */
    public boolean f24815H;

    /* renamed from: a, reason: collision with root package name */
    public final int f24816a;

    /* renamed from: b, reason: collision with root package name */
    public final o f24817b;

    /* renamed from: c, reason: collision with root package name */
    public final List f24818c;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f24823h;

    /* renamed from: i, reason: collision with root package name */
    public final A4.r f24824i;
    public final x j;

    /* renamed from: o, reason: collision with root package name */
    public final Q3.o f24829o;

    /* renamed from: p, reason: collision with root package name */
    public int f24830p;

    /* renamed from: q, reason: collision with root package name */
    public int f24831q;

    /* renamed from: r, reason: collision with root package name */
    public long f24832r;

    /* renamed from: s, reason: collision with root package name */
    public int f24833s;

    /* renamed from: t, reason: collision with root package name */
    public A4.r f24834t;

    /* renamed from: u, reason: collision with root package name */
    public long f24835u;

    /* renamed from: v, reason: collision with root package name */
    public int f24836v;

    /* renamed from: z, reason: collision with root package name */
    public C2212h f24840z;

    /* renamed from: k, reason: collision with root package name */
    public final A1.g f24825k = new A1.g(15, (byte) 0);

    /* renamed from: l, reason: collision with root package name */
    public final A4.r f24826l = new A4.r(16);

    /* renamed from: e, reason: collision with root package name */
    public final A4.r f24820e = new A4.r(AbstractC1566a.f20476d);

    /* renamed from: f, reason: collision with root package name */
    public final A4.r f24821f = new A4.r(5);

    /* renamed from: g, reason: collision with root package name */
    public final A4.r f24822g = new A4.r(5, false);

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f24827m = new ArrayDeque();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f24828n = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f24819d = new SparseArray();

    /* renamed from: x, reason: collision with root package name */
    public long f24838x = -9223372036854775807L;

    /* renamed from: w, reason: collision with root package name */
    public long f24837w = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    public long f24839y = -9223372036854775807L;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC1907l f24812E = InterfaceC1907l.f22320e0;

    /* renamed from: F, reason: collision with root package name */
    public u[] f24813F = new u[0];

    /* renamed from: G, reason: collision with root package name */
    public u[] f24814G = new u[0];

    static {
        L l9 = new L();
        l9.f19402k = "application/x-emsg";
        f24807J = new M(l9);
    }

    public C2213i(int i9, x xVar, o oVar, List list, Q3.o oVar2) {
        this.f24816a = i9;
        this.j = xVar;
        this.f24817b = oVar;
        this.f24818c = Collections.unmodifiableList(list);
        this.f24829o = oVar2;
        byte[] bArr = new byte[16];
        this.f24823h = bArr;
        this.f24824i = new A4.r(bArr);
    }

    public static C1630g c(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i9 = 0; i9 < size; i9++) {
            C2206b c2206b = (C2206b) arrayList.get(i9);
            if (c2206b.f6039b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = (byte[]) c2206b.f24777c.f384c;
                E e8 = AbstractC2214j.e(bArr);
                if (e8 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) e8.f47c;
                }
                if (uuid == null) {
                    AbstractC1566a.P("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C1629f(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C1630g(null, false, (C1629f[]) arrayList2.toArray(new C1629f[0]));
    }

    public static void d(A4.r rVar, int i9, q qVar) {
        boolean z9;
        rVar.H(i9 + 8);
        int i10 = rVar.i();
        if ((i10 & 1) == 0) {
            if ((i10 & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int A2 = rVar.A();
            if (A2 == 0) {
                Arrays.fill(qVar.f24901l, 0, qVar.f24895e, false);
                return;
            }
            if (A2 == qVar.f24895e) {
                Arrays.fill(qVar.f24901l, 0, A2, z9);
                int e8 = rVar.e();
                A4.r rVar2 = qVar.f24903n;
                rVar2.E(e8);
                qVar.f24900k = true;
                qVar.f24904o = true;
                rVar.h((byte[]) rVar2.f384c, 0, rVar2.f383b);
                rVar2.H(0);
                qVar.f24904o = false;
                return;
            }
            StringBuilder p9 = A0.a.p("Senc sample count ", A2, " is different from fragment sample count");
            p9.append(qVar.f24895e);
            throw j0.a(p9.toString(), null);
        }
        throw j0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        SparseArray sparseArray = this.f24819d;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C2212h) sparseArray.valueAt(i9)).d();
        }
        this.f24828n.clear();
        this.f24836v = 0;
        this.f24837w = j4;
        this.f24827m.clear();
        this.f24830p = 0;
        this.f24833s = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:406:0x07e2, code lost:
    
        r57.f24830p = 0;
        r57.f24833s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x07e7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r58) {
        /*
            Method dump skipped, instructions count: 2024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C2213i.e(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0129, code lost:
    
        if (r2.f24798d.f24907a.f24882g != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x012b, code lost:
    
        r31.f24808A = r3 - 8;
        ((q3.C1902g) r32).n(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0145, code lost:
    
        if ("audio/ac4".equals(r2.f24798d.f24907a.f24881f.f19435l) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0147, code lost:
    
        r31.f24809B = r2.c(r31.f24808A, 7);
        r3 = r31.f24808A;
        r8 = r31.f24824i;
        l3.AbstractC1552a.e(r3, r8);
        r2.f24795a.c(7, r8);
        r31.f24809B += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x016a, code lost:
    
        r31.f24808A += r31.f24809B;
        r31.f24830p = 4;
        r31.f24810C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0162, code lost:
    
        r31.f24809B = r2.c(r31.f24808A, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00df, code lost:
    
        r3 = r6.f24898h[r2.f24800f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0176, code lost:
    
        r3 = r2.f24798d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x017a, code lost:
    
        if (r2.f24805l != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x017c, code lost:
    
        r8 = r3.f24912f[r2.f24800f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x018a, code lost:
    
        if (r13 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x018c, code lost:
    
        r8 = r13.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0190, code lost:
    
        r3 = r3.f24907a;
        r7 = r3.j;
        r11 = r2.f24795a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0196, code lost:
    
        if (r7 == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0198, code lost:
    
        r14 = r31.f24821f;
        r15 = (byte[]) r14.f384c;
        r15[0] = 0;
        r15[1] = 0;
        r15[r33] = 0;
        r10 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b0, code lost:
    
        if (r31.f24809B >= r31.f24808A) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b2, code lost:
    
        r4 = r31.f24810C;
        r30 = r12;
        r12 = r3.f24881f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ba, code lost:
    
        if (r4 != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01bc, code lost:
    
        r19 = r3;
        ((q3.C1902g) r32).e(r15, r7, r10, false);
        r14.H(0);
        r4 = r14.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cd, code lost:
    
        if (r4 < 1) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cf, code lost:
    
        r31.f24810C = r4 - 1;
        r4 = r31.f24820e;
        r4.H(0);
        r11.c(4, r4);
        r11.c(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e4, code lost:
    
        if (r31.f24814G.length <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e6, code lost:
    
        r4 = r12.f19435l;
        r12 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f0, code lost:
    
        if ("video/avc".equals(r4) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f2, code lost:
    
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01f7, code lost:
    
        if ((r12 & 31) == 6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x020d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0213, code lost:
    
        r31.f24811D = r3;
        r31.f24809B += 5;
        r31.f24808A += r33;
        r7 = r33;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0225, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0201, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x020b, code lost:
    
        if (((r12 & 126) >> 1) != 39) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0212, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01fa, code lost:
    
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x020f, code lost:
    
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0230, code lost:
    
        throw j3.j0.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0231, code lost:
    
        r19 = r3;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0238, code lost:
    
        if (r31.f24811D == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x023a, code lost:
    
        r3 = r31.f24822g;
        r3.E(r4);
        r22 = r10;
        r23 = r14;
        ((q3.C1902g) r32).e((byte[]) r3.f384c, 0, r31.f24810C, false);
        r11.c(r31.f24810C, r3);
        r4 = r31.f24810C;
        r7 = l4.AbstractC1566a.O(r3.f383b, (byte[]) r3.f384c);
        r3.H("video/hevc".equals(r12.f19435l) ? 1 : 0);
        r3.G(r7);
        a.AbstractC0485a.e(r8, r3, r31.f24814G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027c, code lost:
    
        r31.f24809B += r4;
        r31.f24810C -= r4;
        r7 = r33;
        r3 = r19;
        r10 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0273, code lost:
    
        r22 = r10;
        r23 = r14;
        r4 = r11.a(r32, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x028f, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a8, code lost:
    
        if (r2.f24805l != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02aa, code lost:
    
        r6 = r2.f24798d.f24913g[r2.f24800f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02c2, code lost:
    
        if (r2.a() == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c4, code lost:
    
        r6 = r6 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c7, code lost:
    
        r25 = r6;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cd, code lost:
    
        if (r1 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cf, code lost:
    
        r28 = r1.f24888c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d6, code lost:
    
        r23 = r8;
        r11.d(r23, r25, r31.f24808A, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e7, code lost:
    
        if (r30.isEmpty() != false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e9, code lost:
    
        r1 = (y3.C2211g) r30.removeFirst();
        r31.f24836v -= r1.f24794c;
        r3 = r1.f24793b;
        r4 = r1.f24792a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02fa, code lost:
    
        if (r3 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02fc, code lost:
    
        r4 = r4 + r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02fe, code lost:
    
        if (r13 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0300, code lost:
    
        r4 = r13.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0304, code lost:
    
        r7 = r4;
        r3 = r31.f24813F;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0309, code lost:
    
        if (r5 >= r4) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x030b, code lost:
    
        r3[r5].d(r7, 1, r1.f24794c, r31.f24836v, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x031d, code lost:
    
        if (r2.b() != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x031f, code lost:
    
        r31.f24840z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0322, code lost:
    
        r31.f24830p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0327, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02d4, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02b9, code lost:
    
        if (r6.j[r2.f24800f] == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02bb, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02bd, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0292, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0294, code lost:
    
        r3 = r31.f24809B;
        r4 = r31.f24808A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0298, code lost:
    
        if (r3 >= r4) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x029a, code lost:
    
        r31.f24809B += r11.a(r32, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0183, code lost:
    
        r8 = r6.f24899i[r2.f24800f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ca, code lost:
    
        r3 = r31.f24830p;
        r6 = r2.f24796b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d0, code lost:
    
        if (r3 != 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d4, code lost:
    
        if (r2.f24805l != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d6, code lost:
    
        r3 = r2.f24798d.f24910d[r2.f24800f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e5, code lost:
    
        r31.f24808A = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00eb, code lost:
    
        if (r2.f24800f >= r2.f24803i) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ed, code lost:
    
        ((q3.C1902g) r32).n(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f6, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f9, code lost:
    
        r3 = r6.f24903n;
        r1 = r1.f24889d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fd, code lost:
    
        if (r1 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ff, code lost:
    
        r3.I(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0102, code lost:
    
        r1 = r2.f24800f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0106, code lost:
    
        if (r6.f24900k == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010c, code lost:
    
        if (r6.f24901l[r1] == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010e, code lost:
    
        r3.I(r3.C() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011a, code lost:
    
        if (r2.b() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011c, code lost:
    
        r31.f24840z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011e, code lost:
    
        r31.f24830p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0121, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r32, c7.C0790j r33) {
        /*
            Method dump skipped, instructions count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C2213i.f(q3.k, c7.j):int");
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        int i9;
        this.f24812E = interfaceC1907l;
        this.f24830p = 0;
        this.f24833s = 0;
        u[] uVarArr = new u[2];
        this.f24813F = uVarArr;
        Q3.o oVar = this.f24829o;
        if (oVar != null) {
            uVarArr[0] = oVar;
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i10 = 100;
        if ((this.f24816a & 4) != 0) {
            uVarArr[i9] = interfaceC1907l.u(100, 5);
            i10 = 101;
            i9++;
        }
        u[] uVarArr2 = (u[]) y.J(i9, this.f24813F);
        this.f24813F = uVarArr2;
        for (u uVar : uVarArr2) {
            uVar.e(f24807J);
        }
        List list = this.f24818c;
        this.f24814G = new u[list.size()];
        int i11 = 0;
        while (i11 < this.f24814G.length) {
            u u9 = this.f24812E.u(i10, 3);
            u9.e((M) list.get(i11));
            this.f24814G[i11] = u9;
            i11++;
            i10++;
        }
        o oVar2 = this.f24817b;
        if (oVar2 != null) {
            this.f24819d.put(0, new C2212h(interfaceC1907l.u(0, oVar2.f24877b), new r(this.f24817b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C2210f(0, 0, 0, 0)));
            this.f24812E.i();
        }
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        return AbstractC2214j.j(interfaceC1906k, true, false);
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
