package Q6;

import Y2.r;
import android.content.Context;
import b7.C0700b;
import c7.n;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import l6.C1574f;
import s6.p;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements s6.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f6447b;

    public /* synthetic */ b(p pVar, int i9) {
        this.f6446a = i9;
        this.f6447b = pVar;
    }

    @Override // s6.d
    public final Object e(r rVar) {
        n lambda$getComponents$0;
        switch (this.f6446a) {
            case 0:
                return new e((Context) rVar.b(Context.class), ((C1574f) rVar.b(C1574f.class)).d(), rVar.M(f.class), rVar.h(C0700b.class), (Executor) rVar.d(this.f6447b));
            case 1:
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(this.f6447b, rVar);
                return lambda$getComponents$0;
            default:
                return FirebaseMessagingRegistrar.a(this.f6447b, rVar);
        }
    }
}
