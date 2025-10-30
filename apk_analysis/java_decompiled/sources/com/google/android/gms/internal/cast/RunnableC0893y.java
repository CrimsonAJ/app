package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import f5.C1177i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0893y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15109b;

    public /* synthetic */ RunnableC0893y(int i9, Object obj) {
        this.f15108a = i9;
        this.f15109b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        switch (this.f15108a) {
            case 0:
                C0897z.f15168d.b("get checkbox consent timed out", new Object[0]);
                ((C1177i) this.f15109b).d(Boolean.FALSE);
                return;
            case 1:
                List list = ((E) this.f15109b).f14708e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 2:
                C0870s0 c0870s0 = (C0870s0) this.f15109b;
                C0874t0 c0874t0 = c0870s0.f14979g;
                if (c0874t0 != null) {
                    c0870s0.f14973a.a((O0) c0870s0.f14975c.b(c0874t0).b(), 223);
                }
                c0870s0.e();
                return;
            default:
                C0890x0 c0890x0 = (C0890x0) this.f15109b;
                HashSet hashSet = c0890x0.f15105f;
                if (!hashSet.isEmpty()) {
                    HashSet hashSet2 = c0890x0.f15106g;
                    if (true != hashSet2.equals(hashSet)) {
                        j = 86400000;
                    } else {
                        j = 172800000;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long j4 = c0890x0.f15107h;
                    if (j4 == 0 || currentTimeMillis - j4 >= j) {
                        C0890x0.f15098i.b("Upload the feature usage report.", new Object[0]);
                        E0 l9 = F0.l();
                        String str = C0890x0.j;
                        l9.e();
                        F0.n((F0) l9.f14748b, str);
                        l9.e();
                        F0.m((F0) l9.f14748b, c0890x0.f15102c);
                        F0 f02 = (F0) l9.b();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(hashSet);
                        A0 l10 = B0.l();
                        l10.e();
                        B0.m((B0) l10.f14748b, arrayList);
                        l10.e();
                        B0.n((B0) l10.f14748b, f02);
                        B0 b02 = (B0) l10.b();
                        N0 m9 = O0.m();
                        m9.e();
                        O0.p((O0) m9.f14748b, b02);
                        c0890x0.f15100a.a((O0) m9.b(), 243);
                        SharedPreferences sharedPreferences = c0890x0.f15101b;
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (!hashSet2.equals(hashSet)) {
                            hashSet2.clear();
                            hashSet2.addAll(hashSet);
                            Iterator it = hashSet2.iterator();
                            while (it.hasNext()) {
                                String num = Integer.toString(((EnumC0894y0) it.next()).f15166a);
                                String e8 = u0.z.e("feature_usage_timestamp_reported_feature_", num);
                                if (!sharedPreferences.contains(e8)) {
                                    e8 = u0.z.e("feature_usage_timestamp_detected_feature_", num);
                                }
                                String e9 = u0.z.e("feature_usage_timestamp_reported_feature_", num);
                                if (!TextUtils.equals(e8, e9)) {
                                    long j9 = sharedPreferences.getLong(e8, 0L);
                                    edit.remove(e8);
                                    if (j9 != 0) {
                                        edit.putLong(e9, j9);
                                    }
                                }
                            }
                        }
                        c0890x0.f15107h = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
