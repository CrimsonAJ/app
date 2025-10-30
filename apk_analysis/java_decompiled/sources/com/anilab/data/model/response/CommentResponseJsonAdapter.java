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
public final class CommentResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14051a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14052b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14053c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14054d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f14055e;

    public CommentResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14051a = C1499E.o("_id", "userId", "movieId", "content", "totalLike", "totalChildren", "parentId", "createdAt", "updatedAt");
        v vVar = v.f1137a;
        this.f14052b = moshi.b(String.class, vVar, "id");
        this.f14053c = moshi.b(Long.TYPE, vVar, "userId");
        this.f14054d = moshi.b(String.class, vVar, "content");
        this.f14055e = moshi.b(Integer.class, vVar, "totalLike");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003d. Please report as an issue. */
    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        Long l10 = null;
        String str = null;
        Long l11 = null;
        Long l12 = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        while (true) {
            Long l13 = l9;
            Long l14 = l10;
            if (reader.F()) {
                int h02 = reader.h0(this.f14051a);
                String str4 = str;
                AbstractC1719k abstractC1719k = this.f14055e;
                Long l15 = l11;
                AbstractC1719k abstractC1719k2 = this.f14054d;
                Long l16 = l12;
                AbstractC1719k abstractC1719k3 = this.f14053c;
                switch (h02) {
                    case -1:
                        reader.i0();
                        reader.j0();
                        l9 = l13;
                        l10 = l14;
                        str = str4;
                        l11 = l15;
                        l12 = l16;
                    case 0:
                        str = (String) this.f14052b.b(reader);
                        if (str != null) {
                            l9 = l13;
                            l10 = l14;
                            l11 = l15;
                            l12 = l16;
                        } else {
                            throw e.j("id", "_id", reader);
                        }
                    case 1:
                        l9 = (Long) abstractC1719k3.b(reader);
                        if (l9 == null) {
                            throw e.j("userId", "userId", reader);
                        }
                        l10 = l14;
                        str = str4;
                        l11 = l15;
                        l12 = l16;
                    case 2:
                        l10 = (Long) abstractC1719k3.b(reader);
                        if (l10 != null) {
                            l9 = l13;
                            str = str4;
                            l11 = l15;
                            l12 = l16;
                        } else {
                            throw e.j("movieId", "movieId", reader);
                        }
                    case 3:
                        str2 = (String) abstractC1719k2.b(reader);
                        l9 = l13;
                        l10 = l14;
                        str = str4;
                        l11 = l15;
                        l12 = l16;
                    case 4:
                        num = (Integer) abstractC1719k.b(reader);
                        l9 = l13;
                        l10 = l14;
                        str = str4;
                        l11 = l15;
                        l12 = l16;
                    case 5:
                        num2 = (Integer) abstractC1719k.b(reader);
                        l9 = l13;
                        l10 = l14;
                        str = str4;
                        l11 = l15;
                        l12 = l16;
                    case 6:
                        str3 = (String) abstractC1719k2.b(reader);
                        l9 = l13;
                        l10 = l14;
                        str = str4;
                        l11 = l15;
                        l12 = l16;
                    case 7:
                        l11 = (Long) abstractC1719k3.b(reader);
                        if (l11 != null) {
                            l9 = l13;
                            l10 = l14;
                            str = str4;
                            l12 = l16;
                        } else {
                            throw e.j("createdAt", "createdAt", reader);
                        }
                    case 8:
                        l12 = (Long) abstractC1719k3.b(reader);
                        if (l12 != null) {
                            l9 = l13;
                            l10 = l14;
                            str = str4;
                            l11 = l15;
                        } else {
                            throw e.j("updatedAt", "updatedAt", reader);
                        }
                    default:
                        l9 = l13;
                        l10 = l14;
                        str = str4;
                        l11 = l15;
                        l12 = l16;
                }
            } else {
                String str5 = str;
                Long l17 = l11;
                Long l18 = l12;
                reader.s();
                if (str5 != null) {
                    if (l13 != null) {
                        long longValue = l13.longValue();
                        if (l14 != null) {
                            long longValue2 = l14.longValue();
                            if (l17 != null) {
                                long longValue3 = l17.longValue();
                                if (l18 != null) {
                                    return new CommentResponse(str5, longValue, longValue2, str2, num, num2, str3, longValue3, l18.longValue());
                                }
                                throw e.e("updatedAt", "updatedAt", reader);
                            }
                            throw e.e("createdAt", "createdAt", reader);
                        }
                        throw e.e("movieId", "movieId", reader);
                    }
                    throw e.e("userId", "userId", reader);
                }
                throw e.e("id", "_id", reader);
            }
        }
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        CommentResponse commentResponse = (CommentResponse) obj;
        h.e(writer, "writer");
        if (commentResponse != null) {
            writer.d();
            writer.x("_id");
            this.f14052b.e(writer, commentResponse.f14042a);
            writer.x("userId");
            Long valueOf = Long.valueOf(commentResponse.f14043b);
            AbstractC1719k abstractC1719k = this.f14053c;
            abstractC1719k.e(writer, valueOf);
            writer.x("movieId");
            abstractC1719k.e(writer, Long.valueOf(commentResponse.f14044c));
            writer.x("content");
            AbstractC1719k abstractC1719k2 = this.f14054d;
            abstractC1719k2.e(writer, commentResponse.f14045d);
            writer.x("totalLike");
            AbstractC1719k abstractC1719k3 = this.f14055e;
            abstractC1719k3.e(writer, commentResponse.f14046e);
            writer.x("totalChildren");
            abstractC1719k3.e(writer, commentResponse.f14047f);
            writer.x("parentId");
            abstractC1719k2.e(writer, commentResponse.f14048g);
            writer.x("createdAt");
            abstractC1719k.e(writer, Long.valueOf(commentResponse.f14049h));
            writer.x("updatedAt");
            abstractC1719k.e(writer, Long.valueOf(commentResponse.f14050i));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(37, "GeneratedJsonAdapter(CommentResponse)");
    }
}
