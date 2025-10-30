package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import l6.AbstractC1570b;
import s.C1935e;
import t0.C1966B;
import t0.C1983q;
import t0.C1988w;
import t0.C1991z;

/* loaded from: classes.dex */
public final class N extends i.y {
    public static final /* synthetic */ int r0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f10009A;

    /* renamed from: B, reason: collision with root package name */
    public ImageButton f10010B;

    /* renamed from: C, reason: collision with root package name */
    public Button f10011C;

    /* renamed from: D, reason: collision with root package name */
    public ImageView f10012D;

    /* renamed from: X, reason: collision with root package name */
    public View f10013X;
    public ImageView Y;

    /* renamed from: Z, reason: collision with root package name */
    public TextView f10014Z;

    /* renamed from: f, reason: collision with root package name */
    public final t0.D f10015f;

    /* renamed from: f0, reason: collision with root package name */
    public TextView f10016f0;

    /* renamed from: g, reason: collision with root package name */
    public final F f10017g;

    /* renamed from: g0, reason: collision with root package name */
    public String f10018g0;

    /* renamed from: h, reason: collision with root package name */
    public C1988w f10019h;

    /* renamed from: h0, reason: collision with root package name */
    public O0.c f10020h0;

    /* renamed from: i, reason: collision with root package name */
    public t0.C f10021i;

    /* renamed from: i0, reason: collision with root package name */
    public final p f10022i0;
    public final ArrayList j;

    /* renamed from: j0, reason: collision with root package name */
    public MediaDescriptionCompat f10023j0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f10024k;

    /* renamed from: k0, reason: collision with root package name */
    public C f10025k0;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f10026l;

    /* renamed from: l0, reason: collision with root package name */
    public Bitmap f10027l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f10028m;

    /* renamed from: m0, reason: collision with root package name */
    public Uri f10029m0;

    /* renamed from: n, reason: collision with root package name */
    public final Context f10030n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f10031n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10032o;

    /* renamed from: o0, reason: collision with root package name */
    public Bitmap f10033o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10034p;

    /* renamed from: p0, reason: collision with root package name */
    public int f10035p0;

    /* renamed from: q, reason: collision with root package name */
    public long f10036q;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f10037q0;

    /* renamed from: r, reason: collision with root package name */
    public final C3.e f10038r;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f10039s;

    /* renamed from: t, reason: collision with root package name */
    public L f10040t;

    /* renamed from: u, reason: collision with root package name */
    public M f10041u;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f10042v;

    /* renamed from: w, reason: collision with root package name */
    public t0.C f10043w;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f10044x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10045y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10046z;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = s8.e.q(r2, r0)
            r0 = 2130969431(0x7f040357, float:1.7547544E38)
            int r0 = s8.e.H(r2, r0)
            if (r0 != 0) goto L12
            int r0 = s8.e.E(r2)
        L12:
            r1.<init>(r2, r0)
            t0.w r2 = t0.C1988w.f23046c
            r1.f10019h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10024k = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10026l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10028m = r2
            C3.e r2 = new C3.e
            r0 = 4
            r2.<init>(r0, r1)
            r1.f10038r = r2
            android.content.Context r2 = r1.getContext()
            r1.f10030n = r2
            t0.D r2 = t0.D.d(r2)
            r1.f10015f = r2
            boolean r2 = t0.D.g()
            r1.f10037q0 = r2
            androidx.mediarouter.app.F r2 = new androidx.mediarouter.app.F
            r0 = 0
            r2.<init>(r1, r0)
            r1.f10017g = r2
            t0.C r2 = t0.D.f()
            r1.f10021i = r2
            androidx.mediarouter.app.p r2 = new androidx.mediarouter.app.p
            r0 = 1
            r2.<init>(r1, r0)
            r1.f10022i0 = r2
            android.support.v4.media.session.MediaSessionCompat$Token r2 = t0.D.e()
            r1.h(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.N.<init>(android.content.Context):void");
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            t0.C c3 = (t0.C) list.get(size);
            if (c3.d() || !c3.f22846g || !c3.h(this.f10019h) || this.f10021i == c3) {
                list.remove(size);
            }
        }
    }

    public final void g() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f10023j0;
        Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f9244e;
        }
        if (mediaDescriptionCompat != null) {
            uri2 = mediaDescriptionCompat.f9245f;
        }
        C c3 = this.f10025k0;
        if (c3 == null) {
            bitmap2 = this.f10027l0;
        } else {
            bitmap2 = c3.f9936a;
        }
        if (c3 == null) {
            uri = this.f10029m0;
        } else {
            uri = c3.f9937b;
        }
        if (bitmap2 == bitmap && (bitmap2 != null || Objects.equals(uri, uri2))) {
            return;
        }
        C c9 = this.f10025k0;
        if (c9 != null) {
            c9.cancel(true);
        }
        C c10 = new C(this);
        this.f10025k0 = c10;
        c10.execute(new Void[0]);
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        O0.c cVar = this.f10020h0;
        p pVar = this.f10022i0;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (cVar != null) {
            cVar.R(pVar);
            this.f10020h0 = null;
        }
        if (mediaSessionCompat$Token == null || !this.f10034p) {
            return;
        }
        O0.c cVar2 = new O0.c(this.f10030n, mediaSessionCompat$Token);
        this.f10020h0 = cVar2;
        cVar2.L(pVar);
        MediaMetadata metadata = ((android.support.v4.media.session.h) this.f10020h0.f5263b).f9304a.getMetadata();
        if (metadata != null) {
            C1935e c1935e = MediaMetadataCompat.f9249d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.f9254b = metadata;
        } else {
            mediaMetadataCompat = null;
        }
        if (mediaMetadataCompat != null) {
            mediaDescriptionCompat = mediaMetadataCompat.a();
        }
        this.f10023j0 = mediaDescriptionCompat;
        g();
        k();
    }

    public final void i(C1988w c1988w) {
        if (c1988w != null) {
            if (!this.f10019h.equals(c1988w)) {
                this.f10019h = c1988w;
                if (this.f10034p) {
                    t0.D d9 = this.f10015f;
                    F f9 = this.f10017g;
                    d9.h(f9);
                    d9.a(c1988w, f9, 1);
                    l();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void j() {
        int e8;
        Context context = this.f10030n;
        int i9 = -1;
        if (!context.getResources().getBoolean(R.bool.is_tablet)) {
            e8 = -1;
        } else {
            e8 = AbstractC1570b.e(context);
        }
        if (context.getResources().getBoolean(R.bool.is_tablet)) {
            i9 = -2;
        }
        getWindow().setLayout(e8, i9);
        this.f10027l0 = null;
        this.f10029m0 = null;
        g();
        k();
        m();
    }

    public final void k() {
        boolean z9;
        CharSequence charSequence;
        Bitmap bitmap;
        if (this.f10043w == null && !this.f10045y) {
            z9 = !this.f10032o;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f10009A = true;
            return;
        }
        this.f10009A = false;
        if (!this.f10021i.g() || this.f10021i.d()) {
            dismiss();
        }
        CharSequence charSequence2 = null;
        if (this.f10031n0 && (((bitmap = this.f10033o0) == null || !bitmap.isRecycled()) && this.f10033o0 != null)) {
            this.Y.setVisibility(0);
            this.Y.setImageBitmap(this.f10033o0);
            this.Y.setBackgroundColor(this.f10035p0);
            this.f10013X.setVisibility(0);
            Bitmap bitmap2 = this.f10033o0;
            RenderScript create = RenderScript.create(this.f10030n);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap2.copy(bitmap2.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.f10012D.setImageBitmap(copy);
        } else {
            Bitmap bitmap3 = this.f10033o0;
            if (bitmap3 != null && bitmap3.isRecycled()) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f10033o0);
            }
            this.Y.setVisibility(8);
            this.f10013X.setVisibility(8);
            this.f10012D.setImageBitmap(null);
        }
        this.f10031n0 = false;
        this.f10033o0 = null;
        this.f10035p0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.f10023j0;
        if (mediaDescriptionCompat == null) {
            charSequence = null;
        } else {
            charSequence = mediaDescriptionCompat.f9241b;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f10023j0;
        if (mediaDescriptionCompat2 != null) {
            charSequence2 = mediaDescriptionCompat2.f9242c;
        }
        boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
        if (!isEmpty) {
            this.f10014Z.setText(charSequence);
        } else {
            this.f10014Z.setText(this.f10018g0);
        }
        if (!isEmpty2) {
            this.f10016f0.setText(charSequence2);
            this.f10016f0.setVisibility(0);
        } else {
            this.f10016f0.setVisibility(8);
        }
    }

    public final void l() {
        ArrayList arrayList = this.j;
        arrayList.clear();
        ArrayList arrayList2 = this.f10024k;
        arrayList2.clear();
        ArrayList arrayList3 = this.f10026l;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.f10021i.f22860v));
        C1991z a5 = this.f10021i.a();
        if (a5 != null) {
            C1966B c1966b = this.f10021i.f22840a;
            c1966b.getClass();
            t0.D.b();
            for (t0.C c3 : Collections.unmodifiableList(c1966b.f22836b)) {
                if (a5.o(c3)) {
                    arrayList2.add(c3);
                }
                C1983q c1983q = (C1983q) a5.f23055x.get(c3.f22842c);
                if (c1983q != null && c1983q.f23027e) {
                    arrayList3.add(c3);
                }
            }
        }
        f(arrayList2);
        f(arrayList3);
        C0567c c0567c = C0567c.f10069d;
        Collections.sort(arrayList, c0567c);
        Collections.sort(arrayList2, c0567c);
        Collections.sort(arrayList3, c0567c);
        this.f10040t.q();
    }

    public final void m() {
        boolean z9;
        if (this.f10034p) {
            if (SystemClock.uptimeMillis() - this.f10036q >= 300) {
                if (this.f10043w == null && !this.f10045y) {
                    z9 = !this.f10032o;
                } else {
                    z9 = true;
                }
                if (z9) {
                    this.f10046z = true;
                    return;
                }
                this.f10046z = false;
                if (!this.f10021i.g() || this.f10021i.d()) {
                    dismiss();
                }
                this.f10036q = SystemClock.uptimeMillis();
                this.f10040t.p();
                return;
            }
            C3.e eVar = this.f10038r;
            eVar.removeMessages(1);
            eVar.sendEmptyMessageAtTime(1, this.f10036q + 300);
        }
    }

    public final void n() {
        if (this.f10046z) {
            m();
        }
        if (this.f10009A) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10034p = true;
        this.f10015f.a(this.f10019h, this.f10017g, 1);
        l();
        h(t0.D.e());
    }

    @Override // i.y, d.DialogC1072m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i9;
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        Context context = this.f10030n;
        View decorView = getWindow().getDecorView();
        if (s8.e.K(context)) {
            i9 = R.color.mr_dynamic_dialog_background_light;
        } else {
            i9 = R.color.mr_dynamic_dialog_background_dark;
        }
        decorView.setBackgroundColor(context.getColor(i9));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.f10010B = imageButton;
        imageButton.setColorFilter(-1);
        this.f10010B.setOnClickListener(new B(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.f10011C = button;
        button.setTextColor(-1);
        this.f10011C.setOnClickListener(new B(this, 1));
        this.f10040t = new L(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.f10039s = recyclerView;
        recyclerView.setAdapter(this.f10040t);
        this.f10039s.setLayoutManager(new LinearLayoutManager(1));
        this.f10041u = new M(this);
        this.f10042v = new HashMap();
        this.f10044x = new HashMap();
        this.f10012D = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.f10013X = findViewById(R.id.mr_cast_meta_black_scrim);
        this.Y = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.f10014Z = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.f10016f0 = textView2;
        textView2.setTextColor(-1);
        this.f10018g0 = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.f10032o = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10034p = false;
        this.f10015f.h(this.f10017g);
        this.f10038r.removeCallbacksAndMessages(null);
        h(null);
    }
}
