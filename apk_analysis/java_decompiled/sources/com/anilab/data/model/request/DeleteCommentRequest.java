package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class DeleteCommentRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13905a;

    public DeleteCommentRequest(@InterfaceC1717i(name = "id") String str) {
        this.f13905a = str;
    }

    public final DeleteCommentRequest copy(@InterfaceC1717i(name = "id") String str) {
        return new DeleteCommentRequest(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteCommentRequest) && h.a(this.f13905a, ((DeleteCommentRequest) obj).f13905a);
    }

    public final int hashCode() {
        String str = this.f13905a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("DeleteCommentRequest(commentId="), this.f13905a, ")");
    }
}
