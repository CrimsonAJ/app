package com.google.firebase.concurrent;

import Z0.a;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import r6.InterfaceC1930a;
import r6.b;
import r6.c;
import r6.d;
import s6.C1961a;
import s6.C1962b;
import s6.l;
import s6.p;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final l f16409a = new l(new c7.l(4));

    /* renamed from: b, reason: collision with root package name */
    public static final l f16410b = new l(new c7.l(5));

    /* renamed from: c, reason: collision with root package name */
    public static final l f16411c = new l(new c7.l(6));

    /* renamed from: d, reason: collision with root package name */
    public static final l f16412d = new l(new c7.l(7));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(InterfaceC1930a.class, ScheduledExecutorService.class);
        p[] pVarArr = {new p(InterfaceC1930a.class, ExecutorService.class), new p(InterfaceC1930a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            a.d(pVar2, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        C1962b c1962b = new C1962b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new k8.a(14), hashSet3);
        p pVar3 = new p(b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(b.class, ExecutorService.class), new p(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar3);
        for (p pVar4 : pVarArr2) {
            a.d(pVar4, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        C1962b c1962b2 = new C1962b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new k8.a(15), hashSet6);
        p pVar5 = new p(c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(c.class, ExecutorService.class), new p(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar5);
        for (p pVar6 : pVarArr3) {
            a.d(pVar6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        C1962b c1962b3 = new C1962b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new k8.a(16), hashSet9);
        C1961a b9 = C1962b.b(new p(d.class, Executor.class));
        b9.f22745f = new k8.a(17);
        return Arrays.asList(c1962b, c1962b2, c1962b3, b9.b());
    }
}
