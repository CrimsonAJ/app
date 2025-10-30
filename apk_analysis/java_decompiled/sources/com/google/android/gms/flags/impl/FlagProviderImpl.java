package com.google.android.gms.flags.impl;

import P4.b;
import Q4.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractC1002u1;

@DynamiteApi
/* loaded from: classes.dex */
public class FlagProviderImpl extends b {

    /* renamed from: e, reason: collision with root package name */
    public boolean f14678e;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f14679f;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.f14678e = false;
    }

    @Override // P4.c
    public boolean getBooleanFlagValue(String str, boolean z9, int i9) {
        String str2;
        if (!this.f14678e) {
            return z9;
        }
        SharedPreferences sharedPreferences = this.f14679f;
        Boolean valueOf = Boolean.valueOf(z9);
        try {
            valueOf = (Boolean) AbstractC1002u1.j0(new a(sharedPreferences, str, valueOf, 0));
        } catch (Exception e8) {
            String valueOf2 = String.valueOf(e8.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.booleanValue();
    }

    @Override // P4.c
    public int getIntFlagValue(String str, int i9, int i10) {
        String str2;
        if (!this.f14678e) {
            return i9;
        }
        SharedPreferences sharedPreferences = this.f14679f;
        Integer valueOf = Integer.valueOf(i9);
        try {
            valueOf = (Integer) AbstractC1002u1.j0(new a(sharedPreferences, str, valueOf, 1));
        } catch (Exception e8) {
            String valueOf2 = String.valueOf(e8.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.intValue();
    }

    @Override // P4.c
    public long getLongFlagValue(String str, long j, int i9) {
        String str2;
        if (!this.f14678e) {
            return j;
        }
        SharedPreferences sharedPreferences = this.f14679f;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) AbstractC1002u1.j0(new a(sharedPreferences, str, valueOf, 2));
        } catch (Exception e8) {
            String valueOf2 = String.valueOf(e8.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.longValue();
    }

    @Override // P4.c
    public String getStringFlagValue(String str, String str2, int i9) {
        String str3;
        if (this.f14678e) {
            try {
                return (String) AbstractC1002u1.j0(new a(this.f14679f, str, str2, 3));
            } catch (Exception e8) {
                String valueOf = String.valueOf(e8.getMessage());
                if (valueOf.length() != 0) {
                    str3 = "Flag value not available, returning default: ".concat(valueOf);
                } else {
                    str3 = new String("Flag value not available, returning default: ");
                }
                Log.w("FlagDataUtils", str3);
            }
        }
        return str2;
    }

    @Override // P4.c
    public void init(N4.a aVar) {
        String str;
        Context context = (Context) N4.b.i1(aVar);
        if (!this.f14678e) {
            try {
                this.f14679f = AbstractC1002u1.i0(context.createPackageContext("com.google.android.gms", 0));
                this.f14678e = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e8) {
                String valueOf = String.valueOf(e8.getMessage());
                if (valueOf.length() != 0) {
                    str = "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
                } else {
                    str = new String("Could not retrieve sdk flags, continuing with defaults: ");
                }
                Log.w("FlagProviderImpl", str);
            }
        }
    }
}
