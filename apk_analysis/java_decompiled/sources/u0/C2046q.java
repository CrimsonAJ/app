package u0;

/* renamed from: u0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2046q extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f23525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2046q(H h7, int i9) {
        super(1);
        this.f23524d = i9;
        this.f23525e = h7;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f23524d) {
            case 0:
                C destination = (C) obj;
                kotlin.jvm.internal.h.e(destination, "destination");
                return Boolean.valueOf(!this.f23525e.f23404l.containsKey(Integer.valueOf(destination.f23381h)));
            default:
                C destination2 = (C) obj;
                kotlin.jvm.internal.h.e(destination2, "destination");
                return Boolean.valueOf(!this.f23525e.f23404l.containsKey(Integer.valueOf(destination2.f23381h)));
        }
    }
}
