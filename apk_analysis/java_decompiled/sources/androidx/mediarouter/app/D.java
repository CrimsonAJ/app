package androidx.mediarouter.app;

import F0.r0;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC1984s;
import t0.C1971e;
import t0.C1983q;
import t0.C1991z;

/* loaded from: classes.dex */
public final class D implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9941b;

    public /* synthetic */ D(int i9, Object obj) {
        this.f9940a = i9;
        this.f9941b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int max;
        boolean z9;
        int i9;
        switch (this.f9940a) {
            case 0:
                E e8 = (E) this.f9941b;
                N n7 = e8.f9945x;
                if (n7.f10043w != null) {
                    n7.f10038r.removeMessages(2);
                }
                N n9 = e8.f9945x;
                n9.f10043w = e8.f9942u;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (!isActivated) {
                    max = 0;
                } else {
                    Integer num = (Integer) n9.f10044x.get(e8.f9942u.f22842c);
                    if (num == null) {
                        max = 1;
                    } else {
                        max = Math.max(1, num.intValue());
                    }
                }
                e8.s(z10);
                e8.f9944w.setProgress(max);
                e8.f9942u.j(max);
                n9.f10038r.sendEmptyMessageDelayed(2, 500L);
                return;
            case 1:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) this.f9941b;
                boolean z11 = mediaRouteExpandCollapseButton.f10002h;
                mediaRouteExpandCollapseButton.f10002h = !z11;
                if (!z11) {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f9998d);
                    mediaRouteExpandCollapseButton.f9998d.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f10001g);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f9999e);
                    mediaRouteExpandCollapseButton.f9999e.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f10000f);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f10003i;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                ((A) this.f9941b).dismiss();
                return;
            case 3:
                G g9 = (G) this.f9941b;
                N n10 = g9.f9948A.f9979m;
                t0.C c3 = g9.f9954z;
                n10.f10015f.getClass();
                if (c3 != null) {
                    t0.D.b();
                    C1971e c9 = t0.D.c();
                    C1991z a5 = c9.f22966d.a();
                    if (a5 == null) {
                        Log.w("AxMediaRouter", "Ignoring attempt to transfer for a selected non-group route");
                    } else {
                        List<t0.C> singletonList = Collections.singletonList(c3);
                        ArrayList arrayList = new ArrayList();
                        for (t0.C c10 : singletonList) {
                            C1983q c1983q = (C1983q) a5.f23055x.get(c10.f22842c);
                            if (c1983q != null && c1983q.f23027e) {
                                arrayList.add(c10.f22841b);
                            } else {
                                Log.w("AxMediaRouter", "Ignoring attempt to update the group with a non-transferable route: " + c10);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Log.w("AxMediaRouter", "Ignoring attempt to update the group with non-transferable routes");
                        } else if (a5.g()) {
                            AbstractC1984s abstractC1984s = c9.f22967e;
                            if (abstractC1984s instanceof t0.r) {
                                ((t0.r) abstractC1984s).o(arrayList);
                            } else {
                                throw new IllegalStateException("There is no currently selected dynamic group route.");
                            }
                        } else if (a5.n()) {
                            c9.e();
                            Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + a5);
                        } else {
                            Log.w("AxMediaRouter", "Ignoring attempt to update routes for an unsupported group route:" + a5);
                        }
                    }
                    g9.f9950v.setVisibility(4);
                    g9.f9951w.setVisibility(0);
                    return;
                }
                throw new NullPointerException("route must not be null");
            default:
                K k5 = (K) this.f9941b;
                boolean t7 = k5.t(k5.f9942u);
                boolean z12 = !t7;
                boolean e9 = k5.f9942u.e();
                boolean z13 = true;
                L l9 = k5.f9968H;
                if (!t7) {
                    N n11 = l9.f9979m;
                    t0.C c11 = k5.f9942u;
                    n11.f10015f.getClass();
                    if (c11 != null) {
                        t0.D.b();
                        C1971e c12 = t0.D.c();
                        C1991z a9 = c12.f22966d.a();
                        if (a9 == null) {
                            Log.w("AxMediaRouter", "Ignoring attempt to add a member route to a selected non-group route");
                        } else if (!a9.o(c11)) {
                            Log.w("AxMediaRouter", "Ignoring attempt to add a non-groupable member route: " + c11);
                        } else if (Collections.unmodifiableList(a9.f22860v).contains(c11)) {
                            Log.w("AxMediaRouter", "Ignoring attempt to add an existing member route: " + c11);
                        } else if (a9.g()) {
                            AbstractC1984s abstractC1984s2 = c12.f22967e;
                            if (abstractC1984s2 instanceof t0.r) {
                                ((t0.r) abstractC1984s2).m(c11.f22841b);
                            } else {
                                throw new IllegalStateException("There is no currently selected dynamic group route.");
                            }
                        } else if (a9.n()) {
                            c12.e();
                            Log.w("AxMediaRouter", "Ignoring attempt to add a route to a non-available connected route: " + a9);
                        } else {
                            Log.w("AxMediaRouter", "Ignoring attempt to add a route to an unsupported group route:" + a9);
                        }
                    } else {
                        throw new NullPointerException("route must not be null");
                    }
                } else {
                    N n12 = l9.f9979m;
                    t0.C c13 = k5.f9942u;
                    n12.f10015f.getClass();
                    if (c13 != null) {
                        t0.D.b();
                        C1971e c14 = t0.D.c();
                        C1991z a10 = c14.f22966d.a();
                        if (a10 == null) {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove a member route from a selected non-group route");
                        } else {
                            C1983q c1983q2 = (C1983q) a10.f23055x.get(c13.f22842c);
                            if (c1983q2 != null && c1983q2.f23025c) {
                                if (!Collections.unmodifiableList(a10.f22860v).contains(c13)) {
                                    Log.w("AxMediaRouter", "Ignoring attempt to remove a non-in-group member route: " + c13);
                                } else if (Collections.unmodifiableList(a10.f22860v).size() <= 1) {
                                    Log.w("AxMediaRouter", "Ignoring attempt to remove the last member route.");
                                } else if (a10.g()) {
                                    AbstractC1984s abstractC1984s3 = c14.f22967e;
                                    if (abstractC1984s3 instanceof t0.r) {
                                        ((t0.r) abstractC1984s3).n(c13.f22841b);
                                    } else {
                                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                                    }
                                } else if (a10.n()) {
                                    c14.e();
                                    Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + a10);
                                } else {
                                    Log.w("AxMediaRouter", "Ignoring attempt to remove a route from an unsupported group route:" + a10);
                                }
                            } else {
                                Log.w("AxMediaRouter", "Ignoring attempt to remove a non-unselectable member route: " + c13);
                            }
                        }
                    } else {
                        throw new NullPointerException("route must not be null");
                    }
                }
                k5.u(z12, !e9);
                if (e9) {
                    List unmodifiableList = Collections.unmodifiableList(l9.f9979m.f10021i.f22860v);
                    for (t0.C c15 : Collections.unmodifiableList(k5.f9942u.f22860v)) {
                        if (unmodifiableList.contains(c15) != z12) {
                            E e10 = (E) l9.f9979m.f10042v.get(c15.f22842c);
                            if (e10 instanceof K) {
                                ((K) e10).u(z12, true);
                            }
                        }
                    }
                }
                t0.C c16 = k5.f9942u;
                N n13 = l9.f9979m;
                List unmodifiableList2 = Collections.unmodifiableList(n13.f10021i.f22860v);
                int max2 = Math.max(1, unmodifiableList2.size());
                int i10 = -1;
                if (c16.e()) {
                    Iterator it = Collections.unmodifiableList(c16.f22860v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((t0.C) it.next()) != z12) {
                            if (!t7) {
                                i9 = 1;
                            } else {
                                i9 = -1;
                            }
                            max2 += i9;
                        }
                    }
                } else {
                    if (!t7) {
                        i10 = 1;
                    }
                    max2 += i10;
                }
                N n14 = l9.f9979m;
                int i11 = 0;
                if (n14.f10037q0 && Collections.unmodifiableList(n14.f10021i.f22860v).size() > 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!n13.f10037q0 || max2 < 2) {
                    z13 = false;
                }
                if (z9 != z13) {
                    r0 I4 = n13.f10039s.I(0);
                    if (I4 instanceof H) {
                        H h7 = (H) I4;
                        View view2 = h7.f2210a;
                        if (z13) {
                            i11 = h7.f9957z;
                        }
                        l9.n(view2, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
