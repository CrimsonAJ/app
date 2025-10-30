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
public final class VoteCommentResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14392a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14393b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14394c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14395d;

    public VoteCommentResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14392a = C1499E.o("_id", "comment", "userId", "type");
        v vVar = v.f1137a;
        this.f14393b = moshi.b(String.class, vVar, "id");
        this.f14394c = moshi.b(Long.TYPE, vVar, "userId");
        this.f14395d = moshi.b(Integer.TYPE, vVar, "type");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14392a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14393b;
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 != 2) {
                            if (h02 == 3 && (num = (Integer) this.f14395d.b(reader)) == null) {
                                throw e.j("type", "type", reader);
                            }
                        } else {
                            l9 = (Long) this.f14394c.b(reader);
                            if (l9 == null) {
                                throw e.j("userId", "userId", reader);
                            }
                        }
                    } else {
                        str2 = (String) abstractC1719k.b(reader);
                        if (str2 == null) {
                            throw e.j("comment", "comment", reader);
                        }
                    }
                } else {
                    str = (String) abstractC1719k.b(reader);
                    if (str == null) {
                        throw e.j("id", "_id", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        Integer num2 = num;
        if (str != null) {
            if (str2 != null) {
                if (l9 != null) {
                    long longValue = l9.longValue();
                    if (num2 != null) {
                        return new VoteCommentResponse(str, str2, longValue, num2.intValue());
                    }
                    throw e.e("type", "type", reader);
                }
                throw e.e("userId", "userId", reader);
            }
            throw e.e("comment", "comment", reader);
        }
        throw e.e("id", "_id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        VoteCommentResponse voteCommentResponse = (VoteCommentResponse) obj;
        h.e(writer, "writer");
        if (voteCommentResponse != null) {
            writer.d();
            writer.x("_id");
            String str = voteCommentResponse.f14388a;
            AbstractC1719k abstractC1719k = this.f14393b;
            abstractC1719k.e(writer, str);
            writer.x("comment");
            abstractC1719k.e(writer, voteCommentResponse.f14389b);
            writer.x("userId");
            this.f14394c.e(writer, Long.valueOf(voteCommentResponse.f14390c));
            writer.x("type");
            this.f14395d.e(writer, Integer.valueOf(voteCommentResponse.f14391d));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(41, "GeneratedJsonAdapter(VoteCommentResponse)");
    }
}
