package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ErrorResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14135a;

    public ErrorResponse(@InterfaceC1717i(name = "message") String str) {
        this.f14135a = str;
    }

    public final ErrorResponse copy(@InterfaceC1717i(name = "message") String str) {
        return new ErrorResponse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorResponse) && h.a(this.f14135a, ((ErrorResponse) obj).f14135a);
    }

    public final int hashCode() {
        String str = this.f14135a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("ErrorResponse(message="), this.f14135a, ")");
    }

    public /* synthetic */ ErrorResponse(String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str);
    }
}
