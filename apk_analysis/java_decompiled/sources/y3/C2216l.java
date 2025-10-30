package y3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import l4.AbstractC1566a;
import l4.y;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import q3.v;

/* renamed from: y3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2216l implements InterfaceC1905j, q3.r {

    /* renamed from: i, reason: collision with root package name */
    public int f24856i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f24857k;

    /* renamed from: l, reason: collision with root package name */
    public A4.r f24858l;

    /* renamed from: n, reason: collision with root package name */
    public int f24860n;

    /* renamed from: o, reason: collision with root package name */
    public int f24861o;

    /* renamed from: p, reason: collision with root package name */
    public int f24862p;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f24865s;

    /* renamed from: t, reason: collision with root package name */
    public int f24866t;

    /* renamed from: u, reason: collision with root package name */
    public long f24867u;

    /* renamed from: v, reason: collision with root package name */
    public int f24868v;

    /* renamed from: h, reason: collision with root package name */
    public int f24855h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final n f24853f = new n();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f24854g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final A4.r f24851d = new A4.r(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f24852e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public final A4.r f24848a = new A4.r(AbstractC1566a.f20476d);

    /* renamed from: b, reason: collision with root package name */
    public final A4.r f24849b = new A4.r(4);

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f24850c = new A4.r(5, false);

    /* renamed from: m, reason: collision with root package name */
    public int f24859m = -1;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1907l f24863q = InterfaceC1907l.f22320e0;

    /* renamed from: r, reason: collision with root package name */
    public C2215k[] f24864r = new C2215k[0];

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        this.f24852e.clear();
        this.f24857k = 0;
        this.f24859m = -1;
        this.f24860n = 0;
        this.f24861o = 0;
        this.f24862p = 0;
        if (j == 0) {
            if (this.f24855h != 3) {
                this.f24855h = 0;
                this.f24857k = 0;
                return;
            } else {
                n nVar = this.f24853f;
                nVar.f24873a.clear();
                nVar.f24874b = 0;
                this.f24854g.clear();
                return;
            }
        }
        for (C2215k c2215k : this.f24864r) {
            r rVar = c2215k.f24844b;
            int e8 = y.e(rVar.f24912f, j4, false);
            while (true) {
                if (e8 >= 0) {
                    if ((rVar.f24913g[e8] & 1) != 0) {
                        break;
                    } else {
                        e8--;
                    }
                } else {
                    e8 = -1;
                    break;
                }
            }
            if (e8 == -1) {
                e8 = rVar.a(j4);
            }
            c2215k.f24847e = e8;
            v vVar = c2215k.f24846d;
            if (vVar != null) {
                vVar.f22352b = false;
                vVar.f22353c = 0;
            }
        }
    }

    @Override // q3.r
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x048e, code lost:
    
        r11 = r10;
        r3 = r42.f24857k;
        r5 = r42.f24851d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0497, code lost:
    
        if (r3 != 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04a4, code lost:
    
        if (r43.e((byte[]) r5.f384c, 0, 8, r11) != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04a9, code lost:
    
        r42.f24857k = 8;
        r5.H(0);
        r42.j = r5.y();
        r42.f24856i = r5.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04bf, code lost:
    
        r13 = r42.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04c5, code lost:
    
        if (r13 != 1) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04c7, code lost:
    
        r43.readFully((byte[]) r5.f384c, 8, 8);
        r42.f24857k += 8;
        r42.j = r5.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0504, code lost:
    
        r6 = r42.j;
        r3 = r42.f24857k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x050b, code lost:
    
        if (r6 < r3) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x050d, code lost:
    
        r6 = r42.f24856i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0518, code lost:
    
        if (r6 == 1836019574) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x051d, code lost:
    
        if (r6 == 1953653099) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0522, code lost:
    
        if (r6 == 1835297121) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0527, code lost:
    
        if (r6 == 1835626086) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x052c, code lost:
    
        if (r6 == 1937007212) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0531, code lost:
    
        if (r6 == 1701082227) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0533, code lost:
    
        if (r6 != 1835365473) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x053b, code lost:
    
        if (r6 == 1835296868) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0540, code lost:
    
        if (r6 == 1836476516) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0542, code lost:
    
        if (r6 == 1751411826) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0547, code lost:
    
        if (r6 == 1937011556) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x054c, code lost:
    
        if (r6 == 1937011827) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0551, code lost:
    
        if (r6 == 1937011571) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0556, code lost:
    
        if (r6 == 1668576371) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x055b, code lost:
    
        if (r6 == 1701606260) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0560, code lost:
    
        if (r6 == 1937011555) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0565, code lost:
    
        if (r6 == 1937011578) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x056a, code lost:
    
        if (r6 == 1937013298) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x056f, code lost:
    
        if (r6 == 1937007471) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0574, code lost:
    
        if (r6 == 1668232756) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0579, code lost:
    
        if (r6 == 1953196132) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x057e, code lost:
    
        if (r6 == 1718909296) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0583, code lost:
    
        if (r6 == 1969517665) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0588, code lost:
    
        if (r6 == 1801812339) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x058d, code lost:
    
        if (r6 != 1768715124) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0592, code lost:
    
        r5 = r43.E();
        r7 = r42.f24857k;
        r34 = r5 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05a0, code lost:
    
        if (r42.f24856i != 1836086884) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05a2, code lost:
    
        new J3.b(0, r34, -9223372036854775807L, r34 + r7, r42.j - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05b4, code lost:
    
        r42.f24858l = null;
        r42.f24855h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05b9, code lost:
    
        r11 = 0;
        r13 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05bf, code lost:
    
        if (r3 != 8) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05c1, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05c4, code lost:
    
        l4.AbstractC1566a.m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05ce, code lost:
    
        if (r42.j > 2147483647L) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05d0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x05d3, code lost:
    
        l4.AbstractC1566a.m(r3);
        r3 = new A4.r((int) r42.j);
        java.lang.System.arraycopy((byte[]) r5.f384c, 0, (byte[]) r3.f384c, 0, 8);
        r42.f24858l = r3;
        r42.f24855h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05d2, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x05c3, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05f2, code lost:
    
        r5 = r43.E();
        r13 = r42.j;
        r3 = r42.f24857k;
        r5 = (r5 + r13) - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05ff, code lost:
    
        if (r13 == r3) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0603, code lost:
    
        if (r42.f24856i != 1835365473) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0605, code lost:
    
        r14.E(8);
        r43.B((byte[]) r14.f384c, 0, 8);
        r4 = y3.AbstractC2209e.f24787a;
        r4 = r14.f382a;
        r13 = 4;
        r14.I(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x061e, code lost:
    
        if (r14.i() == 1751411826) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0620, code lost:
    
        r4 = r4 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0621, code lost:
    
        r14.H(r4);
        r43.n(r14.f382a);
        r43.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0630, code lost:
    
        r12.push(new y3.C2205a(r5, r42.f24856i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0641, code lost:
    
        if (r42.j != r42.f24857k) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0643, code lost:
    
        k(r5);
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0648, code lost:
    
        r11 = 0;
        r42.f24855h = 0;
        r42.f24857k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x062d, code lost:
    
        r13 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0659, code lost:
    
        throw j3.j0.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x04e0, code lost:
    
        if (r13 != 0) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x04e2, code lost:
    
        r13 = r43.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x04e8, code lost:
    
        if (r13 != (-1)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x04ea, code lost:
    
        r3 = (y3.C2205a) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x04f0, code lost:
    
        if (r3 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x04f2, code lost:
    
        r13 = r3.f24774c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x04f6, code lost:
    
        if (r13 == (-1)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04f8, code lost:
    
        r42.j = (r13 - r43.E()) + r42.f24857k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x04a6, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0486  */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r43, c7.C0790j r44) {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C2216l.f(q3.k, c7.j):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0 A[EDGE_INSN: B:69:0x00e0->B:70:0x00e0 BREAK  A[LOOP:1: B:28:0x0077->B:58:0x00db], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    @Override // q3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q3.q g(long r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C2216l.g(long):q3.q");
    }

    @Override // q3.r
    public final long h() {
        return this.f24867u;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f24863q = interfaceC1907l;
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        return AbstractC2214j.j(interfaceC1906k, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        r2 = r11.s(r30 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f2, code lost:
    
        if (r6 != 1684108385) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
    
        r3 = r13;
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
    
        r11.I(r30 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0202, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0206, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0209, code lost:
    
        if (r3 != (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0221, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0222, code lost:
    
        r11.H(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020c, code lost:
    
        r11.H(r3);
        r11.I(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021e, code lost:
    
        r3 = new I3.k(r0, r2, r11.s(r12 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0227, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a5, code lost:
    
        l4.AbstractC1566a.s("MetadataUtil", "Skipped unknown metadata entry: " + Q0.b.d(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b8, code lost:
    
        r11.H(r5);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00ce, code lost:
    
        r2 = y3.AbstractC2214j.i(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00d2, code lost:
    
        if (r2 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00d6, code lost:
    
        if (r2 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00d8, code lost:
    
        r2 = y3.AbstractC2214j.f24841a[r2 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00e0, code lost:
    
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00e2, code lost:
    
        r3 = new I3.n("TCON", null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00e9, code lost:
    
        l4.AbstractC1566a.P("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00ef, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00df, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0105, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e0, code lost:
    
        r11.H(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00c4, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x022c, code lost:
    
        r2 = 16777215 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0233, code lost:
    
        if (r2 != 6516084) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0235, code lost:
    
        r3 = y3.AbstractC2214j.b(r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x023d, code lost:
    
        if (r2 == 7233901) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0242, code lost:
    
        if (r2 != 7631467) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0249, code lost:
    
        if (r2 == 6516589) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x024e, code lost:
    
        if (r2 != 7828084) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0255, code lost:
    
        if (r2 != 6578553) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0257, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0261, code lost:
    
        if (r2 != 4280916) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0263, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x026d, code lost:
    
        if (r2 != 7630703) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x026f, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0279, code lost:
    
        if (r2 != 6384738) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x027b, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0285, code lost:
    
        if (r2 != 7108978) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0287, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0291, code lost:
    
        if (r2 != 6776174) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0293, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x029b, code lost:
    
        if (r2 != 6779504) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x029d, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02bd, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02c5, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02e4, code lost:
    
        r27 = r3;
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02ed, code lost:
    
        if (r4.isEmpty() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02f3, code lost:
    
        r20 = new D3.c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r11.H(r0);
        r0 = r0 + r4;
        r11.I(r3);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r5 = r11.f382a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r5 >= r0) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r5 = r11.i() + r5;
        r27 = r3;
        r3 = r11.i();
        r2 = (r3 >> 24) & 255;
        r29 = r6;
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r2 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
    
        if (r2 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        if (r3 != 1735291493) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
    
        if (r3 != 1684632427) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        r3 = y3.AbstractC2214j.d(r3, r11, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        r11.H(r5);
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02cd, code lost:
    
        if (r3 == null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02cf, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02d2, code lost:
    
        r0 = r20;
        r3 = r27;
        r7 = r32;
        r6 = 1;
        r25 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
    
        if (r3 != 1953655662) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        r3 = y3.AbstractC2214j.d(r3, r11, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0117, code lost:
    
        if (r3 != 1953329263) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:
    
        r3 = y3.AbstractC2214j.h(r3, "TBPM", r11, r29, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        if (r3 != 1668311404) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:
    
        r3 = y3.AbstractC2214j.h(r3, "TCMP", r11, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0133, code lost:
    
        if (r3 != 1668249202) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
    
        r3 = y3.AbstractC2214j.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013d, code lost:
    
        if (r3 != 1631670868) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013f, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0149, code lost:
    
        if (r3 != 1936682605) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0155, code lost:
    
        if (r3 != 1936679276) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0157, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r3 != 1936679282) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0163, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
    
        if (r3 != 1936679265) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017a, code lost:
    
        if (r3 != 1936679791) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0187, code lost:
    
        if (r3 != 1920233063) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0189, code lost:
    
        r3 = y3.AbstractC2214j.h(r3, "ITUNESADVISORY", r11, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0195, code lost:
    
        if (r3 != 1885823344) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0197, code lost:
    
        r3 = y3.AbstractC2214j.h(r3, "ITUNESGAPLESS", r11, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a4, code lost:
    
        if (r3 != 1936683886) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a6, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b1, code lost:
    
        if (r3 != 1953919848) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b3, code lost:
    
        r3 = y3.AbstractC2214j.g(r3, r11, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01be, code lost:
    
        if (r3 != 757935405) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c0, code lost:
    
        r0 = null;
        r2 = null;
        r3 = -1;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c4, code lost:
    
        r13 = r11.f382a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c6, code lost:
    
        if (r13 >= r5) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c8, code lost:
    
        r30 = r11.i();
        r6 = r11.i();
        r32 = r7;
        r11.I(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
    
        if (r6 != 1835360622) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        r0 = r11.s(r30 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fc, code lost:
    
        r7 = r32;
        r25 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e6, code lost:
    
        if (r6 != 1851878757) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0606 A[EDGE_INSN: B:300:0x0606->B:301:0x0606 BREAK  A[LOOP:10: B:290:0x05c4->B:298:0x05ff], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x061b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0653 A[LOOP:12: B:331:0x0650->B:333:0x0653, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0674  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r35) {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C2216l.k(long):void");
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
