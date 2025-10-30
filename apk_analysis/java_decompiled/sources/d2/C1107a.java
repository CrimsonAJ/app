package d2;

import J1.T0;
import J1.h1;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.android.ui.myList.MyListFragment;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import d2.C1107a;
import i0.AbstractComponentCallbacksC1366v;
import t1.C1992a;
import t1.C2004m;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1107a extends M1.o {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16768u = 1;

    /* renamed from: v, reason: collision with root package name */
    public Object f16769v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f16770w;

    /* renamed from: x, reason: collision with root package name */
    public Object f16771x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1107a(h1 h1Var, com.google.firebase.messaging.u listener) {
        super(h1Var);
        kotlin.jvm.internal.h.e(listener, "listener");
        this.f16769v = h1Var;
        this.f16770w = listener;
        final int i9 = 0;
        h1Var.f7853k.setOnClickListener(new View.OnClickListener(this) { // from class: e2.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1107a f17109b;

            {
                this.f17109b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC0561w interfaceC0561w;
                InterfaceC0561w interfaceC0561w2;
                switch (i9) {
                    case 0:
                        C1107a c1107a = this.f17109b;
                        Movie movie = (Movie) c1107a.f16771x;
                        if (movie != null) {
                            com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) c1107a.f16770w;
                            uVar.getClass();
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((MyListFragment) uVar.f16512a).f18419v;
                            HostFragment hostFragment = null;
                            if (abstractComponentCallbacksC1366v != null) {
                                interfaceC0561w = abstractComponentCallbacksC1366v.f18419v;
                            } else {
                                interfaceC0561w = null;
                            }
                            if (interfaceC0561w instanceof HostFragment) {
                                hostFragment = (HostFragment) interfaceC0561w;
                            }
                            if (hostFragment != null) {
                                HostFragment.y0(hostFragment, movie);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        C1107a c1107a2 = this.f17109b;
                        Movie movie2 = (Movie) c1107a2.f16771x;
                        if (movie2 != null) {
                            com.google.firebase.messaging.u uVar2 = (com.google.firebase.messaging.u) c1107a2.f16770w;
                            uVar2.getClass();
                            MyListFragment myListFragment = (MyListFragment) uVar2.f16512a;
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = myListFragment.f18419v;
                            HostFragment hostFragment2 = null;
                            if (abstractComponentCallbacksC1366v2 != null) {
                                interfaceC0561w2 = abstractComponentCallbacksC1366v2.f18419v;
                            } else {
                                interfaceC0561w2 = null;
                            }
                            if (interfaceC0561w2 instanceof HostFragment) {
                                hostFragment2 = (HostFragment) interfaceC0561w2;
                            }
                            if (hostFragment2 != null) {
                                hostFragment2.j0(new I1.p(movie2.f14433u));
                            }
                            myListFragment.t0().f17090n = movie2;
                            return;
                        }
                        return;
                }
            }
        });
        final int i10 = 1;
        h1Var.f3954w.setOnClickListener(new View.OnClickListener(this) { // from class: e2.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1107a f17109b;

            {
                this.f17109b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC0561w interfaceC0561w;
                InterfaceC0561w interfaceC0561w2;
                switch (i10) {
                    case 0:
                        C1107a c1107a = this.f17109b;
                        Movie movie = (Movie) c1107a.f16771x;
                        if (movie != null) {
                            com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) c1107a.f16770w;
                            uVar.getClass();
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = ((MyListFragment) uVar.f16512a).f18419v;
                            HostFragment hostFragment = null;
                            if (abstractComponentCallbacksC1366v != null) {
                                interfaceC0561w = abstractComponentCallbacksC1366v.f18419v;
                            } else {
                                interfaceC0561w = null;
                            }
                            if (interfaceC0561w instanceof HostFragment) {
                                hostFragment = (HostFragment) interfaceC0561w;
                            }
                            if (hostFragment != null) {
                                HostFragment.y0(hostFragment, movie);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        C1107a c1107a2 = this.f17109b;
                        Movie movie2 = (Movie) c1107a2.f16771x;
                        if (movie2 != null) {
                            com.google.firebase.messaging.u uVar2 = (com.google.firebase.messaging.u) c1107a2.f16770w;
                            uVar2.getClass();
                            MyListFragment myListFragment = (MyListFragment) uVar2.f16512a;
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = myListFragment.f18419v;
                            HostFragment hostFragment2 = null;
                            if (abstractComponentCallbacksC1366v2 != null) {
                                interfaceC0561w2 = abstractComponentCallbacksC1366v2.f18419v;
                            } else {
                                interfaceC0561w2 = null;
                            }
                            if (interfaceC0561w2 instanceof HostFragment) {
                                hostFragment2 = (HostFragment) interfaceC0561w2;
                            }
                            if (hostFragment2 != null) {
                                hostFragment2.j0(new I1.p(movie2.f14433u));
                            }
                            myListFragment.t0().f17090n = movie2;
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // M1.o
    public final void r(Object obj) {
        int i9;
        int i10 = 8;
        View view = this.f2210a;
        switch (this.f16768u) {
            case 0:
                H2.i iVar = (H2.i) obj;
                this.f16769v = iVar;
                T0 t02 = (T0) this.f16770w;
                t02.f3779w.setText(view.getResources().getString(R.string.format_episode, Integer.valueOf(iVar.f3028c)));
                AppCompatImageView imageMovie = t02.f3778v;
                kotlin.jvm.internal.h.d(imageMovie, "imageMovie");
                String str = ((C1108b) this.f16771x).f16773e.f14415b;
                C2004m a5 = C1992a.a(imageMovie.getContext());
                C1.h hVar = new C1.h(imageMovie.getContext());
                hVar.f1179c = str;
                hVar.b(imageMovie);
                hVar.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getResources().getDimensionPixelSize(R.dimen.dp_10))}));
                a5.b(hVar.a());
                AppCompatTextView textFiller = t02.f3780x;
                kotlin.jvm.internal.h.d(textFiller, "textFiller");
                if (iVar.f3030e) {
                    i10 = 0;
                }
                textFiller.setVisibility(i10);
                return;
            default:
                Movie movie = (Movie) obj;
                this.f16771x = movie;
                h1 h1Var = (h1) this.f16769v;
                AppCompatImageView imageMovie2 = h1Var.f3953v;
                kotlin.jvm.internal.h.d(imageMovie2, "imageMovie");
                C2004m a9 = C1992a.a(imageMovie2.getContext());
                C1.h hVar2 = new C1.h(imageMovie2.getContext());
                hVar2.f1179c = movie.f14415b;
                hVar2.b(imageMovie2);
                hVar2.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getResources().getDimensionPixelSize(R.dimen.dp_12))}));
                a9.b(hVar2.a());
                h1Var.f3952A.setText(movie.f14416c);
                h1Var.f3956y.setText(view.getResources().getString(R.string.format_episode, Integer.valueOf(movie.f14423k)));
                String str2 = movie.f14431s;
                AppCompatTextView appCompatTextView = h1Var.f3957z;
                appCompatTextView.setText(str2);
                if (!W7.d.U(str2)) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                appCompatTextView.setVisibility(i9);
                AppCompatImageView imagePin = h1Var.f3955x;
                kotlin.jvm.internal.h.d(imagePin, "imagePin");
                if (movie.f14433u) {
                    i10 = 0;
                }
                imagePin.setVisibility(i10);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1107a(C1108b c1108b, T0 t02, C1112f listener) {
        super(t02);
        kotlin.jvm.internal.h.e(listener, "listener");
        this.f16771x = c1108b;
        this.f16770w = t02;
        t02.f7853k.setOnClickListener(new I5.k(this, 14, listener));
    }
}
