package f0;

import android.widget.EditText;
import d0.AbstractC1089g;
import java.lang.ref.WeakReference;
import p.AbstractC1759N0;

/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1156h extends AbstractC1089g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17257a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f17258b;

    public C1156h(EditText editText) {
        this.f17258b = new WeakReference(editText);
    }

    @Override // d0.AbstractC1089g
    public void a() {
        switch (this.f17257a) {
            case 1:
                AbstractC1759N0 abstractC1759N0 = (AbstractC1759N0) this.f17258b.get();
                if (abstractC1759N0 != null) {
                    abstractC1759N0.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // d0.AbstractC1089g
    public final void b() {
        switch (this.f17257a) {
            case 0:
                C1157i.a((EditText) this.f17258b.get(), 1);
                return;
            default:
                AbstractC1759N0 abstractC1759N0 = (AbstractC1759N0) this.f17258b.get();
                if (abstractC1759N0 != null) {
                    abstractC1759N0.c();
                    return;
                }
                return;
        }
    }

    public C1156h(AbstractC1759N0 abstractC1759N0) {
        this.f17258b = new WeakReference(abstractC1759N0);
    }
}
