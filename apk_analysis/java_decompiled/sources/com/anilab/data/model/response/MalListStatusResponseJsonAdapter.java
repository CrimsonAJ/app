package com.anilab.data.model.response;

import A0.a;
import B7.v;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;
import p7.e;

/* loaded from: classes.dex */
public final class MalListStatusResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14215a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14216b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14217c;

    public MalListStatusResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14215a = C1499E.o("num_episodes_watched", "status");
        v vVar = v.f1137a;
        this.f14216b = moshi.b(Integer.TYPE, vVar, "numEpisodesWatched");
        this.f14217c = moshi.b(String.class, vVar, "status");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Integer num = null;
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14215a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (str = (String) this.f14217c.b(reader)) == null) {
                        throw e.j("status", "status", reader);
                    }
                } else {
                    num = (Integer) this.f14216b.b(reader);
                    if (num == null) {
                        throw e.j("numEpisodesWatched", "num_episodes_watched", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (num != null) {
            int intValue = num.intValue();
            if (str != null) {
                return new MalListStatusResponse(intValue, str);
            }
            throw e.e("status", "status", reader);
        }
        throw e.e("numEpisodesWatched", "num_episodes_watched", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MalListStatusResponse malListStatusResponse = (MalListStatusResponse) obj;
        h.e(writer, "writer");
        if (malListStatusResponse != null) {
            writer.d();
            writer.x("num_episodes_watched");
            this.f14216b.e(writer, Integer.valueOf(malListStatusResponse.f14213a));
            writer.x("status");
            this.f14217c.e(writer, malListStatusResponse.f14214b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(MalListStatusResponse)");
    }
}
