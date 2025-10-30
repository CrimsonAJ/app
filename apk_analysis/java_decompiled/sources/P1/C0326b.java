package P1;

import J1.O0;
import K5.ViewOnClickListenerC0215a;
import android.content.res.Resources;
import android.text.format.DateUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import com.anilab.android.ui.comment.CommentListFragment;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import t1.C1992a;
import t1.C2004m;

/* renamed from: P1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326b extends M1.o {

    /* renamed from: u, reason: collision with root package name */
    public final O0 f5717u;

    /* renamed from: v, reason: collision with root package name */
    public final CommentListFragment f5718v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0326b(O0 o02, CommentListFragment listener) {
        super(o02);
        kotlin.jvm.internal.h.e(listener, "listener");
        this.f5717u = o02;
        this.f5718v = listener;
    }

    @Override // M1.o
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void r(H2.c cVar) {
        boolean z9;
        int i9;
        int i10;
        String str;
        int i11;
        int i12;
        O0 o02 = this.f5717u;
        o02.f3736A.setText(cVar.f2989d);
        AppCompatTextView buttonNumberReply = o02.f3743x;
        kotlin.jvm.internal.h.d(buttonNumberReply, "buttonNumberReply");
        int i13 = cVar.f2991f;
        if (i13 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i14 = 8;
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        buttonNumberReply.setVisibility(i9);
        Resources resources = this.f2210a.getResources();
        if (cVar.f3000p) {
            i10 = R.string.format_hide_reply;
        } else {
            i10 = R.string.format_show_reply;
        }
        buttonNumberReply.setText(resources.getString(i10, Integer.valueOf(i13)));
        H2.y yVar = cVar.f2994i;
        if (yVar != null) {
            str = yVar.f3088b;
        } else {
            str = null;
        }
        o02.f3740E.setText(str);
        o02.f3737B.setText(String.valueOf(cVar.f2990e));
        ShapeableImageView imageUser = o02.f3745z;
        kotlin.jvm.internal.h.d(imageUser, "imageUser");
        String str2 = cVar.f2995k;
        if (str2 == null) {
            str2 = "";
        }
        String J8 = W7.l.J(str2, "{width}x{height}", "150x150");
        C2004m a5 = C1992a.a(imageUser.getContext());
        C1.h hVar = new C1.h(imageUser.getContext());
        hVar.f1179c = J8;
        hVar.b(imageUser);
        hVar.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.a()}));
        a5.b(hVar.a());
        Boolean bool = cVar.j;
        Boolean bool2 = Boolean.TRUE;
        if (kotlin.jvm.internal.h.a(bool, bool2)) {
            i11 = R.drawable.ic_liked;
        } else {
            i11 = R.drawable.ic_unlike;
        }
        MaterialButton materialButton = o02.f3741v;
        materialButton.setIconResource(i11);
        materialButton.setOnClickListener(new ViewOnClickListenerC0325a(cVar, this));
        AppCompatImageView buttonMoreOption = o02.f3742w;
        kotlin.jvm.internal.h.d(buttonMoreOption, "buttonMoreOption");
        if (kotlin.jvm.internal.h.a(cVar.f2996l, bool2)) {
            i14 = 0;
        }
        buttonMoreOption.setVisibility(i14);
        buttonMoreOption.setOnClickListener(new ViewOnClickListenerC0325a(this, cVar, 1));
        if (cVar.f3000p) {
            i12 = R.drawable.ic_arrow_up;
        } else {
            i12 = R.drawable.ic_arrow_down;
        }
        buttonNumberReply.setCompoundDrawablesWithIntrinsicBounds(0, 0, i12, 0);
        buttonNumberReply.setOnClickListener(new ViewOnClickListenerC0325a(this, cVar, 2));
        o02.f3744y.setOnClickListener(new ViewOnClickListenerC0325a(this, cVar, 3));
        o02.f3738C.setOnClickListener(new ViewOnClickListenerC0325a(this, cVar, 4));
        o02.f3739D.setText(DateUtils.getRelativeTimeSpanString(cVar.f2992g * 1000, System.currentTimeMillis(), 1000L));
        o02.f7853k.setOnClickListener(new ViewOnClickListenerC0215a(3, this));
        o02.c0();
    }
}
