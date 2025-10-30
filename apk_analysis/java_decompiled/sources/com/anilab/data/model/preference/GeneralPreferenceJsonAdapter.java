package com.anilab.data.model.preference;

import A0.a;
import B7.v;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class GeneralPreferenceJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13868a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13869b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13870c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f13871d;

    public GeneralPreferenceJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13868a = C1499E.o("backgroundColor", "textColor", "paddingBottom", "textSize", "typeFace", "defaultQuality", "defaultResizeMode", "langCode", "shadow");
        v vVar = v.f1137a;
        this.f13869b = moshi.b(Integer.class, vVar, "backgroundColor");
        this.f13870c = moshi.b(String.class, vVar, "langCode");
        this.f13871d = moshi.b(Float.class, vVar, "shadow");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        String str = null;
        Float f9 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13868a);
            AbstractC1719k abstractC1719k = this.f13869b;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    break;
                case 0:
                    num = (Integer) abstractC1719k.b(reader);
                    break;
                case 1:
                    num2 = (Integer) abstractC1719k.b(reader);
                    break;
                case 2:
                    num3 = (Integer) abstractC1719k.b(reader);
                    break;
                case 3:
                    num4 = (Integer) abstractC1719k.b(reader);
                    break;
                case 4:
                    num5 = (Integer) abstractC1719k.b(reader);
                    break;
                case 5:
                    num6 = (Integer) abstractC1719k.b(reader);
                    break;
                case 6:
                    num7 = (Integer) abstractC1719k.b(reader);
                    break;
                case 7:
                    str = (String) this.f13870c.b(reader);
                    break;
                case 8:
                    f9 = (Float) this.f13871d.b(reader);
                    break;
            }
        }
        reader.s();
        return new GeneralPreference(num, num2, num3, num4, num5, num6, num7, str, f9);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        GeneralPreference generalPreference = (GeneralPreference) obj;
        h.e(writer, "writer");
        if (generalPreference != null) {
            writer.d();
            writer.x("backgroundColor");
            Integer num = generalPreference.f13859a;
            AbstractC1719k abstractC1719k = this.f13869b;
            abstractC1719k.e(writer, num);
            writer.x("textColor");
            abstractC1719k.e(writer, generalPreference.f13860b);
            writer.x("paddingBottom");
            abstractC1719k.e(writer, generalPreference.f13861c);
            writer.x("textSize");
            abstractC1719k.e(writer, generalPreference.f13862d);
            writer.x("typeFace");
            abstractC1719k.e(writer, generalPreference.f13863e);
            writer.x("defaultQuality");
            abstractC1719k.e(writer, generalPreference.f13864f);
            writer.x("defaultResizeMode");
            abstractC1719k.e(writer, generalPreference.f13865g);
            writer.x("langCode");
            this.f13870c.e(writer, generalPreference.f13866h);
            writer.x("shadow");
            this.f13871d.e(writer, generalPreference.f13867i);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(GeneralPreference)");
    }
}
