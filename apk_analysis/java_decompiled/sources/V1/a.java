package V1;

import J1.W0;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import com.anilab.domain.model.FilterConfig;

/* loaded from: classes.dex */
public final class a extends M1.o {

    /* renamed from: u, reason: collision with root package name */
    public final W0 f7617u;

    public a(W0 w02) {
        super(w02);
        this.f7617u = w02;
    }

    @Override // M1.o
    public final void r(Object obj) {
        W0 w02 = this.f7617u;
        w02.f3804v.setBackgroundResource(R.drawable.background_selected_calendar);
        int color = this.f2210a.getContext().getColor(R.color.white);
        AppCompatTextView appCompatTextView = w02.f3804v;
        appCompatTextView.setTextColor(color);
        appCompatTextView.setText(((FilterConfig) obj).f14403a);
    }
}
