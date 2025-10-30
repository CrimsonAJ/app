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
public final class VersionSettingsResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14386a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14387b;

    public VersionSettingsResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14386a = C1499E.o("latest_version");
        this.f14387b = moshi.b(LatestVersionResponse.class, v.f1137a, "version");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        LatestVersionResponse latestVersionResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14386a);
            if (h02 != -1) {
                if (h02 == 0 && (latestVersionResponse = (LatestVersionResponse) this.f14387b.b(reader)) == null) {
                    throw e.j("version", "latest_version", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (latestVersionResponse != null) {
            return new VersionSettingsResponse(latestVersionResponse);
        }
        throw e.e("version", "latest_version", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        VersionSettingsResponse versionSettingsResponse = (VersionSettingsResponse) obj;
        h.e(writer, "writer");
        if (versionSettingsResponse != null) {
            writer.d();
            writer.x("latest_version");
            this.f14387b.e(writer, versionSettingsResponse.f14385a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(45, "GeneratedJsonAdapter(VersionSettingsResponse)");
    }
}
