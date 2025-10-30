package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1319e f18021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1316b f18022b;

    public C1315a(C1316b c1316b, C1319e c1319e) {
        this.f18022b = c1316b;
        this.f18021a = c1319e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j) {
        C1316b c1316b = this.f18022b;
        DialogInterface.OnClickListener onClickListener = c1316b.f18033l;
        C1319e c1319e = this.f18021a;
        onClickListener.onClick(c1319e.f18045b, i9);
        if (!c1316b.f18035n) {
            c1319e.f18045b.dismiss();
        }
    }
}
