package o;

import P.S;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class l implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f21374y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f21375a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f21376b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21377c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21378d;

    /* renamed from: e, reason: collision with root package name */
    public j f21379e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f21380f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f21381g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21382h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f21383i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21384k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f21386m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f21387n;

    /* renamed from: o, reason: collision with root package name */
    public View f21388o;

    /* renamed from: v, reason: collision with root package name */
    public n f21395v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21397x;

    /* renamed from: l, reason: collision with root package name */
    public int f21385l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21389p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21390q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21391r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21392s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f21393t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f21394u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f21396w = false;

    public l(Context context) {
        boolean z9;
        boolean z10 = false;
        this.f21375a = context;
        Resources resources = context.getResources();
        this.f21376b = resources;
        this.f21380f = new ArrayList();
        this.f21381g = new ArrayList();
        this.f21382h = true;
        this.f21383i = new ArrayList();
        this.j = new ArrayList();
        this.f21384k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = S.f5552a;
            if (Build.VERSION.SDK_INT >= 28) {
                z9 = F.a.p(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (z9) {
                z10 = true;
            }
        }
        this.f21378d = z10;
    }

    public n a(int i9, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0 && i13 < 6) {
            int i14 = (f21374y[i13] << 16) | (65535 & i11);
            n nVar = new n(this, i9, i10, i11, i14, charSequence, this.f21385l);
            ArrayList arrayList = this.f21380f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((n) arrayList.get(size)).f21407d <= i14) {
                        i12 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i12 = 0;
                    break;
                }
            }
            arrayList.add(i12, nVar);
            p(true);
            return nVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        Intent intent2;
        int i14;
        PackageManager packageManager = this.f21375a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i13 = queryIntentActivityOptions.size();
        } else {
            i13 = 0;
        }
        if ((i12 & 1) == 0) {
            removeGroup(i9);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            if (i16 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i16];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n a5 = a(i9, i10, i11, resolveInfo.loadLabel(packageManager));
            a5.setIcon(resolveInfo.loadIcon(packageManager));
            a5.f21410g = intent3;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a5;
            }
        }
        return i13;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f21394u.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.f21384k = true;
    }

    public final void c(boolean z9) {
        if (this.f21392s) {
            return;
        }
        this.f21392s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21394u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z9);
            }
        }
        this.f21392s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f21395v;
        if (nVar != null) {
            d(nVar);
        }
        this.f21380f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f21387n = null;
        this.f21386m = null;
        this.f21388o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21394u;
        boolean z9 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f21395v == nVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z9 = xVar.m(nVar);
                    if (z9) {
                        break;
                    }
                }
            }
            v();
            if (z9) {
                this.f21395v = null;
            }
        }
        return z9;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f21379e;
        if (jVar != null && jVar.l(lVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21394u;
        boolean z9 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z9 = xVar.g(nVar);
                if (z9) {
                    break;
                }
            }
        }
        v();
        if (z9) {
            this.f21395v = nVar;
        }
        return z9;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i9) {
        MenuItem findItem;
        ArrayList arrayList = this.f21380f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f21404a == i9) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (findItem = nVar.f21417o.findItem(i9)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final n g(int i9, KeyEvent keyEvent) {
        char c3;
        ArrayList arrayList = this.f21393t;
        arrayList.clear();
        h(arrayList, i9, keyEvent);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (n) arrayList.get(0);
            }
            boolean n7 = n();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) arrayList.get(i10);
                if (n7) {
                    c3 = nVar.j;
                } else {
                    c3 = nVar.f21411h;
                }
                char[] cArr = keyData.meta;
                if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (n7 && c3 == '\b' && i9 == 67))) {
                    return nVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i9) {
        return (MenuItem) this.f21380f.get(i9);
    }

    public final void h(ArrayList arrayList, int i9, KeyEvent keyEvent) {
        char c3;
        int i10;
        boolean n7 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i9 == 67) {
            ArrayList arrayList2 = this.f21380f;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList2.get(i11);
                if (nVar.hasSubMenu()) {
                    nVar.f21417o.h(arrayList, i9, keyEvent);
                }
                if (n7) {
                    c3 = nVar.j;
                } else {
                    c3 = nVar.f21411h;
                }
                if (n7) {
                    i10 = nVar.f21413k;
                } else {
                    i10 = nVar.f21412i;
                }
                if ((modifiers & 69647) == (i10 & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (n7 && c3 == '\b' && i9 == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (!this.f21397x) {
            ArrayList arrayList = this.f21380f;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((n) arrayList.get(i9)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l9 = l();
        if (!this.f21384k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21394u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z9 |= xVar.j();
            }
        }
        ArrayList arrayList = this.f21383i;
        ArrayList arrayList2 = this.j;
        if (z9) {
            arrayList.clear();
            arrayList2.clear();
            int size = l9.size();
            for (int i9 = 0; i9 < size; i9++) {
                n nVar = (n) l9.get(i9);
                if ((nVar.f21426x & 32) == 32) {
                    arrayList.add(nVar);
                } else {
                    arrayList2.add(nVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f21384k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        if (g(i9, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z9 = this.f21382h;
        ArrayList arrayList = this.f21381g;
        if (!z9) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f21380f;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) arrayList2.get(i9);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f21382h = false;
        this.f21384k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f21396w;
    }

    public boolean n() {
        return this.f21377c;
    }

    public boolean o() {
        return this.f21378d;
    }

    public final void p(boolean z9) {
        if (!this.f21389p) {
            if (z9) {
                this.f21382h = true;
                this.f21384k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f21394u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    x xVar = (x) weakReference.get();
                    if (xVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        xVar.f(z9);
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f21390q = true;
        if (z9) {
            this.f21391r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i9, int i10) {
        return q(findItem(i9), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        boolean z9;
        n g9 = g(i9, keyEvent);
        if (g9 != null) {
            z9 = q(g9, null, i10);
        } else {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            c(true);
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, o.x r8, int r9) {
        /*
            r6 = this;
            o.n r7 = (o.n) r7
            r0 = 0
            if (r7 == 0) goto Ld4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld4
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f21418p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            o.l r1 = r7.f21416n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f21410g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f21375a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            o.o r1 = r7.f21401A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f21430b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            o.o r3 = r7.f21401A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f21430b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld3
            r6.c(r2)
            goto Ld3
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld3
            r6.c(r2)
            goto Ld3
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            o.D r9 = new o.D
            android.content.Context r5 = r6.f21375a
            r9.<init>(r5, r6, r7)
            r7.f21417o = r9
            java.lang.CharSequence r5 = r7.f21408e
            r9.setHeaderTitle(r5)
        L90:
            o.D r7 = r7.f21417o
            if (r4 == 0) goto L9b
            o.s r9 = r3.f21431c
            android.view.ActionProvider r9 = r3.f21430b
            r9.onPrepareSubMenu(r7)
        L9b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f21394u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La4
            goto Lcd
        La4:
            if (r8 == 0) goto Laa
            boolean r0 = r8.l(r7)
        Laa:
            java.util.Iterator r8 = r9.iterator()
        Lae:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lcd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            o.x r4 = (o.x) r4
            if (r4 != 0) goto Lc6
            r9.remove(r3)
            goto Lae
        Lc6:
            if (r0 != 0) goto Lae
            boolean r0 = r4.l(r7)
            goto Lae
        Lcd:
            r1 = r1 | r0
            if (r1 != 0) goto Ld3
            r6.c(r2)
        Ld3:
            return r1
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l.q(android.view.MenuItem, o.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21394u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i9) {
        ArrayList arrayList = this.f21380f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((n) arrayList.get(i11)).f21405b == i9) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((n) arrayList.get(i11)).f21405b != i9) {
                    break;
                }
                if (i11 >= 0) {
                    ArrayList arrayList2 = this.f21380f;
                    if (i11 < arrayList2.size()) {
                        arrayList2.remove(i11);
                    }
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i9) {
        ArrayList arrayList = this.f21380f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((n) arrayList.get(i10)).f21404a == i9) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            ArrayList arrayList2 = this.f21380f;
            if (i10 < arrayList2.size()) {
                arrayList2.remove(i10);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f21380f.size();
            for (int i9 = 0; i9 < size; i9++) {
                MenuItem item = getItem(i9);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC1659D) item.getSubMenu()).s(bundle);
                }
            }
            int i10 = bundle.getInt("android:menu:expandedactionview");
            if (i10 > 0 && (findItem = findItem(i10)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i9, boolean z9, boolean z10) {
        ArrayList arrayList = this.f21380f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f21405b == i9) {
                nVar.f(z10);
                nVar.setCheckable(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f21396w = z9;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i9, boolean z9) {
        ArrayList arrayList = this.f21380f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f21405b == i9) {
                nVar.setEnabled(z9);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i9, boolean z9) {
        int i10;
        ArrayList arrayList = this.f21380f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f21405b == i9) {
                int i12 = nVar.f21426x;
                int i13 = i12 & (-9);
                if (z9) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                int i14 = i13 | i10;
                nVar.f21426x = i14;
                if (i12 != i14) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f21377c = z9;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f21380f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f21380f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = getItem(i9);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1659D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i9, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f21388o = view;
            this.f21386m = null;
            this.f21387n = null;
        } else {
            if (i9 > 0) {
                this.f21386m = this.f21376b.getText(i9);
            } else if (charSequence != null) {
                this.f21386m = charSequence;
            }
            if (i10 > 0) {
                this.f21387n = this.f21375a.getDrawable(i10);
            } else if (drawable != null) {
                this.f21387n = drawable;
            }
            this.f21388o = null;
        }
        p(false);
    }

    public final void v() {
        this.f21389p = false;
        if (this.f21390q) {
            this.f21390q = false;
            p(this.f21391r);
        }
    }

    public final void w() {
        if (!this.f21389p) {
            this.f21389p = true;
            this.f21390q = false;
            this.f21391r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9) {
        return a(0, 0, 0, this.f21376b.getString(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9) {
        return addSubMenu(0, 0, 0, this.f21376b.getString(i9));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        return a(i9, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        n a5 = a(i9, i10, i11, charSequence);
        SubMenuC1659D subMenuC1659D = new SubMenuC1659D(this.f21375a, this, a5);
        a5.f21417o = subMenuC1659D;
        subMenuC1659D.setHeaderTitle(a5.f21408e);
        return subMenuC1659D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, int i12) {
        return a(i9, i10, i11, this.f21376b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return addSubMenu(i9, i10, i11, this.f21376b.getString(i12));
    }

    public l k() {
        return this;
    }
}
