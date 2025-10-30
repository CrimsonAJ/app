package androidx.mediarouter.app;

import F0.S;
import F0.r0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.notix.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z extends S {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10196d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f10197e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f10198f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f10199g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f10200h;

    /* renamed from: i, reason: collision with root package name */
    public final Drawable f10201i;
    public final /* synthetic */ A j;

    public z(A a5) {
        this.j = a5;
        this.f10197e = LayoutInflater.from(a5.f9925h);
        Context context = a5.f9925h;
        this.f10198f = s8.e.C(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f10199g = s8.e.C(context, R.attr.mediaRouteTvIconDrawable);
        this.f10200h = s8.e.C(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.f10201i = s8.e.C(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        n();
    }

    @Override // F0.S
    public final int a() {
        return this.f10196d.size();
    }

    @Override // F0.S
    public final int c(int i9) {
        return ((w) this.f10196d.get(i9)).f10188b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // F0.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(F0.r0 r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.c(r10)
            java.util.ArrayList r1 = r8.f10196d
            java.lang.Object r10 = r1.get(r10)
            androidx.mediarouter.app.w r10 = (androidx.mediarouter.app.w) r10
            r1 = 1
            if (r0 == r1) goto L89
            java.lang.String r2 = "RecyclerAdapter"
            r3 = 2
            if (r0 == r3) goto L1a
            java.lang.String r9 = "Cannot bind item to ViewHolder because of wrong view type"
            android.util.Log.w(r2, r9)
            return
        L1a:
            androidx.mediarouter.app.y r9 = (androidx.mediarouter.app.y) r9
            java.lang.Object r10 = r10.f10187a
            t0.C r10 = (t0.C) r10
            r0 = 0
            android.view.View r4 = r9.f10191u
            r4.setVisibility(r0)
            android.widget.ProgressBar r0 = r9.f10193w
            r5 = 4
            r0.setVisibility(r5)
            androidx.mediarouter.app.x r0 = new androidx.mediarouter.app.x
            r0.<init>(r9, r10)
            r4.setOnClickListener(r0)
            java.lang.String r0 = r10.f22843d
            android.widget.TextView r4 = r9.f10194x
            r4.setText(r0)
            androidx.mediarouter.app.z r0 = r9.f10195y
            r0.getClass()
            android.net.Uri r4 = r10.f22845f
            if (r4 == 0) goto L6a
            androidx.mediarouter.app.A r5 = r0.j     // Catch: java.io.IOException -> L58
            android.content.Context r5 = r5.f9925h     // Catch: java.io.IOException -> L58
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.io.IOException -> L58
            java.io.InputStream r5 = r5.openInputStream(r4)     // Catch: java.io.IOException -> L58
            r6 = 0
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r5, r6)     // Catch: java.io.IOException -> L58
            if (r2 == 0) goto L6a
            goto L83
        L58:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to load "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.w(r2, r4, r5)
        L6a:
            int r2 = r10.f22852n
            if (r2 == r1) goto L80
            if (r2 == r3) goto L7d
            boolean r10 = r10.e()
            if (r10 == 0) goto L7a
            android.graphics.drawable.Drawable r10 = r0.f10201i
        L78:
            r2 = r10
            goto L83
        L7a:
            android.graphics.drawable.Drawable r10 = r0.f10198f
            goto L78
        L7d:
            android.graphics.drawable.Drawable r10 = r0.f10200h
            goto L78
        L80:
            android.graphics.drawable.Drawable r10 = r0.f10199g
            goto L78
        L83:
            android.widget.ImageView r9 = r9.f10192v
            r9.setImageDrawable(r2)
            return
        L89:
            androidx.mediarouter.app.v r9 = (androidx.mediarouter.app.v) r9
            java.lang.Object r10 = r10.f10187a
            java.lang.String r10 = r10.toString()
            android.widget.TextView r9 = r9.f10186u
            r9.setText(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.z.g(F0.r0, int):void");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.mediarouter.app.v, F0.r0] */
    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflater = this.f10197e;
        if (i9 != 1) {
            if (i9 == 2) {
                return new y(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        ?? r0Var = new r0(inflate);
        r0Var.f10186u = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return r0Var;
    }

    public final void n() {
        ArrayList arrayList = this.f10196d;
        arrayList.clear();
        A a5 = this.j;
        arrayList.add(new w(a5.f9925h.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = a5.j;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            arrayList.add(new w((t0.C) obj));
        }
        d();
    }
}
