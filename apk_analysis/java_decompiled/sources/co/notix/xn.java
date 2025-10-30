package co.notix;

import java.util.List;

/* loaded from: classes.dex */
public final class xn {

    /* renamed from: a, reason: collision with root package name */
    public final List f13556a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13557b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13558c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13559d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13560e;

    public xn(List entries, String manufacturer, String model, int i9, int i10) {
        kotlin.jvm.internal.h.e(entries, "entries");
        kotlin.jvm.internal.h.e(manufacturer, "manufacturer");
        kotlin.jvm.internal.h.e(model, "model");
        this.f13556a = entries;
        this.f13557b = manufacturer;
        this.f13558c = model;
        this.f13559d = i9;
        this.f13560e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj;
        return kotlin.jvm.internal.h.a(this.f13556a, xnVar.f13556a) && kotlin.jvm.internal.h.a(this.f13557b, xnVar.f13557b) && kotlin.jvm.internal.h.a(this.f13558c, xnVar.f13558c) && this.f13559d == xnVar.f13559d && this.f13560e == xnVar.f13560e;
    }

    public final int hashCode() {
        return this.f13560e + ((this.f13559d + h.a(this.f13558c, h.a(this.f13557b, this.f13556a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "RemoteLogsRequest(entries=" + this.f13556a + ", manufacturer=" + this.f13557b + ", model=" + this.f13558c + ", androidApi=" + this.f13559d + ", appVersionCode=" + this.f13560e + ')';
    }
}
