package com.anilab.exoplayer;

import N3.m0;
import Q2.T;
import Q2.U;
import Q2.V;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import b7.C0701c;
import i4.t;
import j3.F0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f14485a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f14486b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckedTextView f14487c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f14488d;

    /* renamed from: e, reason: collision with root package name */
    public final U f14489e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14490f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f14491g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14492h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14493i;
    public T j;

    /* renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f14494k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14495l;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f14485a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f14486b = from;
        U u9 = new U(0, this);
        this.f14489e = u9;
        this.j = new C0701c(getResources());
        this.f14490f = new ArrayList();
        this.f14491g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f14487c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(co.notix.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(u9);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(co.notix.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f14488d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(co.notix.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(u9);
        addView(checkedTextView2);
    }

    public final void a() {
        boolean z9;
        this.f14487c.setChecked(this.f14495l);
        boolean z10 = this.f14495l;
        HashMap hashMap = this.f14491g;
        if (!z10 && hashMap.size() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f14488d.setChecked(z9);
        for (int i9 = 0; i9 < this.f14494k.length; i9++) {
            t tVar = (t) hashMap.get(((F0) this.f14490f.get(i9)).f19326b);
            int i10 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f14494k[i9];
                if (i10 < checkedTextViewArr.length) {
                    if (tVar != null) {
                        Object tag = checkedTextViewArr[i10].getTag();
                        tag.getClass();
                        this.f14494k[i9][i10].setChecked(tVar.f18598b.contains(Integer.valueOf(((V) tag).f6199b)));
                    } else {
                        checkedTextViewArr[i10].setChecked(false);
                    }
                    i10++;
                }
            }
        }
    }

    public final void b() {
        boolean z9;
        boolean z10;
        int i9;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f14490f;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f14488d;
        CheckedTextView checkedTextView2 = this.f14487c;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f14494k = new CheckedTextView[arrayList.size()];
        if (this.f14493i && arrayList.size() > 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            F0 f02 = (F0) arrayList.get(i10);
            if (this.f14492h && f02.f19327c) {
                z10 = true;
            } else {
                z10 = false;
            }
            CheckedTextView[][] checkedTextViewArr = this.f14494k;
            int i11 = f02.f19325a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            V[] vArr = new V[i11];
            for (int i12 = 0; i12 < f02.f19325a; i12++) {
                vArr[i12] = new V(f02, i12);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                LayoutInflater layoutInflater = this.f14486b;
                if (i13 == 0) {
                    addView(layoutInflater.inflate(co.notix.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                if (!z10 && !z9) {
                    i9 = R.layout.simple_list_item_single_choice;
                } else {
                    i9 = R.layout.simple_list_item_multiple_choice;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i9, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f14485a);
                T t7 = this.j;
                V v8 = vArr[i13];
                checkedTextView3.setText(((C0701c) t7).G(v8.f6198a.f19326b.f5167d[v8.f6199b]));
                checkedTextView3.setTag(vArr[i13]);
                if (f02.a(i13)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f14489e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f14494k[i10][i13] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f14495l;
    }

    public Map<m0, t> getOverrides() {
        return this.f14491g;
    }

    public void setAllowAdaptiveSelections(boolean z9) {
        if (this.f14492h != z9) {
            this.f14492h = z9;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z9) {
        if (this.f14493i != z9) {
            this.f14493i = z9;
            if (!z9) {
                HashMap hashMap = this.f14491g;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.f14490f;
                    HashMap hashMap2 = new HashMap();
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        t tVar = (t) hashMap.get(((F0) arrayList.get(i9)).f19326b);
                        if (tVar != null && hashMap2.isEmpty()) {
                            hashMap2.put(tVar.f18597a, tVar);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z9) {
        int i9;
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f14487c.setVisibility(i9);
    }

    public void setTrackNameProvider(T t7) {
        t7.getClass();
        this.j = t7;
        b();
    }
}
