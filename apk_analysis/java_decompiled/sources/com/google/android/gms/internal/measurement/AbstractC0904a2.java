package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0904a2 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0909b2 f15438a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0909b2 f15439b;

    public AbstractC0904a2(AbstractC0909b2 abstractC0909b2) {
        this.f15438a = abstractC0909b2;
        if (!abstractC0909b2.l()) {
            this.f15439b = (AbstractC0909b2) abstractC0909b2.m(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void b(List list, int i9) {
        String m9 = A0.a.m("Element at index ", list.size() - i9, " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size >= i9) {
                list.remove(size);
            } else {
                throw new NullPointerException(m9);
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC0904a2 clone() {
        AbstractC0904a2 abstractC0904a2 = (AbstractC0904a2) this.f15438a.m(5);
        abstractC0904a2.f15439b = i();
        return abstractC0904a2;
    }

    public final void e(AbstractC0909b2 abstractC0909b2) {
        AbstractC0909b2 abstractC0909b22 = this.f15438a;
        if (!abstractC0909b22.equals(abstractC0909b2)) {
            if (!this.f15439b.l()) {
                AbstractC0909b2 abstractC0909b23 = (AbstractC0909b2) abstractC0909b22.m(4);
                C1023y2.f15696c.a(abstractC0909b23.getClass()).b(abstractC0909b23, this.f15439b);
                this.f15439b = abstractC0909b23;
            }
            AbstractC0909b2 abstractC0909b24 = this.f15439b;
            C1023y2.f15696c.a(abstractC0909b24.getClass()).b(abstractC0909b24, abstractC0909b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.measurement.Q1, java.lang.Object] */
    public final void f(byte[] bArr, int i9, V1 v12) {
        if (!this.f15439b.l()) {
            AbstractC0909b2 abstractC0909b2 = (AbstractC0909b2) this.f15438a.m(4);
            C1023y2.f15696c.a(abstractC0909b2.getClass()).b(abstractC0909b2, this.f15439b);
            this.f15439b = abstractC0909b2;
        }
        try {
            B2 a5 = C1023y2.f15696c.a(this.f15439b.getClass());
            AbstractC0909b2 abstractC0909b22 = this.f15439b;
            ?? obj = new Object();
            v12.getClass();
            a5.g(abstractC0909b22, bArr, 0, i9, obj);
        } catch (C0954k2 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final AbstractC0909b2 h() {
        AbstractC0909b2 i9 = i();
        i9.getClass();
        boolean z9 = true;
        byte byteValue = ((Byte) i9.m(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z9 = false;
            } else {
                z9 = C1023y2.f15696c.a(i9.getClass()).i(i9);
                i9.m(2);
            }
        }
        if (z9) {
            return i9;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final AbstractC0909b2 i() {
        if (!this.f15439b.l()) {
            return this.f15439b;
        }
        AbstractC0909b2 abstractC0909b2 = this.f15439b;
        abstractC0909b2.getClass();
        C1023y2.f15696c.a(abstractC0909b2.getClass()).a(abstractC0909b2);
        abstractC0909b2.i();
        return this.f15439b;
    }

    public final void j() {
        if (!this.f15439b.l()) {
            AbstractC0909b2 abstractC0909b2 = (AbstractC0909b2) this.f15438a.m(4);
            C1023y2.f15696c.a(abstractC0909b2.getClass()).b(abstractC0909b2, this.f15439b);
            this.f15439b = abstractC0909b2;
        }
    }
}
