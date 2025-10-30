package V7;

import B7.B;
import P.C0323y;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7831a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.a f7832b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7833c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(j jVar, O7.l lVar, int i9) {
        this.f7831a = i9;
        switch (i9) {
            case 2:
                this.f7833c = jVar;
                this.f7832b = lVar;
                return;
            default:
                this.f7833c = jVar;
                this.f7832b = (kotlin.jvm.internal.i) lVar;
                return;
        }
    }

    @Override // V7.j
    public final Iterator iterator() {
        switch (this.f7831a) {
            case 0:
                return new h(this);
            case 1:
                return new f(this);
            case 2:
                return new C0323y(this);
            default:
                return new B(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(B2.i iVar, O7.l lVar) {
        this.f7831a = 0;
        this.f7833c = iVar;
        this.f7832b = (kotlin.jvm.internal.i) lVar;
    }

    public i(String input, O7.p pVar) {
        this.f7831a = 3;
        kotlin.jvm.internal.h.e(input, "input");
        this.f7833c = input;
        this.f7832b = pVar;
    }
}
