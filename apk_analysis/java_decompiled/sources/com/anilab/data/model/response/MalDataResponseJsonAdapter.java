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
public final class MalDataResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14207a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14208b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14209c;

    public MalDataResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14207a = C1499E.o("list_status", "node");
        v vVar = v.f1137a;
        this.f14208b = moshi.b(MalListStatusResponse.class, vVar, "listStatus");
        this.f14209c = moshi.b(MalNodeResponse.class, vVar, "node");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        MalListStatusResponse malListStatusResponse = null;
        MalNodeResponse malNodeResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14207a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (malNodeResponse = (MalNodeResponse) this.f14209c.b(reader)) == null) {
                        throw e.j("node", "node", reader);
                    }
                } else {
                    malListStatusResponse = (MalListStatusResponse) this.f14208b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (malNodeResponse != null) {
            return new MalDataResponse(malListStatusResponse, malNodeResponse);
        }
        throw e.e("node", "node", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MalDataResponse malDataResponse = (MalDataResponse) obj;
        h.e(writer, "writer");
        if (malDataResponse != null) {
            writer.d();
            writer.x("list_status");
            this.f14208b.e(writer, malDataResponse.f14205a);
            writer.x("node");
            this.f14209c.e(writer, malDataResponse.f14206b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(37, "GeneratedJsonAdapter(MalDataResponse)");
    }
}
