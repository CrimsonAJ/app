package t0;

import f5.C1183o;
import java.util.ArrayList;

/* renamed from: t0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1982p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f23019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1183o f23020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1980n f23021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23022e;

    public /* synthetic */ RunnableC1982p(r rVar, C1183o c1183o, C1980n c1980n, ArrayList arrayList, int i9) {
        this.f23018a = i9;
        this.f23019b = rVar;
        this.f23020c = c1183o;
        this.f23021d = c1980n;
        this.f23022e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23018a) {
            case 0:
                r rVar = this.f23019b;
                rVar.getClass();
                this.f23020c.C(rVar, this.f23021d, this.f23022e);
                return;
            default:
                this.f23020c.C(this.f23019b, this.f23021d, this.f23022e);
                return;
        }
    }
}
