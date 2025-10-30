package P1;

import com.anilab.android.ui.comment.CommentListFragment;

/* renamed from: P1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0330f implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentListFragment f5727b;

    public /* synthetic */ C0330f(CommentListFragment commentListFragment, int i9) {
        this.f5726a = i9;
        this.f5727b = commentListFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f5726a) {
            case 0:
                return new C0329e(this.f5727b);
            case 1:
                CommentListFragment commentListFragment = this.f5727b;
                return new C0332h(commentListFragment, ((J1.E) commentListFragment.e0()).f3649E.getLayoutManager());
            case 2:
                this.f5727b.y0(false);
                return A7.n.f558a;
            default:
                CommentListFragment commentListFragment2 = this.f5727b;
                commentListFragment2.y0(false);
                G h02 = commentListFragment2.h0();
                H2.c cVar = h02.f5704v;
                if (cVar != null) {
                    h02.d(true, new y(h02, cVar, null));
                }
                return A7.n.f558a;
        }
    }
}
