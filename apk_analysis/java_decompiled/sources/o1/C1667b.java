package o1;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667b extends AbstractRunnableC1668c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.k f21460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21462d;

    public C1667b(f1.k kVar, String str, boolean z9) {
        this.f21460b = kVar;
        this.f21461c = str;
        this.f21462d = z9;
    }

    @Override // o1.AbstractRunnableC1668c
    public final void b() {
        f1.k kVar = this.f21460b;
        WorkDatabase workDatabase = kVar.j;
        workDatabase.c();
        try {
            ArrayList k5 = workDatabase.v().k(this.f21461c);
            int size = k5.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = k5.get(i9);
                i9++;
                AbstractRunnableC1668c.a(kVar, (String) obj);
            }
            workDatabase.p();
            workDatabase.m();
            if (this.f21462d) {
                f1.d.a(kVar.f17300i, kVar.j, kVar.f17302l);
            }
        } catch (Throwable th) {
            workDatabase.m();
            throw th;
        }
    }
}
