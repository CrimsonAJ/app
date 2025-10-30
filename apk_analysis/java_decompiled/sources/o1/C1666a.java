package o1;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1666a extends AbstractRunnableC1668c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.k f21458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f21459c;

    public C1666a(f1.k kVar, UUID uuid) {
        this.f21458b = kVar;
        this.f21459c = uuid;
    }

    @Override // o1.AbstractRunnableC1668c
    public final void b() {
        f1.k kVar = this.f21458b;
        WorkDatabase workDatabase = kVar.j;
        workDatabase.c();
        try {
            AbstractRunnableC1668c.a(kVar, this.f21459c.toString());
            workDatabase.p();
            workDatabase.m();
            f1.d.a(kVar.f17300i, kVar.j, kVar.f17302l);
        } catch (Throwable th) {
            workDatabase.m();
            throw th;
        }
    }
}
