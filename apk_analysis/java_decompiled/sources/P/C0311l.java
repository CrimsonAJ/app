package P;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: P.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311l {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f5614a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f5615b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f5616c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5617d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f5618e;

    public C0311l(ViewGroup viewGroup) {
        this.f5616c = viewGroup;
    }

    public final boolean a(float f9, float f10, boolean z9) {
        ViewParent e8;
        if (this.f5617d && (e8 = e(0)) != null) {
            try {
                return e8.onNestedFling(this.f5616c, f9, f10, z9);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedFling", e9);
            }
        }
        return false;
    }

    public final boolean b(float f9, float f10) {
        ViewParent e8;
        if (this.f5617d && (e8 = e(0)) != null) {
            try {
                return e8.onNestedPreFling(this.f5616c, f9, f10);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedPreFling", e9);
            }
        }
        return false;
    }

    public final boolean c(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent e8;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f5617d || (e8 = e(i11)) == null) {
            return false;
        }
        if (i9 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f5616c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f5618e == null) {
                this.f5618e = new int[2];
            }
            iArr3 = this.f5618e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e8 instanceof InterfaceC0312m) {
            ((InterfaceC0312m) e8).c(viewGroup, i9, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                e8.onNestedPreScroll(viewGroup, i9, i10, iArr3);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedPreScroll", e9);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent e8;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f5617d && (e8 = e(i13)) != null) {
            if (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    return false;
                }
            } else {
                ViewGroup viewGroup = this.f5616c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f5618e == null) {
                        this.f5618e = new int[2];
                    }
                    int[] iArr4 = this.f5618e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e8 instanceof InterfaceC0313n) {
                    ((InterfaceC0313n) e8).d(viewGroup, i9, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (e8 instanceof InterfaceC0312m) {
                        ((InterfaceC0312m) e8).e(viewGroup, i9, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            e8.onNestedScroll(viewGroup, i9, i10, i11, i12);
                        } catch (AbstractMethodError e9) {
                            Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedScroll", e9);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
        }
        return false;
    }

    public final ViewParent e(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return null;
            }
            return this.f5615b;
        }
        return this.f5614a;
    }

    public final boolean f(int i9) {
        if (e(i9) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i9, int i10) {
        boolean onStartNestedScroll;
        if (!f(i10)) {
            if (this.f5617d) {
                View view = this.f5616c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z9 = parent instanceof InterfaceC0312m;
                    if (z9) {
                        onStartNestedScroll = ((InterfaceC0312m) parent).f(view2, view, i9, i10);
                    } else {
                        if (i10 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i9);
                            } catch (AbstractMethodError e8) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e8);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                this.f5615b = parent;
                            }
                        } else {
                            this.f5614a = parent;
                        }
                        if (z9) {
                            ((InterfaceC0312m) parent).a(view2, view, i9, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i9);
                            } catch (AbstractMethodError e9) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i9) {
        ViewParent e8 = e(i9);
        if (e8 != null) {
            boolean z9 = e8 instanceof InterfaceC0312m;
            ViewGroup viewGroup = this.f5616c;
            if (z9) {
                ((InterfaceC0312m) e8).b(viewGroup, i9);
            } else if (i9 == 0) {
                try {
                    e8.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e9) {
                    Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onStopNestedScroll", e9);
                }
            }
            if (i9 != 0) {
                if (i9 == 1) {
                    this.f5615b = null;
                    return;
                }
                return;
            }
            this.f5614a = null;
        }
    }
}
