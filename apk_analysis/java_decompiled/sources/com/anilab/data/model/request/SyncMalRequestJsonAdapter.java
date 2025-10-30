package com.anilab.data.model.request;

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
import p7.C1865c;
import p7.e;

/* loaded from: classes.dex */
public final class SyncMalRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13956a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13957b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13958c;

    public SyncMalRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13956a = C1499E.o("ids", "is_replace");
        C1865c f9 = AbstractC1708D.f(Long.class);
        v vVar = v.f1137a;
        this.f13957b = moshi.b(f9, vVar, "ids");
        this.f13958c = moshi.b(Integer.TYPE, vVar, "isReplace");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        List list = null;
        Integer num = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13956a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (num = (Integer) this.f13958c.b(reader)) == null) {
                        throw e.j("isReplace", "is_replace", reader);
                    }
                } else {
                    list = (List) this.f13957b.b(reader);
                    if (list == null) {
                        throw e.j("ids", "ids", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (list != null) {
            if (num != null) {
                return new SyncMalRequest(list, num.intValue());
            }
            throw e.e("isReplace", "is_replace", reader);
        }
        throw e.e("ids", "ids", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        SyncMalRequest syncMalRequest = (SyncMalRequest) obj;
        h.e(writer, "writer");
        if (syncMalRequest != null) {
            writer.d();
            writer.x("ids");
            this.f13957b.e(writer, syncMalRequest.f13954a);
            writer.x("is_replace");
            this.f13958c.e(writer, Integer.valueOf(syncMalRequest.f13955b));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(36, "GeneratedJsonAdapter(SyncMalRequest)");
    }
}
