package i7;

import android.content.Context;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f18910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Context context, int i9) {
        super(0);
        this.f18909d = i9;
        this.f18910e = context;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f18909d) {
            case 0:
                return s8.n.v(this.f18910e, E.f18748b);
            default:
                return s8.n.v(this.f18910e, E.f18747a);
        }
    }
}
