package androidx.mediarouter.app;

import a.AbstractC0485a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import co.notix.R;
import java.util.ArrayList;

/* renamed from: androidx.mediarouter.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566b extends ArrayAdapter implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutInflater f10062a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f10063b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f10064c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f10065d;

    /* renamed from: e, reason: collision with root package name */
    public final Drawable f10066e;

    public C0566b(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f10062a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.f10063b = AbstractC0485a.q(context, obtainStyledAttributes.getResourceId(0, 0));
        this.f10064c = AbstractC0485a.q(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f10065d = AbstractC0485a.q(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f10066e = AbstractC0485a.q(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r0 != null) goto L31;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto Lc
            android.view.LayoutInflater r8 = r6.f10062a
            r1 = 2131558562(0x7f0d00a2, float:1.8742443E38)
            android.view.View r8 = r8.inflate(r1, r9, r0)
        Lc:
            java.lang.Object r7 = r6.getItem(r7)
            t0.C r7 = (t0.C) r7
            r9 = 2131362411(0x7f0a026b, float:1.8344602E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131362409(0x7f0a0269, float:1.8344598E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r7.f22843d
            r9.setText(r2)
            java.lang.String r2 = r7.f22844e
            int r3 = r7.f22848i
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L33
            if (r3 != r4) goto L45
        L33:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L45
            r3 = 80
            r9.setGravity(r3)
            r1.setVisibility(r0)
            r1.setText(r2)
            goto L54
        L45:
            r0 = 16
            r9.setGravity(r0)
            r9 = 8
            r1.setVisibility(r9)
            java.lang.String r9 = ""
            r1.setText(r9)
        L54:
            boolean r9 = r7.f22846g
            r8.setEnabled(r9)
            r9 = 2131362410(0x7f0a026a, float:1.83446E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto Lac
            android.net.Uri r0 = r7.f22845f
            if (r0 == 0) goto L90
            android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L7c
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L7c
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L7c
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L7c
            if (r0 == 0) goto L90
            goto La9
        L7c:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to load "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MediaRouteChooserDialog"
            android.util.Log.w(r2, r0, r1)
        L90:
            int r0 = r7.f22852n
            if (r0 == r4) goto La6
            if (r0 == r5) goto La3
            boolean r7 = r7.e()
            if (r7 == 0) goto La0
            android.graphics.drawable.Drawable r7 = r6.f10066e
        L9e:
            r0 = r7
            goto La9
        La0:
            android.graphics.drawable.Drawable r7 = r6.f10063b
            goto L9e
        La3:
            android.graphics.drawable.Drawable r7 = r6.f10065d
            goto L9e
        La6:
            android.graphics.drawable.Drawable r7 = r6.f10064c
            goto L9e
        La9:
            r9.setImageDrawable(r0)
        Lac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C0566b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i9) {
        return ((t0.C) getItem(i9)).f22846g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j) {
        t0.C c3 = (t0.C) getItem(i9);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        c3.l(true);
    }
}
