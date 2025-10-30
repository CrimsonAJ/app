package com.anilab.data.model.response;

import A0.a;
import B7.v;
import java.util.List;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1708D;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class HomeResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14162a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14163b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14164c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14165d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f14166e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f14167f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1719k f14168g;

    public HomeResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14162a = C1499E.o("id", "title", "type", "data", "filter", "tabs", "continue-watch");
        v vVar = v.f1137a;
        this.f14163b = moshi.b(String.class, vVar, "id");
        this.f14164c = moshi.b(Integer.class, vVar, "type");
        this.f14165d = moshi.b(AbstractC1708D.f(MovieResponse.class), vVar, "data");
        this.f14166e = moshi.b(AbstractC1708D.f(FilterResponse.class), vVar, "filter");
        this.f14167f = moshi.b(AbstractC1708D.f(TabResponse.class), vVar, "tabs");
        this.f14168g = moshi.b(AbstractC1708D.f(ContinueWatchRowResponse.class), vVar, "continueWatch");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        Integer num = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14162a);
            AbstractC1719k abstractC1719k = this.f14163b;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    break;
                case 0:
                    str = (String) abstractC1719k.b(reader);
                    break;
                case 1:
                    str2 = (String) abstractC1719k.b(reader);
                    break;
                case 2:
                    num = (Integer) this.f14164c.b(reader);
                    break;
                case 3:
                    list = (List) this.f14165d.b(reader);
                    break;
                case 4:
                    list2 = (List) this.f14166e.b(reader);
                    break;
                case 5:
                    list3 = (List) this.f14167f.b(reader);
                    break;
                case 6:
                    list4 = (List) this.f14168g.b(reader);
                    break;
            }
        }
        reader.s();
        return new HomeResponse(str, str2, num, list, list2, list3, list4);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        HomeResponse homeResponse = (HomeResponse) obj;
        h.e(writer, "writer");
        if (homeResponse != null) {
            writer.d();
            writer.x("id");
            AbstractC1719k abstractC1719k = this.f14163b;
            abstractC1719k.e(writer, homeResponse.f14155a);
            writer.x("title");
            abstractC1719k.e(writer, homeResponse.f14156b);
            writer.x("type");
            this.f14164c.e(writer, homeResponse.f14157c);
            writer.x("data");
            this.f14165d.e(writer, homeResponse.f14158d);
            writer.x("filter");
            this.f14166e.e(writer, homeResponse.f14159e);
            writer.x("tabs");
            this.f14167f.e(writer, homeResponse.f14160f);
            writer.x("continue-watch");
            this.f14168g.e(writer, homeResponse.f14161g);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(34, "GeneratedJsonAdapter(HomeResponse)");
    }
}
