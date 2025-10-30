package k2;

import H2.v;
import J1.q1;
import M1.o;
import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import java.util.Arrays;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: u, reason: collision with root package name */
    public final q1 f19887u;

    public d(q1 q1Var) {
        super(q1Var);
        this.f19887u = q1Var;
    }

    @Override // M1.o
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void r(v item) {
        String str;
        kotlin.jvm.internal.h.e(item, "item");
        AppCompatTextView appCompatTextView = this.f19887u.f4060v;
        Resources resources = this.f2210a.getResources();
        Long l9 = item.f3079g;
        if (l9 != null) {
            long longValue = l9.longValue();
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.getTime().setTime(longValue * 1000);
                str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 2));
            } catch (Exception unused) {
                str = "N/A";
            }
        } else {
            str = null;
        }
        appCompatTextView.setText(resources.getString(R.string.format_current_calendar, str));
    }
}
