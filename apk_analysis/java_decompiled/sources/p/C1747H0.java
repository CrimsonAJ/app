package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import l.AbstractC1526a;

/* renamed from: p.H0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1747H0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21817a;

    public /* synthetic */ C1747H0(int i9) {
        this.f21817a = i9;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f21817a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C1747H0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC1526a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e8) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e8);
                    return null;
                }
            case 1:
                try {
                    return k.e.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e9) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e9);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    Y0.f fVar = new Y0.f(context);
                    fVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return fVar;
                } catch (Exception e10) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    Y0.r rVar = new Y0.r();
                    rVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return rVar;
                } catch (Exception e11) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e11);
                    return null;
                }
        }
    }
}
