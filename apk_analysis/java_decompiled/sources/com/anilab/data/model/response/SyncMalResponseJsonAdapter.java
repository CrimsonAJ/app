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
public final class SyncMalResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14350a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14351b;

    public SyncMalResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14350a = C1499E.o("is_sync");
        this.f14351b = moshi.b(Boolean.TYPE, v.f1137a, "isSync");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Boolean bool = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14350a);
            if (h02 != -1) {
                if (h02 == 0 && (bool = (Boolean) this.f14351b.b(reader)) == null) {
                    throw e.j("isSync", "is_sync", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (bool != null) {
            return new SyncMalResponse(bool.booleanValue());
        }
        throw e.e("isSync", "is_sync", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        SyncMalResponse syncMalResponse = (SyncMalResponse) obj;
        h.e(writer, "writer");
        if (syncMalResponse != null) {
            writer.d();
            writer.x("is_sync");
            this.f14351b.e(writer, Boolean.valueOf(syncMalResponse.f14349a));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(37, "GeneratedJsonAdapter(SyncMalResponse)");
    }
}
