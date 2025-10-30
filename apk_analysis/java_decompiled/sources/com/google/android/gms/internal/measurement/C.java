package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15183b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f15184a;

    public C(int i9) {
        this.f15184a = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c3 = (C) obj;
            c3.getClass();
            int i9 = this.f15184a;
            if (i9 != 0) {
                if (i9 == c3.f15184a) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f15184a;
        if (i9 != 0) {
            return ((i9 ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i9 = this.f15184a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        str = "null";
                    } else {
                        str = "NO_CHECKS";
                    }
                } else {
                    str = "SKIP_SECURITY_CHECK";
                }
            } else {
                str = "SKIP_COMPLIANCE_CHECK";
            }
        } else {
            str = "ALL_CHECKS";
        }
        return "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=READ_AND_WRITE}";
    }
}
