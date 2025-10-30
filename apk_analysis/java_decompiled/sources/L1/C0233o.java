package L1;

import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233o extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0233o(MainActivity mainActivity, int i9) {
        super(0);
        this.f4537d = i9;
        this.f4538e = mainActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f4537d) {
            case 0:
                return this.f4538e.j();
            case 1:
                return this.f4538e.u();
            default:
                return this.f4538e.p();
        }
    }
}
