package P1;

import android.view.View;

/* renamed from: P1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0327c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5719a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0328d f5720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H2.c f5721c;

    public /* synthetic */ ViewOnClickListenerC0327c(H2.c cVar, C0328d c0328d) {
        this.f5721c = cVar;
        this.f5720b = c0328d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5719a) {
            case 0:
                H2.c cVar = this.f5721c;
                boolean a5 = kotlin.jvm.internal.h.a(cVar.j, Boolean.TRUE);
                C0328d c0328d = this.f5720b;
                if (a5) {
                    c0328d.f5723v.x0(cVar);
                    return;
                } else {
                    c0328d.f5723v.u0(cVar);
                    return;
                }
            default:
                this.f5720b.f5723v.v0(this.f5721c);
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0327c(C0328d c0328d, H2.c cVar) {
        this.f5720b = c0328d;
        this.f5721c = cVar;
    }
}
