package b5;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: b5.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0670v0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q1 f11332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f11333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC0672w0 f11334d;

    public /* synthetic */ CallableC0670v0(BinderC0672w0 binderC0672w0, Q1 q12, Bundle bundle, int i9) {
        this.f11331a = i9;
        this.f11332b = q12;
        this.f11333c = bundle;
        this.f11334d = binderC0672w0;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f11331a) {
            case 0:
                BinderC0672w0 binderC0672w0 = this.f11334d;
                binderC0672w0.f11339e.e();
                Q1 q12 = this.f11332b;
                return binderC0672w0.f11339e.d(this.f11333c, q12);
            default:
                BinderC0672w0 binderC0672w02 = this.f11334d;
                binderC0672w02.f11339e.e();
                Q1 q13 = this.f11332b;
                return binderC0672w02.f11339e.d(this.f11333c, q13);
        }
    }
}
