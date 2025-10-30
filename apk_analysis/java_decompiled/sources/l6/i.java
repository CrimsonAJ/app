package l6;

import F4.y;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f20601a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20602b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20603c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20604d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20605e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20606f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20607g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z9;
        int i9 = K4.d.f4302a;
        if (str != null && !str.trim().isEmpty()) {
            z9 = false;
        } else {
            z9 = true;
        }
        y.j("ApplicationId must be set.", true ^ z9);
        this.f20602b = str;
        this.f20601a = str2;
        this.f20603c = str3;
        this.f20604d = str4;
        this.f20605e = str5;
        this.f20606f = str6;
        this.f20607g = str7;
    }

    public static i a(Context context) {
        A1.g gVar = new A1.g(context);
        String v8 = gVar.v("google_app_id");
        if (TextUtils.isEmpty(v8)) {
            return null;
        }
        return new i(v8, gVar.v("google_api_key"), gVar.v("firebase_database_url"), gVar.v("ga_trackingId"), gVar.v("gcm_defaultSenderId"), gVar.v("google_storage_bucket"), gVar.v("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!y.k(this.f20602b, iVar.f20602b) || !y.k(this.f20601a, iVar.f20601a) || !y.k(this.f20603c, iVar.f20603c) || !y.k(this.f20604d, iVar.f20604d) || !y.k(this.f20605e, iVar.f20605e) || !y.k(this.f20606f, iVar.f20606f) || !y.k(this.f20607g, iVar.f20607g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20602b, this.f20601a, this.f20603c, this.f20604d, this.f20605e, this.f20606f, this.f20607g});
    }

    public final String toString() {
        A1.g gVar = new A1.g(this);
        gVar.j(this.f20602b, "applicationId");
        gVar.j(this.f20601a, "apiKey");
        gVar.j(this.f20603c, "databaseUrl");
        gVar.j(this.f20605e, "gcmSenderId");
        gVar.j(this.f20606f, "storageBucket");
        gVar.j(this.f20607g, "projectId");
        return gVar.toString();
    }
}
