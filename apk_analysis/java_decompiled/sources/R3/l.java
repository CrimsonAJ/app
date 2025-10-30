package R3;

import P5.F;
import android.net.Uri;
import j3.M;
import java.util.ArrayList;
import o1.C1671f;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: f, reason: collision with root package name */
    public final j f6629f;

    /* renamed from: g, reason: collision with root package name */
    public final C1671f f6630g;

    public l(M m9, F f9, r rVar, ArrayList arrayList) {
        super(m9, f9, rVar, arrayList);
        j jVar;
        Uri.parse(((b) f9.get(0)).f6581a);
        long j = rVar.f6647e;
        if (j <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.f6646d, null, j);
        }
        this.f6629f = jVar;
        this.f6630g = jVar == null ? new C1671f(19, new j(0L, null, -1L)) : null;
    }

    @Override // R3.m
    public final String a() {
        return null;
    }

    @Override // R3.m
    public final Q3.i b() {
        return this.f6630g;
    }

    @Override // R3.m
    public final j e() {
        return this.f6629f;
    }
}
