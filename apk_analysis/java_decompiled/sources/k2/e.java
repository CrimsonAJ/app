package k2;

import H2.v;
import J1.o1;
import M1.o;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import co.notix.R;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.material.button.MaterialButton;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import t1.C1992a;
import t1.C2004m;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: u, reason: collision with root package name */
    public final o1 f19888u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f19889v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, o1 o1Var) {
        super(o1Var);
        this.f19889v = fVar;
        this.f19888u = o1Var;
    }

    @Override // M1.o
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void r(v item) {
        boolean z9;
        String str;
        String str2;
        int i9;
        int i10;
        int i11;
        kotlin.jvm.internal.h.e(item, "item");
        Movie movie = item.j;
        if (movie != null && movie.f14428p) {
            z9 = true;
        } else {
            z9 = false;
        }
        o1 o1Var = this.f19888u;
        o1Var.f4035x.setText(this.f2210a.getResources().getString(R.string.format_episode, item.f3075c));
        String str3 = null;
        if (movie != null) {
            str = movie.f14416c;
        } else {
            str = null;
        }
        o1Var.f4036y.setText(str);
        String str4 = item.f3077e;
        if (str4 != null) {
            str2 = "N/A";
            if (!W7.d.U(str4)) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS", Locale.ENGLISH);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("en"));
                    Date parse = simpleDateFormat.parse(str4);
                    if (parse != null) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(parse);
                        str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 2));
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            str2 = null;
        }
        o1Var.f4037z.setText(str2);
        AppCompatImageView imageMovie = o1Var.f4034w;
        kotlin.jvm.internal.h.d(imageMovie, "imageMovie");
        if (movie != null) {
            str3 = movie.f14415b;
        }
        C2004m a5 = C1992a.a(imageMovie.getContext());
        C1.h hVar = new C1.h(imageMovie.getContext());
        hVar.f1179c = str3;
        hVar.b(imageMovie);
        hVar.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(r7.getResources().getDimensionPixelSize(R.dimen.dp_10))}));
        a5.b(hVar.a());
        f fVar = this.f19889v;
        o1Var.f4032B.setOnClickListener(new I5.k(item, 19, fVar));
        int i12 = android.R.color.transparent;
        int i13 = R.color.colorRed;
        if (z9) {
            i9 = R.color.colorRed;
        } else {
            i9 = 17170445;
        }
        MaterialButton materialButton = o1Var.f4033v;
        materialButton.setStrokeColorResource(i9);
        View view = o1Var.f7853k;
        Context context = view.getContext();
        if (!z9) {
            i12 = R.color.colorRed;
        }
        materialButton.setBackgroundColor(context.getColor(i12));
        if (z9) {
            i10 = R.drawable.ic_tick_red;
        } else {
            i10 = R.drawable.ic_add;
        }
        materialButton.setIconResource(i10);
        if (z9) {
            i11 = R.color.colorRed;
        } else {
            i11 = 17170443;
        }
        materialButton.setIconTintResource(i11);
        Context context2 = view.getContext();
        if (!z9) {
            i13 = 17170443;
        }
        materialButton.setTextColor(context2.getColor(i13));
        materialButton.setOnClickListener(new N1.e(item, fVar, this, 4));
    }
}
