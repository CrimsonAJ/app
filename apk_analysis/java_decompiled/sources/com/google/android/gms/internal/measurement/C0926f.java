package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926f implements InterfaceC0966n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0966n f15480a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15481b;

    public C0926f(String str) {
        this.f15480a = InterfaceC0966n.f15543N;
        this.f15481b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0926f)) {
            return false;
        }
        C0926f c0926f = (C0926f) obj;
        if (this.f15481b.equals(c0926f.f15481b) && this.f15480a.equals(c0926f.f15480a)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        return new C0926f(this.f15481b, this.f15480a.f());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return this.f15480a.hashCode() + (this.f15481b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Boolean o() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public C0926f(String str, InterfaceC0966n interfaceC0966n) {
        this.f15480a = interfaceC0966n;
        this.f15481b = str;
    }
}
