package com.anilab.data.model.preference;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;
import u0.z;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class RecentlyWatchedJson {

    /* renamed from: a, reason: collision with root package name */
    public final long f13872a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13873b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13874c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13875d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13876e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13877f;

    /* renamed from: g, reason: collision with root package name */
    public final List f13878g;

    public RecentlyWatchedJson(@InterfaceC1717i(name = "animeId") long j, @InterfaceC1717i(name = "episodeId") long j4, @InterfaceC1717i(name = "positionMs") long j9, @InterfaceC1717i(name = "animeName") String animeName, @InterfaceC1717i(name = "animePoster") String animePoster, @InterfaceC1717i(name = "animeYear") int i9, @InterfaceC1717i(name = "animeAllNames") List<String> allNames) {
        h.e(animeName, "animeName");
        h.e(animePoster, "animePoster");
        h.e(allNames, "allNames");
        this.f13872a = j;
        this.f13873b = j4;
        this.f13874c = j9;
        this.f13875d = animeName;
        this.f13876e = animePoster;
        this.f13877f = i9;
        this.f13878g = allNames;
    }

    public final RecentlyWatchedJson copy(@InterfaceC1717i(name = "animeId") long j, @InterfaceC1717i(name = "episodeId") long j4, @InterfaceC1717i(name = "positionMs") long j9, @InterfaceC1717i(name = "animeName") String animeName, @InterfaceC1717i(name = "animePoster") String animePoster, @InterfaceC1717i(name = "animeYear") int i9, @InterfaceC1717i(name = "animeAllNames") List<String> allNames) {
        h.e(animeName, "animeName");
        h.e(animePoster, "animePoster");
        h.e(allNames, "allNames");
        return new RecentlyWatchedJson(j, j4, j9, animeName, animePoster, i9, allNames);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyWatchedJson)) {
            return false;
        }
        RecentlyWatchedJson recentlyWatchedJson = (RecentlyWatchedJson) obj;
        return this.f13872a == recentlyWatchedJson.f13872a && this.f13873b == recentlyWatchedJson.f13873b && this.f13874c == recentlyWatchedJson.f13874c && h.a(this.f13875d, recentlyWatchedJson.f13875d) && h.a(this.f13876e, recentlyWatchedJson.f13876e) && this.f13877f == recentlyWatchedJson.f13877f && h.a(this.f13878g, recentlyWatchedJson.f13878g);
    }

    public final int hashCode() {
        long j = this.f13872a;
        long j4 = this.f13873b;
        int i9 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j9 = this.f13874c;
        return this.f13878g.hashCode() + ((z.c(this.f13876e, z.c(this.f13875d, (i9 + ((int) (j9 ^ (j9 >>> 32)))) * 31, 31), 31) + this.f13877f) * 31);
    }

    public final String toString() {
        return "RecentlyWatchedJson(animeId=" + this.f13872a + ", episodeId=" + this.f13873b + ", positionMs=" + this.f13874c + ", animeName=" + this.f13875d + ", animePoster=" + this.f13876e + ", year=" + this.f13877f + ", allNames=" + this.f13878g + ")";
    }
}
