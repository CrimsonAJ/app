package u0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.j0;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0713L;
import b8.C0718Q;
import com.google.android.gms.internal.measurement.Y1;
import g2.C1201C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import x0.C2156a;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f23391A;

    /* renamed from: B, reason: collision with root package name */
    public final A7.l f23392B;

    /* renamed from: C, reason: collision with root package name */
    public final C0713L f23393C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23394a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f23395b;

    /* renamed from: c, reason: collision with root package name */
    public F f23396c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f23397d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f23398e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23399f;

    /* renamed from: g, reason: collision with root package name */
    public final B7.i f23400g;

    /* renamed from: h, reason: collision with root package name */
    public final C0718Q f23401h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f23402i;
    public final LinkedHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f23403k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f23404l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f23405m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0561w f23406n;

    /* renamed from: o, reason: collision with root package name */
    public C2049u f23407o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f23408p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC0555p f23409q;

    /* renamed from: r, reason: collision with root package name */
    public final N0.c f23410r;

    /* renamed from: s, reason: collision with root package name */
    public final C1201C f23411s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f23412t;

    /* renamed from: u, reason: collision with root package name */
    public final W f23413u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f23414v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.i f23415w;

    /* renamed from: x, reason: collision with root package name */
    public C2045p f23416x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f23417y;

    /* renamed from: z, reason: collision with root package name */
    public int f23418z;

    public H(Context context) {
        Object obj;
        this.f23394a = context;
        Iterator it = V7.l.g0(context, C2032c.f23471f).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f23395b = (Activity) obj;
        this.f23400g = new B7.i();
        B7.t tVar = B7.t.f1135a;
        this.f23401h = AbstractC0714M.c(tVar);
        this.f23402i = AbstractC0714M.c(tVar);
        this.j = new LinkedHashMap();
        this.f23403k = new LinkedHashMap();
        this.f23404l = new LinkedHashMap();
        this.f23405m = new LinkedHashMap();
        this.f23408p = new CopyOnWriteArrayList();
        this.f23409q = EnumC0555p.f9894b;
        this.f23410r = new N0.c(1, this);
        this.f23411s = new C1201C(2, this);
        this.f23412t = true;
        W w7 = new W();
        this.f23413u = w7;
        this.f23414v = new LinkedHashMap();
        this.f23417y = new LinkedHashMap();
        w7.a(new G(w7));
        w7.a(new C2033d(this.f23394a));
        this.f23391A = new ArrayList();
        this.f23392B = Z0.a.q(new e2.e(27, this));
        this.f23393C = AbstractC0714M.b(2);
    }

    public static C d(C c3, int i9, boolean z9, C c9) {
        F f9;
        if (c3.f23381h == i9 && (c9 == null || (c3.equals(c9) && kotlin.jvm.internal.h.a(c3.f23375b, c9.f23375b)))) {
            return c3;
        }
        if (c3 instanceof F) {
            f9 = (F) c3;
        } else {
            f9 = c3.f23375b;
            kotlin.jvm.internal.h.b(f9);
        }
        return f9.g(i9, f9, z9, c9);
    }

    public static /* synthetic */ void q(H h7, C2042m c2042m) {
        h7.p(c2042m, false, new B7.i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017a, code lost:
    
        r5 = r4.previous();
        r7 = ((u0.C2042m) r5).f23496b;
        r8 = r16.f23396c;
        kotlin.jvm.internal.h.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018c, code lost:
    
        if (kotlin.jvm.internal.h.a(r7, r8) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x018e, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018f, code lost:
    
        r12 = (u0.C2042m) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0191, code lost:
    
        if (r12 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0193, code lost:
    
        r4 = r16.f23396c;
        kotlin.jvm.internal.h.b(r4);
        r5 = r16.f23396c;
        kotlin.jvm.internal.h.b(r5);
        r12 = d0.o.e(r11, r4, r5.b(r18), h(), r16.f23407o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ab, code lost:
    
        r6.addFirst(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ae, code lost:
    
        r2 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b6, code lost:
    
        if (r2.hasNext() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b8, code lost:
    
        r4 = (u0.C2042m) r2.next();
        r5 = r16.f23414v.get(r16.f23413u.b(r4.f23496b.f23374a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ce, code lost:
    
        if (r5 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d0, code lost:
    
        ((u0.C2044o) r5).a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ee, code lost:
    
        throw new java.lang.IllegalStateException(com.google.android.gms.internal.measurement.AbstractC0953k1.q(new java.lang.StringBuilder("NavigatorBackStack for "), r17.f23374a, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ef, code lost:
    
        r9.addAll(r6);
        r9.addLast(r19);
        r1 = B7.k.z0(r6, r19);
        r2 = r1.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01fe, code lost:
    
        if (r7 >= r2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0200, code lost:
    
        r3 = r1.get(r7);
        r7 = r7 + 1;
        r3 = (u0.C2042m) r3;
        r4 = r3.f23496b.f23375b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x020c, code lost:
    
        if (r4 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x020e, code lost:
    
        i(r3, e(r4.f23381h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0218, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0163, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0144, code lost:
    
        r5 = r9.f1130b[r9.f1129a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x009f, code lost:
    
        r10 = ((u0.C2042m) r6.first()).f23496b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r6 = new B7.i();
        r10 = r17 instanceof u0.F;
        r11 = r16.f23394a;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r10 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        kotlin.jvm.internal.h.b(r10);
        r10 = r10.f23375b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r13 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r13.hasPrevious() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r14 = r13.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (kotlin.jvm.internal.h.a(((u0.C2042m) r14).f23496b, r10) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r14 = (u0.C2042m) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r14 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r14 = d0.o.e(r11, r10, r18, h(), r16.f23407o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r6.addFirst(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r9.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0012, code lost:
    
        if (r6 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (((u0.C2042m) r9.last()).f23496b != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        q(r16, (u0.C2042m) r9.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r10 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r10 != r17) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r6.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        if (r10 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        if (c(r10.f23381h, r10) == r10) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        r10 = r10.f23375b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        if (r10 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r18 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r9.isEmpty() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        if (r18.isEmpty() != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r14 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        if (r14.hasPrevious() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
    
        r15 = r14.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (kotlin.jvm.internal.h.a(((u0.C2042m) r15).f23496b, r10) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
    
        r15 = (u0.C2042m) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        if (r15 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
    
        r15 = d0.o.e(r11, r10, r10.b(r13), h(), r16.f23407o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f3, code lost:
    
        r6.addFirst(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
    
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((((u0.C2042m) r9.last()).f23496b instanceof u0.InterfaceC2034e) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fc, code lost:
    
        if (r6.isEmpty() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ff, code lost:
    
        r5 = ((u0.C2042m) r6.first()).f23496b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        if (r9.isEmpty() != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        if ((((u0.C2042m) r9.last()).f23496b instanceof u0.F) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0119, code lost:
    
        r7 = ((u0.C2042m) r9.last()).f23496b;
        kotlin.jvm.internal.h.c(r7, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0130, code lost:
    
        if (((u0.F) r7).f23387k.e(r5.f23381h) != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        q(r16, (u0.C2042m) r9.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        if (r9.isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r5 = (u0.C2042m) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014c, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0152, code lost:
    
        if (r6.isEmpty() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (o(((u0.C2042m) r9.last()).f23496b.f23381h, true, false) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0154, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015c, code lost:
    
        r5 = (u0.C2042m) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0156, code lost:
    
        r5 = r6.f1130b[r6.f1129a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015e, code lost:
    
        if (r5 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0160, code lost:
    
        r5 = r5.f23496b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016a, code lost:
    
        if (kotlin.jvm.internal.h.a(r5, r16.f23396c) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016c, code lost:
    
        r4 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0178, code lost:
    
        if (r4.hasPrevious() == false) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(u0.C r17, android.os.Bundle r18, u0.C2042m r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.H.a(u0.C, android.os.Bundle, u0.m, java.util.List):void");
    }

    public final boolean b() {
        B7.i iVar;
        while (true) {
            iVar = this.f23400g;
            if (iVar.isEmpty() || !(((C2042m) iVar.last()).f23496b instanceof F)) {
                break;
            }
            q(this, (C2042m) iVar.last());
        }
        C2042m c2042m = (C2042m) iVar.g();
        ArrayList arrayList = this.f23391A;
        if (c2042m != null) {
            arrayList.add(c2042m);
        }
        this.f23418z++;
        v();
        int i9 = this.f23418z - 1;
        this.f23418z = i9;
        if (i9 == 0) {
            ArrayList I02 = B7.k.I0(arrayList);
            arrayList.clear();
            int size = I02.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = I02.get(i10);
                i10++;
                C2042m c2042m2 = (C2042m) obj;
                Iterator it = this.f23408p.iterator();
                while (it.hasNext()) {
                    C2156a c2156a = (C2156a) it.next();
                    C c3 = c2042m2.f23496b;
                    c2042m2.a();
                    c2156a.a(this, c3);
                }
                this.f23393C.d(c2042m2);
            }
            ArrayList I03 = B7.k.I0(iVar);
            C0718Q c0718q = this.f23401h;
            c0718q.getClass();
            c0718q.j(null, I03);
            ArrayList r5 = r();
            C0718Q c0718q2 = this.f23402i;
            c0718q2.getClass();
            c0718q2.j(null, r5);
        }
        if (c2042m != null) {
            return true;
        }
        return false;
    }

    public final C c(int i9, C c3) {
        C c9;
        F f9 = this.f23396c;
        if (f9 == null) {
            return null;
        }
        if (f9.f23381h == i9) {
            if (c3 != null) {
                if (kotlin.jvm.internal.h.a(f9, c3) && c3.f23375b == null) {
                    return this.f23396c;
                }
            } else {
                return f9;
            }
        }
        C2042m c2042m = (C2042m) this.f23400g.g();
        if (c2042m == null || (c9 = c2042m.f23496b) == null) {
            c9 = this.f23396c;
            kotlin.jvm.internal.h.b(c9);
        }
        return d(c9, i9, false, c3);
    }

    public final C2042m e(int i9) {
        Object obj;
        B7.i iVar = this.f23400g;
        ListIterator<E> listIterator = iVar.listIterator(iVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((C2042m) obj).f23496b.f23381h == i9) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C2042m c2042m = (C2042m) obj;
        if (c2042m != null) {
            return c2042m;
        }
        StringBuilder p9 = A0.a.p("No destination with ID ", i9, " is on the NavController's back stack. The current destination is ");
        p9.append(f());
        throw new IllegalArgumentException(p9.toString().toString());
    }

    public final C f() {
        C2042m c2042m = (C2042m) this.f23400g.g();
        if (c2042m != null) {
            return c2042m.f23496b;
        }
        return null;
    }

    public final F g() {
        F f9 = this.f23396c;
        if (f9 != null) {
            kotlin.jvm.internal.h.c(f9, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return f9;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final EnumC0555p h() {
        if (this.f23406n == null) {
            return EnumC0555p.f9895c;
        }
        return this.f23409q;
    }

    public final void i(C2042m c2042m, C2042m c2042m2) {
        this.j.put(c2042m, c2042m2);
        LinkedHashMap linkedHashMap = this.f23403k;
        if (linkedHashMap.get(c2042m2) == null) {
            linkedHashMap.put(c2042m2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c2042m2);
        kotlin.jvm.internal.h.b(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r7, android.os.Bundle r8, u0.J r9) {
        /*
            r6 = this;
            B7.i r0 = r6.f23400g
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            u0.F r0 = r6.f23396c
            goto L13
        Lb:
            java.lang.Object r0 = r0.last()
            u0.m r0 = (u0.C2042m) r0
            u0.C r0 = r0.f23496b
        L13:
            if (r0 == 0) goto Lae
            u0.f r1 = r0.c(r7)
            r2 = 0
            if (r1 == 0) goto L31
            if (r9 != 0) goto L20
            u0.J r9 = r1.f23482b
        L20:
            android.os.Bundle r3 = r1.f23483c
            int r4 = r1.f23481a
            if (r3 == 0) goto L2f
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putAll(r3)
            goto L33
        L2f:
            r5 = r2
            goto L33
        L31:
            r4 = r7
            goto L2f
        L33:
            if (r8 == 0) goto L3f
            if (r5 != 0) goto L3c
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L3c:
            r5.putAll(r8)
        L3f:
            if (r4 != 0) goto L51
            if (r9 == 0) goto L51
            r8 = -1
            int r3 = r9.f23424c
            if (r3 != r8) goto L49
            goto L51
        L49:
            if (r3 == r8) goto L50
            boolean r7 = r9.f23425d
            r6.n(r3, r7)
        L50:
            return
        L51:
            if (r4 == 0) goto La6
            u0.C r8 = r6.c(r4, r2)
            if (r8 != 0) goto La2
            int r8 = u0.C.j
            android.content.Context r8 = r6.f23394a
            java.lang.String r9 = com.google.android.gms.internal.measurement.Y1.o(r8, r4)
            java.lang.String r2 = " cannot be found from the current destination "
            if (r1 != 0) goto L7f
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Navigation action/destination "
            r8.<init>(r1)
            r8.append(r9)
            r8.append(r2)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L7f:
            java.lang.String r1 = "Navigation destination "
            java.lang.String r3 = " referenced from action "
            java.lang.StringBuilder r9 = com.google.android.gms.internal.measurement.AbstractC0953k1.r(r1, r9, r3)
            java.lang.String r7 = com.google.android.gms.internal.measurement.Y1.o(r8, r7)
            r9.append(r7)
            r9.append(r2)
            r9.append(r0)
            java.lang.String r7 = r9.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La2:
            r6.k(r8, r5, r9)
            return
        La6:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            r7.<init>(r8)
            throw r7
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "No current destination found. Ensure a navigation graph has been set for NavController "
            r8.<init>(r9)
            r8.append(r6)
            r9 = 46
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.H.j(int, android.os.Bundle, u0.J):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if (r14.equals(r5) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        r5 = new B7.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        if (B7.l.a0(r11) < r13) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        r12 = (u0.C2042m) B7.q.k0(r11);
        u(r12);
        r14 = new u0.C2042m(r12.f23495a, r12.f23496b, r12.f23496b.b(r25), r12.f23498d, r12.f23499e, r12.f23500f, r12.f23501g);
        r14.f23498d = r12.f23498d;
        r14.b(r12.f23505l);
        r5.addFirst(r14);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
    
        r22 = r3;
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0147, code lost:
    
        if (r3.hasNext() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        r6 = (u0.C2042m) r3.next();
        r7 = r6.f23496b.f23375b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        if (r7 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0155, code lost:
    
        i(r6, e(r7.f23381h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015e, code lost:
    
        r11.addLast(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0162, code lost:
    
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016a, code lost:
    
        if (r3.hasNext() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016c, code lost:
    
        r5 = (u0.C2042m) r3.next();
        r10.b(r5.f23496b.f23374a).f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f2, code lost:
    
        if (r24.f23381h == r5.f23381h) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.jvm.internal.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(u0.C r24, android.os.Bundle r25, u0.J r26) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.H.k(u0.C, android.os.Bundle, u0.J):void");
    }

    public final void l(D d9) {
        j(d9.b(), d9.a(), null);
    }

    public final boolean m() {
        if (this.f23400g.isEmpty()) {
            return false;
        }
        C f9 = f();
        kotlin.jvm.internal.h.b(f9);
        return n(f9.f23381h, true);
    }

    public final boolean n(int i9, boolean z9) {
        if (!o(i9, z9, false) || !b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.internal.k] */
    public final boolean o(int i9, boolean z9, boolean z10) {
        C c3;
        boolean z11;
        String str;
        Object obj;
        String str2;
        B7.i iVar = this.f23400g;
        if (iVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = B7.k.A0(iVar).iterator();
        while (true) {
            if (it.hasNext()) {
                C c9 = ((C2042m) it.next()).f23496b;
                V b9 = this.f23413u.b(c9.f23374a);
                if (z9 || c9.f23381h != i9) {
                    arrayList.add(b9);
                }
                if (c9.f23381h == i9) {
                    c3 = c9;
                    break;
                }
            } else {
                c3 = null;
                break;
            }
        }
        if (c3 == null) {
            int i10 = C.j;
            Log.i("NavController", "Ignoring popBackStack to destination " + Y1.o(this.f23394a, i9) + " as it was not found on the current back stack");
            return false;
        }
        ?? obj2 = new Object();
        B7.i iVar2 = new B7.i();
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                int i12 = i11 + 1;
                V v8 = (V) arrayList.get(i11);
                ?? obj3 = new Object();
                C2042m c2042m = (C2042m) iVar.last();
                z11 = z10;
                this.f23416x = new C2045p(obj3, obj2, this, z11, iVar2);
                v8.i(c2042m, z11);
                this.f23416x = null;
                if (!obj3.f20155a) {
                    break;
                }
                i11 = i12;
            } else {
                z11 = z10;
                break;
            }
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f23404l;
            if (!z9) {
                V7.f fVar = new V7.f(new V7.i(V7.l.g0(c3, C2032c.f23472g), new C2046q(this, 0), 1));
                while (fVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((C) fVar.next()).f23381h);
                    if (iVar2.isEmpty()) {
                        obj = null;
                    } else {
                        obj = iVar2.f1130b[iVar2.f1129a];
                    }
                    C2043n c2043n = (C2043n) obj;
                    if (c2043n != null) {
                        str2 = c2043n.f23507a;
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put(valueOf, str2);
                }
            }
            if (!iVar2.isEmpty()) {
                C2043n c2043n2 = (C2043n) iVar2.first();
                V7.f fVar2 = new V7.f(new V7.i(V7.l.g0(c(c2043n2.f23508b, null), C2032c.f23473h), new C2046q(this, 1), 1));
                while (true) {
                    boolean hasNext = fVar2.hasNext();
                    str = c2043n2.f23507a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((C) fVar2.next()).f23381h), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f23405m.put(str, iVar2);
                }
            }
        }
        w();
        return obj2.f20155a;
    }

    public final void p(C2042m c2042m, boolean z9, B7.i iVar) {
        C2049u c2049u;
        C0709H c0709h;
        Set set;
        B7.i iVar2 = this.f23400g;
        C2042m c2042m2 = (C2042m) iVar2.last();
        if (kotlin.jvm.internal.h.a(c2042m2, c2042m)) {
            B7.q.k0(iVar2);
            C2044o c2044o = (C2044o) this.f23414v.get(this.f23413u.b(c2042m2.f23496b.f23374a));
            boolean z10 = true;
            if ((c2044o == null || (c0709h = c2044o.f23516f) == null || (set = (Set) ((C0718Q) c0709h.f11422a).h()) == null || !set.contains(c2042m2)) && !this.f23403k.containsKey(c2042m2)) {
                z10 = false;
            }
            EnumC0555p enumC0555p = c2042m2.f23502h.f9908d;
            EnumC0555p enumC0555p2 = EnumC0555p.f9895c;
            if (enumC0555p.compareTo(enumC0555p2) >= 0) {
                if (z9) {
                    c2042m2.b(enumC0555p2);
                    iVar.addFirst(new C2043n(c2042m2));
                }
                if (!z10) {
                    c2042m2.b(EnumC0555p.f9893a);
                    u(c2042m2);
                } else {
                    c2042m2.b(enumC0555p2);
                }
            }
            if (!z9 && !z10 && (c2049u = this.f23407o) != null) {
                String backStackEntryId = c2042m2.f23500f;
                kotlin.jvm.internal.h.e(backStackEntryId, "backStackEntryId");
                j0 j0Var = (j0) c2049u.f23538d.remove(backStackEntryId);
                if (j0Var != null) {
                    j0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + c2042m.f23496b + ", which is not the top of the back stack (" + c2042m2.f23496b + ')').toString());
    }

    public final ArrayList r() {
        EnumC0555p enumC0555p;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23414v.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0555p = EnumC0555p.f9896d;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C0718Q) ((C2044o) it.next()).f23516f.f11422a).h();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C2042m c2042m = (C2042m) obj;
                if (!arrayList.contains(c2042m) && c2042m.f23505l.compareTo(enumC0555p) < 0) {
                    arrayList2.add(obj);
                }
            }
            B7.q.h0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f23400g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C2042m c2042m2 = (C2042m) next;
            if (!arrayList.contains(c2042m2) && c2042m2.f23505l.compareTo(enumC0555p) >= 0) {
                arrayList3.add(next);
            }
        }
        B7.q.h0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            if (!(((C2042m) obj2).f23496b instanceof F)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.m, java.lang.Object] */
    public final boolean s(int i9, Bundle bundle, J j) {
        C g9;
        String str;
        C2042m c2042m;
        C c3;
        LinkedHashMap linkedHashMap = this.f23404l;
        int i10 = 0;
        if (!linkedHashMap.containsKey(Integer.valueOf(i9))) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i9));
        Collection values = linkedHashMap.values();
        C2048t c2048t = new C2048t(str2, 0);
        kotlin.jvm.internal.h.e(values, "<this>");
        B7.q.i0(values, c2048t, true);
        LinkedHashMap linkedHashMap2 = this.f23405m;
        kotlin.jvm.internal.r.b(linkedHashMap2);
        B7.i iVar = (B7.i) linkedHashMap2.remove(str2);
        ArrayList arrayList = new ArrayList();
        C2042m c2042m2 = (C2042m) this.f23400g.g();
        if (c2042m2 == null || (g9 = c2042m2.f23496b) == null) {
            g9 = g();
        }
        if (iVar != null) {
            Iterator it = iVar.iterator();
            while (it.hasNext()) {
                C2043n c2043n = (C2043n) it.next();
                C d9 = d(g9, c2043n.f23508b, true, null);
                Context context = this.f23394a;
                if (d9 != null) {
                    arrayList.add(c2043n.a(context, d9, h(), this.f23407o));
                    g9 = d9;
                } else {
                    int i11 = C.j;
                    throw new IllegalStateException(("Restore State failed: destination " + Y1.o(context, c2043n.f23508b) + " cannot be found from the current destination " + g9).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (!(((C2042m) obj).f23496b instanceof F)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            C2042m c2042m3 = (C2042m) obj2;
            List list = (List) B7.k.w0(arrayList2);
            if (list != null && (c2042m = (C2042m) B7.k.v0(list)) != null && (c3 = c2042m.f23496b) != null) {
                str = c3.f23374a;
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.h.a(str, c2042m3.f23496b.f23374a)) {
                list.add(c2042m3);
            } else {
                arrayList2.add(B7.l.c0(c2042m3));
            }
        }
        ?? obj3 = new Object();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj4 = arrayList2.get(i10);
            i10++;
            List list2 = (List) obj4;
            V b9 = this.f23413u.b(((C2042m) B7.k.p0(list2)).f23496b.f23374a);
            Bundle bundle2 = bundle;
            this.f23415w = new r(obj3, arrayList, new Object(), this, bundle2);
            b9.d(list2, j);
            this.f23415w = null;
            bundle = bundle2;
        }
        return obj3.f20155a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01fc  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r34v0, types: [u0.H, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(u0.F r35, android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.H.t(u0.F, android.os.Bundle):void");
    }

    public final void u(C2042m child) {
        Integer num;
        kotlin.jvm.internal.h.e(child, "child");
        C2042m c2042m = (C2042m) this.j.remove(child);
        if (c2042m != null) {
            LinkedHashMap linkedHashMap = this.f23403k;
            AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c2042m);
            if (atomicInteger != null) {
                num = Integer.valueOf(atomicInteger.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                C2044o c2044o = (C2044o) this.f23414v.get(this.f23413u.b(c2042m.f23496b.f23374a));
                if (c2044o != null) {
                    c2044o.b(c2042m);
                }
                linkedHashMap.remove(c2042m);
            }
        }
    }

    public final void v() {
        Boolean bool;
        AtomicInteger atomicInteger;
        C0709H c0709h;
        Set set;
        ArrayList I02 = B7.k.I0(this.f23400g);
        if (!I02.isEmpty()) {
            C c3 = ((C2042m) B7.k.v0(I02)).f23496b;
            ArrayList arrayList = new ArrayList();
            if (c3 instanceof InterfaceC2034e) {
                Iterator it = B7.k.A0(I02).iterator();
                while (it.hasNext()) {
                    C c9 = ((C2042m) it.next()).f23496b;
                    arrayList.add(c9);
                    if (!(c9 instanceof InterfaceC2034e) && !(c9 instanceof F)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it2 = B7.k.A0(I02).iterator();
            while (true) {
                int i9 = 0;
                if (it2.hasNext()) {
                    C2042m c2042m = (C2042m) it2.next();
                    EnumC0555p enumC0555p = c2042m.f23505l;
                    C c10 = c2042m.f23496b;
                    EnumC0555p enumC0555p2 = EnumC0555p.f9897e;
                    EnumC0555p enumC0555p3 = EnumC0555p.f9896d;
                    if (c3 != null && c10.f23381h == c3.f23381h) {
                        if (enumC0555p != enumC0555p2) {
                            C2044o c2044o = (C2044o) this.f23414v.get(this.f23413u.b(c10.f23374a));
                            if (c2044o != null && (c0709h = c2044o.f23516f) != null && (set = (Set) ((C0718Q) c0709h.f11422a).h()) != null) {
                                bool = Boolean.valueOf(set.contains(c2042m));
                            } else {
                                bool = null;
                            }
                            if (!kotlin.jvm.internal.h.a(bool, Boolean.TRUE) && ((atomicInteger = (AtomicInteger) this.f23403k.get(c2042m)) == null || atomicInteger.get() != 0)) {
                                hashMap.put(c2042m, enumC0555p2);
                            } else {
                                hashMap.put(c2042m, enumC0555p3);
                            }
                        }
                        C c11 = (C) B7.k.q0(arrayList);
                        if (c11 != null && c11.f23381h == c10.f23381h) {
                            if (!arrayList.isEmpty()) {
                                arrayList.remove(0);
                            } else {
                                throw new NoSuchElementException("List is empty.");
                            }
                        }
                        c3 = c3.f23375b;
                    } else if (!arrayList.isEmpty() && c10.f23381h == ((C) B7.k.p0(arrayList)).f23381h) {
                        if (!arrayList.isEmpty()) {
                            C c12 = (C) arrayList.remove(0);
                            if (enumC0555p == enumC0555p2) {
                                c2042m.b(enumC0555p3);
                            } else if (enumC0555p != enumC0555p3) {
                                hashMap.put(c2042m, enumC0555p3);
                            }
                            F f9 = c12.f23375b;
                            if (f9 != null && !arrayList.contains(f9)) {
                                arrayList.add(f9);
                            }
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    } else {
                        c2042m.b(EnumC0555p.f9895c);
                    }
                } else {
                    int size = I02.size();
                    while (i9 < size) {
                        Object obj = I02.get(i9);
                        i9++;
                        C2042m c2042m2 = (C2042m) obj;
                        EnumC0555p enumC0555p4 = (EnumC0555p) hashMap.get(c2042m2);
                        if (enumC0555p4 != null) {
                            c2042m2.b(enumC0555p4);
                        } else {
                            c2042m2.d();
                        }
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.g, O7.a] */
    public final void w() {
        int i9;
        boolean z9 = false;
        if (this.f23412t) {
            B7.i iVar = this.f23400g;
            if (iVar != null && iVar.isEmpty()) {
                i9 = 0;
            } else {
                Iterator it = iVar.iterator();
                i9 = 0;
                while (it.hasNext()) {
                    if (!(((C2042m) it.next()).f23496b instanceof F) && (i9 = i9 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i9 > 1) {
                z9 = true;
            }
        }
        C1201C c1201c = this.f23411s;
        c1201c.f16606a = z9;
        ?? r0 = c1201c.f16608c;
        if (r0 != 0) {
            r0.invoke();
        }
    }
}
