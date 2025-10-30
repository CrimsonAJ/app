package G0;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: G0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2739a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2740b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0.c f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final C f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2743e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2744f;

    /* renamed from: g, reason: collision with root package name */
    public final B f2745g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f2746h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f2747i;
    public final Intent j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2748k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2749l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f2750m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2751n;

    /* renamed from: o, reason: collision with root package name */
    public final File f2752o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f2753p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2754q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2755r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2756s;

    /* renamed from: t, reason: collision with root package name */
    public final P0.b f2757t;

    /* renamed from: u, reason: collision with root package name */
    public final E7.i f2758u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2759v;

    public C0135a(Context context, String str, Q0.c cVar, C migrationContainer, List list, boolean z9, B b9, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z10, boolean z11, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z12, P0.b bVar, E7.i iVar) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.h.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.h.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.h.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.h.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f2739a = context;
        this.f2740b = str;
        this.f2741c = cVar;
        this.f2742d = migrationContainer;
        this.f2743e = list;
        this.f2744f = z9;
        this.f2745g = b9;
        this.f2746h = queryExecutor;
        this.f2747i = transactionExecutor;
        this.j = intent;
        this.f2748k = z10;
        this.f2749l = z11;
        this.f2750m = set;
        this.f2751n = str2;
        this.f2752o = file;
        this.f2753p = callable;
        this.f2754q = typeConverters;
        this.f2755r = autoMigrationSpecs;
        this.f2756s = z12;
        this.f2757t = bVar;
        this.f2758u = iVar;
        this.f2759v = true;
    }
}
