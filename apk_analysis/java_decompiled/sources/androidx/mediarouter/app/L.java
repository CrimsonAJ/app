package androidx.mediarouter.app;

import F0.S;
import F0.r0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import co.notix.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t0.C1966B;
import t0.C1983q;
import t0.C1991z;

/* loaded from: classes.dex */
public final class L extends S {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9971d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f9972e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f9973f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f9974g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f9975h;

    /* renamed from: i, reason: collision with root package name */
    public final Drawable f9976i;
    public J j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9977k;

    /* renamed from: l, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f9978l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f9979m;

    public L(N n7) {
        this.f9979m = n7;
        this.f9972e = LayoutInflater.from(n7.f10030n);
        Context context = n7.f10030n;
        this.f9973f = s8.e.C(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f9974g = s8.e.C(context, R.attr.mediaRouteTvIconDrawable);
        this.f9975h = s8.e.C(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.f9976i = s8.e.C(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.f9977k = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.f9978l = new AccelerateDecelerateInterpolator();
        q();
    }

    @Override // F0.S
    public final int a() {
        return this.f9971d.size() + 1;
    }

    @Override // F0.S
    public final int c(int i9) {
        J j;
        if (i9 == 0) {
            j = this.j;
        } else {
            j = (J) this.f9971d.get(i9 - 1);
        }
        return j.f9960b;
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        J j;
        J j4;
        boolean z9;
        C1991z a5;
        C1983q c1983q;
        boolean z10;
        float f9;
        ArrayList arrayList = this.f9971d;
        if (i9 == 0) {
            j = this.j;
        } else {
            j = (J) arrayList.get(i9 - 1);
        }
        int i10 = j.f9960b;
        boolean z11 = true;
        if (i9 == 0) {
            j4 = this.j;
        } else {
            j4 = (J) arrayList.get(i9 - 1);
        }
        N n7 = this.f9979m;
        int i11 = 0;
        if (i10 != 1) {
            if (i10 != 2) {
                float f10 = 1.0f;
                if (i10 != 3) {
                    if (i10 == 4) {
                        G g9 = (G) r0Var;
                        t0.C c3 = (t0.C) j4.f9959a;
                        g9.f9954z = c3;
                        ImageView imageView = g9.f9950v;
                        imageView.setVisibility(0);
                        g9.f9951w.setVisibility(4);
                        L l9 = g9.f9948A;
                        List unmodifiableList = Collections.unmodifiableList(l9.f9979m.f10021i.f22860v);
                        if (unmodifiableList.size() == 1 && unmodifiableList.get(0) == c3) {
                            f10 = g9.f9953y;
                        }
                        View view = g9.f9949u;
                        view.setAlpha(f10);
                        view.setOnClickListener(new D(3, g9));
                        imageView.setImageDrawable(l9.o(c3));
                        g9.f9952x.setText(c3.f22843d);
                        return;
                    }
                    throw new IllegalStateException();
                }
                n7.f10042v.put(((t0.C) j4.f9959a).f22842c, (E) r0Var);
                K k5 = (K) r0Var;
                t0.C c9 = (t0.C) j4.f9959a;
                L l10 = k5.f9968H;
                N n9 = l10.f9979m;
                if (c9 == n9.f10021i && Collections.unmodifiableList(c9.f22860v).size() > 0) {
                    Iterator it = Collections.unmodifiableList(c9.f22860v).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        t0.C c10 = (t0.C) it.next();
                        if (!n9.f10024k.contains(c10)) {
                            c9 = c10;
                            break;
                        }
                    }
                }
                k5.r(c9);
                Drawable o9 = l10.o(c9);
                ImageView imageView2 = k5.f9970z;
                imageView2.setImageDrawable(o9);
                k5.f9962B.setText(c9.f22843d);
                CheckBox checkBox = k5.f9964D;
                checkBox.setVisibility(0);
                boolean t7 = k5.t(c9);
                if (n9.f10028m.contains(c9) || ((k5.t(c9) && Collections.unmodifiableList(n9.f10021i.f22860v).size() < 2) || (k5.t(c9) && ((a5 = n9.f10021i.a()) == null || (c1983q = (C1983q) a5.f23055x.get(c9.f22842c)) == null || !c1983q.f23025c)))) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                checkBox.setChecked(t7);
                k5.f9961A.setVisibility(4);
                imageView2.setVisibility(0);
                View view2 = k5.f9969y;
                view2.setEnabled(z9);
                checkBox.setEnabled(z9);
                if (!z9 && !t7) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                k5.f9943v.setEnabled(z10);
                if (!z9 && !t7) {
                    z11 = false;
                }
                k5.f9944w.setEnabled(z11);
                D d9 = k5.f9967G;
                view2.setOnClickListener(d9);
                checkBox.setOnClickListener(d9);
                if (t7 && !k5.f9942u.e()) {
                    i11 = k5.f9966F;
                }
                RelativeLayout relativeLayout = k5.f9963C;
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.height = i11;
                relativeLayout.setLayoutParams(layoutParams);
                float f11 = k5.f9965E;
                if (!z9 && !t7) {
                    f9 = f11;
                } else {
                    f9 = 1.0f;
                }
                view2.setAlpha(f9);
                if (!z9 && t7) {
                    f10 = f11;
                }
                checkBox.setAlpha(f10);
                return;
            }
            ((I) r0Var).f9958u.setText(j4.f9959a.toString());
            return;
        }
        n7.f10042v.put(((t0.C) j4.f9959a).f22842c, (E) r0Var);
        H h7 = (H) r0Var;
        N n10 = h7.f9955A.f9979m;
        if (n10.f10037q0 && Collections.unmodifiableList(n10.f10021i.f22860v).size() > 1) {
            i11 = h7.f9957z;
        }
        View view3 = h7.f2210a;
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = i11;
        view3.setLayoutParams(layoutParams2);
        t0.C c11 = (t0.C) j4.f9959a;
        h7.r(c11);
        h7.f9956y.setText(c11.f22843d);
    }

    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflater = this.f9972e;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        return new G(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
                    }
                    throw new IllegalStateException();
                }
                return new K(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
            }
            return new I(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        return new H(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
    }

    @Override // F0.S
    public final void l(r0 r0Var) {
        this.f9979m.f10042v.values().remove(r0Var);
    }

    public final void n(View view, int i9) {
        C0575k c0575k = new C0575k(i9, view.getLayoutParams().height, 1, view);
        c0575k.setAnimationListener(new AnimationAnimationListenerC0577m(2, this));
        c0575k.setDuration(this.f9977k);
        c0575k.setInterpolator(this.f9978l);
        view.startAnimation(c0575k);
    }

    public final Drawable o(t0.C c3) {
        Uri uri = c3.f22845f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.f9979m.f10030n.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e8) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e8);
            }
        }
        int i9 = c3.f22852n;
        if (i9 != 1) {
            if (i9 != 2) {
                if (c3.e()) {
                    return this.f9976i;
                }
                return this.f9973f;
            }
            return this.f9975h;
        }
        return this.f9974g;
    }

    public final void p() {
        N n7 = this.f9979m;
        ArrayList arrayList = n7.f10028m;
        arrayList.clear();
        ArrayList arrayList2 = n7.f10024k;
        ArrayList arrayList3 = new ArrayList();
        C1991z a5 = n7.f10021i.a();
        if (a5 != null) {
            C1966B c1966b = n7.f10021i.f22840a;
            c1966b.getClass();
            t0.D.b();
            for (t0.C c3 : Collections.unmodifiableList(c1966b.f22836b)) {
                if (a5.o(c3)) {
                    arrayList3.add(c3);
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        d();
    }

    public final void q() {
        String str;
        String str2;
        ArrayList arrayList = this.f9971d;
        arrayList.clear();
        N n7 = this.f9979m;
        this.j = new J(1, n7.f10021i);
        ArrayList arrayList2 = n7.j;
        boolean z9 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                arrayList.add(new J(3, (t0.C) obj));
            }
        } else {
            arrayList.add(new J(3, n7.f10021i));
        }
        ArrayList arrayList3 = n7.f10024k;
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                t0.C c3 = (t0.C) obj2;
                if (!arrayList2.contains(c3)) {
                    if (!z10) {
                        n7.f10021i.getClass();
                        t0.r b9 = t0.C.b();
                        if (b9 != null) {
                            str2 = b9.j();
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str2 = n7.f10030n.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new J(2, str2));
                        z10 = true;
                    }
                    arrayList.add(new J(3, c3));
                }
            }
        }
        ArrayList arrayList4 = n7.f10026l;
        if (!arrayList4.isEmpty()) {
            int size3 = arrayList4.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList4.get(i11);
                i11++;
                t0.C c9 = (t0.C) obj3;
                t0.C c10 = n7.f10021i;
                if (c10 != c9) {
                    if (!z9) {
                        c10.getClass();
                        t0.r b10 = t0.C.b();
                        if (b10 != null) {
                            str = b10.k();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = n7.f10030n.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new J(2, str));
                        z9 = true;
                    }
                    arrayList.add(new J(4, c9));
                }
            }
        }
        p();
    }
}
