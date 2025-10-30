package Q2;

import N3.m0;
import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import com.anilab.exoplayer.TrackSelectionView;
import i.C1319e;
import j3.F0;
import java.util.ArrayList;
import java.util.HashMap;
import n.AbstractC1595a;
import p.C1770T0;
import z5.AbstractC2250c;

/* loaded from: classes.dex */
public final class U implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6197b;

    public /* synthetic */ U(int i9, Object obj) {
        this.f6196a = i9;
        this.f6197b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z9;
        Message message;
        Message message2;
        Message message3;
        Message message4;
        o.n nVar;
        switch (this.f6196a) {
            case 0:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f6197b;
                HashMap hashMap = trackSelectionView.f14491g;
                boolean z10 = true;
                if (view == trackSelectionView.f14487c) {
                    trackSelectionView.f14495l = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.f14488d) {
                    trackSelectionView.f14495l = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.f14495l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    V v8 = (V) tag;
                    F0 f02 = v8.f6198a;
                    m0 m0Var = f02.f19326b;
                    i4.t tVar = (i4.t) hashMap.get(m0Var);
                    int i9 = v8.f6199b;
                    if (tVar == null) {
                        if (!trackSelectionView.f14493i && hashMap.size() > 0) {
                            hashMap.clear();
                        }
                        hashMap.put(m0Var, new i4.t(m0Var, P5.F.s(Integer.valueOf(i9))));
                    } else {
                        ArrayList arrayList = new ArrayList(tVar.f18598b);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        if (trackSelectionView.f14492h && f02.f19327c) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!z9 && (!trackSelectionView.f14493i || trackSelectionView.f14490f.size() <= 1)) {
                            z10 = false;
                        }
                        if (isChecked && z10) {
                            arrayList.remove(Integer.valueOf(i9));
                            if (arrayList.isEmpty()) {
                                hashMap.remove(m0Var);
                            } else {
                                hashMap.put(m0Var, new i4.t(m0Var, arrayList));
                            }
                        } else if (!isChecked) {
                            if (z9) {
                                arrayList.add(Integer.valueOf(i9));
                                hashMap.put(m0Var, new i4.t(m0Var, arrayList));
                            } else {
                                hashMap.put(m0Var, new i4.t(m0Var, P5.F.s(Integer.valueOf(i9))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                return;
            case 1:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f6197b;
                int i10 = jVar.f16005z0;
                if (i10 == 2) {
                    jVar.f0(1);
                    return;
                } else {
                    if (i10 == 1) {
                        jVar.f0(2);
                        return;
                    }
                    return;
                }
            case 2:
                C1319e c1319e = (C1319e) this.f6197b;
                if (view == c1319e.f18051h && (message4 = c1319e.j) != null) {
                    message = Message.obtain(message4);
                } else if (view == c1319e.f18053k && (message3 = c1319e.f18055m) != null) {
                    message = Message.obtain(message3);
                } else if (view == c1319e.f18056n && (message2 = c1319e.f18058p) != null) {
                    message = Message.obtain(message2);
                } else {
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                c1319e.f18042D.obtainMessage(1, c1319e.f18045b).sendToTarget();
                return;
            case 3:
                m5.f fVar = (m5.f) this.f6197b;
                if (fVar.j && fVar.isShowing()) {
                    if (!fVar.f20851l) {
                        TypedArray obtainStyledAttributes = fVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        fVar.f20850k = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        fVar.f20851l = true;
                    }
                    if (fVar.f20850k) {
                        fVar.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((AbstractC1595a) this.f6197b).a();
                return;
            case 5:
                C1770T0 c1770t0 = ((Toolbar) this.f6197b).f9505m0;
                if (c1770t0 == null) {
                    nVar = null;
                } else {
                    nVar = c1770t0.f21918b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                o.n itemData = ((AbstractC2250c) view).getItemData();
                l5.b bVar = (l5.b) this.f6197b;
                if (!bVar.f25469f0.q(itemData, bVar.f25462D, 0)) {
                    itemData.setChecked(true);
                    return;
                }
                return;
        }
    }
}
