package N1;

import F0.AbstractC0098c;
import H2.C0158a;
import H2.z;
import co.notix.R;
import com.anilab.domain.model.FilterConfig;
import com.anilab.domain.model.Genre;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class b extends AbstractC0098c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4831d;

    public /* synthetic */ b(int i9) {
        this.f4831d = i9;
    }

    @Override // F0.AbstractC0098c
    public final boolean a(Object obj, Object obj2) {
        String str;
        switch (this.f4831d) {
            case 0:
                Movie movie = (Movie) obj;
                Movie movie2 = (Movie) obj2;
                if (kotlin.jvm.internal.h.a(movie.f14415b, movie2.f14415b) && kotlin.jvm.internal.h.a(movie.f14431s, movie2.f14431s) && kotlin.jvm.internal.h.a(movie.f14432t, movie2.f14432t) && kotlin.jvm.internal.h.a(movie.a(), movie2.a()) && kotlin.jvm.internal.h.a(movie.f14416c, movie2.f14416c) && movie.f14420g == movie2.f14420g && movie.f14428p == movie2.f14428p) {
                    return true;
                }
                return false;
            case 1:
                return ((H2.c) obj).equals((H2.c) obj2);
            case 2:
                if (((H2.i) obj).f3028c == ((H2.i) obj2).f3028c) {
                    return true;
                }
                return false;
            case 3:
                return ((C0158a) obj).f2979b.equals(((C0158a) obj2).f2979b);
            case 4:
                if (((H2.t) obj).f3057a == ((H2.t) obj2).f3057a) {
                    return true;
                }
                return false;
            case 5:
                return kotlin.jvm.internal.h.a(((FilterConfig) obj).f14403a, ((FilterConfig) obj2).f14403a);
            case 6:
                return kotlin.jvm.internal.h.a(((Genre) obj).f14406b, ((Genre) obj2).f14406b);
            case 7:
                H2.g gVar = (H2.g) obj;
                H2.g gVar2 = (H2.g) obj2;
                if (gVar.f3020g == gVar2.f3020g && gVar.f3019f == gVar2.f3019f && gVar.f3018e == gVar2.f3018e) {
                    String str2 = null;
                    Movie movie3 = gVar.f3022i;
                    if (movie3 != null) {
                        str = movie3.f14415b;
                    } else {
                        str = null;
                    }
                    Movie movie4 = gVar2.f3022i;
                    if (movie4 != null) {
                        str2 = movie4.f14415b;
                    }
                    if (kotlin.jvm.internal.h.a(str, str2)) {
                        return true;
                    }
                }
                return false;
            case 8:
                Movie movie5 = (Movie) obj;
                Movie movie6 = (Movie) obj2;
                if (kotlin.jvm.internal.h.a(movie5.f14431s, movie6.f14431s) && kotlin.jvm.internal.h.a(movie5.f14432t, movie6.f14432t) && kotlin.jvm.internal.h.a(movie5.f14415b, movie6.f14415b)) {
                    return true;
                }
                return false;
            case 9:
                if (((H2.i) obj).f3028c == ((H2.i) obj2).f3028c) {
                    return true;
                }
                return false;
            case R.styleable.GradientColor_android_endX /* 10 */:
                Movie movie7 = (Movie) obj;
                Movie movie8 = (Movie) obj2;
                if (kotlin.jvm.internal.h.a(movie7.f14415b, movie8.f14415b) && movie7.f14433u == movie8.f14433u && kotlin.jvm.internal.h.a(movie7.f14431s, movie8.f14431s)) {
                    return true;
                }
                return false;
            case R.styleable.GradientColor_android_endY /* 11 */:
                if (((I2.a) obj).f3445b == ((I2.a) obj2).f3445b) {
                    return true;
                }
                return false;
            case 12:
                H2.x xVar = (H2.x) obj;
                H2.x xVar2 = (H2.x) obj2;
                if (kotlin.jvm.internal.h.a(xVar.f3085a.f3456a, xVar2.f3085a.f3456a) && xVar.f3086b == xVar2.f3086b) {
                    return true;
                }
                return false;
            case 13:
                return ((z) obj).equals((z) obj2);
            case 14:
                return ((Movie) obj).equals((Movie) obj2);
            default:
                return kotlin.jvm.internal.h.a(((I2.c) obj).f3463c, ((I2.c) obj2).f3463c);
        }
    }

    @Override // F0.AbstractC0098c
    public final boolean b(Object obj, Object obj2) {
        switch (this.f4831d) {
            case 0:
                if (((Movie) obj).f14414a == ((Movie) obj2).f14414a) {
                    return true;
                }
                return false;
            case 1:
                return ((H2.c) obj).f2986a.equals(((H2.c) obj2).f2986a);
            case 2:
                if (((H2.i) obj).f3026a == ((H2.i) obj2).f3026a) {
                    return true;
                }
                return false;
            case 3:
                if (((C0158a) obj).f2978a == ((C0158a) obj2).f2978a) {
                    return true;
                }
                return false;
            case 4:
                return ((H2.t) obj).equals((H2.t) obj2);
            case 5:
                return kotlin.jvm.internal.h.a(((FilterConfig) obj).f14404b, ((FilterConfig) obj2).f14404b);
            case 6:
                if (((Genre) obj).f14405a == ((Genre) obj2).f14405a) {
                    return true;
                }
                return false;
            case 7:
                H2.g gVar = (H2.g) obj;
                H2.g gVar2 = (H2.g) obj2;
                if (kotlin.jvm.internal.h.a(gVar.f3016c, gVar2.f3016c) && kotlin.jvm.internal.h.a(gVar.f3017d, gVar2.f3017d)) {
                    return true;
                }
                return false;
            case 8:
                if (((Movie) obj).f14414a == ((Movie) obj2).f14414a) {
                    return true;
                }
                return false;
            case 9:
                if (((H2.i) obj).f3026a == ((H2.i) obj2).f3026a) {
                    return true;
                }
                return false;
            case R.styleable.GradientColor_android_endX /* 10 */:
                if (((Movie) obj).f14414a == ((Movie) obj2).f14414a) {
                    return true;
                }
                return false;
            case R.styleable.GradientColor_android_endY /* 11 */:
                if (((I2.a) obj2).f3444a == ((I2.a) obj).f3444a) {
                    return true;
                }
                return false;
            case 12:
                return kotlin.jvm.internal.h.a(((H2.x) obj).f3085a.f3457b, ((H2.x) obj2).f3085a.f3457b);
            case 13:
                if (((z) obj).f3094a == ((z) obj2).f3094a) {
                    return true;
                }
                return false;
            case 14:
                if (((Movie) obj).f14414a == ((Movie) obj2).f14414a) {
                    return true;
                }
                return false;
            default:
                if (((I2.c) obj).f3461a == ((I2.c) obj2).f3461a) {
                    return true;
                }
                return false;
        }
    }
}
