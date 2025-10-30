package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MalDataResponse {

    /* renamed from: a, reason: collision with root package name */
    public final MalListStatusResponse f14205a;

    /* renamed from: b, reason: collision with root package name */
    public final MalNodeResponse f14206b;

    public MalDataResponse(@InterfaceC1717i(name = "list_status") MalListStatusResponse malListStatusResponse, @InterfaceC1717i(name = "node") MalNodeResponse node) {
        h.e(node, "node");
        this.f14205a = malListStatusResponse;
        this.f14206b = node;
    }

    public final MalDataResponse copy(@InterfaceC1717i(name = "list_status") MalListStatusResponse malListStatusResponse, @InterfaceC1717i(name = "node") MalNodeResponse node) {
        h.e(node, "node");
        return new MalDataResponse(malListStatusResponse, node);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MalDataResponse)) {
            return false;
        }
        MalDataResponse malDataResponse = (MalDataResponse) obj;
        return h.a(this.f14205a, malDataResponse.f14205a) && h.a(this.f14206b, malDataResponse.f14206b);
    }

    public final int hashCode() {
        MalListStatusResponse malListStatusResponse = this.f14205a;
        return this.f14206b.hashCode() + ((malListStatusResponse == null ? 0 : malListStatusResponse.hashCode()) * 31);
    }

    public final String toString() {
        return "MalDataResponse(listStatus=" + this.f14205a + ", node=" + this.f14206b + ")";
    }
}
