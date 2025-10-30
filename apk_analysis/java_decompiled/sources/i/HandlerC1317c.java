package i;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import j2.C1435b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t0.AbstractC1984s;
import t0.C1971e;
import t0.C1980n;
import t0.C1981o;
import t0.C1983q;
import t0.C1987v;
import t0.Q;
import t0.S;
import t0.T;
import t0.U;
import t0.W;
import t0.X;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1317c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18037a = 0;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f18038b;

    public /* synthetic */ HandlerC1317c() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1980n c1980n;
        C1980n c1980n2;
        C1983q c1983q;
        switch (this.f18037a) {
            case 0:
                int i9 = message.what;
                if (i9 != -3 && i9 != -2 && i9 != -1) {
                    if (i9 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f18038b.get(), message.what);
                return;
            default:
                Q q9 = (Q) this.f18038b.get();
                if (q9 != null) {
                    int i10 = message.what;
                    int i11 = message.arg1;
                    int i12 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    SparseArray sparseArray = q9.f22903h;
                    W w7 = q9.f22904i;
                    int i13 = 0;
                    String str = null;
                    S s9 = null;
                    S s10 = null;
                    ArrayList arrayList = w7.f22926k;
                    switch (i10) {
                        case 0:
                            if (i11 == q9.f22902g) {
                                q9.f22902g = 0;
                                if (w7.f22929n == q9) {
                                    w7.k();
                                }
                            }
                            if (((T) sparseArray.get(i11)) != null) {
                                sparseArray.remove(i11);
                                T.a(null, null);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (q9.f22901f == 0 && i11 == q9.f22902g && i12 >= 1) {
                                    q9.f22902g = 0;
                                    q9.f22901f = i12;
                                    C1987v a5 = C1987v.a(bundle);
                                    if (w7.f22929n == q9) {
                                        w7.f(a5);
                                    }
                                    if (w7.f22929n == q9) {
                                        w7.f22930o = true;
                                        int size = arrayList.size();
                                        while (i13 < size) {
                                            ((S) arrayList.get(i13)).c(w7.f22929n);
                                            i13++;
                                        }
                                        C1981o c1981o = w7.f23039e;
                                        if (c1981o != null) {
                                            Q q10 = w7.f22929n;
                                            int i14 = q10.f22899d;
                                            q10.f22899d = 1 + i14;
                                            q10.b(10, i14, 0, c1981o.f23016a, null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                T t7 = (T) sparseArray.get(i11);
                                if (t7 != null) {
                                    sparseArray.remove(i11);
                                    t7.b(bundle2);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                if (peekData != null) {
                                    str = peekData.getString("error");
                                }
                                Bundle bundle3 = (Bundle) obj;
                                if (((T) sparseArray.get(i11)) != null) {
                                    sparseArray.remove(i11);
                                    T.a(str, bundle3);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (q9.f22901f != 0) {
                                    C1987v a9 = C1987v.a(bundle4);
                                    if (w7.f22929n == q9) {
                                        w7.f(a9);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                T t9 = (T) sparseArray.get(i11);
                                if (bundle5 != null && bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i11);
                                    t9.b(bundle5);
                                    break;
                                } else {
                                    t9.getClass();
                                    T.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (q9.f22901f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    if (bundle7 != null) {
                                        c1980n = new C1980n(bundle7);
                                    } else {
                                        c1980n = null;
                                    }
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        Object obj2 = parcelableArrayList.get(i15);
                                        i15++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            c1983q = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            if (bundle9 != null) {
                                                c1980n2 = new C1980n(bundle9);
                                            } else {
                                                c1980n2 = null;
                                            }
                                            c1983q = new C1983q(c1980n2, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(c1983q);
                                    }
                                    if (w7.f22929n == q9) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i13 < size3) {
                                                Object obj3 = arrayList.get(i13);
                                                i13++;
                                                S s11 = (S) obj3;
                                                if (s11.a() == i12) {
                                                    s10 = s11;
                                                }
                                            }
                                        }
                                        if (s10 instanceof U) {
                                            ((U) s10).l(c1980n, arrayList2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (w7.f22929n == q9) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i13 < size4) {
                                        Object obj4 = arrayList.get(i13);
                                        i13++;
                                        S s12 = (S) obj4;
                                        if (s12.a() == i12) {
                                            s9 = s12;
                                        }
                                    }
                                }
                                C1435b c1435b = w7.f22931p;
                                if (c1435b != null && (s9 instanceof AbstractC1984s)) {
                                    AbstractC1984s abstractC1984s = (AbstractC1984s) s9;
                                    C1971e c1971e = ((X) c1435b.f19200b).f22933b;
                                    if (c1971e.f22967e == abstractC1984s) {
                                        c1971e.j(c1971e.c(), 2, true);
                                    }
                                }
                                if (s9 != null) {
                                    arrayList.remove(s9);
                                    s9.b();
                                    w7.l();
                                    break;
                                }
                            }
                            break;
                    }
                    int i16 = W.f22924q;
                    return;
                }
                return;
        }
    }

    public HandlerC1317c(Q q9) {
        this.f18038b = new WeakReference(q9);
    }
}
