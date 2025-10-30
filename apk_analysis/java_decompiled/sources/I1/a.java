package I1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.os.Bundle;
import com.anilab.android.App;
import com.google.android.gms.internal.measurement.C0922e0;
import com.google.android.gms.internal.measurement.C0952k0;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final class a extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ App f3275r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f3276s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(App app, String str, E7.d dVar) {
        super(2, dVar);
        this.f3275r = app;
        this.f3276s = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new a(this.f3275r, this.f3276s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        aVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        try {
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.f3275r);
            String str = this.f3276s;
            C0952k0 c0952k0 = firebaseAnalytics.f16408a;
            c0952k0.getClass();
            c0952k0.b(new C0922e0(c0952k0, (String) null, str, (Bundle) null, false));
        } catch (Exception unused) {
        }
        return A7.n.f558a;
    }
}
