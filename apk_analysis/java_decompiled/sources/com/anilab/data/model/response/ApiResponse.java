package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ApiResponse<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f14003a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f14004b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14005c;

    public ApiResponse(@InterfaceC1717i(name = "success") Boolean bool, @InterfaceC1717i(name = "code") Integer num, @InterfaceC1717i(name = "result") T t7) {
        this.f14003a = bool;
        this.f14004b = num;
        this.f14005c = t7;
    }

    public final ApiResponse<T> copy(@InterfaceC1717i(name = "success") Boolean bool, @InterfaceC1717i(name = "code") Integer num, @InterfaceC1717i(name = "result") T t7) {
        return new ApiResponse<>(bool, num, t7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        return h.a(this.f14003a, apiResponse.f14003a) && h.a(this.f14004b, apiResponse.f14004b) && h.a(this.f14005c, apiResponse.f14005c);
    }

    public final int hashCode() {
        Boolean bool = this.f14003a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f14004b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f14005c;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "ApiResponse(success=" + this.f14003a + ", code=" + this.f14004b + ", result=" + this.f14005c + ")";
    }
}
