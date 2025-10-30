package P1;

import android.view.View;
import com.anilab.android.ui.comment.CommentListFragment;

/* renamed from: P1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0325a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0326b f5715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H2.c f5716c;

    public /* synthetic */ ViewOnClickListenerC0325a(H2.c cVar, C0326b c0326b) {
        this.f5714a = 0;
        this.f5716c = cVar;
        this.f5715b = c0326b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5714a) {
            case 0:
                H2.c cVar = this.f5716c;
                boolean a5 = kotlin.jvm.internal.h.a(cVar.j, Boolean.TRUE);
                C0326b c0326b = this.f5715b;
                if (a5) {
                    c0326b.f5718v.x0(cVar);
                    return;
                } else {
                    c0326b.f5718v.u0(cVar);
                    return;
                }
            case 1:
                this.f5715b.f5718v.v0(this.f5716c);
                return;
            case 2:
                CommentListFragment commentListFragment = this.f5715b.f5718v;
                commentListFragment.getClass();
                H2.c cVar2 = this.f5716c;
                G h02 = commentListFragment.h0();
                String str = cVar2.f2986a;
                h02.getClass();
                h02.d(true, new C(h02, str, null, null));
                return;
            case 3:
                this.f5715b.f5718v.w0(this.f5716c);
                return;
            default:
                this.f5715b.f5718v.w0(this.f5716c);
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0325a(C0326b c0326b, H2.c cVar, int i9) {
        this.f5714a = i9;
        this.f5715b = c0326b;
        this.f5716c = cVar;
    }
}
