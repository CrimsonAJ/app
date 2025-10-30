package P1;

import F0.I;
import F0.r0;
import J1.O0;
import J1.s1;
import K5.ViewOnClickListenerC0215a;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import com.anilab.android.ui.comment.CommentListFragment;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.regex.Pattern;
import t1.C1992a;
import t1.C2004m;

/* renamed from: P1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329e extends I {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f5724f = new N1.b(1);

    /* renamed from: e, reason: collision with root package name */
    public final CommentListFragment f5725e;

    public C0329e(CommentListFragment commentListFragment) {
        super(f5724f);
        this.f5725e = commentListFragment;
    }

    @Override // F0.S
    public final int c(int i9) {
        if (((H2.c) n(i9)).f2998n) {
            return 1;
        }
        return 0;
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        int i10;
        int i11;
        String str;
        int i12;
        boolean z9;
        int i13 = 0;
        if (r0Var instanceof C0326b) {
            Object n7 = n(i9);
            kotlin.jvm.internal.h.d(n7, "getItem(...)");
            ((C0326b) r0Var).r((H2.c) n7);
        }
        if (r0Var instanceof C0328d) {
            C0328d c0328d = (C0328d) r0Var;
            Object n9 = n(i9);
            kotlin.jvm.internal.h.d(n9, "getItem(...)");
            H2.c cVar = (H2.c) n9;
            int dimensionPixelSize = c0328d.f2210a.getResources().getDimensionPixelSize(R.dimen.dp_24);
            s1 s1Var = c0328d.f5722u;
            AppCompatTextView appCompatTextView = s1Var.f4085y;
            Pattern compile = Pattern.compile("(\\s*\\R){2,}");
            kotlin.jvm.internal.h.d(compile, "compile(...)");
            String input = cVar.f2989d;
            kotlin.jvm.internal.h.e(input, "input");
            String replaceAll = compile.matcher(input).replaceAll("\n\n");
            kotlin.jvm.internal.h.d(replaceAll, "replaceAll(...)");
            appCompatTextView.setText(replaceAll);
            View viewLine = s1Var.f4081C;
            kotlin.jvm.internal.h.d(viewLine, "viewLine");
            if (!cVar.f2999o) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            viewLine.setVisibility(i10);
            if (cVar.f2999o) {
                i11 = dimensionPixelSize;
            } else {
                i11 = 0;
            }
            View view = s1Var.f7853k;
            view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, i11);
            H2.y yVar = cVar.f2994i;
            if (yVar != null) {
                str = yVar.f3088b;
            } else {
                str = null;
            }
            s1Var.f4080B.setText(str);
            s1Var.f4086z.setText(String.valueOf(cVar.f2990e));
            ShapeableImageView imageUser = s1Var.f4084x;
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
            if (kotlin.jvm.internal.h.a(cVar.j, Boolean.TRUE)) {
                i12 = R.drawable.ic_liked;
            } else {
                i12 = R.drawable.ic_unlike;
            }
            MaterialButton materialButton = s1Var.f4082v;
            materialButton.setIconResource(i12);
            materialButton.setOnClickListener(new ViewOnClickListenerC0327c(cVar, c0328d));
            AppCompatImageView buttonMoreOption = s1Var.f4083w;
            kotlin.jvm.internal.h.d(buttonMoreOption, "buttonMoreOption");
            Boolean bool = cVar.f2996l;
            if (bool != null) {
                z9 = bool.booleanValue();
            } else {
                z9 = false;
            }
            if (!z9) {
                i13 = 8;
            }
            buttonMoreOption.setVisibility(i13);
            buttonMoreOption.setOnClickListener(new ViewOnClickListenerC0327c(c0328d, cVar));
            s1Var.f4079A.setText(DateUtils.getRelativeTimeSpanString(cVar.f2992g * 1000, System.currentTimeMillis(), 1000L));
            view.setOnClickListener(new ViewOnClickListenerC0215a(4, c0328d));
            s1Var.c0();
        }
    }

    @Override // F0.S
    public final r0 h(ViewGroup parent, int i9) {
        kotlin.jvm.internal.h.e(parent, "parent");
        CommentListFragment commentListFragment = this.f5725e;
        if (i9 == 0) {
            LayoutInflater from = LayoutInflater.from(parent.getContext());
            int i10 = O0.f3735F;
            O0 o02 = (O0) W.c.b(from, R.layout.item_comment, parent, false);
            kotlin.jvm.internal.h.d(o02, "inflate(...)");
            return new C0326b(o02, commentListFragment);
        }
        LayoutInflater from2 = LayoutInflater.from(parent.getContext());
        int i11 = s1.f4078D;
        s1 s1Var = (s1) W.c.b(from2, R.layout.item_reply_comment, parent, false);
        kotlin.jvm.internal.h.d(s1Var, "inflate(...)");
        return new C0328d(s1Var, commentListFragment);
    }
}
