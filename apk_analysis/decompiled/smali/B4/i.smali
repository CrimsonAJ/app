.class public final LB4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static c:LB4/i;


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, LB4/i;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LB4/i;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;)LB4/i;
    .locals 2

    .line 1
    invoke-static {p0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-class v0, LB4/i;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, LB4/i;->c:LB4/i;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, LB4/q;->a(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, LB4/i;

    .line 15
    .line 16
    invoke-direct {v1, p0}, LB4/i;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LB4/i;->c:LB4/i;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    sget-object p0, LB4/i;->c:LB4/i;

    .line 26
    .line 27
    return-object p0

    .line 28
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static final varargs c(Landroid/content/pm/PackageInfo;[LB4/n;)LB4/n;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    array-length v0, v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    const-string p0, "GoogleSignatureVerifier"

    .line 12
    .line 13
    const-string p1, "Package has more than one signature."

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    new-instance v0, LB4/o;

    .line 20
    .line 21
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aget-object p0, p0, v2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, LB4/o;-><init>([B)V

    .line 31
    .line 32
    .line 33
    :goto_0
    array-length p0, p1

    .line 34
    if-ge v2, p0, :cond_3

    .line 35
    .line 36
    aget-object p0, p1, v2

    .line 37
    .line 38
    invoke-virtual {p0, v0}, LB4/n;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    aget-object p0, p1, v2

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_1
    return-object v1
    .line 51
    .line 52
.end method

.method public static final d(Landroid/content/pm/PackageInfo;Z)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    if-eqz p0, :cond_4

    .line 6
    .line 7
    const-string v2, "com.android.vending"

    .line 8
    .line 9
    iget-object v3, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 18
    .line 19
    const-string v3, "com.google.android.gms"

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    :cond_0
    iget-object p1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    :cond_1
    move p1, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 34
    .line 35
    and-int/lit16 p1, p1, 0x81

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    move p1, v0

    .line 40
    :cond_3
    :goto_0
    move-object v2, p0

    .line 41
    goto :goto_1

    .line 42
    :cond_4
    const/4 v2, 0x0

    .line 43
    :goto_1
    if-eqz p0, :cond_6

    .line 44
    .line 45
    iget-object p0, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 46
    .line 47
    if-eqz p0, :cond_6

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    sget-object p0, LB4/p;->a:[LB4/n;

    .line 52
    .line 53
    invoke-static {v2, p0}, LB4/i;->c(Landroid/content/pm/PackageInfo;[LB4/n;)LB4/n;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    goto :goto_2

    .line 58
    :cond_5
    sget-object p0, LB4/p;->a:[LB4/n;

    .line 59
    .line 60
    aget-object p0, p0, v1

    .line 61
    .line 62
    new-array p1, v0, [LB4/n;

    .line 63
    .line 64
    aput-object p0, p1, v1

    .line 65
    .line 66
    invoke-static {v2, p1}, LB4/i;->c(Landroid/content/pm/PackageInfo;[LB4/n;)LB4/n;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_2
    if-eqz p0, :cond_6

    .line 71
    .line 72
    return v0

    .line 73
    :cond_6
    return v1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method


# virtual methods
.method public b(I)Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v0, v1, LB4/i;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move/from16 v3, p1

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v4, 0x3

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v3, :cond_e

    .line 22
    .line 23
    array-length v7, v3

    .line 24
    if-nez v7, :cond_0

    .line 25
    .line 26
    goto/16 :goto_b

    .line 27
    .line 28
    :cond_0
    move-object v0, v5

    .line 29
    move v8, v6

    .line 30
    :goto_0
    if-ge v8, v7, :cond_d

    .line 31
    .line 32
    aget-object v9, v3, v8

    .line 33
    .line 34
    const-string v10, "Failed to get Google certificates from remote"

    .line 35
    .line 36
    const-string v11, "GoogleCertificates"

    .line 37
    .line 38
    const-string v12, "null pkg"

    .line 39
    .line 40
    if-nez v9, :cond_1

    .line 41
    .line 42
    new-instance v0, LB4/t;

    .line 43
    .line 44
    invoke-direct {v0, v6, v12, v5}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_a

    .line 48
    .line 49
    :cond_1
    iget-object v0, v1, LB4/i;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_a

    .line 58
    .line 59
    sget-object v0, LB4/q;->a:LB4/m;

    .line 60
    .line 61
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    :try_start_0
    invoke-static {}, LB4/q;->c()V

    .line 66
    .line 67
    .line 68
    sget-object v0, LB4/q;->c:LF4/x;

    .line 69
    .line 70
    check-cast v0, LF4/v;

    .line 71
    .line 72
    invoke-virtual {v0}, LF4/v;->j1()Z

    .line 73
    .line 74
    .line 75
    move-result v0
    :try_end_0
    .catch LO4/b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    goto :goto_2

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto/16 :goto_9

    .line 79
    .line 80
    :catch_0
    move-exception v0

    .line 81
    goto :goto_1

    .line 82
    :catch_1
    move-exception v0

    .line 83
    :goto_1
    :try_start_1
    invoke-static {v11, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    move v0, v6

    .line 87
    :goto_2
    invoke-static {v13}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 88
    .line 89
    .line 90
    const/4 v13, 0x2

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    iget-object v0, v1, LB4/i;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Landroid/content/Context;

    .line 96
    .line 97
    invoke-static {v0}, LB4/h;->a(Landroid/content/Context;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    :try_start_2
    sget-object v14, LB4/q;->e:Landroid/content/Context;

    .line 106
    .line 107
    invoke-static {v14}, LF4/y;->h(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 108
    .line 109
    .line 110
    :try_start_3
    invoke-static {}, LB4/q;->c()V
    :try_end_3
    .catch LO4/b; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 111
    .line 112
    .line 113
    :try_start_4
    sget-object v14, LB4/q;->e:Landroid/content/Context;

    .line 114
    .line 115
    new-instance v15, LN4/b;

    .line 116
    .line 117
    invoke-direct {v15, v14}, LN4/b;-><init>(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v15}, LN4/b;->h1(Landroid/os/IBinder;)LN4/a;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    invoke-static {v14}, LN4/b;->i1(LN4/a;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    check-cast v14, Landroid/content/Context;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 129
    .line 130
    :try_start_5
    sget-object v15, LB4/q;->c:LF4/x;

    .line 131
    .line 132
    check-cast v15, LF4/v;

    .line 133
    .line 134
    invoke-virtual {v15}, LS4/a;->Q()Landroid/os/Parcel;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    sget v16, LV4/a;->a:I

    .line 139
    .line 140
    invoke-virtual {v5, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    .line 142
    .line 143
    const/16 v6, 0x4f45

    .line 144
    .line 145
    invoke-static {v5, v6}, Ls8/n;->R(Landroid/os/Parcel;I)I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    invoke-static {v5, v2, v9}, Ls8/n;->M(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/4 v2, 0x4

    .line 153
    invoke-static {v5, v13, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 157
    .line 158
    .line 159
    invoke-static {v5, v4, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 160
    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    invoke-virtual {v5, v13}, Landroid/os/Parcel;->writeInt(I)V

    .line 164
    .line 165
    .line 166
    new-instance v0, LN4/b;

    .line 167
    .line 168
    invoke-direct {v0, v14}, LN4/b;-><init>(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v5, v2, v0}, Ls8/n;->H(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 172
    .line 173
    .line 174
    const/4 v0, 0x5

    .line 175
    invoke-static {v5, v0, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v13}, Landroid/os/Parcel;->writeInt(I)V

    .line 179
    .line 180
    .line 181
    const/4 v0, 0x6

    .line 182
    invoke-static {v5, v0, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 183
    .line 184
    .line 185
    const/4 v13, 0x1

    .line 186
    invoke-virtual {v5, v13}, Landroid/os/Parcel;->writeInt(I)V

    .line 187
    .line 188
    .line 189
    invoke-static {v5, v6}, Ls8/n;->U(Landroid/os/Parcel;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v15, v5, v0}, LS4/a;->g(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sget-object v5, LB4/r;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 197
    .line 198
    invoke-static {v0, v5}, LV4/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, LB4/r;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 205
    .line 206
    .line 207
    :try_start_6
    iget-boolean v0, v5, LB4/r;->a:Z

    .line 208
    .line 209
    if-eqz v0, :cond_2

    .line 210
    .line 211
    iget v0, v5, LB4/r;->d:I

    .line 212
    .line 213
    invoke-static {v0}, Ll6/b;->z(I)I

    .line 214
    .line 215
    .line 216
    new-instance v0, LB4/t;

    .line 217
    .line 218
    const/4 v2, 0x0

    .line 219
    const/4 v13, 0x1

    .line 220
    invoke-direct {v0, v13, v2, v2}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_2
    iget-object v0, v5, LB4/r;->b:Ljava/lang/String;

    .line 225
    .line 226
    iget v6, v5, LB4/r;->c:I

    .line 227
    .line 228
    invoke-static {v6}, Ls8/e;->g0(I)I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-ne v6, v2, :cond_3

    .line 233
    .line 234
    new-instance v2, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 235
    .line 236
    invoke-direct {v2}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :catchall_1
    move-exception v0

    .line 241
    goto :goto_6

    .line 242
    :cond_3
    const/4 v2, 0x0

    .line 243
    :goto_3
    const-string v6, "error checking package certificate"

    .line 244
    .line 245
    if-nez v0, :cond_4

    .line 246
    .line 247
    move-object v0, v6

    .line 248
    :cond_4
    iget v6, v5, LB4/r;->d:I

    .line 249
    .line 250
    invoke-static {v6}, Ll6/b;->z(I)I

    .line 251
    .line 252
    .line 253
    iget v5, v5, LB4/r;->c:I

    .line 254
    .line 255
    invoke-static {v5}, Ls8/e;->g0(I)I

    .line 256
    .line 257
    .line 258
    new-instance v5, LB4/t;

    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    invoke-direct {v5, v13, v0, v2}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 262
    .line 263
    .line 264
    :goto_4
    move-object v0, v5

    .line 265
    goto :goto_5

    .line 266
    :catch_2
    move-exception v0

    .line 267
    invoke-static {v11, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 268
    .line 269
    .line 270
    const-string v2, "module call"

    .line 271
    .line 272
    new-instance v5, LB4/t;

    .line 273
    .line 274
    const/4 v13, 0x0

    .line 275
    invoke-direct {v5, v13, v2, v0}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 276
    .line 277
    .line 278
    goto :goto_4

    .line 279
    :catch_3
    move-exception v0

    .line 280
    invoke-static {v11, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    const-string v5, "module init: "

    .line 288
    .line 289
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    new-instance v5, LB4/t;

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    invoke-direct {v5, v13, v2, v0}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :goto_5
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_8

    .line 308
    .line 309
    :goto_6
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_5
    :try_start_7
    iget-object v0, v1, LB4/i;->a:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Landroid/content/Context;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    const/16 v2, 0x40

    .line 322
    .line 323
    invoke-virtual {v0, v9, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 324
    .line 325
    .line 326
    move-result-object v0
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_4

    .line 327
    iget-object v2, v1, LB4/i;->a:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v2, Landroid/content/Context;

    .line 330
    .line 331
    invoke-static {v2}, LB4/h;->a(Landroid/content/Context;)Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-nez v0, :cond_6

    .line 336
    .line 337
    new-instance v0, LB4/t;

    .line 338
    .line 339
    const/4 v2, 0x0

    .line 340
    const/4 v5, 0x0

    .line 341
    invoke-direct {v0, v5, v12, v2}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 342
    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_6
    const/4 v5, 0x0

    .line 346
    iget-object v6, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 347
    .line 348
    if-eqz v6, :cond_9

    .line 349
    .line 350
    array-length v6, v6

    .line 351
    const/4 v10, 0x1

    .line 352
    if-eq v6, v10, :cond_7

    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_7
    new-instance v6, LB4/o;

    .line 356
    .line 357
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 358
    .line 359
    aget-object v10, v10, v5

    .line 360
    .line 361
    invoke-virtual {v10}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    invoke-direct {v6, v10}, LB4/o;-><init>([B)V

    .line 366
    .line 367
    .line 368
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 369
    .line 370
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 371
    .line 372
    .line 373
    move-result-object v11

    .line 374
    :try_start_8
    invoke-static {v10, v6, v2, v5}, LB4/q;->b(Ljava/lang/String;LB4/o;ZZ)LB4/t;

    .line 375
    .line 376
    .line 377
    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 378
    invoke-static {v11}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 379
    .line 380
    .line 381
    iget-boolean v5, v2, LB4/t;->a:Z

    .line 382
    .line 383
    if-eqz v5, :cond_8

    .line 384
    .line 385
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 386
    .line 387
    if-eqz v0, :cond_8

    .line 388
    .line 389
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 390
    .line 391
    and-int/2addr v0, v13

    .line 392
    if-eqz v0, :cond_8

    .line 393
    .line 394
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    const/4 v11, 0x1

    .line 399
    const/4 v13, 0x0

    .line 400
    :try_start_9
    invoke-static {v10, v6, v13, v11}, LB4/q;->b(Ljava/lang/String;LB4/o;ZZ)LB4/t;

    .line 401
    .line 402
    .line 403
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 404
    invoke-static {v5}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 405
    .line 406
    .line 407
    iget-boolean v0, v0, LB4/t;->a:Z

    .line 408
    .line 409
    if-eqz v0, :cond_8

    .line 410
    .line 411
    new-instance v0, LB4/t;

    .line 412
    .line 413
    const-string v2, "debuggable release cert app rejected"

    .line 414
    .line 415
    const/4 v5, 0x0

    .line 416
    invoke-direct {v0, v13, v2, v5}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 417
    .line 418
    .line 419
    goto :goto_8

    .line 420
    :catchall_2
    move-exception v0

    .line 421
    invoke-static {v5}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 422
    .line 423
    .line 424
    throw v0

    .line 425
    :cond_8
    move-object v0, v2

    .line 426
    goto :goto_8

    .line 427
    :catchall_3
    move-exception v0

    .line 428
    invoke-static {v11}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 429
    .line 430
    .line 431
    throw v0

    .line 432
    :cond_9
    :goto_7
    new-instance v0, LB4/t;

    .line 433
    .line 434
    const-string v2, "single cert required"

    .line 435
    .line 436
    const/4 v5, 0x0

    .line 437
    const/4 v13, 0x0

    .line 438
    invoke-direct {v0, v13, v2, v5}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 439
    .line 440
    .line 441
    :goto_8
    iget-boolean v2, v0, LB4/t;->a:Z

    .line 442
    .line 443
    if-eqz v2, :cond_b

    .line 444
    .line 445
    iput-object v9, v1, LB4/i;->b:Ljava/lang/Object;

    .line 446
    .line 447
    goto :goto_a

    .line 448
    :catch_4
    move-exception v0

    .line 449
    const-string v2, "no pkg "

    .line 450
    .line 451
    invoke-virtual {v2, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    new-instance v5, LB4/t;

    .line 456
    .line 457
    const/4 v13, 0x0

    .line 458
    invoke-direct {v5, v13, v2, v0}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 459
    .line 460
    .line 461
    move-object v0, v5

    .line 462
    goto :goto_a

    .line 463
    :goto_9
    invoke-static {v13}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 464
    .line 465
    .line 466
    throw v0

    .line 467
    :cond_a
    sget-object v0, LB4/t;->d:LB4/t;

    .line 468
    .line 469
    :cond_b
    :goto_a
    iget-boolean v2, v0, LB4/t;->a:Z

    .line 470
    .line 471
    if-eqz v2, :cond_c

    .line 472
    .line 473
    goto :goto_c

    .line 474
    :cond_c
    const/16 v17, 0x1

    .line 475
    .line 476
    add-int/lit8 v8, v8, 0x1

    .line 477
    .line 478
    move/from16 v2, v17

    .line 479
    .line 480
    const/4 v5, 0x0

    .line 481
    const/4 v6, 0x0

    .line 482
    goto/16 :goto_0

    .line 483
    .line 484
    :cond_d
    invoke-static {v0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    goto :goto_c

    .line 488
    :cond_e
    :goto_b
    new-instance v0, LB4/t;

    .line 489
    .line 490
    const-string v2, "no pkgs"

    .line 491
    .line 492
    const/4 v5, 0x0

    .line 493
    const/4 v13, 0x0

    .line 494
    invoke-direct {v0, v13, v2, v5}, LB4/t;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 495
    .line 496
    .line 497
    :goto_c
    iget-boolean v2, v0, LB4/t;->a:Z

    .line 498
    .line 499
    if-nez v2, :cond_10

    .line 500
    .line 501
    const-string v2, "GoogleCertificatesRslt"

    .line 502
    .line 503
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    if-eqz v3, :cond_10

    .line 508
    .line 509
    iget-object v3, v0, LB4/t;->c:Ljava/lang/Exception;

    .line 510
    .line 511
    if-eqz v3, :cond_f

    .line 512
    .line 513
    invoke-virtual {v0}, LB4/t;->a()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    invoke-static {v2, v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 518
    .line 519
    .line 520
    goto :goto_d

    .line 521
    :cond_f
    invoke-virtual {v0}, LB4/t;->a()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 526
    .line 527
    .line 528
    :cond_10
    :goto_d
    iget-boolean v0, v0, LB4/t;->a:Z

    .line 529
    .line 530
    return v0
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method
