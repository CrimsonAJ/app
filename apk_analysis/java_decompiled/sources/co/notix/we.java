package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class we {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13422a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13423b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13424c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13425d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f13426e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f13427f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f13428g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f13429h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13430i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f13431k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f13432l;

    /* renamed from: m, reason: collision with root package name */
    public final String f13433m;

    /* renamed from: n, reason: collision with root package name */
    public final String f13434n;

    /* renamed from: o, reason: collision with root package name */
    public final String f13435o;

    /* renamed from: p, reason: collision with root package name */
    public final String f13436p;

    public we(Integer num, String str, String str2, String str3, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Integer num3, Boolean bool4, String str6, String str7, String str8, String str9) {
        this.f13422a = num;
        this.f13423b = str;
        this.f13424c = str2;
        this.f13425d = str3;
        this.f13426e = num2;
        this.f13427f = bool;
        this.f13428g = bool2;
        this.f13429h = bool3;
        this.f13430i = str4;
        this.j = str5;
        this.f13431k = num3;
        this.f13432l = bool4;
        this.f13433m = str6;
        this.f13434n = str7;
        this.f13435o = str8;
        this.f13436p = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return kotlin.jvm.internal.h.a(this.f13422a, weVar.f13422a) && kotlin.jvm.internal.h.a(this.f13423b, weVar.f13423b) && kotlin.jvm.internal.h.a(this.f13424c, weVar.f13424c) && kotlin.jvm.internal.h.a(this.f13425d, weVar.f13425d) && kotlin.jvm.internal.h.a(this.f13426e, weVar.f13426e) && kotlin.jvm.internal.h.a(this.f13427f, weVar.f13427f) && kotlin.jvm.internal.h.a(this.f13428g, weVar.f13428g) && kotlin.jvm.internal.h.a(this.f13429h, weVar.f13429h) && kotlin.jvm.internal.h.a(this.f13430i, weVar.f13430i) && kotlin.jvm.internal.h.a(this.j, weVar.j) && kotlin.jvm.internal.h.a(this.f13431k, weVar.f13431k) && kotlin.jvm.internal.h.a(this.f13432l, weVar.f13432l) && kotlin.jvm.internal.h.a(this.f13433m, weVar.f13433m) && kotlin.jvm.internal.h.a(this.f13434n, weVar.f13434n) && kotlin.jvm.internal.h.a(this.f13435o, weVar.f13435o) && kotlin.jvm.internal.h.a(this.f13436p, weVar.f13436p);
    }

    public final int hashCode() {
        Integer num = this.f13422a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f13423b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13424c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13425d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f13426e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f13427f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f13428g;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f13429h;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.f13430i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f13431k;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.f13432l;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.f13433m;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f13434n;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f13435o;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f13436p;
        return hashCode15 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notification(color=");
        sb.append(this.f13422a);
        sb.append(", event=");
        sb.append(this.f13423b);
        sb.append(", iconUrl=");
        sb.append(this.f13424c);
        sb.append(", imageUrl=");
        sb.append(this.f13425d);
        sb.append(", priority=");
        sb.append(this.f13426e);
        sb.append(", showBadgeIcon=");
        sb.append(this.f13427f);
        sb.append(", showOnlyLastNotification=");
        sb.append(this.f13428g);
        sb.append(", showToast=");
        sb.append(this.f13429h);
        sb.append(", title=");
        sb.append(this.f13430i);
        sb.append(", text=");
        sb.append(this.j);
        sb.append(", importance=");
        sb.append(this.f13431k);
        sb.append(", randomGroupId=");
        sb.append(this.f13432l);
        sb.append(", clickData=");
        sb.append(this.f13433m);
        sb.append(", impressionData=");
        sb.append(this.f13434n);
        sb.append(", pingData=");
        sb.append(this.f13435o);
        sb.append(", targetUrl=");
        return AbstractC0953k1.p(sb, this.f13436p, ')');
    }
}
