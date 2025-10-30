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
public final class MalNodeResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14219a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14220b;

    public MalNodeResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14219a = C1499E.o("id");
        this.f14220b = moshi.b(Long.TYPE, v.f1137a, "id");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14219a);
            if (h02 != -1) {
                if (h02 == 0 && (l9 = (Long) this.f14220b.b(reader)) == null) {
                    throw e.j("id", "id", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (l9 != null) {
            return new MalNodeResponse(l9.longValue());
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MalNodeResponse malNodeResponse = (MalNodeResponse) obj;
        h.e(writer, "writer");
        if (malNodeResponse != null) {
            writer.d();
            writer.x("id");
            this.f14220b.e(writer, Long.valueOf(malNodeResponse.f14218a));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(37, "GeneratedJsonAdapter(MalNodeResponse)");
    }
}
