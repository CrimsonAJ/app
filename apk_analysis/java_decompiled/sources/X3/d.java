package X3;

import D4.n;
import F0.C0104h;
import N3.o0;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import f5.AbstractC1178j;
import f5.C1185q;
import j3.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.xmlpull.v1.XmlPullParser;
import t4.C2009A;
import t4.w;
import v4.q;
import y4.p;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f8439a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8440b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8441c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8442d;

    public d(String str) {
        y4.a.c(str);
        this.f8439a = str;
        this.f8440b = new y4.b("MediaControlChannel", null);
        this.f8442d = Collections.synchronizedList(new ArrayList());
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e8) {
                throw j0.b(null, e8);
            }
        }
        return -1;
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e8) {
                throw j0.b(null, e8);
            }
        }
        return j;
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e8) {
                throw j0.b(null, e8);
            }
        }
        throw new o0(str, 1);
    }

    public abstract Object b();

    public Object c(String str) {
        int i9 = 0;
        while (true) {
            LinkedList linkedList = (LinkedList) this.f8442d;
            if (i9 < linkedList.size()) {
                Pair pair = (Pair) linkedList.get(i9);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
                i9++;
            } else {
                d dVar = (d) this.f8441c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
        }
    }

    public boolean d(String str) {
        return false;
    }

    public Object e(XmlPullParser xmlPullParser) {
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType != 2) {
                if (eventType != 3) {
                    if (eventType == 4 && z9 && i9 == 0) {
                        k(xmlPullParser);
                    }
                } else if (!z9) {
                    continue;
                } else if (i9 > 0) {
                    i9--;
                } else {
                    String name = xmlPullParser.getName();
                    f(xmlPullParser);
                    if (!d(name)) {
                        return b();
                    }
                }
            } else {
                String name2 = xmlPullParser.getName();
                if (((String) this.f8440b).equals(name2)) {
                    j(xmlPullParser);
                    z9 = true;
                } else if (z9) {
                    if (i9 > 0) {
                        i9++;
                    } else if (d(name2)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name2);
                        String str = this.f8439a;
                        if (equals) {
                            dVar = new d(this, str, "QualityLevel");
                        } else if ("Protection".equals(name2)) {
                            dVar = new d(this, str, "Protection");
                        } else if ("StreamIndex".equals(name2)) {
                            dVar = new h(this, str);
                        }
                        if (dVar == null) {
                            i9 = 1;
                        } else {
                            a(dVar.e(xmlPullParser));
                        }
                    }
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public void l(Object obj, String str) {
        ((LinkedList) this.f8442d).add(Pair.create(str, obj));
    }

    public void m(p pVar) {
        this.f8442d.add(pVar);
    }

    public long n() {
        q qVar = (q) this.f8441c;
        if (qVar == null) {
            y4.b bVar = (y4.b) this.f8440b;
            Log.e(bVar.f24917a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) qVar.f23877b).getAndIncrement();
    }

    public void o(long j, String str) {
        int i9 = 1;
        Object[] objArr = {str, null};
        y4.b bVar = (y4.b) this.f8440b;
        bVar.getClass();
        boolean equals = Build.TYPE.equals("user");
        String str2 = bVar.f24917a;
        if (!equals && bVar.f24918b && Log.isLoggable(str2, 2)) {
            Log.v(str2, bVar.d("Sending text message: %s to: %s", objArr));
        }
        q qVar = (q) this.f8441c;
        if (qVar == null) {
            Log.e(str2, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        C2009A c2009a = (C2009A) qVar.f23876a;
        if (c2009a != null) {
            String str3 = this.f8439a;
            y4.a.c(str3);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    n g9 = n.g();
                    g9.f1864e = new w(c2009a, str3, str, i9);
                    g9.f1863d = 8405;
                    C1185q c3 = c2009a.c(1, g9.f());
                    C0104h c0104h = new C0104h(8, j, qVar);
                    c3.getClass();
                    c3.c(AbstractC1178j.f17414a, c0104h);
                    return;
                }
                y4.b bVar2 = C2009A.f23120G;
                Log.w(bVar2.f24917a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }

    public d(d dVar, String str, String str2) {
        this.f8441c = dVar;
        this.f8439a = str;
        this.f8440b = str2;
        this.f8442d = new LinkedList();
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
