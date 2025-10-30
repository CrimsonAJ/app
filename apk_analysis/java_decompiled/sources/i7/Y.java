package i7;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.util.Log;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Y extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f18818r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f18819s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(String str, E7.d dVar) {
        super(2, dVar);
        this.f18819s = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new Y(this.f18819s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f18818r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            j7.c cVar = j7.c.f19792a;
            this.f18818r = 1;
            obj = cVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Collection<y6.i> values = ((Map) obj).values();
        String str = this.f18819s;
        for (y6.i iVar : values) {
            j7.e eVar = new j7.e(str);
            iVar.getClass();
            String str2 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            y6.h hVar = iVar.f25052b;
            synchronized (hVar) {
                if (!Objects.equals(hVar.f25050c, str)) {
                    y6.h.a(hVar.f25048a, hVar.f25049b, str);
                    hVar.f25050c = str;
                }
            }
            Log.d("SessionLifecycleClient", "Notified " + j7.d.f19794a + " of new session " + str);
        }
        return A7.n.f558a;
    }
}
