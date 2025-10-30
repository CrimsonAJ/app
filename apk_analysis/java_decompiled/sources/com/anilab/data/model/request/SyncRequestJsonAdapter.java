package com.anilab.data.model.request;

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
public final class SyncRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13963a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13964b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13965c;

    public SyncRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13963a = C1499E.o("is_logged", "device_unique_id", "fcm_token", "platform");
        v vVar = v.f1137a;
        this.f13964b = moshi.b(Integer.TYPE, vVar, "isLogged");
        this.f13965c = moshi.b(String.class, vVar, "deviceUniqueId");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13963a);
            if (h02 != -1) {
                if (h02 != 0) {
                    AbstractC1719k abstractC1719k = this.f13965c;
                    if (h02 != 1) {
                        if (h02 != 2) {
                            if (h02 == 3 && (str3 = (String) abstractC1719k.b(reader)) == null) {
                                throw e.j("platform", "platform", reader);
                            }
                        } else {
                            str2 = (String) abstractC1719k.b(reader);
                            if (str2 == null) {
                                throw e.j("fcmToken", "fcm_token", reader);
                            }
                        }
                    } else {
                        str = (String) abstractC1719k.b(reader);
                        if (str == null) {
                            throw e.j("deviceUniqueId", "device_unique_id", reader);
                        }
                    }
                } else {
                    num = (Integer) this.f13964b.b(reader);
                    if (num == null) {
                        throw e.j("isLogged", "is_logged", reader);
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
                if (str2 != null) {
                    if (str3 != null) {
                        return new SyncRequest(intValue, str, str2, str3);
                    }
                    throw e.e("platform", "platform", reader);
                }
                throw e.e("fcmToken", "fcm_token", reader);
            }
            throw e.e("deviceUniqueId", "device_unique_id", reader);
        }
        throw e.e("isLogged", "is_logged", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        SyncRequest syncRequest = (SyncRequest) obj;
        h.e(writer, "writer");
        if (syncRequest != null) {
            writer.d();
            writer.x("is_logged");
            this.f13964b.e(writer, Integer.valueOf(syncRequest.f13959a));
            writer.x("device_unique_id");
            String str = syncRequest.f13960b;
            AbstractC1719k abstractC1719k = this.f13965c;
            abstractC1719k.e(writer, str);
            writer.x("fcm_token");
            abstractC1719k.e(writer, syncRequest.f13961c);
            writer.x("platform");
            abstractC1719k.e(writer, syncRequest.f13962d);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(33, "GeneratedJsonAdapter(SyncRequest)");
    }
}
