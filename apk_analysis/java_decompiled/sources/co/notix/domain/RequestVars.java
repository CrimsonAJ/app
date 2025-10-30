package co.notix.domain;

import androidx.annotation.Keep;
import co.notix.ho;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public final class RequestVars {
    public static final ho Companion = new ho();
    private String var1;
    private String var2;
    private String var3;
    private String var4;
    private String var5;

    public RequestVars() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ RequestVars copy$default(RequestVars requestVars, String str, String str2, String str3, String str4, String str5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = requestVars.var1;
        }
        if ((i9 & 2) != 0) {
            str2 = requestVars.var2;
        }
        if ((i9 & 4) != 0) {
            str3 = requestVars.var3;
        }
        if ((i9 & 8) != 0) {
            str4 = requestVars.var4;
        }
        if ((i9 & 16) != 0) {
            str5 = requestVars.var5;
        }
        String str6 = str5;
        String str7 = str3;
        return requestVars.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.var1;
    }

    public final String component2() {
        return this.var2;
    }

    public final String component3() {
        return this.var3;
    }

    public final String component4() {
        return this.var4;
    }

    public final String component5() {
        return this.var5;
    }

    public final RequestVars copy(String str, String str2, String str3, String str4, String str5) {
        return new RequestVars(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestVars)) {
            return false;
        }
        RequestVars requestVars = (RequestVars) obj;
        return h.a(this.var1, requestVars.var1) && h.a(this.var2, requestVars.var2) && h.a(this.var3, requestVars.var3) && h.a(this.var4, requestVars.var4) && h.a(this.var5, requestVars.var5);
    }

    public final String getVar1() {
        return this.var1;
    }

    public final String getVar2() {
        return this.var2;
    }

    public final String getVar3() {
        return this.var3;
    }

    public final String getVar4() {
        return this.var4;
    }

    public final String getVar5() {
        return this.var5;
    }

    public int hashCode() {
        String str = this.var1;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.var2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.var3;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.var4;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.var5;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setVar1(String str) {
        this.var1 = str;
    }

    public final void setVar2(String str) {
        this.var2 = str;
    }

    public final void setVar3(String str) {
        this.var3 = str;
    }

    public final void setVar4(String str) {
        this.var4 = str;
    }

    public final void setVar5(String str) {
        this.var5 = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestVars(var1=");
        sb.append(this.var1);
        sb.append(", var2=");
        sb.append(this.var2);
        sb.append(", var3=");
        sb.append(this.var3);
        sb.append(", var4=");
        sb.append(this.var4);
        sb.append(", var5=");
        return AbstractC0953k1.p(sb, this.var5, ')');
    }

    public RequestVars(String str, String str2, String str3, String str4, String str5) {
        this.var1 = str;
        this.var2 = str2;
        this.var3 = str3;
        this.var4 = str4;
        this.var5 = str5;
    }

    public /* synthetic */ RequestVars(String str, String str2, String str3, String str4, String str5, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? null : str3, (i9 & 8) != 0 ? null : str4, (i9 & 16) != 0 ? null : str5);
    }
}
