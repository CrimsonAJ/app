package N1;

import R1.C;
import android.view.View;
import com.anilab.domain.model.Genre;
import com.anilab.domain.model.Movie;
import java.util.ArrayList;
import k2.C1483a;
import k2.C1484b;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4841d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i9) {
        this.f4838a = i9;
        this.f4839b = obj;
        this.f4840c = obj2;
        this.f4841d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4838a) {
            case 0:
                f fVar = (f) this.f4839b;
                i iVar = fVar.f4845h;
                Movie movie = (Movie) this.f4840c;
                iVar.invoke(movie, Boolean.valueOf(movie.f14428p));
                if (fVar.f4846i) {
                    movie.f14428p = !movie.f14428p;
                    fVar.e(((d) this.f4841d).c());
                    return;
                }
                return;
            case 1:
                C c3 = (C) this.f4839b;
                c3.f6508f.invoke((H2.i) this.f4840c);
                int i9 = c3.f6510h;
                d dVar = (d) this.f4841d;
                c3.f6510h = dVar.b();
                c3.e(i9);
                c3.e(dVar.b());
                return;
            case 2:
                U1.m mVar = (U1.m) this.f4839b;
                ArrayList arrayList = mVar.f7276e;
                Genre genre = (Genre) this.f4840c;
                boolean contains = arrayList.contains(genre);
                ArrayList arrayList2 = mVar.f7276e;
                if (contains) {
                    arrayList2.remove(genre);
                } else {
                    arrayList2.add(genre);
                }
                mVar.e(((d) this.f4841d).c());
                return;
            case 3:
                C1484b c1484b = (C1484b) this.f4839b;
                int i10 = c1484b.f19881f;
                c1484b.f19881f = ((C1483a) this.f4840c).c();
                c1484b.e(i10);
                c1484b.e(c1484b.f19881f);
                c1484b.f19879d.invoke((H2.b) this.f4841d);
                return;
            default:
                H2.v vVar = (H2.v) this.f4839b;
                Movie movie2 = vVar.j;
                if (movie2 != null) {
                    k2.f fVar2 = (k2.f) this.f4840c;
                    fVar2.f19892f.invoke(movie2, Boolean.valueOf(movie2.f14428p));
                    if (fVar2.f19890d) {
                        Movie movie3 = vVar.j;
                        if (movie3 != null) {
                            movie3.f14428p = !movie2.f14428p;
                        }
                        fVar2.e(((k2.e) this.f4841d).c());
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
