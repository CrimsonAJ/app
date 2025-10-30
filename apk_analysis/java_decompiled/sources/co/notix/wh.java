package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.File;

/* loaded from: classes.dex */
public final class wh extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(yh yhVar) {
        super(0);
        this.f13444a = yhVar;
    }

    @Override // O7.a
    public final Object invoke() {
        return new File(((d9) this.f13444a.f13607a).a().getDir("notix", 0), AbstractC0953k1.q(new StringBuilder(), this.f13444a.f13610d, ".json"));
    }
}
