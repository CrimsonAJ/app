package com.anilab.data.model.preference;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class GeneralPreference {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13859a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13860b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f13861c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13862d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f13863e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f13864f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f13865g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13866h;

    /* renamed from: i, reason: collision with root package name */
    public final Float f13867i;

    public GeneralPreference(@InterfaceC1717i(name = "backgroundColor") Integer num, @InterfaceC1717i(name = "textColor") Integer num2, @InterfaceC1717i(name = "paddingBottom") Integer num3, @InterfaceC1717i(name = "textSize") Integer num4, @InterfaceC1717i(name = "typeFace") Integer num5, @InterfaceC1717i(name = "defaultQuality") Integer num6, @InterfaceC1717i(name = "defaultResizeMode") Integer num7, @InterfaceC1717i(name = "langCode") String str, @InterfaceC1717i(name = "shadow") Float f9) {
        this.f13859a = num;
        this.f13860b = num2;
        this.f13861c = num3;
        this.f13862d = num4;
        this.f13863e = num5;
        this.f13864f = num6;
        this.f13865g = num7;
        this.f13866h = str;
        this.f13867i = f9;
    }

    public final GeneralPreference copy(@InterfaceC1717i(name = "backgroundColor") Integer num, @InterfaceC1717i(name = "textColor") Integer num2, @InterfaceC1717i(name = "paddingBottom") Integer num3, @InterfaceC1717i(name = "textSize") Integer num4, @InterfaceC1717i(name = "typeFace") Integer num5, @InterfaceC1717i(name = "defaultQuality") Integer num6, @InterfaceC1717i(name = "defaultResizeMode") Integer num7, @InterfaceC1717i(name = "langCode") String str, @InterfaceC1717i(name = "shadow") Float f9) {
        return new GeneralPreference(num, num2, num3, num4, num5, num6, num7, str, f9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralPreference)) {
            return false;
        }
        GeneralPreference generalPreference = (GeneralPreference) obj;
        return h.a(this.f13859a, generalPreference.f13859a) && h.a(this.f13860b, generalPreference.f13860b) && h.a(this.f13861c, generalPreference.f13861c) && h.a(this.f13862d, generalPreference.f13862d) && h.a(this.f13863e, generalPreference.f13863e) && h.a(this.f13864f, generalPreference.f13864f) && h.a(this.f13865g, generalPreference.f13865g) && h.a(this.f13866h, generalPreference.f13866h) && h.a(this.f13867i, generalPreference.f13867i);
    }

    public final int hashCode() {
        Integer num = this.f13859a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f13860b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f13861c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f13862d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f13863e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f13864f;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f13865g;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str = this.f13866h;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Float f9 = this.f13867i;
        return hashCode8 + (f9 != null ? f9.hashCode() : 0);
    }

    public final String toString() {
        return "GeneralPreference(backgroundColor=" + this.f13859a + ", textColor=" + this.f13860b + ", paddingBottom=" + this.f13861c + ", textSize=" + this.f13862d + ", typeFace=" + this.f13863e + ", defaultQuality=" + this.f13864f + ", defaultResizeMode=" + this.f13865g + ", langCode=" + this.f13866h + ", shadow=" + this.f13867i + ")";
    }
}
