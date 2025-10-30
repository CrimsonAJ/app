package Q2;

import F0.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.notix.R;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;

/* renamed from: Q2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373p extends F0.S {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6288d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public O.a f6289e;

    /* renamed from: f, reason: collision with root package name */
    public final MediaTrack f6290f;

    /* renamed from: g, reason: collision with root package name */
    public MediaTrack f6291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D f6292h;

    public C0373p(D d9) {
        this.f6292h = d9;
        MediaTrack mediaTrack = new MediaTrack(-1L, 0, null, null, null, null, 0, null, null);
        this.f6290f = mediaTrack;
        this.f6291g = mediaTrack;
    }

    @Override // F0.S
    public final int a() {
        return this.f6288d.size();
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        boolean z9;
        boolean z10;
        C0380x c0380x = (C0380x) r0Var;
        MediaTrack mediaTrack = (MediaTrack) this.f6288d.get(i9);
        long j = mediaTrack.f14625a;
        View view = c0380x.f6309v;
        TextView textView = c0380x.f6308u;
        boolean z11 = false;
        if (j != -1) {
            textView.setText(mediaTrack.f14629e);
            long j4 = this.f6291g.f14625a;
            long j9 = mediaTrack.f14625a;
            if (j9 == j4) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setSelected(z10);
            if (j9 == this.f6291g.f14625a) {
                z11 = true;
            }
            view.setSelected(z11);
        } else {
            textView.setText(R.string.exo_track_selection_none);
            if (this.f6291g.f14625a == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            textView.setSelected(z9);
            if (this.f6291g.f14625a == -1) {
                z11 = true;
            }
            view.setSelected(z11);
        }
        c0380x.f2210a.setOnClickListener(new I5.k(this, 1, c0380x));
    }

    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        return new C0380x(LayoutInflater.from(this.f6292h.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
