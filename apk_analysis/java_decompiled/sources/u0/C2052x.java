package u0;

import android.os.Bundle;

/* renamed from: u0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2052x extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f23544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2052x(int i9, Bundle bundle) {
        super(1);
        this.f23543d = i9;
        this.f23544e = bundle;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f23543d) {
            case 0:
                String argName = (String) obj;
                kotlin.jvm.internal.h.e(argName, "argName");
                return Boolean.valueOf(!this.f23544e.containsKey(argName));
            default:
                String key = (String) obj;
                kotlin.jvm.internal.h.e(key, "key");
                return Boolean.valueOf(!this.f23544e.containsKey(key));
        }
    }
}
