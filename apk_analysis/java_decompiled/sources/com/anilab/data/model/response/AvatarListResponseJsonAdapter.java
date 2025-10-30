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
public final class AvatarListResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14011a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14012b;

    public AvatarListResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14011a = C1499E.o("avatars");
        this.f14012b = moshi.b(AbstractC1708D.f(AvatarResponse.class), v.f1137a, "avatars");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        List list = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14011a);
            if (h02 != -1) {
                if (h02 == 0) {
                    list = (List) this.f14012b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new AvatarListResponse(list);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        AvatarListResponse avatarListResponse = (AvatarListResponse) obj;
        h.e(writer, "writer");
        if (avatarListResponse != null) {
            writer.d();
            writer.x("avatars");
            this.f14012b.e(writer, avatarListResponse.f14010a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(40, "GeneratedJsonAdapter(AvatarListResponse)");
    }
}
