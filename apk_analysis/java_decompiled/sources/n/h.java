package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import b5.G1;
import h.AbstractC1260a;
import java.io.IOException;
import o.o;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC1800i0;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f20986e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f20987f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f20988a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f20989b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f20990c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20991d;

    static {
        Class[] clsArr = {Context.class};
        f20986e = clsArr;
        f20987f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f20990c = context;
        Object[] objArr = {context};
        this.f20988a = objArr;
        this.f20989b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i9;
        XmlResourceParser xmlResourceParser2;
        boolean z9;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        g gVar = new g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i9 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != r42) {
                if (eventType != i9) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            xmlResourceParser2 = xmlResourceParser;
                            z9 = r42;
                            z12 = false;
                            str = null;
                            eventType = xmlResourceParser2.next();
                            r42 = z9;
                            i9 = 2;
                            z12 = z12;
                        } else if (name2.equals("group")) {
                            gVar.f20962b = 0;
                            gVar.f20963c = 0;
                            gVar.f20964d = 0;
                            gVar.f20965e = 0;
                            gVar.f20966f = r42;
                            gVar.f20967g = r42;
                        } else if (name2.equals("item")) {
                            if (!gVar.f20968h) {
                                o oVar = gVar.f20985z;
                                if (oVar != null && oVar.f21430b.hasSubMenu()) {
                                    gVar.f20968h = r42;
                                    gVar.b(gVar.f20961a.addSubMenu(gVar.f20962b, gVar.f20969i, gVar.j, gVar.f20970k).getItem());
                                } else {
                                    gVar.f20968h = r42;
                                    gVar.b(gVar.f20961a.add(gVar.f20962b, gVar.f20969i, gVar.j, gVar.f20970k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z9 = r42;
                            z11 = z9;
                        }
                    }
                    xmlResourceParser2 = xmlResourceParser;
                    z9 = r42;
                } else {
                    if (!z12) {
                        String name3 = xmlResourceParser.getName();
                        boolean equals = name3.equals("group");
                        h hVar = gVar.f20960E;
                        if (equals) {
                            TypedArray obtainStyledAttributes = hVar.f20990c.obtainStyledAttributes(attributeSet, AbstractC1260a.f17819p);
                            gVar.f20962b = obtainStyledAttributes.getResourceId(r42, 0);
                            gVar.f20963c = obtainStyledAttributes.getInt(3, 0);
                            gVar.f20964d = obtainStyledAttributes.getInt(4, 0);
                            gVar.f20965e = obtainStyledAttributes.getInt(5, 0);
                            gVar.f20966f = obtainStyledAttributes.getBoolean(2, r42);
                            gVar.f20967g = obtainStyledAttributes.getBoolean(0, r42);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                G1 v8 = G1.v(hVar.f20990c, attributeSet, AbstractC1260a.f17820q);
                                TypedArray typedArray = (TypedArray) v8.f10718c;
                                gVar.f20969i = typedArray.getResourceId(2, 0);
                                gVar.j = (typedArray.getInt(5, gVar.f20963c) & (-65536)) | (typedArray.getInt(6, gVar.f20964d) & 65535);
                                gVar.f20970k = typedArray.getText(7);
                                gVar.f20971l = typedArray.getText(8);
                                gVar.f20972m = typedArray.getResourceId(0, 0);
                                String string = typedArray.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                gVar.f20973n = charAt;
                                gVar.f20974o = typedArray.getInt(16, 4096);
                                String string2 = typedArray.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                gVar.f20975p = charAt2;
                                gVar.f20976q = typedArray.getInt(20, 4096);
                                if (typedArray.hasValue(11)) {
                                    gVar.f20977r = typedArray.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    gVar.f20977r = gVar.f20965e;
                                }
                                gVar.f20978s = typedArray.getBoolean(3, false);
                                gVar.f20979t = typedArray.getBoolean(4, gVar.f20966f);
                                gVar.f20980u = typedArray.getBoolean(1, gVar.f20967g);
                                gVar.f20981v = typedArray.getInt(21, -1);
                                gVar.f20984y = typedArray.getString(12);
                                gVar.f20982w = typedArray.getResourceId(13, 0);
                                gVar.f20983x = typedArray.getString(15);
                                String string3 = typedArray.getString(14);
                                if (string3 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && gVar.f20982w == 0 && gVar.f20983x == null) {
                                    gVar.f20985z = (o) gVar.a(string3, f20987f, hVar.f20989b);
                                } else {
                                    if (z10) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    gVar.f20985z = null;
                                }
                                gVar.f20956A = typedArray.getText(17);
                                gVar.f20957B = typedArray.getText(22);
                                if (typedArray.hasValue(19)) {
                                    gVar.f20959D = AbstractC1800i0.c(typedArray.getInt(19, -1), gVar.f20959D);
                                    colorStateList = null;
                                } else {
                                    colorStateList = null;
                                    gVar.f20959D = null;
                                }
                                if (typedArray.hasValue(18)) {
                                    gVar.f20958C = v8.n(18);
                                } else {
                                    gVar.f20958C = colorStateList;
                                }
                                v8.y();
                                gVar.f20968h = false;
                                xmlResourceParser2 = xmlResourceParser;
                                z9 = true;
                            } else if (name3.equals("menu")) {
                                z9 = true;
                                gVar.f20968h = true;
                                SubMenu addSubMenu = gVar.f20961a.addSubMenu(gVar.f20962b, gVar.f20969i, gVar.j, gVar.f20970k);
                                gVar.b(addSubMenu.getItem());
                                xmlResourceParser2 = xmlResourceParser;
                                b(xmlResourceParser2, attributeSet, addSubMenu);
                            } else {
                                xmlResourceParser2 = xmlResourceParser;
                                z9 = true;
                                str = name3;
                                z12 = true;
                            }
                            eventType = xmlResourceParser2.next();
                            r42 = z9;
                            i9 = 2;
                            z12 = z12;
                        }
                    }
                    xmlResourceParser2 = xmlResourceParser;
                    z9 = r42;
                }
                eventType = xmlResourceParser2.next();
                r42 = z9;
                i9 = 2;
                z12 = z12;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i9, Menu menu) {
        if (!(menu instanceof o.l)) {
            super.inflate(i9, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z9 = false;
        try {
            try {
                xmlResourceParser = this.f20990c.getResources().getLayout(i9);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof o.l) {
                    o.l lVar = (o.l) menu;
                    if (!lVar.f21389p) {
                        lVar.w();
                        z9 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z9) {
                    ((o.l) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th) {
            if (z9) {
                ((o.l) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
