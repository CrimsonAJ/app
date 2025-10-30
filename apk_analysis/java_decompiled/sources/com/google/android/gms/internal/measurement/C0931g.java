package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931g implements InterfaceC0966n {

    /* renamed from: a, reason: collision with root package name */
    public final Double f15487a;

    public C0931g(Double d9) {
        if (d9 == null) {
            this.f15487a = Double.valueOf(Double.NaN);
        } else {
            this.f15487a = d9;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        return this.f15487a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        BigDecimal stripTrailingZeros;
        int scale;
        Double d9 = this.f15487a;
        if (Double.isNaN(d9.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d9.doubleValue())) {
            if (d9.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d9.doubleValue());
        if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = valueOf.stripTrailingZeros();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0931g)) {
            return false;
        }
        return this.f15487a.equals(((C0931g) obj).f15487a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        return new C0931g(this.f15487a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C0981q(c());
        }
        throw new IllegalArgumentException(c() + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return this.f15487a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Boolean o() {
        Double d9 = this.f15487a;
        boolean z9 = false;
        if (!Double.isNaN(d9.doubleValue()) && d9.doubleValue() != 0.0d) {
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    public final String toString() {
        return c();
    }
}
