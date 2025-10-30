package com.google.android.material.appbar;

import P.Q;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f15816a;

    /* renamed from: b, reason: collision with root package name */
    public int f15817b;

    /* renamed from: c, reason: collision with root package name */
    public int f15818c;

    /* renamed from: d, reason: collision with root package name */
    public int f15819d;

    /* renamed from: e, reason: collision with root package name */
    public int f15820e;

    public n(View view) {
        this.f15816a = view;
    }

    public final void a() {
        int i9 = this.f15819d;
        View view = this.f15816a;
        int top = i9 - (view.getTop() - this.f15817b);
        WeakHashMap weakHashMap = Q.f5546a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(this.f15820e - (view.getLeft() - this.f15818c));
    }

    public final boolean b(int i9) {
        if (this.f15819d != i9) {
            this.f15819d = i9;
            a();
            return true;
        }
        return false;
    }
}
