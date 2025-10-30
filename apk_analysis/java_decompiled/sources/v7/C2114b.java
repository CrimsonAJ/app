package v7;

import android.app.Application;
import android.support.v4.media.session.y;
import d.AbstractActivityC1071l;
import i.AbstractActivityC1322h;
import m0.C1580c;
import x7.InterfaceC2179a;
import x7.InterfaceC2180b;

/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2114b implements InterfaceC2180b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23902a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23903b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC1071l f23904c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23905d;

    /* renamed from: e, reason: collision with root package name */
    public volatile InterfaceC2179a f23906e;

    public C2114b(AbstractActivityC1322h abstractActivityC1322h) {
        this.f23904c = abstractActivityC1322h;
        this.f23905d = new C2114b((AbstractActivityC1071l) abstractActivityC1322h);
    }

    private final Object b() {
        if (((I1.e) this.f23906e) == null) {
            synchronized (this.f23903b) {
                try {
                    if (((I1.e) this.f23906e) == null) {
                        this.f23906e = a();
                    }
                } finally {
                }
            }
        }
        return (I1.e) this.f23906e;
    }

    public I1.e a() {
        String str;
        AbstractActivityC1322h abstractActivityC1322h = (AbstractActivityC1322h) this.f23904c;
        if (!(abstractActivityC1322h.getApplication() instanceof InterfaceC2180b)) {
            StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(abstractActivityC1322h.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + abstractActivityC1322h.getApplication().getClass();
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        I1.g gVar = (I1.g) ((InterfaceC2113a) v4.e.p(InterfaceC2113a.class, (C2114b) this.f23905d));
        return new I1.e(gVar.f3285a, gVar.f3286b);
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        switch (this.f23902a) {
            case 0:
                return b();
            default:
                if (((I1.g) this.f23906e) == null) {
                    synchronized (this.f23903b) {
                        if (((I1.g) this.f23906e) == null) {
                            this.f23906e = ((C2116d) new y(this.f23904c, new C1580c(2, (AbstractActivityC1071l) this.f23905d)).J(C2116d.class)).f23907d;
                        }
                    }
                }
                return (I1.g) this.f23906e;
        }
    }

    public C2114b(AbstractActivityC1071l abstractActivityC1071l) {
        this.f23904c = abstractActivityC1071l;
        this.f23905d = abstractActivityC1071l;
    }
}
