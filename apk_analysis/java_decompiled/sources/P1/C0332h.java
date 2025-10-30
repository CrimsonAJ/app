package P1;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.anilab.android.ui.comment.CommentListFragment;

/* renamed from: P1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332h extends M1.s {
    public final /* synthetic */ CommentListFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0332h(CommentListFragment commentListFragment, androidx.recyclerview.widget.a aVar) {
        super((LinearLayoutManager) aVar);
        this.j = commentListFragment;
        kotlin.jvm.internal.h.c(aVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    @Override // M1.s
    public final void c(int i9) {
        G h02 = this.j.h0();
        h02.getClass();
        boolean z9 = true;
        if (i9 != 1) {
            z9 = false;
        }
        h02.d(z9, new A(h02, i9, null));
    }
}
