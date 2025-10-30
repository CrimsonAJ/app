package X1;

import J1.Q0;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import co.notix.R;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import t1.C1992a;
import t1.C2004m;

/* renamed from: X1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433b extends M1.o {

    /* renamed from: u, reason: collision with root package name */
    public final Q0 f8250u;

    /* renamed from: v, reason: collision with root package name */
    public final B f8251v;

    /* renamed from: w, reason: collision with root package name */
    public final C f8252w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0433b(Q0 q02, B listener, C option) {
        super(q02);
        kotlin.jvm.internal.h.e(listener, "listener");
        kotlin.jvm.internal.h.e(option, "option");
        this.f8250u = q02;
        this.f8251v = listener;
        this.f8252w = option;
    }

    @Override // M1.o
    public final void r(Object obj) {
        String str;
        final int i9 = 0;
        final int i10 = 1;
        final H2.g gVar = (H2.g) obj;
        Q0 q02 = this.f8250u;
        AppCompatImageView imageMovie = q02.f3761w;
        kotlin.jvm.internal.h.d(imageMovie, "imageMovie");
        Movie movie = gVar.f3022i;
        if (movie != null) {
            str = movie.f14415b;
        } else {
            str = null;
        }
        C2004m a5 = C1992a.a(imageMovie.getContext());
        C1.h hVar = new C1.h(imageMovie.getContext());
        hVar.f1179c = str;
        hVar.b(imageMovie);
        View view = this.f2210a;
        hVar.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getContext().getResources().getDimension(R.dimen.dp_10))}));
        a5.b(hVar.a());
        q02.f3763y.setProgress(gVar.f3020g);
        q02.f3764z.setText(view.getResources().getString(R.string.format_episode, Integer.valueOf(gVar.f3018e)));
        q02.f7853k.setOnClickListener(new View.OnClickListener(this) { // from class: X1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0433b f8248b;

            {
                this.f8248b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        B b9 = this.f8248b.f8251v;
                        Boolean bool = Boolean.FALSE;
                        b9.invoke(gVar, bool, bool);
                        return;
                    default:
                        this.f8248b.f8252w.invoke(gVar.f3022i);
                        return;
                }
            }
        });
        q02.f3760v.setOnClickListener(new View.OnClickListener(this) { // from class: X1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0433b f8248b;

            {
                this.f8248b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        B b9 = this.f8248b.f8251v;
                        Boolean bool = Boolean.FALSE;
                        b9.invoke(gVar, bool, bool);
                        return;
                    default:
                        this.f8248b.f8252w.invoke(gVar.f3022i);
                        return;
                }
            }
        });
    }
}
