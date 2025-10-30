package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MalPagingResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14221a;

    public MalPagingResponse(@InterfaceC1717i(name = "next") String str) {
        this.f14221a = str;
    }

    public final MalPagingResponse copy(@InterfaceC1717i(name = "next") String str) {
        return new MalPagingResponse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MalPagingResponse) && h.a(this.f14221a, ((MalPagingResponse) obj).f14221a);
    }

    public final int hashCode() {
        String str = this.f14221a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("MalPagingResponse(next="), this.f14221a, ")");
    }
}
