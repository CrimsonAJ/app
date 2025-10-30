package A4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i f350b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i f351c = new i(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f352a;

    public /* synthetic */ i(int i9) {
        this.f352a = i9;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f352a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
