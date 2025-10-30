package I5;

import B7.C0050a;
import F0.C0102f;
import G0.C0142h;
import H2.C0158a;
import H2.v;
import H2.x;
import J1.AbstractC0172e0;
import J1.AbstractC0176g;
import Q2.C0373p;
import Q2.C0380x;
import T1.C0389c;
import V1.p;
import X1.B;
import X1.C;
import X1.C0433b;
import X1.C0434c;
import X1.F;
import X1.G;
import a.AbstractC0485a;
import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.InterfaceC0561w;
import b2.C0595h;
import co.notix.R;
import co.notix.appopen.AppOpenActivity;
import co.notix.j6;
import co.notix.kg;
import co.notix.v5;
import com.anilab.android.ui.download.DownloadFragment;
import com.anilab.android.ui.home.HomeFragment;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import com.anilab.domain.model.Movie;
import com.anilab.domain.model.Shortcut;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.internal.measurement.Y1;
import d2.C1107a;
import d2.C1112f;
import g2.C1224a;
import g2.C1225b;
import g2.b0;
import g2.c0;
import i0.AbstractActivityC1369y;
import i0.AbstractComponentCallbacksC1366v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l2.C1550o;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3575c;

    public /* synthetic */ k(Object obj, int i9, Object obj2) {
        this.f3573a = i9;
        this.f3574b = obj;
        this.f3575c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0373p c0373p;
        ArrayList arrayList;
        Object h7;
        InterfaceC0561w interfaceC0561w;
        boolean z9;
        boolean z10;
        switch (this.f3573a) {
            case 0:
                l lVar = (l) this.f3574b;
                lVar.getClass();
                ((View.OnClickListener) this.f3575c).onClick(view);
                lVar.a(1);
                return;
            case 1:
                int i9 = 0;
                while (true) {
                    c0373p = (C0373p) this.f3574b;
                    arrayList = c0373p.f6288d;
                    if (i9 < arrayList.size()) {
                        MediaTrack mediaTrack = (MediaTrack) arrayList.get(i9);
                        if (mediaTrack.f14625a == c0373p.f6291g.f14625a) {
                            c0373p.f2055a.d(i9, 1, mediaTrack);
                        } else {
                            i9++;
                        }
                    }
                }
                C0380x c0380x = (C0380x) this.f3575c;
                MediaTrack mediaTrack2 = (MediaTrack) arrayList.get(c0380x.b());
                c0373p.f6291g = mediaTrack2;
                c0380x.f6309v.setSelected(true);
                c0380x.f6308u.setSelected(true);
                O.a aVar = c0373p.f6289e;
                if (aVar != null) {
                    if (mediaTrack2.f14625a == -1) {
                        mediaTrack2 = null;
                    }
                    aVar.a(mediaTrack2);
                }
                c0373p.f6292h.f6061I0.dismiss();
                return;
            case 2:
                AppCompatEditText appCompatEditText = ((AbstractC0176g) this.f3574b).f3937z;
                Editable text = appCompatEditText.getText();
                if (text != null && !W7.d.U(text)) {
                    appCompatEditText.setText("");
                    AbstractActivityC1369y k5 = ((DownloadFragment) this.f3575c).k();
                    if (k5 != null) {
                        Y1.p(k5);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((S1.a) this.f3574b).f6707e.invoke((C0158a) this.f3575c);
                return;
            case 4:
                C0389c c0389c = (C0389c) this.f3574b;
                int i10 = c0389c.f7010e;
                c0389c.f7010e = ((N1.d) this.f3575c).c();
                c0389c.e(i10);
                c0389c.e(c0389c.f7010e);
                return;
            case 5:
                U1.a aVar2 = (U1.a) this.f3574b;
                int i11 = aVar2.f7249e;
                N1.d dVar = (N1.d) this.f3575c;
                aVar2.f7249e = dVar.c();
                aVar2.e(i11);
                aVar2.e(dVar.c());
                return;
            case 6:
                ((p) this.f3574b).f7653e.invoke((Movie) this.f3575c);
                return;
            case 7:
                C0434c c0434c = (C0434c) this.f3574b;
                try {
                    h7 = (H2.g) c0434c.n(((C0433b) this.f3575c).b());
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (!(h7 instanceof A7.i)) {
                    H2.g gVar = (H2.g) h7;
                    B b9 = c0434c.f8254e;
                    kotlin.jvm.internal.h.b(gVar);
                    Boolean bool = Boolean.TRUE;
                    C0102f c0102f = c0434c.f2039d;
                    boolean z11 = true;
                    if (c0102f.f2100f.size() != 1) {
                        z11 = false;
                    }
                    b9.invoke(gVar, bool, Boolean.valueOf(z11));
                    List list = c0102f.f2100f;
                    kotlin.jvm.internal.h.d(list, "getCurrentList(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (!kotlin.jvm.internal.h.a(((H2.g) obj).f3016c, gVar.f3016c)) {
                            arrayList2.add(obj);
                        }
                    }
                    c0434c.o(arrayList2);
                }
                if (A7.j.a(h7) != null) {
                    c0434c.d();
                    return;
                }
                return;
            case 8:
                ((C) ((N1.d) this.f3574b).f4836v).invoke((Movie) this.f3575c);
                return;
            case 9:
                HomeFragment homeFragment = ((F) this.f3574b).f8241d;
                Shortcut shortcut = ((H2.l) this.f3575c).f3035a;
                homeFragment.getClass();
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = homeFragment.f18419v;
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
                    hostFragment.j0(new C0595h(shortcut));
                    return;
                }
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                Movie movie = ((G) this.f3574b).f8244v;
                if (movie != null) {
                    ((C0050a) this.f3575c).invoke(movie);
                    return;
                }
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                AppOpenActivity.a((AppOpenActivity) this.f3574b, (co.notix.i) this.f3575c, view);
                return;
            case 12:
                j6.a((j6) this.f3574b, (String) this.f3575c, view);
                return;
            case 13:
                v5.a((co.notix.i) this.f3574b, (kg) this.f3575c, view);
                return;
            case 14:
                C1107a c1107a = (C1107a) this.f3574b;
                c1107a.getClass();
                H2.i iVar = (H2.i) c1107a.f16769v;
                if (iVar != null) {
                    ((C1112f) this.f3575c).invoke(iVar);
                    return;
                }
                return;
            case 15:
                AppCompatEditText appCompatEditText2 = ((AbstractC0172e0) this.f3574b).f3895F;
                Editable text2 = appCompatEditText2.getText();
                if (text2 != null && !W7.d.U(text2)) {
                    appCompatEditText2.setText("");
                    AbstractActivityC1369y k9 = ((MovieDetailFragment) this.f3575c).k();
                    if (k9 != null) {
                        Y1.p(k9);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((C0142h) ((N1.d) this.f3574b).f4836v).invoke((Movie) this.f3575c);
                return;
            case 17:
                C1225b c1225b = (C1225b) this.f3574b;
                List list2 = c1225b.f2039d.f2100f;
                kotlin.jvm.internal.h.d(list2, "getCurrentList(...)");
                I2.a aVar3 = (I2.a) B7.k.r0(list2, ((C1224a) this.f3575c).b());
                if (aVar3 != null) {
                    List list3 = c1225b.f2039d.f2100f;
                    kotlin.jvm.internal.h.d(list3, "getCurrentList(...)");
                    Iterator it = list3.iterator();
                    int i12 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        long j = aVar3.f3444a;
                        if (hasNext) {
                            Object next = it.next();
                            int i13 = i12 + 1;
                            if (i12 >= 0) {
                                I2.a aVar4 = (I2.a) next;
                                boolean z12 = aVar4.j;
                                long j4 = aVar4.f3444a;
                                if (!z12 || j4 != j) {
                                    if (z12 && j4 != j) {
                                        aVar4.j = false;
                                        c1225b.e(i12);
                                    } else if (j4 == j) {
                                        c1225b.f17653h = i12;
                                        aVar4.j = true;
                                        c1225b.f2055a.d(i12, 1, aVar4);
                                    }
                                    i12 = i13;
                                } else {
                                    return;
                                }
                            } else {
                                B7.l.e0();
                                throw null;
                            }
                        } else {
                            ArrayList arrayList3 = c1225b.f17651f;
                            int size = arrayList3.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj2 = arrayList3.get(i14);
                                i14++;
                                I2.a aVar5 = (I2.a) obj2;
                                if (aVar5.f3444a == j) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                aVar5.j = z10;
                            }
                            ArrayList arrayList4 = c1225b.f17652g;
                            int size2 = arrayList4.size();
                            int i15 = 0;
                            while (i15 < size2) {
                                Object obj3 = arrayList4.get(i15);
                                i15++;
                                I2.a aVar6 = (I2.a) obj3;
                                if (aVar6.f3444a == j) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                aVar6.j = z9;
                            }
                            c1225b.f17650e.invoke(aVar3);
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 18:
                c0 c0Var = (c0) this.f3574b;
                List list4 = c0Var.f2039d.f2100f;
                kotlin.jvm.internal.h.d(list4, "getCurrentList(...)");
                int i16 = 0;
                for (Object obj4 : list4) {
                    int i17 = i16 + 1;
                    if (i16 >= 0) {
                        x xVar = (x) obj4;
                        if (i16 == ((b0) this.f3575c).b()) {
                            xVar.f3086b = true;
                            c0Var.f17660e.invoke(xVar.f3085a);
                        } else {
                            xVar.f3086b = false;
                        }
                        i16 = i17;
                    } else {
                        B7.l.e0();
                        throw null;
                    }
                }
                c0Var.f2055a.d(0, c0Var.a(), null);
                return;
            case 19:
                Movie movie2 = ((v) this.f3574b).j;
                if (movie2 != null) {
                    ((k2.f) this.f3575c).f19891e.invoke(movie2);
                    return;
                }
                return;
            case 20:
                ((C0142h) ((N1.d) this.f3574b).f4836v).invoke((Movie) this.f3575c);
                return;
            case 21:
                ((C1550o) this.f3574b).f20224e.invoke((Movie) this.f3575c);
                return;
            default:
                n2.h hVar = (n2.h) this.f3574b;
                int i18 = hVar.f21064e;
                hVar.f21064e = ((N1.d) this.f3575c).c();
                hVar.e(i18);
                hVar.e(hVar.f21064e);
                return;
        }
    }
}
