package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ScheduleResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14317a;

    public ScheduleResponse(@InterfaceC1717i(name = "schedules") List<ReleaseCalendarResponse> schedules) {
        h.e(schedules, "schedules");
        this.f14317a = schedules;
    }

    public final ScheduleResponse copy(@InterfaceC1717i(name = "schedules") List<ReleaseCalendarResponse> schedules) {
        h.e(schedules, "schedules");
        return new ScheduleResponse(schedules);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScheduleResponse) && h.a(this.f14317a, ((ScheduleResponse) obj).f14317a);
    }

    public final int hashCode() {
        return this.f14317a.hashCode();
    }

    public final String toString() {
        return "ScheduleResponse(schedules=" + this.f14317a + ")";
    }
}
