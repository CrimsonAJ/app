package com.anilab.data.model.response;

import A0.a;
import B7.v;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class AllSettingsResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13988a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13989b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13990c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f13991d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f13992e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f13993f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1719k f13994g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1719k f13995h;

    public AllSettingsResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13988a = C1499E.o("download", "movieConfig", "commentConfig", "contactUs", "srcConfig", "player", "app_token", "client_id");
        v vVar = v.f1137a;
        this.f13989b = moshi.b(DownloaderResponse.class, vVar, "downloader");
        this.f13990c = moshi.b(MovieConfigResponse.class, vVar, "movieConfig");
        this.f13991d = moshi.b(CommentConfigResponse.class, vVar, "commentConfig");
        this.f13992e = moshi.b(ContactUsResponse.class, vVar, "contactUs");
        this.f13993f = moshi.b(SrcConfigResponse.class, vVar, "srcConfig");
        this.f13994g = moshi.b(ListPlayerResponse.class, vVar, "player");
        this.f13995h = moshi.b(String.class, vVar, "appToken");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        DownloaderResponse downloaderResponse = null;
        MovieConfigResponse movieConfigResponse = null;
        CommentConfigResponse commentConfigResponse = null;
        ContactUsResponse contactUsResponse = null;
        SrcConfigResponse srcConfigResponse = null;
        ListPlayerResponse listPlayerResponse = null;
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13988a);
            AbstractC1719k abstractC1719k = this.f13995h;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    break;
                case 0:
                    downloaderResponse = (DownloaderResponse) this.f13989b.b(reader);
                    break;
                case 1:
                    movieConfigResponse = (MovieConfigResponse) this.f13990c.b(reader);
                    break;
                case 2:
                    commentConfigResponse = (CommentConfigResponse) this.f13991d.b(reader);
                    break;
                case 3:
                    contactUsResponse = (ContactUsResponse) this.f13992e.b(reader);
                    break;
                case 4:
                    srcConfigResponse = (SrcConfigResponse) this.f13993f.b(reader);
                    break;
                case 5:
                    listPlayerResponse = (ListPlayerResponse) this.f13994g.b(reader);
                    break;
                case 6:
                    str = (String) abstractC1719k.b(reader);
                    break;
                case 7:
                    str2 = (String) abstractC1719k.b(reader);
                    break;
            }
        }
        reader.s();
        return new AllSettingsResponse(downloaderResponse, movieConfigResponse, commentConfigResponse, contactUsResponse, srcConfigResponse, listPlayerResponse, str, str2);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        AllSettingsResponse allSettingsResponse = (AllSettingsResponse) obj;
        h.e(writer, "writer");
        if (allSettingsResponse != null) {
            writer.d();
            writer.x("download");
            this.f13989b.e(writer, allSettingsResponse.f13980a);
            writer.x("movieConfig");
            this.f13990c.e(writer, allSettingsResponse.f13981b);
            writer.x("commentConfig");
            this.f13991d.e(writer, allSettingsResponse.f13982c);
            writer.x("contactUs");
            this.f13992e.e(writer, allSettingsResponse.f13983d);
            writer.x("srcConfig");
            this.f13993f.e(writer, allSettingsResponse.f13984e);
            writer.x("player");
            this.f13994g.e(writer, allSettingsResponse.f13985f);
            writer.x("app_token");
            AbstractC1719k abstractC1719k = this.f13995h;
            abstractC1719k.e(writer, allSettingsResponse.f13986g);
            writer.x("client_id");
            abstractC1719k.e(writer, allSettingsResponse.f13987h);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(41, "GeneratedJsonAdapter(AllSettingsResponse)");
    }
}
