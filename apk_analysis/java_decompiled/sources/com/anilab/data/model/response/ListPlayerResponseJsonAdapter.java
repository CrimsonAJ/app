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
public final class ListPlayerResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14196a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14197b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14198c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14199d;

    public ListPlayerResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14196a = C1499E.o("allowed", "percent_show", "force", "players");
        v vVar = v.f1137a;
        this.f14197b = moshi.b(Boolean.class, vVar, "allowed");
        this.f14198c = moshi.b(Integer.class, vVar, "percentShow");
        this.f14199d = moshi.b(AbstractC1708D.f(PlayerResponse.class), vVar, "players");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14196a);
            if (h02 != -1) {
                if (h02 != 0) {
                    AbstractC1719k abstractC1719k = this.f14198c;
                    if (h02 != 1) {
                        if (h02 != 2) {
                            if (h02 == 3) {
                                list = (List) this.f14199d.b(reader);
                            }
                        } else {
                            num2 = (Integer) abstractC1719k.b(reader);
                        }
                    } else {
                        num = (Integer) abstractC1719k.b(reader);
                    }
                } else {
                    bool = (Boolean) this.f14197b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new ListPlayerResponse(bool, num, num2, list);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ListPlayerResponse listPlayerResponse = (ListPlayerResponse) obj;
        h.e(writer, "writer");
        if (listPlayerResponse != null) {
            writer.d();
            writer.x("allowed");
            this.f14197b.e(writer, listPlayerResponse.f14192a);
            writer.x("percent_show");
            AbstractC1719k abstractC1719k = this.f14198c;
            abstractC1719k.e(writer, listPlayerResponse.f14193b);
            writer.x("force");
            abstractC1719k.e(writer, listPlayerResponse.f14194c);
            writer.x("players");
            this.f14199d.e(writer, listPlayerResponse.f14195d);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(40, "GeneratedJsonAdapter(ListPlayerResponse)");
    }
}
