package G0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: G0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0150p extends Binder implements InterfaceC0140f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2797f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2798e;

    public BinderC0150p(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2798e = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC0140f.f2763b);
    }

    @Override // G0.InterfaceC0140f
    public final void M0(int i9, String[] tables) {
        kotlin.jvm.internal.h.e(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2798e;
        synchronized (multiInstanceInvalidationService.f10353c) {
            String str = (String) multiInstanceInvalidationService.f10352b.get(Integer.valueOf(i9));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f10353c.beginBroadcast();
            for (int i10 = 0; i10 < beginBroadcast; i10++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f10353c.getBroadcastCookie(i10);
                    kotlin.jvm.internal.h.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f10352b.get(num);
                    if (i9 != intValue && str.equals(str2)) {
                        try {
                            ((InterfaceC0138d) multiInstanceInvalidationService.f10353c.getBroadcastItem(i10)).O(tables);
                        } catch (RemoteException e8) {
                            Log.w("ROOM", "Error invoking a remote callback", e8);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f10353c.finishBroadcast();
                }
            }
        }
    }

    @Override // G0.InterfaceC0140f
    public final int X(InterfaceC0138d callback, String str) {
        kotlin.jvm.internal.h.e(callback, "callback");
        int i9 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2798e;
        synchronized (multiInstanceInvalidationService.f10353c) {
            try {
                int i10 = multiInstanceInvalidationService.f10351a + 1;
                multiInstanceInvalidationService.f10351a = i10;
                if (multiInstanceInvalidationService.f10353c.register(callback, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f10352b.put(Integer.valueOf(i10), str);
                    i9 = i10;
                } else {
                    multiInstanceInvalidationService.f10351a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i9;
    }

    @Override // G0.InterfaceC0140f
    public final void i0(InterfaceC0138d callback, int i9) {
        kotlin.jvm.internal.h.e(callback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2798e;
        synchronized (multiInstanceInvalidationService.f10353c) {
            multiInstanceInvalidationService.f10353c.unregister(callback);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, G0.c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, G0.c] */
    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        String str = InterfaceC0140f.f2763b;
        if (i9 >= 1 && i9 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i9 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC0138d interfaceC0138d = null;
        InterfaceC0138d interfaceC0138d2 = null;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return super.onTransact(i9, parcel, parcel2, i10);
                }
                M0(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC0138d.f2761a);
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0138d)) {
                    interfaceC0138d2 = (InterfaceC0138d) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f2760e = readStrongBinder;
                    interfaceC0138d2 = obj;
                }
            }
            i0(interfaceC0138d2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(InterfaceC0138d.f2761a);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC0138d)) {
                interfaceC0138d = (InterfaceC0138d) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.f2760e = readStrongBinder2;
                interfaceC0138d = obj2;
            }
        }
        int X8 = X(interfaceC0138d, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(X8);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
