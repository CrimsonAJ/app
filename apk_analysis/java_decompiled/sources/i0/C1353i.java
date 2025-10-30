package i0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: i0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18333a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18334b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18335c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18336d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18337e;

    public C1353i(ViewGroup container) {
        kotlin.jvm.internal.h.e(container, "container");
        this.f18333a = container;
        this.f18334b = new ArrayList();
        this.f18335c = new ArrayList();
    }

    public static final C1353i f(ViewGroup container, AbstractC1336M fragmentManager) {
        kotlin.jvm.internal.h.e(container, "container");
        kotlin.jvm.internal.h.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.h.d(fragmentManager.F(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C1353i) {
            return (C1353i) tag;
        }
        C1353i c1353i = new C1353i(container);
        container.setTag(R.id.special_effects_controller_view_tag, c1353i);
        return c1353i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L.c, java.lang.Object] */
    public final void a(int i9, int i10, C1343U c1343u) {
        synchronized (this.f18334b) {
            ?? obj = new Object();
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
            kotlin.jvm.internal.h.d(abstractComponentCallbacksC1366v, "fragmentStateManager.fragment");
            Z d9 = d(abstractComponentCallbacksC1366v);
            if (d9 != null) {
                d9.c(i9, i10);
                return;
            }
            final Z z9 = new Z(i9, i10, c1343u, obj);
            this.f18334b.add(z9);
            final int i11 = 0;
            z9.f18277d.add(new Runnable(this) { // from class: i0.Y

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1353i f18272b;

                {
                    this.f18272b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            C1353i this$0 = this.f18272b;
                            kotlin.jvm.internal.h.e(this$0, "this$0");
                            Z z10 = z9;
                            if (this$0.f18334b.contains(z10)) {
                                int i12 = z10.f18274a;
                                View view = z10.f18276c.Y;
                                kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
                                AbstractC0953k1.b(view, i12);
                                return;
                            }
                            return;
                        default:
                            C1353i this$02 = this.f18272b;
                            kotlin.jvm.internal.h.e(this$02, "this$0");
                            Z z11 = z9;
                            this$02.f18334b.remove(z11);
                            this$02.f18335c.remove(z11);
                            return;
                    }
                }
            });
            final int i12 = 1;
            z9.f18277d.add(new Runnable(this) { // from class: i0.Y

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1353i f18272b;

                {
                    this.f18272b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            C1353i this$0 = this.f18272b;
                            kotlin.jvm.internal.h.e(this$0, "this$0");
                            Z z10 = z9;
                            if (this$0.f18334b.contains(z10)) {
                                int i122 = z10.f18274a;
                                View view = z10.f18276c.Y;
                                kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
                                AbstractC0953k1.b(view, i122);
                                return;
                            }
                            return;
                        default:
                            C1353i this$02 = this.f18272b;
                            kotlin.jvm.internal.h.e(this$02, "this$0");
                            Z z11 = z9;
                            this$02.f18334b.remove(z11);
                            this$02.f18335c.remove(z11);
                            return;
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0271, code lost:
    
        r0 = " has started.";
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0276, code lost:
    
        if (r3 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0278, code lost:
    
        r10.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027b, code lost:
    
        r2 = r1.Y;
        r13.startViewTransition(r2);
        r1 = r0;
        r19 = r11;
        r19 = r6;
        r1 = r21;
        r2.addListener(new i0.C1351g(r1, r2, r3, r4, r5));
        r2.setTarget(r2);
        r2.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a0, code lost:
    
        if (i0.AbstractC1336M.H(2) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a2, code lost:
    
        android.util.Log.v("FragmentManager", "Animator from operation " + r4 + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02b6, code lost:
    
        ((L.c) r5.f453b).a(new N1.h(r2, 16, r4));
        r11 = r19;
        r6 = r19;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0274, code lost:
    
        r0 = " has started.";
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024a, code lost:
    
        if (i0.AbstractC1336M.H(2) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024c, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animator set on " + r1 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0262, code lost:
    
        r5.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0265, code lost:
    
        r1 = r21;
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022c, code lost:
    
        r15.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0216, code lost:
    
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
    
        r5.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0213, code lost:
    
        r5.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cb, code lost:
    
        r22 = r0;
        r23 = r11;
        r0 = r15.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02d5, code lost:
    
        if (r2 >= r0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d7, code lost:
    
        r3 = r15.get(r2);
        r2 = r2 + 1;
        r3 = (i0.C1349e) r3;
        r5 = (i0.Z) r3.f452a;
        r11 = r5.f18276c;
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e9, code lost:
    
        if (r23 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x030d, code lost:
    
        if (r22 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x032f, code lost:
    
        r0 = r11.Y;
        kotlin.jvm.internal.h.d(r14, r4);
        r11 = r3.v(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x033c, code lost:
    
        if (r11 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x033e, code lost:
    
        r11 = (android.view.animation.Animation) r11.f5263b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0342, code lost:
    
        if (r11 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0344, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0349, code lost:
    
        if (r5.f18274a == 1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x034b, code lost:
    
        r0.startAnimation(r11);
        r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0381, code lost:
    
        ((L.c) r3.f453b).a(new i0.C1348d(r0, r3, r1, r5));
        r0 = r18;
        r2 = r2;
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0352, code lost:
    
        r13.startViewTransition(r0);
        r2 = new i0.RunnableC1370z(r11, r13, r0);
        r2.setAnimationListener(new i0.AnimationAnimationListenerC1352h(r0, r3, r1, r5));
        r0.startAnimation(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x036b, code lost:
    
        if (i0.AbstractC1336M.H(2) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x036d, code lost:
    
        android.util.Log.v("FragmentManager", "Animation from operation " + r5 + " has started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x039a, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03a0, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0315, code lost:
    
        if (i0.AbstractC1336M.H(2) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0317, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r11 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x032b, code lost:
    
        r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030a, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r12 = (i0.Z) r4;
        r3 = r0.listIterator(r0.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f1, code lost:
    
        if (i0.AbstractC1336M.H(2) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02f3, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r11 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0307, code lost:
    
        r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03a1, code lost:
    
        r0 = r10.size();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03a6, code lost:
    
        if (r13 >= r0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03a8, code lost:
    
        r2 = r10.get(r13);
        r13 = r13 + 1;
        r2 = (i0.Z) r2;
        r3 = r2.f18276c.Y;
        r2 = r2.f18274a;
        kotlin.jvm.internal.h.d(r3, "view");
        com.google.android.gms.internal.measurement.AbstractC0953k1.b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03bf, code lost:
    
        r10.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03c8, code lost:
    
        if (i0.AbstractC1336M.H(2) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03ca, code lost:
    
        android.util.Log.v("FragmentManager", "Completed executing operations from " + r12 + " to " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03e1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0080, code lost:
    
        r14 = r14.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0084, code lost:
    
        if (r14 == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0086, code lost:
    
        if (r14 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0088, code lost:
    
        if (r14 != 8) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r3.hasPrevious() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0094, code lost:
    
        throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.measurement.AbstractC0953k1.j(r14, "Unknown visibility "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r4 = r3.previous();
        r13 = (i0.Z) r4;
        r14 = r13.f18276c.Y;
        kotlin.jvm.internal.h.d(r14, "operation.fragment.mView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r14.getAlpha() != 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r14.getVisibility() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r13.f18274a != 2) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        r7 = (i0.Z) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (i0.AbstractC1336M.H(2) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r12 + " to " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        r3 = new java.util.ArrayList();
        r4 = new java.util.ArrayList();
        r10 = B7.k.I0(r0);
        r5 = ((i0.Z) B7.k.v0(r0)).f18276c;
        r11 = r0.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r14 >= r11) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        r15 = r0.get(r14);
        r14 = r14 + 1;
        r15 = ((i0.Z) r15).f18276c.f18393g0;
        r13 = r5.f18393g0;
        r15.f18368b = r13.f18368b;
        r15.f18369c = r13.f18369c;
        r15.f18370d = r13.f18370d;
        r15.f18371e = r13.f18371e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
    
        r5 = r0.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        if (r6 >= r5) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        r13 = r0.get(r6);
        r6 = r6 + 1;
        r13 = (i0.Z) r13;
        r14 = new java.lang.Object();
        r13.d();
        r15 = r13.f18278e;
        r15.add(r14);
        r3.add(new i0.C1349e(r13, r14, r23));
        r11 = new java.lang.Object();
        r13.d();
        r15.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012c, code lost:
    
        if (r23 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012e, code lost:
    
        if (r13 != r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0130, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        r14 = new A5.q(r13, r11);
        r11 = r13.f18274a;
        r15 = r13.f18276c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0141, code lost:
    
        if (r11 != 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0143, code lost:
    
        if (r23 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0145, code lost:
    
        r0 = r15.f18393g0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0157, code lost:
    
        if (r13.f18274a != 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0159, code lost:
    
        if (r23 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015b, code lost:
    
        r0 = r15.f18393g0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
    
        r0 = r15.f18393g0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0160, code lost:
    
        if (r17 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0162, code lost:
    
        if (r23 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0164, code lost:
    
        r0 = r15.f18393g0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016a, code lost:
    
        r4.add(r14);
        r13.f18277d.add(new N3.E(r10, r13, r1, 6));
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0167, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0148, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
    
        if (r23 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r0 = r15.f18393g0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        if (r13 != r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r6 = new java.util.LinkedHashMap();
        r0 = new java.util.ArrayList();
        r2 = r4.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018a, code lost:
    
        if (r5 >= r2) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018c, code lost:
    
        r11 = r4.get(r5);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0199, code lost:
    
        if (((i0.C1350f) r11).m() != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019b, code lost:
    
        r0.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019f, code lost:
    
        r2 = new java.util.ArrayList();
        r5 = r0.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        if (r11 >= r5) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ab, code lost:
    
        r13 = r0.get(r11);
        r11 = r11 + 1;
        ((i0.C1350f) r13).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b7, code lost:
    
        r0 = r2.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bc, code lost:
    
        if (r5 >= r0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01be, code lost:
    
        r11 = r2.get(r5);
        r5 = r5 + 1;
        ((i0.C1350f) r11).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ca, code lost:
    
        r0 = r4.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cf, code lost:
    
        if (r2 >= r0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d1, code lost:
    
        r5 = r4.get(r2);
        r2 = r2 + 1;
        r5 = (i0.C1350f) r5;
        r6.put((i0.Z) r5.f452a, java.lang.Boolean.FALSE);
        r5.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e6, code lost:
    
        r11 = r6.containsValue(java.lang.Boolean.TRUE);
        r13 = r1.f18333a;
        r14 = r13.getContext();
        r15 = new java.util.ArrayList();
        r18 = r3.iterator();
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01fc, code lost:
    
        r4 = "context";
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0204, code lost:
    
        if (r18.hasNext() == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0206, code lost:
    
        r5 = (i0.C1349e) r18.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0211, code lost:
    
        if (r5.m() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0219, code lost:
    
        kotlin.jvm.internal.h.d(r14, "context");
        r2 = r5.v(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0220, code lost:
    
        if (r2 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0226, code lost:
    
        r2 = (android.animation.Animator) r2.f5264c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022a, code lost:
    
        if (r2 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0230, code lost:
    
        r4 = (i0.Z) r5.f452a;
        r22 = r0;
        r0 = kotlin.jvm.internal.h.a(r6.get(r4), java.lang.Boolean.TRUE);
        r1 = r4.f18276c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0242, code lost:
    
        if (r0 == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x026f, code lost:
    
        if (r4.f18274a != 3) goto L109;
     */
    /* JADX WARN: Type inference failed for: r11v22, types: [L.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [L.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C1353i.b(java.util.ArrayList, boolean):void");
    }

    public final void c() {
        if (this.f18337e) {
            return;
        }
        ViewGroup viewGroup = this.f18333a;
        WeakHashMap weakHashMap = P.Q.f5546a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f18336d = false;
            return;
        }
        synchronized (this.f18334b) {
            try {
                if (!this.f18334b.isEmpty()) {
                    ArrayList I02 = B7.k.I0(this.f18335c);
                    this.f18335c.clear();
                    int size = I02.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = I02.get(i9);
                        i9++;
                        Z z9 = (Z) obj;
                        if (AbstractC1336M.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + z9);
                        }
                        z9.a();
                        if (!z9.f18280g) {
                            this.f18335c.add(z9);
                        }
                    }
                    g();
                    ArrayList I03 = B7.k.I0(this.f18334b);
                    this.f18334b.clear();
                    this.f18335c.addAll(I03);
                    if (AbstractC1336M.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = I03.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = I03.get(i10);
                        i10++;
                        ((Z) obj2).d();
                    }
                    b(I03, this.f18336d);
                    this.f18336d = false;
                    if (AbstractC1336M.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Z d(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        Object obj;
        ArrayList arrayList = this.f18334b;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                obj = arrayList.get(i9);
                i9++;
                Z z9 = (Z) obj;
                if (kotlin.jvm.internal.h.a(z9.f18276c, abstractComponentCallbacksC1366v) && !z9.f18279f) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Z) obj;
    }

    public final void e() {
        String str;
        String str2;
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f18333a;
        WeakHashMap weakHashMap = P.Q.f5546a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f18334b) {
            try {
                g();
                ArrayList arrayList = this.f18334b;
                int size = arrayList.size();
                int i9 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Z) obj).d();
                }
                ArrayList I02 = B7.k.I0(this.f18335c);
                int size2 = I02.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = I02.get(i11);
                    i11++;
                    Z z9 = (Z) obj2;
                    if (AbstractC1336M.H(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f18333a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + z9);
                    }
                    z9.a();
                }
                ArrayList I03 = B7.k.I0(this.f18334b);
                int size3 = I03.size();
                while (i9 < size3) {
                    Object obj3 = I03.get(i9);
                    i9++;
                    Z z10 = (Z) obj3;
                    if (AbstractC1336M.H(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f18333a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + z10);
                    }
                    z10.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f18334b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Z z9 = (Z) obj;
            int i10 = 2;
            if (z9.f18275b == 2) {
                int visibility = z9.f18276c.Z().getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i10 = 3;
                        } else {
                            throw new IllegalArgumentException(AbstractC0953k1.j(visibility, "Unknown visibility "));
                        }
                    }
                }
                z9.c(i10, 1);
            }
        }
    }
}
