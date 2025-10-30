package x8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import x.AbstractC2154i;
import x.C2149d;
import x.C2150e;
import x.C2153h;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24655a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24656b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24657c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24658d;

    /* renamed from: e, reason: collision with root package name */
    public Object f24659e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f24660f;

    /* renamed from: g, reason: collision with root package name */
    public Object f24661g;

    /* renamed from: h, reason: collision with root package name */
    public Object f24662h;

    /* renamed from: i, reason: collision with root package name */
    public Object f24663i;

    public /* synthetic */ m() {
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [y.j, java.lang.Object] */
    public void a(y.e eVar, int i9, ArrayList arrayList, y.j jVar) {
        y.l lVar = eVar.f24707d;
        if (lVar.f24723c == null) {
            C2150e c2150e = (C2150e) this.f24658d;
            if (lVar != c2150e.f24375d) {
                y.j jVar2 = jVar;
                if (lVar != c2150e.f24376e) {
                    if (jVar == null) {
                        ?? obj = new Object();
                        obj.f24717a = null;
                        obj.f24718b = new ArrayList();
                        obj.f24717a = lVar;
                        arrayList.add(obj);
                        jVar2 = obj;
                    }
                    lVar.f24723c = jVar2;
                    jVar2.f24718b.add(lVar);
                    y.e eVar2 = lVar.f24728h;
                    ArrayList arrayList2 = eVar2.f24713k;
                    int size = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        y.d dVar = (y.d) obj2;
                        if (dVar instanceof y.e) {
                            a((y.e) dVar, i9, arrayList, jVar2);
                        }
                    }
                    y.e eVar3 = lVar.f24729i;
                    ArrayList arrayList3 = eVar3.f24713k;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        y.d dVar2 = (y.d) obj3;
                        if (dVar2 instanceof y.e) {
                            a((y.e) dVar2, i9, arrayList, jVar2);
                        }
                    }
                    if (i9 == 1 && (lVar instanceof y.k)) {
                        ArrayList arrayList4 = ((y.k) lVar).f24719k.f24713k;
                        int size3 = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj4 = arrayList4.get(i13);
                            i13++;
                            y.d dVar3 = (y.d) obj4;
                            if (dVar3 instanceof y.e) {
                                a((y.e) dVar3, i9, arrayList, jVar2);
                            }
                        }
                    }
                    ArrayList arrayList5 = eVar2.f24714l;
                    int size4 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        a((y.e) obj5, i9, arrayList, jVar2);
                    }
                    ArrayList arrayList6 = eVar3.f24714l;
                    int size5 = arrayList6.size();
                    int i15 = 0;
                    while (i15 < size5) {
                        Object obj6 = arrayList6.get(i15);
                        i15++;
                        a((y.e) obj6, i9, arrayList, jVar2);
                    }
                    if (i9 == 1 && (lVar instanceof y.k)) {
                        ArrayList arrayList7 = ((y.k) lVar).f24719k.f24714l;
                        int size6 = arrayList7.size();
                        while (i10 < size6) {
                            Object obj7 = arrayList7.get(i10);
                            i10++;
                            a((y.e) obj7, i9, arrayList, jVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0213, code lost:
    
        if (r6 != 4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0217, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0218, code lost:
    
        r8 = 1;
        r13 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021b, code lost:
    
        f(r7, r11.l(), 1, (int) ((r28.i() * r8) + 0.5f), r11);
        r5.f24725e.d(r11.l());
        r1.f24725e.d(r11.i());
        r11.f24369a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0245, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024c, code lost:
    
        if (r13[2].f24341d == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0254, code lost:
    
        if (r13[3].f24341d != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0256, code lost:
    
        f(2, 0, r9, 0, r11);
        r5.f24725e.d(r11.l());
        r1.f24725e.d(r11.i());
        r11.f24369a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0276, code lost:
    
        r25 = r7;
        r14 = 1;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00d4, code lost:
    
        if (r12 != 3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00d7, code lost:
    
        if (r9 != 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00d9, code lost:
    
        r1 = r7;
        f(2, 0, 2, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00e6, code lost:
    
        r10 = r11.i();
        f(1, (int) ((r10 * r11.f24355L) + 0.5f), 1, r10, r11);
        r5.f24725e.d(r11.l());
        r1.f24725e.d(r11.i());
        r11.f24369a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00e5, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0117, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x011c, code lost:
    
        if (r12 != 1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x011e, code lost:
    
        f(2, 0, r9, 0, r11);
        r5.f24725e.f24715m = r11.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0131, code lost:
    
        if (r12 != 2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0133, code lost:
    
        r7 = r10[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0135, code lost:
    
        if (r7 == 1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0138, code lost:
    
        if (r7 != 4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x013b, code lost:
    
        r7 = 2;
        r14 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x013f, code lost:
    
        f(1, (int) ((r7 * r28.l()) + 0.5f), r9, r11.i(), r11);
        r5.f24725e.d(r11.l());
        r1.f24725e.d(r11.i());
        r11.f24369a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x016f, code lost:
    
        if (r13[r16].f24341d == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0175, code lost:
    
        if (r13[1].f24341d != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0177, code lost:
    
        f(2, 0, r9, 0, r11);
        r5.f24725e.d(r11.l());
        r1.f24725e.d(r11.i());
        r11.f24369a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0197, code lost:
    
        r7 = r1;
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00b9, code lost:
    
        if (r9 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:
    
        if (r6 == 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        r10 = r28.f24374c0;
        r13 = r11.f24350F;
        r14 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        if (r6 != 3) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        if (r9 == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cd, code lost:
    
        if (r9 != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        r1 = r7;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019c, code lost:
    
        if (r9 != r14) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019e, code lost:
    
        if (r6 == r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a1, code lost:
    
        if (r6 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a4, code lost:
    
        r13 = r14;
        r25 = 2;
        r14 = 1;
        r7 = r6;
        r6 = r8;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x027b, code lost:
    
        if (r7 != r13) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x027d, code lost:
    
        if (r9 != r13) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027f, code lost:
    
        if (r12 == r8) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0281, code lost:
    
        if (r3 != r8) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0285, code lost:
    
        if (r3 != 2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0287, code lost:
    
        if (r12 != 2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0289, code lost:
    
        r3 = r10[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x028b, code lost:
    
        if (r3 == r14) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x028d, code lost:
    
        if (r3 != r14) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028f, code lost:
    
        r3 = r10[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0291, code lost:
    
        if (r3 == r14) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0293, code lost:
    
        if (r3 != r14) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0295, code lost:
    
        f(r14, (int) ((r7 * r28.l()) + 0.5f), r14, (int) ((r28.i() * r6) + 0.5f), r11);
        r5.f24725e.d(r11.l());
        r1.f24725e.d(r11.i());
        r11.f24369a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c6, code lost:
    
        f(r25, 0, r25, 0, r11);
        r5.f24725e.f24715m = r11.l();
        r1.f24725e.f24715m = r11.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ad, code lost:
    
        if (r3 != r14) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b0, code lost:
    
        if (r6 != 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b2, code lost:
    
        f(2, 0, 2, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        r8 = r11.l();
        r3 = r11.f24355L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c3, code lost:
    
        if (r11.f24356M != (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c5, code lost:
    
        r3 = 1.0f / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c7, code lost:
    
        f(1, r8, 1, (int) ((r8 * r3) + 0.5f), r11);
        r5.f24725e.d(r11.l());
        r1.f24725e.d(r11.i());
        r11.f24369a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
    
        r14 = 1;
        r25 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f2, code lost:
    
        if (r3 != 1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f4, code lost:
    
        f(r6, 0, 2, 0, r11);
        r1.f24725e.f24715m = r11.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0208, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020c, code lost:
    
        if (r3 != 2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020e, code lost:
    
        r6 = r10[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0210, code lost:
    
        if (r6 == 1) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(x.C2150e r28) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.m.b(x.e):void");
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f24660f;
        arrayList.clear();
        C2150e c2150e = (C2150e) this.f24659e;
        c2150e.f24375d.f();
        y.k kVar = c2150e.f24376e;
        kVar.f();
        arrayList.add(c2150e.f24375d);
        arrayList.add(kVar);
        ArrayList arrayList2 = c2150e.f24397d0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            C2149d c2149d = (C2149d) obj;
            if (c2149d instanceof C2153h) {
                y.l lVar = new y.l(c2149d);
                c2149d.f24375d.f();
                c2149d.f24376e.f();
                lVar.f24726f = ((C2153h) c2149d).f24467h0;
                arrayList.add(lVar);
            } else {
                if (c2149d.q()) {
                    if (c2149d.f24371b == null) {
                        c2149d.f24371b = new y.c(c2149d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2149d.f24371b);
                } else {
                    arrayList.add(c2149d.f24375d);
                }
                if (c2149d.r()) {
                    if (c2149d.f24373c == null) {
                        c2149d.f24373c = new y.c(c2149d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2149d.f24373c);
                } else {
                    arrayList.add(c2149d.f24376e);
                }
                if (c2149d instanceof AbstractC2154i) {
                    arrayList.add(new y.l(c2149d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((y.l) obj2).f();
        }
        int size3 = arrayList.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            y.l lVar2 = (y.l) obj3;
            if (lVar2.f24722b != c2150e) {
                lVar2.d();
            }
        }
        ArrayList arrayList3 = (ArrayList) this.f24663i;
        arrayList3.clear();
        C2150e c2150e2 = (C2150e) this.f24658d;
        e(c2150e2.f24375d, 0, arrayList3);
        e(c2150e2.f24376e, 1, arrayList3);
        this.f24656b = false;
    }

    public int d(C2150e c2150e, int i9) {
        y.l lVar;
        y.l lVar2;
        ArrayList arrayList;
        int i10;
        int i11;
        long j;
        float f9;
        long j4;
        C2150e c2150e2 = c2150e;
        ArrayList arrayList2 = (ArrayList) this.f24663i;
        int size = arrayList2.size();
        int i12 = 0;
        long j9 = 0;
        while (i12 < size) {
            y.l lVar3 = ((y.j) arrayList2.get(i12)).f24717a;
            if (!(lVar3 instanceof y.c) ? !(i9 != 0 ? (lVar3 instanceof y.k) : (lVar3 instanceof y.i)) : ((y.c) lVar3).f24726f != i9) {
                arrayList = arrayList2;
                i10 = size;
                i11 = i12;
                j = 0;
            } else {
                if (i9 == 0) {
                    lVar = c2150e2.f24375d;
                } else {
                    lVar = c2150e2.f24376e;
                }
                y.e eVar = lVar.f24728h;
                if (i9 == 0) {
                    lVar2 = c2150e2.f24375d;
                } else {
                    lVar2 = c2150e2.f24376e;
                }
                y.e eVar2 = lVar2.f24729i;
                boolean contains = lVar3.f24728h.f24714l.contains(eVar);
                y.e eVar3 = lVar3.f24729i;
                boolean contains2 = eVar3.f24714l.contains(eVar2);
                long j10 = lVar3.j();
                y.e eVar4 = lVar3.f24728h;
                if (contains && contains2) {
                    long b9 = y.j.b(eVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i10 = size;
                    long a5 = y.j.a(eVar3, 0L);
                    long j11 = b9 - j10;
                    int i13 = eVar3.f24709f;
                    arrayList = arrayList3;
                    i11 = i12;
                    if (j11 >= (-i13)) {
                        j11 += i13;
                    }
                    long j12 = (-a5) - j10;
                    long j13 = eVar4.f24709f;
                    long j14 = j12 - j13;
                    if (j14 >= j13) {
                        j14 -= j13;
                    }
                    C2149d c2149d = lVar3.f24722b;
                    if (i9 == 0) {
                        f9 = c2149d.f24362S;
                    } else if (i9 == 1) {
                        f9 = c2149d.f24363T;
                    } else {
                        c2149d.getClass();
                        f9 = -1.0f;
                    }
                    if (f9 > 0.0f) {
                        j4 = (((float) j11) / (1.0f - f9)) + (((float) j14) / f9);
                    } else {
                        j4 = 0;
                    }
                    float f10 = (float) j4;
                    j = (eVar4.f24709f + ((((f10 * f9) + 0.5f) + j10) + u0.z.b(1.0f, f9, f10, 0.5f))) - eVar3.f24709f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i12;
                    if (contains) {
                        j = Math.max(y.j.b(eVar4, eVar4.f24709f), eVar4.f24709f + j10);
                    } else if (contains2) {
                        j = Math.max(-y.j.a(eVar3, eVar3.f24709f), (-eVar3.f24709f) + j10);
                    } else {
                        j = (lVar3.j() + eVar4.f24709f) - eVar3.f24709f;
                    }
                }
            }
            j9 = Math.max(j9, j);
            i12 = i11 + 1;
            c2150e2 = c2150e;
            size = i10;
            arrayList2 = arrayList;
        }
        return (int) j9;
    }

    public void e(y.l lVar, int i9, ArrayList arrayList) {
        y.e eVar;
        ArrayList arrayList2 = lVar.f24728h.f24713k;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            eVar = lVar.f24729i;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList2.get(i11);
            i11++;
            y.d dVar = (y.d) obj;
            if (dVar instanceof y.e) {
                a((y.e) dVar, i9, arrayList, null);
            } else if (dVar instanceof y.l) {
                a(((y.l) dVar).f24728h, i9, arrayList, null);
            }
        }
        ArrayList arrayList3 = eVar.f24713k;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            y.d dVar2 = (y.d) obj2;
            if (dVar2 instanceof y.e) {
                a((y.e) dVar2, i9, arrayList, null);
            } else if (dVar2 instanceof y.l) {
                a(((y.l) dVar2).f24729i, i9, arrayList, null);
            }
        }
        if (i9 == 1) {
            ArrayList arrayList4 = ((y.k) lVar).f24719k.f24713k;
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj3 = arrayList4.get(i10);
                i10++;
                y.d dVar3 = (y.d) obj3;
                if (dVar3 instanceof y.e) {
                    a((y.e) dVar3, i9, arrayList, null);
                }
            }
        }
    }

    public void f(int i9, int i10, int i11, int i12, C2149d c2149d) {
        boolean z9;
        y.b bVar = (y.b) this.f24662h;
        bVar.f24693a = i9;
        bVar.f24694b = i11;
        bVar.f24695c = i10;
        bVar.f24696d = i12;
        ((l3.I) this.f24661g).a(c2149d, bVar);
        c2149d.y(bVar.f24697e);
        c2149d.v(bVar.f24698f);
        c2149d.f24393w = bVar.f24700h;
        int i13 = bVar.f24699g;
        c2149d.f24359P = i13;
        if (i13 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        c2149d.f24393w = z9;
    }

    public void g() {
        char c3;
        char c9;
        y.a aVar;
        m mVar = this;
        ArrayList arrayList = ((C2150e) mVar.f24658d).f24397d0;
        int size = arrayList.size();
        char c10 = 0;
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            C2149d c2149d = (C2149d) arrayList.get(i9);
            if (!c2149d.f24369a) {
                int[] iArr = c2149d.f24374c0;
                int i11 = iArr[c10];
                int i12 = iArr[1];
                int i13 = c2149d.j;
                int i14 = c2149d.f24381k;
                if (i11 != 2 && (i11 != 3 || i13 != 1)) {
                    c3 = c10;
                } else {
                    c3 = 1;
                }
                if (i12 != 2 && (i12 != 3 || i14 != 1)) {
                    c9 = c10;
                } else {
                    c9 = 1;
                }
                y.i iVar = c2149d.f24375d;
                y.f fVar = iVar.f24725e;
                boolean z9 = fVar.j;
                y.k kVar = c2149d.f24376e;
                y.f fVar2 = kVar.f24725e;
                boolean z10 = fVar2.j;
                char c11 = c3;
                if (z9 && z10) {
                    mVar.f(1, fVar.f24710g, 1, fVar2.f24710g, c2149d);
                    c2149d.f24369a = true;
                } else if (z9 && c9 != 0) {
                    f(1, fVar.f24710g, 2, fVar2.f24710g, c2149d);
                    if (i12 == 3) {
                        kVar.f24725e.f24715m = c2149d.i();
                    } else {
                        kVar.f24725e.d(c2149d.i());
                        c2149d.f24369a = true;
                    }
                } else if (z10 && c11 != 0) {
                    f(2, fVar.f24710g, 1, fVar2.f24710g, c2149d);
                    if (i11 == 3) {
                        iVar.f24725e.f24715m = c2149d.l();
                    } else {
                        iVar.f24725e.d(c2149d.l());
                        c2149d.f24369a = true;
                    }
                }
                if (c2149d.f24369a && (aVar = kVar.f24720l) != null) {
                    aVar.d(c2149d.f24359P);
                }
                c10 = 0;
                mVar = this;
            }
            i9 = i10;
        }
    }

    public String toString() {
        switch (this.f24655a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                if (this.f24656b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f24657c) {
                    arrayList.add("isDirectory");
                }
                Long l9 = (Long) this.f24659e;
                if (l9 != null) {
                    arrayList.add("byteCount=" + l9);
                }
                Long l10 = (Long) this.f24660f;
                if (l10 != null) {
                    arrayList.add("createdAt=" + l10);
                }
                Long l11 = (Long) this.f24661g;
                if (l11 != null) {
                    arrayList.add("lastModifiedAt=" + l11);
                }
                Long l12 = (Long) this.f24662h;
                if (l12 != null) {
                    arrayList.add("lastAccessedAt=" + l12);
                }
                Map map = (Map) this.f24663i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return B7.k.u0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public m(boolean z9, boolean z10, y yVar, Long l9, Long l10, Long l11, Long l12, Map extras) {
        kotlin.jvm.internal.h.e(extras, "extras");
        this.f24656b = z9;
        this.f24657c = z10;
        this.f24658d = yVar;
        this.f24659e = l9;
        this.f24660f = l10;
        this.f24661g = l11;
        this.f24662h = l12;
        this.f24663i = B7.y.H(extras);
    }

    public /* synthetic */ m(boolean z9, boolean z10, y yVar, Long l9, Long l10, Long l11, Long l12) {
        this(z9, z10, yVar, l9, l10, l11, l12, B7.u.f1136a);
    }
}
