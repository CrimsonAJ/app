package q2;

import Y7.y0;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import b8.AbstractC0714M;
import b8.C0718Q;
import co.notix.R;
import com.anilab.domain.model.LatestVersion;

/* renamed from: q2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1895x extends M1.r {

    /* renamed from: f, reason: collision with root package name */
    public final Application f22277f;

    /* renamed from: g, reason: collision with root package name */
    public final K1.g f22278g;

    /* renamed from: h, reason: collision with root package name */
    public final C0718Q f22279h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f22280i;
    public final C0718Q j;

    /* renamed from: k, reason: collision with root package name */
    public final String f22281k;

    /* renamed from: l, reason: collision with root package name */
    public y0 f22282l;

    /* renamed from: m, reason: collision with root package name */
    public Uri f22283m;

    /* renamed from: n, reason: collision with root package name */
    public String f22284n;

    public C1895x(Application application, K1.g downloader, L2.u linkUseCase) {
        kotlin.jvm.internal.h.e(downloader, "downloader");
        kotlin.jvm.internal.h.e(linkUseCase, "linkUseCase");
        this.f22277f = application;
        this.f22278g = downloader;
        this.f22279h = AbstractC0714M.c(0);
        this.f22280i = AbstractC0714M.c(new M1.t(C1890s.f22269b));
        this.j = AbstractC0714M.c(new LatestVersion());
        this.f22281k = L2.u.a(linkUseCase, 0L, 1);
        this.f22284n = "";
    }

    public final void g() {
        Uri EXTERNAL_CONTENT_URI;
        Application application = this.f22277f;
        try {
            EXTERNAL_CONTENT_URI = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            kotlin.jvm.internal.h.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            ContentResolver contentResolver = application.getContentResolver();
            Cursor query = contentResolver.query(EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_display_name = ?", new String[]{application.getString(R.string.label_apk_name)}, null);
            if (query != null && query.moveToFirst()) {
                Uri withAppendedId = ContentUris.withAppendedId(EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id")));
                kotlin.jvm.internal.h.d(withAppendedId, "withAppendedId(...)");
                contentResolver.delete(withAppendedId, null, null);
                query.close();
            }
        } catch (Exception unused) {
        }
    }
}
