package R1;

import android.view.KeyEvent;
import android.widget.TextView;
import com.anilab.android.ui.download.DownloadFragment;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.internal.measurement.Y1;
import i0.AbstractActivityC1369y;

/* renamed from: R1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0383b implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6520b;

    public /* synthetic */ C0383b(int i9, Object obj) {
        this.f6519a = i9;
        this.f6520b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        AbstractActivityC1369y k5;
        AbstractActivityC1369y k9;
        Object obj = this.f6520b;
        switch (this.f6519a) {
            case 0:
                if (i9 == 6 && (k5 = ((DownloadFragment) obj).k()) != null) {
                    Y1.p(k5);
                }
                return false;
            case 1:
                if (i9 == 6 && (k9 = ((MovieDetailFragment) obj).k()) != null) {
                    Y1.p(k9);
                }
                return false;
            default:
                int i10 = PlayerActivity.f13798w0;
                if (i9 == 6) {
                    Y1.p((PlayerActivity) obj);
                }
                return false;
        }
    }
}
