package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import s.C1939i;

/* renamed from: o.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1656A extends A5.q implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final l f21294c;

    public MenuC1656A(Context context, l lVar) {
        super(context);
        if (lVar != null) {
            this.f21294c = lVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return k(this.f21294c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.f21294c.addIntentOptions(i9, i10, i11, componentName, intentArr, intent, i12, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = k(menuItemArr3[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f21294c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1939i c1939i = (C1939i) this.f453b;
        if (c1939i != null) {
            c1939i.clear();
        }
        this.f21294c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f21294c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i9) {
        return k(this.f21294c.findItem(i9));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i9) {
        return k(this.f21294c.getItem(i9));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f21294c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        return this.f21294c.isShortcutKey(i9, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i9, int i10) {
        return this.f21294c.performIdentifierAction(i9, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        return this.f21294c.performShortcut(i9, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i9) {
        if (((C1939i) this.f453b) != null) {
            int i10 = 0;
            while (true) {
                C1939i c1939i = (C1939i) this.f453b;
                if (i10 >= c1939i.f22660c) {
                    break;
                }
                if (((J.a) c1939i.f(i10)).getGroupId() == i9) {
                    ((C1939i) this.f453b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f21294c.removeGroup(i9);
    }

    @Override // android.view.Menu
    public final void removeItem(int i9) {
        if (((C1939i) this.f453b) != null) {
            int i10 = 0;
            while (true) {
                C1939i c1939i = (C1939i) this.f453b;
                if (i10 >= c1939i.f22660c) {
                    break;
                }
                if (((J.a) c1939i.f(i10)).getItemId() == i9) {
                    ((C1939i) this.f453b).g(i10);
                    break;
                }
                i10++;
            }
        }
        this.f21294c.removeItem(i9);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i9, boolean z9, boolean z10) {
        this.f21294c.setGroupCheckable(i9, z9, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i9, boolean z9) {
        this.f21294c.setGroupEnabled(i9, z9);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i9, boolean z9) {
        this.f21294c.setGroupVisible(i9, z9);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.f21294c.setQwertyMode(z9);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f21294c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9) {
        return this.f21294c.addSubMenu(i9);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9) {
        return k(this.f21294c.add(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        return this.f21294c.addSubMenu(i9, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        return k(this.f21294c.a(i9, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return this.f21294c.addSubMenu(i9, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, int i12) {
        return k(this.f21294c.add(i9, i10, i11, i12));
    }
}
