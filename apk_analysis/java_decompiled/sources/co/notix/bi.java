package co.notix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public abstract class bi {
    public static final String a(File file) {
        FileInputStream fileInputStream;
        String str = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, W7.a.f7934a), 8192);
                try {
                    str = AbstractC1570b.u(bufferedReader);
                    bufferedReader.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        }
        return str;
    }

    public static final void a(File file, String str) {
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, W7.a.f7934a), 8192);
            try {
                bufferedWriter.write(str);
                bufferedWriter.close();
                fileOutputStream.close();
            } finally {
            }
        } finally {
        }
    }
}
