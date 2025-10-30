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
public final class AvatarResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14017a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14018b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14019c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14020d;

    public AvatarResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14017a = C1499E.o("id", "url", "path", "group");
        v vVar = v.f1137a;
        this.f14018b = moshi.b(Long.TYPE, vVar, "id");
        this.f14019c = moshi.b(String.class, vVar, "url");
        this.f14020d = moshi.b(Integer.TYPE, vVar, "group");
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
            int h02 = reader.h0(this.f14017a);
            if (h02 != -1) {
                if (h02 != 0) {
                    AbstractC1719k abstractC1719k = this.f14019c;
                    if (h02 != 1) {
                        if (h02 != 2) {
                            if (h02 == 3 && (num = (Integer) this.f14020d.b(reader)) == null) {
                                throw e.j("group", "group", reader);
                            }
                        } else {
                            str2 = (String) abstractC1719k.b(reader);
                            if (str2 == null) {
                                throw e.j("path", "path", reader);
                            }
                        }
                    } else {
                        str = (String) abstractC1719k.b(reader);
                        if (str == null) {
                            throw e.j("url", "url", reader);
                        }
                    }
                } else {
                    l9 = (Long) this.f14018b.b(reader);
                    if (l9 == null) {
                        throw e.j("id", "id", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        Integer num2 = num;
        if (l9 != null) {
            long longValue = l9.longValue();
            if (str != null) {
                if (str2 != null) {
                    if (num2 != null) {
                        return new AvatarResponse(longValue, str, str2, num2.intValue());
                    }
                    throw e.e("group", "group", reader);
                }
                throw e.e("path", "path", reader);
            }
            throw e.e("url", "url", reader);
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        AvatarResponse avatarResponse = (AvatarResponse) obj;
        h.e(writer, "writer");
        if (avatarResponse != null) {
            writer.d();
            writer.x("id");
            this.f14018b.e(writer, Long.valueOf(avatarResponse.f14013a));
            writer.x("url");
            String str = avatarResponse.f14014b;
            AbstractC1719k abstractC1719k = this.f14019c;
            abstractC1719k.e(writer, str);
            writer.x("path");
            abstractC1719k.e(writer, avatarResponse.f14015c);
            writer.x("group");
            this.f14020d.e(writer, Integer.valueOf(avatarResponse.f14016d));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(36, "GeneratedJsonAdapter(AvatarResponse)");
    }
}
