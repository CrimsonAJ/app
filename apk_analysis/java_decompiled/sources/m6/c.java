package m6;

import F4.y;
import P5.I;
import android.os.Bundle;
import b5.D0;
import com.google.android.gms.internal.measurement.C0952k0;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.Z;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p6.C1860a;
import p6.C1862c;
import p6.InterfaceC1861b;
import q6.AbstractC1916a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final S6.b f20864a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f20865b = null;

    public c(S6.b bVar) {
        this.f20864a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f20858a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            b bVar2 = (b) obj;
            if (bVar2.f20858a.equals(str) && bVar2.f20859b.equals(bVar.f20859b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, p6.a] */
    public final ArrayList b() {
        C1862c c1862c = (C1862c) ((InterfaceC1861b) this.f20864a.get());
        c1862c.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((C0952k0) c1862c.f22197a.f22734a).e("frc", "")) {
            I i9 = AbstractC1916a.f22429a;
            y.h(bundle);
            ?? obj = new Object();
            String str = (String) D0.a(bundle, "origin", String.class, null);
            y.h(str);
            obj.f22182a = str;
            String str2 = (String) D0.a(bundle, "name", String.class, null);
            y.h(str2);
            obj.f22183b = str2;
            obj.f22184c = D0.a(bundle, "value", Object.class, null);
            obj.f22185d = (String) D0.a(bundle, "trigger_event_name", String.class, null);
            obj.f22186e = ((Long) D0.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.f22187f = (String) D0.a(bundle, "timed_out_event_name", String.class, null);
            obj.f22188g = (Bundle) D0.a(bundle, "timed_out_event_params", Bundle.class, null);
            obj.f22189h = (String) D0.a(bundle, "triggered_event_name", String.class, null);
            obj.f22190i = (Bundle) D0.a(bundle, "triggered_event_params", Bundle.class, null);
            obj.j = ((Long) D0.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.f22191k = (String) D0.a(bundle, "expired_event_name", String.class, null);
            obj.f22192l = (Bundle) D0.a(bundle, "expired_event_params", Bundle.class, null);
            obj.f22194n = ((Boolean) D0.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.f22193m = ((Long) D0.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.f22195o = ((Long) D0.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(ArrayList arrayList) {
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        String str;
        String str2;
        String str3;
        String str4;
        int i9 = 0;
        int i10 = 1;
        S6.b bVar = this.f20864a;
        if (bVar.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                String str5 = "";
                if (it.hasNext()) {
                    Map map = (Map) it.next();
                    String[] strArr = b.f20856g;
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr2 = b.f20856g;
                    for (int i11 = 0; i11 < 5; i11++) {
                        String str6 = strArr2[i11];
                        if (!map.containsKey(str6)) {
                            arrayList3.add(str6);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        try {
                            Date parse = b.f20857h.parse((String) map.get("experimentStartTime"));
                            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                            String str7 = (String) map.get("experimentId");
                            String str8 = (String) map.get("variantId");
                            if (map.containsKey("triggerEvent")) {
                                str5 = (String) map.get("triggerEvent");
                            }
                            arrayList2.add(new b(str7, str8, str5, parse, parseLong, parseLong2));
                        } catch (NumberFormatException e8) {
                            throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e8);
                        } catch (ParseException e9) {
                            throw new Exception("Could not process experiment: parsing experiment start time failed.", e9);
                        }
                    } else {
                        throw new Exception(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                    }
                } else {
                    String str9 = null;
                    if (arrayList2.isEmpty()) {
                        if (bVar.get() != null) {
                            ArrayList b9 = b();
                            int size = b9.size();
                            while (i9 < size) {
                                Object obj = b9.get(i9);
                                i9++;
                                String str10 = ((C1860a) obj).f22183b;
                                C0952k0 c0952k0 = (C0952k0) ((C1862c) ((InterfaceC1861b) bVar.get())).f22197a.f22734a;
                                c0952k0.getClass();
                                c0952k0.b(new Z(c0952k0, str10, null, null, 0));
                            }
                            return;
                        }
                        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    if (bVar.get() != null) {
                        ArrayList b10 = b();
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = b10.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = b10.get(i12);
                            i12 += i10;
                            C1860a c1860a = (C1860a) obj2;
                            String[] strArr3 = b.f20856g;
                            String str11 = c1860a.f22185d;
                            if (str11 == null) {
                                str4 = "";
                            } else {
                                str4 = str11;
                            }
                            arrayList4.add(new b(c1860a.f22183b, String.valueOf(c1860a.f22184c), str4, new Date(c1860a.f22193m), c1860a.f22186e, c1860a.j));
                            str9 = str9;
                            bVar = bVar;
                            i10 = i10;
                        }
                        S6.b bVar2 = bVar;
                        String str12 = str9;
                        ArrayList arrayList5 = new ArrayList();
                        int size3 = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj3 = arrayList4.get(i13);
                            i13++;
                            b bVar3 = (b) obj3;
                            if (!a(arrayList2, bVar3)) {
                                arrayList5.add(bVar3.a());
                            }
                        }
                        int size4 = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size4) {
                            Object obj4 = arrayList5.get(i14);
                            i14++;
                            String str13 = ((C1860a) obj4).f22183b;
                            C0952k0 c0952k02 = (C0952k0) ((C1862c) ((InterfaceC1861b) bVar2.get())).f22197a.f22734a;
                            c0952k02.getClass();
                            String str14 = str12;
                            c0952k02.b(new Z(c0952k02, str13, str14, str12, 0));
                            str12 = str14;
                        }
                        String str15 = str12;
                        ArrayList arrayList6 = new ArrayList();
                        int size5 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size5) {
                            Object obj5 = arrayList2.get(i15);
                            i15++;
                            b bVar4 = (b) obj5;
                            if (!a(arrayList4, bVar4)) {
                                arrayList6.add(bVar4);
                            }
                        }
                        ArrayDeque arrayDeque = new ArrayDeque(b());
                        if (this.f20865b == null) {
                            this.f20865b = Integer.valueOf(((C0952k0) ((C1862c) ((InterfaceC1861b) bVar2.get())).f22197a.f22734a).c("frc"));
                        }
                        int intValue = this.f20865b.intValue();
                        int size6 = arrayList6.size();
                        int i16 = 0;
                        while (i16 < size6) {
                            int i17 = i16 + 1;
                            b bVar5 = (b) arrayList6.get(i16);
                            while (arrayDeque.size() >= intValue) {
                                String str16 = ((C1860a) arrayDeque.pollFirst()).f22183b;
                                C0952k0 c0952k03 = (C0952k0) ((C1862c) ((InterfaceC1861b) bVar2.get())).f22197a.f22734a;
                                c0952k03.getClass();
                                c0952k03.b(new Z(c0952k03, str16, str15, str15, 0));
                            }
                            C1860a a5 = bVar5.a();
                            C1862c c1862c = (C1862c) ((InterfaceC1861b) bVar2.get());
                            c1862c.getClass();
                            I i18 = AbstractC1916a.f22429a;
                            String str17 = a5.f22182a;
                            if (str17 != null && !str17.isEmpty()) {
                                Object obj6 = a5.f22184c;
                                if (obj6 != null) {
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                                        try {
                                            objectOutputStream2.writeObject(obj6);
                                            objectOutputStream2.flush();
                                            ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                            try {
                                                Object obj7 = objectInputStream2.readObject();
                                                try {
                                                    objectOutputStream2.close();
                                                    objectInputStream2.close();
                                                } catch (IOException | ClassNotFoundException unused) {
                                                    obj7 = str15;
                                                }
                                                if (obj7 == null) {
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                objectOutputStream = objectOutputStream2;
                                                objectInputStream = objectInputStream2;
                                                if (objectOutputStream != 0) {
                                                    objectOutputStream.close();
                                                }
                                                if (objectInputStream != 0) {
                                                    objectInputStream.close();
                                                }
                                                throw th;
                                                break;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            objectInputStream = str15;
                                            objectOutputStream = objectOutputStream2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        String str18 = str15;
                                        objectInputStream = str18;
                                        objectOutputStream = str18;
                                    }
                                }
                                if (AbstractC1916a.c(str17) && AbstractC1916a.d(str17, a5.f22183b) && (((str = a5.f22191k) == null || (AbstractC1916a.b(str, a5.f22192l) && AbstractC1916a.a(str17, a5.f22191k, a5.f22192l))) && (((str2 = a5.f22189h) == null || (AbstractC1916a.b(str2, a5.f22190i) && AbstractC1916a.a(str17, a5.f22189h, a5.f22190i))) && ((str3 = a5.f22187f) == null || (AbstractC1916a.b(str3, a5.f22188g) && AbstractC1916a.a(str17, a5.f22187f, a5.f22188g)))))) {
                                    Bundle bundle = new Bundle();
                                    String str19 = a5.f22182a;
                                    if (str19 != null) {
                                        bundle.putString("origin", str19);
                                    }
                                    String str20 = a5.f22183b;
                                    if (str20 != null) {
                                        bundle.putString("name", str20);
                                    }
                                    Object obj8 = a5.f22184c;
                                    if (obj8 != null) {
                                        D0.e(bundle, obj8);
                                    }
                                    String str21 = a5.f22185d;
                                    if (str21 != null) {
                                        bundle.putString("trigger_event_name", str21);
                                    }
                                    bundle.putLong("trigger_timeout", a5.f22186e);
                                    String str22 = a5.f22187f;
                                    if (str22 != null) {
                                        bundle.putString("timed_out_event_name", str22);
                                    }
                                    Bundle bundle2 = a5.f22188g;
                                    if (bundle2 != null) {
                                        bundle.putBundle("timed_out_event_params", bundle2);
                                    }
                                    String str23 = a5.f22189h;
                                    if (str23 != null) {
                                        bundle.putString("triggered_event_name", str23);
                                    }
                                    Bundle bundle3 = a5.f22190i;
                                    if (bundle3 != null) {
                                        bundle.putBundle("triggered_event_params", bundle3);
                                    }
                                    bundle.putLong("time_to_live", a5.j);
                                    String str24 = a5.f22191k;
                                    if (str24 != null) {
                                        bundle.putString("expired_event_name", str24);
                                    }
                                    Bundle bundle4 = a5.f22192l;
                                    if (bundle4 != null) {
                                        bundle.putBundle("expired_event_params", bundle4);
                                    }
                                    bundle.putLong("creation_timestamp", a5.f22193m);
                                    bundle.putBoolean("active", a5.f22194n);
                                    bundle.putLong("triggered_timestamp", a5.f22195o);
                                    C0952k0 c0952k04 = (C0952k0) c1862c.f22197a.f22734a;
                                    c0952k04.getClass();
                                    c0952k04.b(new Y(c0952k04, bundle, i9));
                                }
                            }
                            arrayDeque.offer(a5);
                            i16 = i17;
                        }
                        return;
                    }
                    throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
            }
        } else {
            throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
