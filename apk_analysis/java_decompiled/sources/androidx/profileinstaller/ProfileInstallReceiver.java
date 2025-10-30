package androidx.profileinstaller;

import C0.e;
import D0.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import s4.i;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                d.s(context, new e(0), new i(this), true);
                return;
            }
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        i iVar = new i(this);
                        try {
                            d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            iVar.h(10, null);
                            return;
                        } catch (PackageManager.NameNotFoundException e8) {
                            iVar.h(7, e8);
                            return;
                        }
                    }
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                i iVar2 = new i(this);
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    iVar2.h(12, null);
                    return;
                } else {
                    iVar2.h(13, null);
                    return;
                }
            }
            if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                i iVar3 = new i(this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                    } else {
                        codeCacheDir = context.getCodeCacheDir();
                    }
                    if (d.c(codeCacheDir)) {
                        iVar3.h(14, null);
                        return;
                    } else {
                        iVar3.h(15, null);
                        return;
                    }
                }
                iVar3.h(16, null);
            }
        }
    }
}
